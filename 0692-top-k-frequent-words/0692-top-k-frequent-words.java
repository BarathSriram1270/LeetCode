class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> fm=new HashMap<>();
        for(String s:words){
            fm.put(s,fm.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String,Integer>>list=new ArrayList<>(fm.entrySet());
        list.sort((a,b)->{ 
        if(!b.getValue().equals(a.getValue())){
            return b.getValue()-a.getValue();
        }
        else{
            return a.getKey().compareTo(b.getKey());
        }}
        );
        List<String> ret=new ArrayList<>();
        for(int i=0;i<k;i++){
            ret.add(list.get(i).getKey());
        }
        return ret;
    }
}