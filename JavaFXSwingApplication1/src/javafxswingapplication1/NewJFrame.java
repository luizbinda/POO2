/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxswingapplication1;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luizn
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        buttonGroupSistOperacional = new javax.swing.ButtonGroup();
        buttonGroupProcessador = new javax.swing.ButtonGroup();
        jPopupMenuTabela = new javax.swing.JPopupMenu();
        jMenuItemAdicionar = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItemLimpar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioWindows = new javax.swing.JRadioButton();
        jRadioLinux = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonIntel = new javax.swing.JRadioButton();
        jRadioButtonAMD = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox320 = new javax.swing.JCheckBox();
        jCheckBox500 = new javax.swing.JCheckBox();
        jCheckBox1T = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxVersao = new javax.swing.JComboBox();
        jComboBoxCidade = new javax.swing.JComboBox();
        jLabelMemoria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMemoria = new javax.swing.JList();
        jButtonCadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRelatorio = new javax.swing.JTable();

        jMenuItemAdicionar.setText("Adicionar");
        jMenuItemAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarActionPerformed(evt);
            }
        });
        jPopupMenuTabela.add(jMenuItemAdicionar);

        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jPopupMenuTabela.add(jMenuItemExcluir);

        jMenuItemLimpar.setText("Limpar");
        jMenuItemLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLimparActionPerformed(evt);
            }
        });
        jPopupMenuTabela.add(jMenuItemLimpar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNome.setText("Nome");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCidade.setText("Cidade");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sist. Operacional"));

        buttonGroupSistOperacional.add(jRadioWindows);
        jRadioWindows.setText("Windows");
        jRadioWindows.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioWindowsStateChanged(evt);
            }
        });
        jRadioWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioWindowsActionPerformed(evt);
            }
        });

        buttonGroupSistOperacional.add(jRadioLinux);
        jRadioLinux.setText("Linux");
        jRadioLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioLinuxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioWindows)
                    .addComponent(jRadioLinux))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(jRadioLinux))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Processador"));

        buttonGroupProcessador.add(jRadioButtonIntel);
        jRadioButtonIntel.setText("Intel");

        buttonGroupProcessador.add(jRadioButtonAMD);
        jRadioButtonAMD.setText("AMD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonAMD, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jRadioButtonIntel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jRadioButtonIntel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonAMD)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("HD"));

        jCheckBox320.setText("320 GB");

        jCheckBox500.setSelected(true);
        jCheckBox500.setText("500 GB");

        jCheckBox1T.setText("1 T");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1T, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox500, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jCheckBox320, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jCheckBox320)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox500)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1T))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Versão");

        jComboBoxCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aracruz", "Colatina", "Serra", "Vitória" }));
        jComboBoxCidade.setSelectedIndex(1);

        jLabelMemoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMemoria.setText("Memória RAM");

        jListMemoria.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Menos de 1GB", "1 GB", "2 GB", "3 GB", "4 GB", "Mais que 4 GB" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListMemoria);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cidade", "SO", "Versão", "Processador", "HD", "Memória"
            }
        ));
        jTableRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRelatorioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRelatorio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jComboBoxVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabelMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioWindowsActionPerformed
        jComboBoxVersao.removeAllItems();
        jComboBoxVersao.addItem("XP");
        jComboBoxVersao.addItem("Win7");
        jComboBoxVersao.addItem("Win8");
        jComboBoxVersao.addItem("2003 Server");
        jComboBoxVersao.addItem("2008 Server"); 
        jComboBoxVersao.setSelectedIndex(2);
       
    }//GEN-LAST:event_jRadioWindowsActionPerformed

    private void jRadioWindowsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioWindowsStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioWindowsStateChanged

    private void jRadioLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioLinuxActionPerformed
        jComboBoxVersao.removeAllItems();
        jComboBoxVersao.addItem("Ubuntu");
        jComboBoxVersao.addItem("Fedora");
        jComboBoxVersao.addItem("Red Hat");
        jComboBoxVersao.addItem("Suse");
        jComboBoxVersao.addItem("Debian");
    }//GEN-LAST:event_jRadioLinuxActionPerformed
    
    private ArrayList pegarCheckButtonsSelecteds( AbstractButton ...checkButtons){
        ArrayList checkButtonsSelecteds = new ArrayList();
        
        for (AbstractButton checkButton : checkButtons ){
            if(checkButton.isSelected())
                checkButtonsSelecteds.add(checkButton.getText());
        }
        
        return checkButtonsSelecteds;
    }
    
    private AbstractButton pegarRadioButtonSelected( AbstractButton ...radioButtons){
        AbstractButton RadioButtonSelected = null;
        
        for (AbstractButton radioButton : radioButtons ){
            if(radioButton.isSelected())
                RadioButtonSelected = radioButton; 
        }
        
        return RadioButtonSelected;
    }
    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String nome = jTextFieldNome.getText();
        String cidade = jComboBoxCidade.getSelectedItem().toString();
        
        String so = pegarRadioButtonSelected(jRadioWindows, jRadioLinux).getText();
        
        String versao = jComboBoxVersao.getSelectedItem().toString();
        
        String processador = pegarRadioButtonSelected(jRadioButtonIntel, jRadioButtonAMD).getText();
        
        ArrayList hd = pegarCheckButtonsSelecteds(jCheckBox320, jCheckBox500, jCheckBox1T);
        String memoria = jListMemoria.getSelectedValue().toString();
        DefaultTableModel model = (DefaultTableModel) jTableRelatorio.getModel();
        model.addRow (new Object[]{nome, cidade, so, versao, processador, hd, memoria});
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTableRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRelatorioMouseClicked
        if(evt.getButton() == MouseEvent.BUTTON3){
            jPopupMenuTabela.show(jTableRelatorio, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTableRelatorioMouseClicked
    
    private ArrayList pegarDadosRowTable( DefaultTableModel model, int rowSelect, int columCount){
        ArrayList row = new ArrayList();
        
        for(int colum = 0; colum < columCount; colum++){
            row.add(model.getValueAt(rowSelect, colum));
        }
        
        return row;
        
    }
    private void jMenuItemAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarActionPerformed
        //DefaultTableModel model = (DefaultTableModel) jTableRelatorio.getModel();
        
        DefaultTableModel model = (DefaultTableModel) jTableRelatorio.getModel();
        ArrayList row = pegarDadosRowTable(model, jTableRelatorio.getSelectedRow(), jTableRelatorio.getColumnCount());
        model.addRow (new Object[]{row.get(0), row.get(1), row.get(2), row.get(3), row.get(4), row.get(5), row.get(6)});
        
    }//GEN-LAST:event_jMenuItemAdicionarActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableRelatorio.getModel();
        model.removeRow(jTableRelatorio.getSelectedRow());
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void jMenuItemLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLimparActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableRelatorio.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_jMenuItemLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupProcessador;
    private javax.swing.ButtonGroup buttonGroupSistOperacional;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JCheckBox jCheckBox1T;
    private javax.swing.JCheckBox jCheckBox320;
    private javax.swing.JCheckBox jCheckBox500;
    private javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JComboBox jComboBoxVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelMemoria;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JList jListMemoria;
    private javax.swing.JMenuItem jMenuItemAdicionar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenuTabela;
    private javax.swing.JRadioButton jRadioButtonAMD;
    private javax.swing.JRadioButton jRadioButtonIntel;
    private javax.swing.JRadioButton jRadioLinux;
    private javax.swing.JRadioButton jRadioWindows;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRelatorio;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
