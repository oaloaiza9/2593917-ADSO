import javax.swing.*;
import java.awt.*;

public class FormRegistro extends JFrame {

	public FormRegistro(String titulo){

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();
		
		setVisible( true );
		setSize( tamanio.width/2 , tamanio.height/2 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo( null );
		setTitle( titulo );

		Font fuente = new Font("Arial", Font.BOLD, 20);

		JPanel contenedor = new JPanel();
		contenedor.setBackground( Color.white );
		contenedor.setLayout( new GridLayout(4,2) );
		contenedor.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20) );

		JLabel label_cedula = new JLabel("Cedula:");
		label_cedula.setFont( fuente );

		JTextField campo_cedula = new JTextField();
		campo_cedula.setColumns(20);

		JLabel label_nombres = new JLabel("Nombres: ");
		label_nombres.setFont( fuente );
		JTextField campo_nombres = new JTextField();

		JLabel label_apellidos = new JLabel("Apellidos: ");
		label_apellidos.setFont( fuente );
		JTextField campo_apellidos = new JTextField();
		
		JButton btn_limpiar = new JButton("LIMPIAR");
		JButton btn_guardar = new JButton("GUARDAR");

		// Agregar elementos visuales al contenedor
		contenedor.add(label_cedula);
		contenedor.add(campo_cedula);
		contenedor.add(label_nombres);
		contenedor.add(campo_nombres);
		contenedor.add(label_apellidos);
		contenedor.add(campo_apellidos);
		contenedor.add(btn_limpiar);
		contenedor.add(btn_guardar);

		// Agregar el contenedor a la ventana
		add( contenedor );
		revalidate();
		pack();
	}

}
