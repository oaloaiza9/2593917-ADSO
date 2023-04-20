import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Facturador extends JFrame{

	// Atributos
	private Persona listaClientes [];
	private Persona listaVendedores [];
	private JLabel etq_datos_cliente;
	private JLabel etq_cedula_cliente;
	private JLabel etq_nombres_cliente;
	private JLabel etq_direccion_cliente;
	private JLabel etq_datos_vendedor;
	private JLabel etq_vendedor_cliente;
	private JLabel etq_nombres_vendedor;
	private JLabel etq_datos_productos;
	private JLabel etq_id_producto;
	private JLabel etq_nombre_producto;
	private JLabel etq_cant_producto;
	private JLabel etq_btn_producto;
	private JLabel etq_resultado;
	private JLabel etq_total;
	private JTextField input_cedula_cliente;
	private JTextField input_nombres_cliente;
	private JTextField input_direccion_cliente;
	private JTextField input_cedula_vendedor;
	private JTextField input_nombres_vendedor;
	private JTextField input_id_producto;
	private JTextField input_nombre_producto;
	private JTextField input_cant_producto;
	private JButton btn_buscar_cliente;
	private JButton btn_buscar_vendedor;
	private JButton btn_add_producto;

	// Metodos
	public Facturador(Persona[] listaClientes, Persona[] listaVendedores){
		this.listaClientes = listaClientes;
		this.listaVendedores = listaVendedores;

		initComponent();
	}

	public void initComponent(){

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

		setTitle("FACTURA");
		setSize( ((int) (tamanio.width*0.4)) , ((int) (tamanio.height*0.9)) );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		
		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
		GridBagConstraints restriccion = new GridBagConstraints();

		etq_datos_cliente = new JLabel("DATOS CLIENTE:");
		etq_datos_cliente.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_cliente.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_cliente, restriccion );

		etq_cedula_cliente = new JLabel("CEDULA:");
		restriccion.gridy = 1;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cedula_cliente, restriccion );

		input_cedula_cliente = new JTextField();
		input_cedula_cliente.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 1;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 2;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedula_cliente, restriccion );

		btn_buscar_cliente = new JButton("BUSCAR");
		restriccion.gridy = 1;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar_cliente, restriccion );


		etq_nombres_cliente = new JLabel("NOMBRES:");
		restriccion.gridy = 2;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(10, 0, 10, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_nombres_cliente, restriccion );

		input_nombres_cliente = new JTextField();
		input_nombres_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 2;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 2;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(10, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombres_cliente, restriccion );

		etq_direccion_cliente = new JLabel("DIRECCION:");
		restriccion.gridy = 3;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 10, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_direccion_cliente, restriccion );

		input_direccion_cliente = new JTextField();
		input_direccion_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 3;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 2;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(0, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_direccion_cliente, restriccion );

		
		/*
			- Seccion vendedor
		*/
		etq_datos_vendedor = new JLabel("DATOS VENDEDOR:");
		etq_datos_vendedor.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 4;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.insets = new Insets(10, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_vendedor, restriccion );

		etq_vendedor_cliente = new JLabel("CEDULA:");
		restriccion.gridy = 5;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_vendedor_cliente, restriccion );

		input_cedula_vendedor = new JTextField();
		input_cedula_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 5;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 2;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedula_vendedor, restriccion );

		btn_buscar_vendedor = new JButton("BUSCAR");
		restriccion.gridy = 5;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar_vendedor, restriccion );

		etq_nombres_vendedor = new JLabel("NOMBRES:");
		restriccion.gridy = 6;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(10, 0, 10, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_nombres_vendedor, restriccion );

		input_nombres_vendedor = new JTextField();
		input_nombres_vendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 6;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 2;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(10, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombres_vendedor, restriccion );

		
		/*
			- Seccion Productos
		*/
		etq_datos_productos = new JLabel("LISTA PRODUCTOS FACTURADOS:");
		etq_datos_productos.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_productos.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 7;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.insets = new Insets(10, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_productos, restriccion );

		etq_id_producto = new JLabel("ID");
		etq_id_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_id_producto, restriccion );

		etq_nombre_producto = new JLabel("NOMBRE");
		etq_nombre_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 70;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_nombre_producto, restriccion );

		etq_cant_producto = new JLabel("CANT.");
		etq_cant_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cant_producto, restriccion );

		etq_btn_producto = new JLabel();
		restriccion.gridy = 8;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_btn_producto, restriccion );


		input_id_producto = new JTextField();
		restriccion.gridy = 9;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_id_producto, restriccion );

		input_nombre_producto = new JTextField();
		restriccion.gridy = 9;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 70;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombre_producto, restriccion );

		input_cant_producto = new JTextField();
		restriccion.gridy = 9;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cant_producto, restriccion );

		btn_add_producto = new JButton("ADD");
		restriccion.gridy = 9;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_add_producto, restriccion );




		etq_resultado = new JLabel(" ---- ");
		etq_resultado.setHorizontalAlignment( JLabel.RIGHT );
		etq_resultado.setVerticalAlignment( JLabel.TOP );
		etq_resultado.setFont( new Font("Arial", Font.BOLD, 10) );
		etq_resultado.setOpaque(true);
		etq_resultado.setBackground( Color.white );
		etq_resultado.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
		restriccion.gridy = 10;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 89;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		restriccion.insets = new Insets(10, 0, 0, 10);
		contPrincipal.add( etq_resultado, restriccion );

		etq_total = new JLabel("Total: $ 0");
		etq_total.setHorizontalAlignment( JLabel.RIGHT );
		etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_total.setOpaque(true);
		etq_total.setBackground( Color.white );
		etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 11;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		restriccion.insets = new Insets(0, 0, 0, 10);
		contPrincipal.add( etq_total, restriccion );

		this.input_nombres_cliente.setEnabled(false);
		this.input_direccion_cliente.setEnabled(false);
		deshabilitarInput(this.input_nombres_cliente);
		deshabilitarInput(this.input_direccion_cliente);

		add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

		ActionListener evento_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarCliente();
			}
		};
		btn_buscar_cliente.addActionListener( evento_01 );
	}

	public boolean validarNumero(String texto){
		int contador = 0;
		for (int i=0; i<texto.length(); i++) {
			int codigo = (int) texto.charAt(i);
			if ((codigo<48 || codigo>57) && codigo!=44 && codigo!=45 && codigo!=46){
				return false;
			}
			if (codigo==44 || codigo==46){
				contador++;
			}
		}
		return (contador<=1);
	}

	public String formatoMoneda(String texto){
		Double numero = Double.parseDouble(texto.replace(",","."));
		NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		return formatoMoneda.format(numero).replaceAll(",00","");
	}

	public void buscarCliente(){
		String texto = input_cedula_cliente.getText();
		boolean encontrado = false;
		for (int i=0; i<this.listaClientes.length; i++) {
			if(this.listaClientes[i]!=null && this.listaClientes[i].getCedula().equalsIgnoreCase(texto)){
				this.input_nombres_cliente.setText( this.listaClientes[i].getNombres() );
				this.input_direccion_cliente.setText( this.listaClientes[i].getDireccion() );
				encontrado = true;
				break;
			}
		}

		if(encontrado){
			deshabilitarInput(this.input_nombres_cliente);
			deshabilitarInput(this.input_direccion_cliente);
			this.input_cedula_vendedor.requestFocus();
		}else{
			habilitarInput(this.input_nombres_cliente);
			habilitarInput(this.input_direccion_cliente);
			this.input_nombres_cliente.requestFocus();
		}	
	}

	public void deshabilitarInput(JTextField input){
		input.setEditable(false);
		input.setEnabled(false);
		input.setDisabledTextColor(Color.black);
	}

	public void habilitarInput(JTextField input){
		input.setText("");
		input.setEditable(true);
		input.setEnabled(true);
	}

}