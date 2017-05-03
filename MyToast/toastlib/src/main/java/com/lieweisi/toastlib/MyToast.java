package com.lieweisi.toastlib;
import android.content.Context;
/**
 * 自定义提示类
 * 
 * @author liluo
 * 
 */
public class MyToast {

	private MyToast() {
		/* cannot be instantiated */
		throw new UnsupportedOperationException("cannot be instantiated");
	}
	public static ToastCustom mytoast;

	public static Context context;
	/**
	 * 短时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showShort(Context context, String message) {
		ToastCustom.makeText(context.getApplicationContext(), message,2).showSuccess();
	}

	/**
	 * 短时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showShort(Context context, int message) {
		ToastCustom.makeText(context.getApplicationContext(), ""+message,2).showSuccess();
	}

	/**
	 * 长时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showLong(Context context, String message) {
		ToastCustom.makeText(context.getApplicationContext(), message,3.5).showSuccess();
	}

	/**
	 * 长时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showLong(Context context, int message) {
		ToastCustom.makeText(context.getApplicationContext(), ""+message,2).showSuccess();
	}

	/**
	 * 自定义显示Toast时间
	 * 
	 * @param context
	 * @param message
	 * @param duration 单位：秒
	 */
	public static void show(Context context, String message, int duration) {
		ToastCustom.makeText(context.getApplicationContext(), message,duration).showSuccess();
	}

	/**
	 * 自定义显示Toast时间
	 * 
	 * @param context
	 * @param message
	 * @param duration 单位：秒
	 */
	public static void show(Context context, int message, int duration) {
		ToastCustom.makeText(context.getApplicationContext(),""+message,duration).showSuccess();
	}

}