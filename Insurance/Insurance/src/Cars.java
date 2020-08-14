public class Cars {
	
	private String num;
	private int year;
	private boolean crashed;
	
	public Cars() {
		this.num = "";
		this.year = 0;
		this.crashed = false;
	}
	
	public Cars(String n, int y, boolean c) {
		this.num = n;
		this.year = y;
		this.crashed = c;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean getCrashed() {
		return crashed;
	}

	public void setCrashed(boolean crashed) {
		this.crashed = crashed;
	}
	
	public String toString() {
		if (this.crashed == true)
		return ("Reg plate number: " + this.num + " from the year: "  + this.year + " has been crashed.\n");
		else
			return ("Reg plate number: " + this.num + " from the year: "  + this.year + " has not been crashed.\n");
	}
}