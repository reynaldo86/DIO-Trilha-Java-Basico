package one.digitalinovation;

public class Fila<T> {
    private No<T> referenciaNoEntradaFila;

    public Fila() {
        this.referenciaNoEntradaFila = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setReferenciaNo(referenciaNoEntradaFila);
        referenciaNoEntradaFila = novoNo;
    }

    public T dequeue(){
        if (!this.isEmpty()){
            No primeiroNo = referenciaNoEntradaFila;
            No noAuxiliar = referenciaNoEntradaFila;
            while(true){
                if(primeiroNo.getReferenciaNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else {
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;

    }
    //Mostra o primeiro da fila
    public T first(){
        if (!this.isEmpty()){
            No primeiroNo = referenciaNoEntradaFila;
            while(true){
                if(primeiroNo.getReferenciaNo() != null){
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    //Verifica se a fila está vazia.
    public boolean isEmpty(){
        return referenciaNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = referenciaNoEntradaFila;

        if (referenciaNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{Object = " + noAuxiliar.getObject() + "}]--->";

                if (noAuxiliar.getReferenciaNo() != null){
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                }else {
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
