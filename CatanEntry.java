/* Catan Simulation using Java OOP Entries with Files and Directories structure. 

Algos in 10 Season 3 Episode 6 

Author: Jason Lu (jasonlu968@gmail.com) 

*/

public abstract class CatanEntry {
  
   /* resources
   Six main colors of pieces (assuming red, orange, brown, white, blue, green for normal)
4 main types of resources (sheep, wheat, ore, brick)
19 unique hexagonal terrain tiles (usually related to the resources)
To simplify this for Algos in 10 S3, we are not consider any hexagonal duplicate terrain tiles
6 coastal (i.e. sea or ocean bearing) frame pieces
9 extra harbor pieces
20 wooden settlements
16 wooden cities
60 wooden roads
95 resource cards
To simplify this, we can assume a Java public enum type for each main type of resource card in Catan
25 development cards
4 building costs cards
2 special bonus cards
18 number tokens
2 six-sided dice
For this episode, assume a enum dice with a set of {1,2,3,4,5,6} for a pair of dice
1 wooden robber pawn (you’ll see why this piece is ‘hated’ once we actually simulate the game in the algorithms part).
    */
   protected Directory catan; 
   protected String[] colors = new String["red","orange","brown","white","blue","green"];
   protected String[] resources = new String["sheep","wheat","ore","brick"];
   protected int tiles = 19;
   protected int harbor_pieces = 9;
   protected int coastal = 6;
   protected int[] settlements = new int[20]; 
   protected int[] wooden_cities = new int[16];
   protected int[] wooden_roads = new int[60]; 
   protected String[] resource_cards = new String[95];
   protected String[] development_cards = new String[25];
   protected String[] building_cost_cards = new String[4];
   protected String[] special_bonus_cards = new String[2];
   protected int[] tokens = new int[18];
   protected enum dice1 = {1,2,3,4,5,6};
   protected enum dice2 = {1,2,3,4,5,6};
   /* I HATE THIS GUY */
   protected Robber robber;
   
   /* Constructor */
   public CatanEntry(...) { ... } 

   /* Getters and Setters */
   public String[] getColors() { ... } 
   /* ... get resource of getters and setters */
}
