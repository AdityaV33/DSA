class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // cars[i][0] = position
        // cars[i][1] = time to reach target
        double [][] cars = new double[n][2];

        for(int i =0  ;i<n ; i++){
            cars[i][0] = position [i];
            cars[i][1]= (double)(target-position[i])/speed[i];

        }
        //sort by descending order
        Arrays.sort(cars,(a,b) -> Double.compare(b[0],a[0]));
        int fleetcount = 0; 
        double prevfleettime=0;

        for(double[] car : cars){
            if(car[1]>prevfleettime){
                fleetcount++;
                prevfleettime = car[1];
            }
        }
        return fleetcount;



        
    }
}