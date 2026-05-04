package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SwipeViewPager extends LockableViewPager {

    /* renamed from: h, reason: collision with root package name */
    public static final String f17180h = "SwipeViewPager";

    /* renamed from: b, reason: collision with root package name */
    public GestureDetector f17181b;

    /* renamed from: c, reason: collision with root package name */
    public b f17182c;

    /* renamed from: d, reason: collision with root package name */
    public float f17183d;

    /* renamed from: e, reason: collision with root package name */
    public float f17184e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17185f;

    /* renamed from: g, reason: collision with root package name */
    public int f17186g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Direction {
        LEFT,
        UP,
        RIGHT,
        DOWN
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
            Direction direction = Math.abs(velocityX) > Math.abs(velocityY) ? velocityX < 0.0f ? Direction.LEFT : Direction.RIGHT : velocityY < 0.0f ? Direction.UP : Direction.DOWN;
            if (SwipeViewPager.this.f17182c == null) {
                return true;
            }
            SwipeViewPager.this.f17182c.a(direction);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(Direction direction);
    }

    public SwipeViewPager(Context context) {
        super(context);
        this.f17183d = 0.0f;
        this.f17184e = 0.0f;
        this.f17185f = false;
        this.f17186g = 0;
    }

    @Override // com.baicizhan.client.business.widget.LockableViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        int i11;
        int action = event.getAction();
        if (action == 0) {
            this.f17183d = event.getX();
            this.f17184e = event.getY();
            this.f17185f = false;
        } else if (action == 2 && (i11 = this.f17186g) > 0 && i11 == getCurrentItem()) {
            float x11 = event.getX();
            float f11 = x11 - this.f17183d;
            float y11 = event.getY();
            float f12 = y11 - this.f17184e;
            this.f17183d = x11;
            this.f17184e = y11;
            if (Math.abs(f11) > Math.abs(f12) && f11 > 0.0f) {
                if (!canScroll(this, false, (int) f11, (int) x11, (int) y11)) {
                    this.f17185f = true;
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.baicizhan.client.business.widget.LockableViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        try {
            this.f17181b.onTouchEvent(ev2);
            if (this.f17185f) {
                return true;
            }
            return super.onTouchEvent(ev2);
        } catch (Exception e11) {
            c.c(f17180h, "", e11);
            return false;
        }
    }

    public void setFlingListener(b flingListener) {
        this.f17182c = flingListener;
    }

    public void setOffset(int offset) {
        this.f17186g = offset;
    }

    public SwipeViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17183d = 0.0f;
        this.f17184e = 0.0f;
        this.f17185f = false;
        this.f17186g = 0;
        this.f17181b = new GestureDetector(context, new a());
    }
}
