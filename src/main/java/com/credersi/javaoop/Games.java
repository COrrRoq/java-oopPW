package com.credersi.javaoop;
import java.util.Scanner;

public class Games {
	
	private String gameGenre;
	private String ageRestriction;
	private int hoursPlayed;
	private String timesPlayed;
	private String[] recentlyPlayed;
	
	
	public Games() {
	}
	
	public String getGenre() {
		return this.gameGenre;
	}
	
	public int getHoursPlayed() {
		return this.hoursPlayed;
	}
	
	public String getTimesPlayed() {
		return this.timesPlayed;
	}
	
	public String getAgeRestriction() {
		return this.ageRestriction;
	}
	
	public String[] getRecentlyPlayedList() {
		return this.recentlyPlayed;
	}
	
	
	public static void main(String[] args) {
		RPG godOfWar = new GodOfWar();
		RPG assassinsCreed = new AssassinsCreed();
		
		Shooter callOfDuty = new COD();
		Shooter halo = new Halo();
		
		Sports fifa = new Fifa();
		Sports madden = new Madden();
		
		String userIn = "";
		String gameChoice = "";
		String gameAction = "";
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Which genre of games would you like to play? ");
		System.out.println("Sports, Shooter or RPG: ");
		
		userIn = reader.next().toUpperCase();
			
		if (userIn.equals("SPORTS")) {

			System.out.println("Which game would you like to play? ");
			System.out.println("Fifa or Madden");

			gameChoice = reader.next().toUpperCase();

			if (gameChoice.equals("FIFA")) {

				System.out.println("Which action would you like to perform?");
				System.out.println("Get Ball Kicked, Goal Scored or Match Score");

				gameAction = reader.next().toUpperCase();

				if (gameAction.equals("BALL KICKED")) {
					System.out.println(fifa.ballKicked());
				} else if (gameAction.equals("GOAL SCORED")) {
					System.out.println(fifa.goalScored());
				} else if (gameAction.equals("MATCH SCORE")) {
					System.out.println(fifa.getMatchScore());
				}

			} else if (gameChoice.equals("MADDEN")) {

				System.out.println("Which action would you like to perform?");
				System.out.println("Get Ball Kicked, Goal Scored or Match Score");

				gameAction = reader.next().toUpperCase();

				if (gameAction.equals("BALL KICKED")) {
					System.out.println(fifa.ballKicked());
				} else if (gameAction.equals("GOAL SCORED")) {
					System.out.println(madden.goalScored());
				} else if (gameAction.equals("MATCH SCORE")) {
					System.out.println(madden.getMatchScore());
				}

			}
		} else if (userIn.equals("SHOOTER")) {

			System.out.println("Which game would you like to play? ");
			System.out.println("COD or Halo");

			gameChoice = reader.next().toUpperCase();

			if (gameChoice.equals("COD")) {

				System.out.println("Which action would you like to perform?");
				System.out.println("Get Kills, Deaths or KD Ratio");

				gameAction = reader.next().toUpperCase();

				if (gameAction.equals("KILLS")) {
					System.out.println(callOfDuty.getKills());
				} else if (gameAction.equals("DEATHS")) {
					System.out.println(callOfDuty.getDeaths());
				} else if (gameAction.equals("KD")) {
					System.out.println(callOfDuty.getKDRatio());
				}

			} else if (gameChoice.equals("HALO")) {

				System.out.println("Which action would you like to perform?");
				System.out.println("Get Kills, Deaths or KD Ratio");

				gameAction = reader.next().toUpperCase();

				if (gameAction.equals("KILLS")) {
					System.out.println(halo.getKills());
				} else if (gameAction.equals("DEATHS")) {
					System.out.println(halo.getDeaths());
				} else if (gameAction.equals("KD")) {
					System.out.println(halo.getKDRatio());
				}

			}

		} else if (userIn.equals("RPG")) {

			System.out.println("Which game would you like to play? ");
			System.out.println("God Of War or Assassin's Creed");

			gameChoice = reader.next().toUpperCase();

			if (gameChoice.equals("GOD OF WAR")) {
				
				System.out.println("Which action would you like to perform?");
				System.out.println("Get Level, Missions Completed or Percentage Complete");

				gameAction = reader.next().toUpperCase();

				if (gameAction.equals("LEVEL")) {
					System.out.println(godOfWar.getLevel());
				} else if (gameAction.equals("MISSIONS COMPLETED")) {
					System.out.println(godOfWar.getMissionsCompleted());
				} else if (gameAction.equals("PERCENTAGE COMPLETED")) {
					System.out.println(godOfWar.getPercentageComplete());
				}


			} else if (gameChoice.equals("ASSASSIN'S CREED")) {

				System.out.println("Which action would you like to perform?");
				System.out.println("Get Level, Missions Completed or Percentage Complete");

				gameAction = reader.next().toUpperCase();

				if (gameAction.equals("LEVEL")) {
					System.out.println(assassinsCreed.getLevel());
				} else if (gameAction.equals("MISSIONS COMPLETED")) {
					System.out.println(assassinsCreed.getMissionsCompleted());
				} else if (gameAction.equals("PERCENTAGE COMPLETED")) {
					System.out.println(assassinsCreed.getPercentageComplete());
				}
			}

		}
		reader.close();
	}
	
}


	
	