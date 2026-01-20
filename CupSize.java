public enum CupSize { //used enum to store cupsizes so that invalid sizes are not used
//enum is a special class that represents a group of constants (unchangeable variables)
// it prevents mistake while choosing cup sizes
    SMALL(0),
    MEDIUM(50),
    LARGE(100);

    private int extraPrice;

    CupSize(int extraPrice) {
        this.extraPrice = extraPrice;
    }

    public int getExtraPrice() {
        return extraPrice;
    }
}
