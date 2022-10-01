import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class GameFrame extends JFrame {
	GameFrame(){
		GamePanel gp=new GamePanel();
		this.add(gp);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}


}
