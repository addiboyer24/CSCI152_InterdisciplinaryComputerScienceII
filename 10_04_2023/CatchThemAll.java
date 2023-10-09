public class CatchThemAll{

    public static int getRandomPokemon(int numberOfPokemon){
        int randomPokemon = (int) (Math.random() * numberOfPokemon);
        return randomPokemon;
    }

    public static int catchThemAll(int numberOfPokemon){

        boolean[] isPokemonCaught = new boolean[numberOfPokemon]; // default values.

        int pokemonCaught = 0;
        int pokemonSeen = 0;
        while(pokemonCaught != numberOfPokemon){
            int randomPokemon = getRandomPokemon(numberOfPokemon);
            if (!isPokemonCaught[randomPokemon]){
                isPokemonCaught[randomPokemon] = true;
                pokemonCaught += 1;
            }
            pokemonSeen++;
        }

        return pokemonSeen;
    }
    public static void main(String[] args) {
        /*int n = Integer.parseInt(args[0]);
        int pokemonSeen; // Declaration.
        pokemonSeen = catchThemAll(n); // Assignment.
        StdOut.printf("You saw %d pokemon to catch %d", pokemonSeen, n);*/

        boolean[] myArray = { true, false };

        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " \t");
        }
        swapElements(0, 1, myArray);

        System.out.println();

        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " \t");
        }
    }

    public static void swapElements(int i, int j, boolean[] myArray){
        // Swap operation.
        boolean temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }
}