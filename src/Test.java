import javax.swing.JFrame;

public class Test {
	public static void main(String[] args){
		JFrame fenetre = new JFrame();
		
		fenetre.setTitle("New Java window test");
		fenetre.setSize(500,500);//size
		fenetre.setLocationRelativeTo(null);//center the window
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fenetre.setVisible(true);//required if the window ->
		//is supposed to be visible
	}
}