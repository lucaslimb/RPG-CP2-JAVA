package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import metodos.ArmazenamentoPersonagens;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;

public class TelaHerois {

	private JFrame frameHerois;
	private String nome1, nome2, nome3, classe1, classe2, classe3, raca1, raca2, raca3, rating1, rating2, rating3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHerois window = new TelaHerois();
					window.frameHerois.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaHerois() {
		initialize();
	}

	private void initialize() {
		frameHerois = new JFrame();
		frameHerois.setResizable(false);
		frameHerois.setBounds(100, 100, 450, 350);
		frameHerois.setLocationRelativeTo(null);
		frameHerois.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHerois.setTitle("Meus personagens");
		frameHerois.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaHerois.class.getResource("/imagens/IconNecromante.png")));
		frameHerois.getContentPane().setBackground(Color.DARK_GRAY);
		frameHerois.getContentPane().setLayout(null);
		
		String caminhoImagem = "/imagens/bandido.png";
		String caminhoImagem2 = "/imagens/bandido.png";
		String caminhoImagem3 = "/imagens/bandido.png";

	
		
		nome1 = ArmazenamentoPersonagens.getNome(0);
		classe1 = ArmazenamentoPersonagens.getClasse(0);
		raca1 = ArmazenamentoPersonagens.getRaca(0);
		rating1 = ArmazenamentoPersonagens.getRating(0);
		
		if(classe1.equals("Bandido")) {
			caminhoImagem = "/imagens/bandido.png";
		}
		else if(classe1.equals("Bárbaro")) {
			caminhoImagem = "/imagens/barbaro.png";
		}
		else if(classe1.equals("Guerreiro")) {
			caminhoImagem = "/imagens/guerreiro1.png";
		}
		else if(classe1.equals("Mago")) {
			caminhoImagem = "/imagens/mago.png";
		}
		else if(classe1.equals("Necromante")) {
			caminhoImagem = "/imagens/necromante.png";
		}
		
		JLabel labelNome2 = new JLabel("...");
		labelNome2.setVerticalAlignment(SwingConstants.TOP);
		labelNome2.setBorder(null);
		labelNome2.setForeground(Color.WHITE);
		labelNome2.setFont(new Font("Papyrus", Font.PLAIN, 15));
		labelNome2.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome2.setBounds(150, 11, 130, 21);
		frameHerois.getContentPane().add(labelNome2);
		
		JLabel labelNome3 = new JLabel("...");
		labelNome3.setVerticalAlignment(SwingConstants.TOP);
		labelNome3.setBorder(null);
		labelNome3.setForeground(Color.WHITE);
		labelNome3.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome3.setFont(new Font("Papyrus", Font.PLAIN, 15));
		labelNome3.setBounds(294, 11, 130, 21);
		frameHerois.getContentPane().add(labelNome3);
		
		JLabel labelNome1 = new JLabel("...");
		labelNome1.setBorder(null);
		labelNome1.setVerticalAlignment(SwingConstants.TOP);
		labelNome1.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome1.setFont(new Font("Papyrus", Font.PLAIN, 15));
		labelNome1.setForeground(Color.WHITE);
		labelNome1.setBounds(10, 11, 130, 21);
		frameHerois.getContentPane().add(labelNome1);
		
		JLabel labelImg1 = new JLabel("");
		JLabel labelClasse1 = new JLabel("");
		JLabel labelRating = new JLabel("");
		
		JLabel labelImg2 = new JLabel("");
		JLabel labelClasse2 = new JLabel("");
		JLabel labelRating2 = new JLabel("");
		
		JLabel labelImg3 = new JLabel("");
		JLabel labelClasse3 = new JLabel("");
		JLabel labelRating3 = new JLabel("");
		
		if(ArmazenamentoPersonagens.getPersonagens().size() > 0) {
			labelNome1.setText(nome1);
			
			
			labelImg1.setHorizontalAlignment(SwingConstants.CENTER);
			labelImg1.setIcon(new ImageIcon(TelaHerois.class.getResource(caminhoImagem)));
			labelImg1.setBounds(10, 36, 130, 175);
			frameHerois.getContentPane().add(labelImg1);
			
			labelClasse1.setText(raca1 + " - " +classe1);
			labelClasse1.setForeground(Color.LIGHT_GRAY);
			labelClasse1.setFont(new Font("Papyrus", Font.PLAIN, 11));
			labelClasse1.setHorizontalAlignment(SwingConstants.CENTER);
			labelClasse1.setBounds(10, 215, 130, 14);
			frameHerois.getContentPane().add(labelClasse1);
			
			labelRating.setText(rating1);
			labelRating.setHorizontalAlignment(SwingConstants.CENTER);
			labelRating.setFont(new Font("Papyrus", Font.PLAIN, 15));
			labelRating.setBounds(10, 240, 130, 21);
			frameHerois.getContentPane().add(labelRating);
			
			if(rating1 == "C")
				labelRating.setForeground(Color.RED);
			else if(rating1 == "B")
				labelRating.setForeground(Color.YELLOW);
			else
				labelRating.setForeground(Color.GREEN);
		}
		
	
		
		if(ArmazenamentoPersonagens.getPersonagens().size() > 1) {
			nome2 = ArmazenamentoPersonagens.getNome(1);
			classe2 = ArmazenamentoPersonagens.getClasse(1);
			raca2 = ArmazenamentoPersonagens.getRaca(1);
			rating2 = ArmazenamentoPersonagens.getRating(1);
			
			labelNome2.setText(nome2);
			
			if(classe2.equals("Bandido")) {
				caminhoImagem2 = "/imagens/bandido.png";
			}
			else if(classe2.equals("Bárbaro")) {
				caminhoImagem2 = "/imagens/barbaro.png";
			}
			else if(classe2.equals("Guerreiro")) {
				caminhoImagem2 = "/imagens/guerreiro1.png";
			}
			else if(classe2.equals("Mago")) {
				caminhoImagem2 = "/imagens/mago.png";
			}
			else if(classe2.equals("necromante")) {
				caminhoImagem2 = "/imagens/necromante.png";
			}
			
			
			labelImg2.setHorizontalAlignment(SwingConstants.CENTER);
			labelImg2.setIcon(new ImageIcon(TelaHerois.class.getResource(caminhoImagem2)));
			labelImg2.setBounds(150, 36, 130, 175);
			frameHerois.getContentPane().add(labelImg2);
			
			labelClasse2.setText(raca2 + " - " +classe2);
			labelClasse2.setForeground(Color.LIGHT_GRAY);
			labelClasse2.setFont(new Font("Papyrus", Font.PLAIN, 11));
			labelClasse2.setHorizontalAlignment(SwingConstants.CENTER);
			labelClasse2.setBounds(150, 215, 130, 14);
			frameHerois.getContentPane().add(labelClasse2);
			
			labelRating2.setText(rating2);
			labelRating2.setHorizontalAlignment(SwingConstants.CENTER);
			labelRating2.setFont(new Font("Papyrus", Font.PLAIN, 15));
			labelRating2.setBounds(150, 240, 130, 21);
			frameHerois.getContentPane().add(labelRating2);
			
			if(rating2 == "C")
				labelRating2.setForeground(Color.RED);
			else if(rating2 == "B")
				labelRating2.setForeground(Color.YELLOW);
			else
				labelRating2.setForeground(Color.GREEN);
		}
			
		if(ArmazenamentoPersonagens.getPersonagens().size() > 2) {
			nome3 = ArmazenamentoPersonagens.getNome(2);
			classe3 = ArmazenamentoPersonagens.getClasse(2);
			raca3 = ArmazenamentoPersonagens.getRaca(2);
			rating3 = ArmazenamentoPersonagens.getRating(2);
			
			labelNome3.setText(nome3);
			
			if(classe3.equals("Bandido")) {
				caminhoImagem3 = "/imagens/bandido.png";
			}
			else if(classe3.equals("Bárbaro")) {
				caminhoImagem3 = "/imagens/barbaro.png";
			}
			else if(classe3.equals("Guerreiro")) {
				caminhoImagem3 = "/imagens/guerreiro1.png";
			}
			else if(classe3.equals("Mago")) {
				caminhoImagem3 = "/imagens/mago.png";
			}
			else if(classe3.equals("Necromante")) {
				caminhoImagem3 = "/imagens/necromante.png";
			}
			
			
			labelImg3.setHorizontalAlignment(SwingConstants.CENTER);
			labelImg3.setIcon(new ImageIcon(TelaHerois.class.getResource(caminhoImagem3)));
			labelImg3.setBounds(294, 36, 130, 175);
			frameHerois.getContentPane().add(labelImg3);
			
			labelClasse3.setText(raca3 + " - " +classe3);
			labelClasse3.setForeground(Color.LIGHT_GRAY);
			labelClasse3.setFont(new Font("Papyrus", Font.PLAIN, 11));
			labelClasse3.setHorizontalAlignment(SwingConstants.CENTER);
			labelClasse3.setBounds(294, 215, 130, 14);
			frameHerois.getContentPane().add(labelClasse3);
			
			labelRating3.setText(rating3);
			labelRating3.setFont(new Font("Papyrus", Font.PLAIN, 15));
			labelRating3.setHorizontalAlignment(SwingConstants.CENTER);
			labelRating3.setBounds(294, 240, 130, 21);
			frameHerois.getContentPane().add(labelRating3);
			
			if(rating3 == "C")
				labelRating3.setForeground(Color.RED);
			else if(rating3 == "B")
				labelRating3.setForeground(Color.YELLOW);
			else
				labelRating3.setForeground(Color.GREEN);
		}
		
		
		
		
		
		JButton btnCriarNovo = new JButton("Criar novo");
		btnCriarNovo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCriarNovo.setForeground(Color.BLACK);
		btnCriarNovo.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnCriarNovo.setBorder(null);
		btnCriarNovo.setBackground(Color.LIGHT_GRAY);
		btnCriarNovo.setBounds(150, 277, 134, 23);
		frameHerois.getContentPane().add(btnCriarNovo);
		
		if(ArmazenamentoPersonagens.getPersonagens().size() == 3)
			btnCriarNovo.setEnabled(false);
		
		btnCriarNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						frameHerois.dispose();
						TelaInicio.main(null);
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnSair.setBorder(null);
		btnSair.setBackground(Color.LIGHT_GRAY);
		btnSair.setBounds(294, 277, 130, 23);
		frameHerois.getContentPane().add(btnSair);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnLimpar.setBorder(null);
		btnLimpar.setBackground(Color.LIGHT_GRAY);
		btnLimpar.setBounds(10, 277, 130, 23);
		frameHerois.getContentPane().add(btnLimpar);

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						frameHerois.dispose();
			}
		});


		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						ArmazenamentoPersonagens.limparPersonagens();
						btnCriarNovo.setEnabled(true);
						
						labelNome1.setText("...");
						labelImg1.setVisible(false);
						labelClasse1.setText("");
						labelRating.setText("");
						
						labelNome2.setText("...");
						labelImg2.setVisible(false);
						labelClasse2.setText("");
						labelRating2.setText("");
						
						labelNome3.setText("...");
						labelImg3.setVisible(false);
						labelClasse3.setText("");
						labelRating3.setText("");
			}
		});
		
		
	}
}
