package br.com.dio.fila;

public class No {
    private Object objeto;
    private No refNo;

    public No(Object objeto) {
        this.refNo = null;
        this.objeto = objeto;
    }

    public No() {
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        if (refNo != null) {
            this.refNo = refNo;
        }
    }

    @Override
    public String toString() {
        return "No{" +
                "objeto=" + objeto +
                '}';
    }
}
