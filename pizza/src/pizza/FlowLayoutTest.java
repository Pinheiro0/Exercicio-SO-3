package pizza;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	FlowLayoutTest() {
		setSize(400, 350);
		setLayout(new FlowLayout());		
		add(new JButton("Um") );
		add(new JButton("Dois"));
		add(new JButton("Três"));
	}
	
	public static void main(String[] args) {
		FlowLayoutTest flowLayoutTest = new FlowLayoutTest();
		flowLayoutTest.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		flowLayoutTest.setVisible(true);
	}

}
