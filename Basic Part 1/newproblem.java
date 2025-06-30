import java.util.Scanner;
public class newproblem {
    static int grid_path(int n, int m){
        if(n == 1 || m == 1) return 1;
        else return grid_path(n-1, m) + grid_path(n, m-1);
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int n, m;
            n = input.nextInt();
            m = input.nextInt();
            System.out.println(grid_path(n, m));
        }
    }
}
