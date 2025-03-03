public class Telco  implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private Integer dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice, Integer dataAllowance, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usagePromo, double price){
        this.promoPrice = price;
        return usagePromo.showAllowance(telcoName, promoPrice);
    }
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    @Override
    public Integer getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void setDataAllowance(Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
}