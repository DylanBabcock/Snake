import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		
	
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();//takes jframe and fits it with the components we add to the frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);// window will be set in the middle of screen
	}
}
