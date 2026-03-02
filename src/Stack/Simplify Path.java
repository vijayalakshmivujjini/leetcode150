class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] strarr = path.split("/"); // splits by single backslash
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].isEmpty() ||strarr[i].equals(".")){
                continue;
            }else if(strarr[i].equals("..")){
                if(!s.isEmpty()) s.pop();
            }
            else{
                s.push(strarr[i]);
            }

        }
        StringBuilder sb = new StringBuilder(); //need string buffer to return whole stack
        for(String dir:s){
            sb.append("/").append(dir);
        }
        return s.isEmpty()?"/":sb.toString(); //if stack is empty we return root directory

    }
}