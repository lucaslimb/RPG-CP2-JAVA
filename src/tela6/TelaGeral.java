package tela6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;

public class TelaGeral {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGeral window = new TelaGeral();
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
	public TelaGeral() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);

		// Atributos dos personagens.
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("FORÇA");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblNewLabel.setBounds(8, 11, 60, 21);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblAgilidade = new JLabel("AGILIDADE");
		lblAgilidade.setForeground(Color.WHITE);
		lblAgilidade.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblAgilidade.setBounds(8, 33, 102, 21);
		frame.getContentPane().add(lblAgilidade);

		JLabel lblInteligncia = new JLabel("INTELIGÊNCIA");
		lblInteligncia.setForeground(Color.WHITE);
		lblInteligncia.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblInteligncia.setBounds(8, 55, 112, 22);
		frame.getContentPane().add(lblInteligncia);

		JLabel lblMagia = new JLabel("MAGIA");
		lblMagia.setForeground(Color.WHITE);
		lblMagia.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblMagia.setBounds(8, 78, 60, 21);
		frame.getContentPane().add(lblMagia);

		JLabel lblDestreza = new JLabel("DESTREZA");
		lblDestreza.setForeground(Color.WHITE);
		lblDestreza.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblDestreza.setBounds(8, 100, 102, 21);
		frame.getContentPane().add(lblDestreza);

		JLabel lblVida = new JLabel("VIDA");
		lblVida.setForeground(Color.WHITE);
		lblVida.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblVida.setBounds(8, 123, 60, 21);
		frame.getContentPane().add(lblVida);

		// Local para texto proprio de cada personagem.

		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(5, 150, 123, 111);
		frame.getContentPane().add(textArea);

		/*
		 * Pontos distrubuidos no personagens. 1-força, 2-agilidade, 3-inteliêngia,
		 * 4-magia, 5-destreza, 6-vida.
		 */

		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_1.setBounds(125, 13, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("2");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(125, 37, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("3");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(125, 58, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("4");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(125, 81, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("5");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(125, 104, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("6");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(125, 127, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_5);

		// Nome do personagem.

		JLabel lblNewLabel_2 = new JLabel("Nome Personagem");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD, 19));
		lblNewLabel_2.setBounds(190, 14, 80, 29);
		frame.getContentPane().add(lblNewLabel_2);

		// Imagem do personagens.

		JLabel lblNewLabel_3 = new JLabel("imagem personagem");
		lblNewLabel_3.setBounds(156, 51, 144, 207);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("RATING");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setBounds(324, 11, 112, 34);
		frame.getContentPane().add(lblNewLabel_4);

		// lugar de nota do rating.

		JLabel lblNewLabel_5 = new JLabel("B");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setToolTipText("NOTA RATING");
		lblNewLabel_5.setFont(new Font("Papyrus", Font.BOLD, 25));
		lblNewLabel_5.setBounds(334, 55, 73, 64);
		frame.getContentPane().add(lblNewLabel_5);

		// Botão de voltar pagina

		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Papyrus", Font.BOLD, 11));
		btnNewButton.setBounds(334, 232, 97, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
