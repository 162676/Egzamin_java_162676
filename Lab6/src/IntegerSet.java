public class IntegerSet {
    private boolean[] tab;

    public IntegerSet() {
        this.tab = new boolean[100];
    }

    public static IntegerSet union(IntegerSet one, IntegerSet two) {
        IntegerSet nowy = new IntegerSet();
        for (int i = 0; i < 100; i++)
            if (one.tab[i] || two.tab[i])
                nowy.tab[i] = true;
        return nowy;
    }

    public static IntegerSet intersection(IntegerSet one, IntegerSet two) {
        IntegerSet nowy = new IntegerSet();
        for (int i = 0; i < 100; i++)
            if (one.tab[i] && two.tab[i])
                nowy.tab[i] = true;
        return nowy;
    }

    void insertElement(int n) {
        this.tab[n - 1] = true;
    }

    void deleteElement(int n) {
        this.tab[n - 1] = false;
    }
    @Override
    public String toString() {
        StringBuilder tab = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (this.tab[i]) {
                tab.append(i + 1);
                tab.append(" ");
            }
        }
        return tab.toString();
    }

    public static void main(String[] args) {

                IntegerSet test = new IntegerSet();
                test.insertElement(20);
                test.insertElement(29);

                System.out.println(test);

                IntegerSet test2 = new IntegerSet();

                test2.insertElement(7);
                test2.insertElement(24);

                System.out.println(test2);
                IntegerSet test3 = IntegerSet.union(test, test2);
                System.out.println(test3);
                IntegerSet test4 = IntegerSet.intersection(test, test2);
                System.out.println(test4);

                test3.deleteElement(7);
                test3.deleteElement(24);
            }
        }

