package eddfarmacias.Interfaz;

import eddfarmacias.EscrLect;
import eddfarmacias.Farmacia;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VictorBack
 */
public class Farmacias extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    public static MultiLista mul = new MultiLista();
    public static NodoLista r = null;

    /**
     * Creates new form Farmacias
     */
    public Farmacias(MultiLista m) {
        mul = m;
        initComponents();
        this.setLocationRelativeTo(null);
        initComponents();
        String[] titulo = new String[]{"Nombre de Farmacia", "NO. Farmacia", "Tipo de Sociedad", "RFC"};
        dtm.setColumnIdentifiers(titulo);
        tblDatos.setModel(dtm);
    }

    //muestra la tabla a forma
    //pone los datos agregados en la atabla
    void agregar() {
        dtm.addRow(new Object[]{
            txtnf.getText(), txtnof.getText(), txtso.getSelectedItem().toString(), txtrfc.getText()
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtrfc = new javax.swing.JTextField();
        txtnof = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnregreso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        btnBuscar.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscar.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");

        btnAgregar.setBackground(new java.awt.Color(51, 51, 255));
        btnAgregar.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de Farmacia");

        jLabel3.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RFC");

        txtrfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrfcActionPerformed(evt);
            }
        });
        txtrfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrfcKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NO. Farmacia");

        jLabel5.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Sociedad");

        txtso.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        txtso.setForeground(new java.awt.Color(255, 255, 255));
        txtso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Opcion", "Sociedad en nombre colectivo", "Sociedad en comandita simple", "Sociedad de responsabilidad limitada", "Sociedad anónima", "Sociedad en comandita por acciones", "Sociedad cooperativa", " " }));
        txtso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoActionPerformed(evt);
            }
        });

        tblDatos.setFont(new java.awt.Font("MS Gothic", 0, 11)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre de Farmacia", "Tipo de Farmacia", "No. Farmacia", "RFC", "Tipo de Sociedad"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        btnregreso.setBackground(new java.awt.Color(51, 51, 255));
        btnregreso.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        btnregreso.setForeground(new java.awt.Color(255, 255, 255));
        btnregreso.setText("Regresar");
        btnregreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresoActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-50.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/output-onlinepngtools (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnf, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnof, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnregreso)
                                    .addComponent(btnAgregar))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(btnBuscar)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnAgregar)
                    .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnregreso)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresoActionPerformed
        Interfaz i = new Interfaz();
        i.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnregresoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String sotxt = (String) txtso.getSelectedItem();
//        String nombre = txtnf.getText();
////       String numero = ;
//        String rfc = txtrfc.getText();
//
//        int l = nombre.length();
//        int r = rfc.length();
//        int c = numero.length();
        int bandera = 1;
        if (!txtnf.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Coloque Nombre a Farmacia");
            bandera = 0;
        }
        if (!txtnof.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Coloque Numero de Farmacia");
            bandera = 0;
        }
        if (!sotxt.equals("Selecciona una Opcion")) {
            JOptionPane.showMessageDialog(this, "Seleccione Tipo de Sociedad");
            bandera = 0;
        }
        if (!txtrfc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Coloque RFC a Farmacia");
            bandera = 0;
        }
        if (bandera == 1) {
            try {
                if (FG() == 1) {
                    txtrfc.setText("");
                    txtnf.setText("");
                    txtnof.setText("");
                    JOptionPane.showMessageDialog(this, "Datos aceptados");
                } else {
                    JOptionPane.showMessageDialog(this, "Error Al Guardar");
                }
            } catch (IOException ex) {
                Logger.getLogger(Farmacia.class.getName()).log(Level.SEVERE, null, ex);
            }
            agregar();

            Ciudades i = new Ciudades(mul);
            // NodoLista r = mul.getR();
            i.setVisible(true);
            this.setVisible(false);

        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtrfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrfcKeyTyped
        if (txtrfc.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtrfcKeyTyped

    private void txtsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoActionPerformed

    private void txtrfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrfcActionPerformed

    private int FG() throws IOException {

        String va = txtrfc.getText().trim();

        if (!valida(va)) {

            eddfarmacias.Farmacia f = new Farmacia();

            f.setNombre(txtnf.getText());
            f.setnFarmacia(txtnof.getText());
            f.setTipoSociedad(txtso.getSelectedItem().toString());
            f.setRfc(txtrfc.getText());

            NodoLista nls = new NodoLista(txtnf.getText(), f);
            String[] etqs = new String[1];
            etqs[0] = txtnf.getText();

            r = mul.inserta(etqs, 0, nls, r);
            mul.setR(r);

            EscrLect a = new EscrLect();
            a.InsertarnuevaLista(r);

            return 1;
        } else {
            JOptionPane.showMessageDialog(this, "Asegure que todos los campos esten llenos");
            return 0;
        }
    }

    public static boolean valida(String rfc) {
        // Expresión regular para validar el RFC
        String regex = "^([A-Z]{4})(\\d{6})([A-Z0-9]{3})$";

        // Crear un objeto de patrón con la expresión regular
        Pattern pattern = Pattern.compile(regex);

        // Crear un objeto de coincidencia para el RFC dado
        Matcher matcher = pattern.matcher(rfc);

        // Verificar si el RFC cumple con el patrón
        if (matcher.matches()) {
            // Obtener los componentes del RFC
            String cadena = matcher.group(1);
            int enteros = Integer.parseInt(matcher.group(2));
            String booleano = matcher.group(3);

            // Realizar más validaciones específicas para cada componente si es necesario
            // Ejemplo: Validar que los enteros estén en el rango adecuado (000000 - 999999)
            if (enteros >= 0 && enteros <= 999999) {
                // Realizar acciones adicionales si se cumple la validación
                System.out.println("RFC válido: " + rfc);
                System.out.println("Cadena: " + cadena);
                System.out.println("Enteros: " + enteros);
                System.out.println("Booleano: " + booleano);
                return true;
            }
        }
        return false;

    }

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
            java.util.logging.Logger.getLogger(Farmacias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmacias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmacias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmacias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmacias(mul).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnregreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtnf;
    private javax.swing.JTextField txtnof;
    private javax.swing.JTextField txtrfc;
    private javax.swing.JComboBox<String> txtso;
    // End of variables declaration//GEN-END:variables
}
