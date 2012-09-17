/*
 * This file is part of SpoutcraftAPI.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * SpoutcraftAPI is licensed under the GNU Lesser General Public License.
 *
 * SpoutcraftAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutcraftAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spoutcraft.spoutcraftapi.material.item;

import java.io.IOException;

import org.spoutcraft.spoutcraftapi.Spoutcraft;
import org.spoutcraft.spoutcraftapi.addon.Addon;
import org.spoutcraft.spoutcraftapi.block.Block;
import org.spoutcraft.spoutcraftapi.block.BlockFace;
import org.spoutcraft.spoutcraftapi.entity.Player;
import org.spoutcraft.spoutcraftapi.io.SpoutInputStream;
import org.spoutcraft.spoutcraftapi.io.SpoutOutputStream;
import org.spoutcraft.spoutcraftapi.material.CustomItem;
import org.spoutcraft.spoutcraftapi.material.MaterialData;
import org.spoutcraft.spoutcraftapi.util.UniqueItemStringMap;

public class GenericCustomItem implements CustomItem {
	private String name;
	private String fullName;
	private Addon addon;
	private int customId;
	public String texture;
	public boolean isStackable;
	
	/**
	 * Creates a GenericCustomItem with no values, used for serialization purposes only.
	 */
	public GenericCustomItem() {
	}

	public GenericCustomItem(Addon addon, String name, int customId) {
		this.name = name;
		this.fullName = addon.getDescription().getName() + name;
		this.customId = customId;
		this.addon = addon;
		this.setName(name);
		MaterialData.addCustomItem(this);
	}

	public GenericCustomItem(Addon addon, String name) {
		this(addon, name, UniqueItemStringMap.getId(addon.getDescription().getName() + name));
	}

	public GenericCustomItem(Addon addon, String name, String texture) {
		this(addon, name);
		this.setTexture(texture);
	}

	public int getRawId() {
		return 318; //flint
	}

	public int getRawData() {
		return customId;
	}

	public boolean hasSubtypes() {
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.fullName = addon.getDescription().getName() + name;
	}

	public int getCustomId() {
		return customId;
	}

	public String getFullName() {
		return fullName;
	}

	public String getNotchianName() {
		return getName();
	}

	public Addon getAddon() {
		return addon;
	}

	public CustomItem setTexture(String texture) {
		this.texture = texture;
		return this;
	}

	public String getTexture() {
		return texture;
	}

	public boolean isStackable() {
		return isStackable;
	}
	
	public boolean onItemInteract(Player player, Block block, BlockFace face) {
		return true;
	}

	public void readData(SpoutInputStream input) throws IOException {
		customId = input.readInt();
		name = input.readString();
		addon = Spoutcraft.getAddonManager().getOrCreateAddon(input.readString());
		texture = input.readString();
		isStackable = input.readBoolean();
		setName(name);
		MaterialData.addCustomItem(this);
	}

	public void writeData(SpoutOutputStream output) throws IOException {
		output.write(customId);
		output.writeString(getName());
		output.writeString(getAddon().getDescription().getName());
		output.writeString(getTexture());
		output.writeBoolean(isStackable());
	}

	public int getVersion() {
		return 1;
	}
}
