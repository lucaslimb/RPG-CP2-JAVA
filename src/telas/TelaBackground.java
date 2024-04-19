package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class TelaBackground {

	private JFrame frmBackgroundDoHeri;
	private static String escolhaOrigem;
	private static String mtvF;
	private static String mtvP;
	private static String mtvV;
	private static String mtvA;
	private static String mtvC;
	private static String mtvN;
	private boolean btnSelecionado = false;
	private boolean btnSelecionado2 = false;
	
	static String getEscolhaOrigem() {
		return escolhaOrigem;
	}
	
	static String getMtvF() {
		return mtvF;
	}
	static String getMtvP() {
		return mtvP;
	}
	static String getMtvV() {
		return mtvV;
	}
	static String getMtvA() {
		return mtvA;
	}
	static String getMtvC() {
		return mtvC;
	}
	static String getMtvN() {
		return mtvN;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBackground window = new TelaBackground();
					window.frmBackgroundDoHeri.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaBackground() {
		initialize();
	}

	private void initialize() {
		frmBackgroundDoHeri = new JFrame();
		frmBackgroundDoHeri.getContentPane().setFont(new Font("Marcellus SC", Font.PLAIN, 11));
		frmBackgroundDoHeri.getContentPane().setBackground(Color.DARK_GRAY);
		frmBackgroundDoHeri.getContentPane().setLayout(null);
		frmBackgroundDoHeri.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaBackground.class.getResource("/imagens/IconNecromante.png")));
		frmBackgroundDoHeri.setTitle("Background do personagem");
		frmBackgroundDoHeri.setBounds(100, 100, 450, 300);
		
	//Botões continuar e voltar
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBorder(null);
		btnVoltar.setBackground(Color.LIGHT_GRAY);
		btnVoltar.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnVoltar.setBounds(12, 226, 109, 23);
		frmBackgroundDoHeri.getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBackgroundDoHeri.dispose();
				TelaCriacao.main(null);
			}
		});
		
		JButton btnContinuar = new JButton("Confirmar");
		btnContinuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnContinuar.setBorder(null);
		btnContinuar.setForeground(Color.BLACK);
		btnContinuar.setBackground(Color.LIGHT_GRAY);
		btnContinuar.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnContinuar.setBounds(136, 226, 288, 23);
		btnContinuar.setEnabled(false);
		frmBackgroundDoHeri.getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBackgroundDoHeri.dispose();
				TelaGeral.main(null);	
			}
		});
		
		//Escolha da origem - imagens/radio buttons
		
		JLabel lblNewLabel_1 = new JLabel("Origem:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(11, 11, 65, 14);
		frmBackgroundDoHeri.getContentPane().add(lblNewLabel_1);
		
		JRadioButton origem1RB = new JRadioButton("");
		origem1RB.setBackground(Color.DARK_GRAY);
		origem1RB.setHorizontalAlignment(SwingConstants.CENTER);
		origem1RB.setBounds(81, 12, 15, 14);
		frmBackgroundDoHeri.getContentPane().add(origem1RB);
		
		JRadioButton origem2RB = new JRadioButton("");
		origem2RB.setHorizontalAlignment(SwingConstants.CENTER);
		origem2RB.setBackground(Color.DARK_GRAY);
		origem2RB.setBounds(131, 12, 15, 14);
		frmBackgroundDoHeri.getContentPane().add(origem2RB);
		
		JRadioButton origem3RB = new JRadioButton("");
		origem3RB.setHorizontalAlignment(SwingConstants.CENTER);
		origem3RB.setBackground(Color.DARK_GRAY);
		origem3RB.setBounds(181, 12, 15, 14);
		frmBackgroundDoHeri.getContentPane().add(origem3RB);
		
		JRadioButton origem4RB = new JRadioButton("");
		origem4RB.setHorizontalAlignment(SwingConstants.CENTER);
		origem4RB.setBackground(Color.DARK_GRAY);
		origem4RB.setBounds(231, 12, 15, 14);
		frmBackgroundDoHeri.getContentPane().add(origem4RB);
		
		JRadioButton origem5RB = new JRadioButton("");
		origem5RB.setHorizontalAlignment(SwingConstants.CENTER);
		origem5RB.setBackground(Color.DARK_GRAY);
		origem5RB.setBounds(281, 11, 15, 14);
		frmBackgroundDoHeri.getContentPane().add(origem5RB);
		
		ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(origem1RB);
        buttonGroup.add(origem2RB);
        buttonGroup.add(origem3RB);
        buttonGroup.add(origem4RB);
        buttonGroup.add(origem5RB);
		
		JLabel origemLabel = new JLabel("");
		origemLabel.setBackground(Color.GRAY);
		origemLabel.setToolTipText("Deserto do Arrependimento");
		origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem.jpg")));
		origemLabel.setHorizontalAlignment(SwingConstants.CENTER);
		origemLabel.setForeground(Color.BLACK);
		origemLabel.setBounds(11, 39, 285, 173);
		frmBackgroundDoHeri.getContentPane().add(origemLabel);
		
		origem1RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem.jpg")));
                origemLabel.setToolTipText("Deserto do Arrependimento");
                escolhaOrigem = "o Deserto";
                btnSelecionado = true;
                
            }
        });
        origem2RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem4.jpg")));
                origemLabel.setToolTipText("Cidade Abandonada");
                escolhaOrigem = "a Cidade";
                btnSelecionado = true;
            }
        });
        origem3RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem2.jpg")));
                origemLabel.setToolTipText("Mar dos Mortos");
                escolhaOrigem = "o Mar";
                btnSelecionado = true;
            }
        });
        origem4RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem3.jpg")));
                origemLabel.setToolTipText("Floresta Viva");
                escolhaOrigem = "a Floresta";
                btnSelecionado = true;
            }
        });
        origem5RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem0.png")));
                origemLabel.setToolTipText("Desconhecido");
                escolhaOrigem = "algum lugar";
                btnSelecionado = true;
            }
        });
		
        //Escolha das motivações
        
		JLabel lblNewLabel_3 = new JLabel("Motivações:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(339, 11, 83, 14);
		frmBackgroundDoHeri.getContentPane().add(lblNewLabel_3);
		
		JCheckBox checkF = new JCheckBox("Família");
		checkF.setFocusPainted(false);
		checkF.setHorizontalTextPosition(SwingConstants.LEFT);
		checkF.setHorizontalAlignment(SwingConstants.RIGHT);
		checkF.setForeground(Color.LIGHT_GRAY);
		checkF.setFont(new Font("Papyrus", Font.PLAIN, 13));
		checkF.setBackground(Color.DARK_GRAY);
		checkF.setBounds(325, 39, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(checkF);
		
		JCheckBox checkP = new JCheckBox("Poder");
		checkP.setFocusPainted(false);
		checkP.setHorizontalTextPosition(SwingConstants.LEFT);
		checkP.setHorizontalAlignment(SwingConstants.RIGHT);
		checkP.setForeground(Color.LIGHT_GRAY);
		checkP.setFont(new Font("Papyrus", Font.PLAIN, 13));
		checkP.setBackground(Color.DARK_GRAY);
		checkP.setBounds(325, 69, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(checkP);
		
		JCheckBox checkV = new JCheckBox("Vingança");
		checkV.setFocusPainted(false);
		checkV.setHorizontalTextPosition(SwingConstants.LEFT);
		checkV.setHorizontalAlignment(SwingConstants.RIGHT);
		checkV.setForeground(Color.LIGHT_GRAY);
		checkV.setFont(new Font("Papyrus", Font.PLAIN, 13));
		checkV.setBackground(Color.DARK_GRAY);
		checkV.setBounds(325, 99, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(checkV);
		
		JCheckBox checkA = new JCheckBox("Alimento");
		checkA.setFocusPainted(false);
		checkA.setHorizontalTextPosition(SwingConstants.LEFT);
		checkA.setHorizontalAlignment(SwingConstants.RIGHT);
		checkA.setForeground(Color.LIGHT_GRAY);
		checkA.setFont(new Font("Papyrus", Font.PLAIN, 13));
		checkA.setBackground(Color.DARK_GRAY);
		checkA.setBounds(325, 129, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(checkA);
		
		JCheckBox checkC = new JCheckBox("Conhecimento");
		checkC.setFocusPainted(false);
		checkC.setHorizontalTextPosition(SwingConstants.LEFT);
		checkC.setHorizontalAlignment(SwingConstants.RIGHT);
		checkC.setForeground(Color.LIGHT_GRAY);
		checkC.setFont(new Font("Papyrus", Font.PLAIN, 13));
		checkC.setBackground(Color.DARK_GRAY);
		checkC.setBounds(298, 159, 124, 23);
		frmBackgroundDoHeri.getContentPane().add(checkC);
		
		JCheckBox checkN = new JCheckBox("Nenhuma");
		checkN.setFocusPainted(false);
		checkN.setHorizontalTextPosition(SwingConstants.LEFT);
		checkN.setHorizontalAlignment(SwingConstants.RIGHT);
		checkN.setForeground(Color.LIGHT_GRAY);
		checkN.setFont(new Font("Papyrus", Font.PLAIN, 13));
		checkN.setBackground(Color.DARK_GRAY);
		checkN.setBounds(325, 189, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(checkN);
		
		ActionListener checkListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkN.isSelected()) {
                	btnSelecionado2 = true;
                	mtvN = "por nada";
                    checkF.setEnabled(false);
                    checkP.setEnabled(false);
                    checkV.setEnabled(false);
                    checkA.setEnabled(false);
                    checkC.setEnabled(false);
                    checkF.setSelected(false);
                    checkP.setSelected(false);
                    checkV.setSelected(false);
                    checkA.setSelected(false);
                    checkC.setSelected(false);
                } else {
                	mtvN = "0";
                	 checkF.setEnabled(true);
                     checkP.setEnabled(true);
                     checkV.setEnabled(true);
                     checkA.setEnabled(true);
                     checkC.setEnabled(true);
                }
                if(checkF.isSelected()) {
                	mtvF = "pela família";
                	btnSelecionado2 = true;
                	}
                else
                	mtvF = "0";
                if(checkP.isSelected()) {
                	mtvP = "pelo poder";
                	btnSelecionado2 = true;
                	}
                else
                	mtvP = "0";
                if(checkV.isSelected()) {
                	mtvV = "pela vingança";
                	btnSelecionado2 = true;
                	}
                else
                	mtvV = "0";
                if(checkA.isSelected()) {
                	mtvA = "por alimento";
                	btnSelecionado2 = true;
                	}
                else
                	mtvA = "0";
                if(checkC.isSelected()) {
                	mtvC = "pelo conhecimento";
                	btnSelecionado2 = true;
                	}
                else
                	mtvC = "0";
            }
            };
		
        checkF.addActionListener(checkListener);
        checkP.addActionListener(checkListener);
        checkV.addActionListener(checkListener);
        checkA.addActionListener(checkListener);
        checkC.addActionListener(checkListener);
        checkN.addActionListener(checkListener);
        
        //verificação se as opções foram selecionadas
        
        ActionListener btnListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          
                boolean rb = origem1RB.isSelected() || origem2RB.isSelected() || origem3RB.isSelected() || origem4RB.isSelected() || origem5RB.isSelected();
        
                boolean cb = checkF.isSelected() || checkP.isSelected() || checkV.isSelected() || checkA.isSelected() || checkC.isSelected() || checkN.isSelected();
              
                btnContinuar.setEnabled(rb && cb);
            }
        };
        
        checkF.addActionListener(btnListener);
        checkP.addActionListener(btnListener);
        checkV.addActionListener(btnListener);
        checkA.addActionListener(btnListener);
        checkC.addActionListener(btnListener);
        checkN.addActionListener(btnListener);
        origem1RB.addActionListener(btnListener);
        origem2RB.addActionListener(btnListener);
        origem3RB.addActionListener(btnListener);
        origem4RB.addActionListener(btnListener);
        origem5RB.addActionListener(btnListener);
        
		frmBackgroundDoHeri.setVisible(true);
	
	}
}
