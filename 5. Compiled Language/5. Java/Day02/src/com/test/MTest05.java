package com.test;

//�����(�����) char(2byte) -> '  '
public class MTest05 {

	public static void main(String[] args) {
		
		char ch=65; //65(�ƽ�Ű �ڵ� �� 65��)
		System.out.println("ch="+ch);
		
		
		char r =(char) (ch +1); //(char) int+int ��� ���� �ٲ㼭 char�� �ٲ��   , ��������ڸ� ������ �⺻�ڷ�������
		System.out.println("r="+r);

		
		System.out.println("ch="+ch);
		
		ch =100;
		System.out.println("ch="+ch); //�� ���� ���뿡 �������� ���� �ƴ϶� ���� ���� ��
		
		ch='\uffff';
		System.out.println("ch="+ch); //�����ڵ� 
		
		ch='\uffff';
		System.out.println("ch="+(int)ch); //���ڸ� ���ڷ� ��� �ּ���->int ���̱�
		
		System.out.println((char)97); //���ڸ� ���ڷ� ��� �ּ��� ->char ���̱�
	}

}
