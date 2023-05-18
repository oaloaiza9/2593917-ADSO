package Principal;

import java.awt.Toolkit;
import javax.swing.*;

public class Menu extends JFrame {
    
    Persona listaPersonas [];
    int indexPersona;
    
    public Menu() {
        this.listaPersonas = new Persona [100];
        this.indexPersona = 0;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqMenu = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 51, 51));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        contentMenu.setBackground(new java.awt.Color(0, 0, 102));

        etqMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etqMenu.setForeground(new java.awt.Color(255, 255, 255));
        etqMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenu.setText("Menú");

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contentPrincipal.setBackground(new java.awt.Color(153, 153, 255));

        btnCrearUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnCrearUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.setFocusable(false);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.setFocusable(false);
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.setFocusable(false);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuarios.setBackground(new java.awt.Color(0, 0, 153));
        btnListarUsuarios.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListarUsuarios.setText("Listar Usuarios");
        btnListarUsuarios.setFocusable(false);
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
       setVisible(false);
       
       //ListarUsuarios ventana = new ListarUsuarios(this);
       //ventana.setVisible(true);
       
        Persona listaClientes [] = new Persona[10];
        Persona listaVendedores [] = new Persona[10];
        Productos arrayProductos [] = new Productos[10];

        listaClientes[0] = new Persona("108800", "Oscar Loaiza", "Calle 20", "", "", "");
        listaClientes[1] = new Persona("108801", "Daniel Garcia", "Calle 19", "", "", "");
        listaClientes[2] = new Persona("108802", "Juan Lopez", "Calle 18", "", "", "");
        listaClientes[3] = new Persona("108803", "Catalina Mendez", "Calle 17", "", "", "");
        listaClientes[4] = new Persona("108804", "Andres Lopez", "Calle 16", "", "", "");

        listaVendedores[0] = new Persona("108800", "Oscar Loaiza", "", "", "", "");

        arrayProductos[0] = new Productos("7121100001", "Arroz", 2000);
        arrayProductos[1] = new Productos("7700304607808", "Aceite", 2000);
        arrayProductos[2] = new Productos("7909189205998", "Atun", 2000);
        arrayProductos[3] = new Productos("7700304670574", "Frijoles", 2000);
        
        Factura factura = new Factura(listaClientes, listaVendedores,arrayProductos);
       
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        setVisible(false);
        
        CrearUsuario ventana = new CrearUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        EliminarUsuario ventana = new EliminarUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
        
        
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnListarUsuarios;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqMenu;
    // End of variables declaration//GEN-END:variables
}
