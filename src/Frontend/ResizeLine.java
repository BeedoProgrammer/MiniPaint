package Frontend;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ResizeLine extends javax.swing.JDialog {

    private Graphics canvas;
    private JComboBox<String> items;
    private mainWindow main;
    
    public ResizeLine(mainWindow main, String title, Graphics canvas, JComboBox<String> items) {
        super(main, title, true);
        this.canvas = canvas;
        this.items = items;
        this.main = main;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        posx2 = new javax.swing.JTextField();
        posy2 = new javax.swing.JTextField();
        resize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("New X2 Position");

        jLabel3.setText("New Y2 Position");

        resize.setBackground(new java.awt.Color(0, 0, 0));
        resize.setForeground(new java.awt.Color(255, 255, 255));
        resize.setText("Resize");
        resize.setFocusPainted(false);
        resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(resize, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(posx2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posy2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posx2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posy2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(resize, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeActionPerformed
        // TODO add your handling code here:
        if(posx2.getText().equals("") || posy2.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Enter all info.");
        else if(Integer.parseInt(posx2.getText()) < 0 || Integer.parseInt(posy2.getText()) < 0)
            JOptionPane.showMessageDialog(rootPane, "Enter positive numbers");
        else{
            int index = items.getSelectedIndex();
            Backend.Shape[] shapes = mainWindow.draw.getShapes();
            
            Map<String, Double> properties = new HashMap<>();
            properties.put("x2", Double.parseDouble(posx2.getText()));
            properties.put("y2", Double.parseDouble(posy2.getText()));
            
            shapes[index].setProperties(properties);
            main.repaint();
            this.dispose();
        }
    }//GEN-LAST:event_resizeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField posx2;
    private javax.swing.JTextField posy2;
    private javax.swing.JButton resize;
    // End of variables declaration//GEN-END:variables
}
