package com.baicizhan.main.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PatternContainer extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public GestureDetector.OnGestureListener f20111a;

    /* renamed from: b, reason: collision with root package name */
    public GestureDetector f20112b;

    /* renamed from: c, reason: collision with root package name */
    public b f20113c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Direction {
        LEFT,
        UP,
        RIGHT,
        DOWN
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void X(Direction direction);
    }

    public PatternContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return this.f20112b.onTouchEvent(event) | super.onTouchEvent(event);
    }

    public void setOnFlingListener(b listener) {
        this.f20113c = listener;
    }

    public PatternContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f20111a = new a(ViewConfiguration.get(context).getScaledTouchSlop() * 2);
        this.f20112b = new GestureDetector(context, this.f20111a);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements GestureDetector.OnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20114a;

        public a(final int val$flingSlop) {
            this.f20114a = val$flingSlop;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
            Direction direction;
            if (Math.abs(velocityX) > Math.abs(velocityY)) {
                if (Math.abs(e22.getX() - e12.getX()) < this.f20114a) {
                    return false;
                }
                direction = velocityX < 0.0f ? Direction.LEFT : Direction.RIGHT;
            } else {
                if (Math.abs(e22.getY() - e12.getY()) < this.f20114a) {
                    return false;
                }
                direction = velocityY < 0.0f ? Direction.UP : Direction.DOWN;
            }
            PatternContainer patternContainer = PatternContainer.this;
            if (patternContainer.f20113c == null || !patternContainer.isEnabled()) {
                return true;
            }
            PatternContainer.this.f20113c.X(direction);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e12, MotionEvent e22, float distanceX, float distanceY) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e11) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e11) {
        }
    }
}
