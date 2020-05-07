package decorator.adventuregame;

public class Starving extends CharacterDecorator {

    public Starving(GameCharacter character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Rumble Tummy";
    }

    @Override
    public double getMight() {
        return character.getMight() - 15;
    }
}
