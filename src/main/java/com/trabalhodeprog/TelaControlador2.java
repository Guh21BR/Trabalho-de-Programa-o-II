package com.trabalhodeprog;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class TelaControlador2 {
    @FXML
    private TextField campoEstoque;

    @FXML
    private TextField campoQuantidade;

    private MaquinadeCoxinha coxinha;

    @FXML
    private void initialize() {
        coxinha = new MaquinadeCoxinha();
        campoEstoque.setText("0");
        campoEstoque.setEditable(false); // campo apenas leitura
    }

    @FXML
    private void abastecimento() {
        try {
            int quantidade = Integer.parseInt(campoQuantidade.getText());
            coxinha.abastecer(quantidade);
            campoEstoque.setText(String.valueOf(coxinha.getEstoque()));
        } catch (NumberFormatException e) {
            exibirAlerta("Erro", "Digite um número válido para abastecimento.");
        }
    }

    @FXML
    private void decremento() {
        coxinha.decrementar();
        campoEstoque.setText(String.valueOf(coxinha.getEstoque()));
    }

    @FXML
    private void vendas() {
        try {
            int quantidade = Integer.parseInt(campoQuantidade.getText());
            coxinha.vender(quantidade);
            campoEstoque.setText(String.valueOf(coxinha.getEstoque()));
        } catch (NumberFormatException e) {
            exibirAlerta("Erro", "Digite um número válido para a venda.");
        }
    }

    @FXML
    private void zera() {
        coxinha.zerar();
        campoEstoque.setText(String.valueOf(coxinha.getEstoque()));
    }

    private void exibirAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
