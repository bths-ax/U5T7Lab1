public class Student {
	private static int totalPoints;
	private static int greatestPoints;

	private String name;
	private int points;

	public Student(String name) {
		this.name = name;
		this.points = 0;
		this.greatestPoints = 0;
	}

	public static int getTotalPointsEarned() { return totalPoints; }
	public static int getGreatestPoints() { return greatestPoints; }

	public void addPoints(int points) {
		this.points += points;
		totalPoints += points;
		greatestPoints = Math.max(greatestPoints, this.points);
	}

	public String studentInfo() {
		return
			"Student: " + name + "\n" +
			"Points: " + points;
	}
}
