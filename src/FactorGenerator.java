public class FactorGenerator {
    private int numberToFactor;

    public FactorGenerator(int numberToFactor) {
        this.numberToFactor = numberToFactor;
    }

    public boolean hasMoreFactors(){
        boolean hasFactors = false;
        for(int i = 2; i <= this.numberToFactor; i++){
            if(this.numberToFactor % i == 0){
                hasFactors = true;
            }
        }
        return hasFactors;
    }

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
}
