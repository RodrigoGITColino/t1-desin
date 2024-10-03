package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField tfNombre;
	private JTextField tfEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	int suma = 0;

	private void initialize() {
		frame = new JFrame("GAME STORE");
		frame.setBounds(100, 100, 850, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(10, 28, 46, 14);
		frame.getContentPane().add(labelNombre);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(10, 53, 46, 14);
		frame.getContentPane().add(labelEmail);

		tfNombre = new JTextField();
		tfNombre.setBounds(66, 25, 86, 20);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setBounds(66, 50, 86, 20);
		frame.getContentPane().add(tfEmail);
		tfEmail.setColumns(10);

		JLabel lblListado = new JLabel("Listado de videojuegos");
		lblListado.setBounds(232, 28, 149, 14);
		frame.getContentPane().add(lblListado);

		JCheckBox cbxRE = new JCheckBox("Resident Evil");

		cbxRE.setBounds(232, 49, 117, 23);
		frame.getContentPane().add(cbxRE);

		JCheckBox cbxMK = new JCheckBox("Mortal Kombat");
		cbxMK.setBounds(232, 75, 117, 23);
		frame.getContentPane().add(cbxMK);

		JCheckBox cbxGT = new JCheckBox("Gran Turismo");
		cbxGT.setBounds(232, 101, 117, 23);
		frame.getContentPane().add(cbxGT);

		JCheckBox cbxSM = new JCheckBox("Super Mario");
		cbxSM.setBounds(232, 127, 117, 23);
		frame.getContentPane().add(cbxSM);

		JLabel lblNewLabel = new JLabel("40$");
		lblNewLabel.setBounds(355, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("60$");
		lblNewLabel_1.setBounds(355, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("50$");
		lblNewLabel_2.setBounds(355, 105, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("35$");
		lblNewLabel_3.setBounds(355, 131, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(232, 256, 128, 37);
		frame.getContentPane().add(btnComprar);

		JLabel lblNewLabel_4 = new JLabel("Comentarios sobre compra:");
		lblNewLabel_4.setBounds(10, 195, 172, 14);
		frame.getContentPane().add(lblNewLabel_4);

		JTextArea taComentarios = new JTextArea();
		taComentarios.setBounds(10, 223, 172, 70);
		frame.getContentPane().add(taComentarios);

		JLabel lblNewLabel_5 = new JLabel("Opcion de envío");
		lblNewLabel_5.setBounds(460, 28, 109, 14);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Empresa reparto");
		lblNewLabel_6.setBounds(591, 28, 124, 14);
		frame.getContentPane().add(lblNewLabel_6);

		JRadioButton rbNormal = new JRadioButton("Normal");
		buttonGroup.add(rbNormal);
		rbNormal.setBounds(460, 49, 109, 23);
		frame.getContentPane().add(rbNormal);

		JRadioButton rbRapido = new JRadioButton("Rápido");
		buttonGroup.add(rbRapido);
		rbRapido.setBounds(460, 75, 109, 23);
		frame.getContentPane().add(rbRapido);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(591, 49, 86, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel_7 = new JLabel("Suma actual:");
		lblNewLabel_7.setBounds(503, 195, 109, 14);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("$");
		lblNewLabel_8.setBounds(566, 246, 18, 14);
		frame.getContentPane().add(lblNewLabel_8);

		JLabel lblSuma = new JLabel("0");
		lblSuma.setBounds(503, 246, 46, 14);
		frame.getContentPane().add(lblSuma);

		JButton btnLimpiar = new JButton("Limpiar selección");

		btnLimpiar.setBounds(460, 332, 142, 23);
		frame.getContentPane().add(btnLimpiar);

		JButton btnNewButton = new JButton("Irme sin comprar");

		btnNewButton.setBounds(633, 332, 142, 23);
		frame.getContentPane().add(btnNewButton);

		// EVENTOS

		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tfNombre.setText("");
				tfEmail.setText("");
				taComentarios.setText("");
				cbxGT.setSelected(false);
				cbxMK.setSelected(false);
				cbxRE.setSelected(false);
				cbxSM.setSelected(false);
				rbRapido.setSelected(true);

				suma = 0;
				lblSuma.setText(String.valueOf(suma));

			}
		});

		cbxRE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbxRE.isSelected()) {

					suma += 40;

				} else
					suma -= 40;

				lblSuma.setText(String.valueOf(suma));

			}
		});

		cbxGT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbxGT.isSelected()) {

					suma += 50;

				} else
					suma -= 50;

				lblSuma.setText(String.valueOf(suma));

			}
		});

		cbxMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbxMK.isSelected()) {

					suma += 60;

				} else
					suma -= 60;

				lblSuma.setText(String.valueOf(suma));

			}
		});

		cbxSM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbxSM.isSelected()) {

					suma += 35;

				} else
					suma -= 35;

				lblSuma.setText(String.valueOf(suma));

			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int respuesta = JOptionPane.showConfirmDialog(null,"¿Estás seguro de que quieres continuar?","Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
				
			}
		});

	}
}
