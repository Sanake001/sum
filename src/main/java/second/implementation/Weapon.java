package second.implementation;

public class Weapon {

    private String kind;
    private String durability;
    private String name;

    public String getKind() {
        return kind;
    }

    private void setKind(String kind) {
        this.kind = kind;
    }

    public String getDurability() {
        return durability;
    }

    private void setDurability(String durability) {
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public static WeaponBuilder getBuilder(){
        return new WeaponBuilder();
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "kind='" + kind + '\'' +
                ", durability='" + durability + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class WeaponBuilder{

        private String kind;
        private String durability;
        private String name;
        private Weapon weapon;

        public WeaponBuilder kind(String kind){
            this.kind = kind;
            return this;
        }

        public WeaponBuilder durability(String durability){
            this.durability = durability;
            return this;
        }

        public WeaponBuilder name(String name){
            this.name = name;
            return this;
        }

        public Weapon build(){
            this.weapon = new Weapon();
            weapon.setDurability(this.durability);
            weapon.setKind(this.kind);
            weapon.setName(this.name);
            return weapon;
        }

    }

}
