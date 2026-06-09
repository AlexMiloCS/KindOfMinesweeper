#  Kind of Minesweeper


A custom, console-based Java game that flips the rules of classic Minesweeper on its head. Instead of trying to *avoid* mines, **Kind of Minesweeper** is a competitive 2-player hunting game. Players take turns revealing coordinates on a hidden grid; if you find a mine, you score a point! 

The game continues until all mines on the board have been discovered. The player with the highest score at the end wins the match.

---

##  Table of Contents
1. [Features](#-features)
2. [Project Structure](#-project-structure)
3. [Getting Started](#-getting-started)
4. [How to Play](#-how-to-play)

---

##  Features
* **Competitive Multiplayer:** Turn-based gameplay designed for two players sharing a single console.
* **Customizable Difficulty:** At the start of the game, players define the size of the grid ($N \times N$) and the total number of hidden mines.
* **Live Score Tracking:** The game actively tracks and displays player scores after every turn.
* **Smart Grid System:** Cells automatically calculate how many mines are hiding in their immediate neighboring squares.
* **Input Validation:** Prevents players from selecting coordinates that have already been opened.

---

##  Project Structure

This repository consists of 5 core Java classes that manage the game logic, grid, and player states.

```text
├── Cell.java            # Represents a single grid square (coordinates, mine status, neighbor data)
├── Game.java            # Main entry point; handles user setup (grid size, mine count, names)
├── MineField.java       # Generates the grid, randomly places mines, and prints the active board
├── MineSweeper.java     # Controls the core game loop, alternating turns, and win conditions
└── Player.java          # Manages player profiles, scores, and console input handling
```

---

## Getting Started

### Prerequisites
* **Java Development Kit (JDK):** Version 8 or higher installed on your machine.

### Installation & Execution
1. **Clone the repository:**

```bash
git clone [https://github.com/yourusername/KindOfMinesweeper.git](https://github.com/yourusername/KindOfMinesweeper.git)
cd KindOfMinesweeper
```

2. **Compile the code:**
```bash
javac *.java
```
3. **Run the game:**
```bash
java Game
```

---

##How to Play
1. **Upon starting the game, you will be prompted to set up the match:**

2. **Enter the board size (e.g., 5 creates a 5x5 grid).**

3. **Enter the total number of mines you want hidden on the board.**

Enter the names for Player 1 and Player 2.

Taking a Turn:
During your turn, the console will ask you to enter a row and a column.

If the cell is empty, it will reveal the number of adjacent mines.

If the cell contains a mine, it will display a *, and you will score 1 point!

The game loop automatically alternates turns and prints the updated board state until the final mine is located.
