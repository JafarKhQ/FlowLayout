package com.jafarkhq.viewgroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup {

	public FlowLayout(Context context) {
		super(context);
		readStyledAttributes(context, null);
	}

	public FlowLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		readStyledAttributes(context, attrs);
	}

	public FlowLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		readStyledAttributes(context, attrs);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		// TODO Auto-generated method stub
	}

	private void readStyledAttributes(Context context, AttributeSet attrs) {
		if (null == attrs) {
			return;
		}

		final TypedArray a = context.obtainStyledAttributes(attrs,
				com.jafarkhq.viewgroup.R.styleable.FlowLayout);

		a.recycle();
	}

	public static class LayoutParams extends ViewGroup.MarginLayoutParams {
		public LayoutParams(Context c, AttributeSet attrs) {
			super(c, attrs);
			readStyledAttributes(c, attrs);
		}

		public LayoutParams(int width, int height) {
			super(width, height);
		}

		public LayoutParams(ViewGroup.LayoutParams p) {
			super(p);
		}

		public LayoutParams(MarginLayoutParams source) {
			super(source);
		}

		private void readStyledAttributes(Context context, AttributeSet attrs) {
			if (null == attrs) {
				return;
			}

			final TypedArray a = context.obtainStyledAttributes(attrs,
					com.jafarkhq.viewgroup.R.styleable.FlowLayout_Layout);
			a.recycle();
		}
	}
}
