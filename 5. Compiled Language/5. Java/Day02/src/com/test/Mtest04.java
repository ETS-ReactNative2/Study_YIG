package com.test;
//�⺻�ڷ��� byte(1) ->char(2)->short(2)->int(4)->long(8)->float(4)->double(8)
//0,1 bit*8=8bit (���� �Ѱ�) =1byte stream (��ġ�� ũ���� Ÿ�Կ� �ٶ� �޸𸮸� Ȯ���Ѵ�)
public class Mtest04 {

	public static void main(String[] args) {
		//1byte������ Ȯ��
		byte a=10; //a��� ������ 10�� �����Ѵ�
		System.out.println("a="+a); //���� a�� ȣ���ϸ� ���� �����Ѵ�
		byte b=(byte) 127; //byte�� 1����Ʈ��� ���� ����.
		System.out.println("b="+b);
		
		short c=30000;
		System.out.println("c="+c);
		
		int r=100;
		System.out.println(r);
		
		long abc=10000000000l;
		System.out.println("long="+abc);
		
		float f=90.9f;
		System.out.println("f="+f);
		
		double d=90.0;
		System.out.println("d="+d);
		
	
		
	}

}
