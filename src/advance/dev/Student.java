package advance.dev;

public class Student {

	/*
	 * Lop Student chua
	 * Ten
	 * Tuoi
	 * Dia chi
	 * SDT
	 * DiemTB
	 */
	private String name;
	private int age;
	private String address;
	private String numberPhone;
	private float diemTB;
	public Student(String name, int age, String address, String numberPhone, float diemTB) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.numberPhone = numberPhone;
		this.diemTB = diemTB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
		this.age = age;
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		if(diemTB >= 0) {
			this.diemTB = diemTB;
		}
	}
	
	
	
	
}
