void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

	int r = 175, g = 175, b = 175;

	background(r + 80, g + 80, b + 80);
  	stroke(r - 175, g - 175, b - 175);
  	fill(r, g, b);

	int x = 30, y = 30;
	int height = 50, width = 50;
  
	ellipse(x, y, height, width);

	x += 100;

	fill(r + 75, g, b);
	ellipse(x, y, height, width);

	y += 100;

	ellipse(x, y, height, width);

	x -= 100;

	fill(r - 175, g + 25, b + 80);
	ellipse(x, y, height, width);

}