package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("CALCULADORA DE IDADE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite sua idade:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(77, 80, 192, 30);
		contentPane.add(lblNewLabel);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtIdade.setBounds(279, 76, 161, 34);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setForeground(new Color(255, 0, 0));
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblResultado.setBounds(220, 290, 258, 59);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("CALCULAR IDADE EM 2040");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int calcularIdade = Integer.parseInt( txtIdade.getText()) + 17;
				lblResultado.setText(String.valueOf(calcularIdade));
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(195, 167, 329, 44);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1 = new JLabel("RESULTADO:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(77, 305, 133, 44);
		contentPane.add(lblNewLabel_1);
		
		
	}

}
