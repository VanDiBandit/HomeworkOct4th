package CodeAlong;
import java.util.ArrayList;
import java.util.List;
//import list
public class NotesList {
    public static void main(String[] args) {
        //call data type to your list
        List<String> colors = new ArrayList<>();
        //if you want to add to your list do as below
        //call your list name then followed by .add
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors);
        //if you want to know the size of your list
        System.out.println(colors.size());
        //can SysOut a boolean answer with .contains
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        //loop through List array
        for(String color : colors){
            System.out.println(color);
        }
        //you can looop using for each
        colors.forEach(System.out::println);

        //you can loop using traditional loop as well
        for (int i = 0; 1 < colors.size(); i++){

            //SysOut List
            System.out.println(colors.get(i));
        }
        //with our list we tell it which data types to hold
        //colors.add(1);
        //colors.add(new Object());
    }
}