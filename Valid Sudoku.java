import java.util.*;
public class Solution {
    public boolean isValidSudoku(char[][] board) {
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
               char ch=board[i][j];
               int index=(i/3)*3+j/3;
               if(ch=='.')
                continue;
               if(rSets[i].contains(ch)||cSets[j].contains(ch)||rcSets[index].contains(ch))
                return false;
               rSets[i].add(ch);
               cSets[j].add(ch);
               rcSets[index].add(ch);
               
            }
        }
        return true;
    }
}