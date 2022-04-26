package correcao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class correcaoB extends JFrame {

	private JPanel contentPane;
	private JTextField textvalor;
	private JTextField textquat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					correcaoB frame = new correcaoB();
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
	public correcaoB() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora de Bovina");
		lblNewLabel.setBounds(153, 11, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor do Arroba");
		lblNewLabel_1.setBounds(21, 82, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade de Arroba");
		lblNewLabel_2.setBounds(21, 152, 139, 14);
		contentPane.add(lblNewLabel_2);
		
		textvalor = new JTextField();
		textvalor.setBounds(170, 79, 115, 20);
		contentPane.add(textvalor);
		textvalor.setColumns(10);
		
		textquat = new JTextField();
		textquat.setBounds(170, 149, 115, 20);
		contentPane.add(textquat);
		textquat.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular Total a Pagar");
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				double val;
				int valor= Integer.parseInt(textvalor.getText());
				int valor2= Integer.parseInt(textquat.getText());
				val=valor* valor2;
				
				JOptionPane.showMessageDialog(null,"o valor de Arrobas a serem pagos: R$ "+ val);
				
			}
		});
		btnNewButton.setBounds(99, 202, 213, 23);
		contentPane.add(btnNewButton);
	}
}
