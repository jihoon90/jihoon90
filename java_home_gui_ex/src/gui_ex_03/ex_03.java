package gui_ex_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel03 extends JPanel implements ActionListener{
		JButton jbt;
		JButton arr[];
	MyPanel03(){
		setLayout(null);
		jbt = new JButton();
		jbt.setText("버튼클릭");
		jbt.setSize(100,100);
		jbt.setLocation(100,100);
		add(jbt);
		jbt.addActionListener(this);
		
		arr = new JButton[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new JButton();
			arr[i].setText("O");
			arr[i].setSize(100,100);
			arr[i].setLocation(300+i*100,100);
			arr[i].addActionListener(this);
			add(arr[i]);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbt) {
			jbt.setText("버튼눌렀음");
		}
		for(int i=0;i<arr.length;i++) {
			if(e.getSource() == arr[i]) {
				arr[i].setText("X");
				break;
			}
		}
	}
}
public class ex_03 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("버튼테스트");
		jf.setSize(1000,700);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		MyPanel03 mp03 = new MyPanel03();
		jf.setContentPane(mp03);
		jf.revalidate();
	}
}