package prabhat.currency.converter;


public class CurrencyConverter extends javax.swing.JFrame {

    public CurrencyConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        choiceFrom = new javax.swing.JComboBox();
        choiceTo = new javax.swing.JComboBox();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText("         Prabhat's Currency Converter");
        title.setVerifyInputWhenFocusTarget(false);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter Amount ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Convert From");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Convert To");

        input.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        choiceFrom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        choiceFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY", "BTC" }));
        choiceFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceFromItemStateChanged(evt);
            }
        });

        choiceTo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        choiceTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY", "BTC" }));
        choiceTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceToItemStateChanged(evt);
            }
        });

        output.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input)
                                    .addComponent(choiceFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choiceTo, 0, 231, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(title)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Double total;
		Double amount= Double.parseDouble(input.getText());
		
        //CONVERSION FROM USD to
        //if USD is converted to
        switch (choiceFrom.getSelectedItem().toString()) {
            case "USD":
                //INR
                switch (choiceTo.getSelectedItem().toString()) {
                    case "INR":
                        total=amount*83.118177;
                        output.setText(input.getText()+" USD = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.94597;
                        output.setText(input.getText()+" USD = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*1.371173;
                        output.setText(input.getText()+" USD = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*149.9529;
                        output.setText(input.getText()+" USD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*7.312;
                        output.setText(input.getText()+" USD = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000034751;
                        output.setText(input.getText()+" USD = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" USD = "+total+" USD");
                        break;
                }
                break;
            
            case "INR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.01203;
                        output.setText(input.getText()+" INR = "+total+" USD");
                        break;
                    case "EUR":
                        total=amount*0.011;
                        output.setText(input.getText()+" INR = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.01649;
                        output.setText(input.getText()+" INR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*1.80;
                        output.setText(input.getText()+" INR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*0.088116;
                        output.setText(input.getText()+" INR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.00000041;
                        output.setText(input.getText()+" INR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" INR = "+total+" INR");
                        break;
                }
                break;
            case "EUR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*1.05759;
                        output.setText(input.getText()+" EUR = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*88.107301;
                        output.setText(input.getText()+" EUR = "+total+" INR");
                        break;
                    case "CAD":
                        total=amount*1.451493;
                        output.setText(input.getText()+" EUR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*158.91;
                        output.setText(input.getText()+" EUR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*7.75094;
                        output.setText(input.getText()+" EUR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.00003581;
                        output.setText(input.getText()+" EUR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" EUR = "+total+" EUR");
                        break;
                }
                break;
            case "CAD":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.728412;
                        output.setText(input.getText()+" CAD = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*60.92;
                        output.setText(input.getText()+" CAD = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.687293;
                        output.setText(input.getText()+" CAD = "+total+" EUR");
                        break;
                    case "JPY":
                        total=amount*109.35900;
                        output.setText(input.getText()+" CAD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*5.33;
                        output.setText(input.getText()+" CAD = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000024721;
                        output.setText(input.getText()+" CAD = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" CAD = "+total+" CAD");
                        break;
                }
                break;
            case "JPY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.006674;
                        output.setText(input.getText()+" JPY = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*0.555605;
                        output.setText(input.getText()+" JPY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.0063;
                        output.setText(input.getText()+" JPY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.009142;
                        output.setText(input.getText()+" JPY = "+total+" CAD");
                        break;
                    case "CNY":
                        total=amount*0.048828;
                        output.setText(input.getText()+" JPY = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000000225444584;
                        output.setText(input.getText()+" JPY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" JPY = "+total+" JPY");
                        break;
                }
                break;
            case "CNY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.136666;
                        output.setText(input.getText()+" CNY = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*11.37793;
                        output.setText(input.getText()+" CNY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.128951;
                        output.setText(input.getText()+" CNY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.187622;
                        output.setText(input.getText()+" CNY = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*20.48011547;
                        output.setText(input.getText()+" CNY = "+total+" JPY");
                        break;
                    case "BTC":
                        total=amount*0.000004617;
                        output.setText(input.getText()+" CNY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" CNY = "+total+" CNY");
                        break;
                }
                break;
            case "BTC":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*29591.935203;
                        output.setText(input.getText()+" BTC = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*2461762.85124;
                        output.setText(input.getText()+" BTC = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*27909.449565;
                        output.setText(input.getText()+" BTC = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*40599.600332;
                        output.setText(input.getText()+" BTC = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*4430263.07397622;
                        output.setText(input.getText()+" BTC = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*216395.58785;
                        output.setText(input.getText()+" BTC = "+total+" CNY");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" BTC = "+total+" BTC");
                        break;
                }
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void choiceFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceFromItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceFromItemStateChanged

    private void choiceToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceToItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceToItemStateChanged

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox choiceFrom;
    private javax.swing.JComboBox choiceTo;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel output;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
