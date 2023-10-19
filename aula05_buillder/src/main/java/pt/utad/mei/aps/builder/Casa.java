package pt.utad.mei.aps.builder;

public class Casa implements ProjetoCasa {

    private String _fundacoes;
    private String _estrutura;
    private String _coberuta;
    private String _interior;

    @Override
    public void setFundacoes(String fundacoes) {
        this._fundacoes = fundacoes;
    }

    @Override
    public void setEstrutura(String estrutura) {
        this._estrutura = estrutura;
    }

    @Override
    public void setCobertura(String cobertura) {
        this._coberuta = cobertura;
    }

    @Override
    public void setInterior(String interior) {
        this._interior = interior;
    }

    @Override
    public String toString() {
        return "casa { fundacoes = " + _fundacoes + ", estrutura =" + _estrutura + " cobertura =" + _coberuta
                + "interior = " + _interior + " }";
    }

}
