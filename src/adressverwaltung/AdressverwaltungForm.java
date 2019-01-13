/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressverwaltung;


/**
 * Diese Klasse ist ein Form welches auf die Klasse JFrame zugreift um das main
 * gui Adressverwaltung anzuzeigen.
 * 
 * @author Christof Weickhardt
 * @author Nicola Temporal
 */
public class AdressverwaltungForm extends javax.swing.JFrame {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        nameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        placeLabel = new javax.swing.JLabel();
        telephoneLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        streetText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        placeText = new javax.swing.JComboBox<>();
        telephoneText = new javax.swing.JTextField();
        mobileText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        leftKey = new javax.swing.JButton();
        adressNummer = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name:");
        nameLabel.setName("name"); // NOI18N

        firstNameLabel.setText("Vorname:");

        streetLabel.setText("Strasse:");

        placeLabel.setText("PLZ/Ort:");

        telephoneLabel.setText("Telefon:");

        mobileLabel.setText("Handy:");

        emailLabel.setText("Email:");

        nameText.setNextFocusableComponent(firstNameText);
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        streetText.setNextFocusableComponent(placeText);
        streetText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTextActionPerformed(evt);
            }
        });

        firstNameText.setNextFocusableComponent(streetText);
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        placeText.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        placeText.setNextFocusableComponent(telephoneText);
        placeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeTextActionPerformed(evt);
            }
        });

        telephoneText.setNextFocusableComponent(mobileText);

        mobileText.setNextFocusableComponent(emailText);
        mobileText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTextActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        newButton.setText("Neu");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Suchen");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Speichern");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jButton4.setText(">>");

        deleteButton.setText("Löschen");

        leftKey.setText("<<");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup().addComponent(leftKey)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(leftKey, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        adressNummer.setText("ID:");

        idText.setNextFocusableComponent(nameText);
        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adressNummer).addComponent(nameLabel).addComponent(firstNameLabel)
                                .addComponent(streetLabel).addComponent(placeLabel).addComponent(telephoneLabel)
                                .addComponent(mobileLabel).addComponent(emailLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        layout.createSequentialGroup().addGap(38, 52, Short.MAX_VALUE).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(streetText, javax.swing.GroupLayout.DEFAULT_SIZE, 170,
                                                        Short.MAX_VALUE)
                                                .addComponent(nameText)
                                                .addComponent(firstNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 170,
                                                        Short.MAX_VALUE)
                                                .addComponent(idText, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createSequentialGroup().addGap(51, 51, 51).addComponent(emailText))
                                .addGroup(layout.createSequentialGroup().addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(telephoneText, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(placeText, 0, 170, Short.MAX_VALUE)
                                                .addComponent(mobileText))))
                        .addGap(85, 85, 85)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(adressNummer).addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstNameText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(streetText).addComponent(streetLabel,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 15,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(placeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(placeText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telephoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telephoneText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mobileLabel).addComponent(mobileText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailText))
                        .addGap(62, 62, 62))
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameTextActionPerformed

    private void placeTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_placeTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_placeTextActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_firstNameTextActionPerformed

    private void streetTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_streetTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_streetTextActionPerformed

    private void mobileTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mobileTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_mobileTextActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveButtonActionPerformed

    }// GEN-LAST:event_saveButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newButtonActionPerformed

    }// GEN-LAST:event_newButtonActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_idTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchButtonActionPerformed

    }// GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressNummer;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leftKey;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel placeLabel;
    private javax.swing.JComboBox<String> placeText;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetText;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JTextField telephoneText;
    // End of variables declaration//GEN-END:variables
}
