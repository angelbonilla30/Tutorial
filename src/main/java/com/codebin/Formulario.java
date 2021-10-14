
package com.codebin;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }
public void submit(){
         if (term.isSelected()) {
                String data;
                        
             data = "Nombre:  "
                     + tname.getText() + "\n"
                     + "Apellido:  "
                     + tap.getText() + "\n"
                     +"Correo:  "
                     + tdic.getText()+ "\n";
                String data2
                    = "Teléfono: "
                      + tmno.getText() + "\n"
                      + "Producto: " + tpro.getText()+ "\n"
                     + "Cantidad de producto: " + tcant.getText()+ "\n";
                String data3;
             data3= "Correo:  " 
                     + tdic.getText()+ "\n";
                     
                if (efectivo.isSelected())
                    data3 = "Tipo de pago : efectivo"
                            + "\n";
                else
                    data3 = "Tipo de pago : crédito"
                            + "\n";
                txtarea.setText(data + data2 + data3);
                txtarea.setEditable(false);
               
                
                
            }
         
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox3 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tmno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tap = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        tdic = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        consolas = new javax.swing.JRadioButton();
        mandos = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        xbox = new javax.swing.JLabel();
        nintendo = new javax.swing.JLabel();
        game = new javax.swing.JLabel();
        mxbox = new javax.swing.JLabel();
        mplay = new javax.swing.JLabel();
        mnintendo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tcant = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        efectivo = new javax.swing.JRadioButton();
        credito = new javax.swing.JRadioButton();
        tpro = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        w1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        term = new javax.swing.JCheckBox();
        w3 = new javax.swing.JButton();

        jCheckBox3.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jCheckBox3.setText("Video Juegos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE PEDIDO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\bonil\\Downloads\\consola-de-video.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 90, 70));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THE GAME CENTER");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1170, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 70));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        tmno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tmno.setForeground(new java.awt.Color(204, 204, 204));
        tmno.setBorder(null);
        tmno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmnoActionPerformed(evt);
            }
        });
        jPanel1.add(tmno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 300, 30));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 300, 10));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("APELLIDO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        tap.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tap.setForeground(new java.awt.Color(204, 204, 204));
        tap.setBorder(null);
        jPanel1.add(tap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 300, 30));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 300, 10));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("TELÉFONO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        tname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tname.setForeground(new java.awt.Color(204, 204, 204));
        tname.setBorder(null);
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        jPanel1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, 30));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 300, 10));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("DIRECCIÓN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        tdic.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tdic.setForeground(new java.awt.Color(204, 204, 204));
        tdic.setBorder(null);
        tdic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdicActionPerformed(evt);
            }
        });
        jPanel1.add(tdic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 300, 30));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 300, 10));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("PAGO SE REALIZARÁ EN");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 30));

        consolas.setBackground(new java.awt.Color(204, 204, 204));
        consolas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        consolas.setText("Consolas");
        consolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consolasActionPerformed(evt);
            }
        });
        jPanel3.add(consolas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        mandos.setBackground(new java.awt.Color(204, 204, 204));
        mandos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        mandos.setText("Mandos");
        mandos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandosActionPerformed(evt);
            }
        });
        jPanel3.add(mandos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("ARTICULO QUE DESEAS COMPRAR");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        play.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel3.add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 30));

        xbox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel3.add(xbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 230, 30));

        nintendo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel3.add(nintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 180, 30));

        game.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel3.add(game, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 190, 30));

        mxbox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel3.add(mxbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 30));

        mplay.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel3.add(mplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 220, 30));

        mnintendo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel3.add(mnintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 30));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("ARTICULO QUE DISPONIBLES");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        tcant.setBackground(new java.awt.Color(204, 204, 204));
        tcant.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tcant.setBorder(null);
        jPanel3.add(tcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 320, 30));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 320, 20));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("NOMBRE DEL ARTICULO QUE DESEA COMPRAR");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("CANTIDAD DE PRODUCTOS QUE DESEA COMPRAR");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 30));

        efectivo.setBackground(new java.awt.Color(204, 204, 204));
        efectivo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        efectivo.setText("Efectivo");
        efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efectivoActionPerformed(evt);
            }
        });
        jPanel3.add(efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        credito.setBackground(new java.awt.Color(204, 204, 204));
        credito.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        credito.setText("Crédito");
        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });
        jPanel3.add(credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        tpro.setBackground(new java.awt.Color(204, 204, 204));
        tpro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tpro.setBorder(null);
        jPanel3.add(tpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 320, 30));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 320, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 450, 460));

        jButton1.setText("REGISTRAR PEDIDO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 150, -1));

        w1.setText("CANCELAR PEDIDO");
        w1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w1MouseClicked(evt);
            }
        });
        jPanel1.add(w1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 150, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 290, 230));

        term.setBackground(new java.awt.Color(255, 255, 255));
        term.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        term.setText("Acepto terminos y condiciones");
        jPanel1.add(term, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        w3.setText("Enviar pedido");
        w3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w3MouseClicked(evt);
            }
        });
        w3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w3ActionPerformed(evt);
            }
        });
        jPanel1.add(w3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmnoActionPerformed
      
    }//GEN-LAST:event_tmnoActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        
    }//GEN-LAST:event_tnameActionPerformed

    private void tdicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdicActionPerformed
        
    }//GEN-LAST:event_tdicActionPerformed

    private void consolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consolasActionPerformed
        if(consolas.isSelected())
        {
           mandos.setSelected(false);
           
           mxbox.setText("");
           mplay.setText("");
           mnintendo.setText("");
           
           xbox.setText("-XBOX ONE");
           play.setText("-PLAY STATION 5");
           nintendo.setText("-NINTENDO SWITCH");
           game.setText("-GAME BOY COLOR");
        }
        else{
          consolas.setSelected(false);
           xbox.setText("");
           play.setText("");
           nintendo.setText("");
           game.setText("");
        }
        
    }//GEN-LAST:event_consolasActionPerformed

    private void mandosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandosActionPerformed
        if(mandos.isSelected())
        {
           consolas.setSelected(false);
           xbox.setText("");
           play.setText("");
           nintendo.setText("");
           game.setText("");
           
           
           
           mxbox.setText("-MANDO DE XBOX");
           mplay.setText("- MANDO DE PLAY STATION 5");
           mnintendo.setText("-MANDO DE NINTENDO SWITCH");
        }
        else{
          mandos.setSelected(false);
           mxbox.setText("");
           mplay.setText("");
           mnintendo.setText("");
        }
    }//GEN-LAST:event_mandosActionPerformed

    private void w1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w1MouseClicked
         Principal w1= new Principal();
        w1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_w1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       submit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efectivoActionPerformed
        if(efectivo.isSelected())
        {
           credito.setSelected(false);
        }
    }//GEN-LAST:event_efectivoActionPerformed

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
        if(credito.isSelected())
        {
           efectivo.setSelected(false);
        }
    }//GEN-LAST:event_creditoActionPerformed

    private void w3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w3MouseClicked
        Pedido w3= new Pedido();
        w3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_w3MouseClicked

    private void w3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w3ActionPerformed
       
    }//GEN-LAST:event_w3ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton consolas;
    private javax.swing.JRadioButton credito;
    private javax.swing.JRadioButton efectivo;
    private javax.swing.JLabel game;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton mandos;
    private javax.swing.JLabel mnintendo;
    private javax.swing.JLabel mplay;
    private javax.swing.JLabel mxbox;
    private javax.swing.JLabel nintendo;
    private javax.swing.JLabel play;
    private javax.swing.JTextField tap;
    private javax.swing.JTextField tcant;
    private javax.swing.JTextField tdic;
    private javax.swing.JCheckBox term;
    private javax.swing.JTextField tmno;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tpro;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JButton w1;
    private javax.swing.JButton w3;
    private javax.swing.JLabel xbox;
    // End of variables declaration//GEN-END:variables
}
