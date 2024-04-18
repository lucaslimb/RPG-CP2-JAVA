package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;
import java.awt.ComponentOrientation;

public class TelaGeral {

	private JFrame frmCard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGeral window = new TelaGeral();
					window.frmCard.setVisible(true);
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
		frmCard = new JFrame();
		frmCard.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaGeral.class.getResource("/imagens/IconNecromante.png")));
		frmCard.setTitle("Card do herói");
		frmCard.getContentPane().setBackground(Color.DARK_GRAY);

		// Atributos dos personagens.
		frmCard.setBounds(100, 100, 450, 300);
		frmCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCard.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Força");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblNewLabel.setBounds(12, 11, 60, 21);
		frmCard.getContentPane().add(lblNewLabel);

		JLabel lblAgilidade = new JLabel("Agilidade");
		lblAgilidade.setForeground(Color.LIGHT_GRAY);
		lblAgilidade.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblAgilidade.setBounds(12, 33, 102, 21);
		frmCard.getContentPane().add(lblAgilidade);

		JLabel lblInteligncia = new JLabel("Inteligência");
		lblInteligncia.setForeground(Color.LIGHT_GRAY);
		lblInteligncia.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblInteligncia.setBounds(12, 55, 112, 22);
		frmCard.getContentPane().add(lblInteligncia);

		JLabel lblMagia = new JLabel("Magia");
		lblMagia.setForeground(Color.LIGHT_GRAY);
		lblMagia.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblMagia.setBounds(12, 78, 60, 21);
		frmCard.getContentPane().add(lblMagia);

		JLabel lblDestreza = new JLabel("Destreza");
		lblDestreza.setForeground(Color.LIGHT_GRAY);
		lblDestreza.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblDestreza.setBounds(12, 100, 102, 21);
		frmCard.getContentPane().add(lblDestreza);

		JLabel lblVida = new JLabel("Vida");
		lblVida.setForeground(Color.LIGHT_GRAY);
		lblVida.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblVida.setBounds(12, 123, 60, 21);
		frmCard.getContentPane().add(lblVida);

		// Local para texto proprio de cada personagem.

		JTextArea txtrVindoDoorigem = new JTextArea();
		txtrVindoDoorigem.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtrVindoDoorigem.setForeground(Color.LIGHT_GRAY);
		txtrVindoDoorigem.setLineWrap(true);
		txtrVindoDoorigem.setFont(new Font("Papyrus", Font.PLAIN, 12));
		txtrVindoDoorigem.setText("Vindo do @origem, o @raça @classe conhecido como @nome, motivado por @motivação, veio ao Mundo Terreno para enfrentar suas provações e se erguer como uma lenda imortalizada nos contos");
		txtrVindoDoorigem.setEditable(false);
		txtrVindoDoorigem.setBackground(Color.DARK_GRAY);
		txtrVindoDoorigem.setBounds(300, 11, 123, 201);
		frmCard.getContentPane().add(txtrVindoDoorigem);

		JLabel lblNewLabel_1_5 = new JLabel("1");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Papyrus", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(108, 126, 49, 14);
		frmCard.getContentPane().add(lblNewLabel_1_5);

		// Nome do personagem.

		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD, 22));
		lblNewLabel_2.setBounds(142, 12, 142, 29);
		frmCard.getContentPane().add(lblNewLabel_2);

		// Imagem do personagens.

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(TelaGeral.class.getResource("/imagens/necromante.png")));
		lblNewLabel_3.setBounds(124, 33, 190, 216);
		frmCard.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("RATING");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setBounds(5, 142, 141, 34);
		frmCard.getContentPane().add(lblNewLabel_4);

		// lugar de nota do rating.

		JLabel lblNewLabel_5 = new JLabel("B");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setToolTipText("Nota do personagem, considerando os atributos e classe.");
		lblNewLabel_5.setFont(new Font("Papyrus", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(39, 175, 73, 47);
		frmCard.getContentPane().add(lblNewLabel_5);

		// Botão de voltar pagina

		
		
		JLabel lblNewLabel_1_5_1 = new JLabel("1");
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Papyrus", Font.BOLD, 16));
		lblNewLabel_1_5_1.setBounds(107, 104, 49, 14);
		frmCard.getContentPane().add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("1");
		lblNewLabel_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2.setFont(new Font("Papyrus", Font.BOLD, 16));
		lblNewLabel_1_5_2.setBounds(108, 82, 49, 14);
		frmCard.getContentPane().add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("1");
		lblNewLabel_1_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_1_5_3.setFont(new Font("Papyrus", Font.BOLD, 16));
		lblNewLabel_1_5_3.setBounds(107, 59, 49, 14);
		frmCard.getContentPane().add(lblNewLabel_1_5_3);
		
		JLabel lblNewLabel_1_5_4 = new JLabel("1");
		lblNewLabel_1_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_4.setForeground(Color.WHITE);
		lblNewLabel_1_5_4.setFont(new Font("Papyrus", Font.BOLD, 16));
		lblNewLabel_1_5_4.setBounds(108, 37, 49, 14);
		frmCard.getContentPane().add(lblNewLabel_1_5_4);
		
		JLabel lblNewLabel_1_5_5 = new JLabel("1");
		lblNewLabel_1_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_5.setForeground(Color.WHITE);
		lblNewLabel_1_5_5.setFont(new Font("Papyrus", Font.BOLD, 16));
		lblNewLabel_1_5_5.setBounds(108, 15, 49, 14);
		frmCard.getContentPane().add(lblNewLabel_1_5_5);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBorder(null);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnVoltar.setBackground(Color.LIGHT_GRAY);
		btnVoltar.setBounds(12, 226, 123, 23);
		frmCard.getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCard.dispose();
				TelaBackground.main(null);
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBorder(null);
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.LIGHT_GRAY);
		btnSair.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnSair.setBounds(300, 226, 123, 23);
		frmCard.getContentPane().add(btnSair);
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCard.dispose();	
			}
		});
	}
}
