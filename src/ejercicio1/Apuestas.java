package ejercicio1;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

/**
 * @author Sergio Pernas
 */

public class Apuestas extends JFrame {
	private JButton profileButton;
	private JLabel lblMonedas;
	private JTextArea txtrEquipo;
	private JTextArea txtrEquipo_1;
	private JTextArea txtrEquipo_2;
	private JTextArea txtrEquipo_3;

	public Apuestas() {
		// Configurar la ventana principal
		setTitle("Sportify");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnSportify = new JButton("Sportify");
		btnSportify.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSportify.setBounds(6, 9, 111, 23);
		getContentPane().add(btnSportify);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(367, 0, 17, 261);
		getContentPane().add(scrollBar);

		profileButton = new JButton("Perfil");
		profileButton.setBounds(227, 11, 57, 23);
		getContentPane().add(profileButton);

		lblMonedas = new JLabel("Monedas: 100");
		lblMonedas.setBounds(297, 11, 77, 20);
		getContentPane().add(lblMonedas);

		JTextPane txtpnReglasCadaJugador = new JTextPane();
		txtpnReglasCadaJugador.setText(
				"Reglas: Cada jugador debe iniciar con una apuesta minima de 5 monedas, las apuestas solo pueden ser multiplos de 5, es decir, 5, 10, 15, 20, etc...");
		txtpnReglasCadaJugador.setBounds(16, 43, 341, 43);
		getContentPane().add(txtpnReglasCadaJugador);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 37, 364, 4);
		getContentPane().add(panel);

		txtrEquipo = new JTextArea();
		txtrEquipo.setText("Equipo 1");
		txtrEquipo.setBounds(16, 94, 69, 23);
		getContentPane().add(txtrEquipo);

		txtrEquipo_1 = new JTextArea();
		txtrEquipo_1.setText("Equipo 1");
		txtrEquipo_1.setBounds(16, 169, 69, 23);
		getContentPane().add(txtrEquipo_1);

		txtrEquipo_2 = new JTextArea();
		txtrEquipo_2.setText("Equipo 2");
		txtrEquipo_2.setBounds(151, 94, 69, 22);
		getContentPane().add(txtrEquipo_2);

		txtrEquipo_3 = new JTextArea();
		txtrEquipo_3.setText("Equipo 2");
		txtrEquipo_3.setBounds(151, 167, 69, 22);
		getContentPane().add(txtrEquipo_3);

		JTextPane txtpnVs = new JTextPane();
		txtpnVs.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		txtpnVs.setText("VS");
		txtpnVs.setBounds(105, 97, 26, 20);
		getContentPane().add(txtpnVs);

		JTextPane txtpnVs_1 = new JTextPane();
		txtpnVs_1.setText("VS");
		txtpnVs_1.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		txtpnVs_1.setBounds(105, 169, 26, 20);
		getContentPane().add(txtpnVs_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(40, 131, 26, 23);
		getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(105, 131, 26, 23);
		getContentPane().add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(171, 131, 26, 23);
		getContentPane().add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBounds(40, 203, 26, 23);
		getContentPane().add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1.setBounds(105, 203, 26, 23);
		getContentPane().add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("");
		rdbtnNewRadioButton_2_1.setBounds(169, 204, 26, 23);
		getContentPane().add(rdbtnNewRadioButton_2_1);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(227, 202, 30, 20);
		getContentPane().add(spinner);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(227, 131, 30, 20);
		getContentPane().add(spinner_1);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(267, 201, 89, 23);
		getContentPane().add(btnConfirmar);

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(267, 131, 88, 23);
		getContentPane().add(btnNewButton);
	}

	public static void main(String[] args) {
		Apuestas ui = new Apuestas();
		ui.setVisible(true);
	}
}
