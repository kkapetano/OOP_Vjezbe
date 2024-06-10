package Vjezba_10.ZD_2;

import javax.swing.*;
import java.util.ArrayList;

public class DataPanel extends JPanel {
    private JTextArea txtAr;

    public DataPanel() {
        txtAr = new JTextArea(10, 30);
        txtAr.setEditable(false);
        createComp();
    }

    public void createComp() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JScrollPane(txtAr));
    }

    public void showCalculations(ArrayList<Calculation> calculations) {
        txtAr.setText("");
        for (Calculation calc : calculations) {
            txtAr.append(calc.toString() + "\n\n");
        }
    }
}
