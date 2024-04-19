package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JFormattedTextField;

public class Registro {

	private JFrame frmRegistro;
	private JFrame frameLogin;
	private static String senhaRegistro;
	private String confirmaSenha;
	private String nome;
	private static String emailRegistro;

	public static String getSenhaRegistro() {
		return senhaRegistro;
	}

	public static String getEmailRegistro() {
		return emailRegistro;
	}

	private JPasswordField passwordField_Senha;
	private JPasswordField passwordField_ConfirmaSenha;

	/**
	 * Launch the application.
	 */

	public void addPlaceholderStyle(TextField textField) {
		Font font = textField.getFont();
		font = font.deriveFont(Font.ITALIC);
		textField.setFont(font);
		textField.setForeground(Color.gray);
	}

	public void removePlaceholderStyle(TextField textField) {
		Font font = textField.getFont();
		font = font.deriveFont(Font.PLAIN);
		textField.setFont(font);
		textField.setForeground(Color.black);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
		// initializeLogin();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/imagens/IconNecromante.png")));
		frmRegistro.getContentPane().setBackground(Color.DARK_GRAY);
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 378, 300);
		frmRegistro.getContentPane().setLayout(null);

		TextField txtEmail = new TextField();
		txtEmail.setBounds(10, 82, 342, 22);
		frmRegistro.getContentPane().add(txtEmail);

		JLabel labelConfirmaSenha = new JLabel("Confirmar senha");
		labelConfirmaSenha.setForeground(Color.LIGHT_GRAY);
		labelConfirmaSenha.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelConfirmaSenha.setBounds(10, 160, 342, 14);
		frmRegistro.getContentPane().add(labelConfirmaSenha);

		TextField txtNome = new TextField();
		txtNome.setBounds(10, 31, 342, 22);
		frmRegistro.getContentPane().add(txtNome);

		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setBounds(10, 129, 342, 20);
		frmRegistro.getContentPane().add(passwordField_Senha);

		passwordField_ConfirmaSenha = new JPasswordField();
		passwordField_ConfirmaSenha.setBounds(10, 181, 342, 20);
		frmRegistro.getContentPane().add(passwordField_ConfirmaSenha);
		frmRegistro.setVisible(true);

		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setForeground(Color.LIGHT_GRAY);
		labelSenha.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelSenha.setBounds(10, 112, 46, 14);
		frmRegistro.getContentPane().add(labelSenha);

		JLabel labelEmail = new JLabel("E-mail");
		labelEmail.setForeground(Color.LIGHT_GRAY);
		labelEmail.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelEmail.setHorizontalAlignment(SwingConstants.LEFT);
		labelEmail.setBounds(10, 62, 342, 14);
		frmRegistro.getContentPane().add(labelEmail);

		JLabel labelNome = new JLabel("Nome");
		labelNome.setForeground(Color.LIGHT_GRAY);
		labelNome.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelNome.setHorizontalAlignment(SwingConstants.LEFT);
		labelNome.setBounds(10, 11, 46, 14);
		frmRegistro.getContentPane().add(labelNome);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(Color.LIGHT_GRAY);
		btnRegistrar.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnRegistrar.setBorder(null);
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		JLabel atencao = new JLabel("");
		atencao.setForeground(Color.WHITE);
		atencao.setFont(new Font("Papyrus", Font.PLAIN, 12));
		atencao.setHorizontalAlignment(SwingConstants.CENTER);
		atencao.setBounds(10, 227, 243, 23);
		frmRegistro.getContentPane().add(atencao);

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = txtNome.getText();
				emailRegistro = txtEmail.getText();
				senhaRegistro = passwordField_Senha.getText();
				confirmaSenha = passwordField_ConfirmaSenha.getText();

				if (nome.isBlank() || emailRegistro.isBlank() || senhaRegistro.isBlank() || confirmaSenha.isBlank())
					atencao.setText("Preencha todos os campos!");
				else {
					if (!emailRegistro.contains("@") || !emailRegistro.contains(".")) {
						if (!confirmaSenha.equals(senhaRegistro)) {
							labelEmail.setText("Insira um e-mail válido");
							labelConfirmaSenha.setText("Confirmar senha: não coincidem");
						} else {
							labelEmail.setText("Insira um e-mail válido");
						}
					} else if (!confirmaSenha.equals(senhaRegistro)) {
						labelConfirmaSenha.setText("Confirmar senha: não coincidem");
					} else {
						frmRegistro.dispose();
						frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						Login.main(null);
					}
				}
			}
		});
		btnRegistrar.setBounds(263, 227, 89, 23);
		frmRegistro.getContentPane().add(btnRegistrar);

	}
}
