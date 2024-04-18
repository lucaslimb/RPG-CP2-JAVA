package telas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;

public class TelaCriacao {

	private JFrame frmCriarHeroi;
	private String classeNomes[] = { "Bandido", "Bárbaro", "Guerreiro", "Mago", "Necromante" };
	private ImageIcon classeImagens[];
	public JSlider slider;
	public JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriacao window = new TelaCriacao();
					window.frmCriarHeroi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCriacao() {
		classeImagens = new ImageIcon[] { new ImageIcon(TelaCriacao.class.getResource("/imagens/bandido.png")),
				new ImageIcon(TelaCriacao.class.getResource("/imagens/barbaro.png")),
				new ImageIcon(TelaCriacao.class.getResource("/imagens/guerreiro.png")),
				new ImageIcon(TelaCriacao.class.getResource("/imagens/mago.png")),
				new ImageIcon(TelaCriacao.class.getResource("/imagens/necromante.png")) };
		initialize();
	}

	private void initialize() {
		frmCriarHeroi = new JFrame();
		frmCriarHeroi.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCriacao.class.getResource("/imagens/IconNecromante.png")));
		frmCriarHeroi.setTitle("Criação do herói");
		frmCriarHeroi.getContentPane().setBackground(Color.DARK_GRAY);
		frmCriarHeroi.setBackground(new Color(240, 240, 240));
		frmCriarHeroi.setBounds(100, 100, 450, 300);
		frmCriarHeroi.getContentPane().setLayout(null);

		// Personagem
		JSlider slider = new JSlider();
		slider.setBorder(null);
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider.setBackground(Color.DARK_GRAY);
		slider.setFont(new Font("Papyrus", Font.PLAIN, 11));
		slider.setForeground(Color.DARK_GRAY);
		slider.setValue(2);
		slider.setMinimum(0);
		slider.setMaximum(4);
		slider.setBounds(10, 11, 200, 26);
		frmCriarHeroi.getContentPane().add(slider);

		JLabel imagemLabel = new JLabel("");
		imagemLabel.setIcon(new ImageIcon(TelaCriacao.class.getResource("/imagens/guerreiro.png")));
		imagemLabel.setBounds(42, 35, 175, 188);
		frmCriarHeroi.getContentPane().add(imagemLabel);

		JLabel testeLabel = new JLabel("Guerreiro");
		testeLabel.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		testeLabel.setForeground(Color.RED);
		testeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		testeLabel.setBounds(10, 227, 200, 23);
		frmCriarHeroi.getContentPane().add(testeLabel);

		

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int index = slider.getValue();
				testeLabel.setText(classeNomes[index]);
				imagemLabel.setIcon(classeImagens[index]);
			}
		});
				

		
		// Distribuição de pontos
		JSpinner spinnerF = new JSpinner();
		spinnerF.setBorder(null);
		spinnerF.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spinnerF.setForeground(Color.LIGHT_GRAY);
		spinnerF.setBackground(Color.DARK_GRAY);
		spinnerF.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinnerF.setBounds(371, 17, 39, 20);
		frmCriarHeroi.getContentPane().add(spinnerF);

		JSpinner spinnerA = new JSpinner();
		spinnerA.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spinnerA.setBorder(null);
		spinnerA.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinnerA.setBounds(371, 48, 39, 20);
		frmCriarHeroi.getContentPane().add(spinnerA);

		JSpinner spinnerI = new JSpinner();
		spinnerI.setBorder(null);
		spinnerI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spinnerI.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinnerI.setBounds(371, 79, 39, 20);
		frmCriarHeroi.getContentPane().add(spinnerI);

		JSpinner spinnerM = new JSpinner();
		spinnerM.setBorder(null);
		spinnerM.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spinnerM.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinnerM.setBounds(371, 110, 39, 20);
		frmCriarHeroi.getContentPane().add(spinnerM);

		JSpinner spinnerD = new JSpinner();
		spinnerD.setBorder(null);
		spinnerD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spinnerD.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinnerD.setBounds(371, 141, 39, 20);
		frmCriarHeroi.getContentPane().add(spinnerD);

		JSpinner spinnerV = new JSpinner();
		spinnerV.setForeground(new Color(240, 240, 240));
		spinnerV.setBackground(new Color(240, 240, 240));
		spinnerV.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spinnerV.setBorder(null);
		spinnerV.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinnerV.setBounds(371, 172, 39, 20);
		frmCriarHeroi.getContentPane().add(spinnerV);

		JLabel lblFora = new JLabel("Força");
		lblFora.setToolTipText("Relacionado a força bruta de ataque.");
		lblFora.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblFora.setForeground(Color.LIGHT_GRAY);
		lblFora.setBounds(270, 22, 68, 14);
		frmCriarHeroi.getContentPane().add(lblFora);

		JLabel lblNewLabel_1_1 = new JLabel("Agilidade");
		lblNewLabel_1_1.setToolTipText("Relacionado a velocidade de movimento.");
		lblNewLabel_1_1.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setBounds(270, 52, 76, 14);
		frmCriarHeroi.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Inteligência");
		lblNewLabel_1_2.setToolTipText("Relacionado ao raciocínio lógico.");
		lblNewLabel_1_2.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblNewLabel_1_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setBounds(270, 82, 76, 14);
		frmCriarHeroi.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Magia");
		lblNewLabel_1_3.setToolTipText("Relacionado aos conhecimentos mágicos.");
		lblNewLabel_1_3.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblNewLabel_1_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_3.setBounds(270, 112, 68, 14);
		frmCriarHeroi.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("Destreza");
		lblNewLabel_1_4.setToolTipText("Relacionada a habilidade técnica.");
		lblNewLabel_1_4.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblNewLabel_1_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_4.setBounds(270, 142, 68, 14);
		frmCriarHeroi.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("Vida");
		lblNewLabel_1_5.setToolTipText("Relacionado com a vida máxima");
		lblNewLabel_1_5.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblNewLabel_1_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_5.setBounds(270, 172, 68, 14);
		frmCriarHeroi.getContentPane().add(lblNewLabel_1_5);

		JLabel pontosLabel = new JLabel("Pontos disponíveis: 50");
		pontosLabel.setFont(new Font("Papyrus", Font.BOLD, 13));
		pontosLabel.setForeground(Color.WHITE);
		pontosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pontosLabel.setBounds(270, 201, 140, 14);
		frmCriarHeroi.getContentPane().add(pontosLabel);
		
		 ChangeListener spinnerListener = new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent e) {
	                int totalPontos = 50;
	                totalPontos -= (int) spinnerF.getValue();
	                totalPontos -= (int) spinnerA.getValue();
	                totalPontos -= (int) spinnerI.getValue();
	                totalPontos -= (int) spinnerM.getValue();
	                totalPontos -= (int) spinnerD.getValue();
	                totalPontos -= (int) spinnerV.getValue();

	                pontosLabel.setText("Pontos disponíveis: " + totalPontos);

	                if (totalPontos <= 0) {
	                    spinnerF.setEnabled(false);
	                    spinnerA.setEnabled(false);
	                    spinnerI.setEnabled(false);
	                    spinnerM.setEnabled(false);
	                    spinnerD.setEnabled(false);
	                    spinnerV.setEnabled(false);
	                } 
	            }
	        };
	        spinnerF.addChangeListener(spinnerListener);
	        spinnerA.addChangeListener(spinnerListener);
	        spinnerI.addChangeListener(spinnerListener);
	        spinnerM.addChangeListener(spinnerListener);
	        spinnerD.addChangeListener(spinnerListener);
	        spinnerV.addChangeListener(spinnerListener);

	        frmCriarHeroi.setVisible(true);
	        
	        JButton btnNewButton = new JButton("Continuar");
			btnNewButton.setBackground(Color.LIGHT_GRAY);
			btnNewButton.setBorder(null);
			btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNewButton.setFont(new Font("Papyrus", Font.BOLD, 11));
			btnNewButton.setBounds(329, 227, 80, 23);
			frmCriarHeroi.getContentPane().add(btnNewButton);
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 frmCriarHeroi.dispose();
		             new TelaBackground();
				}
			});
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 frmCriarHeroi.dispose();
		             new TelaInicio();
				}
			});
			btnVoltar.setFont(new Font("Papyrus", Font.BOLD, 11));
			btnVoltar.setBorder(null);
			btnVoltar.setBackground(Color.LIGHT_GRAY);
			btnVoltar.setBounds(268, 227, 51, 23);
			frmCriarHeroi.getContentPane().add(btnVoltar);
			
			
	    
	}
}
