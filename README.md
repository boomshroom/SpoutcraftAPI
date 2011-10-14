SpoutcraftAPI
=====

Copyright &copy; 2011, SpoutDev <dev@getspout.org>  
Spout is licensed under [GNU LESSER GENERAL PUBLIC LICENSE Version 3][License]

What is SpoutcraftAPI?
-----
SpoutcraftAPI aims to add a Bukkit-like system to the client. 
It extends Spout/Spoutcraft's goal of removing the barrier 
between server and client. 

A Long Rambling of how SpoutcraftAPI will work by alta189
-----

Before you read this, understand that I wrote this on my phone
and may have made grammatical and spelling mistakes. I also 
will not be very structured, and hence the Section title "Ramble."

Our idea for SpoutcraftAPI is to create a Bukkit like system for 
the client. Someone asked me why would couldn't just port Bukkit 
to the client. Well the big issue is that Bukkit is a server 
system, it will take more time to do what would be needed to do that 
than it would to create a new system that is extremely similar to 
Bukkit. To prevent confusion between Plugins(Bukkit) and Mods(something
that you put into your minecraft.jar file, ex. BuildCraft) we decided
to call ours Addons. The structure of an Addon will be 90% to the 
structure of a plugin. Instead of having a plugin.yml there will be an
addon.yml which will be extremely similar. Your main class will extend 
JavaAddon like with a plugin you extend JavaPlugin. 

Why are we copying Bukkit for the client API?

This is simple. As a team we discussed how Bukkit had created a very 
good and easy to use API structure. As Afforess stated, there is no
reason to reinvent the wheel. We also do not want developers to have
to learn an entire new API system. While a lot of things will be 
different overall it will be the same system.

What will the Addons have access to?

At the first release of SpoutcraftAPI, access will be limited. Why?
Well you will not be able to directly access any classes in net.minecraft.
Instead we will create wrappers and API needed for you what you need to accomplish what you want to do. If the API 
that you need does not currently exist, either create it yourself and 
submit a pull request, or create a detailed Feature Request with exactly
what you need and we will try to add it when we can. 

What about the existing client mods?

We know that all developers will not switch to our system, either 
out of disdain for our project, or because of sheer laziness. Many people
have made comments that we don't care out other client mods, but what they
do not understand is that we really do. That is why we are creating this 
client API. It will create a way that will prevent most if not all 
incompatibilities. Modloader was meant to remove most, but its time for
one that allows easy "modding" to the client and a way to easily use that
mod on a multiplayer server. Many servers had to choose between the benefits
of a CraftBukkit server and new blocks/items/mobs for modded vanilla server as
Modloader MP was incompatible with craftbukkit. The feedback that we have 
received from some client modders has been very disappointing. They believe 
since we do not support Modloader and believe that its usefulness is starting 
to fade, that we do not care about them and are arrogant. This is incorrect.
As I stated above , we do care about other client mods. I believe that they
have this opinion because they are nervous about change. Again I want to
state that we do not hate client mods or modloader, we just believe that
it is time for a new system and are working to give the community an
easy to use system.

I hope that I have given you a little better glimpse into the project,
and that you are starting to understand how it will work, I plan to add
more to this description as we move through the early stages of development
and as we decide on different things or changes to SpoutcraftAPI.

[License]: http://www.gnu.org/licenses/lgpl.html