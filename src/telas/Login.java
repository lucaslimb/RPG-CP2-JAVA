package telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.TextField;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Cursor;

public class Login {

	private JFrame frameLogin;

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
					Login window = new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frameLogin = new JFrame();
		frameLogin.getContentPane().setFont(new Font("Papyrus", Font.PLAIN, 12));
		frameLogin.getContentPane().setBackground(Color.DARK_GRAY);
		frameLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/telas/IconNecromante.png")));
		frameLogin.setTitle("Login");
		frameLogin.setBounds(100, 100, 355, 300);
		frameLogin.getContentPane().setLayout(null);
		frameLogin.setVisible(true);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Papyrus", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(5, 54, 319, 22);
		frameLogin.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(5, 95, 46, 14);
		frameLogin.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setFont(new Font("Papyrus", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(5, 147, 46, 14);
		frameLogin.getContentPane().add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(235, 227, 89, 23);
		frameLogin.getContentPane().add(btnNewButton);

		
		TextField textField = new TextField();
		
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("Senha")) {
					textField.setText(null);
					textField.requestFocus();
					removePlaceholderStyle(textField);
					textField.setEchoChar('*');
				}
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

		textField.setBounds(5, 167, 324, 22);
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
		textField_1.setBounds(5, 115, 324, 22);
		frameLogin.getContentPane().add(textField_1);
		
		JButton btnNovoRegistro = new JButton("Registre-se");
		btnNovoRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNovoRegistro.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnNovoRegistro.setBorder(null);
		btnNovoRegistro.setBackground(Color.LIGHT_GRAY);
		btnNovoRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameLogin.dispose();
			}
		});
		btnNovoRegistro.setBounds(10, 227, 113, 23);
		frameLogin.getContentPane().add(btnNovoRegistro);
		
		JLabel lblNewLabel_2 = new JLabel("BuildMaker");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setBounds(10, 11, 319, 32);
		frameLogin.getContentPane().add(lblNewLabel_2);
		
		frameLogin.setVisible(true);
	}
}
