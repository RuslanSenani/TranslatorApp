package enums;

public enum Options {

    START("[1]. Start\n"),
    ADD_WORDS("[2]. Add Words\n"),
    SEE_ALL_HISTORY("[3]. See All History\n"),
    EXIT("[0]. Exit \n");
    private final String value;

    public String getValue() {
        return value;
    }


    Options(String value) {
        this.value = value;
    }
}
