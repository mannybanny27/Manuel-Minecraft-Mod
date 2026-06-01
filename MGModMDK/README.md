# MG Mod — NeoForge 1.21.1

## Setup

**Requirements:** Java 21, NeoForge MDK for 1.21.1

1. Download the [NeoForge MDK](https://neoforged.net/) for 1.21.1
2. Copy the contents of this folder into your MDK root
3. Run `./gradlew build` — the compiled `.jar` appears in `build/libs/`
4. Drop the `.jar` into your `.minecraft/mods/` folder alongside NeoForge 1.21.1

---

## What Everything Does

### 🪨 Opal Ore
Generates underground between Y=0 and Y=63 (same zone as iron ore), in veins of up to 9.
Drops **1 Opal Gem** when mined (Fortune enchant increases yield). Silk touch drops the ore block.
Also generates as **Deepslate Opal Ore** below Y=0.

### 💎 Opal Gem
The core resource dropped by Opal Ore. Used to craft all opal tools and the Opal Block.
Can also be crafted from an Opal Block (9 gems back).

### 🗡️ Opal Sword
- Damage: Iron level (7 attack)
- Durability: Diamond level (1561 uses)
- Recipe: 2 Opal Gems + 1 Stick (vertical, same as vanilla sword)

### ⛏️ Opal Pickaxe
- Mining speed: Iron level
- Durability: Diamond level (1561 uses)
- Can mine iron-tier blocks (gold, iron, etc.)
- Recipe: 3 Opal Gems + 2 Sticks (standard pickaxe pattern)

### 🪓 Opal Axe
- Damage: Iron axe level
- Durability: Diamond level (1561 uses)
- Recipe: 3 Opal Gems + 2 Sticks (standard axe pattern)

### 🥄 Opal Shovel
- Mining speed: Iron level
- Durability: Diamond level (1561 uses)
- Recipe: 1 Opal Gem + 2 Sticks (vertical)

### 🌾 Opal Hoe
- Mining speed: Iron level
- Durability: Diamond level (1561 uses)
- Recipe: 2 Opal Gems + 2 Sticks (standard hoe pattern)

### 🌸 Red Spider Lily
A decorative flower that can be placed on grass/dirt. No gameplay effect — purely aesthetic. 
Can be placed in a flower pot. *(Note: causes a tiny poison effect on contact — flavor only)*

### 🪴 MG Flower Pot
A decorative clay pot with the initials "MG" engraved on it. Purely decorative.
- Recipe: Flower Pot + White Dye + Clay Ball (shapeless)

### 🛋️ White Wool Couch
A placeable couch block you can **right-click to sit on**. Faces the direction you place it.
Has a tall backrest and low seat hitbox.
- Recipe: 3 White Wool (top row) + 3 Oak Planks (bottom row)

### 🍫 Brownie
A food item. Restores **2 hunger units (1 full shank icon)** with moderate saturation.
Crafts 4 at a time.
- Recipe (3×3):
  ```
  C S C
  W E W
  C S C
  ```
  C = Cocoa Beans, S = Sugar, W = Wheat, E = Egg

---

## CS Topics Used (NeoForge 1.21.1)

1. **Hash Maps** — NeoForge's `DeferredRegister` uses hash maps internally to map `ResourceLocation` keys to registered objects
2. **Linked Lists / Deferred Queues** — Registration events are queued and processed in order during mod loading using event bus patterns
3. **Recursion** — Minecraft's world generation feature placement uses recursive noise-based terrain sampling to determine valid ore placement
4. **Binary Trees / JSON Parsing** — Loot table and recipe JSON files are parsed into tree structures at load time to evaluate drop conditions

---

## File Structure
```
mgmod/
├── build.gradle
├── settings.gradle
├── gradle.properties
└── src/main/
    ├── java/com/mgmod/mgmod/
    │   ├── MGMod.java                  (main mod class)
    │   ├── block/
    │   │   ├── CouchBlock.java         (sitting logic)
    │   │   └── SeatEntity.java         (invisible ride entity)
    │   └── init/
    │       ├── ModBlocks.java
    │       ├── ModItems.java
    │       ├── ModToolTiers.java        (opal tier stats)
    │       ├── ModEntityTypes.java
    │       ├── ModCreativeTabs.java
    │       └── ModFeatures.java
    └── resources/
        ├── META-INF/neoforge.mods.toml
        ├── assets/mgmod/
        │   ├── blockstates/            (6 files)
        │   ├── lang/en_us.json
        │   ├── models/block/           (6 models)
        │   ├── models/item/            (13 models)
        │   └── textures/
        │       ├── block/              (8 PNG textures)
        │       └── item/               (8 PNG textures)
        └── data/mgmod/
            ├── loot_tables/blocks/     (5 files)
            ├── recipes/                (9 files)
            └── worldgen/               (ore generation)
```
