public class Spirale{

    public static Turtle turtle;
    static int picture_width  = 1024;
    static int picture_height = 1024;

    public static void main (String[] args) {
	turtle = new Turtle (picture_width,picture_height);
	turtle.setspeed (100);

	// Code pour dessiner
	turtle.up();
	turtle.moveto(-200,0);
	turtle.down();

	int largeur=10;
	for(int i=0;i<20;i=i+1){
	    turtle.setheading (180);
	    turtle.forward (largeur);
	     largeur += 10;
	    turtle.setheading (90);
	    turtle.forward (largeur);
	    largeur += 10;
	    turtle.setheading (0);
	    turtle.forward (largeur);
	    largeur += 10;
	    turtle.setheading (-90);
	    turtle.forward (largeur);
	    largeur += 10;
	}

	turtle.exitonclick ();
    }

}
