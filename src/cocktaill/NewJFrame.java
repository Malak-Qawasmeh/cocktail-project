
package cocktaill;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class NewJFrame extends javax.swing.JFrame {

    ArrayList<Ingredient> ingredient = new ArrayList<>();
    Color color ; 
    MyLogger logger = new MyLogger("MyLogger.log");
    Blender blender = new Blender(400,logger);
    Cup cup = new  Cup();
    Cocktaill cocktaill = new Cocktaill();
    
    
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        MenuLabel = new javax.swing.JLabel();
        ACheckBox = new javax.swing.JCheckBox();
        MCheckBox = new javax.swing.JCheckBox();
        BCheckBox = new javax.swing.JCheckBox();
        SCheckBox = new javax.swing.JCheckBox();
        MilkCheckBox = new javax.swing.JCheckBox();
        KCheckBox = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        SizeLabel = new javax.swing.JLabel();
        smallCheckBox = new javax.swing.JCheckBox();
        midiumCheckBox = new javax.swing.JCheckBox();
        largeCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        ExtensionsLabel = new javax.swing.JLabel();
        iceCheckBox = new javax.swing.JCheckBox();
        sugarCheckBox = new javax.swing.JCheckBox();
        BlendButton = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        cocktaillPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        MillButton = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jLabel2.setText("jLabel2");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N

        logo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                logoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("welcom", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N

        MenuLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        MenuLabel.setText("menu");

        ACheckBox.setText("apple");
        ACheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACheckBoxActionPerformed(evt);
            }
        });

        MCheckBox.setText("mango");
        MCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCheckBoxActionPerformed(evt);
            }
        });

        BCheckBox.setText("banana");
        BCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCheckBoxActionPerformed(evt);
            }
        });

        SCheckBox.setText("Strawberry");
        SCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCheckBoxActionPerformed(evt);
            }
        });

        MilkCheckBox.setText("milk");
        MilkCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkCheckBoxActionPerformed(evt);
            }
        });

        KCheckBox.setText("Kiwi ");
        KCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MilkCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(MenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ACheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MilkCheckBox)
                .addContainerGap())
        );

        SizeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        SizeLabel.setText("size");

        smallCheckBox.setText("small");
        smallCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallCheckBoxActionPerformed(evt);
            }
        });

        midiumCheckBox.setText("midium");
        midiumCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midiumCheckBoxActionPerformed(evt);
            }
        });

        largeCheckBox.setText("large");
        largeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeCheckBoxActionPerformed(evt);
            }
        });

        jPanel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(largeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midiumCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smallCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(SizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(smallCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(midiumCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(largeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ExtensionsLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        ExtensionsLabel.setText("extensions");

        iceCheckBox.setText("ice");
        iceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceCheckBoxActionPerformed(evt);
            }
        });

        sugarCheckBox.setText("sugar");
        sugarCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugarCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sugarCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iceCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExtensionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ExtensionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iceCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sugarCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BlendButton.setBackground(new java.awt.Color(204, 204, 255));
        BlendButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        BlendButton.setText("Blend");
        BlendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlendButtonActionPerformed(evt);
            }
        });

        photo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                photoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BlendButton))
                .addGap(41, 41, 41)
                .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(BlendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        jTabbedPane1.addTab("orders", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("order`s information");

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout cocktaillPanelLayout = new javax.swing.GroupLayout(cocktaillPanel);
        cocktaillPanel.setLayout(cocktaillPanelLayout);
        cocktaillPanelLayout.setHorizontalGroup(
            cocktaillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        cocktaillPanelLayout.setVerticalGroup(
            cocktaillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        MillButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        MillButton.setText("caloreis per mill");
        MillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MillButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cocktaillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(MillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cocktaillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" information", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MilkCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkCheckBoxActionPerformed
   if(MilkCheckBox.isSelected()){
            try {
                Milk milk = new Milk("milk", 32, 100, Color.white);
                ingredient.add(milk);
                blender.add(milk);
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }}        
    }//GEN-LAST:event_MilkCheckBoxActionPerformed

    private void sugarCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugarCheckBoxActionPerformed
        if(sugarCheckBox.isSelected()){
            try {
                Sugar sugar = new Sugar("sugar",40,30 , Color.white);
                ingredient.add(sugar);
                blender.add(sugar);
            } catch (BlenderOverflowException ex) {

            }
            
        }
    }//GEN-LAST:event_sugarCheckBoxActionPerformed

    private void ACheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACheckBoxActionPerformed
if(ACheckBox.isSelected()){
            try {
                Fruit apple = new Fruit("apple", 52, 150, Color.yellow);
                ingredient.add(apple);
                blender.add(apple);
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }  }
        // TODO add your handling code here:
    }//GEN-LAST:event_ACheckBoxActionPerformed

    private void MCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCheckBoxActionPerformed
       if(MCheckBox.isSelected()){
            try {
                Fruit mango = new Fruit("mango", 60, 170, Color.orange);
                ingredient.add(mango);
                blender.add(mango);
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }}
        // TODO add your handling code here:
    }//GEN-LAST:event_MCheckBoxActionPerformed

    private void BCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCheckBoxActionPerformed
           if(BCheckBox.isSelected()){
            try {
                Fruit banana = new Fruit("banana", 89, 120, Color.yellow);
                ingredient.add(banana);
                blender.add(banana);
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }}
        // TODO add your handling code here:
    }//GEN-LAST:event_BCheckBoxActionPerformed

    private void SCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCheckBoxActionPerformed
    if(SCheckBox.isSelected()){
            try {
                Fruit mango = new Fruit("Strawberry", 32, 100, Color.red);
                ingredient.add(mango);
                blender.add(mango);
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }}        
// TODO add your handling code here:
    }//GEN-LAST:event_SCheckBoxActionPerformed

    private void smallCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallCheckBoxActionPerformed
    if(smallCheckBox.isSelected()){
        try {
            cup.setCapacity(150);
            blender.pour(cup);
        } catch (BlenderEmptyException ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_smallCheckBoxActionPerformed

    private void midiumCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midiumCheckBoxActionPerformed
  if(midiumCheckBox.isSelected()){
        try {
            cup.setCapacity(250);
            blender.pour(cup);
        } catch (BlenderEmptyException ex) {
               JOptionPane.showMessageDialog(this,ex);
        }
    }        
// TODO add your handling code here:
    }//GEN-LAST:event_midiumCheckBoxActionPerformed

    private void largeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeCheckBoxActionPerformed
       if(largeCheckBox.isSelected()){
        try {
            cup.setCapacity(300);
            blender.pour(cup);
        } catch (BlenderEmptyException ex) {
                  JOptionPane.showMessageDialog(this,ex);
        }
    }    
        // TODO add your handling code here:
    }//GEN-LAST:event_largeCheckBoxActionPerformed

    private void iceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceCheckBoxActionPerformed
 if(iceCheckBox.isSelected()){
            try {
                Ice ice = new Ice("ice", 30, 20, Color.white);
                ingredient.add(ice);
                blender.add(ice);
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }}        

    }//GEN-LAST:event_iceCheckBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BlendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlendButtonActionPerformed
       
            cocktaill = blender.blend();            
          JOptionPane.showMessageDialog(this,"cocktail blendeed");
            TextArea.setText(cocktaill.getInfo());
        cocktaillPanel.setBackground(cocktaill.getColor());    

    }//GEN-LAST:event_BlendButtonActionPerformed

    private void KCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KCheckBoxActionPerformed
        if(KCheckBox.isSelected()){
            try {
                Fruit Kiwi = new Fruit("Kiwi", 61, 110, Color.green);
                ingredient.add(Kiwi);
                blender.add(Kiwi);
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }}   
        
// TODO add your handling code here:
    }//GEN-LAST:event_KCheckBoxActionPerformed

    private void MillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MillButtonActionPerformed
        JOptionPane.showMessageDialog(this,cup.getCalories() + ".cal");        
        

    }//GEN-LAST:event_MillButtonActionPerformed

    private void logoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_logoPropertyChange
        String imagePath="src\\img\\logo.png";
        if (!settingIconProgrammatically) {
            settingIconProgrammatically = true;
            logo.setIcon(new ImageIcon(imagePath));
            settingIconProgrammatically = false;
        }
    }//GEN-LAST:event_logoPropertyChange

    private void photoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_photoPropertyChange
         String imagePath="src\\img\\cup 2.png";
        if (!settingIconProgrammatically) {
            settingIconProgrammatically = true;
            photo.setIcon(new ImageIcon(imagePath));
            settingIconProgrammatically = false;
        }
    }//GEN-LAST:event_photoPropertyChange
private boolean settingIconProgrammatically = false;
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ACheckBox;
    private javax.swing.JCheckBox BCheckBox;
    private javax.swing.JButton BlendButton;
    private javax.swing.JLabel ExtensionsLabel;
    private javax.swing.JCheckBox KCheckBox;
    private javax.swing.JCheckBox MCheckBox;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JCheckBox MilkCheckBox;
    private javax.swing.JButton MillButton;
    private javax.swing.JCheckBox SCheckBox;
    private javax.swing.JLabel SizeLabel;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JPanel cocktaillPanel;
    private javax.swing.JCheckBox iceCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox largeCheckBox;
    private javax.swing.JLabel logo;
    private javax.swing.JCheckBox midiumCheckBox;
    private javax.swing.JLabel photo;
    private javax.swing.JCheckBox smallCheckBox;
    private javax.swing.JCheckBox sugarCheckBox;
    // End of variables declaration//GEN-END:variables
}
