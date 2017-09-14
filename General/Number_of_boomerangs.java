//Given n points(i,j), return the number of combination of points(a,b,c) where distance from a to b = distance from a to c.


public int numberOfBoomerangs(int[][] points) {
    int res = 0;

    Map<Integer, Integer> map = new HashMap<>();	//Distance-freq 
    for(int i=0; i<points.length; i++) {
        for(int j=0; j<points.length; j++) {
            if(i == j)
                continue;
            
            int d = getDistance(points[i], points[j]);                
            map.put(d, map.getOrDefault(d, 0) + 1);	
        }
        
        for(int val : map.values()) {
            res += val * (val-1);	//number of permutations that can be formed is nP2 = n(n-1), since out of 3 points 'a' is kept constant, b and c can be interchanged to form permutations
        }            
        map.clear();
    }
    
    return res;
}

private int getDistance(int[] a, int[] b) {
    int dx = a[0] - b[0];
    int dy = a[1] - b[1];
    
    return dx*dx + dy*dy;
}