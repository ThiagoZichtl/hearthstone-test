package zichtlthiago.hearthstonecards.rest.api.entity;

public enum CardType {

    Magic(0),
    Creature(1);


    private int code;

    private CardType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static CardType valueOf(int code) {
        for (CardType value : CardType.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Type");
    }

}
