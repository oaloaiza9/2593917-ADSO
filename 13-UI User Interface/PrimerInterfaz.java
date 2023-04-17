import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PrimerInterfaz{
	public static void main(String[] args) {
		
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();
		
		JFrame ventana = new JFrame();
		ventana.setVisible( true );
		ventana.setSize( tamanio.width/2 , tamanio.height/2 );
		ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		ventana.setLocationRelativeTo( null );
		ventana.setTitle( "Formulario" );

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
		ventana.add( contenedor );
		ventana.revalidate();
		ventana.pack();

		ActionListener evento_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click en el Boton");
			}
		};

		btn_limpiar.addActionListener(evento_01);

	}
}