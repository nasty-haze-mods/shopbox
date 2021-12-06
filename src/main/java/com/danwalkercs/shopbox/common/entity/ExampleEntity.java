package com.danwalkercs.shopbox.common.entity;

import com.danwalkercs.shopbox.core.init.ShopBoxModEntities;
import com.danwalkercs.shopbox.core.init.ShopBoxModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ExampleEntity extends Animal {
    public ExampleEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    // Controls entity AI goal hierarchy
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0,
                new FloatGoal(this));
        this.goalSelector.addGoal(1,
                new TemptGoal(this,
                        1.2D,
                        Ingredient.of(ShopBoxModItems.EXAMPLE_ITEM.get()),
                        false));
    }

    // Provides entity with attributes
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.00)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob parent) {
        return ShopBoxModEntities.EXAMPLE_ENTITY.get().create(level);
    }
}
