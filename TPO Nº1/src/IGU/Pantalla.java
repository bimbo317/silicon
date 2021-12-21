/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bimbo
 */
public class Pantalla extends javax.swing.JFrame {    
    //creo e inicializo en 0 la variable indice
    int indice = 0;
    //Defino los vectores que voy a usar
    long vectorDni[] = new long[10];
    String vectorNombre[] = new String[10];
    String vectorApellido[] = new String[10];
    String vectorDireccion[] = new String[10];
    long vectorTelefono[] = new long[10];
    LocalDate vectorFecha[] = new LocalDate[10];
 
    public Pantalla() {
        initComponents();
        //cargo el textField con el valor del indice
        txt_indice.setText(String.valueOf(indice));
        //pongo el foco en el el boton derecho
        btnDerecha.requestFocus();
        cargarDatos();
        //Agrego un mensaje de ayuda a cada campo
        txtDni.setToolTipText("Ingrese DNI sin puntos");
        txtNombre.setToolTipText("Ingrese Nombres");
        txtApellido.setToolTipText("Ingrese Apellidos");
        txtDireccion.setToolTipText("Ingrese Dirección completa");
        txtTelefono.setToolTipText("Ingrese Teléfono sin espacios ni guiones");
        txtFechaNac.setToolTipText("Ingrese Fecha (dd/MM/aaaa) con las barras");
        btnDerecha.setToolTipText("Siguiente");
        btnIzquierda.setToolTipText("Anterior");
        btnGrabar.setToolTipText("Guarda datos cargados");
    }
//el método cargar buscará los datos de cada vector (teniendo en cuenta el valor actual del indice) y los pondrá en el campo que corresponda
    private void cargarDatos() {

    /*compruebo si no hay algo cargado en la posicion del indice, si no tiene cargado nada cargo dejo el campo vacio, 
    sino cargo el valor guardado en el vector*/
        if (this.vectorDni[indice] == 0) {
            txtDni.setText("");
        } else {
            txtDni.setText(String.valueOf((long) vectorDni[indice]));
        }
        if (vectorNombre[indice] == null) {
            txtNombre.setText("");
        } else {
            txtNombre.setText(vectorNombre[indice]);
        }
        if (vectorApellido[indice] == null) {
            txtApellido.setText("");
        } else {
            txtApellido.setText(vectorApellido[indice]);
        }
        if (vectorDireccion[indice] == null) {
            txtDireccion.setText("");
        } else {
            txtDireccion.setText(vectorDireccion[indice]);
        }
        if (vectorTelefono[indice] == 0) {
            txtTelefono.setText("");
        } else {
            txtTelefono.setText(Long.toString((long) vectorTelefono[indice]));
        }
        if (vectorFecha[indice] == null) {
            txtFechaNac.setText("");
        } else {
            txtFechaNac.setText(vectorFecha[indice].format(DateTimeFormatter.ofPattern("d/M/yyyy")));
        }
    }

    private void guardarDatos() {
        System.out.println("------- Guardar Indice: " + indice + " -------");
        /*Compruebo cada campo para ver si se puede guardar en sus respectivos vectores
        si el campo se encuentra vacio no se guarda y muestra un mensaje en la consola*/
        if (txtDni.getText().equals("")) {
            System.out.println("Campo DNI vacío, no se guarda");
        } else {
            //se agrega el bloque "try catch" para evitar que de error si el usuario ingresa un caracter no válido en el campo 
            try {
                vectorDni[indice] = Long.parseLong(txtDni.getText());
            } catch (NumberFormatException e) {
                System.out.println("Campo DNI vacío, no se guarda");
            }
        }
        if (txtNombre.getText().equals("")) {
            System.out.println("Campo Nombre vacío, no se guarda");
        } else {
            vectorNombre[indice] = txtNombre.getText();
        }
        if (txtApellido.getText().equals("")) {
            System.out.println("Campo Apellido vacío, no se guarda");
        } else {
            vectorApellido[indice] = txtApellido.getText();
        }
        if (txtDireccion.getText().equals("")) {
            System.out.println("Campo Dirección vacío, no se guarda");
        } else {
            vectorDireccion[indice] = txtDireccion.getText();
        }
        if (txtTelefono.getText().equals("")) {
            System.out.println("Campo Teléfono vacío, no se guarda");
        } else {
             //se agrega el bloque "try catch" para evitar que de error si el usuario ingresa un caracter no válido 
            try {
                vectorTelefono[indice] = Long.parseLong(txtTelefono.getText());
            } catch (NumberFormatException e) {
                System.out.println("Número de Teléfono NO válido");
            }
        }
        if (txtFechaNac.getText().equals("")) {
            System.out.println("Campo Fecha Nacimiento vacío, no se guarda");
        } else {
             //se agrega el bloque "try catch" para evitar que de error si el usuario ingresa una fecha no válida 
            try {
                vectorFecha[indice] = LocalDate.parse(txtFechaNac.getText(), DateTimeFormatter.ofPattern("d/M/yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Fecha NO válida");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnIzquierda = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_indice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda Electrónica");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Agenda Electrónica");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre   :");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("DNI          :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Apelllido  :");

        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Dirección :");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Teléfono  :");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("F. Nac      :");

        txtFechaNac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaNacFocusLost(evt);
            }
        });

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });

        btnIzquierda.setText("<<");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        btnDerecha.setText(">>");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jLabel8.setText("Índice:");

        txt_indice.setEditable(false);
        txt_indice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaNac))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefono))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btnIzquierda)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_indice)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addGap(123, 123, 123)
                        .addComponent(btnDerecha)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzquierda)
                    .addComponent(btnDerecha)
                    .addComponent(btnGrabar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        // incrementa el indice hasta 9 y llama a la funcion cargarDatos
        if (indice < 9) {
            indice++;
            cargarDatos();
            txt_indice.setText(String.valueOf(indice));
        }
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        // Disminye el indice hasta 0 y llama a la funcion cargarDatos
        if (0 < indice) {
            indice--;
            cargarDatos();
            txt_indice.setText(String.valueOf(indice));
        }
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // llama a la funcion guardarDatos
        guardarDatos();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtFechaNacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaNacFocusLost
        //Despues de que el cursor se quita de este campo se verifica que lo que ingresó el usuario sea una fecha válida, sino muestra mensaje
        if (!txtFechaNac.getText().equals("")) {
            try {
                LocalDate aux=LocalDate.parse(txtFechaNac.getText(), DateTimeFormatter.ofPattern("d/M/yyyy"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fecha no válida, lo actual no sera guardado\nFormato fecha dd/MM/aaaa (colocar las barras)", "Error en fecha", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtFechaNacFocusLost

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        // Despues de que el cursor se quita de este campo se verifica que lo que ingresó el usuario sea un número válido, sino muestra mensaje
        if (!txtDni.getText().equals("")) {
            try {
                long aux=Long.parseLong(txtDni.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "DNI no válido, lo actual no sera guardado\nIngrese número sin espacios ni puntos", "Error en DNI", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtDniFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        // Despues de que el cursor se quita de este campo se verifica que lo que ingresó el usuario sea un número válido, sino muestra mensaje
        if(!txtTelefono.getText().equals("")){
            try {
                Long.parseLong(txtTelefono.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Teléfono no válido, el actual no sera guardado\nIngrese numero sin espacios ni simbolos", "Error en Teléfono", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_indice;
    // End of variables declaration//GEN-END:variables
}
