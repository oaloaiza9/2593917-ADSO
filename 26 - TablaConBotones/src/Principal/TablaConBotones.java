package Principal;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class TablaConBotones extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    Persona listadoPersonas [];
    
    public TablaConBotones() {
        listadoPersonas = new Persona[10];
        listadoPersonas[0] = new Persona("108800", "Oscar", "Loaiza", "3333330", "Caller 20", "oscar@mail.com");
        listadoPersonas[1] = new Persona("108801", "Juan", "Lopez", "3333331", "Caller 21", "juan@mail.com");
        listadoPersonas[2] = new Persona("108802", "Andres", "Peña", "3333332", "Caller 22", "andres@mail.com");
        listadoPersonas[3] = new Persona("108803", "Carlos", "Rincon", "3333333", "Caller 23", "carlos@mail.com");
        listadoPersonas[4] = new Persona("108804", "Ana", "Guzman", "3333334", "Caller 24", "ana@mail.com");
        listadoPersonas[5] = new Persona("108805", "Daniel", "Perez", "3333335", "Caller 25", "daniel@mail.com");
        listadoPersonas[6] = new Persona("108806", "Francisco", "Soto", "3333336", "Caller 26", "francisco@mail.com");
        listadoPersonas[7] = new Persona("108807", "Julian", "Escobar", "3333337", "Caller 27", "julian@mail.com");
        listadoPersonas[8] = new Persona("108808", "Carolina", "Gomez", "3333338", "Caller 28", "carolina@mail.com");
        listadoPersonas[9] = new Persona("108809", "Alejandra", "Nuñez", "3333339", "Caller 29", "alejandra@mail.com");
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        // Renderizar los Botones en la tabla, se debe indicar el nombre exacto de la columna donde se ubican los botones
        // Para este caso en el modelo se definio la columna OPCION.
        tableModel =  (DefaultTableModel) this.tablaPersonas.getModel();
        this.tablaPersonas.getColumn("OPCION").setCellRenderer(new ButtonRenderer());
        this.tablaPersonas.getColumn("OPCION").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        // Llenar la tabla con los datos del arreglo
        llenarTabla();
        
        //setSize( Toolkit.getDefaultToolkit().getScreenSize() );
        //setExtendedState(JFrame.MAXIMIZED_BOTH );
        setSize( 500, 400 );
        setVisible(true);
    }
    
     public void llenarTabla(){
        tableModel.setNumRows(0);
        for (int i=0; i<listadoPersonas.length; i++) {
            String cedula = listadoPersonas[i].getCedula();
            String nombres = listadoPersonas[i].getNombres();
            String apellidos = listadoPersonas[i].getApellidos();
            String telefono = listadoPersonas[i].getTelefono();
            String direccion = listadoPersonas[i].getDireccion();
            String email = listadoPersonas[i].getEmail();
            JButton btnAccion = new JButton("Ver");
            
            final int posicion = i;
            btnAccion.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickBoton( listadoPersonas[posicion] );
                }
            });
            
            Object[] temporal = new Object[]{ cedula, nombres, apellidos, telefono, direccion, email, btnAccion };
            tableModel.addRow(temporal);
        }
    }
     
    public void accionClickBoton(Persona temp){
        System.out.println("\n\n----------------------------------------");
        System.out.println("     Cedula: "+temp.getCedula());
        System.out.println("     Nombres: "+temp.getNombres());
        System.out.println("     Apellidos: "+temp.getApellidos());
        System.out.println("     Telefono: "+temp.getTelefono());
        System.out.println("     Direccion: "+temp.getDireccion());
        System.out.println("     Email: "+temp.getEmail());
        System.out.println("----------------------------------------");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTA DE PERSONAS");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("TABLA");

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "TELEFONO", "DIRECCION", "EMAIL", "OPCION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                        .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
