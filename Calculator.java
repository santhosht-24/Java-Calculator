import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textVariable1;
	private String variable1 = "";
	private String variable2 = "";
	private String decVariable1 = "";
	private String decVariable2 = "";
	private int intResult = 0;
	private double decResult = 0;
	private boolean add;
	private boolean sub;
	private boolean mul;
	private boolean div;
	private JTextField textField;
	private boolean decimal;
	private boolean equals;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("CFVGBJHBJVGCFRXE");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("7");
				variable1 = variable1 + "7";
				textVariable1.setText(variable1);
			}
		});
		btn7.setBounds(10, 89, 41, 31);
		contentPane.add(btn7);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("2");
				variable1 = variable1 + "2";
				textVariable1.setText(variable1);
			}
		});
		btn2.setBounds(61, 173, 41, 31);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("3");
				variable1 = variable1 + "3";
				textVariable1.setText(variable1);
			}
		});
		btn3.setBounds(112, 173, 41, 31);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("4");
				variable1 = variable1 + "4";
				textVariable1.setText(variable1);
			}
		});
		btn4.setBounds(10, 131, 41, 31);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("5");
				variable1 = variable1 + "5";
				textVariable1.setText(variable1);
			}
		});
		btn5.setBounds(61, 131, 41, 31);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("6");
				variable1 = variable1 + "6";
				textVariable1.setText(variable1);
			}
		});
		btn6.setBounds(112, 131, 41, 31);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("1");
				variable1 = variable1 + "1";
				textVariable1.setText(variable1);
			}
		});
		btn1.setBounds(10, 173, 41, 31);
		contentPane.add(btn1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("8");
				variable1 = variable1 + "8";
				textVariable1.setText(variable1);
			}
		});
		btn8.setBounds(61, 89, 41, 31);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("9");
				variable1 = variable1 + "9";
				textVariable1.setText(variable1);
			}
		});
		btn9.setBounds(112, 89, 41, 31);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("0");
				variable1 = variable1 + "0";
				textVariable1.setText(variable1);
				if (true) {
					textVariable1.setText("");
					textVariable1.setText("0");
					variable1 = variable1 + "0";
				}
			}
		});
		btn0.setBounds(10, 215, 92, 31);
		contentPane.add(btn0);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				div = true;
				variable2 = variable1;
				variable1 = "";
				textField.setText(variable2 + " /");
				textVariable1.setText("");
			}
		});
		btnDiv.setBounds(163, 89, 47, 31);
		contentPane.add(btnDiv);
		
		JButton btnMul = new JButton("*");
		btnMul.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mul = true;
				variable2 = variable1;
				variable1 = "";
				textField.setText(variable2 + " *");
				textVariable1.setText("");
			}
		});
		btnMul.setBounds(163, 131, 47, 31);
		contentPane.add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub = true;
				variable2 = variable1;
				variable1 = "";
				textField.setText(variable2 + " -");
				textVariable1.setText("");
			}
		});
		btnSub.setBounds(163, 173, 47, 31);
		contentPane.add(btnSub);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal = true;
				if (variable1.isEmpty()) {
					variable2 += ".";
					textVariable1.setText(variable2);
				}
				else {
					variable1 += ".";
					textVariable1.setText(variable1);
				}
					
			}
		});
		btnDecimal.setBounds(112, 215, 41, 31);
		contentPane.add(btnDecimal);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add = true;
				variable2 = variable1;
				variable1 = "";
				textField.setText(variable2 + " +");
				textVariable1.setText("");
			}
		});
		btnAdd.setBounds(163, 215, 47, 31);
		contentPane.add(btnAdd);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				equals = true;
				textVariable1.setText("");
				textField.setText("");
				
				if (add) {
					decResult = Double.parseDouble(variable1) + Double.parseDouble(variable2);
					intResult = (int) decResult;
					if (intResult == decResult) {
						decResult = intResult;
						decimal = false;
					}
					add = false;
				}	
				if (sub) {
					decResult = Double.parseDouble(variable2) - Double.parseDouble(variable1);
					intResult = (int) decResult;
					if (intResult == decResult) {
						decResult = intResult;
						decimal = false;
					}
					sub = false;
				}
				if (mul) {
					decResult = Double.parseDouble(variable1) * Double.parseDouble(variable2);
					intResult = (int) decResult;
					if (intResult == decResult) {
						decResult = intResult;
						decimal = false;
					}
					mul = false;
				}
				if (div) {
					decResult = Double.parseDouble(variable2) / Double.parseDouble(variable1);
					decimal = true;
					intResult = (int) decResult;
					if (intResult == decResult) {
						decResult = intResult;
						decimal = false;
					}
					div = false;
				}				
				if (decimal) {
					variable1 = "" + decResult;
					textVariable1.setText("" + decResult);
				}
				else {
					variable1 = "" + intResult;
					textVariable1.setText("" + intResult);
				}
				
 			}catch (Exception ex) {
 					
 				JOptionPane.showMessageDialog(btnEquals, "Enter Valid Expression!!");
 			}
			} 
				
		});
		btnEquals.setBounds(220, 173, 54, 73);
		contentPane.add(btnEquals);
		
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (variable1.isEmpty()) {
					variable2 = variable2.replaceAll(".$", "");
					textVariable1.setText("" + variable2);
				}
				else {
					variable1 = variable1.replaceAll(".$", "");
					textVariable1.setText("" + variable1);
				}
					
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDel.setBounds(220, 131, 54, 31);
		contentPane.add(btnDel);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVariable1.setText("");
				variable1 = "";
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClear.setBounds(220, 89, 54, 31);
		contentPane.add(btnClear);
		
		textVariable1 = new JTextField();
		textVariable1.setFont(new Font("Arial", Font.PLAIN, 17));
		textVariable1.setBounds(10, 30, 264, 48);
		contentPane.add(textVariable1);
		textVariable1.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 264, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
