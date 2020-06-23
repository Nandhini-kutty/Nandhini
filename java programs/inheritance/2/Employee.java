package nn;

class Employee extends person {
	public double annualsalary;
	public String swork;
	public String insurance;
	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}
	public void setSwork(String swork) {
		this.swork = swork;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public double getAnnualsalary() {
		return annualsalary;
	}
	public String getSwork() {
		return swork;
	}
	public String getInsurance() {
		return insurance;
	}
}
