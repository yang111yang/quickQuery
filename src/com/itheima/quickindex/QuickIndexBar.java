package com.itheima.quickindex;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.View;

public class QuickIndexBar extends View {
	
	private String[] indexArr = { "A", "B", "C", "D", "E", "F", "G", "H",
			"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
			"V", "W", "X", "Y", "Z" };
	private Paint paint;

	public QuickIndexBar(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	public QuickIndexBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public QuickIndexBar(Context context) {
		super(context);
		init();
	}
	
	private void init() {
		paint = new Paint(Paint.ANTI_ALIAS_FLAG);//设置抗锯齿
		paint.setColor(Color.WHITE);
		paint.setTextSize(16);
		paint.setTextAlign(Align.CENTER);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		String text = "黑马";
		
		canvas.drawText(text, 0, 30, paint);
	}
	

}
