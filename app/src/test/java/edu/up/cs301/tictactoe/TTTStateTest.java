package edu.up.cs301.tictactoe;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TTTStateTest {

    @Test
    public void getPiece() {
        TTTState state = new TTTState();
        assertEquals(state.board[1][1],state.getPiece(1,1));
        assertEquals('?',state.getPiece(-1,-1));


    }

    @Test
    public void constructorTest()
    {
        TTTState state = new TTTState();
        assertNotNull(state.board);
        for (int row = 0; row < state.board.length;row++)
        {
            for (int col = 0; col < state.board[0].length;col++)
            {
                assertEquals(' ',state.board[row][col]);
            }
        }
        state.playerToMove = 1;
        state.board[1][1] = 'X';
        TTTState copiedState = new TTTState(state);
        assertEquals(1,copiedState.playerToMove);
        assertEquals('X',copiedState.board[1][1]);
    }

    @Test
    public void setPiece() {
        TTTState state = new TTTState();
        state.setPiece(1,1,'X');
        assertEquals('X',state.board[1][1]);

    }

    @Test
    public void getWhoseMove() {
        TTTState state = new TTTState();
        assertEquals(0,state.getWhoseMove());
    }

    @Test
    public void setWhoseMove() {
        TTTState state = new TTTState();
        state.setWhoseMove(1);
        assertEquals(1,state.playerToMove);

    }
}