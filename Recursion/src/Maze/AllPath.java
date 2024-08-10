package Maze;

public class AllPath {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
     path("",maze,0,0);

    }
    static  void path(String pro, boolean[][] maze,int r, int c ) {

        if(r== maze.length-1 && c== maze[0].length-1) {
            System.out.println(pro);
            return;

        }





        if(maze[r][c] == false) {
            return;
        }

        maze[r][c] = false;


        if(c<maze[0].length-1 ) {
            path(pro + 'R', maze,r,c+1);

        }


        if(r<maze.length-1) {
            path(pro+'D', maze,r+1,c);
        }
        if(r>0) {
            path(pro+"U", maze,r-1,c);

        }
        if(c>0) {
            path(pro+ "L", maze, r,c-1);
        }

        maze[r][c] = true;


    }
}
