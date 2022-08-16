package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaCalculadoraEnvios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculadoraEnvios frame = new VentanaCalculadoraEnvios();
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
	public VentanaCalculadoraEnvios() {
		setTitle("Calculadora envios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Ciudad Origen:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1,alignx left");
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(textField, "cell 2 1,growx");
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nacional");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnNewRadioButton, "flowx,cell 2 2");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Extranjero");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnNewRadioButton_1, "cell 2 2");
		
		JLabel lblNewLabel_1 = new JLabel("Cuidad Destino:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 1 3,alignx left");
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(textField_1, "cell 2 3,growx");
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nacional");
		rdbtnNewRadioButton_2.setSelected(true);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnNewRadioButton_2, "flowx,cell 2 4");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Extranjero");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnNewRadioButton_3, "cell 2 4");
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de envio:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 1 5,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10 h", "Paq 14 - Antes de las 14 h", "Paq 24 - Al día siguiente"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(comboBox, "cell 2 5,growx");
		
		JLabel lblNewLabel_3 = new JLabel("Peso:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 1 6");
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 40, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(spinner, "flowx,cell 2 6");
		
		JButton btnNewButton = new JButton("Calcular Precio");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton, "cell 2 7");
		
		JLabel lblNewLabel_4 = new JLabel("Kg");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4, "cell 2 6");
	}

}
