package Test0412;

//A simple question:print each step of Hanio by using recursion;

import java.util.Scanner;

public class Hanoi {
	/**
	 * 打印汉诺塔移动顺序
	 * @param args
	 */
	static int count = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入汉诺塔层数：");
		int n = input.nextInt();
		f(n,"a","b","c");
		System.out.println("一共需要挪动"+count+"步");
		input.close();
	}
	
	/**
	 * 用递归打印步骤
	 * @param n 汉诺塔层数
	 * @param s1 起点柱子
	 * @param s2 第三个柱子
	 * @param s3 重点柱子
	 */
	public static void f(int n, String s1,String s2, String s3) {	
		if(n==1) {
			count+=1;
			System.out.println(s1+"-->"+s3);
		}else {
			f(n-1,s1,s3,s2);
			f(1,s1,s2,s3);
			f(n-1,s2,s1,s3);
		}
	}
}
