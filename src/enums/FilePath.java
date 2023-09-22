package enums;

public enum FilePath {
    GET_FILE_PATH("files/Word.txt"),
    GET_LOG_FILE_PATH("files/GameLogs.txt");

    private  String value;

    FilePath(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
