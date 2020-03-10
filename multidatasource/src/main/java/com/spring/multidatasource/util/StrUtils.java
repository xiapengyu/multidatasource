/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.spring.multidatasource.util;

import com.spring.multidatasource.dao.oma.AccountDao;
import com.spring.multidatasource.dto.AccountDto;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/**
 * 字符串工具类
 *
 * @author gucunyang
 * @since 2018-02-08
 */
public class StrUtils {

	public static Map<String, AccountDto> phoneMap = new HashMap<>();

	private StrUtils() {
	}

	/**
	 * 生成随机uuid
	 *
	 * @return 返回生成的uuid
	 */
	public static String generateUuid() {
		String uuid = UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}

	/**
	 * 生成随机字符串
	 *
	 * @return
	 */
	public static String generateRandomString() {
		return generateUuid();
	}

	/**
	 * 判断字符串是否为空
	 *
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		int strLen;
		if (value != null && (strLen = value.length()) != 0) {
			for (int i = 0; i < strLen; ++i) {
				if (!Character.isWhitespace(value.charAt(i))) {
					return false;
				}
			}

			return true;
		} else {
			return true;
		}
	}

	/**
	 * 字符串为空判断
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isNull(String s) {
		return ((s == null) || (s.equals("")) || (s.equalsIgnoreCase("null")) || (s.equalsIgnoreCase("undefined")));
	}

	// 手机号码隐藏
	public static String phoneHide(String phone) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < phone.length(); i++) {
			if (i > 2 && i < 7) {
				sb.append("x");
			} else {
				sb.append(phone.charAt(i));
			}
		}
		return sb.toString();
	}

	/**
	 * 计算两点之间距离，单位km
	 * 
	 * @param longitude1
	 * @param latitude1
	 * @param longitude2
	 * @param latitude2
	 * @return
	 */
	public static String algorithm(double longitude1, double latitude1, double longitude2, double latitude2) {
		/*
		 * if(longitude1 == 0 && latitude1 == 0) { DecimalFormat df = new
		 * DecimalFormat("#.00"); return df.format(0); }
		 */
		double Lat1 = rad(latitude1); // 纬度
		double Lat2 = rad(latitude2);
		double a = Lat1 - Lat2;// 两点纬度之差
		double b = rad(longitude1) - rad(longitude2); // 经度之差
		double s = 2 * Math.asin(Math
				.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(Lat1) * Math.cos(Lat2) * Math.pow(Math.sin(b / 2), 2)));// 计算两点距离的公式
		s = s * 6378137.0;// 弧长乘地球半径（半径为米）
		s = Math.round(s * 10000d) / 10000d;// 精确距离的数值
		s = s / 1000;// 将单位转换为km，如果想得到以米为单位的数据 就不用除以1000
		// 四舍五入 保留一位小数
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(s);
	}

	private static double rad(double d) {
		return d * Math.PI / 180.00; // 角度转换成弧度
	}

	/**
	 * 请求同一用户中心接口生成请求URL字符串
	 * @param unionId
	 * @param accessToken
	 * @param body
	 * @param appid
	 * @param appkey
	 * @return
	 */
	public static String generateSigUrl(String unionId, String accessToken, String body, String appid, String appkey) {
	    Map<String, Object> urlParams = new HashMap<>();
	    urlParams.put("appid", appid);
	    //String timestamp = System.currentTimeMillis() + "";
	    String timestamp = "1571964750537";
	    urlParams.put("timestamp", timestamp);
	    urlParams.put("req_id", timestamp);
	    if (unionId != null) {
	      urlParams.put("unionId", unionId);
	    }
	    if (accessToken != null) {
	      urlParams.put("accessToken", accessToken);
	    }
	    if (body != null) {
	      urlParams.put("body", body);
	    }
	    
	    String sig = sign(urlParams, appkey);
	    String sigUrl = String.format("appid=%s&timestamp=%s&req_id=%s&sig=%s", appid, timestamp, timestamp, sig);
	    return sigUrl;
	  }

	private static String sign(Map<String, Object> param, String appkey) {
	    param.remove("appkey");
	    TreeMap<String, Object> sortedParam = new TreeMap<>(param);
	    StringBuilder paramBuilder = new StringBuilder();
	    if (sortedParam.size() > 0) {
	      sortedParam.forEach((k, v) -> {
	        if (v != null) {
	          paramBuilder.append(k).append("=").append(v).append("&");
	        }
	        });
	      paramBuilder.append("appkey=").append(appkey);
	    } else {
	      paramBuilder.append("appkey=").append(appkey);
	    }
	    //生成md5，再转换成大写
	    return DigestUtils.md5Hex(paramBuilder.toString()).toUpperCase();
	  }
	
	public static String obj2String(Object obj) {
		if(obj == null ) {
			return "";
		}else {
			return obj.toString();
		}
	}

	public static Map<String, String> rechargeTool(String userUuid, double money){
		Map<String, String> resultMap = new HashMap<>();
		try {
			String signKey = "account.sign.key";
			BigDecimal balance = BigDecimal.valueOf(money);
			StringBuilder sb = new StringBuilder(userUuid);
			//余额取整加密，以防小数位数不一致导致签名不一致
			sb.append((balance.multiply(new BigDecimal(100))).setScale( 0, BigDecimal.ROUND_UP ).longValue()).append(signKey);
			String sign = MD5Util.md5Sign(sb.toString());
			resultMap.put("userUuid", userUuid);
			resultMap.put("sign", sign);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return resultMap;
	}
}
