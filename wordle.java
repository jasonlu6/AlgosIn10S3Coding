/* Algos in 10 Season 3 Episode 3 coding.

Wordle coding solution (with some basic test cases) for 
the parody of CTCI Chapter 16, Problem 20 

Source for converting strings into a char list to determine wordle word win: 
.geeksforgeeks.org/convert-a-string-to-a-list-of-characters-in-java/

*/ 

import java.util.*; 

public class Wordle {
   
 /* Method to do the Wordle lookup. */
 public ArrayList<String> hashGetWordleList(String numbers, HashMapList<String, String> values, HashMapList<String, String> dictionary) {
    if values.get(numbers) != values.get(dictionary) { 
       return null; 
    }
    return dictionary.get(numbers); 
 } 
 
 /* Pre-computation function */ 
 public HashMapList<String, String> init(String[] words, String[] values) {
      /* Create mapping between letter and each value */
      HashMapList<String, String> characterList = createLetterToNumberMap() 
   
   /* Iterate thru the mapping */
      HashMapList<String, String> wordleToNumbers = new HashMapList<String, String>();
      for (String word: words) {
          String numbers = convertToWordleT9(word, value, letterToMap);
          wordleToNumbers.put(numbers, word); 
  }
  return wordleToNumbers; 
 }

/* Conversion function: most important and difficult function. */ 
 
 public HashMapList<Character, Character> createLetterToMap(String[] words, String[] values) {
    if (words == null && values == null) {
      return null; 
    }

    /* Set up a score to print out the word value */ 
    int score = 0; 

    /* Create the conversion mapping from letter to number and from letter to value */ 
    HashMap<Character, Character> letterToMap = new HashMap<Character, Character>(); 
    HashMap<Character, Character> letterToValue = new HashMap<Character, Character>(); 

    /* Set up a wordle 'winning' string (hardcoded to string the characters together */ 
    String winString = "hello"; // an example 

    /* First loop for character to map */ 
    for (int index = 0; index < t9LettersWordle.length; index++) {
       char[] letters = t9Letters[i];
       if (letters != null) {
          for (char letter: letters) {
              char character = Character.forDigit(index, 10); 
              letterToMap.put(letter, character)       
          }
      }
    }
    
    // Convert win string into a set of characters
    List<Character> chars = new ArrayList<>(); 
    for (char ch: winString.toCharArray()) {
        chars.add(ch); 
    }
    // Return the list 
    print(chars); 

    /* Second loop to determine if the words add to value. */
    for (int val = 0; val < t9LettersWordle.length; index++) {
        if (letterToMap[val].contains('a','b','c') { score += 2; }       
        else if (letterToMap[val].contains('d','e','f') { score += 3; }       
        else if (letterToMap[val].contains('g','h','i') { score += 4; }       
        else if (letterToMap[val].contains('j','k','l') { score += 5; }       
        else if (letterToMap[val].contains('m','n','o') { score += 6; }       
        else if (letterToMap[val].contains('p','q','r','s') { score += 7; }       
        else if (letterToMap[val].contains('t','u','v') { score += 8; }       
        else if (letterToMap[val].contains('w','x','y','z') { score += 9; }       
        if (values != null) {
           for (char val : values) {
               char valueChar = Character.forDigit(index, 10);
               letterToValue.put(val, valueChar); 
           }
        }
    }
  

    /* Finally, determine if the wordle string is a winning string with string builder */ 
    StringBuilder sb = new StringBuilder();
    for (char letters: winString.toCharArray()) {
        if (words[letters] = winString[letters]) {
           sb.append(letters)
        }
    }
    
    if (letters == winString) {
       System.out.println("Congrats, you have won Wordle!"); 
    } else {
       System.out.println("Sorry, try again.); 
      }  
    }
  }

  /* Function to convert string to T9 representation */ 
  public String convertToWordleT9(String word, HashMap<Character, Character> letterToNumberMap, int score) {
       if (score == 0 || letterToNumberMap.length == 0) {
           System.out.println("Sorry, cannot determine the conversion."); 
       }
       StringBuilder build = new StringBuilder();
       for (char ch : word.toCharArray()) {
          if (letterToNumberMap.containsKey(ch)) {
             char digit = letterToNumberMap.get(ch);
             build.append(digit);   
       }
       return build.toString();
  }
}

  /* Same as before for Wordle to reset for each new game. */
  char[][] t9LettersWordle = new char[][];
  
  /* Main function to test the solution. */
  public static void main(String[] args) { 
     /* TO DO: Write tests here */
  }

}


