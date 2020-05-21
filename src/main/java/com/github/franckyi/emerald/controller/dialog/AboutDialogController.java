package com.github.franckyi.emerald.controller.dialog;

import com.github.franckyi.emerald.EmeraldApp;
import com.github.franckyi.emerald.controller.Controller;
import com.github.franckyi.emerald.util.SystemUtils;
import com.jfoenix.controls.JFXDialog;
import javafx.fxml.FXML;

public class AboutDialogController extends Controller<JFXDialog, Void> {
    @FXML
    private void closeDialogAction() {
        this.getRoot().close();
        EmeraldApp.getInstance().fixFocus();
    }

    @FXML
    private void openWebsite() {
        SystemUtils.openBrowser("https://github.com/Franckyi/Emerald");
    }
}
