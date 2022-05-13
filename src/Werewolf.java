public class Werewolf extends Character {
    Werewolf(String name) {
        super(name);
    }

    public void Hasclaw(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Hasclaw (Damage - 50 , Mana Cost - 20)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Bite(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Bite (Damage - 60 , Mana Cost - 20)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void MoonHeal(Character characterName) {
        System.out.println("Both use Heal");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(super.characterName + " Use MoonHeal (Heal - 60)");
        int healPoints = 60;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void Agility(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Agility (Damage - 40 , Mana Cost - 10)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);
    }
}

