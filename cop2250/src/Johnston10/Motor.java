package Johnston10;

/**
 * * Brian Johnston
 * 2019405
 * Chapter10
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class Motor {

    //declaring variables
    private int cylinders;
    private int hp;
    private String type;

    //motor constructor
    Motor(int inputtedCyinders, int inputtedHp, String inputtedType) {
        cylinders = inputtedCyinders;
        hp = inputtedHp;
        type = inputtedType;
    }

    //getters
    int getCylinders() {
        return this.cylinders;
    }

    int getHp() {
        return this.hp;
    }

    String getType() {
        return this.type;
    }

    //tostring method to call
    public String toString() {
        String result = "Motor: cylinders=" + cylinders + " hp=" + hp + " type=" + type;
        return result;
    }

}
