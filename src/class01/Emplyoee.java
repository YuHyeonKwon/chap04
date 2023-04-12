package class01;

public class Emplyoee { // class s

	// 필드
	private String name;
	private int age;
	private int salart;
	private String local;
	private int terms;
	private String gubun;

	// 기본생성자
	public Emplyoee() {

	}

	// 오버로딩 생성자
	public Emplyoee(String name, int age, int salart, String local, int terms, String gubun) {
		this.name = name;
		this.age = age;
		this.salart = salart;
		this.local = local;
		this.terms = terms;
		this.gubun = gubun;
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
		this.age = age;
	}

	public int getSalart() {
		return salart;
	}

	public void setSalart(int salart) {
		this.salart = salart;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getTerms() {
		return terms;
	}

	public void setTerms(int terms) {
		this.terms = terms;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

} // class e
