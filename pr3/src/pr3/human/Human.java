package pr3.human;

public class Human {
    Hand hand = new Hand();
    Head head = new Head();
    Leg leg = new Leg();

    public String toString() {
        return "\nHUMAN INFO:\n"
                + hand.toString() + "\n"
                + head.toString() + "\n"
                + leg.toString();
    }

    public static void main(String[] args) {
        Human human = new Human();
        // Params
        human.head.setShape("round");
        human.hand.setLength(12);
        human.leg.setLength(9);

        // Actions
        System.out.println("HUMAN ACTIONS:");
        human.head.tilt();
        human.head.turn();
        human.hand.grab();
        human.hand.showGesture("peace");
        human.leg.kick();

        System.out.println(human);
    }
}