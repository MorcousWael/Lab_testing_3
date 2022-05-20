public class ATM_Machine_problem extends ATMorder {

    public String state = "signedout";

    public Boolean input(char c){
        if(this.state.equals("signedout")){
            if(c == 'l'){
                this.state = "signedin";
                return true;
            }else if(c == 'u'){
                this.state = "unlocked";
                return true;
            }
        }else if(this.state.equals("signedin")){
            if(c == 'w'){
                return this.withdraw();
            }else if(c == 'd') {
                this.fill(1);
                return true;
            }else if(c == 'o') {
                this.state = "signedout";
                return true;
            }
        }else if(this.state.equals("unlocked")){
            if(c == 'f'){
                this.fill(1);
                return true;
            }else if(c == 'l') {
                this.state = "signedout";
                return true;
            }
        }
        return false;
    }
}
