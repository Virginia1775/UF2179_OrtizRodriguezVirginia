package Gestion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class VentanaAutocar extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textMarca;
	private JTextField textKilometros;
	private JTextField textModelo;
	private JButton btnInsertar;
	private JButton btnMostrarCampos;
	private ArrayList<Autocar>listaAutocar;
	private JSpinner spinnerPlazas;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAutocar frame = new VentanaAutocar();
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
	public VentanaAutocar() {
		listaAutocar=new ArrayList<Autocar>();
		setTitle("Gestion Autocares");
		setFont(new Font("Dialog", Font.BOLD, 18));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 962, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][337.00][][]", "[][][][92.00][]"));
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblMatricula, "cell 0 0,alignx trailing");
		
		textMatricula = new JTextField();
		textMatricula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textMatricula, "cell 1 0 2 1,growx");
		textMatricula.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblMarca, "cell 0 1,alignx trailing");
		
		textMarca = new JTextField();
		textMarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textMarca, "cell 1 1 2 1,growx");
		textMarca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblModelo, "cell 3 1,alignx trailing");
		
		textModelo = new JTextField();
		textModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textModelo, "cell 4 1,growx");
		textModelo.setColumns(10);
		
		JLabel lblKilometros = new JLabel("Kilometros");
		lblKilometros.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblKilometros, "cell 0 2,alignx trailing");
		
		textKilometros = new JTextField();
		textKilometros.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textKilometros, "cell 1 2 2 1,growx");
		textKilometros.setColumns(10);
		
		JLabel lblPlazas = new JLabel("Plazas");
		lblPlazas.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPlazas, "cell 3 2,alignx right");
		
		spinnerPlazas = new JSpinner();
		spinnerPlazas.setModel(new SpinnerNumberModel(30, 1, 80, 1));
		contentPane.add(spinnerPlazas, "cell 4 2");
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarDatos();
				
			}
		});
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnInsertar, "cell 2 3,alignx center");
		
		btnMostrarCampos = new JButton("Mostrar Campos");
		btnMostrarCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertarDatos();
				MostrarDatos();
			}
		});
		btnMostrarCampos.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnMostrarCampos, "cell 3 3");
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 2 4 2 1,grow");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSurrendersFocusOnKeystroke(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Matricula", "Marca", "Modelo", "Kilometros", "Num Plazas"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}

	protected void MostrarDatos() {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		modelo.setRowCount(0);
		for(Autocar autocar: listaAutocar) {
		Object fila[] = {
                autocar.getMatricula(),autocar.getMarca(),autocar.getModelo()
				, autocar.getKilometros(),autocar.getNum_plazas()
		
};
modelo.addRow(fila);
}
		
	}

	protected void insertarDatos() {
		Autocar a= new Autocar();
		
		a.setMatricula(textMatricula.getText());
		a.setMarca(textMarca.getText());
		a.setModelo(textModelo.getText());
		a.setKilometros(Integer.parseInt(textKilometros.getText()));
		//a.setNum_plazas(Integer.parseInt(spinnerPlazas.getComponentCount());
	
		listaAutocar.add(a);
	}

}
