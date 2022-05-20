public class CoffeeMachine_problem extends CoffeeOrder {

    public String state = "loading";

    public Boolean input(char c){
        if(this.state.equals("loading")){
            if(c == 'c'){
                return (this.useWater() && this.useBeans());
            }else if(c == 'l'){
                return (this.useWater() && this.useBeans() && this.useMilk());
            }else if(c == 'm'){
                return (this.useMilk() && this.useBeans() && this.useChoco());
            }
            else if(c == 'r'){
                this.state = "refill";
                return true;
            }
        }else if(this.state.equals("refill")){
            if(c == 'b'){ //beans
               this.refillBeans(1);
               return true;
            }else if(c == 'w'){ //water
                this.refillWater(1);
                return true;
            }else if(c == 'm'){ //milk
                this.refillMilk(1);
                return true;
            }else if(c == 'c'){ //choco
                this.refillChoco(1);
                return true;
            }
            else if(c == 'v'){
                this.state = "loading";
                return true;
            }
        }
    return false;
    }
}
