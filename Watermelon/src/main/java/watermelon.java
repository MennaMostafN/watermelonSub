public class watermelon {
    private int weight;
    public watermelon() {
this.weight=weight;
    }

    public boolean Calc(int weight){
        if (weight<1 || weight>100){
            return false;
        }
        if (weight%2 ==0){
            return true;
        }
        else {
            return false;
        }
    }

    public int getWeight() {
        return weight;
    }
}
