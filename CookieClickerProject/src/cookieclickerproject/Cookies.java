/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookieclickerproject;

/**
 *
 * @author esegal8
 */
public class Cookies extends javax.swing.JFrame {

    /**
     * Creates new form Cookies
     */
    private boolean isBuying=true;
    private String buyOrSell="";
    private static boolean firstTime = true;
    private static CookieGame pie;

    private int totalCookiesTest=0;

    public Cookies(CookieGame pie) {
        this.pie = pie;
        initComponents();
        this.main();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        label1 = new java.awt.Label();
        cookie = new javax.swing.JButton();
        BuyOrSellToggle = new javax.swing.JToggleButton();
        bakeryName = new javax.swing.JLabel();
        Buildings = new javax.swing.JLabel();
        Toggle1 = new javax.swing.JToggleButton();
        Toggle10 = new javax.swing.JToggleButton();
        Toggle25 = new javax.swing.JToggleButton();
        CookieLoop = new javax.swing.JButton();
        cookieTree = new javax.swing.JButton();
        hashCookie = new javax.swing.JButton();
        cookieDatabase = new javax.swing.JButton();
        cookie3DPrinter = new javax.swing.JButton();
        polymorphicRecursiveCookieLoops = new javax.swing.JButton();
        GODCOOKIE = new javax.swing.JButton();
        jlabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton2.setText("Sell");
        jToggleButton2.setToolTipText("");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cookie.setText("Cookie");
        cookie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cookieMouseClicked(evt);
            }
        });
        cookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieActionPerformed(evt);
            }
        });

        BuyOrSellToggle.setText("Buy/Sell");
        BuyOrSellToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyOrSellToggleActionPerformed(evt);
            }
        });

        bakeryName.setText("(づ｡◕‿‿◕｡)づ "+pie.getBakeryName()+"'s Bakery");

        Buildings.setText("Buildings");

        Toggle1.setText("1");
        Toggle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toggle1ActionPerformed(evt);
            }
        });

        Toggle10.setText("10");
        Toggle10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toggle10ActionPerformed(evt);
            }
        });

        Toggle25.setText("25");
        Toggle25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toggle25ActionPerformed(evt);
            }
        });

        CookieLoop.setText("Cookie Loop");
        CookieLoop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CookieLoopMouseClicked(evt);
            }
        });
        CookieLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CookieLoopActionPerformed(evt);
            }
        });

        cookieTree.setText("Cookie Tree");
        cookieTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieTreeActionPerformed(evt);
            }
        });

        hashCookie.setText("Hash-Cookie");
        hashCookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashCookieActionPerformed(evt);
            }
        });

        cookieDatabase.setText("Cookie Database");
        cookieDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieDatabaseActionPerformed(evt);
            }
        });

        cookie3DPrinter.setText("Cookie 3D Printer");
        cookie3DPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookie3DPrinterActionPerformed(evt);
            }
        });

        polymorphicRecursiveCookieLoops.setText("Polymorphic Recursive Cookie Loops");
        polymorphicRecursiveCookieLoops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polymorphicRecursiveCookieLoopsActionPerformed(evt);
            }
        });

        GODCOOKIE.setText("GOD COOKIE");
        GODCOOKIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GODCOOKIEActionPerformed(evt);
            }
        });

        jlabel3.setText(""+buyOrSell);

        jLabel1.setText(""+totalCookiesTest);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cookie, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakeryName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(Buildings, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Toggle1)
                                    .addComponent(Toggle10)
                                    .addComponent(Toggle25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cookieTree)
                                    .addComponent(hashCookie)
                                    .addComponent(cookieDatabase)
                                    .addComponent(cookie3DPrinter)
                                    .addComponent(polymorphicRecursiveCookieLoops)
                                    .addComponent(GODCOOKIE)
                                    .addComponent(CookieLoop)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BuyOrSellToggle)
                                .addGap(45, 45, 45)
                                .addComponent(jlabel3)))
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Buildings, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(bakeryName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BuyOrSellToggle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Toggle1)
                                    .addComponent(CookieLoop))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cookie, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Toggle10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Toggle25))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jlabel3)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cookieTree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(hashCookie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cookieDatabase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cookie3DPrinter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(polymorphicRecursiveCookieLoops)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GODCOOKIE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuyOrSellToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyOrSellToggleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyOrSellToggleActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void CookieLoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CookieLoopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CookieLoopActionPerformed

    private void Toggle25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toggle25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Toggle25ActionPerformed

    private void cookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieActionPerformed
        
    }//GEN-LAST:event_cookieActionPerformed

    private void cookieTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieTreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookieTreeActionPerformed

    private void hashCookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashCookieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hashCookieActionPerformed

    private void cookieDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookieDatabaseActionPerformed

    private void cookie3DPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookie3DPrinterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookie3DPrinterActionPerformed

    private void polymorphicRecursiveCookieLoopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polymorphicRecursiveCookieLoopsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_polymorphicRecursiveCookieLoopsActionPerformed

    private void GODCOOKIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GODCOOKIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GODCOOKIEActionPerformed

    private void Toggle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toggle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Toggle1ActionPerformed

    private void Toggle10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toggle10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Toggle10ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void cookieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cookieMouseClicked
        int x= totalCookiesTest+100;
        totalCookiesTest=x;
        //jLabel1.setVisible(true);
        jLabel1.setText(""+totalCookiesTest);
    }//GEN-LAST:event_cookieMouseClicked

    private void CookieLoopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CookieLoopMouseClicked
        totalCookiesTest=totalCookiesTest-100;
    }//GEN-LAST:event_CookieLoopMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        if (firstTime){
        java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run() {
                new Cookies(pie).setVisible(true);
            }
        });
                firstTime=false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buildings;
    private javax.swing.JToggleButton BuyOrSellToggle;
    private javax.swing.JButton CookieLoop;
    private javax.swing.JButton GODCOOKIE;
    private javax.swing.JToggleButton Toggle1;
    private javax.swing.JToggleButton Toggle10;
    private javax.swing.JToggleButton Toggle25;
    private javax.swing.JLabel bakeryName;
    private javax.swing.JButton cookie;
    private javax.swing.JButton cookie3DPrinter;
    private javax.swing.JButton cookieDatabase;
    private javax.swing.JButton cookieTree;
    private javax.swing.JButton hashCookie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel jlabel3;
    private java.awt.Label label1;
    private javax.swing.JButton polymorphicRecursiveCookieLoops;
    // End of variables declaration//GEN-END:variables
}
