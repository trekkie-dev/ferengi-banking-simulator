public class LatinumUtils {
    public static int parseLatinumDenominations(String input) {
        input = input.trim().toUpperCase();

        if (input.matches("\\d+\\.\\d+\\.\\d+")) {
            String[] parts = input.split("\\.");
            int bars = Integer.parseInt(parts[0]);
            int strips = Integer.parseInt(parts[1]);
            int slips = Integer.parseInt(parts[2]);
            return Latinum.toSlips(bars, strips, slips);
        } else if (input.endsWith("B")) {
            return Integer.parseInt(input.replace("B", "")) * 1000;
        } else if (input.endsWith("S")) {
            return Integer.parseInt(input.replace("S", "")) * 100;
        } else if (input.endsWith("SL")) {
            return Integer.parseInt(input.replace("SL", ""));
        } else {
            System.out.println("No denomination detected. Defaulting to SLIPS");
            return Integer.parseInt(input);
        }
    }
}
