//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheering = (args [0]);
        int x = Integer.parseInt(args [1]);
        String m = "EFHILMNORSX";
        int i = 0;
        while (i < cheering.length()){
                char c = cheering.charAt(i);
                if (m.indexOf(c) != -1){
                        System.out.println("Give me an " + c + ": " + c + "!");
                }
                else {
                        System.out.println("Give me a  " + c + ": " + c + "!");
                }
                i++;

         }
         System.out.println("What does that spell?");
        
        while (x > 0) {
                System.out.println(cheering + "!");
                x--;
                        
                }
        }
        }

