package pt.isec.pa.ui.gui;

import javafx.scene.layout.BorderPane;
import pt.isec.pa.model.Facade;
import pt.isec.pa.model.fsm.AppState;

public class PhaseThreeStateUI  extends BorderPane {
    Facade facade;

    public PhaseThreeStateUI(Facade facade) {
        this.facade = facade;
        createViews();
        registerHandlers();
        update();
    }


    private void registerHandlers() {
    }


    private void createViews() {

    }

    private void update() {
        if (facade.getState() != AppState.PHASE_THREE) {
            this.setVisible(false);
            return;
        }
        this.setVisible(true);
    }
}
