package services;

import model.Word;
import services.interfaces.IGameServices;
import utils.ColorsUtil;
import utils.InputUtil;
import utils.RandomUtil;

public class GameServices implements IGameServices {
    private final FileServices fileServices;

    public GameServices() {
        fileServices = new FileServices();
    }

    @Override
    public void add() {
        String key =InputUtil.requiredString("Enter Azerbaijan Word");
        String value =InputUtil.requiredString("Enter English Word");

        boolean isaAdded = fileServices.writeFile(new Word(key,value));
        System.out.println(isaAdded ? "Successfully.." : "Fail");
    }

    @Override
    public void start() {
        Word[] words = fileServices.readFile();
        int point = 0;
        int wrongPoint=3;
        for (int i = 0; i < 10; i++) {
            int randomIndex = RandomUtil.getRandomIndex(words.length);
            Word word = words[randomIndex];
            if (!word.isShowed()) {
                String value = InputUtil.requiredString(word.getKey() + "=>");
                if (word.getValue().equals(value)) {
                    point++;
                }
                word.setShowed(true);
            } else {
                wrongPoint--;
                if(wrongPoint==0){
                    point-=1;
                }
                i--;
            }
        }
        System.out.println("Congrats Your Point is " + ColorsUtil.GREEN_UNDERLINED + point + " !");
    }

    @Override
    public void see() {
        Word[] words = fileServices.readFile();
        System.out.println("--------- Words ---------");
        for (Word word : words) {
            System.out.println(word.getKey());
        }
        System.out.println("---------------------------");

    }
}
