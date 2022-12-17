class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();

        String[] c=polynomial.split(" ");

        int cnt = 0;
        int cnn = 0;
        for (String a:c) {

            if(a.equals("x")){
                cnt++;
            }else if(a.contains("x")){
                cnt+=Integer.parseInt(a.substring(0,a.length()-1));
            }else if(!a.contains("+")){
                cnn+=Integer.parseInt(a);
            }
        }
        
        if(cnt==1){
            sb.append('x');
        }else if(cnt >1){
            sb.append(cnt).append('x');
        }
        if(cnt==0){
            sb.append(cnn);
        }else if(cnn!=0){
            sb.append(" + ").append(cnn);
        }


        return sb.toString();
    }
}