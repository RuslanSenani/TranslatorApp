package services.interfaces;

import model.Word;

public interface IFileServices {
    Word[] readFile();

    boolean writeFile(Word word);

}
