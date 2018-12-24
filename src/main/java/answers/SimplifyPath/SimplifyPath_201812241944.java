package answers.SimplifyPath;

import java.util.ArrayList;

public class SimplifyPath_201812241944 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }

    public static String simplifyPath(String path) {
        if (path.isEmpty()) {
            return "";
        }
        String ans = "";
        String[] array = path.split("/");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String item : array) {
            if ("".equals(item)) {
                continue;
            } else if (".".equals(item)) {
                continue;
            } else if ("..".equals(item)) {
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            } else {
                arrayList.add(item);
            }
        }
        if (arrayList.isEmpty()){
            return "/";
        }

        for (String item : arrayList) {
            ans = ans + "/" + item;
        }
        return ans;
    }
}
