package principal;

import Clases.Persona;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;

public class CreatePerson extends javax.swing.JFrame {
    
    InterfazCrud principal;
    
    public CreatePerson(InterfazCrud principal) {
        this.principal = principal;
        initComponents();
        initAleternComponent();
    }
    
    public void initAleternComponent(){
        setTitle("CRUD - Consumo API en PHP");
        setLocationRelativeTo(null);
        setIconImage( Toolkit.getDefaultToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_api.png") ) );
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("CREAR PERSONA");

        etqCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqCedula.setText("CEDULA:");

        campoCedula.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqNombres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqNombres.setText("NOMBRES:");

        campoNombres.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqApellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqApellidos.setText("APELLIDOS:");

        campoApellidos.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqTelefono.setText("TELEFONO:");

        campoTelefono.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqDireccion.setText("DIRECCION:");

        campoDireccion.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqEmail.setText("EMAIL:");

        campoEmail.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusable(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(105, 27));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(51, 51, 255));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR");
        btnCrear.setFocusable(false);
        btnCrear.setPreferredSize(new java.awt.Dimension(105, 27));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                            .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                            .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                            .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                            .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        String cedula = campoCedula.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String direccion = campoDireccion.getText();
        String telefono = campoTelefono.getText();
        String email = campoEmail.getText();
        
        if( !nombres.equals("") && !apellidos.equals("") && !direccion.equals("") && !telefono.equals("") && !email.equals("") ){
            Map<String, String> postData = new HashMap<>();
            postData.put("cedula", cedula);
            postData.put("nombres", nombres);
            postData.put("apellidos", apellidos);
            postData.put("telefono", telefono);
            postData.put("direccion", direccion);
            postData.put("email", email);
            String respuesta = ConsumoAPI.consumoPOST("http://localhost/02-APIenPHP/Insert.php", postData);
            System.out.println("respuesta Insert: "+respuesta);
            
            JsonObject objetoJson = JsonParser.parseString( respuesta ).getAsJsonObject();
            if (objetoJson.get("status").getAsBoolean()) {
                this.principal.cargarPersonas();
                dispose();
            }else{
                System.out.println("Error al Insertar");
            }
        }else{
            System.out.println("LOS DATOS NO PUEDEN SER VACIOS");
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
