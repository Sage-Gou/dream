package Test0412;

//A simple question:print each step of Hanio by using recursion;

import java.util.Scanner;

public class Hanoi {
	/**
	 * ��ӡ��ŵ���ƶ�˳��
	 * @param args
	 */
	static int count = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����뺺ŵ��������");
		int n = input.nextInt();
		f(n,"a","b","c");
		System.out.println("һ����ҪŲ��"+count+"��");
		input.close();
	}
	
	/**
	 * �õݹ��ӡ����
	 * @param n ��ŵ������
	 * @param s1 �������
	 * @param s2 ����������
	 * @param s3 �ص�����
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
