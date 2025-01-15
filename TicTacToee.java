import java.util.*;
public class TicTacToee {
    String player1="";
    Strinig player2="";
    char playerid1='O',playerid2='X';
    String player="";
    int c=0,d=0;

    public void boardfull(char[][] input)
    {
        d=0;
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
            if(input[i][j]==' ')
            d++;     
            break;   
            }
        }
    }   
    
           
        
    public void printboard(char[][] board)
    {
        System.out.println("Current Board:");
        for (char[] row : board) {
            System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " | ");
    }
    System.out.println("--------------------------------");
}

    public void winner1(char[][] input)
    {
        for(int i=0;i<=2;i++)
           {
            char playerid='O';
            if((input[i][0]==playerid && input[i][1]==playerid && input[i][2]==playerid )||
            (input[0][i]==playerid && input[1][i]==playerid && input[2][i]==playerid  )||
            (input[0][0]==playerid && input[1][1]==playerid && input[2][2]==playerid )||
            (input[1][2]==playerid && input[1][1]==playerid && input[2][1]==playerid ))
            {
                System.out.println("Player " + player1 + " is Winner.");
                c++;
                break;
            }
            }
        }
        public void winner2(char[][] input)
    {
        for(int i=0;i<=2;i++)
        { 

            char playerid='X';
            if((input[i][0]==playerid && input[i][1]==playerid && input[i][2]==playerid )||
            (input[0][i]==playerid && input[1][i]==playerid && input[2][i]==playerid )||
            (input[0][0]==playerid && input[1][1]==playerid && input[2][2]==playerid )||
            (input[1][2]==playerid && input[1][1]==playerid && input[2][1]==playerid ))
            {
                System.out.println("Player " + player2 + " is Winner.");
                c++;
                break;
            }
        }    
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        TicTacToee obj=new TicTacToee();

        char[][] value={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};


        System.out.println("Enter the name of player 1=");
        obj.player1=sc.nextLine();

        System.out.println("Enter the name of player 2=");
        obj.player2=sc.nextLine();

        obj.printboard(value);

        while(true)
        {         
            System.out.println("Enter the value of row and column " + obj.player1);
            System.out.println("Enter the value of row" );
            int row=sc.nextInt()-1;
            System.out.println("Enter the value of column  " );
            int column=sc.nextInt()-1;
            if(row<=3 && column<=3)
            {
            value[row][column]=obj.playerid1;
            obj.printboard(value);
            }
            else{
                System.out.println("invalid attempt....try again!!!");
                }

            obj.winner1(value);
            if (obj.c==1)
            break;
            obj.boardfull(value);
            if (obj.d==0)
            {
                System.out.println("The board is full...the game is draw....");
            break;
            }


            System.out.println("Enter the value of row and column " + obj.player2);
            System.out.println("Enter the value of row" );
            row=sc.nextInt()-1;
            System.out.println("Enter the value of column" );
            column=sc.nextInt()-1;
            if(row<=3 && column<=3)
            {
              value[row][column]=obj.playerid2;
            obj.printboard(value);
            }
            else{
                System.out.println("invalid attempt....try again!!!");
                }
            obj.winner2(value);  
            if (obj.c==1)
            break;
            obj.boardfull(value);
            if (obj.d==0)
            {
                System.out.println("The board is full...the game is draw....");
            break; 
            }         
}    
}
}

   
