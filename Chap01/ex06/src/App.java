public class App {
    public static void main(String[] args) throws Exception {
        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {
            "agnostic",
            "opinionated",
            "voice activated",
            "haptically driven",
            "extensible",
            "reactive",
            "agent based",
            "functional",
            "AI enabled",
            "Strongly typed"
        };
        String[] wordListTwo = {
            "loosely coupled",
            "six sigma",
            "asynchronous",
            "event driven",
            "pub-sub",
            "IoT",
            "cloud native",
            "service oriented",
            "containerized",
            "serverless",
            "microservices",
            "distributed ledger"
        };
        String[] wordListThree = {
            "framework",
            "library",
            "DSL",
            "REST API",
            "repository",
            "pipeline",
            "service mesh",
            "architecture",
            "perspective",
            "design",
            "orientation"
        };
        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);
        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        // print it out
        System.out.println("What we need is a " + phrase);
    }
}
