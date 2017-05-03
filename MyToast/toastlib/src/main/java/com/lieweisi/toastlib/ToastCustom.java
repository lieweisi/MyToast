package com.lieweisi.toastlib;
import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Handler;
import android.os.Message;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
public class ToastCustom {
	private static final int MESSAGE_TIMEOUT = 2;
	public static final int LONGTIME = 5;
	private WindowManager wdm;
	private double time;
	private View mView;
	private WindowManager.LayoutParams params;
	private WorkerHandler mHandler;

	private ToastCustom(Context context, String text, double time) {
		wdm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		mHandler = new WorkerHandler();
		Toast toast = new Toast(context);
		LayoutInflater inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflate.inflate(R.layout.toast, null);
		TextView tv = (TextView) view.findViewById(R.id.toastText);
		tv.setText(text);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(view);
		mView = toast.getView();
		setParams();
		this.time = time;
	}
	
	public void setParams()
	{
		params = new WindowManager.LayoutParams();
		params.width = WindowManager.LayoutParams.WRAP_CONTENT;
		params.height = WindowManager.LayoutParams.WRAP_CONTENT;
		params.format = PixelFormat.TRANSLUCENT;
		params.windowAnimations = R.style.anim_view; 
		params.type = WindowManager.LayoutParams.TYPE_TOAST;
		params.setTitle("Toast");
		params.gravity = Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM;
		params.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
				| WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
				| WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE;
		params.y=100;
	}

	public static ToastCustom makeText(Context context, String text, double time) {
		ToastCustom toastCustom = new ToastCustom(context, text, time);
		return toastCustom;
	}

	public void showSuccess() {
		mView.setBackgroundResource(R.drawable.toast_bg);
		wdm.addView(mView, params);
		mHandler.sendEmptyMessageDelayed(MESSAGE_TIMEOUT, (long) (time * 1000));
	}
	public void showError() {
		mView.setBackgroundResource(R.drawable.toast_bg);
		wdm.addView(mView, params);
		mHandler.sendEmptyMessageDelayed(MESSAGE_TIMEOUT, (long) (time * 1000));
	}

	public void cancel() {
		wdm.removeView(mView);
	}

	private  class WorkerHandler extends Handler {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MESSAGE_TIMEOUT:
				cancel();
				break;
			}
		}
	}
}