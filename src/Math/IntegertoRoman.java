class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> map = new LinkedHashMap<>(); //Roman numerals require ordered greedy subtraction,
        // so I must preserve insertion order. That’s why I use arrays or a LinkedHashMap.

        map.put(1000,"M");
        map.put(900, "CM");
        map.put(500,"D" );
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder result=new StringBuilder();
        //  maximal value that can be subtracted from the input
        for(int value:map.keySet()){
            while(num>=value){
                num-=value;
                result.append(map.get(value));
            }
        }
        return result.toString();
    }
}