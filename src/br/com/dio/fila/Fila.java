package br.com.dio.fila;

public class Fila<T> {

    private No<T> refNoEntrada = null;

    public boolean isEmpty(){
        return refNoEntrada == null ? true : false;
    }

    public void enqueue(T objeto){
        No novoNo = new No(objeto);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntrada;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObjeto();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntrada;
            No noAux = refNoEntrada;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAux.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObjeto();
        }
        return null;
    }

    @Override
    public String toString() {
        String retorno = "";
        No noAux = this.refNoEntrada;

        if ( this.refNoEntrada != null){
            while (true){
                retorno += "No[{objeto=" + noAux.getObjeto() + "}]-->";
                if(noAux.getRefNo() != null ){
                    noAux = noAux.getRefNo();
                } else {
                    retorno += "null";
                    break;
                }
            }
        } else {
            retorno = "null";
        }
        return retorno;
    }
}
