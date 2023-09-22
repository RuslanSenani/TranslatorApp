package model;

public class Word {
        private String key;
        private String value;
        private  boolean isShowed;

    public Word(String key, String value) {
        setKey(key);
        setValue(value);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key.trim().toLowerCase();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value.trim().toLowerCase();
    }

    public boolean isShowed() {
        return isShowed;
    }

    public void setShowed(boolean showed) {
        isShowed = showed;
    }

    @Override
    public String toString() {
        return  "\n"+key+":"+value;
    }
}
