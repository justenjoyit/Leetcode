package answers.RestoreIpAddresses;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses_201901022041 {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("1111111"));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        int index0 = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        while (index0<s.length()){
            sb1.append(s.charAt(index0));
            if (sb1.length() != 1 && sb1.toString().startsWith("0")){
                break;
            }
            if (Integer.parseInt(sb1.toString())<=255){
                ++index0;
                int index1 = index0;
                while (index1<s.length()){
                    sb2.append(s.charAt(index1));
                    if (sb2.length() != 1 && sb2.toString().startsWith("0")){
                        sb3 = new StringBuilder();
                        sb2 = new StringBuilder();
                        break;
                    }
                    if (Integer.parseInt(sb2.toString())<=255){
                        ++index1;
                        int index2 = index1;
                        while (index2<s.length()){
                            sb3.append(s.charAt(index2));
                            if (sb3.length() != 1 && sb3.toString().startsWith("0")){
                                sb3 = new StringBuilder();
                                break;
                            }
                            if (Integer.parseInt(sb3.toString())<=255){
                                ++index2;
                                if (index2 == s.length()){
                                    sb3 = new StringBuilder();
                                }else if ((s.length() - index2 <=3) && Integer.parseInt(s.substring(index2))<=255){
                                    if (s.length() - index2 !=1 && s.substring(index2).startsWith("0")){
                                    }else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(sb1).append('.').append(sb2).append('.').append(sb3).append('.').append(s.substring(index2));
                                        ans.add(sb.toString());
                                    }
                                }
                            }else {
                                sb3 = new StringBuilder();
                                break;
                            }
                        }
                    }else {
                        sb2 = new StringBuilder();
                        sb3 = new StringBuilder();
                        break;
                    }
                }
            }else {
                break;
            }
        }
        return ans;
    }
}
