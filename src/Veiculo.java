public class Veiculo {

    private String fabricante;
    private String modelo;
    private Double versao;

    public Veiculo() {
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
    public Double getVersao() {
        return versao;
    }
    public void setVersao(Double versao) {
        this.versao = versao;
    }

}
