public class Menu extends Player{

    // Metoder:
    //visaHuvudmeny(): visar huvudmenyn och låter spelaren välja en funktion
    //1. Kolla Player points

    Player player;

    public Menu(String name) {
        super(name);
    }

    public int showPoints() {
        return player.getPoints();
    }
}
