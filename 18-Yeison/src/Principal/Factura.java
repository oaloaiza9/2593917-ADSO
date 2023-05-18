package Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.LineBorder;



public class Factura extends JFrame{



    private Persona listaClientes [];
    private Persona listaVendedores [];
    private Productos arrayProductos [];
    private int totalCompra = 0;
    private JLabel encabezadoDatosClientes;
    private JLabel encabezadoDatosVendedor;
    private JLabel encabezadoDatosProductos;
    private JLabel etqCedula;
    private JLabel etqNombre;
    private JLabel etqDireccion;
    private JLabel etqCedulaVendedor;
    private JLabel etqNombresVendedor;
    private JLabel etqId;
    private JLabel etqNombreProducto;
    private JLabel etqCantidad;
    private JPanel listaProductos;
    private JLabel etqTotal;
    private JLabel etqProducto;
    private JLabel etq_temporal;
    private JTextField inputCedula;
    private JTextField inputNombre;
    private JTextField inputDireccion;
    private JTextField inputCedulaVendedor;
    private JTextField inputNombresVendedor;
    private JTextField inputId;
    private JTextField nombreProducto;
    private JTextField cantidadProducto;
    private JButton buscarCliente;
    private JButton buscarVendedor;
    private JButton botonAgregar;
    private JButton botonLimpiar;

    
    //**Creacion de constructor **//

    public Factura(Persona[] listaClientes, Persona[] listaVendedores, Productos [] arrayProductos){

        this.listaClientes = listaClientes;
        this.listaVendedores = listaVendedores;
        this.arrayProductos = arrayProductos;

        initComponents();
    }

    //**Creacion de componentes */

    public void initComponents(){

        //**Configuracion de la ventana (tamanios, bordes, etc) */

        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();

        setSize(((int) (tamanio.width*0.4)),((int) (tamanio.height*0.9)));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Factura");

        JPanel contenedorPrincipal = new JPanel();
        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBorder( BorderFactory.createEmptyBorder(20,20,20,20));
        GridBagConstraints restriccion = new GridBagConstraints();

        //**  --- Seccion usuario --- */

        encabezadoDatosClientes = new JLabel("DATOS CLIENTE: ");
        encabezadoDatosClientes.setVerticalAlignment(JLabel.TOP);
        encabezadoDatosClientes.setFont(new Font("Arial", Font.BOLD, 20));
        encabezadoDatosClientes.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(encabezadoDatosClientes, restriccion);

        etqCedula = new JLabel("CEDULA: ");
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqCedula, restriccion);

        inputCedula = new JTextField(" ");
        inputCedula.setBorder( BorderFactory.createEmptyBorder(0,10,0,10));
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,10,0,10);
        contenedorPrincipal.add(inputCedula, restriccion);

        buscarCliente = new JButton("BUSCAR");
        restriccion.gridx = 3;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(buscarCliente, restriccion);

        etqNombre = new JLabel("NOMBRES: ");
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,0,10,0);
        contenedorPrincipal.add(etqNombre, restriccion);

        inputNombre = new JTextField(" ");
        inputNombre.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 1;
        restriccion.gridy = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,10,10,10);
        contenedorPrincipal.add(inputNombre, restriccion);

        etqDireccion = new JLabel("DIRECCION: ");
        restriccion.gridx = 0;
        restriccion.gridy = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,0,10,0);
        contenedorPrincipal.add(etqDireccion, restriccion);

        inputDireccion = new JTextField(" ");
        inputDireccion.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 1;
        restriccion.gridy = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,10,10,10);
        contenedorPrincipal.add(inputDireccion, restriccion);

        //** --- Seccion vendedor ---  */

        encabezadoDatosVendedor = new JLabel("DATOS VENDEDOR: ");
        encabezadoDatosVendedor.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        encabezadoDatosVendedor.setFont(new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 0;
        restriccion.gridy = 4;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.insets = new Insets(10,0,0,10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(encabezadoDatosVendedor, restriccion);

        etqCedulaVendedor = new JLabel("CEDULA: ");
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(10,0,0,10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqCedulaVendedor, restriccion);

        inputCedulaVendedor = new JTextField(" ");
        inputCedulaVendedor.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 1;
        restriccion.gridy = 5;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,10,0,10);
        contenedorPrincipal.add(inputCedulaVendedor, restriccion);

        buscarVendedor = new JButton("BUSCAR");
        restriccion.gridx = 3;
        restriccion.gridy = 5;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(buscarVendedor, restriccion);

        etqNombresVendedor = new JLabel("NOMBRES: ");
        restriccion.gridx = 0;
        restriccion.gridy = 6;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(10,0,10,0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqNombresVendedor, restriccion);

        inputNombresVendedor = new JTextField(" ");
        inputNombresVendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridx = 1;
        restriccion.gridy = 6;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(inputNombresVendedor, restriccion);

        //** --- Seccion productos --- */

        encabezadoDatosProductos = new JLabel("PRODUCTOS ");
        encabezadoDatosProductos.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridx = 0;
        restriccion.gridy = 7;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 0;
        restriccion.weightx = 0;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(encabezadoDatosProductos, restriccion);

        etqId = new JLabel("ID ");
        etqId.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridx = 0;
        restriccion.gridy = 8;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqId, restriccion);

        etqNombreProducto = new JLabel("NOMBRE");
        etqNombreProducto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridx = 1;
        restriccion.gridy = 8;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 50;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqNombreProducto, restriccion);

        etqCantidad = new JLabel("CANT ");
        etqCantidad.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridx = 2;
        restriccion.gridy = 8;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqCantidad, restriccion);

        inputId = new JTextField(" ");
        restriccion.gridx = 0;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(inputId, restriccion);

        nombreProducto = new JTextField(" ");
        restriccion.gridx = 1;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 50;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(nombreProducto, restriccion);

        cantidadProducto = new JTextField("");
        restriccion.gridx = 2;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(cantidadProducto, restriccion);

        botonAgregar = new JButton("ADD");
        restriccion.gridx = 3;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(botonAgregar, restriccion);

        //** --- Seccion factura --- */

        listaProductos = new JPanel();
        listaProductos.setLayout( new BoxLayout(listaProductos, BoxLayout.Y_AXIS) );
        listaProductos.setOpaque(true);
        listaProductos.setBackground(Color.white);
        
        JScrollPane scrollPane = new JScrollPane(listaProductos);
        scrollPane.setPreferredSize( contenedorPrincipal.getSize() );

        restriccion.gridx = 0;
        restriccion.gridy = 10;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 90;
        restriccion.weightx = 100;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,0,0,10);
        contenedorPrincipal.add(scrollPane, restriccion);

        etqTotal = new JLabel("Total: $ " + totalCompra);
        etqTotal.setHorizontalAlignment(JLabel.RIGHT);
        etqTotal.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 0;
        restriccion.gridy = 11;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,0,0,10);
        etqTotal.setOpaque(true);
        etqTotal.setBackground(Color.white);
        contenedorPrincipal.add(etqTotal, restriccion);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setHorizontalAlignment(JButton.CENTER);
        botonLimpiar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        restriccion.gridx = 3;
        restriccion.gridy = 12;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,10,0,10);
        contenedorPrincipal.add(botonLimpiar,restriccion);

        add(contenedorPrincipal); 
        revalidate();
        setVisible(true);

        //** --- Eventos de botones --- */

        ActionListener eventoLimpiarLista = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                limpiarLista();
            }
        };
        botonLimpiar.addActionListener(eventoLimpiarLista);

        ActionListener eventoBuscarCliente = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarCliente();
			}
		};
        buscarCliente.addActionListener(eventoBuscarCliente);

        ActionListener eventoBuscarVendedor = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buscarVendedor();
            }
        };
        buscarVendedor.addActionListener(eventoBuscarVendedor);


        //** --- Eventos de inputs --- */
        KeyListener eventoKeyBuscarCliente = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                String texto = inputCedula.getText();
                if(texto.equalsIgnoreCase("")){
                    inputNombre.setText("");
                    inputDireccion.setText("");
                }

                if (e.getKeyCode()==10) {
                    buscarCliente();
                }
            }

            public void keyTyped(KeyEvent e){
            }
        };

        KeyListener eventoKeyBuscarVendedor = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                buscarVendedor();
            }

            public void keyTyped(KeyEvent e){
            }
        };
        KeyListener eventoKeyBuscarProducto = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                buscarProductos();
            }   

            public void keyTyped(KeyEvent e){
               
            }
        };
        KeyListener eventoKeyAgregarProductos = new KeyListener(){
            public void keyPressed(KeyEvent e){

            }

            public void keyReleased(KeyEvent e){
            }

            public void keyTyped(KeyEvent e){
                agregarProductos();
            }
        };

        inputCedula.addKeyListener(eventoKeyBuscarCliente);
        inputCedulaVendedor.addKeyListener(eventoKeyBuscarVendedor);
        inputId.addKeyListener(eventoKeyBuscarProducto);
        inputId.addKeyListener(eventoKeyAgregarProductos);
        deshabilitarInput(nombreProducto);
        deshabilitarInput(inputNombre);
        deshabilitarInput(inputDireccion);
        deshabilitarInput(inputNombresVendedor);
        deshabilitarInput(cantidadProducto);

    }

    //** --- Metodos usados en el codigo --- */

    public void buscarCliente(){
        String cedula = inputCedula.getText().replaceAll(" ","");
        boolean encontrado = false;
        System.out.println("\n\nLista de Clientes: ");
        for(int i = 0; i < this.listaClientes.length; i++){
            if(this.listaClientes[i]!=null){
                System.out.println("  => "+this.listaClientes[i].getCedula()+" - "+this.listaClientes[i].getNombres());
            }
            if(this.listaClientes[i]!=null && this.listaClientes[i].getCedula().equalsIgnoreCase(cedula)){
                this.inputCedula.setText( cedula );
				this.inputNombre.setText( this.listaClientes[i].getNombres() );
				this.inputDireccion.setText( this.listaClientes[i].getDireccion() );
				encontrado = true;
				break;
			}
        }

        if(encontrado){
            deshabilitarInput(this.inputNombre);
            deshabilitarInput(this.inputDireccion);
            this.inputCedulaVendedor.requestFocus();
        }else{
            habilitarInput(this.inputNombre);
            habilitarInput(this.inputDireccion);
            this.inputNombre.requestFocus();
        }
    }

    public boolean buscarVendedor(){
        String cedula = inputCedulaVendedor.getText().replaceAll(" ","");
        boolean encontrado = false;
        for(int i = 0; i < this.listaVendedores.length; i++){
            if(this.listaVendedores[i]!=null && this.listaVendedores[i].getCedula().equalsIgnoreCase(cedula)){
                this.inputNombresVendedor.setText(this.listaVendedores[i].getNombres());
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            //this.inputCedulaVendedor.requestFocus();
            this.inputNombresVendedor.setText("    VENDEDOR NO ENCONTRADO");
            LineBorder borderFalse = new LineBorder(Color.RED, 1, true);
            inputNombresVendedor.setBorder(borderFalse);
            return false;
        }else{
            inputNombresVendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
            this.inputId.requestFocus();
            return true;
        }
    }

    public void deshabilitarInput(JTextField input){
        input.setEditable(false);
        input.setEnabled(false);
        input.setDisabledTextColor(Color.black);
    }

    public void habilitarInput(JTextField input){
        input.setText(" ");
        input.setEditable(true);
        input.setEnabled(true);
    }

    public void agregarProductos(){
        String id = inputId.getText().replaceAll(" ","");
        String cantidadString =  cantidadProducto.getText().replaceAll(" ","");
        String nombresUsuario = inputNombre.getText().replaceAll(" ","");
        String nombresVendedor = inputNombresVendedor.getText().replaceAll(" ","");

        if(!id.equalsIgnoreCase("") && !cantidadString.equalsIgnoreCase("") && !nombresVendedor.equalsIgnoreCase("") && !nombresUsuario.equalsIgnoreCase("")){
            boolean encontrado = false;
            for(int i = 0; i < this.arrayProductos.length; i++){
                if(this.arrayProductos[i] != null && this.arrayProductos[i].getIdProducto().equalsIgnoreCase(id)){
                    int cantidadInt = Integer.parseInt(cantidadString);
                    int valorProducto = this.arrayProductos[i].getPrecio() * cantidadInt;
                    etq_temporal = new JLabel(this.arrayProductos[i].getIdProducto() + " - " + this.arrayProductos[i].getNombreProducto() + " - " + cantidadProducto.getText() + " - " + valorProducto);                    
                    listaProductos.add(etq_temporal);
                    nombreProducto.setText(arrayProductos[i].getNombreProducto());
                    encontrado = true;
                    totalCompra += valorProducto;
                    etqTotal.setText("Total: $ " + Integer.toString(totalCompra));
                    this.inputId.setText("");
                    registrarCliente();
                    revalidate();
                    break;
                }
            }
            if(!encontrado){
                nombreProducto.setText("No encontrado");
            }


        }
    }

    public void buscarProductos(){
        String id = inputId.getText().replaceAll(" ","");
        boolean encontrado = false;
        if(!id.equalsIgnoreCase("")){
            for(int i = 0; i < this.arrayProductos.length; i++){
                if(this.arrayProductos[i] != null && this.arrayProductos[i].getIdProducto().equalsIgnoreCase(id)){
                    this.nombreProducto.setText( this.arrayProductos[i].getNombreProducto());
                    encontrado = true;
                    break;
                }
            }
        }
        if(!encontrado){
            this.nombreProducto.setText("");
        }else{
            cantidadProducto.setText("1");
            agregarProductos();
        }
    }

    public void registrarCliente(){
        String nuevaCedula = this.inputCedula.getText().replaceAll(" ","");
        String nuevoNombre = this.inputNombre.getText();
        String nuevaDireccion = this.inputDireccion.getText();
        
        // Validar que no exista
        boolean valido = true;
        for(int j = 0; j < listaClientes.length; j++){
            if(listaClientes[j]!=null && listaClientes[j].getCedula().equalsIgnoreCase(nuevaCedula)){
                valido = false;
                break;
            }
        }

        if(valido){
            // Agregar en el Primer null
            Persona temporal = new Persona(nuevaCedula, nuevoNombre, nuevaDireccion, "", "", "");
            for(int j = 0; j < listaClientes.length; j++){
                if(listaClientes[j] == null){
                    listaClientes[j] = temporal;
                    break;
                }
            }

            this.inputCedula.setText("");
            deshabilitarInput(this.inputNombre);
            deshabilitarInput(this.inputDireccion);
        }
    }

    public void limpiarLista(){
        this.listaProductos.removeAll();
        inputCedula.setText("");
        inputCedulaVendedor.setText("");
        inputNombre.setText("");
        inputDireccion.setText("");
        inputNombresVendedor.setText("");
        etqTotal.setText("$ 0");
        revalidate();
    }

}
