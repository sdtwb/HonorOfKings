package com.test;
import java.util.*;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonDemo extends JPanel implements ActionListener {
	JButton button1, button2;
	//构造方法创建两个按钮
	ButtonDemo() {
		//创建按钮
		button1 = new JButton("换题");
		//设置键盘助记符
		button1.setMnemonic(KeyEvent.VK_1);
		//设置按钮事件监听器
		button1.addActionListener(this);
		//放置按钮到窗体
		this.add(button1);
		//创建按钮
		button2 = new JButton("验证");
		//设置键盘助记符
		button2.setMnemonic(KeyEvent.VK_2);
		//设置按钮事件监听器
		button2.addActionListener(this);
		//放置按钮到窗体
		this.add(button2);
		
	}
	
	//事件处理方法
	public void actionPerformed(ActionEvent e) {
		//如果第一个按钮被按下
		if (button1 = e.getSource()) {
			JOptionPane.showMessageDialog(this, "按钮1");
		}
		//如果第一个按钮被按下
		else if (button2 = e.getSource()) {
			JOptionPane.showMessageDialog(this, "按钮2");
		}
	}
	
	//创建图形用户界面，并显示
	private static void creatAndShowGUI() {
		//创建并设置窗体
		JFrame frame = new JFrame("ButtonDemo");
		//设置窗体关闭时执行的动作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonDemo pane = new ButtonDemo();
		frame.add(pane);
		//设置窗体大小
		frame.setSize(250,200);
		//显示窗体
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		//创建线程，显示程序的图形用户界面
		Javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				creatAndShowGUI();
			}
		});
		
	}
}