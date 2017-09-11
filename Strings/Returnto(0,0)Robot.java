/*Robot starts at (0,0). You are given a string of robot movements e.g. "LRUD" 
signifying robot moves left, right , up, down. Determine if robot return to its starting position.
 */
public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }