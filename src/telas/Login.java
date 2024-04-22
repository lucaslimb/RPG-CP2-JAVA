package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frameLogin;
	private JPasswordField passwordField;
	private TextField textFieldEmail;

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
					Login window = new Login();
					window.frameLogin.setVisible(true);
					window.frameLogin.setAutoRequestFocus(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	void initialize() {
		frameLogin = new JFrame();
		frameLogin.setResizable(false);
		frameLogin.getContentPane().setFont(new Font("Papyrus", Font.PLAIN, 12));
		frameLogin.getContentPane().setBackground(Color.DARK_GRAY);
		frameLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagens/IconNecromante.png")));
		frameLogin.setTitle("Login");
		frameLogin.setBounds(450, 200, 355, 300);
		frameLogin.setLocationRelativeTo(null);
		frameLogin.getContentPane().setLayout(null);
		frameLogin.setVisible(true);
		frameLogin.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				this.windowGainedFocus(e);
			}
		});
		
		JLabel labelTitulo = new JLabel("BuildMaker");
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setForeground(Color.RED);
		labelTitulo.setFont(new Font("Papyrus", Font.BOLD, 23));
		labelTitulo.setBounds(10, 11, 319, 32);
		frameLogin.getContentPane().add(labelTitulo);

		JLabel labelLogin = new JLabel("Login");
		labelLogin.setForeground(Color.WHITE);
		labelLogin.setFont(new Font("Papyrus", Font.PLAIN, 18));
		labelLogin.setHorizontalAlignment(SwingConstants.CENTER);
		labelLogin.setBounds(5, 54, 319, 22);
		frameLogin.getContentPane().add(labelLogin);

		JLabel labelEmail = new JLabel("E-mail");
		labelEmail.setForeground(Color.LIGHT_GRAY);
		labelEmail.setFont(new Font("Papyrus", Font.PLAIN, 11));
		labelEmail.setBounds(5, 95, 185, 14);
		frameLogin.getContentPane().add(labelEmail);

		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setForeground(Color.LIGHT_GRAY);
		labelSenha.setFont(new Font("Papyrus", Font.PLAIN, 11));
		labelSenha.setBounds(5, 147, 149, 14);
		frameLogin.getContentPane().add(labelSenha);

		TextField textFieldEmail = new TextField();
		textFieldEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textFieldEmail.getText().equals("E-mail")) {
					textFieldEmail.setText(null);
					textFieldEmail.requestFocus();
					removePlaceholderStyle(textFieldEmail);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldEmail.getText().length() == 0) {
					addPlaceholderStyle(textFieldEmail);
					textFieldEmail.setText("E-mail");
				}

			}
		});
		textFieldEmail.setBounds(5, 115, 324, 22);
		frameLogin.getContentPane().add(textFieldEmail);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBorder(null);
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnEntrar.setBackground(Color.LIGHT_GRAY);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email, senha, emailRegistro, senhaRegistro;
				senha = passwordField.getText();
				email = textFieldEmail.getText();
				emailRegistro = Registro.getEmailRegistro();
				senhaRegistro = Registro.getSenhaRegistro();
				
				if (email.equals(emailRegistro)) {
					if(senha.equals(senhaRegistro)) {
						frameLogin.dispose();
						frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						TelaInicio.main(null);
					} else {
						labelSenha.setText("Senha incorreta");
						}
				} else {
					labelEmail.setText("Email inválido");
				}
			}
		});
		btnEntrar.setBounds(235, 227, 89, 23);
		frameLogin.getContentPane().add(btnEntrar);

		JButton btnNovoRegistro = new JButton("Registre-se");
		btnNovoRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNovoRegistro.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnNovoRegistro.setBorder(null);
		btnNovoRegistro.setBackground(Color.LIGHT_GRAY);
		btnNovoRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameLogin.dispose();
				frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Registro.main(null);
			}
		});
		btnNovoRegistro.setBounds(10, 227, 113, 23);
		frameLogin.getContentPane().add(btnNovoRegistro);

		passwordField = new JPasswordField();
		passwordField.setBounds(5, 172, 324, 20);
		frameLogin.getContentPane().add(passwordField);

		frameLogin.setVisible(true);
	}
}
