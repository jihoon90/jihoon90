package gui_ex_04;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class ex_04 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.setTitle("ธÞที");
		f.setLayout(null);
		class key implements KeyListener{

			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				Point p = f.getLocation();
                if( e.getKeyCode() == 37 ) f.setLocation( p.x-20, p.y);
                if( e.getKeyCode() == 38 ) f.setLocation( p.x, p.y-20);
                if( e.getKeyCode() == 39 ) f.setLocation( p.x+20, p.y);
                if( e.getKeyCode() == 40 ) f.setLocation( p.x, p.y+20); 
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		}
		f.setVisible(true);
		f.addKeyListener(new key());
		f.setFocusable(true);
	}

	
	
}
