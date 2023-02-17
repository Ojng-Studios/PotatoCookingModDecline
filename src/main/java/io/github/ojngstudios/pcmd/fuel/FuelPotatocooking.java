
package io.github.ojngstudios.pcmd.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.ojngstudios.pcmd.ElementsPcmdMod;

@ElementsPcmdMod.ModElement.Tag
public class FuelPotatocooking extends ElementsPcmdMod.ModElement {
	public FuelPotatocooking(ElementsPcmdMod instance) {
		super(instance, 1);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Items.POTATO, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
