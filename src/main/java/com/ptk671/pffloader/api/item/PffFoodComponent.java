package com.ptk671.pffloader.api.item;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

import java.util.List;

public class PffFoodComponent {
    private int hunger;
    private boolean hunger_boolean = false;
    private float saturationModifier;
    private boolean saturationModifier_boolean = false;
    private boolean meat = false;
    private boolean alwaysEdible = false;
    private boolean snack = false;
    private List<Pair<StatusEffectInstance, Float>> statusEffects;

    public PffFoodComponent hunger(int hunger) {
        this.hunger = hunger;
        this.hunger_boolean = true;
        return this;
    }

    public PffFoodComponent saturationModifier(float saturationModifier){
        this.saturationModifier = saturationModifier;
        this.saturationModifier_boolean = true;
        return this;
    }

    public PffFoodComponent meat(){
        this.meat = true;
        return this;
    }

    public PffFoodComponent alwaysEdible(){
        this.alwaysEdible = true;
        return this;
    }

    public PffFoodComponent snack(){
        this.snack = true;
        return this;
    }

    public PffFoodComponent statusEffects(List<Pair<StatusEffectInstance, Float>> statusEffects){
        this.statusEffects = statusEffects;
        return this;
    }


    public FoodComponent build() {
        FoodComponent.Builder foodComponent = new FoodComponent.Builder();
        if(hunger_boolean)foodComponent.hunger(hunger); foodComponent.hunger(hunger);
        if(saturationModifier_boolean) foodComponent.saturationModifier(saturationModifier);
        if(snack) foodComponent.snack();
        if(statusEffects != null ) foodComponent.saturationModifier(saturationModifier);
        if(meat) foodComponent.meat();
        if(alwaysEdible) foodComponent.alwaysEdible();
        return foodComponent.build();
    }

    public int getHunger()
    {
        return hunger;
    }

    public boolean getHungerBoolen()
    {
        return hunger_boolean;
    }

    public float getSaturationModifier ()
    {
        return saturationModifier;
    }

    public boolean getSaturationModifier_boolean ()
    {
        return saturationModifier_boolean;
    }

    public boolean getMeat ()
    {
        return meat;
    }

    public boolean getHunger_boolean ()
    {
        return alwaysEdible;
    }

    public boolean getSnack ()
    {
        return snack;
    }
}
