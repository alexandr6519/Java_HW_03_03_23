//Вывести все простые числа от 1 до 1000
package Java_HW_03_03_23;

public class Task_02 {
    boolean is_simple(int n) {
        for (int index = 2; index < n; index++) {
            if (n % index == 0 )
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Task_02 t = new Task_02();
        StringBuilder st = new StringBuilder();
        st = st.append("1");
        for (int i = 2; i < 1000; i++) {
            if (t.is_simple(i))
                st = st.append(", ").append(i);
        }
    System.out.println("This is order of simple numbers from 1 to 1000:");   
    System.out.println(st);   
    }
}
