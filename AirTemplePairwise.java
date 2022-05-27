/* Algos in 10 S3 E1
Problem D Coding Solution

Problem D (in verbatim):
Aang remembers the final problem to solve almost as a pairwise-swap problem between an Airbender and his beloved Bison (shout out to Appa!). The problem is as follows: Given a particular Air Temple A, we want to be able to pair with the fewest amount of ‘swaps’ or instructions between i Airbender Nomads and j Air Bisons given that each of the positions between the Airbender Nomad i and Air Bison j alternate between odd and even indices. In other words, we will need to implement a bit-shifting mask algorithm to mask all odd bits and then mask all even bits depending on whether the bison first chooses the Air Nomad, or the Air Nomad chooses the bison.
*/ 

public class AirTemplePairwise {
   
    // Method to determine the fewest amount of 'swaps' or instructions between Airbender Nomad i 
    // and Air Bison j  
    public static int determineFewestSwaps(int x, int i, int j) {
        if (j < i) { 
           System.out.println("Cannot match bison before air nomad chooses.");
        }
        int avatarChoosesFirst = x & 0xaaaaaaa; 
        int bisonChoosesFirst = x & 0x5555555;
        // Now, we make the selection.
        // Alternate way to find the fewest instructions without "||"
        return Math.min(avatarChoosesFirst >> 1,bisonChoosesFirst << 1);
    }

    // Main. 
    public static void main(String[] args) {
       System.out.println("Avatar chooses bison from maximum 2 swaps");
       System.out.println(determineFewestSwaps(2,1,1));
       System.out.println("Avatar chooses bison from maximum 7 swaps");
       System.out.println(determineFewestSwaps(7,2,1));
       System.out.println("Avatar cannot choose bison due to illegal i,j position in swaps");
       System.out.println(determineFewestSwaps(15,1,2));
    }   


}
