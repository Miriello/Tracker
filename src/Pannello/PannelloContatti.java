package Pannello;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PannelloContatti extends JPanel{
    private DefaultTableModel model;

    public PannelloContatti(){
        setLayout(new BorderLayout(5, 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        String[] col = {"Nome","Cognome","Codice fiscale","Numero di Telefono",};
        model = new DefaultTableModel(col, 0) {
            public boolean isCellEditable(int r, int c) {
                return false; }
        };
        add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);
        JButton aggiungi = new JButton("Aggiungi Contatto");
        aggiungi.addActionListener(e -> aggiungiContatto());
        JButton rimuovi = new JButton("Rimuovi Contatto");
        rimuovi.addActionListener(e -> rimuoviContatto());
        JPanel pulsanti = new JPanel();
        pulsanti.add(aggiungi);
        pulsanti.add(rimuovi);
        add(pulsanti, BorderLayout.SOUTH);
    }

    public void aggiungiContatto(){

    }

    public void rimuoviContatto(){
        
    }
}
