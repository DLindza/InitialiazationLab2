package lindsay.devon.InitializationLab2;

/**
 * Created by devonlindsay on 9/11/16.
 */
public class ColorfulThing {
    private Color color;

    public ColorfulThing (Color color) {
        this.color = color;

    }

    public Color getColor() {

        return color;

    }
// Thank you, Evan!
    @Override
    public String toString(){
        return this.getColor().name();
    }

    public enum Color {RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE}


public Color makeRandomColor() {
    int randomColor = (int)((Math.random() * 10) % 6) + 1;

    switch(randomColor) {

        case 1:
            color = Color.RED;
            System.out.println(Color.RED);

        case 2:
            color = Color.ORANGE;
            System.out.println(Color.ORANGE);

        case 3:
            color = Color.YELLOW;
            System.out.println(Color.YELLOW);

        case 4:
            color = Color.GREEN;
            System.out.println(Color.GREEN);

        case 5:
            color = Color.BLUE;
            System.out.println(Color.BLUE);

        case 6:
            color = Color.PURPLE;
            System.out.println(Color.PURPLE);
    }
    return color;

}


}
