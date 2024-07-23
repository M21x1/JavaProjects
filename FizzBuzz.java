public class FizzBuzz{
    public static void main(String[] args){

        for(int i = 1; i < 101; i++){
            // This condition should come first.
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            } else{
                System.out.println(i);}
        }
    }
}

// ANOTHER WAY
/*
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            String output = "";

            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }

            // Print the number if it's not Fizz or Buzz
            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }
}*/