package ie.tudublin;

import java.util.ArrayList;



import processing.core.PApplet;
import processing.data.Table;


public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	

	void loadScore()
	{
		for(int i=0;i<8;i++)
		{
			Note n= new Note();
			notes.add(n);

		}
		
	}
	void printScore()
	{
		println(score);
	}

	void drawGrid()
    {
        float border = 0.1f * width;
        for(int i = 1 ; i <=5 ; i ++)
        {
            float x = map(i, 1, 5, border, width - border);
            float y = map(i, 1, 5, border, height - border);
            stroke(0, 0, 0);
            line(border, y, width - border, y);
           
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
		printScore();
	}

	public void draw()
	{
		background(255);
		drawGrid();
		drawNotes();
		
	}

	void drawNotes()
	{
		//1
		strokeWeight(3);
		fill(0,0,0);
        ellipse(125, 425, 50, 50);
        stroke(0,0,0);
		line(150,430,150,250);
		line(150,250,190,300);
		
		//2
		fill(0,0,0);
        ellipse(240, 400, 50, 50);
        stroke(0,0,0);
		line(150,430,150,250);
		line(150,250,190,300);

		//3
		fill(0,0,0);
        ellipse(340, 360, 50, 50);

		//4
		fill(0,0,0);
        ellipse(440, 320, 50, 50);
	}


}
