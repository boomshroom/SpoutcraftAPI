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
package org.spoutcraft.spoutcraftapi.addon;

public class AddonSecureThread extends Thread {
	public AddonSecureThread() {
	}

	public AddonSecureThread(Runnable target) {
		super(target);
	}

	public AddonSecureThread(Runnable target, String name) {
		super(target, name);
	}

	public AddonSecureThread(String name) {
		super(name);
	}

	public AddonSecureThread(ThreadGroup group, Runnable target) {
		super(group, target);
	}

	public AddonSecureThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
	}

	public AddonSecureThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
	}

	public AddonSecureThread(ThreadGroup group, String name) {
		super(group, name);
	}
}
