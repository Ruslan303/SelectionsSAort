//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Sıralanmamış massiv:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        SelectionsSort.selectionSort(arr);

        System.out.println("Sıralanmış massiv:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}