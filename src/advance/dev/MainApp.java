package advance.dev;

import java.util.Collections;
import java.util.Scanner;

public class MainApp {
	static Student[] input() {
		Student[] stu = new Student[10];
		for(int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao ten: ");
			String name = sc.next();
			System.out.println("Nhap vao tuoi:");
			int age = sc.nextByte();
			System.out.println("Nhap vao dia chi:");
			String address = sc.next();
			System.out.println("Nhap vao so dien thoai:");
			String numberPhone = sc.next();
			System.out.println("Nhap DTB= ");
			float diemTB = sc.nextFloat();
			Student std = new Student(name, age, address, numberPhone, diemTB);	
			stu[i] = std;
			System.out.println("==============");
		}
		return stu;
	}
	static void print(Student[] stu) {
		for (int i = 0; i < 10; i++) {
			String str = String.format("Ten: %s, Tuoi: %d, DiaChi: %s, SDT: %s, diemTb: %f", stu[i].getName(),stu[i].getAge(),stu[i].getAddress(),stu[i].getNumberPhone(),stu[i].getDiemTB());
			System.out.println(str);
		}
	}
	static void sxMang(Student[] stu) {
		Student temp = stu[0];
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length; j++) {
				if (stu[i].getDiemTB() > stu[j].getDiemTB() ) {
					temp = stu[i];  
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		}
	System.out.println("Mang sau khi sx la:");
	print(stu);
	}
	public static void main(String[] args) {
		Student[] student = new Student[10];
		student = input();
		print(student);
		sxMang(student);
	}
}
