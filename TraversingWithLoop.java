public class TraversingWithLoop {
    public static void main(String[] args) {
        int[][] binary = {
                {0, 1, 0, 1},
                {1, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 1, 0}
        };
        int onesCount = 0;
        for (int[] rowBinary : binary){
            for (int columnNumber : rowBinary){
                if (columnNumber == 1){
                    onesCount+=1;
                }
            }
        }
        System.out.println(onesCount);

        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

        int i = 0;
        int j = 0;
        while (i  < wordData.length){
            j=0; // you need to initialize in here.
            while (j < wordData[i].length){
                System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
                j++;
            }
            i++;
            System.out.println();
        }


        //System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");

    }
}
