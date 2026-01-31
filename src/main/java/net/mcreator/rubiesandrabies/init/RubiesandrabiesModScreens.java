/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rubiesandrabies.client.gui.SpaceMenuScreen;
import net.mcreator.rubiesandrabies.client.gui.SkyfactoryGuiScreen;
import net.mcreator.rubiesandrabies.client.gui.HumanMenuScreen;
import net.mcreator.rubiesandrabies.client.gui.EvilMachineGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesandrabiesModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RubiesandrabiesModMenus.SKYFACTORY_GUI.get(), SkyfactoryGuiScreen::new);
		event.register(RubiesandrabiesModMenus.SPACE_MENU.get(), SpaceMenuScreen::new);
		event.register(RubiesandrabiesModMenus.EVIL_MACHINE_GUI.get(), EvilMachineGUIScreen::new);
		event.register(RubiesandrabiesModMenus.HUMAN_MENU.get(), HumanMenuScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}