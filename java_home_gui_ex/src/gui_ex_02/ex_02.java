package gui_ex_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel02 extends JPanel implements ActionListener{
		JButton jbt;
	MyPanel02(){
		setLayout(null);
		jbt = new JButton();
		jbt.setText("버튼클릭");
		jbt.setSize(100,100);
		jbt.setLocation(200,200);
		add(jbt);
		jbt.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbt) {
			jbt.setText("버튼눌렀음");
		}
		
	}
	
}

public class ex_02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("버튼터스트");
		jf.setSize(1000,700);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		MyPanel02 mp02 = new MyPanel02();
		jf.setContentPane(mp02);
		jf.revalidate();
	}
}
