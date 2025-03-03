public class TelcoAllowance implements UsagePromo{

    @Override
    public String showAllowance(String telcoName, double money) {
        double allowance = getAllowance(telcoName);
        String output = telcoName + " offers a data allowance of " + allowance + " GB for ₱" + money + " per month.";
        return output;
    }

    private double getAllowance(String telcoName) {
        switch (telcoName) {
            case "Smart":
                return 15.0;
            case "Globe":
                return 10.0;
            case "Ditto":
                return 8.0;
            default:
                return 0.0;
        }
    }
}