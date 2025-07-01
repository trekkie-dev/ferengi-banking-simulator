public class FCACompliance {
    public static void issueWarning(String violation) {
        System.out.println(Colors.RED_BACKGROUND + "    ⚠ FCA WARNING: POTENTIAL VIOLATION DETECTED ⚠    " + Colors.RESET);
        System.out.println("Reason: " + violation);
        System.out.println("A report has been forwarded to the Ferengi Commerce Authority.");
    }
}
