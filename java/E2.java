import java.util.Arrays;
import java.util.Collections;

class E2 {
    public static int [] ordenamientoPersonalizado(int [] vector) {
        Object [] myVector=  Arrays.stream(vector).boxed().toArray();
        Arrays.sort(myVector, 0, vector.length/2);
        Arrays.sort(myVector, vector.length/2, vector.length, Collections.reverseOrder());
        return Arrays.stream(myVector).map(Object::toString).mapToInt(Integer::parseInt).toArray();
    }


    public static void main(String[] args) {
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};

        System.out.println(Arrays.toString(ordenamientoPersonalizado(vectorEntrada)));
    }

}