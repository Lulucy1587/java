package Vis;

public class Saler extends AVisitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("收银员"+name+"给顾客结算苹果");
	}

	@Override
	public void visit(Book book) {
		System.out.println("收银员"+name+"直接计算书的价钱");
	}

}
