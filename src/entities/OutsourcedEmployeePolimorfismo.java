package entities;

public class OutsourcedEmployeePolimorfismo extends EmployeePolimorfismo {

	private Double additionalCharge;

	public OutsourcedEmployeePolimorfismo() {
		super();
	}
	
	public OutsourcedEmployeePolimorfismo(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}