public class SonOfBoo extends Boo
{
   public SonOfBoo(){
       super("boo");
   }

   public SonOfBoo(int i){
       super("Fred");
   }

    public SonOfBoo(String s){
         super( 42);
    }

    // Won't compile because Boo has no constructor that takes a String and an int in that order
    //    public SonOfBoo(int i, String s){
    //
    //    }

    // Won't compile because Boo has no constructor that takes two Strings
    //   public SonOfBoo(String a, String b, String c){
    //      super(a, b);
    //   }

    public SonOfBoo(int i, int j){
        super("man", j);
    }

    // Won't compile because Boo has no constructor that takes an int and a String
    //   public SonOfBoo(int i, int x, int y){
    //      super(i, "star");
    //   }
}

