import processing.core.PApplet;

public class Sketch extends PApplet {

	/**
   * A program Sketch.java that visually sketches a picture of a house on a grassy plain using width and height variables.
	 * @author: B. Zhang
	 * date: 2022-02-24
   */

	
  public void settings() {
		//size of the window
    size(400, 400);
  }

  public void setup() {
  	background(210, 255, 173);
  }

  public void draw() {
		
	// Using the ratio of each shape dimension, I divided/multiplied it with the user set width/height 
	// Sky
    fill(52, 223, 235);
    rect(width * 0, height * 0, width, height * 0.75f);

	// House Body
		fill(240, 65, 65);
		rect(width / 2, height / (400f / 175f), width / (400f / 150f), height / (400f / 125f));
	
	// Chimney
		fill(91, 98, 110);
		rect(width / (400f / 325f), height / (400f / 110f), width / (400f / 25f), height / (400f / 60f));
		
	// Roof Body
		fill(91, 98, 110);
		triangle(width / (400f / 175f), height / (400f / 175f), width / (400f / 375f), height / (400f / 175f), width / (400f / 275f), height / (400f / 100f));

	// Sun
		fill(235, 222, 52);
		ellipse(width / (400f / 25f), height / (400f / 25f), width / (400f / 100f), height / (400f / 100f));
  }
}