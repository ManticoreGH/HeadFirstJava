public class SimpleStartupTestDrive {
    public static void main(String[] args) throws Exception {
        SimpleStartup dot = new SimpleStartup();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        int userGuess = 2;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
   
}
