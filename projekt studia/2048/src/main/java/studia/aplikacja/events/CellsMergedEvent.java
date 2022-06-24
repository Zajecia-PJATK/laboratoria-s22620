package studia.aplikacja.events;

import studia.aplikacja.logic.Game;

public interface CellsMergedEvent {
    void merged(int srcRow, int srcCol, int destRow, int destCol, int number, Game.Direction direction, int id);
}
