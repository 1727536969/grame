package com.suncrate;

public class Role {
    int id; // 角色id
    int blood; // 生命值
    String name; // 角色名称
    Weapon weapon;
    Armour armour;

    public Role(int id, int blood, String name) {
        this.id = id;
        this.blood = blood;
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 攻击方法
    public void attack(){
        System.out.println(this.getName()+"使用"+ weapon.getName() +", 造成"+weapon.getHurt()+"点伤害");
        }
        // 穿戴盔甲
    public void wear(){ // 增加防御,就是增加blood值
     this.blood += armour.getProtect();
     System.out.println("穿上"+armour.getName()+", 生命值增加"+armour.getProtect()+",现在生命值"+this.getBlood());}
}

