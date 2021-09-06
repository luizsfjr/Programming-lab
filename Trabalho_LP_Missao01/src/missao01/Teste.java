package missao01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import missao01.crivo.CrivoEratostenes;

public class Teste {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();

        CrivoEratostenes ce = new CrivoEratostenes(list1, 1000);
        ce.crivar();

        for (Integer i : list1) {
            System.out.print(i + " ");
        }
        System.out.println("\nTamanho da lista : " + list1.size());

    }
}
