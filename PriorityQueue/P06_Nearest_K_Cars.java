
// You are given the coordinates of multiple cars in a 2D plane and a point representing your location. 
// Find the k cars that are closest to you based on their distance from your location.

package PriorityQueue;

import java.util.PriorityQueue;

public class P06_Nearest_K_Cars {

    static class Point implements Comparable <Point>{
        int x;
        int y;
        int idx;
        int distSq;

        public Point(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }
    public static void main(String args[]){
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }



    }
}
