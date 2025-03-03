public class UnliCallTextPackage implements UnliCallsTextOffer{

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        String offer = getUnliCallTextOffer(telcoName);

        String packageType = unliCallText ? "Unlimited" : "No unlimited";
        return packageType + " calls and text package for " + telcoName + ". " + offer;
    }

    private String getUnliCallTextOffer(String telcoName) {
        switch (telcoName) {
            case "Smart":
                return "However, they do not offer any free calls or texts, and you will be charged per use.";
            case "Globe":
                return "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
            case "Ditto":
                return "This plan includes unlimited calls and texts to all networks within the country.";
            default:
                return "Unknown";
        }
    }
}
