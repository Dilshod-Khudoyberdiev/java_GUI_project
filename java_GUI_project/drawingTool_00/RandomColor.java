package drawingTool_00;

import java.awt.Color;
import java.util.Random;

public class RandomColor {
    public static Color randColor(Color inputColor) {
        Random random = new Random();

        // Generate random RGB values
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        // Create a new color object with the random RGB values
        Color randomColor = new Color(red, green, blue);
        return randomColor;
    }
    
    public static Color randDarkColor(Color inputColor) {
        Random random = new Random();

        // Generate random RGB values
        int red = random.nextInt(128);
        int green = random.nextInt(128);
        int blue = random.nextInt(128);

        // Create a new color object with the random RGB values
        Color randomColor = new Color(red, green, blue);
        return randomColor;
    }
}
