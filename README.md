# Mech Origins Minecraft Mod

## Overview

Mech Origins is a Minecraft mod that introduces a unique gameplay mechanic where players can collect and equip different modules or parts, each altering the player's abilities. The mod is designed to provide a modular and expandable system, allowing for easy addition of new items and equipment.

## Initial Setup

- **Spawn Equipment:**
  - Upon spawning, players start with the base core, arms, and legs equipped.
  - These initial parts have no direct effect on the player's abilities.

- **Basic Attributes:**
  - Regardless of the equipped parts, players experience a slightly lower jump height (only just a full block), slightly reduced movement speed, and faster falling speed (increased Y velocity, so you will fall faster as well).
  - The base attributes serve as a foundation for the modifications brought about by different equipment.

## Equipment Acquisition

- **Item Sources:**
  - Items can be found in chests scattered throughout the world. (in Development)
  - Certain mobs have a chance of dropping relevant items. For example, a Blaze may drop the Fire Arms.

- **Equipping Mechanism:**
  - To equip a new item, players right-click (or the "use" button) with the item in their main hand.
  - Equipping an item replaces the currently held item with whatever item that was last equiped.
  - Reverting is possible by re-equipping the base version, ensuring players always have somthing they like, and cant be softlocked by the lower jump height of the wheel legs.

## Development Structure

- **Modularity:**
  - The mod is designed with a modular structure, making it easy to add new items and equipment.
  - This modular approach allows for continual expansion, even after the mod reaches Alpha and Beta stages.

## Implementation Notes

- **Development Stage:**
  - The mod is currently in development, with plans for Alpha and Beta releases.

- **Continued Expansion:**
  - The modular design facilitates the addition of new items, ensuring the mod can evolve with future updates.

With Mech Origins, players can experience a dynamic and customizable gameplay experience, where their choice of equipment significantly influences their abilities in the Minecraft world.

## Current Items

- **Arms**
    - Base Arms
        - These Arms don't do anything, they just fill up the arms slot.
    - Drill Arms
        - These Arms increase your mining speed significantly, but decrease your damage by 25%.
    - Fire Arms
        - These Arms increase your damage by 10%, as well as setting any creature that you hit on fire.
    - Fireball Arms
        - Using your secondary ability key with these arms equipped will make you shoot a fireball.
    - Fling Arms
        - Whenever you hit something with these arms equipped, the target will be flung into the air.
    - Agro Arms
        - Increases melee damage, increases attack speed and increases knockback force.
    - Armoured Arms
        - Increases armour by a small amount as well as granting some armour toughness. While these arms are equipped you attacks will be much slower but will do much more damage.
    - Webbed Arms
        - Increases your swimming speed by a small amount and increases damage while underwater.
    - Farming Arms
        - You can right click while nothing is in your hand on coarse dirt, dirt, grass blocks, path blocks or tilled dirt (farmland) to turn it either into farmland or a path depending on what is toggled by your secondary ability key.
    - Bow Arms
        - Using the secondary ability key with these arms equipped will make you shoot an arrow. This arrow cannot be picked up.
    - Airstrike Arms
        - With these arms equipped, when looking at a target, you can press and hold the use (right click) button down and charge your airstrike. When your release the button, a stalactite will fall from a height depending on how long lou targetted for.

- **Cores**
    - Base Core
        - This Core doesn't do anything, it just fills up the core slot.
    - Mining Core
        - This Core reduces attack damage, and increases mining speed
    - Speed Core
        - Increases your speed significantly, and increases air speed.
    - Laucnh Core
        - Using your primary ability key, you can launch yourself in the direction you are looking, though you still take fall damage.
    - Heavy Core
        - Gives you a small amount of extra armour, as well as armour toughness. Your speed is reduced.
    - Thrust Core
        - Using your primary ability key, you can apply thrust to yourself in the direction you are facing. You also take no fall damage.
    - Wing Core
        - Gives you elytra, without using your chest slot, and gives you the ability to breath fire using your primary ability key.
    - XP Core
        - You gain twice as much xp as you would normally, and every 10 seconds, you have a 10% chance of spawning a experience bottle at your position.
    - Accuracy Core
        - Significantly increases your ranged damage.
    - Haze Core
        - Your Y Velocity is significantly reduced, making you fall much slower, you become 80% transparent which makes you much harder to see, and you become immune to fall damage.
    - Rage Core
        - Using your primary ability will give you Speed, Strength, Haste and Night Vision for one minute with a 2 minute cooldown (so after it has just finished being used it will take 1 minute before you can use it again).

- **Legs**
    - Base Legs
        - These Legs dont do anything, they just fill up the leg Slot.
    - Jump Legs
        - These Legs give you a much bigger jump height, make you immune to fall damage, and if you are moving while you jump you get a directional jump.
    - Wheel Legs
        - These Legs half your jump height, so you cannot jump up anything you wouldn't already be able to step up, they increase your speed significantly, and make all surfaces slightly more slippery.
    - Jetpack Legs
        - While these Legs are equipped you don't have a normal jump, instead, while you hold the jump key, you will give given more upwards velocity, and depending on how you move with the other keys you are given much more air control while holding space. You are also immune to fall damage while holding the jump key.
    - Water Walking Legs
        - You can walk along water while you have these Legs equiped. You will sink while in water unless holding the jump key, and if you want to submerge into water, you have to hold the jump key (will change it to also include shift in future), you also gain water breathing.
    - Lava Walking Legs
        - These Legs work the same as the water walking Legs apart from for lava, and you gain fire resistance instead of water breathing.
    - Armour Legs
        - These Legs give you a small amount of armour as well as armour toughness, the also decress your speed slightly.
    - Athletic Legs
        - These Legs increase your mining speed slightly, increase your life by 2 hearts, increase your speed and increase your jump height to two blocks.
    - Clibing Legs
        - These Legs allow you to climb up any surface as if it was a ladder (this also means you can do ladder clutches on any block, making it relativly easy to negate fall damage).
    - Flipper Legs
        - These Legs makes you move slower on land, but makes you 3 times as fast in water.
    - Acceleration Legs
        - These Legs make you slowly accumulate speed over time, the longer you sprint for, the faster you will get. This increases your movement speed and your attack speed.

## **Structures**

- **Armour Bunker**
    Spawns in plains, sunflower plains and meadow biomes and has a chance to contain the armour arms, heavy core, or armour legs.
    ![armour bunker](https://iili.io/JEQZ0S2.png)
- **Cold Escape**
    Spawns in jagged peaks frozen peaks snowy slopes snowy beach snowy plains and ice spikes. The chests can contain the accuracy core, the bow arms, or the climbing legs.
    ![cold escape](https://iili.io/JEQtCxe.png)
- **Desert Fountains**
    Spawns in deserts, and has a chance to contain the acceleration legs, speed core, or the agro arms.
    ![desert fountains](https://iili.io/JEQQ72V.png)
- **Bunker**
    Spawns in plains, sunflower plains and meadow biomes and has a chance to contain the airstrike arms, thrust core, or the wheel legs.
    ![bunker](https://iili.io/JEQZx8N.png)
- **Nether Furnace's**
    There is a warped furnace, which can spawn in either the warped forest or the nether wastes, and the crimson forest or the nether wastes. They can contain the fire arms, rage core or the lava walking legs.
    ![nether furnace](https://iili.io/JEQDiyN.png)
- **Small Site**
    Spawns in meadow, plains, sunflower_plains, bamboo_jungle, birch_forest, cherry_grove, dark_forest, flower_forest, forest, grove, jagged_peaks, jungle, old_growth_birch_forest, old_growth_pine_taiga, old_growth_spruce_taiga, savanna_leaf, savanna_plateau_leaf, sparse_jungle, taiga, windswept_forest, windswept_hills, windswept_savanna_leaf and wooded_badlands. It has a chance to contain the athletic legs, mining core or the drill arms
    ![small site](https://iili.io/JEQDzhX.png)
- **Ships**
    Spawns in ocean biomes and can contain the webbed arms, the flipper legs and the haze core
    ![ships](https://iili.io/JEQtymP.png)
- **Big Ship**
    Spawns in the same places as the ships and has the same items, but with a much greater chance to do so.
    ![big ship](https://iili.io/JEQZ3wF.png)
- **Space Launchpad**
    Spawns in plains and sunflower plains. it has a chance to contain the launch core, fling arms or jump legs.
    ![space launchpad](https://iili.io/JEQLTUN.png)

## **Altered Mod Drops**
- All other items (wing core, fireball arms, and water walking legs) can be obtained from mob drops. The wing core will always drop from the ender dragon, the fireball arms have a 1 in 20 chance of dropping, and this level is increased with looting, and the water walking legs drop from guardings, 1/50th of the time, this level is not increased with looting.
