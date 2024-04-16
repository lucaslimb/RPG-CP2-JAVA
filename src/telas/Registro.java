package telas;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class Registro {

	private JFrame frmRegistro;
	private JFrame frameLogin;
	private String email, senha, confirmaSenha, nome, senhaRegistro, emailRegistro;

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
					window.frameLogin.setVisible(true);
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
		initializeLogin();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.getContentPane().setBackground(Color.DARK_GRAY);
		frmRegistro.setTitle("Registro");
		frmRegistro.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				this.windowGainedFocus(e);
			}
		});
		frmRegistro.setBounds(100, 100, 378, 300);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);

		TextField txtEmail = new TextField();
		txtEmail.setBounds(10, 32, 342, 22);
		frmRegistro.getContentPane().add(txtEmail);

		JLabel labelConfirmaSenha = new JLabel("Confirmar senha");
		labelConfirmaSenha.setForeground(Color.LIGHT_GRAY);
		labelConfirmaSenha.setFont(new Font("Marcellus SC", Font.PLAIN, 11));
		labelConfirmaSenha.setBounds(10, 160, 342, 14);
		frmRegistro.getContentPane().add(labelConfirmaSenha);

		TextField txtNome = new TextField();
		txtNome.setBounds(10, 82, 342, 22);
		frmRegistro.getContentPane().add(txtNome);

		TextField txtSenha = new TextField();
		txtSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtSenha.setEchoChar('*');
			}
		});
		txtSenha.setBounds(10, 132, 342, 22);
		frmRegistro.getContentPane().add(txtSenha);

		TextField txtConfirmaSenha = new TextField();
		txtConfirmaSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtConfirmaSenha.setEchoChar('*');
			}
		});
		txtConfirmaSenha.setBounds(10, 180, 342, 22);
		frmRegistro.getContentPane().add(txtConfirmaSenha);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(Color.LIGHT_GRAY);
		btnRegistrar.setFont(new Font("Marcellus SC", Font.BOLD, 11));
		btnRegistrar.setBorder(null);
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = txtNome.getText();
				emailRegistro = txtEmail.getText();
				senhaRegistro = txtSenha.getText();
				confirmaSenha = txtConfirmaSenha.getText();
				if (senhaRegistro.equals(confirmaSenha)) {
					frmRegistro.dispose();
					frameLogin.setBounds(100, 100, 355, 300);
					frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frameLogin.setVisible(true);

				} else {
					labelConfirmaSenha.setText("Confirmar senha - não coincidem");
				}
			}
		});
		btnRegistrar.setBounds(263, 227, 89, 23);
		frmRegistro.getContentPane().add(btnRegistrar);

		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setForeground(Color.LIGHT_GRAY);
		labelSenha.setFont(new Font("Marcellus SC", Font.PLAIN, 11));
		labelSenha.setBounds(10, 112, 46, 14);
		frmRegistro.getContentPane().add(labelSenha);

		JLabel labelEmail = new JLabel("E-mail");
		labelEmail.setForeground(Color.LIGHT_GRAY);
		labelEmail.setFont(new Font("Marcellus SC", Font.PLAIN, 11));
		labelEmail.setHorizontalAlignment(SwingConstants.LEFT);
		labelEmail.setBounds(10, 62, 46, 14);
		frmRegistro.getContentPane().add(labelEmail);

		JLabel labelNome = new JLabel("Nome");
		labelNome.setForeground(Color.LIGHT_GRAY);
		labelNome.setFont(new Font("Marcellus SC", Font.PLAIN, 11));
		labelNome.setHorizontalAlignment(SwingConstants.LEFT);
		labelNome.setBounds(10, 11, 46, 14);
		frmRegistro.getContentPane().add(labelNome);

	}

	void initializeLogin() {
		frameLogin = new JFrame();
		frameLogin.setBounds(100, 100, 355, 300);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.getContentPane().setLayout(null);

		JLabel labelLogin = new JLabel("Login");
		labelLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelLogin.setHorizontalAlignment(SwingConstants.CENTER);
		labelLogin.setBounds(10, 11, 319, 22);
		frameLogin.getContentPane().add(labelLogin);

		JLabel labelEmail = new JLabel("E-mail");
		labelEmail.setBounds(10, 49, 46, 14);
		frameLogin.getContentPane().add(labelEmail);

		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(10, 101, 46, 14);
		frameLogin.getContentPane().add(labelSenha);

		TextField textField = new TextField();

		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("Senha")) {
					textField.setText(null);
					textField.requestFocus();
					removePlaceholderStyle(textField);
					
				}
				textField.setEchoChar('*');
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().length() == 0) {
					addPlaceholderStyle(textField);
					textField.setText("Senha");
					textField.setEchoChar('\u0000');
				}
			}
		});

		textField.setBounds(10, 121, 319, 22);
		frameLogin.getContentPane().add(textField);

		TextField textField_1 = new TextField();
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_1.getText().equals("E-mail")) {
					textField_1.setText(null);
					textField_1.requestFocus();
					removePlaceholderStyle(textField_1);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textField_1.getText().length() == 0) {
					addPlaceholderStyle(textField_1);
					textField_1.setText("E-mail");
				}

			}
		});
		textField_1.setBounds(10, 69, 319, 22);
		frameLogin.getContentPane().add(textField_1);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email = textField_1.getText();
				senha = textField.getText();
				if (email.equals(emailRegistro) && senha.equals(senhaRegistro)) {
					btnNewButton.setText("Sucesso!");
				} else {
					btnNewButton.setText("Erro");
				}
			}
		});
		btnNewButton.setBounds(235, 227, 89, 23);
		frameLogin.getContentPane().add(btnNewButton);

		JButton btnNovoRegistro = new JButton("Registre-se");
		btnNovoRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameLogin.dispose();
				frmRegistro.setBounds(100, 100, 378, 300);
				frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmRegistro.setVisible(true);
			}
		});
		btnNovoRegistro.setBounds(10, 227, 113, 23);
		frameLogin.getContentPane().add(btnNovoRegistro);
	}
}
