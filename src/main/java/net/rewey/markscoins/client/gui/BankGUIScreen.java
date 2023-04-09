
package net.rewey.markscoins.client.gui;

import net.rewey.markscoins.world.inventory.BankGUIMenu;
import net.rewey.markscoins.procedures.BankGUIValueProcedure;
import net.rewey.markscoins.network.BankGUIButtonMessage;
import net.rewey.markscoins.MarkscoinsMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BankGUIScreen extends AbstractContainerScreen<BankGUIMenu> {
	private final static HashMap<String, Object> guistate = BankGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_take;

	public BankGUIScreen(BankGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("markscoins:textures/screens/bank_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("markscoins:textures/screens/cashout.png"));
		this.blit(ms, this.leftPos + 54, this.topPos + 20, 0, 0, 64, 64, 64, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, new TranslatableComponent("gui.markscoins.bank_gui.label_bank"), 5, 5, -16777216);
		this.font.draw(poseStack,

				BankGUIValueProcedure.execute(entity), 5, 17, -16777216);
		this.font.draw(poseStack, new TranslatableComponent("gui.markscoins.bank_gui.label_deposit"), 17, 63, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.markscoins.bank_gui.label_withdraw"), 121, 63, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_take = new Button(this.leftPos + 118, this.topPos + 12, 46, 20, new TranslatableComponent("gui.markscoins.bank_gui.button_take"), e -> {
			if (true) {
				MarkscoinsMod.PACKET_HANDLER.sendToServer(new BankGUIButtonMessage(0, x, y, z));
				BankGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_take", button_take);
		this.addRenderableWidget(button_take);
	}
}
