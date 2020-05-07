package decorator.adventuregame;

public class Shield extends CharacterDecorator {

    public Shield(GameCharacter character) {
        super(character);
    }

    @Override
    public double getMight() {
        return character.getMight() + 25;
    }

    @Override
    public String getName() {
        return character.getName() + ", Protect from Wraiths";
    }
}
