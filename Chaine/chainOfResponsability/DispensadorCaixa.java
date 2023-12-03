package chainOfResponsability;

public interface DispensadorCaixa {
    void setProximo(DispensadorCaixa proximo);

    void trocos(double quantia);

}