import java.util.Map;
import java.util.HashMap;

public class FivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    Map<String, Integer> planets = new HashMap<String, Integer>();
    planets.put("Mercury", 56974146);
    planets.put("Venus", 25724767);
    planets.put("Mars", 48678219);
    planets.put("Jupiter", 390674710);
    planets.put("Saturn", 792248270);

    // speed of light and our speed
    final int LIGHT_SPEED =  670616629;
    int ourSpeed = LIGHT_SPEED / 10;

    // total travel time
    double total = 0;

    /* your code here */
    for (Map.Entry<String, Integer> planet : planets.entrySet()) {
        total += (double) planet.getValue() / ourSpeed;
    }
    double average = total / planets.size();

    System.out.println("Average time between planets: " + (int) (average + 0.5));
  }
}