package ���ģʽ;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login2 extends Frame {
	public Login2(String str) {
		super(str);
	}

	static JPanel panelFirst = new JPanel();// ����û�������
	static JPanel panelSecond = new JPanel();// ��Ű�ť
	static Login2 fr = new Login2("��¼С����");

	public void Init() {
		JLabel userLabel = new JLabel("username");
		JLabel passLabel = new JLabel("password");
		JTextField userText = new JTextField();
		JTextField passText = new JTextField();
		panelFirst.add(userLabel);
		panelFirst.add(userText);
		panelFirst.add(passLabel);
		panelFirst.add(passText);
		panelFirst.setLayout(new GridLayout(2, 2));

	}

	public void Display() {
		fr.setSize(500, 300);
		fr.setLocation(450, 300);
		fr.setBackground(null);
		panelSecond.setLayout(new FlowLayout());
		Button reg = new Button("Register");
		Button cancel = new Button("Cancel");
		panelSecond.add(reg);
		panelSecond.add(cancel);

	}

	public void Validate() {
		Button vali = new Button("Validate");
		panelSecond.add(vali);
		vali.setLocation(50, 50);
		vali.addActionListener(new ActionListener() {
			// ������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
				// �����µĴ���
				JFrame frame = new JFrame("��֤�ɹ�");
				// ��������Ļ��λ��
				frame.setLocation(300, 200);
				// �����С
				frame.setSize(400, 300);
				// ��ʾ����
				frame.setVisible(true);
			}

		});
	}

	public void getConnection() {
		Button login = new Button("Login");
		panelSecond.add(login);
		login.setLocation(50, 50);
		login.addActionListener(new ActionListener() {
			// ������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
				// �����µĴ���
				JFrame frame = new JFrame("���ӳɹ�");
				// ��������Ļ��λ��
				frame.setLocation(300, 200);
//				�����С
				frame.setSize(400, 300);
//				��ʾ����
				frame.setVisible(true);
			}

		});
	}

	public static void main(String args[]) {
		fr.Init();
		fr.Display();
		fr.Validate();
		fr.getConnection();
		fr.setLayout(new BorderLayout());
		fr.add(panelFirst, BorderLayout.NORTH);
		fr.add(panelSecond, BorderLayout.SOUTH);
		fr.setVisible(true);
	}
}
