package Arrays;

public class A12_Trapping_RainWater {

    public static int trap(int height[]){
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int n = height.length;

        int lmax = height[0];
        left[0] = height[0];
        int rmax = height[n-1];
        right[n-1] = height[n-1];
        int vol = 0;
        
        for(int i=1; i<left.length; i++){
            left[i] = Math.max(lmax,height[i]);
            lmax = left[i];
        }

        for(int i=(n-2); i>=0; i--){
            right[i] = Math.max(rmax, height[i]);
            rmax = right[i];
        }

        for(int i=0; i<n; i++){
            vol += Math.min(left[i], right[i])-height[i];
        }

        return vol;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int res = trap(height);
        System.out.println("The water amout is : "+res);
    }
}
