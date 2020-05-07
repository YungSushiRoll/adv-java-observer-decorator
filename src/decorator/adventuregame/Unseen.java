package decorator.adventuregame;

public class Unseen extends CharacterDecorator {

    public Unseen(GameCharacter character) {
        super(character);
    }

    @Override
    public double getMight() {
        return character.getMight() + 0;
    }

    @Override
    public String getName() {
        return character.getName() + ", the Unseen";
    }
}
