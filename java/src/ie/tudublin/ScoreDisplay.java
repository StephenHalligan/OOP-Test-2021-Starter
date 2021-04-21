package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet {

	//String score = "DEFGABcd";
	String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList <Note> noteList = new ArrayList<Note>();

	public void loadScore() {

		for(int i = 0; i < score.length(); i++) {
			Note note = new Note(score.charAt(i), 1);
			Duration duration = new Duration(score.charAt(i+1),0);
			if(score.charAt(i) != '2') {
				noteList.add(note);
				System.out.println("!2 working");
			}

		}
	}

	public void printScores() {

		String typeOfNote = "Quaver";
		for(Note note : noteList) {
			System.out.println(note.toString()+" "+typeOfNote);

		}
	}

	public void settings() {

		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() {

		loadScore();
		printScores();

		drawNotes();

	}

	public void draw() {

		background(255);
		
		drawStave();

	}

	void drawStave() {
	
		strokeWeight(3);

		line(width/2-width/2.2f, height/2-height/5, width/2+width/2.2f, height/2-height/5); 			//F
		line(width/2-width/2.2f, height/2-height/5+25, width/2+width/2.2f, height/2-height/5+25);   	//D
		line(width/2-width/2.2f, height/2-height/5+50, width/2+width/2.2f, height/2-height/5+50);  	 	//Middle line (B)
		line(width/2-width/2.2f, height/2-height/5+75, width/2+width/2.2f, height/2-height/5+75);   	//G
		line(width/2-width/2.2f, height/2-height/5+100, width/2+width/2.2f, height/2-height/5+100); 	//E

	}

	void drawNotes() {

		for(int i = 0; i < noteList.size(); i++) {
			//Note note = new Note(score.charAt(i), 1);
			//System.out.println(noteList.get(i).toString());

			String currNote = noteList.get(i).toString().substring(0, noteList.get(i).toString().indexOf(" ")); 

			/*switch(currNote) {
				case "D":
					System.out.println("WORKIN");
					break;
				case "E 1":
					System.out.println("f");
					break;
				case "F 1":
					System.out.println("f");
					break;
				case "G 1":
					System.out.println("f");
					break;
				case "A 1":
					System.out.println("f");
					break;
				case "B 1":
					System.out.println("f");
					break;
				case "c 1":
					System.out.println("f");
					break;
				case "d 1":
					System.out.println("f");
					break;

				

			}*/
		}

	}
}