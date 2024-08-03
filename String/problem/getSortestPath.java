package String.problem;

public class getSortestPath {

    static float getSortestPath(String path){
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //  north
            if (dir == 'N' || dir == 'n') {
                y++;
            }

            //  south
           else if (dir == 'S' || dir == 's') {
                y--;
            }

             //  east 
             else if (dir == 'W' || dir == 'w') {
                x++;
            }

             // west
             else{
                x--;
             }
               
            
        }

        int Y = y*y;
        int X = x*x;
        float shortPath = (float)Math.sqrt(X+Y);
        return shortPath;
    }
    public static void main(String[] args) {
        String path = "wneeNesennn";
        System.out.println(getSortestPath(path));
    }
}
