package Interface;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Util.Automato;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class ProcessaAutomatos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	
	private ImageIcon icon = new ImageIcon("./auto1.jpg");

	JLabel label = new JLabel(icon);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcessaAutomatos frame = new ProcessaAutomatos();
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
	public ProcessaAutomatos() {
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 363, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAutomato = new JLabel("Automato");
		lblAutomato.setBounds(10, 11, 87, 17);
		lblAutomato.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		contentPane.add(lblAutomato);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBounds(6, 35, 37, 23);
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBounds(54, 35, 37, 23);
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBounds(101, 35, 37, 23);
		
		
		label.setBounds(10, 127, 321, 145);
		contentPane.add(label);
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("./auto1.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
		        Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		 label.setIcon(imageIcon);
		 label.repaint();
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 77, 168, 14);
		contentPane.add(lblNewLabel_1);
		 	
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 102, 321, 14);
		contentPane.add(lblNewLabel);
		 lblNewLabel.setText("{w| w não possui aba como subpalavra}");
		 lblNewLabel_1.setText("Automato 1");
			
		 
		radioButton.setSelected(true);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radioButton_1.setSelected(false);
				radioButton_2.setSelected(false);
				 lblNewLabel_1.setText("Automato 1");
				lblNewLabel.setText("{w| w não possui aba como subpalavra}");
				
				BufferedImage img = null;
				try {
				    img = ImageIO.read(new File("./auto1.jpg"));
				} catch (IOException e) {
				    e.printStackTrace();
				}
				Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
				        Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(dimg);
				 label.setIcon(imageIcon);
				 label.repaint();
			}
		});
		contentPane.add(radioButton);
 
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radioButton.setSelected(false);
				radioButton_2.setSelected(false);
				 lblNewLabel_1.setText("Automato 2");
				lblNewLabel.setText(" {w | w possui número impar de a's e número par de b's}");
				
				
				BufferedImage img = null;
				try {
				    img = ImageIO.read(new File("./auto2.jpg"));
				} catch (IOException e) {
				    e.printStackTrace();
				}
				Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
				        Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(dimg);
				 label.setIcon(imageIcon);
				 label.repaint();
				    
			}
		});
		contentPane.add(radioButton_1);
		
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radioButton.setSelected(false);
				radioButton_1.setSelected(false);
				 lblNewLabel_1.setText("Automato 3");
				lblNewLabel.setText(" {w| w inicia e termina com o mesmo símbolo }");
				
				
				BufferedImage img = null;
				try {
				    img = ImageIO.read(new File("./auto3.jpg"));
				} catch (IOException e) {
				    e.printStackTrace();
				}
				Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
				        Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(dimg);
				 label.setIcon(imageIcon);
				 label.repaint();
			}
		});
		contentPane.add(radioButton_2);
		
		textField = new JTextField();
		textField.setBounds(10, 311, 333, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPalavra = new JLabel("Palavra");
		lblPalavra.setBounds(10, 296, 46, 14);
		contentPane.add(lblPalavra);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(258, 335, 73, 67);
		contentPane.add(lblNewLabel_2);
		
		JButton btnValidar = new JButton("Validar!");
		btnValidar.setBounds(10, 342, 89, 23);
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String palavra = textField.getText();
				Automato aut = new Automato();
				boolean foiAceito = false;
				
				String[] verificaAlfabeto = palavra.split("");
				boolean alfabetoAceito = true;
				for(String letra : verificaAlfabeto) {
					if(!letra.equals("a")&&!letra.equals("b"))
						alfabetoAceito=false;
				}
				BufferedImage img = null;
				if(alfabetoAceito==true) {
					System.out.println("###################################");
					System.out.println("Ler a palavra: "+palavra);
					if(radioButton.isSelected()) {
						foiAceito = aut.processaPalavra(palavra, 1);
						if(foiAceito){
							try {
							    img = ImageIO.read(new File("./accept.jpg"));
							} catch (IOException e) {
							    e.printStackTrace();
							}
						}
						else{
							try {
							    img = ImageIO.read(new File("./reject.jpg"));
							} catch (IOException e) {
							    e.printStackTrace();
							}
						}
					}
					else if(radioButton_1.isSelected()) {
						foiAceito = aut.processaPalavra(palavra, 2);
						if(foiAceito)
							{
							try {
							    img = ImageIO.read(new File("./accept.jpg"));
							} catch (IOException e) {
							    e.printStackTrace();
							}
							}
						else {
							try {
							    img = ImageIO.read(new File("./reject.jpg"));
							} catch (IOException e) {
							    e.printStackTrace();
							}
						}
					}
					else if(radioButton_2.isSelected()) {
						foiAceito = aut.processaPalavra(palavra, 3);
						if(foiAceito) {
							try {
							    img = ImageIO.read(new File("./accept.jpg"));
							} catch (IOException e) {
							    e.printStackTrace();
							}
						}
						else {
							try {
							    img = ImageIO.read(new File("./reject.jpg"));
							} catch (IOException e) {
							    e.printStackTrace();
							}
						}
					}
					Image dimg = img.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(),
					        Image.SCALE_SMOOTH);
					ImageIcon imageIcon = new ImageIcon(dimg);
					lblNewLabel_2.setIcon(imageIcon);
					lblNewLabel_2.repaint();
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Alfabeto não aceito!");
				}
				
				
				
				
			}
		});
		contentPane.add(btnValidar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 283, 354, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 65, 354, 2);
		contentPane.add(separator_1);
		
		JButton btnSair = new JButton("sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				System.exit(0);
			}
		});
		btnSair.setBounds(275, 8, 56, 23);
		contentPane.add(btnSair);
		
		Console console = new Console();
		console.init();
		console.getFrame().setLocation(450, 100);
		
		
	}
}

class Console {
	final JFrame frame = new JFrame();

	public Console() {
		JTextArea textArea = new JTextArea(24, 80);

		textArea.setBackground(Color.BLACK);
		textArea.setForeground(Color.LIGHT_GRAY);
		textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		JScrollPane sp = new JScrollPane(textArea);
		System.setOut(new PrintStream(new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				textArea.append(String.valueOf((char) b));
			}
		}));
		frame.getContentPane().add(sp);
	}

	public void init() {
		frame.pack();
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}
}
