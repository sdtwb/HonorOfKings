package com.test;
import java.util.*;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonDemo extends JPanel implements ActionListener {
	JButton button1, button2;
	//���췽������������ť
	ButtonDemo() {
		//������ť
		button1 = new JButton("����");
		//���ü������Ƿ�
		button1.setMnemonic(KeyEvent.VK_1);
		//���ð�ť�¼�������
		button1.addActionListener(this);
		//���ð�ť������
		this.add(button1);
		//������ť
		button2 = new JButton("��֤");
		//���ü������Ƿ�
		button2.setMnemonic(KeyEvent.VK_2);
		//���ð�ť�¼�������
		button2.addActionListener(this);
		//���ð�ť������
		this.add(button2);
		
	}
	
	//�¼�������
	public void actionPerformed(ActionEvent e) {
		//�����һ����ť������
		if (button1 = e.getSource()) {
			JOptionPane.showMessageDialog(this, "��ť1");
		}
		//�����һ����ť������
		else if (button2 = e.getSource()) {
			JOptionPane.showMessageDialog(this, "��ť2");
		}
	}
	
	//����ͼ���û����棬����ʾ
	private static void creatAndShowGUI() {
		//���������ô���
		JFrame frame = new JFrame("ButtonDemo");
		//���ô���ر�ʱִ�еĶ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonDemo pane = new ButtonDemo();
		frame.add(pane);
		//���ô����С
		frame.setSize(250,200);
		//��ʾ����
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		//�����̣߳���ʾ�����ͼ���û�����
		Javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				creatAndShowGUI();
			}
		});
		
	}
}