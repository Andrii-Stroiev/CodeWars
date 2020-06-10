import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int passNumber = 0;
        for (int[] nextStop:stops) {
            passNumber= passNumber+nextStop[0]-nextStop[1];

        }
        return passNumber;

    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,15});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }
}