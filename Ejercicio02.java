class Ejercicio02{
    public static void main(String[] args){
        Double media = 0.0;
        int[][] data = {
                {3, 2, 5, 13},
                {1, 4, 4, 8},
                {9, 1, 12, 2}
        };

        for (int j = 0; j < data.length; j++) {
            System.out.println(data[j][0]+"-"+data[j][1]+"-"+data[j][2]+"-"+data[j][3]);
            //for (int i = 0; i < data[2].length; i++) {
            //}
        }

        System.out.println("=== Todas las notas de la primera película ===");
        for(int i = 0; i < data[0].length; i++) {
            System.out.println(data[0][i]);
        }

        System.out.println("=== La media de la segunda película. === ");
        for (int i=0; i < data[1].length; i++) {
            media = media + data[1][i];
        }
        media = media / (data[1].length);
        System.out.println(media);

        System.out.println("=== El valor más alto de la tercera película. === ");
        System.out.println(getMaxValue(data));

    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
            for (int i = 0; i < numbers[2].length; i++) {
                if (numbers[2][i] > maxValue) {
                    maxValue = numbers[2][i];
                }
            }
        return maxValue;
    }

}