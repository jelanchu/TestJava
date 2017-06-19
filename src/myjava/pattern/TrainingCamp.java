package myjava.pattern;

public class TrainingCamp {
	public static Adventure trainAdventure(String type) {
		switch (type) {
		case "archer": {
			System.out.println("training an archer...");
			return new Archer();
		}
		default: return null;
		}
	}
}
