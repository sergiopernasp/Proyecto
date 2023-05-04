package ejercicio1;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

/**
 * @author Sergio Pernas
 */

public class creacionliga extends JFrame {
	private JButton profileButton;
	private JTextPane txtpnCreacionDeLiga;
	private JTextField txtCodigoesAutogenerado;
	private JTextField txtNombreLiga;
	private JTextField txtNumeroDeEquipos;
	private JTextField txtTipoDeDeporte;
	private JTextField txtElegirDeportejuego;

	public creacionliga() {

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
		profileButton.setBounds(300, 11, 57, 23);
		getContentPane().add(profileButton);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 37, 364, 4);
		getContentPane().add(panel);

		txtpnCreacionDeLiga = new JTextPane();
		txtpnCreacionDeLiga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnCreacionDeLiga.setText("Creacion de Liga");
		txtpnCreacionDeLiga.setBounds(6, 52, 113, 23);
		getContentPane().add(txtpnCreacionDeLiga);

		txtCodigoesAutogenerado = new JTextField();
		txtCodigoesAutogenerado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtCodigoesAutogenerado.setText("Codigo:(Es autogenerado por la pagina)");
		txtCodigoesAutogenerado.setBounds(6, 82, 191, 23);
		getContentPane().add(txtCodigoesAutogenerado);
		txtCodigoesAutogenerado.setColumns(10);

		txtNombreLiga = new JTextField();
		txtNombreLiga.setText("Nombre Liga:");
		txtNombreLiga.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtNombreLiga.setColumns(10);
		txtNombreLiga.setBounds(6, 104, 191, 23);
		getContentPane().add(txtNombreLiga);

		txtNumeroDeEquipos = new JTextField();
		txtNumeroDeEquipos.setText("Numero de Equipos");
		txtNumeroDeEquipos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtNumeroDeEquipos.setColumns(10);
		txtNumeroDeEquipos.setBounds(6, 125, 100, 23);
		getContentPane().add(txtNumeroDeEquipos);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(105, 128, 30, 20);
		getContentPane().add(spinner);

		txtTipoDeDeporte = new JTextField();
		txtTipoDeDeporte.setText("Tipo de Deporte");
		txtTipoDeDeporte.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtTipoDeDeporte.setColumns(10);
		txtTipoDeDeporte.setBounds(6, 147, 79, 23);
		getContentPane().add(txtTipoDeDeporte);

		txtElegirDeportejuego = new JTextField();
		txtElegirDeportejuego.setText("Elegir Deporte/Juego");
		txtElegirDeportejuego.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtElegirDeportejuego.setColumns(10);
		txtElegirDeportejuego.setBounds(6, 167, 79, 23);
		getContentPane().add(txtElegirDeportejuego);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerListModel(new String[] { "League of legends", "Valorant", "Overwatch" }));
		spinner_1.setBounds(84, 169, 113, 20);
		getContentPane().add(spinner_1);

		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerListModel(new String[] { "Esport", "Fisico" }));
		spinner_1_1.setBounds(84, 150, 64, 20);
		getContentPane().add(spinner_1_1);

		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setModel(new SpinnerListModel(new String[] { "Futbol", "Basket", "Tenis" }));
		spinner_1_2.setBounds(210, 169, 113, 20);
		getContentPane().add(spinner_1_2);

		JButton btnNewButton = new JButton("CREAR");
		btnNewButton.setBounds(130, 200, 111, 35);
		getContentPane().add(btnNewButton);

		JTextPane txtpnReglasElUsuario = new JTextPane();
		txtpnReglasElUsuario.setText(
				"Reglas: El usuario inserta todas las reglas que quiera para su liga ya sean formas distintas de jugar etc...");
		txtpnReglasElUsuario.setBounds(237, 55, 111, 93);
		getContentPane().add(txtpnReglasElUsuario);
	}

	public static void main(String[] args) {
		creacionliga ui = new creacionliga();
		ui.setVisible(true);
	}
}
