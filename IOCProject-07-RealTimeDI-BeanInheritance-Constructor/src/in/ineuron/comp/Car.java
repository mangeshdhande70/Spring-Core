package in.ineuron.comp;

public class Car {

	private String regNo;
	private String engineNo;
	private String model;
	private String company;
	private String type;
	private int engineCC;
	private String color;
	private String owner;
	private String fuelType;
	
	static{
		System.out.println("Car.class file is loading...");
	}
	
	public Car() {
		System.out.println("Car object is instantiated.....");
	}

	
	public Car(String regNo, String engineNo, String model, String company, String type, int engineCC, String color,
			String owner, String fuelType) {
		super();
		System.out.println("Car Object created using :: parameterised");
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.model = model;
		this.company = company;
		this.type = type;
		this.engineCC = engineCC;
		this.color = color;
		this.owner = owner;
		this.fuelType = fuelType;
		
	}





	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engineNo=" + engineNo + ", model=" + model + ", company=" + company
				+ ", type=" + type + ", engineCC=" + engineCC + ", color=" + color + ", owner=" + owner + ", fuelType="
				+ fuelType + "]";
	}

}
