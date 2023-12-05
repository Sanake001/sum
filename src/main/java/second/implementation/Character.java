package second.implementation;

import first.implementration.User;

public class Character {

    private String name;
    private Integer force;
    private String strength;
    private String type;
    private String hair;
    private Integer magic;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Integer getForce() {
        return force;
    }

    private void setForce(Integer force) {
        this.force = force;
    }

    public String getStrength() {
        return strength;
    }

    private void setStrength(String strength) {
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public String getHair() {
        return hair;
    }

    private void setHair(String hair) {
        this.hair = hair;
    }

    public Integer getMagic() {
        return magic;
    }

    private void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    private void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public static CharacterBuilder getBuilder(){
        return new CharacterBuilder();
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", force=" + force +
                ", strength='" + strength + '\'' +
                ", type='" + type + '\'' +
                ", hair='" + hair + '\'' +
                ", magic=" + magic +
                ", weapon=" + weapon +
                '}';
    }

    public static class CharacterBuilder {
        private String name;
        private Integer force;
        private String strength;
        private String type;
        private String hair;
        private Integer magic;
        private Weapon weapon;

        private Character character;

        public CharacterBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder force(Integer force) {
            this.force = force;
            return this;
        }

        public CharacterBuilder strength(String strength) {
            this.strength = strength;
            return this;
        }

        public CharacterBuilder type(String type) {
            this.type = type;
            return this;
        }

        public CharacterBuilder hair(String hair) {
            this.hair = hair;
            return this;
        }

        public CharacterBuilder magic(Integer magic) {
            this.magic = magic;
            return this;
        }

        public CharacterBuilder weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Character build() {
            this.character = new Character();
            character.setName(this.name);
            character.setForce(this.force);
            character.setHair(this.hair);
            character.setMagic(this.magic);
            character.setStrength(this.strength);
            character.setType(this.type);
            character.setWeapon(this.weapon);
            return character;
        }

    }

}
