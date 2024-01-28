package com.gitdesktop.screens.start;

import java.io.IOException;

import com.gitdesktop.App;

import javafx.fxml.FXML;

public class ProjectManagerController {

  @FXML
  private void onGoToStart() throws IOException {
    App.setRoot("primary");
  }
}
