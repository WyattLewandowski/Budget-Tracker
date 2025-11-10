public class money {
    private double savings = 0;
    private double budget = 0;
    
    public money(){


    }

    public void addSavings(double a){
        savings = savings + a;

    }
    public void addbudget(double a){
        budget = budget + a;
    }
    public void subtractSavings(double a){
        if((savings - a) <0){
            System.out.println("not enough money");
        }
        else {
            savings = savings - a;
        }
    }
    public void substractBudget(double a){
        if((budget - a) <0){
            System.out.println("not enough money");
        }
        else {
            budget = budget - a;
        }
    }
    public double getBudget(){
        return budget;
    }
    public double getSavings(){
        return savings;
    }

}
