import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Login extends JFrame{

	// Atributos
	private String userName;
	private String password;

	// Metodos
	public Login(){
		this.userName = "";
		this.password = "";

		initComponent();
	}

	public void initComponent(){

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

		setTitle("FORMATO MONEDA");
		setSize( tamanio.width/2 , tamanio.height/2 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		
		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20) );
		GridBagConstraints restriccion = new GridBagConstraints();

		JLabel etq_cantidad = new JLabel("CANTIDAD:");
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 5;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cantidad, restriccion );

		JTextField input_cantidad = new JTextField();
		input_cantidad.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 0;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 5;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cantidad, restriccion );

		JButton btn_ejecutar = new JButton("EJECUTAR");
		restriccion.gridy = 0;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 5;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_ejecutar, restriccion );

		JLabel etq_resultado = new JLabel(" ---- ");
		etq_resultado.setHorizontalAlignment( JLabel.CENTER );
		etq_resultado.setFont( new Font("Arial", Font.BOLD, 65) );
		restriccion.gridy = 1;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 95;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_resultado, restriccion );

		add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

		ActionListener evento_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String texto = input_cantidad.getText();
				if( !texto.equalsIgnoreCase("") && validarNumero(texto) ){
					etq_resultado.setText( formatoMoneda(texto) );
					input_cantidad.setText("");
					input_cantidad.requestFocus();
				}else{
					etq_resultado.setText( "-- Dato Invalido --" );
					input_cantidad.requestFocus();
				}
			}
		};
		btn_ejecutar.addActionListener( evento_01 );
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

}