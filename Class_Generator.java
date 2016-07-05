package Tetris;

import java.util.Random;


public class Generator {
    Random rand = new Random();

    StackArray sArray = new StackArray();
    while((sArray.array[0][4]==0)&(sArray.array[0][5]==0)) {
        sArray.array[0][4] = rand.nextInt(2);
        sArray.array[0][5] = rand.nextInt(2);
    }
    if ((sArray.array[0][4]==1)&&(sArray.array[0][5]==1)){
        sArray.array[1][4] = 1;
        sArray.array[1][5] = 1;
    }
    else{
        if ((sArray.array[0][5]==1)){
            sArray.array[1][5] = 1;
            sArray.array[2][4] = 1;
            sArray.array[2][5] = rand.nextInt(2);
            if (sArray.array[2][5]==0)
                sArray.array[1][4] = 1;
            else
                sArray.array[2][5]=1;
        }
        else{
            sArray.array[1][4] = 1;
            sArray.array[1][5] = rand.nextInt(2);
            if (sArray.array[1][5]==1)
                sArray.array[2][4] = rand.nextInt(2);
            else{
                sArray.array[2][4]=1;
                sArray.array[2][5] = rand.nextInt(2);
                if (sArray.array[2][5]==0) sArray.array[3][4]=1;
            }

        }

    }
    for (int i =0; i <20; i++){
        for (int j =0; j<10; j++)
            System.out.print(sArray.array[i][j]+"\t");
        System.out.println();
    }
}

