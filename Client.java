package Fly;

import java.util.*;

public class Client {
	public static void main(String[] args) {
		Random rd=new Random();
		PieceFactory pf=new PieceFactory();
		for(int i=0;i<19;i++)
			for(int j=0;j<19;j++)
			{
				APiece p;
				if(rd.nextInt()%2==0)
					p=pf.GetPiece("����");
				else 
					p=pf.GetPiece("����");
				p.Play(rd.nextInt(19), rd.nextInt(19));
			}
		System.out.println("�ܹ�������Ϊ��"+pf.GetPieceCount());
	}
}
