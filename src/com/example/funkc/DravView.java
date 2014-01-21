package com.example.funkc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

public class DravView extends View 
{
	MainActivity main;
	private Paint m_paint;
	Path path = new Path();
	float m_x;
	float m_y;
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
		m_paint=new Paint(Paint.ANTI_ALIAS_FLAG);
		m_paint.setColor(Color.RED);
	}
	public void setPos(float x,float y)
	{

		m_x=x+150;
		m_y=y+150;
		invalidate();
	}
	
	@Override
	public void onDraw(Canvas canvas)
	{
		main.a=1;main.b=1;main.c=1;
		super.onDraw(canvas);
		int i;
		for(i=-149;i<150;i++)
		{
			float y= main.a*(i*i)+main.b*i+main.c;
			setPos(i,y);
		canvas.drawCircle(m_x, m_y, 5, m_paint);
		}
	}
}
