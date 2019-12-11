/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import UI.*;
import Model.OptionSet;
import Model.PizzaConfig;
import Model.PizzaOption;
import Util.Stub.GenericDao;
import Util.Stub.IGenericDao;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Util.Proxy.IOptionSetProxy;
import Util.Proxy.IPizzaConfigProxy;
import Util.Proxy.IPizzaOptionProxy;

/**
 *
 * @author root
 */
public class AllTables extends javax.swing.JFrame {

    /**
     * Creates new form AllTables
     */
    private SecurityManager secManager = System.getSecurityManager();
    private Registry reg = LocateRegistry.getRegistry("localhost", 2000);
    
    DefaultTableModel model;
    private static final String path = "./src/main/java/properties/";
    IPizzaOptionProxy gdpo = null;//(IPizzaOptionProxy) reg.lookup("PizzaOptionDao");
    IPizzaConfigProxy gdpc = null; //(IPizzaConfigProxy) reg.lookup("PizzaConfigDao");
    IOptionSetProxy gdos = null;//(IOptionSetProxy) reg.lookup("OptionSetDao");

    public AllTables() throws RemoteException, NotBoundException {
        initComponents();
        listAll();

    }

    private void listAll() throws RemoteException, NotBoundException {
        model = (DefaultTableModel) jTable3.getModel();
        gdpc = (IPizzaConfigProxy) reg.lookup("PizzaConfigDao");
        List<PizzaConfig> pizzas = gdpc.getAll(PizzaConfig.class);
        for (PizzaConfig pc : pizzas) {
         
            
            model.insertRow(model.getRowCount(), new Object[]{
                pc.getId(),
                pc.getName(),
                pc.getBaseprice()
                
            });
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        DeletebtnPC = new javax.swing.JButton();
        UpdatebtnPC = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        Pricetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        optionstxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        DeletebtnPC.setText("Delete");
        DeletebtnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnPCActionPerformed(evt);
            }
        });

        UpdatebtnPC.setText("Update");
        UpdatebtnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnPCActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel3.setText("Update info");

        jLabel5.setText("Price");

        jLabel1.setText("Options");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nametxt)
                            .addComponent(Pricetxt)
                            .addComponent(optionstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdatebtnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletebtnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeletebtnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(UpdatebtnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void DeletebtnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnPCActionPerformed
        try {                                            
            gdpc = (IPizzaConfigProxy) reg.lookup("PizzaConfigDao");
            try {
                
                int row = jTable3.getSelectedRow();
                
                Long id = Long.parseLong(model.getValueAt(row, 0).toString());
                
                List<PizzaConfig> lpc = gdpc.searchById(PizzaConfig.class, id);
                PizzaConfig pizzaConfig1 = new PizzaConfig();
                for (PizzaConfig pizzaConfig : lpc) {
                    pizzaConfig1 = pizzaConfig;
                    
                    pizzaConfig1.setIsActive(true);
                    gdpc.update(pizzaConfig1);
                    
                }
                model.setRowCount(0);
                
                Pricetxt.setText("");
                Nametxt.setText("");
                optionstxt.setText("");
                
                listAll();
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (RemoteException ex) {
            Logger.getLogger(AllTables.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AllTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeletebtnPCActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        try {
           int row = jTable3.getSelectedRow();
           Nametxt.setText(model.getValueAt(row, 1).toString());
           Pricetxt.setText(model.getValueAt(row, 2).toString());
           

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTable3MouseClicked

    private void UpdatebtnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnPCActionPerformed
        try {
            
            int row = jTable3.getSelectedRow();

            Long id = Long.parseLong(model.getValueAt(row, 0).toString());
            List<PizzaConfig> lpc = gdpc.searchById(PizzaConfig.class, id);
            PizzaConfig pizzaConfig1 = new PizzaConfig();
            for (PizzaConfig pizzaConfig : lpc) {
                pizzaConfig1 = pizzaConfig;
                pizzaConfig1.setBaseprice(Double.parseDouble(Pricetxt.getText()));
                pizzaConfig1.setName(Nametxt.getText());
                gdpc.update(pizzaConfig1);
                
            }
            
            model.setRowCount(0);
            listAll();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_UpdatebtnPCActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new AllTables().setVisible(true);
                    } catch (NotBoundException ex) {
                        Logger.getLogger(AllTables.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (RemoteException ex) {
                    Logger.getLogger(AllTables.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletebtnPC;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JButton UpdatebtnPC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField optionstxt;
    // End of variables declaration//GEN-END:variables

}
