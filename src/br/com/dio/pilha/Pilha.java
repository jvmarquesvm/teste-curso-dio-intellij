package br.com.dio.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty(){
        if(  this.refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    public No top() {
        return this.refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No noRefAux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(noRefAux);
    }

    public No pop() {
        if(!this.isEmpty()){
            No noRemovido = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noRemovido;
        }
        return null;
    }

    @Override
    public String toString() {

        String retorno = "------------\n";
        retorno += "  Pilha\n";
        retorno += "------------\n";

        No noAux = refNoEntradaPilha;

        while (true) {
            if (noAux != null ) {
                retorno += "[No{dado=" + noAux.getDado() + "}]\n";
                noAux = noAux.getRefNo();
            } else {
                break;
            }
        }
        retorno += "===================\n";
        return retorno;
    }
}
