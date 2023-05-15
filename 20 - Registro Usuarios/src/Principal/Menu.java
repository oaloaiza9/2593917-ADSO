package Principal;

import javax.swing.*;

public class Menu extends JFrame {
    
    public Menu() {
        initComponents();
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

        btnModificarUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.setFocusable(false);

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.setFocusable(false);

        btnListarUsuarios.setBackground(new java.awt.Color(0, 0, 153));
        btnListarUsuarios.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListarUsuarios.setText("Listar Usuarios");
        btnListarUsuarios.setFocusable(false);

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
