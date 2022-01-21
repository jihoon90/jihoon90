package gui_ex_01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel01 extends JPanel{
	JButton jbt;
	
	MyPanel01(){
		setLayout(null); // 레이아웃 끄기
		jbt = new JButton();
		jbt.setText("누르세요");
		jbt.setSize(100,100);
		jbt.setLocation(200,200);
		add(jbt);
		
	}
}
public class ex_01 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("테스트"); // 제목
		jf.setSize(1000,700); // 가로세로
		jf.setLocation(100,100); // 시작위치
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 누를시 종료
		jf.setVisible(true);
		
		MyPanel01 mp = new MyPanel01();
		jf.setContentPane(mp);
		jf.revalidate(); // 새로고침
	}
}
