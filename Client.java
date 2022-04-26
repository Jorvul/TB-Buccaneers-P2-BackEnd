package connection.bucs;

public class Client {
	private int id;
	private String name;
	private int capHit;
	private int baseSalary;
	private int signingBonus;
	private int merchandise;
	private int active;
	private int salaryIncrease;
	private int age;
	private String position;
	
	public Client() {
		super();
	}
	
	public Client(int id, String name, int capHit, int baseSalary, int signingBonus, int merchandise, int active, int salaryIncrease, int age, String position) {
		super();
		this.id = id;
		this.name = name;
		this.capHit = capHit;
		this.baseSalary = baseSalary;
		this.signingBonus = signingBonus;
		this.merchandise = merchandise;
		this.active = active;
		this.salaryIncrease = salaryIncrease;
		this.age = age;
		this.position = position;
	}
	public Client(int id2, String name2) {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapHit() {
		return capHit;
	}

	public void setCapHit(int capHit) {
		this.capHit = capHit;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getSigningBonus() {
		return signingBonus;
	}

	public void setSigningBonus(int signingBonus) {
		this.signingBonus = signingBonus;
	}

	public int getMerchandise() {
		return merchandise;
	}

	public void setMerchandise(int merchandise) {
		this.merchandise = merchandise;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getSalaryIncrease() {
		return salaryIncrease;
	}

	public void setSalaryIncrease(int salaryIncrease) {
		this.salaryIncrease = salaryIncrease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", capHit=" + capHit + ", baseSalary=" + baseSalary
				+ ", signingBonus=" + signingBonus + ", merchandise=" + merchandise +", active=" + active +", salaryIncrease=" + salaryIncrease +", age=" + age +", position=" + position + "]";
	}
}
