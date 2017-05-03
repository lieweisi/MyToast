package com.lieweisi.mytoast;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import com.lieweisi.toastlib.MyToast;
public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
	}

	public void Show(View view) {
		MyToast.showLong(TestActivity.this, "你好啊");
		finish();
	}

}
