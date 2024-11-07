import java.awt.Color;
//import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Test {
	public static void main(String[] args){
		JFrame fenetre = new JFrame();
		
		fenetre.setTitle("New Java window test");
		fenetre.setSize(500,500);//size
		fenetre.setLocationRelativeTo(null);//center the window
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel= new JPanel();
		panel.setBackground(Color.GREEN);
		
		JButton button1= new JButton();
		button1.setText("Button1");
		//panel.add(button1, BorderLayout.SOUTH);
		
		JButton button2= new JButton();
		button2.setText("Button2");
		
		fenetre.setContentPane(panel);
		//fenetre.setLayout(new BorderLayout());
		//fenetre.setLayout(new GridLayout(3, 3));
		GridLayout layout= new GridLayout();
		layout.setColumns(3);
		layout.setRows(3);
		layout.setHgap(10);
		layout.setVgap(10);
		fenetre.setLayout(layout);
		
		JPanel panel2= new JPanel();
		panel2.setBackground(Color.ORANGE);
		GridLayout layout2= new GridLayout(2, 2);
		layout2.setHgap(5);
		layout2.setVgap(5);
		panel2.setLayout(layout2);
		
		//borderLayout
		//fenetre.getContentPane().add(button1, BorderLayout.NORTH);//valid
		//panel.add(button2, BorderLayout.CENTER);//also valid
		//fenetre.getContentPane().add(new JButton("Button3"), BorderLayout.SOUTH);
		
		//gridLayout
		panel.add(button1);
		panel.add(button2);
		panel.add(new JButton("Button3"));
		panel.add(panel2);
		panel2.add(new JButton("Button3"));
		panel2.add(new JButton("Button3"));
		panel2.add(new JButton("Button3"));
		panel2.add(new JButton("Button3"));
		panel.add(new JButton("Button3"));
		
		fenetre.setVisible(true);//required if the window ->
		//is supposed to be visible
		
	}
}