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
                return "And they do not offer any free calls or text.";
            case "Globe":
                return "This plan comes with unlimited calls and texts to subscribers within their network.";
            case "Ditto":
                return "This plan has unlimited calls and texts to all networks.";
            default:
                return "Unknown";
        }
    }
}