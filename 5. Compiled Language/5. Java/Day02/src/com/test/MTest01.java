package com.test;

//�⺻ ��� �żҵ�: printf(), println(), �����
//printf()�� println() ����: ln�� ���� ����Ǿ� ��µȴ�.
public class MTest01 {
		//printf(String format, Object... args) ...->1more, �ڵ�� �޼ҵ� �ȿ� �ۼ��Ѵ�
	public static void main(String[] args) {
		
		//1. ������ ���   %��ü �ڸ���d   ����� \t \n \\ \r \b
		System.out.printf("%5d%5d%5d\n",100,200,300 ); //5ĭ �����ڸ� Ȯ�� �� 100�� ���
		System.out.println(100+"\t"+100+"\t"+100);
		
		//2. �Ǽ��� ��� %f	%��ü�ڸ���.�Ҽ��ڸ���f	%3.1f
		System.out.printf("%3.1f\n",97.85);
		
		//3. �ѹ��� %c		���ڿ�%s
		System.out.printf("%5c%-10s\n",'a',"abc");
		System.out.println("������\'���\'�� ����");
		System.out.println("������\"���\"�� ���� �뵷\\30000");
	
	}

}
