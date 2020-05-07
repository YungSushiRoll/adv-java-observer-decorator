package decorator.adventuregame;

public class Ring extends CharacterDecorator {

    public Ring(GameCharacter character) {
        super(character);
    }

    @Override
    public double getMight() {
        return character.getMight() + 50;
    }

    @Override
    public String getName() {
        return character.getName() + ", Ruler of Most";
    }
}
