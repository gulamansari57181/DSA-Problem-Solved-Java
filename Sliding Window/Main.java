

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle{
	private int number;
	private String name;
	private double price;
	public Vehicle(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

public class Main {
	public static Vehicle findVehicleWithMinimumPrice(ArrayList<Vehicle> veh) {
		Vehicle minVeh = null;
		for(Vehicle v: veh) {
			if(minVeh == null) {
				minVeh = v;
			}else if(minVeh.getPrice()>v.getPrice()) {
					minVeh = v;
			}
		}
		return minVeh;
	}
	
	public static Vehicle searchVehicleByName(ArrayList<Vehicle> veh, String s) {
		Vehicle schVeh = null;
		for(Vehicle v : veh) {
			if(v.getName().equalsIgnoreCase(s)) {
				schVeh = v;
				break;
			}
		}
		return schVeh;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Vehicle> vehicle = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vehicle.add(new Vehicle(num, name, price));
		}
		sc.nextLine();
		String s = sc.nextLine();
		Vehicle fv = findVehicleWithMinimumPrice(vehicle);
		Vehicle sv = searchVehicleByName(vehicle, s);
		if(fv != null) {
			System.out.println("number-"+fv.getNumber());
			System.out.println("name-"+fv.getName());
			System.out.println("price-"+fv.getPrice());
		}else {
			System.out.println("No Vehicle found with mentioned attribute");
		}
		if(sv != null) {
			System.out.println("number-"+sv.getNumber());
			System.out.println("name-"+sv.getName());
			System.out.println("price-"+sv.getPrice());
		}else {
			System.out.println("No Vehicle found with mentioned attribute");
		}
		
	}
}
