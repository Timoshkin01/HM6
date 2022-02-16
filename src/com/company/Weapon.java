package com.company;

public class Weapon {
    private String typeOfWeapon;
    private String nameOfWepon;

    public Weapon(String typeOfWeapon, String nameOfWepon){
        this.typeOfWeapon = typeOfWeapon;
        this.nameOfWepon = nameOfWepon;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNameOfWepon() {
        return nameOfWepon;
    }

    public void setNameOfWepon(String nameOfWepon) {
        this.nameOfWepon = nameOfWepon;
    }


}
