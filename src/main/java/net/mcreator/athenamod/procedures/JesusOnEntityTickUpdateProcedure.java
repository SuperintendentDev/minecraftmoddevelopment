package net.mcreator.athenamod.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.athenamod.init.AthenaModModItems;
import net.mcreator.athenamod.init.AthenaModModBlocks;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class JesusOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, entity)).getItem() == AthenaModModBlocks.GOLDEN_WOOL.get().asItem() && (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(1, entity)).getItem() == AthenaModModBlocks.GOLDEN_WOOL.get().asItem() && (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(2, entity)).getItem() == AthenaModModBlocks.GOLDEN_WOOL.get().asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(AthenaModModItems.BIBLE.get());
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(4, entity)).getItem() == AthenaModModBlocks.GOLDEN_WOOL.get().asItem() && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(4) == 64 && (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(5, entity)).getItem() == AthenaModModBlocks.GOLDEN_WOOL.get().asItem() && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(5) == 64 && (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(6, entity)).getItem() == AthenaModModBlocks.GOLDEN_WOOL.get().asItem() && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(6) == 64 && (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(7, entity)).getItem() == AthenaModModBlocks.GOLDEN_WOOL.get().asItem() && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(7) == 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(AthenaModModItems.FALLEN_ANGEL_BLOOD.get());
				_setstack.setCount(1);
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
