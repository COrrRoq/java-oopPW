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
		
		
		System.out.println("Which genre of games would you like to play? ");
		System.out.println("Sports, Shooter or RPG: ");
		
		//userIn = System.console().readLine();
		Scanner reader = new Scanner(System.in);
		userIn = reader.next().toUpperCase();
		
		System.out.println(userIn);
		
		while (userIn != "QUIT") {
			
			System.out.println("LOOP REACHED");
			
			if (userIn == "SPORTS") {
				
				System.out.println("Which game would you like to play? ");
				System.out.println("Fifa or Madden");
				
				gameChoice = reader.next().toUpperCase();
				
				if (gameChoice == "FIFA") {
					
					System.out.println("Which action would you like to perform?");
					System.out.println("Get Ball Kicked, Goal Scored or Match Score");
					
					gameChoice = reader.next().toUpperCase();
					
					if (gameAction == "BALL KICKED") {
						fifa.ballKicked();
					} else if (gameAction == "GOAL SCORED") {
						fifa.goalScored();
					} else if (gameAction == "MATCH SCORE") {
						fifa.getMatchScore();
					}
					
					
				} else if (gameChoice == "MADDEN") {
					
					System.out.println("Which action would you like to perform?");
					System.out.println("Get Ball Kicked, Goal Scored or Match Score");
					
					gameChoice = reader.next().toUpperCase();
					
					if (gameAction == "BALL KICKED") {
						madden.ballKicked();
					} else if (gameAction == "GOAL SCORED") {
						madden.goalScored();
					} else if (gameAction == "MATCH SCORE") {
						madden.getMatchScore();
					}
					
				}
			} else if (userIn == "SHOOTER") {
				
				System.out.println("Which game would you like to play? ");
				System.out.println("COD or Halo");
				
				gameChoice = reader.next().toUpperCase();
				
				if (gameChoice == "COD") {
					
					System.out.println("Which action would you like to perform?");
					System.out.println("Get Kills, Deaths or KD Ratio");
					
					gameChoice = reader.next().toUpperCase();
					
					if (gameAction == "KILLS") {
						callOfDuty.getKills();
					} else if (gameAction == "DEATHS") {
						callOfDuty.getDeaths();
					} else if (gameAction == "KD RATIO") {
						callOfDuty.getKDRatio();
					}
					
				} else if (gameChoice == "HALO") {
					
					System.out.println("Which action would you like to perform?");
					System.out.println("Get Kills, Deaths or KD Ratio");

					gameChoice = reader.next().toUpperCase();
					
					if (gameAction == "KILLS") {
						halo.getKills();
					} else if (gameAction == "DEATHS") {
						halo.getDeaths();
					} else if (gameAction == "KD RATIO") {
						halo.getKDRatio();
					}
					
				}
				
				
			} else if (userIn == "RPG") {
				
				
				System.out.println("Which game would you like to play? ");
				System.out.println("God Of War or Assassin's Creed");
				
				gameChoice = reader.next().toUpperCase();
				
				if (gameChoice == "GOD OF WAR") {
					
				} else if (gameChoice == "ASSASSIN'S CREED") {
					
				}
				
			}
			
		}
		
		
		reader.close();
	}
	
}


	
	