public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart",500,15,  false);
        TelcoSubscription globe = new Telco("Globe",450,10,  true);
        TelcoSubscription ditto = new Telco("Ditto",400,8,  true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}