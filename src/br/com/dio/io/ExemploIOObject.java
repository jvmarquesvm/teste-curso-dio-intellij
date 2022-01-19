package br.com.dio.io;

import java.io.*;

public class ExemploIOObject {

    public static void serealizacao() throws IOException {
        Gato gato = new Gato("Simba", 6, "Amarelado", true, true);
        File f = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream((f.getName())));
        oos.writeObject(gato);

        PrintStream ps = new PrintStream((System.out));
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes.", f.getName(), f.length());

        oos.close();
        ps.close();
    }

    public static void deserializacao(String arquivo) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream((arquivo)));
        Gato objGato = (Gato) ois.readObject();

        System.out.printf("\nNome........: %s\n", objGato.getNome());
        System.out.printf("\nIdade........: %s\n", objGato.getIdade());
        System.out.printf("\nCor........: %s\n", objGato.getCor());
        System.out.printf("\nCastrado........: %s\n", objGato.getCastrado());

        System.out.println(objGato);

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serealizacao();
        deserializacao("/home/jvictor/Documentos/digital-innovation/desenv-basico-java/primeiro-programa/gato");
    }
}
