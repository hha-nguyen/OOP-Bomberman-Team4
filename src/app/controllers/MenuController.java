package app.controllers;

import app.views.*;

public class MenuController {

    public View showHomeMenu() {
        View view = new MenuView();

        return view;
    }

    public View showPauseMenu() {
        View view = new PauseView();

        return view;
    }

    public View showGameOverMenu() {
        View view = new GameOverView();

        return view;
    }

    public View showOptionsMenu() {
        View view = new OptionsView();

        return view;
    }
}
