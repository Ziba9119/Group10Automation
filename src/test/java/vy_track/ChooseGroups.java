package vy_track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ChooseGroups {

    //1-taha, yadi, pasha, kamila ==> Vechicle Costs
    //2-nicole, malika, denys, fadime  ==> Vehicle
    //3-ziba, imil, khulkar ==> Vehicle Odometer
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Imil", "Khulkar", "Fadime", "Pasha", "Malika", "Kamila","Yadi", "Denys"));

    public static void main(String[] args) {

        for(int i = 0; i < 8; i++){
            System.out.println(getName());
        }


    }

    public static String getName(){
        int index = new Random().nextInt(names.size());
        String name = names.remove(index);
        return name;
    }




}
