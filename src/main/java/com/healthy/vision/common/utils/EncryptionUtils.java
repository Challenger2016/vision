package com.healthy.vision.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * 加密工具类
 * 
 * @author 董争光 2018年12月26日下午5:48:21
 */
public class EncryptionUtils {

  public static String md5(String param) {


    return DigestUtils.md5Hex(param + DigestUtils.md5Hex(param));
  }

  private static String secretKey = "5SWtXiLuit9b7qDk6YVsdPu3rVD63XAY";

  public static void aes(String param) {
    try {
      // Key转换
      Key key = new SecretKeySpec(EncryptionUtils.secretKey.getBytes("utf-8"), "AES");

      // 加密
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.ENCRYPT_MODE, key);
      byte[] encodeResult = cipher.doFinal(param.getBytes("utf-8"));
      System.out.println("AESencode : " + Hex.encodeHexString(encodeResult));

      // 解密
      cipher.init(Cipher.DECRYPT_MODE, key);
      byte[] decodeResult = cipher.doFinal(encodeResult);
      System.out.println("AESdecode : " + new String(decodeResult));

    } catch (NoSuchAlgorithmException e) {
      // TODO 自动生成的 catch 块
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      // TODO 自动生成的 catch 块
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      // TODO 自动生成的 catch 块
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      // TODO 自动生成的 catch 块
      e.printStackTrace();
    } catch (BadPaddingException e) {
      // TODO 自动生成的 catch 块
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }



  public static void main(String[] args) {
    EncryptionUtils.aes("我是中国人abc");
    EncryptionUtils.aes("我是中国人abc");
    EncryptionUtils.aes("我是中国人abc");
    EncryptionUtils.aes("我是中国人abc");

  }
}
