package Frontend;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ResizeCircle extends javax.swing.JDialog {

    private Graphics canvas;
    private JComboBox<String> items;
    
    public ResizeCircle(mainWindow main, String title, Graphics canvas, JComboBox<String> items) {
        super(main, title, true);
        this.canvas = canvas;
        this.items = items;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        radius = new javax.swing.JTextField();
        resize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("New Radius");

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
                .addGap(143, 143, 143)
                .addComponent(resize, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(radius, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radius, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(resize, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeActionPerformed
        // TODO add your handling code here:
        if(radius.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Enter all info.");
        else if(Double.parseDouble(radius.getText()) <= 0)
            JOptionPane.showMessageDialog(rootPane, "Enter positive numbers");
        else{
            int index = items.getSelectedIndex();
            Backend.Shape[] shapes = mainWindow.draw.getShapes();
            
            Map<String, Double> properties = new HashMap<>();
            properties.put("radius", Double.parseDouble(radius.getText()));
            
            shapes[index].setProperties(properties);
            canvas.clearRect(0, 0, getWidth(), getHeight());
            mainWindow.draw.refresh(canvas);
            this.dispose();
        }
    }//GEN-LAST:event_resizeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField radius;
    private javax.swing.JButton resize;
    // End of variables declaration//GEN-END:variables
}
