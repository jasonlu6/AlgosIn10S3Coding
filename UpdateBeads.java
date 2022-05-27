/* Algos in 10 S3 E1 
Problem A Coding Solution 

Problem A (in verbatim): 

We are given a set of water tribe beads, M and N, each with 32 beads on each ‘bit string’. We are also given the two bit positions j and k. We will need to devise a method to insert one set of beads M into a set of beads N (assuming we can use arithmetic right shifting) such that M starts at bit bead j and ends at bit bead k. Example, if we have a bead that is with colors B-W-W-B-B (B = blue, W = white) then we can assume at least 5 bit beads between j and k. We cannot have bit beads of length 3 for j and length 2 for k, since j <= k and M cannot fully fit between bit bead 3 and 2. Devise a divide and conquer bit-shifting method that runs in linear time.
 */

public class UpdateBeads {
  // Method to update the beads for the water tribe.
  public static int updateBeads(int i, int j, int k) {
     if (i > j || i < 0 || j >= 32) {
         return 0;
     }
     // create the mask for beads.
     // mask of all 1's (episode typo) 
     // left: the left side of the beads to shift before bead j 
     // right: the right side of the beads to shift after bead j 
     int mask = ~0; 
     int left = j < 31 ? (mask << (j+1)): 0; 
     int right = ((1 << i) - 1); 
     // new mask, with all white beads between bead i and j 
     int mask2 = left | right; 
     /* VERY IMPORTANT: clear the beads here. */
     int cleared = k & mask2; 
     int shifted = j << i; // move k beads to correct position
     return cleared | shifted; 
  }

  // main to try the problem
  public static void main(String[] args) { 
     System.out.println("Shifted beads: \n");
     System.out.println(updateBeads(2,6,29));
  }
}
