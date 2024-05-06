## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Project description

This is a simulator built for the Monty Hall problem. For details on the problem visit https://en.wikipedia.org/wiki/Monty_Hall_problem
In summary, the problem revolves around the player being in a game show where there are three doors. Behind two of them are goats, and behind one is a car. The player is prompted to pick a car and the host opens another door to reveal a goat. The player is then asked if they would like to switch or stick with their original choice. Most people assume that the chances of getting the car are now 50/50 and it wouldn't matter if they switched. However, Statistics says otherwise and I created this simulator to prove this theory.
In this implementation the player is able to decide if they want to compute random results to create a large data set or if they would like to play manually.
After the game, the results are written to a text file which will keep track of all games played using the simulator.
This data is then summarised and used to prove the theory. (The larger the data set, the better)
Enjoy!
