public enum CupSize {

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
