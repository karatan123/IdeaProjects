package UserDemo;

/*** 实现用户注册
 * 1. 用户名最多25个字符长度，不能包含空格、单双引号、问号等特殊字符
 * 2. 密码6-18位 只能包含字母、数字、特殊符号（下划线、@，#、$、！）
 * 纯数字、纯字母时，密码强度都是弱（★★☆☆☆☆）
 * 数字+字母、数字+符号、字母+符号，强度为中（★★★★☆☆）
 * 同时存在三种字符，强度为强（★★★★★★）
 * 3. 用户输入正确的email
 * 必须包含@符号，且只能包含一个
 * @和，符号不能在开头，也不能在结尾
 */
public class StringUtil {
     // 1. 用户名最多25个字符长度，不能包含空格、单双引号、问号等特殊字符

    /**
     * 判断传入的用户名字符是否是合法的用户名
     * @param userName
     * @return
     */
    public boolean isCorrectUserName(String userName){
        boolean isCorrect = true;
        String sql = "select * from users where id = '%s' and password = '' or '1'='1'";
        //sql的注入漏洞
        if(userName == null) return false;
        if(userName.length()>25) return false;
        char[] unValidChar = {' ','\'','"','?','<','>',','};
        for(char ch: unValidChar){
            if (userName.contains(Character.toString(ch))){
                isCorrect = false;
                break;
            }
        }


        return isCorrect;
    }

    /**
     *  2. 密码6-18位 只能包含字母、数字、特殊符号（下划线、@，#、$、！）
     *  * 纯数字、纯字母时，密码强度都是弱（★★☆☆☆☆）
     *  * 数字+字母、数字+符号、字母+符号，强度为中（★★★★☆☆）
     *  * 同时存在三种字符，强度为强（★★★★★★）
     */
    public static String validatePassword(String password){
        String power = "";//密码的强度  如果返回值为""，那么密码验证失败  验证成功，则返回幸好表示密码的强度
        if(password == null) return power;
        if(password.length() < 6 || password.length() >18) return power;
        //String[] correctPart = {"_","@","$","!"};//合法的组成部分
        String part = "_@$!";
        for (int i= 0;i<password.length();i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                //如果不是字母或数字，并且也不是合法的特殊字符，就证明是非法的格式
                if (!part.contains(Character.toString(part.charAt(i)))){
                    return power;
                }

            }
        }
        //下面开始判断密码的强度
        if(isDigit(password)||isLetter(password)){
            power = "★★☆☆☆☆";
        }else if(isDigitAndLetter(password)){
            power = "★★★★☆☆";
        }else if(isDigitAndLetterAndSymble(password)){
            power ="★★★★★★";
        }

        return power;

    }

    /**
     * 判断一个字符串是不是纯数字
     * @param value
     * @return
     */
    private static boolean isDigit(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断一个字符串是不是纯字母
     * @param value
     * @return
     */
    private static boolean isLetter(String value){
        for (int i=0;i<value.length();i++){
            if(!Character.isLetter(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean isContainSymble(String value){
        String part = "_@$!";
        for(int i=0;i<value.length();i++){
          if(part.contains(Character.toString(value.charAt(i)))){
              return true;
          }
        }
        return false;
    }

    private static boolean isDigitAndLetter(String value){
        for (int i=0;i<value.length();i++){
            if(!Character.isLetterOrDigit(value.charAt(i))){
                return false;

            }
        }
        return true;
    }
    private static boolean isDigitAndLetterAndSymble(String value){
        int numsDidit = 0;
        int numsLetter = 0;
        int numsSymble = 0;
        for (int i=0;i<value.length();i++){
            if (Character.isLetter(value.charAt(i))){
               numsLetter++;
            }else if (Character.isDigit(value.charAt(i))){
                numsDidit++;
            }else{
                numsSymble++;
            }
        }
        if(numsDidit >=1 && numsLetter >=1 && numsSymble >=1){
        return true;
        }else{
            return false;
        }
    }
}
