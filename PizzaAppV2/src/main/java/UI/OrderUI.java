/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.OptionSet;
import Model.PizzaConfig;
import Model.PizzaOption;
import Util.Stub.GenericDao;
import java.awt.event.MouseListener;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import Util.Proxy.IOptionSetProxy;
import Util.Proxy.IPizzaConfigProxy;
import Util.Proxy.IPizzaOptionProxy;

/**
 *
 * @author root
 */
public class OrderUI extends javax.swing.JFrame {

    private SecurityManager secManager = System.getSecurityManager();
    private Registry reg = LocateRegistry.getRegistry("localhost", 2000);

//    registry.rebind("OptionSetDao", optionSetDao);
//        registry.rebind("", pizzaConfigDao);
//        registry.rebind("PizzaOptionDao", pizzaOptionDao);
    GenericDao<OptionSet> gdo = new GenericDao<>();
    GenericDao<PizzaOption> gdpo = new GenericDao<>();
    List<PizzaConfig> pizzaConfig;
    PizzaConfig pizzaConfig1 = new PizzaConfig();
    int count = 0;

    /**
     * Creates new form AllPizzeriaUI
     */
    public OrderUI() throws RemoteException, NotBoundException {

        initComponents();
        if (secManager == null) {
            System.setSecurityManager(new SecurityManager());
        }
        IPizzaConfigProxy gdpc = (IPizzaConfigProxy) reg.lookup("PizzaConfigDao");
        pizzaConfig = gdpc.getAll(PizzaConfig.class);
        for (PizzaConfig pizzaConfig1 : pizzaConfig) {
            pizzaname.addItem(pizzaConfig1.getName());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pizzaname = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        listoptions = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        order = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        size = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 169, 80));
        jLabel1.setText("Available Pizza");

        jLabel2.setText("Name");

        pizzaname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzanameActionPerformed(evt);
            }
        });

        jLabel3.setText("Price");

        price.setEnabled(false);

        jLabel4.setText("Options");

        listoptions.setEnabled(false);

        jLabel5.setText("Do you want it delivered?");

        buttonGroup1.add(yes);
        yes.setText("Yes");
        yes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesMouseClicked(evt);
            }
        });

        buttonGroup1.add(no);
        no.setText("No");
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });

        order.setText("Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        jLabel6.setText("Size");

        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(listoptions)
                            .addComponent(pizzaname, 0, 304, Short.MAX_VALUE)
                            .addComponent(size, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no)
                    .addComponent(yes))
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pizzaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listoptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(yes)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(no)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(order)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pizzanameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzanameActionPerformed

        String name = (String) pizzaname.getSelectedItem();
        IPizzaConfigProxy pizzaConfigDao = null;
        try {
            pizzaConfigDao = (IPizzaConfigProxy) reg.lookup("PizzaConfigDao");
        } catch (RemoteException ex) {
            Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //pizzaConfig = gdpc.getAll("PizzaConfig");
        List<PizzaConfig> pizzaConfig = null;

        try {
            pizzaConfig = pizzaConfigDao.searchByName(PizzaConfig.class, name);
        } catch (RemoteException ex) {
            Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (PizzaConfig pizzaConfig1 : pizzaConfig) {
            Long id = pizzaConfig1.getId();
            price.setText(Double.toString(pizzaConfig1.getBaseprice()));
            System.out.println("list of options " + pizzaConfig1.getOptionSets());
            Set<OptionSet> sets = new HashSet<>();
            Set<PizzaOption> opt = new HashSet<>();
            sets = pizzaConfig1.getOptionSets();

            String valueToDisplay = "";
            for (OptionSet set : sets) {
                //Set<PizzaOption> opt = new HashSet<>();
//                List<PizzaOption> pizzaOptions = new ArrayList<>();
//                
//                long optionsetid=set.getOptionSetId();
//                System.out.println(optionsetid);
//                try {
//                    //IOptionSetDao optionSetDao = (IOptionSetProxy) reg.lookup("OptionSetDao");
//                    IPizzaOptionProxy optionSDao = (IPizzaOptionProxy) reg.lookup("PizzaOptionDao");
//                   pizzaOptions = optionSDao.searchByOptionSetId(PizzaOption.class,optionsetid);
//                } catch (RemoteException ex) {
//                    Logger.getLogger(AllPizzeriaUI.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (NotBoundException ex) {
//                    Logger.getLogger(AllPizzeriaUI.class.getName()).log(Level.SEVERE, null, ex);
//                }
                opt = set.getOptions();
                for (PizzaOption pizzaOption : opt) {
                    System.out.println("dfgh" + pizzaOption.getName());
                    valueToDisplay = valueToDisplay + " " + pizzaOption.getName() + ",";

                }

                //listoptions.setText(set.getName());
                // listoptions.setText(set.getName());
            }
            listoptions.setText(valueToDisplay);
            //int setlen = ;

            //for (int i=0;i<=sets.size();i++) {
            //
            //}
            this.pizzaConfig1 = pizzaConfig1;
        }


    }//GEN-LAST:event_pizzanameActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        String name = pizzaname.getSelectedItem().toString();

        IPizzaConfigProxy pizzaConfigDao = null;
        try {
            pizzaConfigDao = (IPizzaConfigProxy) reg.lookup("PizzaConfigDao");
        } catch (RemoteException ex) {
            Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //pizzaConfig = gdpc.getAll("PizzaConfig");
        List<PizzaConfig> pizzaConfig = null;

        try {
            pizzaConfig = pizzaConfigDao.searchByName(PizzaConfig.class, name);
        } catch (RemoteException ex) {
            Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            Double dprice = Double.parseDouble(price.getText());
            String options = listoptions.getText().toString();

            //List<PizzaConfig> lpc = gdpc.searchByName(PizzaConfig.class, name);
            for (PizzaConfig pizzaConfig2 : pizzaConfig) {
                if (yes.isSelected()) {
                    Double delivery = 1000.0;
                    pizzaConfig2.setDelivery(delivery);
                } else {
                    Double delivery = 0.0;
                    pizzaConfig2.setDelivery(delivery);
                }
                pizzaConfig2.setPizzaSize(size.getSelectedItem().toString());

                pizzaConfigDao.update(pizzaConfig2);
                Bill bill = new Bill(pizzaConfig2, options, dprice);
                this.setVisible(false);
                bill.setVisible(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_orderActionPerformed

    private void yesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseClicked

        if (yes.isSelected() && yes.isEnabled()) {
            Double price = Double.parseDouble(this.price.getText()) + 1000;
            this.pizzaConfig1.setBaseprice(price);
            no.setEnabled(false);

            this.price.setText(Double.toString(this.pizzaConfig1.getBaseprice()));
            System.out.println("base price is" + this.pizzaConfig1.getBaseprice());
            yes.setEnabled(false);
        }
        return;


    }//GEN-LAST:event_yesMouseClicked

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked

        if (no.isSelected()) {
            Double price = Double.parseDouble(this.price.getText());
            this.pizzaConfig1.setBaseprice(price);

            this.price.setText(Double.toString(this.pizzaConfig1.getBaseprice()));
            System.out.println("base price is" + this.pizzaConfig1.getBaseprice());
        }
    }//GEN-LAST:event_noMouseClicked

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
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new OrderUI().setVisible(true);
                    } catch (NotBoundException ex) {
                        Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (RemoteException ex) {
                    Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField listoptions;
    private javax.swing.JRadioButton no;
    private javax.swing.JButton order;
    private javax.swing.JComboBox<String> pizzaname;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> size;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}
