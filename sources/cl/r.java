package cl;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes6.dex */
public abstract class r<T extends View, Z> extends cl.b<Z> {

    /* renamed from: g, reason: collision with root package name */
    public static final String f8772g = "ViewTarget";

    /* renamed from: h, reason: collision with root package name */
    public static boolean f8773h;

    /* renamed from: i, reason: collision with root package name */
    public static int f8774i = R.id.glide_custom_view_target_tag;

    /* renamed from: b, reason: collision with root package name */
    public final T f8775b;

    /* renamed from: c, reason: collision with root package name */
    public final b f8776c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public View.OnAttachStateChangeListener f8777d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8778e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8779f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.p();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.o();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final int f8781e = 0;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f8782f;

        /* renamed from: a, reason: collision with root package name */
        public final View f8783a;

        /* renamed from: b, reason: collision with root package name */
        public final List<o> f8784b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f8785c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public a f8786d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference<b> f8787a;

            public a(@NonNull b bVar) {
                this.f8787a = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(r.f8772g, 2)) {
                    Log.v(r.f8772g, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f8787a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f8783a = view;
        }

        public static int c(@NonNull Context context) {
            if (f8782f == null) {
                Display defaultDisplay = ((WindowManager) fl.m.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f8782f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f8782f.intValue();
        }

        public void a() {
            if (this.f8784b.isEmpty()) {
                return;
            }
            int g11 = g();
            int f11 = f();
            if (i(g11, f11)) {
                j(g11, f11);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f8783a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f8786d);
            }
            this.f8786d = null;
            this.f8784b.clear();
        }

        public void d(@NonNull o oVar) {
            int g11 = g();
            int f11 = f();
            if (i(g11, f11)) {
                oVar.e(g11, f11);
                return;
            }
            if (!this.f8784b.contains(oVar)) {
                this.f8784b.add(oVar);
            }
            if (this.f8786d == null) {
                ViewTreeObserver viewTreeObserver = this.f8783a.getViewTreeObserver();
                a aVar = new a(this);
                this.f8786d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f8785c && this.f8783a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f8783a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable(r.f8772g, 4)) {
                Log.i(r.f8772g, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f8783a.getContext());
        }

        public final int f() {
            int paddingTop = this.f8783a.getPaddingTop() + this.f8783a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f8783a.getLayoutParams();
            return e(this.f8783a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f8783a.getPaddingLeft() + this.f8783a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f8783a.getLayoutParams();
            return e(this.f8783a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        public final boolean i(int i11, int i12) {
            return h(i11) && h(i12);
        }

        public final void j(int i11, int i12) {
            Iterator it = new ArrayList(this.f8784b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).e(i11, i12);
            }
        }

        public void k(@NonNull o oVar) {
            this.f8784b.remove(oVar);
        }
    }

    public r(@NonNull T t11) {
        this.f8775b = (T) fl.m.e(t11);
        this.f8776c = new b(t11);
    }

    @Deprecated
    public static void r(int i11) {
        if (f8773h) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f8774i = i11;
    }

    @NonNull
    public final r<T, Z> c() {
        if (this.f8777d != null) {
            return this;
        }
        this.f8777d = new a();
        e();
        return this;
    }

    @Nullable
    public final Object d() {
        return this.f8775b.getTag(f8774i);
    }

    public final void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8777d;
        if (onAttachStateChangeListener == null || this.f8779f) {
            return;
        }
        this.f8775b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f8779f = true;
    }

    @Override // cl.b, cl.p
    @Nullable
    public bl.d f() {
        Object d11 = d();
        if (d11 == null) {
            return null;
        }
        if (d11 instanceof bl.d) {
            return (bl.d) d11;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // cl.p
    @CallSuper
    public void g(@NonNull o oVar) {
        this.f8776c.k(oVar);
    }

    @NonNull
    public T getView() {
        return this.f8775b;
    }

    @Override // cl.b, cl.p
    @CallSuper
    public void i(@Nullable Drawable drawable) {
        super.i(drawable);
        this.f8776c.b();
        if (this.f8778e) {
            return;
        }
        n();
    }

    @Override // cl.p
    @CallSuper
    public void j(@NonNull o oVar) {
        this.f8776c.d(oVar);
    }

    @Override // cl.b, cl.p
    public void k(@Nullable bl.d dVar) {
        q(dVar);
    }

    @Override // cl.b, cl.p
    @CallSuper
    public void l(@Nullable Drawable drawable) {
        super.l(drawable);
        e();
    }

    public final void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8777d;
        if (onAttachStateChangeListener == null || !this.f8779f) {
            return;
        }
        this.f8775b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f8779f = false;
    }

    public void o() {
        bl.d f11 = f();
        if (f11 != null) {
            this.f8778e = true;
            f11.clear();
            this.f8778e = false;
        }
    }

    public void p() {
        bl.d f11 = f();
        if (f11 == null || !f11.f()) {
            return;
        }
        f11.c();
    }

    public final void q(@Nullable Object obj) {
        f8773h = true;
        this.f8775b.setTag(f8774i, obj);
    }

    @NonNull
    public final r<T, Z> s() {
        this.f8776c.f8785c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.f8775b;
    }

    @Deprecated
    public r(@NonNull T t11, boolean z11) {
        this(t11);
        if (z11) {
            s();
        }
    }
}
