/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressverwaltung.forms;

import adressverwaltung.errors.CanNotConnectToDatabaseError;
import adressverwaltung.errors.DatabaseSelfHealingError;
import adressverwaltung.main;
import adressverwaltung.models.Town;
import adressverwaltung.utils.CustomFocusTraversalPolicy;
import adressverwaltung.utils.InOut;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Christof Weickhardt
 */
public class TownForm extends javax.swing.JFrame {

    InOut ioLayer;
    Town town;
    long count = 0;
    long current = 1;
    boolean search = false;
    List<Town> searchResults;
    HashMap<String, Boolean> validators = new HashMap<>();

    /**
     * Creates new form TownForm
     *
     * @param io adsf
     * @throws adressverwaltung.errors.CanNotConnectToDatabaseError adf
     * @throws java.sql.SQLException asdf
     */
    public TownForm(InOut io) throws CanNotConnectToDatabaseError, SQLException {
        initComponents();
        if (io != null) {
            ioLayer = io;
        }
        if (io == null) {
            try {
                ioLayer = new InOut(null);
            } catch (DatabaseSelfHealingError ex) {
               throw new CanNotConnectToDatabaseError();
            }
        }
        if (io != null) {
            count = io.countTowns();
        }
        if (count == 0) {
            town = new Town();
        }
        if (count > 0) {
            town = ioLayer.getTowns(1, 0).get(0);
        }
        setCurrentTown(town);
        setResizable(false);

        ArrayList<Component> list = new ArrayList<>();
        list.add(jTextField1);
        list.add(jTextField2);
        setFocusTraversalPolicy(new CustomFocusTraversalPolicy(list));

        validators.put("PLZ", false);
        validators.put("Name", false);

        ((JTextField) jTextField1).getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (jTextField1.getText().trim().isEmpty()) {
                    validators.put("Name", false);
                    return;
                }
                validators.put("Name", true);
                validateInput();
            }
        });

        ((JTextField) jTextField2).getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                try {
                    if (jTextField2.getText().trim().isEmpty()) {
                        validators.put("PLZ", false);
                        jTextField2.setForeground(Color.red);
                    } else if (new Integer(jTextField2.getText().trim()) > 0 && new Integer(jTextField2.getText().trim()) < 10000) {
                        validators.put("PLZ", true);
                        jTextField2.setForeground(Color.black);
                        validateInput();
                    } else {
                        validators.put("PLZ", false);
                        jTextField2.setForeground(Color.red);
                    }
                    validateInput();
                } catch (Exception e) {
                    System.err.println("hey");
                    validators.put("PLZ", false);
                    jTextField2.setForeground(Color.red);
                    validateInput();
                }

            }
        });
    }

    private void validateInput() {
        if (validators.values().stream().filter(el -> el == true).count() == validators.size()) {
            jButton3.setEnabled(true);
        } else {
            jButton3.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content tf this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("<<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(">>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("Löschen");
        jButton4.setName("delete"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Speichern");
        jButton3.setName("saveTown"); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(80, 29));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Suchen");
        jButton2.setName("search"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Neu");
        jButton1.setName("newTown"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("1/x");
        jLabel9.setName("state"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("Ortsverwaltung");

        jLabel2.setText("Name");

        jTextField1.setName("townName"); // NOI18N
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1CaretPositionChanged(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Plz");

        jButton8.setText("Settings");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField2.setName("townPLZ"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1CaretPositionChanged

    }//GEN-LAST:event_jTextField1CaretPositionChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        if (count >= current || current == count + 1) {
            current--;
            setCurrentTown(search ? searchResults.get(new Integer(current - 1 + ""))
                    : ioLayer.getTowns(1, new Integer(current - 1 + "")).get(0));
            setPlayerButtons();
        }
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        if (count > current) {
            current++;
            setCurrentTown(search ? searchResults.get(new Integer(current - 1 + ""))
                    : ioLayer.getTowns(1, new Integer(current - 1 + "")).get(0));
            setPlayerButtons();
        }
    }// GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (town.getTid() != null) {
                ioLayer.deleteTown(town);
            }
            if (search && searchResults.contains(town)) {
                searchResults.remove(town);
            }
            town = null;
            count = search ? searchResults.size() : (int) ioLayer.countTowns();
            if (count > 0) {
                while (current > count) {
                    current--;
                }
                setCurrentTown(ioLayer.getTowns(1, new Integer((current > 0L ? current - 1L : 0L) + "")).get(0));
                setPlayerButtons();
            } else {
                town = new Town();
                if (count == 0) {
                    search = false;
                }
                clearInputs();
                current = 1;
                setPlayerButtons();
                setCurrentTown(town);
            }
            main.af.updateTown(town.getTid());
        } catch (Error ex) {
            JOptionPane.showMessageDialog(null, "Some people might still live in this town", "People in the town",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(TownForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        try {
            List<Town> searchCheck = ioLayer.searchTown(getCurrentTown().getPlz(), getCurrentTown().getName());
            if (searchCheck.stream()
                    .filter(el -> el.getName().equalsIgnoreCase(getCurrentTown().getName())
                    && el.getPlz() == getCurrentTown().getPlz())
                    .count() == 1 && getCurrentTown().getTid() != null) {
                Optional<Town> found = searchCheck.stream()
                        .filter(el -> el.getName().equalsIgnoreCase(getCurrentTown().getName())
                        && el.getPlz() == getCurrentTown().getPlz())
                        .findFirst();
                if (!(Objects.equals(found.get().getTid(), getCurrentTown().getTid()))) {
                    JOptionPane.showMessageDialog(null, "That town already exists", "Town exists",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    long id = ioLayer.saveTown(getCurrentTown());
                    count = search ? searchResults.size() : (int) ioLayer.countTowns();
                    setCurrentTown(ioLayer.getTown(id));
                    setPlayerButtons();
                    main.af.updateTown(id);
                }
            } else if (searchCheck.stream().filter(el -> el.getName().equalsIgnoreCase(getCurrentTown().getName())
                    && el.getPlz() == getCurrentTown().getPlz()).count() > 0) {
                JOptionPane.showMessageDialog(null, "That town already exists", "Town exists",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                long id = ioLayer.saveTown(getCurrentTown());
                count = search ? searchResults.size() : (int) ioLayer.countTowns();
                setCurrentTown(ioLayer.getTown(id));
                setPlayerButtons();
                main.af.updateTown(id);
            }
        } catch (SQLException ex) {
        }
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        try {
            search = !search;
            if (search) {
                searchResults = ioLayer.searchTown(new Integer(jTextField2.getText()), jTextField1.getText());
                if (searchResults.size() > 0) {
                    count = searchResults.size();
                    current = 1;
                    setCurrentTown(searchResults.get(0));
                    setPlayerButtons();
                }
                jButton2.setText("Exit Search");
            } else {
                count = ioLayer.countTowns();
                if (count == 0) {
                    town = new Town();
                }
                if (count > 0) {
                    town = ioLayer.getTowns(1, 0).get(0);
                }
                setCurrentTown(town);
                jButton2.setText("Search");
            }
        } catch (SQLException ex) {
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        town = new Town();
        search = false;
        clearInputs();
        current = count + 1;
        setPlayerButtons();
        setCurrentTown(town);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
        main.viewConnectionSettings();
    }// GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        try {
            main.viewAdressForm();
        } catch (SQLException | CanNotConnectToDatabaseError ex) {
            Logger.getLogger(TownForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    /**
     * Function to set the Current town
     *
     * @param town The current town
     */
    private void setCurrentTown(Town town) {
        this.town = town;
        setPlayerButtons();
        showCurrentTown();
    }

    /**
     * Function to display the current town
     */
    private void showCurrentTown() {
        jTextField2.setText(town != null ? town.getPlz() + "" : "0");
        jTextField1.setText(town != null ? town.getName() : "");
    }

    /**
     * Function to cast the inputs into a town object
     */
    private Town getCurrentTown() {
        town.setName(jTextField1.getText());
        town.setPlz(new Integer(jTextField2.getText()));
        return town;
    }

    /**
     * Function to the play buttons
     */
    private void setPlayerButtons() {
        jLabel9.setText(current > count ? "New Item" : current + "/" + count);
        jButton5.setEnabled(current != 1);
        jButton6.setEnabled(current < count);
    }

    private void clearInputs() {
        jTextField2.setText(1000 + "");
        jTextField1.setText("");
    }
}
