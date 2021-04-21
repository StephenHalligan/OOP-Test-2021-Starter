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
			
			int duration = 1;

			if(i+1 != score.length()) {
				if(score.charAt(i+1) == '2') {
					duration = 2;
				}
				else {
					duration = 1;
				}
			}
	
			Note note = new Note(score.charAt(i), duration);
			noteList.add(note);

			if(score.charAt(i) == '2' || score.charAt(i) == '1') {
				noteList.remove(note);
			}

		}
	}

	public void printScores() {

		String typeOfNote;

		typeOfNote = "Quaver";
		for(Note note : noteList) {

			if(note.getDuration() == 2) {
				typeOfNote = "Crotchet";
			}
			if(note.getDuration() == 1) {
				typeOfNote = "Quaver";
			}

			System.out.println(note.toString() + " " + typeOfNote);
			
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

	}

	public void draw() {

		background(255);
		
		drawStave();

		drawNotes();

	}

	void drawStave() {
	
		strokeWeight(3);

		fill(0);
		stroke(0);

		line(width/2-width/2.2f, height/2-height/5, width/2+width/2.2f, height/2-height/5); 			//F
		line(width/2-width/2.2f, height/2-height/5+25, width/2+width/2.2f, height/2-height/5+25);   	//D
		line(width/2-width/2.2f, height/2-height/5+50, width/2+width/2.2f, height/2-height/5+50);  	 	//Middle line (B)
		line(width/2-width/2.2f, height/2-height/5+75, width/2+width/2.2f, height/2-height/5+75);   	//G
		line(width/2-width/2.2f, height/2-height/5+100, width/2+width/2.2f, height/2-height/5+100); 	//E

	}

	void drawNotes() {

		float xPos = width/2-width/3f;
		int size = 22;

		for(int i = 0; i < noteList.size(); i++) {

			fill(0);
			textSize(26);

			if(mouseX > xPos - 50 && mouseX < xPos + 50) {
				fill(255, 0, 0);
				stroke(255, 0, 0);
			}
			else {
				fill(0);
				stroke(0);
			}

			switch(noteList.get(i).toString()) {
				case "D 2":
					ellipse(xPos, height/2-height/5+112.5f, size, size);
					line(xPos+size/2, height/2-height/5+112.5f, xPos+size/2, height/2-height/3+112.5f);
					text("D", xPos, height/2-height/3);
					break;
				case "E 2":
					ellipse(xPos, height/2-height/5+100f, size, size);
					line(xPos+size/2, height/2-height/5+100, xPos+size/2, height/2-height/3+100);
					text("E", xPos, height/2-height/3);
					break;
				case "F 2":
					ellipse(xPos, height/2-height/5+87.5f, size, size);
					line(xPos+size/2, height/2-height/5+87.5f, xPos+size/2, height/2-height/3+87.5f);
					text("F", xPos, height/2-height/3);
					break;
				case "G 2":
					ellipse(xPos, height/2-height/5+75f, size, size);
					line(xPos+size/2, height/2-height/5+75f, xPos+size/2, height/2-height/3+75f);
					text("G", xPos, height/2-height/3);
					break;
				case "A 2":
					ellipse(xPos, height/2-height/5+62.5f, size, size);
					line(xPos+size/2, height/2-height/5+62.5f, xPos+size/2, height/2-height/3+62.5f);
					text("A", xPos, height/2-height/3);
					break;
				case "B 2":
					ellipse(xPos, height/2-height/5+50f, size, size);
					line(xPos+size/2, height/2-height/5+50f, xPos+size/2, height/2-height/3+50f);
					text("B", xPos, height/2-height/3);
					break;
				case "c 2":
					ellipse(xPos, height/2-height/5+37.5f, size, size);
					line(xPos+size/2, height/2-height/5+37.5f, xPos+size/2, height/2-height/3+37.5f);
					text("c", xPos, height/2-height/3);
					break;
				case "d 2":
					ellipse(xPos, height/2-height/5+25f, size, size);
					line(xPos+size/2, height/2-height/5+25f, xPos+size/2, height/2-height/3+25f);
					text("d", xPos, height/2-height/3);
					break;


				case "D 1":
					ellipse(xPos, height/2-height/5+112.5f, size, size);
					line(xPos+size/2, height/2-height/5+112.5f, xPos+size/2, height/2-height/3+112.5f);
					line(xPos+size/2, height/2-height/3+112.5f, xPos+size/2+15, height/2-height/3+125f);
					text("D", xPos, height/2-height/3);
					break;
				case "E 1":
					ellipse(xPos, height/2-height/5+100f, size, size);
					line(xPos+size/2, height/2-height/5+100, xPos+size/2, height/2-height/3+100);
					line(xPos+size/2, height/2-height/3+100, xPos+size/2+15, height/2-height/3+112.5f);
					text("E", xPos, height/2-height/3);
					break;
				case "F 1":
					ellipse(xPos, height/2-height/5+87.5f, size, size);
					line(xPos+size/2, height/2-height/5+87.5f, xPos+size/2, height/2-height/3+87.5f);
					line(xPos+size/2, height/2-height/3+87.5f, xPos+size/2+15, height/2-height/3+100f);
					text("F", xPos, height/2-height/3);
					break;
				case "G 1":
					ellipse(xPos, height/2-height/5+75f, size, size);
					line(xPos+size/2, height/2-height/5+75f, xPos+size/2, height/2-height/3+75f);
					line(xPos+size/2, height/2-height/3+75, xPos+size/2+15, height/2-height/3+87.5f);
					text("G", xPos, height/2-height/3);
					break;
				case "A 1":
					ellipse(xPos, height/2-height/5+62.5f, size, size);
					line(xPos+size/2, height/2-height/5+62.5f, xPos+size/2, height/2-height/3+62.5f);
					line(xPos+size/2, height/2-height/3+62.5f, xPos+size/2+15, height/2-height/3+75);
					text("A", xPos, height/2-height/3);
					break;
				case "B 1":
					ellipse(xPos, height/2-height/5+50f, size, size);
					line(xPos+size/2, height/2-height/5+50f, xPos+size/2, height/2-height/3+50f);
					line(xPos+size/2, height/2-height/3+50, xPos+size/2+15, height/2-height/3+62.5f);
					text("B", xPos, height/2-height/3);
					break;
				case "c 1":
					ellipse(xPos, height/2-height/5+37.5f, size, size);
					line(xPos+size/2, height/2-height/5+37.5f, xPos+size/2, height/2-height/3+37.5f);
					line(xPos+size/2, height/2-height/3+37.5f, xPos+size/2+15, height/2-height/3+50);
					text("c", xPos, height/2-height/3);
					break;
				case "d 1":
					ellipse(xPos, height/2-height/5+25f, size, size);
					line(xPos+size/2, height/2-height/5+25f, xPos+size/2, height/2-height/3+25f);
					line(xPos+size/2, height/2-height/3+25, xPos+size/2+15, height/2-height/3+37.5f);
					text("d", xPos, height/2-height/3);
					break;

			}
			xPos = xPos + 100;
		}

	}
}