public class VoterEligibilityChecker {

    public static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide your age as a command-line argument.");
            return;
        }

        int age = Integer.parseInt(args[0]);

        if (isEligible(age)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
