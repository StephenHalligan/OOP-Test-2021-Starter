package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList <Note> noteList = new ArrayList<Note>();

	public void loadScore() {
		for(int i = 0; i < score.length(); i++) {
			Note note = new Note(score.charAt(i), 1);
			noteList.add(note);
		}
	}

	public void printScores() {

		String typeOfNote = "Quaver";
		for(Note note : noteList) {
			System.out.println(note.toString()+" "+typeOfNote);
		}
	}

	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);	
	}

	void drawNotes()
	{

	}
}