package Frontend;

import Backend.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class mainWindow extends javax.swing.JFrame {
    
    static Draw draw;
    static int num;

    public mainWindow(String title) {
        super(title);
        draw = new Draw();
        num = 0;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        square = new javax.swing.JButton();
        circle = new javax.swing.JButton();
        rectangle = new javax.swing.JButton();
        line = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        color = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        items = new javax.swing.JComboBox<>();
        canvas = new java.awt.Canvas();
        resize = new javax.swing.JButton();
        move = new javax.swing.JButton();
        save = new javax.swing.JButton();
        load = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        square.setBackground(new java.awt.Color(0, 0, 0));
        square.setForeground(new java.awt.Color(255, 255, 255));
        square.setText("Square");
        square.setFocusPainted(false);
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        circle.setBackground(new java.awt.Color(0, 0, 0));
        circle.setForeground(new java.awt.Color(255, 255, 255));
        circle.setText("Circle");
        circle.setFocusPainted(false);
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        rectangle.setBackground(new java.awt.Color(0, 0, 0));
        rectangle.setForeground(new java.awt.Color(255, 255, 255));
        rectangle.setText("Rectangle");
        rectangle.setFocusPainted(false);
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });

        line.setBackground(new java.awt.Color(0, 0, 0));
        line.setForeground(new java.awt.Color(255, 255, 255));
        line.setText("Line Segment");
        line.setFocusPainted(false);
        line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Shape");

        color.setBackground(new java.awt.Color(0, 0, 0));
        color.setForeground(new java.awt.Color(255, 255, 255));
        color.setText("Colorize");
        color.setFocusPainted(false);
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setFocusPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        resize.setBackground(new java.awt.Color(0, 0, 0));
        resize.setForeground(new java.awt.Color(255, 255, 255));
        resize.setText("Resize");
        resize.setFocusPainted(false);
        resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeActionPerformed(evt);
            }
        });

        move.setBackground(new java.awt.Color(0, 0, 0));
        move.setForeground(new java.awt.Color(255, 255, 255));
        move.setText("Move");
        move.setFocusPainted(false);
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(0, 0, 0));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.setFocusPainted(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        load.setBackground(new java.awt.Color(0, 0, 0));
        load.setForeground(new java.awt.Color(255, 255, 255));
        load.setText("Load");
        load.setFocusPainted(false);
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(load)))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(color)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resize, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(circle)
                        .addGap(99, 99, 99)
                        .addComponent(line)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(square)
                        .addGap(122, 122, 122)
                        .addComponent(rectangle))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(rectangle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(circle, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(line, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(square, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save)
                            .addComponent(load))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(color)
                            .addComponent(delete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resize)
                            .addComponent(move))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        // TODO add your handling code here:
        createSquare square = new createSquare(this, "Draw Square", canvas.getGraphics(), items);
        square.setLocationRelativeTo(null);
        square.setVisible(true);
    }//GEN-LAST:event_squareActionPerformed

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        // TODO add your handling code here:
        createCircle circle = new createCircle(this, "Draw Circle", canvas.getGraphics(), items);
        circle.setLocationRelativeTo(null);
        circle.setVisible(true);
    }//GEN-LAST:event_circleActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        // TODO add your handling code here:
        createRectangle rectangle = new createRectangle(this, "Draw Rectangle", canvas.getGraphics(), items);
        rectangle.setLocationRelativeTo(null);
        rectangle.setVisible(true);
    }//GEN-LAST:event_rectangleActionPerformed

    private void lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineActionPerformed
        // TODO add your handling code here:
        createLine line = new createLine(this, "Draw Line Segment", canvas.getGraphics(), items);
        line.setLocationRelativeTo(null);
        line.setVisible(true);
    }//GEN-LAST:event_lineActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
        if (items.getModel().getSize() != 0){
            Colorize colorize = new Colorize(this, "Colorize", canvas.getGraphics(), items);
            colorize.setLocationRelativeTo(null);
            colorize.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No shapes to color");
    }//GEN-LAST:event_colorActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        if (items.getModel().getSize() != 0){
            int index = items.getSelectedIndex();
            Backend.Shape[] shapes = mainWindow.draw.getShapes();
            
            draw.removeShape(shapes[index]);
            items.removeItemAt(index);
            
            canvas.getGraphics().clearRect(0, 0, getWidth(), getHeight());
            draw.refresh(canvas.getGraphics());
            num--;
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No shapes to delete");
    }//GEN-LAST:event_deleteActionPerformed

    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemsActionPerformed

    private void resizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeActionPerformed
        // TODO add your handling code here:
        if (items.getModel().getSize() != 0){
            int index = items.getSelectedIndex();
            Backend.Shape[] shapes = mainWindow.draw.getShapes();
            String name = (String) items.getItemAt(index);
            
            if(name.charAt(0) == 'L'){
                ResizeLine line = new ResizeLine(this, "Resize Line Segment", canvas.getGraphics(), items);
                line.setLocationRelativeTo(null);
                line.setVisible(true);
            }
            else if(name.charAt(0) == 'S'){
                ResizeSquare square = new ResizeSquare(this, "Resize Square", canvas.getGraphics(), items);
                square.setLocationRelativeTo(null);
                square.setVisible(true);
            }
            else if(name.charAt(0) == 'C'){
                ResizeCircle circle = new ResizeCircle(this, "Resize Circle", canvas.getGraphics(), items);
                circle.setLocationRelativeTo(null);
                circle.setVisible(true);
            }
            else if(name.charAt(0) == 'R'){
                ResizeRectangle rectangle = new ResizeRectangle(this, "Resize Rectangle", canvas.getGraphics(), items);
                rectangle.setLocationRelativeTo(null);
                rectangle.setVisible(true);
            }
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No shapes to resize");
    }//GEN-LAST:event_resizeActionPerformed

    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
        // TODO add your handling code here:
        if (items.getModel().getSize() != 0){
            Move move = new Move(this, "Move", canvas.getGraphics(), items);
            move.setLocationRelativeTo(null);
            move.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No shapes to move");
    }//GEN-LAST:event_moveActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if (items.getModel().getSize() != 0){
            int count = items.getItemCount();
            String str, name;
            Backend.Shape[] shapes = mainWindow.draw.getShapes();
            
            JFileChooser choose = new JFileChooser();
            choose.setDialogTitle("Save Shapes");
            int returnValue = choose.showSaveDialog(null);
        
            if (returnValue == JFileChooser.APPROVE_OPTION){
                FileWriter writer = null;
                try {
                    File save = choose.getSelectedFile();
                    writer = new FileWriter(save);
                    for (int i = 0; i < count; i++) {
                        name = (String) items.getItemAt(i);
                        str = shapes[i].toString() + "," + name;
                        writer.write(str);
                    }   JOptionPane.showMessageDialog(rootPane, "Shapes saved successfully!");
                } catch (IOException ex) {
                    Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No shapes to save");
    }//GEN-LAST:event_saveActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas;
    private javax.swing.JButton circle;
    private javax.swing.JButton color;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton line;
    private javax.swing.JButton load;
    private javax.swing.JButton move;
    private javax.swing.JButton rectangle;
    private javax.swing.JButton resize;
    private javax.swing.JButton save;
    private javax.swing.JButton square;
    // End of variables declaration//GEN-END:variables
}
