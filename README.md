# Loose The Letter Game
## Table of Contents
- [Overview](#overview)
- [Feastures](#features)
- [Example Gameplay](#example-gameplay )
- [Testing](#testing)

## Overview 

This project is a Java application for an interactive game played among 'n' participants seated around a circular table. In the game, a random number 'k' [1 <= k <= N] is generated on each turn, and the kth person loses one letter from their name. The game stops when a person has no letters left in their name, and that person is declared the loser. The implementation uses a singly linked circular list to simulate the game scenario.

## Features 

1. **Random Name Selection**:
    - Names are randomly chosen from a text file located at D:\class1.txt.
    - Only the first names are considered, and the maximum name length is assumed to be 6 characters.

2. **Sequential Turns**:
    - Each turn involves generating a random number 'k' and removing one letter from the name of the kth person.
    - If a person's name has no letters left, they lose the game and are removed from the table.
3. **Display Information**:
    - The program displays the value of 'k' in each turn, the selected student, and the entire list of names.
    - An indicator is provided for the person who just lost a letter from their name.
4. **Loser Declaration**:
    - At the end of the game, the program displays the loser.
6. **Insert and Delete Operations**:
    - Users can insert new songs with required fields.
    - Deletion of records is based solely on the ID field.

## Example Gameplay
1. **Initial Setup**: Names are randomly selected from the text file. Participants are seated around the circular table.

2. **Game Turns**: Display of 'k' value, the selected student, and the updated list of names in each turn.

3. **Loser Declaration**: The program announces the loser at the end of the game.
