package CodeAlong;
//always import Arrays package when using array
import java.util.Arrays;

public class Notes {
    //data structures
    //new package(but I already made mine before the video
    //Starting with Arrays
    //Arrays & 2D Arrays, Arrays are building blocks for many different java structures
    //create a main method
    public static void main(String[] args) {
        //specify a data type
        //initialze by = new
        //specify the number the array can hold

        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";
        colors[2] = "Yellow";
        //system out Arrays.toString(colors) for the array to print
        System.out.println(Arrays.toString(colors));

        //for a specific index
        System.out.println(colors[0]);

        //can make an array like this when you know the elements an array will have
        //once you define the array you are no longer allowed to change the size
        int[] numbers = {100, 200};
        //numbers[0] = 100;
        //numbers[1] = 200;

        //Length of array not the numbers of the array
        System.out.println(colors.length);
        //loop through array
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //for reverse loop
        for (int i = colors.length - 1; i >= 0; i--){
            System.out.println(colors[i]);
        }
        //another loop is enhanced for loop
        for (String color : colors){
            System.out.println(color);
        }
        //Streams
        Arrays.stream(colors).forEach(System.out::println);

    }
}
