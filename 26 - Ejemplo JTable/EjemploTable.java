import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class EjemploTable extends JFrame{
    
    private JTable table;
    private DefaultTableModel tableModel;
    
    public EjemploTable(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("JTable Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // ----------------------------------------------------
        // -- INICIO CODIGO PARA TABLA ------------------------
        // ----------------------------------------------------
        // Crear los datos para las columnas
        Object[] columnNames = {"Columna 1", "Columna 2", "Columna 3", "Accion"};

        // Crear el modelo de la tabla
        tableModel = new DefaultTableModel(columnNames, 0);

        // Crear la tabla con el modelo de datos y Render de Objetos como Botones
        table = new JTable(tableModel);
        table.getColumn("Accion").setCellRenderer(new ButtonRenderer());            // Solo si necesitan poner un Boton
        table.getColumn("Accion").setCellEditor(new ButtonEditor(new JCheckBox())); // Solo si necesitan poner un Boton
        
        // Agregar filas de ejemplo con botones
        addNewRow();
        addNewRow();
        addNewRow();
        addNewRow();
        addNewRow();
        addNewRow();
        addNewRow();
        
        // Agregar el JTable en el JFrame
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        
        // ----------------------------------------------------
        // -- FIN CODIGO PARA TABLA ------------------------
        // ----------------------------------------------------
        
        pack();
        revalidate();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void addNewRow() {
        JButton button = new JButton("Click");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Accion cuando se hace clic en el botón
                int selectedRow = table.getSelectedRow();
                System.out.println(" Click en Fila: "+selectedRow);
            }
        });

        tableModel.addRow(new Object[]{ "Dato C1", "Dato C2", "Dato C3", button});
    }
    
}