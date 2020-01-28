package sample.movement;

import sample.Roomba;

public abstract class Action {  // Rotate/Movement

    abstract void execute(Roomba r, double amount);

}
