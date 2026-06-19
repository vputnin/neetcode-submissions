class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 18.00
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        Map<Integer, Integer> visiting = new HashMap<>();

        for(int i = 0; i < prerequisites.length; i++) {
                int[] courseLink = prerequisites[i];

                List<Integer> linkedCourses = adjList.get(courseLink[0]);
                if (linkedCourses != null) {
                    linkedCourses.add(courseLink[1]);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(courseLink[1]);
                    adjList.put(courseLink[0], list);
                } 
        }


        for(Integer key : adjList.keySet()) {
            if(dfsHasCycle(key, adjList, visiting)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfsHasCycle(Integer key, Map<Integer, List<Integer>> adjList, Map<Integer, Integer> visiting) {
        if(visiting.get(key) != null) {
            return true;
        }
        visiting.put(key, 1);

        List<Integer> list = adjList.get(key);

        if(list != null) {
            for(int val : adjList.get(key)) {
                if(dfsHasCycle(val, adjList, visiting)) {
                    return true;
                }
            }
        }
        
        visiting.put(key, null);
        return false;
    }
}
