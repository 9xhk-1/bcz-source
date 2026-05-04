package ms;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b implements GestureDetector.OnGestureListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int f73669c = 100;

    /* renamed from: d, reason: collision with root package name */
    public static final String f73670d = "FensterGestureListener";

    /* renamed from: a, reason: collision with root package name */
    public final int f73671a;

    /* renamed from: b, reason: collision with root package name */
    public final a f73672b;

    public b(a listener, ViewConfiguration viewConfiguration) {
        this.f73672b = listener;
        this.f73671a = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e11) {
        Log.i(f73670d, "Down");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
        Log.i(f73670d, "Fling");
        try {
            float y11 = e22.getY() - e12.getY();
            float x11 = e22.getX() - e12.getX();
            if (Math.abs(x11) > Math.abs(y11)) {
                if (Math.abs(x11) <= 100.0f || Math.abs(velocityX) <= this.f73671a) {
                    return true;
                }
                if (x11 > 0.0f) {
                    this.f73672b.k();
                    return true;
                }
                this.f73672b.j();
                return true;
            }
            if (Math.abs(y11) <= 100.0f || Math.abs(velocityY) <= this.f73671a) {
                return true;
            }
            if (y11 > 0.0f) {
                this.f73672b.c();
                return true;
            }
            this.f73672b.g();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e11) {
        Log.i(f73670d, "Long Press");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e12, MotionEvent e22, float distanceX, float distanceY) {
        Log.i(f73670d, "Scroll");
        float y11 = e22.getY() - e12.getY();
        float x11 = e22.getX() - e12.getX();
        if (Math.abs(x11) > Math.abs(y11)) {
            if (Math.abs(x11) <= 100.0f) {
                return false;
            }
            this.f73672b.e(e22, x11);
            if (x11 > 0.0f) {
                Log.i(f73670d, "Slide right");
                return false;
            }
            Log.i(f73670d, "Slide left");
            return false;
        }
        if (Math.abs(y11) <= 100.0f) {
            return false;
        }
        this.f73672b.f(e22, y11);
        if (y11 > 0.0f) {
            Log.i(f73670d, "Slide down");
            return false;
        }
        Log.i(f73670d, "Slide up");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e11) {
        Log.i(f73670d, "Show Press");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e11) {
        this.f73672b.i();
        return false;
    }
}
