class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    @Override
    public String toString(){
        return ("Fighter is a Warrior");
    }
    @Override
    boolean isVulnerable(){
        return false;
    }
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return 10;
        }
        else{
            return 6;
        }
        
    }

    
}
// TODO: define the Wizard class
class Wizard extends Fighter {
    private boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    
    public void prepareSpell() {
        this.spellPrepared = true;
    }
    
    @Override
    public boolean isVulnerable() {
        if (spellPrepared) {
            return false;
        } else {
            return true;
        }
    } 
    @Override
    public int getDamagePoints(Fighter fighter) {
        if (this.spellPrepared) {
            return 12;
        } 
        else {
                return 3;
        }
    }
    
}