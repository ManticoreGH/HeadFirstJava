public class TestExceptions {
    public static void main(String[] args) throws Exception {
        String test = "yes";
        try {
            System.out.println("start try");
            doRisky(test);
        } catch (ScaryException se) {
            System.out.println("Scary exception");
        } finally {
            System.out.println("finally");
        }
    }

    private static void doRisky(String test) throws ScaryException {
       System.out.println("start risky");
       if ("yes".equals(test)) {
           throw new ScaryException();
       }
       System.out.println("end Risky");
    }
}
class ScaryException extends Exception{

}