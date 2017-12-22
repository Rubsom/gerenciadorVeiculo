import javax.swing.*;
import java.lang.*;

public class Veiculo {

    private String fabricante;
    private String modelo;
    private Integer ano;
    private Double valor;


   public Veiculo (String fabricante, String modelo, Integer ano, Double valor) {

    }

    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "fabricante: " + fabricante + '\'' +
                ", modelo: " + modelo + '\'' +
                ", Ano: " + ano +
                '}';
        }
    public void imprimeVeiculo(){
        JOptionPane.showMessageDialog(null,"Fabricante: "+ fabricante + "\n"
                + "Modelo: " + modelo + "\n" + "Ano: " + ano + "\n");
    }

}
