package search;

/**
 * introduction里面提到的整数与IP互转
 */
public class IPUtil {
    /**
     * ip字符串转整数
     * ip是.分割的整数字符串,按照r进制转十进制的规律,按权相加求和,这里的权是256.
     * @param ip
     * @return
     */
    public static int ip2Int(String ip){
        if(null == ip || "".equals(ip.trim()) || !checkIP(ip)) return 0;
        String[] ipStrs = ip.split("\\.");//分割ip
        int result = 0;
        for(int i = 0;i < 4;i ++){
            Integer ipSubInteger = Integer.parseInt(ipStrs[i]);
            if(ipSubInteger > 255) {//正则验证不能为负数
                result = 0;
                break;
            }
            result += (ipSubInteger << (24 - i * 8));
        }
        return result;
    }

    /*正则验证ip*/
    private static boolean checkIP(String ip){
        return ip.matches("\\d{1,3}(\\.\\d{1,3}){3}");
    }

    /**
     * 整数转ip
     * 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
     * 一个长整数。
     * @param ip
     * @return
     */
    public static String int2Ip(int ip){
        StringBuilder builder = new StringBuilder(String.valueOf(ip >>> 24));
        builder.append(".");
        builder.append(String.valueOf((ip & 0X00FFFFFF) >>> 16));
        builder.append(".");
        builder.append(String.valueOf((ip & 0X0000FFFF) >>> 8));
        builder.append(".");
        builder.append(String.valueOf(ip & 0X000000FF));
        return builder.toString();
    }
}
