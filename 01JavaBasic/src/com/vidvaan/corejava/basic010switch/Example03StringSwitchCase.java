package com.vidvaan.corejava.basic010switch;

public class Example03StringSwitchCase {
	public static void main(String args[]) {

		visitIsland("radhika");
//		visitIsland("BarrenIsland");
//		visitIsland("MajuliIsland ");

	}

	public static void visitIsland(String island) {
		switch (island) {
		case "Lakshadweep":
			System.out.println("User wants to visit Lakshadweep");
			break;
		case "BarrenIsland":
			System.out.println("User wants to visit Barren Island");
			break;
		case "MajuliIsland ":
			System.out.println("User wants to visit Majuli Island ");
			break;
		case "LoktakLakeIslands":
			System.out.println("User wants to visit LoktakLake Islands");
			break;
		default:
			System.out.println("Unknown Island");
			break;
		}
	}

}
