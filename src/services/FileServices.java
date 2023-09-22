package services;

import enums.FilePath;
import model.Word;
import services.interfaces.IFileServices;
import utils.ColorsUtil;

import java.io.*;
import java.util.concurrent.ExecutionException;

public class FileServices implements IFileServices {

    @Override
    public Word[] readFile() {
        File file = new File(FilePath.GET_FILE_PATH.getValue());
        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bytes = bufferedInputStream.readAllBytes();
            String wordFile = new String(bytes);
            String[] keysAndValues = wordFile.split("\n");
            Word[] words = new Word[keysAndValues.length];
            for (int i = 0; i < words.length; i++) {
                String[] keyAndValue = keysAndValues[i].split(":");
                words[i] = new Word(keyAndValue[0], keyAndValue[1]);
            }
            return words;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean writeFile(Word word) {
        File file = new File(FilePath.GET_FILE_PATH.getValue());
        try (OutputStream outputStream = new FileOutputStream(file, true)) {
            outputStream.write(word.toString().getBytes());
            return true;
        } catch (Exception ex) {
            System.out.println(ColorsUtil.RED_BOLD + ex.getMessage());
            return false;
        }
    }
}
