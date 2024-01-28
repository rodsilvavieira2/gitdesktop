package com.gitdesktop.screens.start;

import java.io.IOException;

import com.gitdesktop.App;

import javafx.fxml.FXML;

public class StartController {

  @FXML
  private void goToProjectManager() throws IOException {
    App.setRoot("projectmanager");
  }
}
