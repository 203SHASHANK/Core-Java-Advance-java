package javabean;

public class TeamIndia {

	private String captain;
	private String viceCaptain;

	public void setCaptain(String captain ) {
		this.captain=captain;
	}

	public String getCaptain() {
		return captain;
	}

	public void setViceCaptain(String viceCaptain ) {
		this.viceCaptain=viceCaptain;
	}

	public String getViceCaptain() {
		return viceCaptain;
	}

	public static void main(String[] args) {
		TeamIndia indiaA = new TeamIndia();
		indiaA.setCaptain("Shubman Gill");
		indiaA.setViceCaptain("Abhimanyu Easwaran");

		System.out.println("Captain :"+ indiaA.getCaptain());
		System.out.println("viceCaptain :"+ indiaA.getViceCaptain());

	}

}
