package one.digitalinovation;

public class Pilha {
    private No refNoInputPilha;

    public Pilha() {
        this.refNoInputPilha = null;
    }

    //Adiciona um novo dado a pilha.
    public void push(No novoNo){
        No refAuxiliar = refNoInputPilha;
        refNoInputPilha = novoNo;
        refNoInputPilha.setReferenciaNo(refAuxiliar);

    }
    //Remove o último item da pilha.
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoInputPilha;
            refNoInputPilha = refNoInputPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }
    public No top(){
        return refNoInputPilha;

    }

    //Verifica se a pilha está vazia
    public boolean isEmpty(){
        return refNoInputPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno = "--------------------\n";

        No noAuxiliar = refNoInputPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }else{
                break;
            }
        }
        stringRetorno += "=================\n";
        return stringRetorno;
    }
}
