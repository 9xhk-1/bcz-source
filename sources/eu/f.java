package eu;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f implements RecyclerView.OnItemTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f50165a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f50166b;

    /* renamed from: c, reason: collision with root package name */
    public final e f50167c;

    /* renamed from: d, reason: collision with root package name */
    public a f50168d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(View header, int position, long headerId);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e11) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            int a11 = f.this.f50167c.a((int) e11.getX(), (int) e11.getY());
            if (a11 == -1) {
                return false;
            }
            View b11 = f.this.f50167c.b(f.this.f50166b, a11);
            f.this.f50168d.a(b11, a11, f.this.d().c(a11));
            f.this.f50166b.playSoundEffect(0);
            b11.onTouchEvent(e11);
            return true;
        }

        public b() {
        }
    }

    public f(final RecyclerView recyclerView, final e decor) {
        this.f50165a = new GestureDetector(recyclerView.getContext(), new b());
        this.f50166b = recyclerView;
        this.f50167c = decor;
    }

    public d d() {
        if (this.f50166b.getAdapter() instanceof d) {
            return (d) this.f50166b.getAdapter();
        }
        throw new IllegalStateException("A RecyclerView with " + f.class.getSimpleName() + " requires a " + d.class.getSimpleName());
    }

    public void e(a listener) {
        this.f50168d = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e11) {
        if (this.f50168d != null) {
            if (this.f50165a.onTouchEvent(e11)) {
                return true;
            }
            if (e11.getAction() == 0 && this.f50167c.a((int) e11.getX(), (int) e11.getY()) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView view, MotionEvent e11) {
    }
}
