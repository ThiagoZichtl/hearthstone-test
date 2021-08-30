package zichtlthiago.hearthstonecards.rest.api.entity;

public enum CardClass {

    Mage(0),
    Paladin(1),
    Hunter(2),
    Druid(3),
    Any(4);

    private int code;

    private CardClass(int code) {
        this.code = code;
    }


    public int getCode() {
        return code;
    }

    public static CardClass valueOf(int code) {
        for (CardClass value : CardClass.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Class");
    }
}

