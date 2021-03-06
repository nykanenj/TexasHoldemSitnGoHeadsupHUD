package headsuphud.gui;

import headsuphud.handdata.DataStorage;
import headsuphud.handdata.Position;
import headsuphud.handdata.Street;
import javax.swing.JOptionPane;

/**
 * Graafinen käyttöliittymä ohjelmalle.
 *
 *
 */
public class HudGUI extends javax.swing.JFrame {

    private DataStorage datastorage;
    private Position position;
    private Street street;

    /**
     * Creates new JFrame
     *
     * @param datastorage Provide the datastorage created by
     * HandHistoryTextToObjectConverter
     *
     */
    public HudGUI(DataStorage datastorage) {
        this.datastorage = datastorage;
        this.position = Position.SmallBlind;
        this.street = Street.Preflop;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        smallblindradiobutton = new javax.swing.JRadioButton();
        bigblindradiobutton = new javax.swing.JRadioButton();
        preflopChkBox = new javax.swing.JCheckBox();
        flopChkBox = new javax.swing.JCheckBox();
        turnChkBox = new javax.swing.JCheckBox();
        riverChkBox = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        statsTextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        playerNameList = new javax.swing.JList();
        loadStatsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton3.setText("jRadioButton3");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setForeground(new java.awt.Color(204, 255, 255));

        smallblindradiobutton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(smallblindradiobutton);
        smallblindradiobutton.setForeground(new java.awt.Color(255, 255, 255));
        smallblindradiobutton.setText("Small Blind");
        smallblindradiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallblindradiobuttonActionPerformed(evt);
            }
        });

        bigblindradiobutton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(bigblindradiobutton);
        bigblindradiobutton.setForeground(new java.awt.Color(255, 255, 255));
        bigblindradiobutton.setText("Big Blind");
        bigblindradiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigblindradiobuttonActionPerformed(evt);
            }
        });

        preflopChkBox.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(preflopChkBox);
        preflopChkBox.setForeground(new java.awt.Color(255, 255, 255));
        preflopChkBox.setText("PreFlop");
        preflopChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preflopChkBoxActionPerformed(evt);
            }
        });

        flopChkBox.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(flopChkBox);
        flopChkBox.setForeground(new java.awt.Color(255, 255, 255));
        flopChkBox.setText("Flop");
        flopChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flopChkBoxActionPerformed(evt);
            }
        });

        turnChkBox.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(turnChkBox);
        turnChkBox.setForeground(new java.awt.Color(255, 255, 255));
        turnChkBox.setText("Turn");
        turnChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnChkBoxActionPerformed(evt);
            }
        });

        riverChkBox.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(riverChkBox);
        riverChkBox.setForeground(new java.awt.Color(255, 255, 255));
        riverChkBox.setText("River");
        riverChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riverChkBoxActionPerformed(evt);
            }
        });

        statsTextArea.setBackground(new java.awt.Color(0, 0, 0));
        statsTextArea.setColumns(20);
        statsTextArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        statsTextArea.setForeground(new java.awt.Color(255, 255, 255));
        statsTextArea.setRows(5);
        statsTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jScrollPane3.setViewportView(statsTextArea);

        playerNameList.setBackground(new java.awt.Color(0, 0, 0));
        playerNameList.setForeground(new java.awt.Color(255, 255, 255));
        playerNameList.setName("playerNameList");
        playerNameList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = datastorage.playerNamesAsArray();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        playerNameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playerNameListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(playerNameList);

        loadStatsButton.setBackground(new java.awt.Color(51, 51, 51));
        loadStatsButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        loadStatsButton.setForeground(new java.awt.Color(255, 255, 255));
        loadStatsButton.setText("LoadPlayerStats");
        loadStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadStatsButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Texas Hold'em HeadsupHUD");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a player from the list");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flopChkBox)
                            .addComponent(preflopChkBox)
                            .addComponent(riverChkBox)
                            .addComponent(turnChkBox)
                            .addComponent(bigblindradiobutton)
                            .addComponent(smallblindradiobutton)
                            .addComponent(loadStatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(loadStatsButton)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(smallblindradiobutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bigblindradiobutton)
                        .addGap(13, 13, 13)
                        .addComponent(preflopChkBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flopChkBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnChkBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(riverChkBox)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadStatsButtonActionPerformed

        if (playerNameList.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Select a player from the list first! \nIf the list is empty, it means you have not put any handhistory files into handhistory folder. \nSee readme for more info.");
            return;
        }
        try {
            smallblindradiobutton.setSelected(true);
            preflopChkBox.doClick();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loadStatsButtonActionPerformed

    private void playerNameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerNameListMouseClicked

    }//GEN-LAST:event_playerNameListMouseClicked

    private void riverChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riverChkBoxActionPerformed
        street = Street.River;
        updateDisplay();
    }//GEN-LAST:event_riverChkBoxActionPerformed

    private void turnChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnChkBoxActionPerformed
        street = Street.Turn;
        updateDisplay();
    }//GEN-LAST:event_turnChkBoxActionPerformed

    private void preflopChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preflopChkBoxActionPerformed
        street = Street.Preflop;
        updateDisplay();
    }//GEN-LAST:event_preflopChkBoxActionPerformed

    private void bigblindradiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigblindradiobuttonActionPerformed
        position = Position.BigBlind;
        updateDisplay();
    }//GEN-LAST:event_bigblindradiobuttonActionPerformed

    private void smallblindradiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallblindradiobuttonActionPerformed
        position = Position.SmallBlind;
        updateDisplay();
    }//GEN-LAST:event_smallblindradiobuttonActionPerformed

    private void flopChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flopChkBoxActionPerformed
        street = Street.Flop;
        updateDisplay();
    }//GEN-LAST:event_flopChkBoxActionPerformed

    private void updateDisplay() {
        try {
            String playerName = (String) playerNameList.getSelectedValue();
            String statistics = datastorage.getStats(playerName, position, street);
            statsTextArea.setText(statistics);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select a player from the list first!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public void run(DataStorage datastorage) {
        new HudGUI(datastorage).setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bigblindradiobutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JCheckBox flopChkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton loadStatsButton;
    private javax.swing.JList playerNameList;
    private javax.swing.JCheckBox preflopChkBox;
    private javax.swing.JCheckBox riverChkBox;
    private javax.swing.JRadioButton smallblindradiobutton;
    private javax.swing.JTextArea statsTextArea;
    private javax.swing.JCheckBox turnChkBox;
    // End of variables declaration//GEN-END:variables

}
