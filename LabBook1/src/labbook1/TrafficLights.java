package labbook1;
enum Colour {RED,GREEN,YELLOW}
public class TrafficLights {
	public static void main(String args[])
	{
	Colour c = Colour.YELLOW;
	
	switch(c)
	{
	case RED:
	System.out.println("Stop");
	break;
	case GREEN:
	System.out.println("Go");
	break;
	case YELLOW:
	System.out.println("wait");
	break;
	}
	
}

}
