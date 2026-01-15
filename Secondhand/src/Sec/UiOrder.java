package Sec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Label;

public class UiOrder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameInput;
	private JTextField condInput;
	private JTextField priceInput;
	private JTextField qtyInput;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiOrder frame = new UiOrder();
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
	public UiOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setBounds(10, 10, 321, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("二手商品出清");
		lblNewLabel.setBounds(106, 10, 139, 34);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
			JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 166, 123));
		panel_1.setBounds(10, 69, 321, 167);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel name = new JLabel("Product");
		name.setFont(new Font("Cambria", Font.PLAIN, 12));
		name.setBounds(48, 10, 46, 15);
		panel_1.add(name);
		
		JLabel lblNewLabel_1 = new JLabel("Condition");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(48, 37, 77, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(48, 114, 46, 15);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Q'ty");
		lblNewLabel_3.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(48, 139, 46, 15);
		panel_1.add(lblNewLabel_3);
		
		nameInput = new JTextField();
		nameInput.setForeground(new Color(0, 0, 0));
		nameInput.setBounds(104, 7, 141, 21);
		panel_1.add(nameInput);
		nameInput.setColumns(10);
		
		condInput = new JTextField();
		condInput.setFont(new Font("Cambria", Font.BOLD, 12));
		condInput.setForeground(new Color(128, 64, 64));
		condInput.setBackground(new Color(255, 166, 123));
		condInput.setText("Choose One Option");
		condInput.setBounds(104, 34, 141, 21);
		panel_1.add(condInput);
		condInput.setColumns(10);
				
		priceInput = new JTextField();
		priceInput.setBounds(104, 111, 141, 21);
		panel_1.add(priceInput);
		priceInput.setColumns(10);
		
		qtyInput = new JTextField();
		qtyInput.setBounds(104, 136, 141, 21);
		panel_1.add(qtyInput);
		qtyInput.setColumns(10);

		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 246, 321, 157);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JTextArea sumOutput = new JTextArea();
		sumOutput.setBounds(45, 10, 157, 112);
		sumOutput.setBackground(new Color(255, 255, 255));
		sumOutput.setFont(new Font("新細明體", Font.PLAIN, 13));
		panel_2.add(sumOutput);
		
		JLabel Timer = new JLabel("");
		Timer.setFont(new Font("Cambria", Font.PLAIN, 12));
		Timer.setBounds(122, 132, 189, 15);
		panel_2.add(Timer);		
			
		
		/************Event****************/

		Timer timer = new Timer(1000, new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		        Timer.setText("Current Time " + time);
		    }
		});
		timer.start();	
	

		/************Button Event****************/
		JRadioButton brandNew = new JRadioButton("Brand-new");
		brandNew.setBackground(new Color(255, 166, 123));
		brandNew.setFont(new Font("Cambria", Font.PLAIN, 12));
		buttonGroup.add(brandNew);
		brandNew.addMouseListener(new MouseAdapter() {
			//@Override
			public void mouseClicked(MouseEvent e) {
				String msgBN=brandNew.getText();
				condInput.setText(msgBN);			
			}
		});
		brandNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		brandNew.setBounds(104, 58, 96, 23);
		panel_1.add(brandNew);
		
		JRadioButton used = new JRadioButton("Used");
		used.setBackground(new Color(255, 166, 123));
		used.setFont(new Font("Cambria", Font.PLAIN, 12));
		buttonGroup.add(used);
		used.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String msgU=used.getText();
				condInput.setText(msgU);	
			}
		});
		used.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		used.setBounds(218, 58, 77, 23);
		panel_1.add(used);
		
		JRadioButton likeNew = new JRadioButton("Like-new");
		likeNew.setBackground(new Color(255, 166, 123));
		likeNew.setFont(new Font("Cambria", Font.PLAIN, 12));
		buttonGroup.add(likeNew);
		likeNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String msgLK=likeNew.getText();
				condInput.setText(msgLK);	
			}
		});
		likeNew.setBounds(104, 83, 96, 23);
		panel_1.add(likeNew);
		
		JRadioButton vintage = new JRadioButton("Vintage");
		vintage.setBackground(new Color(255, 166, 123));
		vintage.setFont(new Font("Cambria", Font.PLAIN, 12));
		vintage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String msgV=vintage.getText();
				condInput.setText(msgV);	
			}
		});
		buttonGroup.add(vintage);
		vintage.setBounds(218, 82, 77, 23);
		panel_1.add(vintage);
		
	
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(234, 10, 77, 23);
		btnCheck.setBackground(new Color(255, 255, 255));
		btnCheck.setFont(new Font("Cambria", Font.PLAIN, 12));
		panel_2.add(btnCheck);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(234, 100, 77, 23);
		btnExit.setBackground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		panel_2.add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(234, 70, 77, 23);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sumOutput.setText(" ");
			}
		});
		btnClear.setBackground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Cambria", Font.PLAIN, 12));
		panel_2.add(btnClear);
	
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(234, 40, 77, 23);
		btnPrint.setBackground(new Color(255, 255, 255));
		panel_2.add(btnPrint);
		btnPrint.setFont(new Font("Cambria", Font.PLAIN, 12));			
		
		
		btnPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sumOutput.print();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
			btnCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String msgname=nameInput.getText();
				String msgcond=condInput.getText();
				String msgprice=priceInput.getText();
				String msgqty=qtyInput.getText();			
				
						
				int Msgprice=Integer.parseInt(msgprice);		
				int Msgqty=Integer.parseInt(msgqty);
				int sum=Msgprice*Msgqty;
								
				if(Msgprice>=0&&Msgqty>=0)
				{
					Order o=new Order(msgname,msgcond,Msgprice,Msgqty);
					sumOutput.setText("產品名:\t"+msgname+"\n新舊程度:\t"+msgcond+"\n價格:\t"+msgprice+"\n數量:\t"+msgqty+"\n\n總額:\t"+sum);
				}
				else
				{
					sumOutput.setText("價格數量需大於等於0");
				}
								
				System.out.println(msgname);
				System.out.println(msgcond);
				
				
				
				
				
			}
		});
		
		

	}
}
