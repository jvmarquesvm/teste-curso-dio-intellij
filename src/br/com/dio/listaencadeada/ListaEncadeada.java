package br.com.dio.listaencadeada;

public class ListaEncadeada<T> {

    public No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public int size()  {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null ){
                    referenciaAux =  referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<T>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++){
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }

    private void validaIndexe(int index){
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Indice fora do tamanho da lista");
        }
    }

    public No<T> getNo(int index){
        validaIndexe(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivo = this.getNo(index);

        if(index == 0){
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "referenciaEntrada=" + referenciaEntrada +
                '}';
    }

    public String toStringEncadeada() {
        String retorno = "---Lista Encadeada---\n";
        No<T> noAux = referenciaEntrada;

        for ( int i = 0; i < this.size(); i++){
            retorno += "No{conteudo" + noAux.getConteudo() + "}-->";
            noAux = noAux.getProximoNo();
        }
        retorno += "null";

        return retorno;
    }
}
