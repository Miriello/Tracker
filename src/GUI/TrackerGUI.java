package GUI;

import Pannello.PannelloContatti;
import Pannello.PannelloMovimenti;
import Pannello.PannelloPatrimonio;

import javax.swing.*;

public class TrackerGUI extends JFrame {

    public TrackerGUI(){
        setTitle("Tracker Personale");
        setSize(950,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Patrimonio", new PannelloPatrimonio());
        tabs.addTab("Movimenti", new PannelloMovimenti());
        tabs.addTab("Contatti", new PannelloContatti());
        add(tabs);
        setVisible(true);
    }
}
