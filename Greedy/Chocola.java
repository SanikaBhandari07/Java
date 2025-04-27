// import java.util.*;
// public class Chocola{
//     public static void main(String args[]){
//         Integer hor[] = {4,1,2};
//         Integer ver[] = {2,1,3,1,4};

//         int h =0, v=0;
//         int vp =1, hp =1;
//         int cost= 0;
//         Arrays.sort(hor, Comparator.reverseOrder());
//         Collections.sort(ver, Collections.reverseOrder());


//         while(h<hor.length && v<ver.length){
//             if(hor[h]>=ver[v]){
//                 cost += (hor[h] * vp);
//                 hp++;
//                 h++;
//             }
//             else{
//                 cost += (ver[v] * hp);
//                 vp++;
//                 v++;
//             }
//         }

//         while(h<hor.length){
//             cost += (hor[h] * vp);
//                 hp++;
//                 h++;
//         }

//         while(v < ver.length){
//             cost += (ver[v] * hp);
//                 vp++;
//                 v++;
//         }

//         System.out.println(cost);
//     }
// }


import java.util.*;

public class Chocola {
    public static void main(String args[]) {
        Integer hor[] = {4, 1, 2}; // Change to Integer[]
        Integer ver[] = {2, 1, 3, 1, 4}; // Change to Integer[]

        int h = 0, v = 0;
        int vp = 1, hp = 1;
        int cost = 0;

        // Convert arrays to lists and sort in reverse order
        List<Integer> horList = Arrays.asList(hor);
        List<Integer> verList = Arrays.asList(ver);

        Collections.sort(horList, Collections.reverseOrder());
        Collections.sort(verList, Comparator.reverseOrder());

        // Convert lists back to arrays if needed
        horList.toArray(hor);
        verList.toArray(ver);

        while (h < hor.length && v < ver.length) {
            if (hor[h] >= ver[v]) {
                cost += (hor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (ver[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < hor.length) {
            cost += (hor[h] * vp);
            hp++;
            h++;
        }

        while (v < ver.length) {
            cost += (ver[v] * hp);
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}
