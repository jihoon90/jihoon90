package gui_ex_01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel01 extends JPanel{
	JButton jbt;
	
	MyPanel01(){
		setLayout(null); // ���̾ƿ� ����
		jbt = new JButton();
		jbt.setText("��������");
		jbt.setSize(100,100);
		jbt.setLocation(200,200);
		add(jbt);
		
	}
}
public class ex_01 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("�׽�Ʈ"); // ����
		jf.setSize(1000,700); // ���μ���
		jf.setLocation(100,100); // ������ġ
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x��ư ������ ����
		jf.setVisible(true);
		
		MyPanel01 mp = new MyPanel01();
		jf.setContentPane(mp);
		jf.revalidate(); // ���ΰ�ħ
	}
}
