package application;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    public static String encrypt(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] mgg = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, mgg);
            String htt = no.toString(16);
            while (htt.length() < 32) {
                htt = "0" + htt;
            }
            return htt;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
