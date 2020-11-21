package Behaviours;

public enum InstrumentType {

    STRING("String Instrument"),
    PERCUSSION("Percussion Instrument"),
    KEYBOARD("Keyboard Instrument"),
    WOOD("Wood Instrument");

    private String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
