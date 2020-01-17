package calc;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalcFrame extends JFrame {
	
	public void versions()
	{
		//version 1.0 project turned in on June, 2013 made by Weizhao Chen
		//version 1.1 fixed adding and subtracting operands
	}
	public void knownbugs()
	{
		//clicking return a second time does not work again after finish calculating
		//clicking other operands(+,/,*,/) after calculation would return the second sets of number input + operands
		//backspacing only works for input numbers and not for return values
	}
	public void todolist()
	{
		//changing to newer edition of java application instead of using awt
		//add number pad instead of clicking
		//reducing errors produce by the fail operands and bugs
		
	}
	
	private JPanel contentPane;
	private JPanel mainPanel;
	private JTextField resultField;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_0;
	private JButton button_dec;
	private JButton button_bs;
	private JButton button_clr_entry;
	private JButton button_clear;
	private JButton button_neg;
	private JButton button_div;
	private JButton button_mul;
	private JButton button_sub;
	private JButton button_add;
	private JButton button_eql;
	private JButton btnM;
	private JButton button_M_sub;
	private JButton button_M_recall;
	private JButton button_M_clear;
	private String operand = "";
	private double buffer_1;
	private double store;
	private static final int ADD = 0;
	private static final int SUB = 1;
	private static final int MUL = 2;
	private static final int DIV = 3;
	private static final int EQL = 4;
	private boolean neg = false;
	private double answer;
	private String equal;
	private String reset;
	
	private void display()
	{
		
		String x = "";
		if(neg)
			x="-";
		
		resultField.setText(x+operand);
		
			
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CalcFrame frame = new CalcFrame();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(null);
		
		resultField = new JTextField();
		resultField.setEditable(false);
		resultField.setBounds(38, 11, 305, 20);
		mainPanel.add(resultField);
		resultField.setColumns(10);
		
		button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"1";
				display();
			}
		});
		button_1.setBounds(38, 88, 53, 30);
		mainPanel.add(button_1);
		
		button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"2";
				display();
			}
		});
		button_2.setBounds(101, 88, 53, 30);
		mainPanel.add(button_2);
		
		button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"3";
				display();
			}
		});
		button_3.setBounds(164, 88, 53, 30);
		mainPanel.add(button_3);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"4";
				display();
			}
		});
		button_4.setBounds(38, 129, 53, 30);
		mainPanel.add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"5";
				display();
			}
		});
		button_5.setBounds(101, 129, 53, 30);
		mainPanel.add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"6";
				display();
			}
		});
		button_6.setBounds(164, 129, 53, 30);
		mainPanel.add(button_6);
		
		button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"8";
				display();
			}
		});
		button_7.setBounds(38, 171, 53, 30);
		mainPanel.add(button_7);
		
		button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"8";
				display();
			}
		});
		button_8.setBounds(101, 170, 53, 30);
		mainPanel.add(button_8);
		
		button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"9";
				display();
			}
		});
		button_9.setBounds(164, 170, 53, 30);
		mainPanel.add(button_9);
		
		button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand=operand+"0";
				display();
			}
		});
		button_0.setBounds(38, 211, 117, 30);
		mainPanel.add(button_0);

		button_dec = new JButton(".");
		button_dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!operand.contains("."))
				{
				operand=operand+".";
				display();
				}
			}
		});
		button_dec.setBounds(164, 211, 53, 30);
		mainPanel.add(button_dec);
		
		button_bs = new JButton("<--");
		button_bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!operand.isEmpty())
				{
				operand=operand.substring(0, operand.length()-1);
				resultField.setText(operand);
				}
			}
		});
		button_bs.setBounds(38, 42, 53, 30);
		mainPanel.add(button_bs);
		
		button_clr_entry = new JButton("CE");
		button_clr_entry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand="";
				resultField.setText(operand);
			}
		});
		button_clr_entry.setBounds(101, 42, 53, 30);
		mainPanel.add(button_clr_entry);
		
		button_clear = new JButton("C");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand="";
				answer=0;
				equal="";
				reset="";
				buffer_1=0;
				resultField.setText(operand);
			}
		});
		
		button_clear.setBounds(164, 42, 53, 30);
		mainPanel.add(button_clear);
		
		button_neg = new JButton("+-");
		button_neg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(neg != true)
					neg= true;
				else
					neg=false;
				
				display();
			}
		});
		button_neg.setBounds(227, 42, 53, 30);
		mainPanel.add(button_neg);
		
		button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equal="/";
				buffer_1=Double.parseDouble(operand);
				operand="";
				resultField.setText(equal);
			}
		});
		button_div.setBounds(227, 88, 53, 30);
		mainPanel.add(button_div);
		
		button_mul = new JButton("*");
		button_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				equal="*";
				buffer_1=Double.parseDouble(operand);
				operand="";
				resultField.setText(equal);
			}
		});
		button_mul.setBounds(227, 129, 53, 30);
		mainPanel.add(button_mul);
		
		button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equal="-";
				buffer_1=Double.parseDouble(operand);
				operand="";
				resultField.setText(equal);
			}
		});
		button_sub.setBounds(227, 171, 53, 30);
		mainPanel.add(button_sub);
		
		button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equal="+";
				buffer_1=Double.parseDouble(operand);
				//store = buffer_1 + Double.parseDouble(operand);
				operand="";
				//store=store + Double.parseDouble(operand);
				resultField.setText(equal);
			}
		});
		button_add.setBounds(227, 211, 53, 30);
		mainPanel.add(button_add);
		
		button_eql = new JButton("=");
		button_eql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(equal=="+")
				{
					answer =  buffer_1 + (Double.parseDouble(operand));
					resultField.setText("" + answer);
					operand="";
					reset = "" + buffer_1;
					//display();
				}
				else if(equal=="-")
				{
					answer =  (Double.parseDouble(operand)) - buffer_1;
					resultField.setText("" + answer);
					operand="";
					reset = "" + buffer_1;
				}
				else if(equal=="*")
				{
					answer =  buffer_1 * (Double.parseDouble(operand));
					resultField.setText("" + answer);
					operand="";
					reset = "" + buffer_1;
				}
				else if(equal=="/")
				{
					answer =  buffer_1 / (Double.parseDouble(operand));
					resultField.setText("" + answer);
					operand="";
					reset = "" + buffer_1;
				}
			}
		});
		button_eql.setBounds(290, 211, 53, 30);
		mainPanel.add(button_eql);
		
		btnM = new JButton("M+");
		btnM.setBounds(290, 42, 53, 30);
		mainPanel.add(btnM);
		
		button_M_sub = new JButton("M-");
		button_M_sub.setBounds(290, 88, 53, 30);
		mainPanel.add(button_M_sub);
		
		button_M_recall = new JButton("MR");
		button_M_recall.setBounds(290, 129, 53, 30);
		mainPanel.add(button_M_recall);
		
		button_M_clear = new JButton("MC");
		button_M_clear.setBounds(290, 171, 53, 30);
		mainPanel.add(button_M_clear);
		
	}
}
