package vn;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public View f94091a;

    /* renamed from: b, reason: collision with root package name */
    public k f94092b;

    /* renamed from: c, reason: collision with root package name */
    public ScrollView f94093c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f94094d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public final int[] f94095e = new int[2];

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f94096f = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            i.this.e();
        }
    }

    public i(View view, k kVar, ScrollView scrollView) {
        this.f94091a = view;
        this.f94092b = kVar;
        this.f94093c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f94093c = scrollView;
    }

    public void b(k kVar) {
        this.f94092b = kVar;
    }

    public void c(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f94096f);
    }

    public void d(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f94096f);
    }

    public void e() {
        ScrollView scrollView = this.f94093c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f94093c.getLocationInWindow(this.f94094d);
        this.f94093c.getChildAt(0).getLocationInWindow(this.f94095e);
        int top = (this.f94091a.getTop() - this.f94094d[1]) + this.f94095e[1];
        int height = this.f94091a.getHeight();
        int height2 = this.f94093c.getHeight();
        if (top < 0) {
            this.f94092b.q0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f94091a.invalidate();
            return;
        }
        if (top + height > height2) {
            this.f94092b.q0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((r0 - height2) / height))));
            this.f94091a.invalidate();
        } else if (this.f94092b.A() != 1.0f) {
            this.f94092b.q0(1.0f);
            this.f94091a.invalidate();
        }
    }
}
