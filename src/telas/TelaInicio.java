package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class TelaInicio {

	private JFrame frmInicio;
	private JTextField textField;

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
		
		JLabel lblNomeDoHeri = new JLabel("Nome do herói:");
		lblNomeDoHeri.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDoHeri.setForeground(Color.WHITE);
		lblNomeDoHeri.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblNomeDoHeri.setBounds(10, 11, 137, 14);
		frmInicio.getContentPane().add(lblNomeDoHeri);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 414, 20);
		frmInicio.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblRaa = new JLabel("Raça:");
		lblRaa.setHorizontalAlignment(SwingConstants.LEFT);
		lblRaa.setForeground(Color.WHITE);
		lblRaa.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblRaa.setBounds(10, 63, 137, 14);
		frmInicio.getContentPane().add(lblRaa);
		
		JRadioButton rdbtnHumano = new JRadioButton("Humano");
		rdbtnHumano.setFont(new Font("Papyrus", Font.PLAIN, 13));
		rdbtnHumano.setSelected(true);
		rdbtnHumano.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnHumano.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnHumano.setForeground(Color.LIGHT_GRAY);
		rdbtnHumano.setBackground(Color.DARK_GRAY);
		rdbtnHumano.setBounds(6, 84, 109, 23);
		frmInicio.getContentPane().add(rdbtnHumano);
		
		JRadioButton rdbtnOgro = new JRadioButton("Ogro");
		rdbtnOgro.setFont(new Font("Papyrus", Font.PLAIN, 13));
		rdbtnOgro.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnOgro.setForeground(Color.LIGHT_GRAY);
		rdbtnOgro.setBackground(Color.DARK_GRAY);
		rdbtnOgro.setBounds(6, 110, 109, 23);
		frmInicio.getContentPane().add(rdbtnOgro);
		
		JRadioButton rdbtnElfo = new JRadioButton("Elfo");
		rdbtnElfo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnElfo.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnElfo.setForeground(Color.LIGHT_GRAY);
		rdbtnElfo.setBackground(Color.DARK_GRAY);
		rdbtnElfo.setBounds(6, 136, 109, 23);
		frmInicio.getContentPane().add(rdbtnElfo);
		
		JRadioButton rdbtnAno = new JRadioButton("Anão");
		rdbtnAno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnAno.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnAno.setForeground(Color.LIGHT_GRAY);
		rdbtnAno.setBackground(Color.DARK_GRAY);
		rdbtnAno.setBounds(6, 162, 109, 23);
		frmInicio.getContentPane().add(rdbtnAno);
		
		JRadioButton rdbtnDemnio = new JRadioButton("Demônio");
		rdbtnDemnio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnDemnio.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnDemnio.setForeground(Color.LIGHT_GRAY);
		rdbtnDemnio.setBackground(Color.DARK_GRAY);
		rdbtnDemnio.setBounds(6, 188, 109, 23);
		frmInicio.getContentPane().add(rdbtnDemnio);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(12, 226, 109, 23);
		frmInicio.getContentPane().add(btnNewButton);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBackground(Color.LIGHT_GRAY);
		btnContinuar.setBorder(null);
		btnContinuar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContinuar.setBounds(136, 226, 288, 23);
		frmInicio.getContentPane().add(btnContinuar);
		
		JSlider slider = new JSlider();
		slider.setBackground(Color.DARK_GRAY);
		slider.setMaximum(1);
		slider.setValue(0);
		slider.setBounds(208, 99, 137, 26);
		frmInicio.getContentPane().add(slider);
		
		JLabel lblGnero = new JLabel("Gênero:");
		lblGnero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnero.setForeground(Color.WHITE);
		lblGnero.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblGnero.setBounds(208, 63, 137, 14);
		frmInicio.getContentPane().add(lblGnero);
		
		JLabel lblFem = new JLabel("Fem");
		lblFem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFem.setForeground(Color.LIGHT_GRAY);
		lblFem.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFem.setBounds(148, 105, 52, 14);
		frmInicio.getContentPane().add(lblFem);
		
		JLabel lblMasc = new JLabel("Masc");
		lblMasc.setHorizontalAlignment(SwingConstants.LEFT);
		lblMasc.setForeground(Color.LIGHT_GRAY);
		lblMasc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMasc.setBounds(355, 105, 52, 14);
		frmInicio.getContentPane().add(lblMasc);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/humano.png")));
		lblNewLabel.setBounds(235, 128, 83, 83);
		frmInicio.getContentPane().add(lblNewLabel);
		frmInicio.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInicio.class.getResource("/imagens/IconNecromante.png")));
		frmInicio.setTitle("Inicio");
		frmInicio.setBounds(100, 100, 450, 300);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
