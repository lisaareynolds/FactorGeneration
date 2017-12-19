public class FactorGenerator {
    private int numberToFactor;

    /**
     * Creates a new FactorGenerator object
     * @param numberToFactor the number to be factored
     */
    public FactorGenerator(int numberToFactor) {
        this.numberToFactor = numberToFactor;
    }

    /**
     * checks whether there exist any factors of the number
     * @return returns true or false
     */
    public boolean hasMoreFactors(){
        boolean hasFactors = false;
        for(int i = 2; i <= this.numberToFactor; i++){
            if(this.numberToFactor % i == 0){
                hasFactors = true;
            }
        }
        return hasFactors;
    }
    
    /**
     * Finds the value of the smallest factor, then divides the original number by that factor
     * @return the smallest factor
     */
    public int nextFactor(){
        int factor = 0;
        for(int i = 2; i <= this.numberToFactor; i++){
            if(this.numberToFactor % i == 0){
                this.numberToFactor = this.numberToFactor / i;
                factor = i;
                break;
            }
        }
        return factor;
    }
    
    //Create one methood that returns a string
    // in that method, create a local variable that accumulates the factors
    // use one for loop to add all factors to the list
    // return the string
    
    // something like
    // for (int i = 1; i <= numberToFactor; i++) {
    // String factors = "";
    //  if(numberToFactor % i == 0) {
    //       factors += i;
    //       if (numberToFactor != i) {
    //               factors += ", ";
    //        }
    //    }
    // }
    // return factors;
    // }
}
