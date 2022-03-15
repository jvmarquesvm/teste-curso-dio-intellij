package br.com.dio.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        numerosAleatorios.forEach( s ->  System.out.println(s));
        numerosAleatorios.forEach(System.out::println);

        numerosAleatorios.stream().limit(5l).collect(Collectors.toSet()).forEach(System.out::println);

        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        collectList.forEach(System.out::println);

        List<Integer> integerList = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if (integer % 2 == 0 && integer > 2){
                            return true;
                        } else{
                            return false;
                        }
                    }
                }).collect(Collectors.toList());

        List<Integer> integerList2 = numerosAleatorios.stream().map(Integer::parseInt)
                .filter( integer -> integer % 2 == 0 && integer > 2).collect(Collectors.toList());

        System.out.println(integerList2);

        numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.parseInt(s);
            }
        });

        numerosAleatorios.stream().mapToInt( s ->  Integer.parseInt(s)).average()
                .ifPresent( v -> System.out.println(v));

        List<Integer> integerList3 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        integerList3.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if ( integer % 2 != 0 ){
                    return true;
                } else  {
                    return false;
                }
            }
        });

        List<Integer> integerList4 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        integerList4.removeIf(integer -> (integer % 2 != 0) );

        System.out.println(integerList4);

    }
}
