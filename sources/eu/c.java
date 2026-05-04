package eu;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements RecyclerView.OnItemTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public b f50154a;

    /* renamed from: b, reason: collision with root package name */
    public GestureDetector f50155b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(View view, int position);
    }

    public c(Context context, b listener) {
        this.f50154a = listener;
        this.f50155b = new GestureDetector(context, new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e11) {
        View findChildViewUnder = view.findChildViewUnder(e11.getX(), e11.getY());
        if (findChildViewUnder == null || this.f50154a == null || !this.f50155b.onTouchEvent(e11)) {
            return false;
        }
        this.f50154a.a(findChildViewUnder, view.getChildAdapterPosition(findChildViewUnder));
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) {
    }
}
