package utils;

import enums.Options;

public class MenuUtil {
    public static int showMenu(){
        System.out.println(ColorsUtil.GREEN+
                "\n--------------  Translator App Menu  --------------\n"+
                        Options.START.getValue()+
                        Options.ADD_WORDS.getValue()+
                        Options.SEE_ALL_HISTORY.getValue()+
                        Options.EXIT.getValue()
                        +
                "--------------------------------------------------------"
        );


        return  InputUtil.requiredInt("Choose Option !! ");
    }
}
