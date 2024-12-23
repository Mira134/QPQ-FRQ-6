public int findLongestConsecutiveSequence(int[] arr){
    Set<Integer> set = new HashSet<>();

    for(int num : arr){
        set.add(num);
    }
    int maxLength = 0;
    for(int num : arr){
        int length = 1;

        if(!set.contains(num - 1)){
            while(set.contains(num + 1)){
                num++;
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }
    }
    return maxLength;
}