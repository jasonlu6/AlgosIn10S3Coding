/* Algos in 10 S3 E1
Problem B Coding Solution

Problem B (in verbatim):

We are now given a set of rocks that Toph can earth-bend with. For each rock i in the set j, Toph can ‘earth-bend’ exactly 1 rock from a ‘top’ rock to a ‘bottom’ rock and vice-versa. Determine the shortest sequence of ‘bottom’ rocks Toph can earth-bend, assuming that we can have a maximum of 32 rocks in a row to bend. For outside of ATLA references, this means that we cannot ‘bend’ any more than one twos complement integer set of bits.

*/

import java.util.*;

public class ShortestBend {

// Method to get the shortest bending sequence for Toph.
   public static int shortestBend(int n) {
     if (n == -1) {
         return -1;
     }
     ArrayList<Integer> sequences = getAlternateBend(n); 
     return findShortestEarthbend(sequences);
   }

   public static ArrayList<Integer> getAlternateBend(int n) {
     // New arraylist of rocks to bend for Toph. 
     ArrayList<Integer> sequences = new ArrayList<Integer>(); 
     int search = 0;
     int count = 0;
     for (int rock = 0; rock < 32; rock++) {
         if ((n & 1) != search) {
             sequences.add(count);
             // 'Bend' the rock to either top or bottom. 
             search = n & 1;
             count = 0;
         }
         // Otherwise, bend other rocks.
         count+=1;
         n >>= 1;
     } 
     sequences.add(count);
     return sequences;
   }
   
   // Method to return the shortest bending rock sequence that Top can build.
   public static int findShortestEarthbend(ArrayList<Integer> seq) {
     // Sentinel value for minimum sequence placeholder.
     int minSeq=1;
     int thisSeq = 0; // current sequence 
     // Loop every alternate rock bended. 
     for (int rock = 0; rock < seq.size(); rock += 2) {
         int zerosSeq = seq.get(rock);
         // Get the previous sequence of rock bended 
         int seqPrev = rock - 1 >= 0 ? seq.get(rock - 1) : 0;
         // Get the next sequence of rock bended 
         int seqNext = rock + 1 < seq.size() ? seq.get(rock + 1) : 0;
         
         // This step is complicated, so step by step: 
         // 1) Set the flip variable for rocks bended by Toph.
         int flipRockBend = 0;
         // a) Merge case.
         if (zerosSeq == 1) {
            thisSeq = seqNext + 1 + seqPrev;
         // 2) Add a rock bended to each side if not yet able to merge.  
         } else if (zerosSeq > 1) {
         // Mathematically return the minimum sequence / shortest rock bending sequence.
            thisSeq = 1 + Math.min(seqPrev, seqNext);
         // 3) Final case, let Toph choose between the minimum sequence of rocks to bend, assuming 
         // there are no other rocks to bend beforehand. 
         } else if (zerosSeq == 0) {
            thisSeq = Math.min(seqPrev, seqNext);
         }
         minSeq = Math.min(thisSeq, minSeq);
       }
   return minSeq;
   }
   
   // Main. 

   public static void main(String[] args) { 
      // Get the shortest sequence for 16 rocks to bend.
      System.out.println("Shortest Sequence of rocks for Toph to bend: \n");
      System.out.println(shortestBend(16));
      // Largest possible sequence of rocks for Toph to bend, she'll be tired :-(  
      System.out.println(shortestBend(32)); 
   }
}

