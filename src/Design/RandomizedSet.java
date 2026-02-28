class RandomizedSet {

    HashMap<Integer,Integer> s;
    List<Integer> list;
    Random rand;

    public RandomizedSet() {
        s=new HashMap<>();
        list=new ArrayList<>();
        rand=new Random();

    }

    public boolean insert(int val) {

        if(s.containsKey(val))
            return false;
        list.add(val);
        s.put(val, list.size()-1);

        return true;

    }

    public boolean remove(int val) {
        if(!s.containsKey(val)){
            return false;
        }
        int index=s.get(val); //Swap the element to remove with the last element
        int last=list.get(list.size()-1);
        // Swap only if it's not the last element
        if (index != list.size() - 1) {
            list.set(index,last);
            s.put(last,index);
        }
        list.remove(list.size()-1);
        s.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */