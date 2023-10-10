package principal;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Persona;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class InterfazCrud extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    
    public InterfazCrud() {
        initComponents();
        initAlternComponents();
        
        cargarPersonas();
    }
    
    public void initAlternComponents(){
        setTitle("CRUD - Consumo API en PHP");
        setLocationRelativeTo(null);
        setIconImage( Toolkit.getDefaultToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_api.png") ) );
        
        btnNueva.setBackground(Color.white);
        tableModel =  (DefaultTableModel) this.tablaPersonas.getModel();
        
        // Render btn editar
        this.tablaPersonas.getColumn("EDT").setCellRenderer(new ButtonRenderer());
        this.tablaPersonas.getColumn("EDT").setCellEditor(new ButtonEditor(new JCheckBox()));
        // Render btn eliminar
        this.tablaPersonas.getColumn("DEL").setCellRenderer(new ButtonRenderer());
        this.tablaPersonas.getColumn("DEL").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        this.tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(100);
        this.tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(200);
        this.tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(200);
        this.tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(400);
        this.tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(30);
        this.tablaPersonas.getColumnModel().getColumn(5).setPreferredWidth(30);
        
        this.tablaPersonas.getColumnModel().getColumn(0).setResizable(false);
        this.tablaPersonas.getColumnModel().getColumn(1).setResizable(false);
        this.tablaPersonas.getColumnModel().getColumn(2).setResizable(false);
        this.tablaPersonas.getColumnModel().getColumn(3).setResizable(false);
        this.tablaPersonas.getColumnModel().getColumn(4).setResizable(false);
        this.tablaPersonas.getColumnModel().getColumn(5).setResizable(false);
        
        this.tablaPersonas.getTableHeader().setReorderingAllowed(false);
        this.tablaPersonas.setRowHeight(30);
        
        setVisible(true);
    }
    
    public void cargarPersonas(){
        String respuesta = ConsumoAPI.consumoGET("http://localhost/02-APIenPHP/Obtener.php");
        
        JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray arrayJson = objetoJson.get("registros").getAsJsonArray();
        
        tableModel.setNumRows(0);
        for (int i=0; i<arrayJson.size(); i++) {
            JsonObject temp = arrayJson.get(i).getAsJsonObject();
            Gson gson = new Gson();
            Persona persona = gson.fromJson( arrayJson.get(i).getAsJsonObject() , Persona.class);
            
            String cedula = temp.get("cedula").getAsString();
            String nombres = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();
            String email = temp.get("email").getAsString();
            
            JButton btnEditar = new JButton();
            Image icono_edit = Toolkit.getDefaultToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_editar.png") );
            icono_edit = icono_edit.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEditar.setIcon( new ImageIcon(icono_edit) );
            btnEditar.setFocusable(false);
            btnEditar.setBackground(Color.white);
            btnEditar.setBorder(null);
            
            JButton btnEliminar = new JButton();
            Image icono_eliminar = Toolkit.getDefaultToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_eliminar.png") );
            icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEliminar.setIcon( new ImageIcon(icono_eliminar) );
            btnEliminar.setFocusable(false);
            btnEliminar.setBackground(Color.white);
            btnEliminar.setBorder(null);
            
            btnEditar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickEditar(persona);
                }
            });
            btnEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickEliminar(persona);
                }
            });

            Object[] temporal = new Object[]{ cedula, nombres, apellidos, email, btnEditar, btnEliminar };
            tableModel.addRow(temporal);
        }
        
    }

    public void accionClickEditar(Persona persona){
        UpdatePerson ventana = new UpdatePerson(this, persona);
    }
    
    public void accionClickEliminar(Persona persona){
        DeletePersona ventana = new DeletePersona(this, persona);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        btnNueva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("CONSUMO API");

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "EMAIL", "EDT", "DEL"
            }
        ));
        jScrollPane.setViewportView(tablaPersonas);

        btnNueva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNueva.setText("NUEVA");
        btnNueva.setFocusable(false);
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNueva))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNueva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        CreatePerson ventana = new CreatePerson(this);
    }//GEN-LAST:event_btnNuevaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNueva;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
