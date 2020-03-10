package com.spring.multidatasource.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	private MD5Util() {}

	/**
	 * MD5签名
	 *
	 * @param content
	 *            验签字符串
	 * @param charset
	 *            字符集
	 * @return 签名
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String md5Sign(String content) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String sign;

		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte[] bytes = md5.digest(content.getBytes("utf-8"));
		sign = encodeBytes(bytes);

		return sign;
	}

	/**
	 * byte数组转换成字符串
	 *
	 * @param bytes
	 *            转换数组
	 * @return String
	 */
	public static String encodeBytes(byte[] bytes) {
		StringBuilder hex = new StringBuilder(bytes.length * 2);
		for (byte b : bytes) {
			if ((b & 0xFF) < 0x10) {
				hex.append("0");
			}
			hex.append(Integer.toHexString(b & 0xFF));
		}
		return hex.toString().toUpperCase();
	}


	public static String md5(File file) {
		MessageDigest digest = null;
		FileInputStream fis = null;
		byte[] buffer = new byte[1024];

		try {
			if (!file.isFile()) {
				return "";
			}

			digest = MessageDigest.getInstance("MD5");
			fis = new FileInputStream(file);

			while (true) {
				int len;
				if ((len = fis.read(buffer, 0, 1024)) == -1) {
					fis.close();
					break;
				}

				digest.update(buffer, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		BigInteger var5 = new BigInteger(1, digest.digest());
		return String.format("%1$032x", new Object[]{var5});
	}

	public static File multipartFileToFile(MultipartFile file) throws Exception {

		File toFile = null;
		if (file.equals("") || file.getSize() <= 0) {
			file = null;
		} else {
			InputStream ins = null;
			ins = file.getInputStream();
			toFile = new File(file.getOriginalFilename());
			inputStreamToFile(ins, toFile);
			ins.close();
		}
		return toFile;
	}
	private static void inputStreamToFile(InputStream ins, File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			int bytesRead = 0;
			byte[] buffer = new byte[8192];
			while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
			os.close();
			ins.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
