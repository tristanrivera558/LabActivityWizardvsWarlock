public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Vampire and Werewolf");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Vampire Kirito = new Vampire("Kirito");
        Werewolf Asuna = new Werewolf("Asuna");
        Kirito.Bloodlast(Asuna);
        Kirito.Bloodwave(Asuna);
        Asuna.Hasclaw(Kirito);
        Kirito.Bloodspear(Asuna);
        Asuna.Bite(Kirito);
        Asuna.MoonHeal(Asuna);
        Kirito.BloodHeal(Kirito);
        Kirito.Bloodrage(Asuna);
        Asuna.Agility(Kirito);
        Kirito.Bloodshed(Asuna);

    }
}

