package Vjezba_10.Zd_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel left;
    private JPanel right;
    private JTextField txtFld;
    private JButton btn;
    private JTextArea area;
    private JScrollPane scp;
    private JButton resetBtn;

    public MainFrame() {
        super("Simple GUI");

        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // inicijalizacija lijevog panela i njegovih komponenti
        initLeft();
        // razmještaj komponenti na lijevom panelu
        layoutLeft();
        // inicijalizacija desnog panela i njegovih komponenti
        initRight();
        // razmještaj komponenti na desnom panelu
        layoutRight();
        // postavljanje lijevog i desnog panela na MainFrame
        layoutAll();
        // aktiviranje forme
        activateFrame();

        // postaviti vidljivost na true
        setVisible(true);

    }

    private void initRight() {
        right = new JPanel();
        area = new JTextArea(20, 20);
        area.setEditable(false);
        scp = new JScrollPane(area);
    }

    private void layoutRight() {
        right.setLayout(new BorderLayout());
        right.add(scp, BorderLayout.CENTER);
    }

    private void initLeft() {
        left = new JPanel();
        txtFld = new JTextField(15);
        btn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        resetBtn.setEnabled(false);
    }
    private void layoutLeft() {
        left.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // label for text field
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.WEST;
        left.add(new JLabel("Enter Text:"), gbc);

        // text field
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        left.add(txtFld, gbc);

        // empty row
        gbc.gridy++;
        Component bx = Box.createVerticalStrut(30);
        left.add(bx, gbc);

        // submit button
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        gbc.weighty = 0.45;
        left.add(btn, gbc);

        // reset button
        gbc.gridy++;
        left.add(resetBtn, gbc);
    }
    private void layoutAll() {
        setLayout(new BorderLayout());
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.CENTER);
    }

    private void activateFrame() {
        // Submit button action
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtFld.getText();
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(MainFrame.this, "Text field is empty!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    area.append(text + "\n");
                    txtFld.setText("");
                    resetBtn.setEnabled(true);
                }
            }
        });

        // Reset button action
        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("");
                resetBtn.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}





