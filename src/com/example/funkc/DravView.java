package com.example.funkc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DravView extends View 
{
	private static final int UNIT = 20; // Unit in pixels
	
	private Paint fPaint, lPaint;
	
	
	
	public DravView(Context context)
	{
		super(context);
		Init();
	}
	
	public DravView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		Init();
	}
	
	public DravView(Context context, AttributeSet attrs, int defStyle){
		super(context, attrs, defStyle);
		Init();
	}
	
	private void Init()
	{
		fPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		fPaint.setColor(Color.RED);
		lPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		lPaint.setColor(Color.WHITE);
	}

	
	@Override
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		float vWidth = this.getWidth();
		float vHeight = this.getHeight();
		
		canvas.drawLine(vWidth / 2f, 0f, vWidth / 2f, vHeight, lPaint);
		canvas.drawLine(0f, vHeight / 2f, vWidth, vHeight / 2f, lPaint);
		
		for(int i = 1; i < vWidth / 2f / UNIT; i++) {
			canvas.drawLine(
					vWidth / 2f - i * UNIT,
					vHeight / 2f - UNIT / 3f, 
					vWidth / 2f - i * UNIT, 
					vHeight / 2f + UNIT / 3f, 
					lPaint
			);
			
			if(i == (int)(vWidth / 2f / UNIT)) break;
				
			canvas.drawLine(
					vWidth / 2f + i * UNIT,
					vHeight / 2f - UNIT / 3f, 
					vWidth / 2f + i * UNIT, 
					vHeight / 2f + UNIT / 3f, 
					lPaint
			);
		}
		
		for(int i = 1; i < vHeight / 2f / UNIT; i++) {
			canvas.drawLine(
					vWidth / 2f - UNIT / 3f,
					vHeight / 2f + i * UNIT, 
					vWidth / 2f + UNIT / 3f,
					vHeight / 2f + i * UNIT,  
					lPaint
			);
			
			if(i == (int)(vHeight / 2f / UNIT)) break;
			
			canvas.drawLine(
					vWidth / 2f - UNIT / 3f,
					vHeight / 2f - i * UNIT, 
					vWidth / 2f + UNIT / 3f,
					vHeight / 2f - i * UNIT,  
					lPaint
			);
		}
		canvas.drawLine(vWidth / 2f, 0f, vWidth / 2f + UNIT / 2f, UNIT / 3f, lPaint);
		canvas.drawLine(vWidth / 2f, 0f, vWidth / 2f - UNIT / 2f, UNIT / 3f, lPaint);
		
		canvas.drawLine(vWidth, vHeight / 2f, vWidth - UNIT / 3f, vHeight / 2f - UNIT / 2f, lPaint);
		canvas.drawLine(vWidth, vHeight / 2f, vWidth - UNIT / 3f, vHeight / 2f + UNIT / 2f, lPaint);
	}
}
