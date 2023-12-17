package Architecture;

public enum Signal {
    PUSHED("Pushed");
    private final String value;
    Signal(String string) {
        this.value = string;
    }
    public String getValue() {
        return this.value;
    }
}
