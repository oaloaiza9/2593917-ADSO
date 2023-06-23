package Principal;

import Clases.DataBase;
import ModuloUsuarios.CrearUsuario;
import ModuloUsuarios.ListarUsuarios;
import ModuloUsuarios.ModificarUsuario;
import Clases.Persona;
import Clases.Producto;
import ModuloFacturas.CrearFactura;
import ModuloProductos.CrearProducto;
import ModuloProductos.ListarProductos;
import ModuloProductos.ModificarProductos;
import ModuloUsuarios.EliminarUsuario;
import java.awt.Toolkit;
import javax.swing.*;

public class Menu extends JFrame {
    
    public DataBase database;
    public Producto listaProductos [];
    public int indexClientes;
    public int indexVendedores;
    
    public Menu() {
        this.database = new DataBase();
        
        this.listaProductos = new Producto [100];
        this.indexClientes = 5;
        this.indexVendedores = 5;
        
        this.listaProductos[0] = new Producto(1010, "Leche", 3500);
        this.listaProductos[1] = new Producto(1011, "Arroz Lb", 2500);
        this.listaProductos[2] = new Producto(1012, "Arroz Kg", 4800);
        this.listaProductos[3] = new Producto(1013, "Detergente Lb", 4400);
        this.listaProductos[4] = new Producto(1014, "Detergente Kg", 8000);
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqMenu = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        etiquetaCliente = new javax.swing.JLabel();
        contentClientes = new javax.swing.JPanel();
        btnCrearCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        etiquetaVendedores = new javax.swing.JLabel();
        contentVendedores = new javax.swing.JPanel();
        btnCrearVendedor = new javax.swing.JButton();
        btnModificarVendedor = new javax.swing.JButton();
        btnEliminarVendedor = new javax.swing.JButton();
        btnListarVendedores = new javax.swing.JButton();
        etiquetaProductos = new javax.swing.JLabel();
        contentProductos = new javax.swing.JPanel();
        btnCrearProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnListarProductos = new javax.swing.JButton();
        etiquetaFactura = new javax.swing.JLabel();
        contentFacturas = new javax.swing.JPanel();
        btnCrearFactura = new javax.swing.JButton();
        btnModificarFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
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
            .addComponent(etqMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaCliente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaCliente.setText("CLIENTES");
        etiquetaCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contentClientes.setBackground(new java.awt.Color(255, 255, 255));
        contentClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearCliente.setBackground(new java.awt.Color(0, 0, 153));
        btnCrearCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCliente.setText("Crear");
        btnCrearCliente.setFocusable(false);
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente.setText("Modificar");
        btnModificarCliente.setFocusable(false);
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setFocusable(false);
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnListarClientes.setBackground(new java.awt.Color(0, 0, 153));
        btnListarClientes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnListarClientes.setText("Listar");
        btnListarClientes.setFocusable(false);
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentClientesLayout = new javax.swing.GroupLayout(contentClientes);
        contentClientes.setLayout(contentClientesLayout);
        contentClientesLayout.setHorizontalGroup(
            contentClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentClientesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        contentClientesLayout.setVerticalGroup(
            contentClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentClientesLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etiquetaVendedores.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaVendedores.setText("VENDEDORES");
        etiquetaVendedores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contentVendedores.setBackground(new java.awt.Color(255, 255, 255));
        contentVendedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearVendedor.setBackground(new java.awt.Color(0, 0, 153));
        btnCrearVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearVendedor.setText("Crear");
        btnCrearVendedor.setFocusable(false);
        btnCrearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVendedorActionPerformed(evt);
            }
        });

        btnModificarVendedor.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarVendedor.setText("Modificar");
        btnModificarVendedor.setFocusable(false);
        btnModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVendedorActionPerformed(evt);
            }
        });

        btnEliminarVendedor.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarVendedor.setText("Eliminar");
        btnEliminarVendedor.setFocusable(false);
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        btnListarVendedores.setBackground(new java.awt.Color(0, 0, 153));
        btnListarVendedores.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarVendedores.setForeground(new java.awt.Color(255, 255, 255));
        btnListarVendedores.setText("Listar");
        btnListarVendedores.setFocusable(false);
        btnListarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentVendedoresLayout = new javax.swing.GroupLayout(contentVendedores);
        contentVendedores.setLayout(contentVendedoresLayout);
        contentVendedoresLayout.setHorizontalGroup(
            contentVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentVendedoresLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        contentVendedoresLayout.setVerticalGroup(
            contentVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentVendedoresLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etiquetaProductos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaProductos.setText("PRODUCTOS");
        etiquetaProductos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contentProductos.setBackground(new java.awt.Color(255, 255, 255));
        contentProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearProducto.setBackground(new java.awt.Color(0, 0, 153));
        btnCrearProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearProducto.setText("Crear");
        btnCrearProducto.setFocusable(false);
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProducto.setText("Modificar");
        btnModificarProducto.setFocusable(false);
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.setFocusable(false);

        btnListarProductos.setBackground(new java.awt.Color(0, 0, 153));
        btnListarProductos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarProductos.setText("Listar");
        btnListarProductos.setFocusable(false);
        btnListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentProductosLayout = new javax.swing.GroupLayout(contentProductos);
        contentProductos.setLayout(contentProductosLayout);
        contentProductosLayout.setHorizontalGroup(
            contentProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentProductosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        contentProductosLayout.setVerticalGroup(
            contentProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentProductosLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etiquetaFactura.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaFactura.setText("FACTURAS");
        etiquetaFactura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contentFacturas.setBackground(new java.awt.Color(255, 255, 255));
        contentFacturas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearFactura.setBackground(new java.awt.Color(0, 0, 153));
        btnCrearFactura.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearFactura.setText("Crear");
        btnCrearFactura.setFocusable(false);
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });

        btnModificarFactura.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarFactura.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarFactura.setText("LISTAR");
        btnModificarFactura.setFocusable(false);
        btnModificarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentFacturasLayout = new javax.swing.GroupLayout(contentFacturas);
        contentFacturas.setLayout(contentFacturasLayout);
        contentFacturasLayout.setHorizontalGroup(
            contentFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentFacturasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contentFacturasLayout.setVerticalGroup(
            contentFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentFacturasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(contentFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(contentFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etiquetaProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etiquetaVendedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etiquetaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(etiquetaFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        setVisible(false);
        ListarUsuarios ventana = new ListarUsuarios(this, "CLIENTES");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        setVisible(false);
        
        CrearUsuario ventana = new CrearUsuario(this, "CLIENTE");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(this, "CLIENTES");
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnCrearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVendedorActionPerformed
        setVisible(false);
        
        CrearUsuario ventana = new CrearUsuario(this, "VENDEDOR");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearVendedorActionPerformed

    private void btnModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVendedorActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(this, "VENDEDOR");
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnModificarVendedorActionPerformed

    private void btnListarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendedoresActionPerformed
        setVisible(false);
        ListarUsuarios ventana = new ListarUsuarios(this, "VENDEDORES");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarVendedoresActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        setVisible(false);
        
        CrearProducto ventana = new CrearProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        setVisible(false);
        
        ModificarProductos ventana = new ModificarProductos(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProductosActionPerformed
        setVisible(false);
        
        ListarProductos ventana = new ListarProductos(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarProductosActionPerformed

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        setVisible(false);
        
        CrearFactura ventana = new CrearFactura(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearFacturaActionPerformed

    private void btnModificarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarFacturaActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        setVisible(false);
        
        EliminarUsuario ventana = new EliminarUsuario(this, "CLIENTES");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed
        setVisible(false);
        
        EliminarUsuario ventana = new EliminarUsuario(this, "VENDEDORES");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
    }
    
    public void alertCreacionUsuario(){
        Alert alerta = new Alert("CORRECTO", "Se ha creado un nuevo usuario.", "success");
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnCrearVendedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarVendedor;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnListarProductos;
    private javax.swing.JButton btnListarVendedores;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarFactura;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarVendedor;
    private javax.swing.JPanel contentClientes;
    private javax.swing.JPanel contentFacturas;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JPanel contentProductos;
    private javax.swing.JPanel contentVendedores;
    private javax.swing.JLabel etiquetaCliente;
    private javax.swing.JLabel etiquetaFactura;
    private javax.swing.JLabel etiquetaProductos;
    private javax.swing.JLabel etiquetaVendedores;
    private javax.swing.JLabel etqMenu;
    // End of variables declaration//GEN-END:variables
}
