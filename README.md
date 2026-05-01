# ICoop — 2D Cooperative Game

ICoop is a 2D cooperative game developed in Java using the EPFL PlayEngine framework.  
The game features two players controlling elemental characters — Fire 🔥 and Water 💧 — who must explore different areas, interact with objects, overcome elemental obstacles, and progress toward a final boss fight.

---

## 🎮 Game Concept

ICoop is designed around local cooperative gameplay, where both players act at the same time and rely on complementary elemental abilities.

The main gameplay mechanics include:

- Two simultaneous players with different elemental properties
- Element-based interactions with enemies, walls, obstacles, and damage sources
- Collectable objects that can be used during the game, such as explosive bombs
- A final boss encounter with ranged attacks and specific vulnerability conditions
- Exploration of multiple playable areas and map zones

---

## 🧠 Technical Concepts

This project applies several object-oriented programming principles, including:

- **Double dispatch** using `ICoopInteractionVisitor`
- **Polymorphism** for game entities such as players, enemies, projectiles, walls, and the boss
- **Cell-based behavior** through `ICoopBehavior`, distinguishing for example between `canWalk` and `canFly`
- **State management** for inventory, immunity, active element, and player interactions
- **Modular entity design** to separate actors, interactions, and game logic

---

## 🗂️ Project Structure

```text
actor/              # Players, enemies, boss, projectiles, walls, etc.
handler/            # Interaction visitors and handlers
ICoopBehavior.java  # Cell behavior and movement rules
ICoop.java          # Main game class
