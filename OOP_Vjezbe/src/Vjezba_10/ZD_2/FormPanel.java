package Vjezba_10.ZD_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private JTextField txtKreda;
    private JTextField txtGodina;
    private JComboBox<Float> comboKamata;
    private JRadioButton rbtnMjesecno;
    private JRadioButton rbtnKvartalno;
    private JButton btnPrikazi;
    private JButton btnIzracunaj;
    private DataPanel dataPanel;
    private FormEvent formEvent;

    public FormPanel(DataPanel dataPanel) {
        this.dataPanel = dataPanel;
        this.formEvent = new FormEvent(this);
        txtKreda = new JTextField(10);
        txtGodina = new JTextField(10);
        comboKamata = new JComboBox<>();
        rbtnMjesecno = new JRadioButton("Mjesecno placanje");
        rbtnKvartalno = new JRadioButton("Kvartalno placanje");
        btnPrikazi = new JButton("Prikazi");
        btnIzracunaj = new JButton("Izracunaj");

        ButtonGroup group = new ButtonGroup();
        group.add(rbtnMjesecno);
        group.add(rbtnKvartalno);

        createComp();
        layoutComponents();
        activateForm();
    }

    public void createComp() {
        for (float i = 5; i <= 11; i += 1) {
            comboKamata.addItem(i);
        }
    }

    public void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Visina kredita:"), gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(txtKreda, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Godina otplate:"), gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.gridwidth = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(txtGodina, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Kamatna stopa:"), gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.gridwidth = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(comboKamata, gc);

        gc.gridx = 0;
        gc.gridy = 3;
        gc.gridwidth = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Nacin placanja:"), gc);

        gc.gridx = 1;
        gc.gridy = 3;
        gc.gridwidth = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(rbtnMjesecno, gc);

        gc.gridx = 2;
        gc.gridy = 3;
        gc.gridwidth = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(rbtnKvartalno, gc);

        gc.gridx = 0;
        gc.gridy = 4;
        gc.gridwidth = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(btnPrikazi, gc);

        gc.gridx = 1;
        gc.gridy = 4;
        gc.gridwidth = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btnIzracunaj, gc);
    }

    public void activateForm() {
        btnIzracunaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float kreda = Float.parseFloat(txtKreda.getText());
                float kamata = (Float) comboKamata.getSelectedItem();
                int godina = Integer.parseInt(txtGodina.getText());
                int nacin = rbtnMjesecno.isSelected() ? 0 : 1;

                Calculation calc = new Calculation(kreda, kamata, nacin, godina);
                formEvent.getCals().add(calc);
                dataPanel.showCalculations(formEvent.getCals());
            }
        });

        btnPrikazi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPanel.showCalculations(formEvent.getCals());
            }
        });
    }
}
