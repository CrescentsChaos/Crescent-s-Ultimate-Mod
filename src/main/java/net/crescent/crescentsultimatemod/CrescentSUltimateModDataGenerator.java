package net.crescent.crescentsultimatemod;

import net.crescent.crescentsultimatemod.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class
CrescentSUltimateModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
	var pack = fabricDataGenerator.createPack();
	pack.addProvider(ModModelProvider::new);
	}
}
