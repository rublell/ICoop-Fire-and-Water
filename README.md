# ICoop — Fire & Water

A local 2-player cooperative adventure game written in Java. Two elemental characters, **Fire** and **Water**, explore several maps, solve elemental puzzles, collect items and team up to defeat a final boss.

## Gameplay

- Two players on the same keyboard, acting simultaneously with complementary elemental abilities
- Elemental walls, obstacles and damage types that only one of the two characters can cross or survive
- Enemies (bomb foes, hell skulls) and a final boss with ranged attacks and specific vulnerability conditions
- Collectables and items: keys, hearts, coins, orbs, bombs, sword, staff, bow
- Pressure plates, doors and portals linking multiple areas

## Technical design

- **Double dispatch / Visitor pattern** — `ICoopInteractionVisitor` resolves interactions between any two entity types without `instanceof` chains
- **Polymorphism & modular entity hierarchy** — players, foes, projectiles, walls and collectables share common abstractions (`ElementalEntity`, `Foe`, `Projectile`, `ICoopCollectable`)
- **Cell-based world model** — `ICoopBehavior` defines per-cell rules (walkable, flyable, elemental constraints)
- **State management** — health, immunity frames, inventory and active element per player
- **Maven multi-module build**

## Project structure

```text
icoop/src/main/java/icoop/
├── actor/        # Players, foes, boss, projectiles, items, walls
├── area/         # Areas and per-cell behavior
│   └── maps/     # Individual maps
├── handler/      # Interaction visitors and handlers
├── ICoop.java    # Game logic and area transitions
└── Play.java     # Entry point
game-engine/      # Third-party educational 2D engine (PlayEngine) used as a dependency
```

## How to run

Requirements: JDK 21 and Maven.

```bash
git clone https://github.com/rublell/ICoop-Fire-and-Water.git
cd ICoop-Fire-and-Water
mvn package
java -jar icoop/target/ICoop-jar-with-dependencies.jar
```

Or open the project in IntelliJ IDEA and run `icoop.Play`.

## Credits

Rendering, windowing, input and the base area/actor framework come from the PlayEngine educational engine (`game-engine/`). The game itself lives in `icoop/`.
