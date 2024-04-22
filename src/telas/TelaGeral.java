package telas;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import metodos.ArmazenamentoPersonagens;
import metodos.Personagem;

public class TelaGeral {

	private JFrame frmCard;
	private String classe;
	private String notaFinal;
	private String raca;
	private String nomePersonagem;
	
	private void SalvarPersonagem(String nomePersonagem, String classe, String raca, String rating) {
		String nome = nomePersonagem;
		String classe1 = classe; 
		String raca1 = raca;
		String rating1 = rating;
		Personagem personagem = new Personagem(nome, classe1, raca1, rating1);
		
		ArmazenamentoPersonagens.adicionarPersonagem(personagem);
		
	}
	
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

	public TelaGeral() {
		initialize();
	}

	private void initialize() {
		frmCard = new JFrame();
		frmCard.setResizable(false);
		frmCard.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaGeral.class.getResource("/imagens/IconNecromante.png")));
		frmCard.setTitle("Card do personagem");
		frmCard.getContentPane().setBackground(Color.DARK_GRAY);
		frmCard.setBounds(450, 200, 450, 300);
		frmCard.setLocationRelativeTo(null);
		frmCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCard.getContentPane().setLayout(null);

		//Texto do personagem

		String origem = TelaBackground.getEscolhaOrigem();
		raca = TelaInicio.getEscolhaRaca();
		
		classe = TelaCriacao.getEscolhaClasse();
		if(classe == null)
			classe = "Guerreiro";
		
		String nome = TelaInicio.getNomeHeroi();
		String motivacaoF = TelaBackground.getMtvF();
		String motivacaoP = TelaBackground.getMtvP();
		String motivacaoV = TelaBackground.getMtvV();
		String motivacaoA = TelaBackground.getMtvA();
		String motivacaoC = TelaBackground.getMtvC();
		String motivacaoN = TelaBackground.getMtvN();
		String motivo;
		String numMtv = null;
		Random r = new Random();

		 ArrayList<String> motivos = new ArrayList<String>();
		 
		 if(motivacaoF != "0") {
			 motivos.add(motivacaoF);	 
		 }
		 if(motivacaoP != "0") {
			 motivos.add(motivacaoP);		 
		 }
		 if(motivacaoV != "0") {
			 motivos.add(motivacaoV);	 
		 }
		 if(motivacaoA != "0") {
			 motivos.add(motivacaoA);	 
		 }
		 if(motivacaoC != "0") {
			 motivos.add(motivacaoC);	 
		 }
		 
		 if(motivacaoN != "0") {
			 motivo = motivacaoN;
		 }
		 else {
			 int mtvEscolhido = r.nextInt(motivos.size());
			 motivo = motivos.get(mtvEscolhido);
		 }
		
		 if(motivos.size() == 1) {
			 numMtv = "apenas";
		 }
		 else if(motivos.size() == 0) {
			 numMtv = "(estranhamente)";
		 }
		 else
			 numMtv = "sobretudo";
		 
		JTextArea textoHeroi = new JTextArea();
		textoHeroi.setWrapStyleWord(true);
		textoHeroi.setFocusable(false);
		textoHeroi.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textoHeroi.setForeground(Color.LIGHT_GRAY);
		textoHeroi.setLineWrap(true);
		textoHeroi.setFont(new Font("Papyrus", Font.PLAIN, 12));
		textoHeroi.setText("Motivado " + numMtv + " " + motivo + ", o " + raca.toLowerCase() + " " + classe.toLowerCase() + 
				" conhecido como " + nome + ", deixou " + origem + " e veio a este Mundo enfrentar suas provações");
		textoHeroi.setEditable(false);
		textoHeroi.setBackground(Color.DARK_GRAY);
		textoHeroi.setBounds(300, 11, 123, 168);
		frmCard.getContentPane().add(textoHeroi);

		// Nome do personagem.
		nomePersonagem = TelaInicio.getNomeHeroi();
		
		JLabel nomeHeroi = new JLabel(nomePersonagem);
		nomeHeroi.setHorizontalAlignment(SwingConstants.CENTER);
		nomeHeroi.setForeground(Color.WHITE);
		nomeHeroi.setFont(new Font("Papyrus", Font.BOLD, 22));
		nomeHeroi.setBounds(142, 12, 142, 29);
		frmCard.getContentPane().add(nomeHeroi);

		//Imagem da classe
		String caminhoImagem = "/imagens/bandido.png";
			
		if(classe.equals("Bandido")) {
			caminhoImagem = "/imagens/bandido.png";
		}
		else if(classe.equals("Bárbaro")) {
			caminhoImagem = "/imagens/barbaro.png";
		}
		else if(classe.equals("Guerreiro")) {
			caminhoImagem = "/imagens/guerreiro1.png";
		}
		else if(classe.equals("Mago")) {
			caminhoImagem = "/imagens/mago.png";
		}
		else if(classe.equals("Necromante")) {
			caminhoImagem = "/imagens/necromante.png";
		}
		
		JLabel imagemClasse = new JLabel("");
		imagemClasse.setHorizontalAlignment(SwingConstants.CENTER);
		imagemClasse.setIcon(new ImageIcon(TelaGeral.class.getResource(caminhoImagem)));
		imagemClasse.setBounds(132, 39, 177, 183);
		frmCard.getContentPane().add(imagemClasse);

		//Pontos do personagem
		
		JLabel labelF = new JLabel("Força");
		labelF.setForeground(Color.LIGHT_GRAY);
		labelF.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelF.setBounds(12, 11, 60, 21);
		frmCard.getContentPane().add(labelF);

		JLabel labelA = new JLabel("Agilidade");
		labelA.setForeground(Color.LIGHT_GRAY);
		labelA.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelA.setBounds(12, 33, 102, 21);
		frmCard.getContentPane().add(labelA);

		JLabel labelI = new JLabel("Inteligência");
		labelI.setForeground(Color.LIGHT_GRAY);
		labelI.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelI.setBounds(12, 55, 93, 22);
		frmCard.getContentPane().add(labelI);

		JLabel labelM = new JLabel("Magia");
		labelM.setForeground(Color.LIGHT_GRAY);
		labelM.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelM.setBounds(12, 78, 60, 21);
		frmCard.getContentPane().add(labelM);

		JLabel labelD = new JLabel("Destreza");
		labelD.setForeground(Color.LIGHT_GRAY);
		labelD.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelD.setBounds(12, 100, 102, 21);
		frmCard.getContentPane().add(labelD);

		JLabel labelV = new JLabel("Vida");
		labelV.setForeground(Color.LIGHT_GRAY);
		labelV.setFont(new Font("Papyrus", Font.PLAIN, 12));
		labelV.setBounds(12, 123, 60, 21);
		frmCard.getContentPane().add(labelV);
		
		int totalF = TelaCriacao.getPontosF();
		int totalA = TelaCriacao.getPontosA();
		int totalI = TelaCriacao.getPontosI();
		int totalM = TelaCriacao.getPontosM();
		int totalD = TelaCriacao.getPontosD();
		int totalV = TelaCriacao.getPontosV();
		int notaF = 0;
		int notaA = 0;
		int notaI = 0;
		int notaM = 0;
		int notaD = 0;
		int notaV = 0;
		int somaNotas = 0;
		double mediaNotas = 0;
		notaFinal = "";

		
		JLabel pontosF = new JLabel("" + totalF);
		pontosF.setHorizontalAlignment(SwingConstants.CENTER);
		pontosF.setForeground(Color.WHITE);
		pontosF.setFont(new Font("Papyrus", Font.BOLD, 16));
		pontosF.setBounds(107, 15, 49, 14);
		frmCard.getContentPane().add(pontosF);
		
		JLabel pontosA = new JLabel("" + totalA);
		pontosA.setHorizontalAlignment(SwingConstants.CENTER);
		pontosA.setForeground(Color.WHITE);
		pontosA.setFont(new Font("Papyrus", Font.BOLD, 16));
		pontosA.setBounds(107, 37, 49, 14);
		frmCard.getContentPane().add(pontosA);
		
		JLabel pontosI = new JLabel("" + totalI);
		pontosI.setHorizontalAlignment(SwingConstants.CENTER);
		pontosI.setForeground(Color.WHITE);
		pontosI.setFont(new Font("Papyrus", Font.BOLD, 16));
		pontosI.setBounds(107, 59, 49, 14);
		frmCard.getContentPane().add(pontosI);
		
		JLabel pontosM = new JLabel("" + totalM);
		pontosM.setHorizontalAlignment(SwingConstants.CENTER);
		pontosM.setForeground(Color.WHITE);
		pontosM.setFont(new Font("Papyrus", Font.BOLD, 16));
		pontosM.setBounds(107, 82, 49, 14);
		frmCard.getContentPane().add(pontosM);
		
		JLabel pontosD = new JLabel("" + totalD);
		pontosD.setHorizontalAlignment(SwingConstants.CENTER);
		pontosD.setForeground(Color.WHITE);
		pontosD.setFont(new Font("Papyrus", Font.BOLD, 16));
		pontosD.setBounds(107, 104, 49, 14);
		frmCard.getContentPane().add(pontosD);
		
		JLabel pontosV = new JLabel("" + totalV);
		pontosV.setHorizontalAlignment(SwingConstants.CENTER);
		pontosV.setForeground(Color.WHITE);
		pontosV.setFont(new Font("Papyrus", Font.BOLD, 16));
		pontosV.setBounds(107, 126, 49, 14);
		frmCard.getContentPane().add(pontosV);
		
		switch(classe) {
			case "Bandido":
				if(totalF == 0) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF <= 5) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF <= 11) {
					pontosF.setForeground(Color.GREEN);
					notaF = 3;
				}
				else {
					pontosF.setForeground(Color.YELLOW);
					notaF = 2;
				}
				
				if(totalA == 0) {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}
				else if(totalA <= 10) {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}
				else if(totalA <= 15) {
					pontosA.setForeground(Color.YELLOW);
					notaA = 2;
				}
				else {
					pontosA.setForeground(Color.GREEN);
					notaA = 3;
				}
				
				if(totalI == 0) {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				else if(totalI <= 6) {
					pontosI.setForeground(Color.GREEN);
					notaI = 3;
				}
				else if(totalI <= 12) {
					pontosI.setForeground(Color.YELLOW);
					notaI = 2;
				}
				else {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				
				if(totalM == 0) {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				else if(totalM <= 5) {
					pontosM.setForeground(Color.GREEN);
					notaM = 3;
				}
				else if(totalM <= 10) {
					pontosM.setForeground(Color.YELLOW);
					notaM = 2;
				}
				else {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				
				if(totalD == 0) {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				else if(totalD <= 8) {
					pontosD.setForeground(Color.YELLOW);
					notaD = 2;
				}
				else if(totalD <= 12) {
					pontosD.setForeground(Color.GREEN);
					notaD = 3;
				}
				else {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				
				if(totalV == 0) {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				else if(totalV <= 5) {
					pontosV.setForeground(Color.GREEN);
					notaV = 3;
				}
				else if(totalV <= 9) {
					pontosV.setForeground(Color.YELLOW);
					notaV = 2;
				}
				else {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				
				break;
			case "Bárbaro":
				if(totalF == 0) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF <= 6) {
					pontosF.setForeground(Color.YELLOW);
					notaF = 2;
				}
				else if(totalF <= 12) {
					pontosF.setForeground(Color.GREEN);
					notaF = 3;
				}
				else {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				
				if(totalA == 0) {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}
				else if(totalA <= 5) {
					pontosA.setForeground(Color.GREEN);
					notaA = 3;
				}
				else if(totalA <= 8) {
					pontosA.setForeground(Color.YELLOW);
					notaA = 2;
				}
				else {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}

				if(totalI == 0) {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				else if(totalI <= 4) {
					pontosI.setForeground(Color.GREEN);
					notaI = 3;
				}
				else if(totalI <= 6) {
					pontosI.setForeground(Color.YELLOW);
					notaI = 2;
				}
				else {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				
				if(totalM == 0) {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				else if(totalM <= 4) {
					pontosM.setForeground(Color.GREEN);
					notaM = 3;
				}
				else if(totalM <= 7) {
					pontosM.setForeground(Color.YELLOW);
					notaM = 2;
				}
				else {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				
				if(totalD == 0) {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				else if(totalD <= 8) {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				else if(totalD <= 14) {
					pontosD.setForeground(Color.YELLOW);
					notaD = 2;
				}
				else {
					pontosD.setForeground(Color.GREEN);
					notaD = 3;
				}
				
				if(totalV == 0) {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				else if(totalV <= 10) {
					pontosV.setForeground(Color.YELLOW);
					notaV = 2;
				}
				else if(totalV <= 16) {
					pontosV.setForeground(Color.GREEN);
					notaV = 3;
				}
				else {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				
				break;
			case "Guerreiro":
				if(totalF == 0) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF <= 10) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF <= 15) {
					pontosF.setForeground(Color.YELLOW);
					notaF = 2;
				}
				else {
					pontosF.setForeground(Color.GREEN);
					notaF = 3;
				}
				
				if(totalA == 0) {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}
				else if(totalA <= 6) {
					pontosA.setForeground(Color.GREEN);
					notaA = 3;
				}
				else if(totalA <= 12) {
					pontosA.setForeground(Color.YELLOW);
					notaA = 2;
				}
				else {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}

				if(totalI == 0) {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				else if(totalI <= 4) {
					pontosI.setForeground(Color.GREEN);
					notaI = 3;
				}
				else if(totalI <= 7) {
					pontosI.setForeground(Color.YELLOW);
					notaI = 2;
				}
				else {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				
				if(totalM == 0) {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				else if(totalM <= 4) {
					pontosM.setForeground(Color.GREEN);
					notaM = 3;
				}
				else if(totalM <= 7) {
					pontosM.setForeground(Color.YELLOW);
					notaM = 2;
				}
				else {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				
				if(totalD == 0) {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				else if(totalD <= 7) {
					pontosD.setForeground(Color.YELLOW);
					notaD = 2;
				}
				else if(totalD <= 12) {
					pontosD.setForeground(Color.GREEN);
					notaD = 3;
				}
				else {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				
				if(totalV == 0) {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				else if(totalV <= 8) {
					pontosV.setForeground(Color.YELLOW);
					notaV = 2;
				}
				else if(totalV <= 13) {
					pontosV.setForeground(Color.GREEN);
					notaV = 3;
				}
				else {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				break;
			case "Mago":
				if(totalF == 0) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF <= 5) {
					pontosF.setForeground(Color.GREEN);
					notaF = 3;
				}
				else if(totalF <= 9) {
					pontosF.setForeground(Color.YELLOW);
					notaF = 2;
				}
				else {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				
				if(totalA == 0) {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}
				else if(totalA <= 7) {
					pontosA.setForeground(Color.GREEN);
					notaA = 3;
				}
				else if(totalA <= 12) {
					pontosA.setForeground(Color.YELLOW);
					notaA = 2;
				}
				else {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}

				if(totalI == 0) {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				else if(totalI <= 12) {
					pontosI.setForeground(Color.YELLOW);
					notaI = 2;
				}
				else if(totalI <= 17) {
					pontosI.setForeground(Color.GREEN);
					notaI = 3;
				}
				else {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				
				if(totalM == 0) {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				else if(totalM <= 10) {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				else if(totalM <= 15) {
					pontosM.setForeground(Color.YELLOW);
					notaM = 2;
				}
				else {
					pontosM.setForeground(Color.GREEN);
					notaM = 3;
				}
				
				if(totalD == 0) {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				else if(totalD <= 6) {
					pontosD.setForeground(Color.GREEN);
					notaD = 3;
				}
				else if(totalD <= 10) {
					pontosD.setForeground(Color.YELLOW);
					notaD = 2;
				}
				else {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				
				if(totalV == 0) {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				else if(totalV <= 5) {
					pontosV.setForeground(Color.GREEN);
					notaV = 3;
				}
				else if(totalV <= 9) {
					pontosV.setForeground(Color.YELLOW);
					notaV = 2;
				}
				else {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				
				break;
			case "Necromante":
				if(totalF == 0) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF == 0) {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				else if(totalF <= 6) {
					pontosF.setForeground(Color.GREEN);
					notaF = 3;
				}
				else if(totalF <= 11) {
					pontosF.setForeground(Color.YELLOW);
					notaF = 2;
				}
				else {
					pontosF.setForeground(Color.RED);
					notaF = 1;
				}
				
				if(totalA == 0) {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}
				else if(totalA == 0) {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}
				else if(totalA <= 6) {
					pontosA.setForeground(Color.GREEN);
					notaA = 3;
				}
				else if(totalA <= 11) {
					pontosA.setForeground(Color.YELLOW);
					notaA = 2;
				}
				else {
					pontosA.setForeground(Color.RED);
					notaA = 1;
				}

				if(totalI == 0) {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				else if(totalI == 0) {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				else if(totalI <= 6) {
					pontosI.setForeground(Color.RED);
					notaI = 1;
				}
				else if(totalI <= 12) {
					pontosI.setForeground(Color.GREEN);
					notaI = 3;
				}
				else {
					pontosI.setForeground(Color.YELLOW);
					notaI = 2;
				}
				
				if(totalM == 0) {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				else if(totalM == 0) {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				else if(totalM <= 12) {
					pontosM.setForeground(Color.YELLOW);
					notaM = 2;
				}
				else if(totalM <= 17) {
					pontosM.setForeground(Color.GREEN);
					notaM = 3;
				}
				else {
					pontosM.setForeground(Color.RED);
					notaM = 1;
				}
				
				if(totalD == 0) {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				else if(totalD == 0) {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				else if(totalD <= 6) {
					pontosD.setForeground(Color.YELLOW);
					notaD = 2;
				}
				else if(totalD <= 12) {
					pontosD.setForeground(Color.GREEN);
					notaD = 3;
				}
				else {
					pontosD.setForeground(Color.RED);
					notaD = 1;
				}
				
				if(totalV == 0) {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				else if(totalV == 0) {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				else if(totalV <= 5) {
					pontosV.setForeground(Color.YELLOW);
					notaV = 2;
				}
				else if(totalV <= 10) {
					pontosV.setForeground(Color.GREEN);
					notaV = 3;
				}
				else {
					pontosV.setForeground(Color.RED);
					notaV = 1;
				}
				
				break;
			default:
				break;
		}

		JLabel lblNewLabel_4 = new JLabel("RATING");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setBounds(5, 142, 141, 34);
		frmCard.getContentPane().add(lblNewLabel_4);
		
		somaNotas = notaF + notaA + notaI + notaM + notaD + notaV;
		mediaNotas = somaNotas / 6;
		
		if(mediaNotas < 1.5) {
			notaFinal = "C";
		}
		else if(mediaNotas < 2.5) {
			notaFinal = "B";
		}
		else {
			notaFinal = "A";
		}
		
		JLabel nota = new JLabel(notaFinal);
		nota.setHorizontalAlignment(SwingConstants.CENTER);
		nota.setToolTipText("Nota do personagem, considerando os atributos e classe.");
		nota.setFont(new Font("Papyrus", Font.PLAIN, 20));
		nota.setBounds(39, 175, 73, 47);
		frmCard.getContentPane().add(nota);
		
		if(notaFinal == "C")
			nota.setForeground(Color.RED);
		else if (notaFinal == "B")
			nota.setForeground(Color.YELLOW);
		else
			nota.setForeground(Color.GREEN);
		
		
		//Botões sair e voltar
		
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
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBorder(null);
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setBackground(Color.LIGHT_GRAY);
		btnSalvar.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnSalvar.setBounds(142, 226, 153, 23);
		frmCard.getContentPane().add(btnSalvar);
		
		JButton btnVerMeus = new JButton("Meus personagens");
		btnVerMeus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerMeus.setForeground(Color.BLACK);
		btnVerMeus.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnVerMeus.setBorder(null);
		btnVerMeus.setBackground(Color.LIGHT_GRAY);
		btnVerMeus.setBounds(300, 226, 123, 23);
		btnVerMeus.setEnabled(false);
		if(ArmazenamentoPersonagens.getPersonagens().size() > 0) {
			btnVerMeus.setEnabled(true);
		}
		frmCard.getContentPane().add(btnVerMeus);
		
		
		btnVerMeus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCard.dispose();
				TelaHerois.main(null);

			}
		});
		
		JButton btnNovo = new JButton("Criar novo");
		btnNovo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNovo.setForeground(Color.BLACK);
		btnNovo.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnNovo.setBorder(null);
		btnNovo.setBackground(Color.LIGHT_GRAY);
		btnNovo.setBounds(300, 199, 123, 23);
		frmCard.getContentPane().add(btnNovo);
		
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						frmCard.dispose();
						TelaInicio.main(null);
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalvarPersonagem(nomePersonagem, classe, raca, notaFinal);
				btnSalvar.setText("Salvo!");
				if(ArmazenamentoPersonagens.getPersonagens().size() == 3)
					btnNovo.setEnabled(false);
				btnVerMeus.setEnabled(true);
				btnVoltar.setEnabled(false);
				btnSalvar.setEnabled(false);
			}
		});
		
	}
}
