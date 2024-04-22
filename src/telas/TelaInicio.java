package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.DropMode;

public class TelaInicio {

	private JFrame frmInicio;
	private JTextField txtNomeHeroi;
	private static String nomeHeroi;
	private static String escolhaRaca;
	private String nome;
	
	public static String getNomeHeroi() {
		return nomeHeroi;
	}
	
	static String getEscolhaRaca() {
		return escolhaRaca;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio window = new TelaInicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TelaInicio() {
		initialize();
	}


	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.getContentPane().setBackground(Color.DARK_GRAY);
		frmInicio.getContentPane().setLayout(null);
		frmInicio.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInicio.class.getResource("/imagens/IconNecromante.png")));
		frmInicio.setTitle("Inicio");
		frmInicio.setBounds(100, 100, 450, 300);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Nome do herói
		
		JLabel lblNomeDoHeri = new JLabel("Nome do herói");
		lblNomeDoHeri.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeDoHeri.setForeground(Color.WHITE);
		lblNomeDoHeri.setFont(new Font("Papyrus", Font.PLAIN, 16));
		lblNomeDoHeri.setBounds(156, 8, 120, 18);
		frmInicio.getContentPane().add(lblNomeDoHeri);
		
		txtNomeHeroi = new JTextField();
		txtNomeHeroi.setBounds(9, 34, 414, 20);
		frmInicio.getContentPane().add(txtNomeHeroi);
		txtNomeHeroi.setColumns(10);
		
		//Escolha da raça - imagens e botões
		
		JLabel lblRaa = new JLabel("Raça");
		lblRaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaa.setForeground(Color.WHITE);
		lblRaa.setFont(new Font("Papyrus", Font.PLAIN, 16));
		lblRaa.setBounds(186, 62, 58, 26);
		frmInicio.getContentPane().add(lblRaa);
		
		JRadioButton humanoRB = new JRadioButton("Humano");
		humanoRB.setFocusPainted(false);
		humanoRB.setFont(new Font("Papyrus", Font.PLAIN, 13));
		humanoRB.setHorizontalAlignment(SwingConstants.CENTER);
		humanoRB.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		humanoRB.setForeground(Color.LIGHT_GRAY);
		humanoRB.setBackground(Color.DARK_GRAY);
		humanoRB.setBounds(9, 190, 84, 23);
		frmInicio.getContentPane().add(humanoRB);
		
		JRadioButton ogroRB = new JRadioButton("Ogro");
		ogroRB.setFocusPainted(false);
		ogroRB.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		ogroRB.setFont(new Font("Papyrus", Font.PLAIN, 13));
		ogroRB.setHorizontalAlignment(SwingConstants.CENTER);
		ogroRB.setForeground(Color.LIGHT_GRAY);
		ogroRB.setBackground(Color.DARK_GRAY);
		ogroRB.setBounds(101, 190, 72, 23);
		frmInicio.getContentPane().add(ogroRB);
		
		JRadioButton elfoRB = new JRadioButton("Elfo");
		elfoRB.setFocusPainted(false);
		elfoRB.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		elfoRB.setFont(new Font("Papyrus", Font.PLAIN, 13));
		elfoRB.setHorizontalAlignment(SwingConstants.CENTER);
		elfoRB.setForeground(Color.LIGHT_GRAY);
		elfoRB.setBackground(Color.DARK_GRAY);
		elfoRB.setBounds(180, 191, 61, 23);
		frmInicio.getContentPane().add(elfoRB);
		
		JRadioButton anaoRB = new JRadioButton("Anão");
		anaoRB.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		anaoRB.setFocusPainted(false);
		anaoRB.setFont(new Font("Papyrus", Font.PLAIN, 13));
		anaoRB.setHorizontalAlignment(SwingConstants.CENTER);
		anaoRB.setForeground(Color.LIGHT_GRAY);
		anaoRB.setBackground(Color.DARK_GRAY);
		anaoRB.setBounds(254, 191, 76, 23);
		frmInicio.getContentPane().add(anaoRB);
		
		JRadioButton demonioRB = new JRadioButton("Demônio");
		demonioRB.setFocusPainted(false);
		demonioRB.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		demonioRB.setFont(new Font("Papyrus", Font.PLAIN, 13));
		demonioRB.setHorizontalAlignment(SwingConstants.CENTER);
		demonioRB.setForeground(Color.LIGHT_GRAY);
		demonioRB.setBackground(Color.DARK_GRAY);
		demonioRB.setBounds(333, 191, 91, 23);
		frmInicio.getContentPane().add(demonioRB);
		
		ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(humanoRB);
        buttonGroup.add(ogroRB);
        buttonGroup.add(elfoRB);
        buttonGroup.add(anaoRB);
        buttonGroup.add(demonioRB);
		
		JLabel humanoLabel = new JLabel("");
		humanoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/humano2.png")));
		humanoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		humanoLabel.setBounds(2, 88, 101, 108);
		frmInicio.getContentPane().add(humanoLabel);
		
		JLabel ogroLabel = new JLabel("");
		ogroLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/ogro2.png")));
		ogroLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ogroLabel.setBounds(81, 88, 101, 108);
		frmInicio.getContentPane().add(ogroLabel);
		
		JLabel elfoLabel = new JLabel("");
		elfoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/elfo2.png")));
		elfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		elfoLabel.setBounds(162, 88, 101, 108);
		frmInicio.getContentPane().add(elfoLabel);
		
		JLabel anaoLabel = new JLabel("");
		anaoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/anao2.png")));
		anaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		anaoLabel.setBounds(244, 88, 101, 108);
		frmInicio.getContentPane().add(anaoLabel);
		
		JLabel demonioLabel = new JLabel("");
		demonioLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/demonio22.png")));
		demonioLabel.setHorizontalAlignment(SwingConstants.CENTER);
		demonioLabel.setBounds(330, 88, 101, 108);
		frmInicio.getContentPane().add(demonioLabel);
		
        humanoRB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            	if(humanoRB.isSelected()) {
            		humanoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/humano.png")));
            		escolhaRaca = "humano";
            	}
            	else
            		humanoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/humano2.png")));
            }
        });
        ogroRB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            	if(ogroRB.isSelected()) {
            		ogroLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/ogro.png")));
            		escolhaRaca = "ogro";
            	}
            	else
            		ogroLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/ogro2.png")));
            }
        });
        elfoRB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            	if(elfoRB.isSelected()) {
            		elfoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/elfo.png")));
            		escolhaRaca = "elfo";
            	}
            	else
            		elfoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/elfo2.png")));
            }
        });
        anaoRB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            	if(anaoRB.isSelected()) {
            		anaoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/anao.png")));
            		escolhaRaca = "anão";
            	}
            	else
            		anaoLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/anao2.png")));
            }
        });
        demonioRB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            	if(demonioRB.isSelected()) {
            		demonioLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/demonio1.png")));
            		escolhaRaca = "demônio";
            	}
            	else
            		demonioLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/demonio22.png")));
            }
        });
		
        //Botões voltar e continuar
        
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBackground(Color.LIGHT_GRAY);
		btnVoltar.setBorder(null);
		btnVoltar.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnVoltar.setBounds(12, 226, 109, 23);
		frmInicio.getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmInicio.dispose();
                Login.main(null);
            }
        });
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnContinuar.setBackground(Color.LIGHT_GRAY);
		btnContinuar.setBorder(null);
		btnContinuar.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnContinuar.setBounds(136, 226, 288, 23);
		btnContinuar.setEnabled(false);
		frmInicio.getContentPane().add(btnContinuar);
		
		btnContinuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	nomeHeroi = txtNomeHeroi.getText();
                frmInicio.dispose();
                TelaCriacao.main(null);
            }
        });
		
		//verificação se as opções foram selecionadas
		
		ActionListener btnListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          
                boolean rb = demonioRB.isSelected() || humanoRB.isSelected() || ogroRB.isSelected() || anaoRB.isSelected() || elfoRB.isSelected();
                nome = txtNomeHeroi.getText();
                
                btnContinuar.setEnabled(rb && !(nome.isBlank()));
                	
            }
        };
        
        demonioRB.addActionListener(btnListener);
        humanoRB.addActionListener(btnListener);
        ogroRB.addActionListener(btnListener);
        anaoRB.addActionListener(btnListener);
        elfoRB.addActionListener(btnListener);
        txtNomeHeroi.addActionListener(btnListener);
        
		frmInicio.setVisible(true);
		
	}

}
