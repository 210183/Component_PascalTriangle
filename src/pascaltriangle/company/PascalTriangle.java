package pascaltriangle.company;

public class PascalTriangle {
    private int[][] numbers;
    public PascalTriangle(int n) {
        numbers = new int [n][];
        for (int i=0; i<n; i++)
        {
            numbers[i] = new int[i+1];
            for (int j=0; j<=i; j++)
            {
                numbers[i][j] = BinomialTheorem.calculateBinomial(i, j);
            }
        }
    }
    public void show() {
        for (int i=0; i<numbers.length; i++)
        {
            for(int j=0; j<numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
