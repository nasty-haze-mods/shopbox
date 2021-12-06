package com.danwalkercs.shopbox.core.init;

import com.danwalkercs.shopbox.ShopBox;
import com.danwalkercs.shopbox.common.entity.ExampleEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ShopBoxModEntities {

    private ShopBoxModEntities() {}

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, ShopBox.MOD_ID);

    public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE_ENTITY =
            ENTITIES.register("example_entity",
                    () -> EntityType.Builder.of(ExampleEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(ShopBox.MOD_ID, "example_entity")
                                    .toString()));
}
