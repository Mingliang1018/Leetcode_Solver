import java.util.*;
public class Solution {
    public boolean getSolveSudoku(char [][]board, int s1, int e1, Set []rSets, Set []cSets, Set []rcSets)
    {
        if(s1==9)
            return true;
        if(board[s1][e1]=='.')
        {
            for(char ch='1'; ch<='9'; ch++)
            {
                int index=(s1/3)*3+e1/3;
                if(!rSets[s1].contains(ch)&&!cSets[e1].contains(ch)&&!rcSets[index].contains(ch))
                {
                    rSets[s1].add(ch);
                    cSets[e1].add(ch);
                    rcSets[index].add(ch);
                    board[s1][e1]=ch;
                    if(getSolveSudoku(board, s1+(e1+1)/9, (e1+1)%9, rSets, cSets, rcSets))
                        return true;
                    board[s1][e1]='.';
                    rSets[s1].remove(ch);
                    cSets[e1].remove(ch);
                    rcSets[index].remove(ch);
                }
            }
            return false;
        }
        else
        {
            return getSolveSudoku(board, s1+(e1+1)/9, (e1+1)%9, rSets, cSets, rcSets);
        }
    }
    public void solveSudoku(char[][] board) {
        Set<Character> []rSets=new HashSet[9];
        Set<Character> []cSets=new HashSet[9];
        Set<Character> []rcSets=new HashSet[9];
        
        for(int i=0; i<9; i++)
        {
            rSets[i]=new HashSet();
            cSets[i]=new HashSet();
            rcSets[i]=new HashSet();
        }
        
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(board[i][j]!='.')
                {
                    char ch=board[i][j];
                    int index=(i/3)*3+j/3;
                    rSets[i].add(ch);
                    cSets[j].add(ch);
                    rcSets[index].add(ch);
                }
            }
        }
        getSolveSudoku(board, 0, 0, rSets, cSets, rcSets);
  
    }
}