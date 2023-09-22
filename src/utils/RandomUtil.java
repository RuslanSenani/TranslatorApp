package utils;

import java.util.Random;

public class RandomUtil {

    public  static int getRandomIndex(int size){
        Random random = new Random();
        return  random.nextInt(size);
    }

}
