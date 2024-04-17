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

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public TelaBackground() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBackgroundDoHeri = new JFrame();
		frmBackgroundDoHeri.getContentPane().setFont(new Font("Marcellus SC", Font.PLAIN, 11));
		frmBackgroundDoHeri.getContentPane().setBackground(Color.DARK_GRAY);
		frmBackgroundDoHeri.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Origem:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(11, 11, 65, 14);
		frmBackgroundDoHeri.getContentPane().add(lblNewLabel_1);
		
		JRadioButton origem1RB = new JRadioButton("");
		origem1RB.setSelected(true);
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
		origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem.jpg")));
		origemLabel.setHorizontalAlignment(SwingConstants.CENTER);
		origemLabel.setForeground(Color.BLACK);
		origemLabel.setBounds(11, 39, 285, 173);
		frmBackgroundDoHeri.getContentPane().add(origemLabel);
		
		origem1RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem.jpg")));
            }
        });
        origem2RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem1.jpg")));
            }
        });
        origem3RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem3.jpg")));
            }
        });
        origem4RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem4.jpg")));
            }
        });
        origem5RB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                origemLabel.setIcon(new ImageIcon(TelaBackground.class.getResource("/imagens/origem5.jpg")));
            }
        });
		
		JLabel lblNewLabel_3 = new JLabel("Motivações:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(339, 11, 83, 14);
		frmBackgroundDoHeri.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Família");
		chckbxNewCheckBox_1.setHorizontalTextPosition(SwingConstants.LEFT);
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxNewCheckBox_1.setForeground(Color.LIGHT_GRAY);
		chckbxNewCheckBox_1.setFont(new Font("Papyrus", Font.PLAIN, 13));
		chckbxNewCheckBox_1.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox_1.setBounds(325, 39, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Poder");
		chckbxNewCheckBox.setHorizontalTextPosition(SwingConstants.LEFT);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxNewCheckBox.setForeground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setFont(new Font("Papyrus", Font.PLAIN, 13));
		chckbxNewCheckBox.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox.setBounds(325, 69, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxVingana = new JCheckBox("Vingança");
		chckbxVingana.setHorizontalTextPosition(SwingConstants.LEFT);
		chckbxVingana.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxVingana.setForeground(Color.LIGHT_GRAY);
		chckbxVingana.setFont(new Font("Papyrus", Font.PLAIN, 13));
		chckbxVingana.setBackground(Color.DARK_GRAY);
		chckbxVingana.setBounds(325, 99, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(chckbxVingana);
		
		JCheckBox chckbxComida = new JCheckBox("Alimento");
		chckbxComida.setHorizontalTextPosition(SwingConstants.LEFT);
		chckbxComida.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxComida.setForeground(Color.LIGHT_GRAY);
		chckbxComida.setFont(new Font("Papyrus", Font.PLAIN, 13));
		chckbxComida.setBackground(Color.DARK_GRAY);
		chckbxComida.setBounds(325, 129, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(chckbxComida);
		
		JCheckBox chckbxConhecimento = new JCheckBox("Conhecimento");
		chckbxConhecimento.setHorizontalTextPosition(SwingConstants.LEFT);
		chckbxConhecimento.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxConhecimento.setForeground(Color.LIGHT_GRAY);
		chckbxConhecimento.setFont(new Font("Papyrus", Font.PLAIN, 13));
		chckbxConhecimento.setBackground(Color.DARK_GRAY);
		chckbxConhecimento.setBounds(298, 159, 124, 23);
		frmBackgroundDoHeri.getContentPane().add(chckbxConhecimento);
		
		JCheckBox nenhumaCheck = new JCheckBox("Nenhuma");
		nenhumaCheck.setHorizontalTextPosition(SwingConstants.LEFT);
		nenhumaCheck.setHorizontalAlignment(SwingConstants.RIGHT);
		nenhumaCheck.setForeground(Color.LIGHT_GRAY);
		nenhumaCheck.setFont(new Font("Papyrus", Font.PLAIN, 13));
		nenhumaCheck.setBackground(Color.DARK_GRAY);
		nenhumaCheck.setBounds(325, 189, 97, 23);
		frmBackgroundDoHeri.getContentPane().add(nenhumaCheck);
		
		nenhumaCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nenhumaCheck.isSelected()) {
                    chckbxNewCheckBox_1.setEnabled(false);
                    chckbxNewCheckBox.setEnabled(false);
                    chckbxVingana.setEnabled(false);
                    chckbxComida.setEnabled(false);
                    chckbxConhecimento.setEnabled(false);
                    chckbxNewCheckBox_1.setSelected(false);
                    chckbxNewCheckBox.setSelected(false);
                    chckbxVingana.setSelected(false);
                    chckbxComida.setSelected(false);
                    chckbxConhecimento.setSelected(false);
                } else {
                	 chckbxNewCheckBox_1.setEnabled(true);
                     chckbxNewCheckBox.setEnabled(true);
                     chckbxVingana.setEnabled(true);
                     chckbxComida.setEnabled(true);
                     chckbxConhecimento.setEnabled(true);
                }
            }
            });
		
		JButton btnNewButton_1_1 = new JButton("Voltar");
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(12, 226, 109, 23);
		frmBackgroundDoHeri.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Papyrus", Font.BOLD, 12));
		btnNewButton_1.setBounds(136, 226, 288, 23);
		frmBackgroundDoHeri.getContentPane().add(btnNewButton_1);
		
		frmBackgroundDoHeri.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaBackground.class.getResource("/imagens/IconNecromante.png")));
		frmBackgroundDoHeri.setTitle("Background do herói");
		frmBackgroundDoHeri.setBounds(100, 100, 450, 300);
		frmBackgroundDoHeri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
