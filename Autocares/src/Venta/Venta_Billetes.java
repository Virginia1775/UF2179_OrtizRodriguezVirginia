package Venta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Venta_Billetes extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textPrecio;
	private final ButtonGroup GrupoBillete = new ButtonGroup();
	private JButton btnCalcular;
	private JComboBox comboBoxOrigen;
	private JComboBox comboBoxDestino;
	private JRadioButton rdbIdaYVuelta;
	private JRadioButton rdbTarjetaD;
	private JTextArea textAreaResultado;
	private JRadioButton rdbIda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venta_Billetes frame = new Venta_Billetes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Venta_Billetes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setFont(new Font("Dialog", Font.BOLD, 18));
		setTitle("VENTA DE BILLETES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][78.00][][][][][][][][24.00]", "[][][][][][][][][][][][][][][grow]"));
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblOrigen, "cell 1 1,alignx center");
		
		 comboBoxOrigen = new JComboBox();
		comboBoxOrigen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxOrigen.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		contentPane.add(comboBoxOrigen, "cell 2 1 8 1,growx");
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDestino, "cell 1 3,alignx trailing");
		
		 comboBoxDestino = new JComboBox();
		comboBoxDestino.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		comboBoxDestino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(comboBoxDestino, "cell 2 3 8 1,growx");
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNombre, "cell 1 5,alignx trailing");
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textNombre, "cell 2 5 3 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblApellidos, "cell 6 5,alignx center");
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textApellidos, "cell 7 5 7 1,growx");
		textApellidos.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPrecio, "cell 1 7,alignx center");
		
		textPrecio = new JTextField();
		textPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textPrecio, "cell 2 7 3 1,growx");
		textPrecio.setColumns(10);
		
		JLabel lblBillete = new JLabel("Billete");
		lblBillete.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblBillete, "cell 1 9,alignx center");
		
		 rdbIda = new JRadioButton("Ida");
		GrupoBillete.add(rdbIda);
		rdbIda.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(rdbIda, "cell 3 9");
		
		 rdbIdaYVuelta = new JRadioButton("Ida y vuelta");
		GrupoBillete.add(rdbIdaYVuelta);
		rdbIdaYVuelta.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(rdbIdaYVuelta, "cell 5 9");
		
		 rdbTarjetaD = new JRadioButton("Tarjeta Dorada");
		GrupoBillete.add(rdbTarjetaD);
		rdbTarjetaD.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(rdbTarjetaD, "cell 7 9");
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calculaPrecio();
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(btnCalcular, "cell 0 12 14 1,alignx center");
		
		 textAreaResultado = new JTextArea();
		contentPane.add(textAreaResultado, "cell 1 14 12 1,grow");
	}

	protected void calculaPrecio() {
		if(rdbIda.isSelected()) {
		
	}

}}
