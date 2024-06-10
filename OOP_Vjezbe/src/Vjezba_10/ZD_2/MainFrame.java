package Vjezba_10.ZD_2;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Kalkulator kredita");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComp();
    }

    private void createComp() {
        DataPanel dataPanel = new DataPanel();
        FormPanel formPanel = new FormPanel(dataPanel);

        setLayout(new BorderLayout());
        add(dataPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.WEST);
    }
}
