public class Employee {
	String name;
	float salary;
	int workHours;
	int hireYear;
	
	Employee(String name, float salary, int workHours, int hireYear)
	{
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	private float tax(){
		float taxes = 0.0f;
		 if(this.salary >= 1000)
		 {
			 taxes = this.salary * (3f/100);
			 System.out.println("Vergi : " + taxes);
		 }
		return taxes;
	}
	
	private float bonus()
	{
		float addition = 0f;
		if(this.workHours > 40)
		{
			addition = this.workHours - 40;
			addition *= 30;
			System.out.println("Bonus : " + addition);
		}
		return addition;
	}
	
	private float raiseSalary()
	{
		int seniority = 2021 - this.hireYear;
		float raise;
		if (seniority < 10)
		{
			raise = this.salary * (5f/100);
		}else if (seniority < 20)
		{
			raise = this.salary *(10f/100);
		}else {
			raise = this.salary * (15f/100);
		}
		System.out.println("Maaş artışı : " + raise);
		return raise;
	}
	
	public String toString(){
		System.out.println("Adı : " + this.name + "\n"
			+ "Maaşı : " + this.salary + "\n"
			+ "Çalışma saati : " + this.workHours + "\n"
			+ "Başlangıç yılı : " + this.hireYear) ;
		float taxes = tax();
		float add = bonus();
		float willRaise = raiseSalary();
		this.salary = this.salary - taxes + add;
		System.out.println("Vergi ve bonuslar ile birlikte maaş : " + this.salary);
		this.salary += willRaise;
		System.out.println("Toplam maaş : " + this.salary);
		return null;
	}
}
