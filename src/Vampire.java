public class Vampire extends Character {
    Vampire(String name) {
        super(name);
    }

    public void Bloodlast(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Bloodlast (Damage - 40 , Mana Cost - 10)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Bloodwave(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Bloodwave (Damage - 40 , Mana Cost - 20)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Bloodspear(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with .Bloodspear (Damage - 60 , Mana Cost - 30)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void BloodHeal(Character characterName) {
        System.out.println(super.characterName + " Use BloodHeal (Heal - 40)");
        int healPoints = 40;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void Bloodrage(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Bloodrage (Damage - 30 , Mana Cost - 20)");
        int damagePoints = 30;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void Bloodshed(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Bloodshed (Damage - 40 , Mana Cost - 20)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }

}

