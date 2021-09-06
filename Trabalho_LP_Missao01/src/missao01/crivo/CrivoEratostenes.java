package missao01.crivo;

import java.util.List;

public class CrivoEratostenes {

    private int limVer;
    private List<Integer> list;
    private long N;

    public CrivoEratostenes(List l, int N) {
        limVer = (int) Math.sqrt(N);
        list = l;
        this.N = N;
    }

    /**
     * Metodo que preenche a lista
     */
    private void preencheLista() {
        for (int i = 2; i <= N; i++) {
            list.add(i);
        }
    }

    /**
     * Metodo que executa o crivo
     */
    public void crivar() {

        preencheLista();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= limVer) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) % list.get(i) == 0) {
                        list.remove(j);
                    }
                }
            }
        }

    }

    public List<Integer> getList() {
        return list;
    }
}
