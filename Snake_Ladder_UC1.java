package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Snake_Ladder_UC1 {

	public static void main(String[] args) {
		SnakeNLadder s = new SnakeNLadder();
		s.startGame();

	}

}

class SnakeNLadder
{
	
	final static int WINPOINT = 100;
	
	
	static Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	static Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
	
	{
		snake.put(99,54);
		snake.put(70,55);
		snake.put(52,42);
		snake.put(25,2);
		snake.put(95,72);
		
		ladder.put(6,25);
		ladder.put(11,40);
		ladder.put(60,85);
		ladder.put(46,90);
		ladder.put(17,69);
	}
	
	
	
	public int rollDice()
	{
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return (n==0?1:n);
	}
	
	public void startGame()
	{
		int player1 =0;
		int currentPlayer=-1;
		Scanner s = new Scanner(System.in);
		String str;
		int diceValue =0;
		do
		{
			System.out.println(currentPlayer==-1?"\n\nFIRST PLAYER TURN":"\n\n");
			System.out.println("Press r to roll Dice");
			str = s.next();
			diceValue = rollDice();
			
			
			if(currentPlayer == -1)
			{
				player1 = calculatePlayerValue(player1,diceValue);
				System.out.println("Player :: " + player1);
		    	System.out.println("------------------");
				if(isWin(player1))
				{
					System.out.println("Player wins");
					return;
				}
			}
			else	{
				
				System.out.println("Player lose");
				
			}

			
			currentPlayer= -currentPlayer;
			
			
			
		}while("r".equals(str));
	}
	
	
	public int calculatePlayerValue(int player, int diceValue)
	{
		player = player + diceValue;
		
		if(player > WINPOINT)
		{
			player = player - diceValue;
			return player;
		}
		
		if(null!=snake.get(player))
		{
			System.out.println("swallowed by snake");
			player= snake.get(player);
		}
		
		if(null!=ladder.get(player))
		{
			System.out.println("climb up the ladder");
			player= ladder.get(player);
		}
		return player;
	}
	
	public boolean isWin(int player)
	{
		return WINPOINT == player;
	}
	
}