package pt.utad.mei.aps.objectpool;

//import java.util.logging.Logger;

public class PontosPool extends Pool<Ponto> {

    public PontosPool(int size) {
        super(size);
    }

    @Override
    public void addObj() {
        this.objects.add(new Ponto());
    }

    @Override
    public Ponto get() {
        if (this.objects.isEmpty()) {
            return null;
        }
        Ponto ponto = null;

        try {
            ponto = (Ponto) this.objects.take();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return ponto;

    }

    @Override
    public void leave(Ponto t) {
        if (t == null) {
            throw new NullPointerException("Object is null");
        }
        boolean res = this.objects.offer(t);

        if (res == false) {
            System.out.println("Erro na devolução do ponto");
        }
    }

}
