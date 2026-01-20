public enum CupSize { //used enum to store cupsizes so that invalid sizes are not used
//enum : special class which has a fixed set of constant named values
// it prevents mistake while choosing cup sizes
    SMALL(0),
    MEDIUM(50),
    LARGE(100);

    private int extraPrice;

    CupSize(int extraPrice) {
        this.extraPrice = extraPrice;
    }
    //used getter to access extra price associated with each cup size
    public int getExtraPrice() {
        return extraPrice;
    }
}
