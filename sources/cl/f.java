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
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f8735f = "CustomViewTarget";

    /* renamed from: g, reason: collision with root package name */
    @IdRes
    public static final int f8736g = R.id.glide_custom_view_target_tag;

    /* renamed from: a, reason: collision with root package name */
    public final b f8737a;

    /* renamed from: b, reason: collision with root package name */
    public final T f8738b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public View.OnAttachStateChangeListener f8739c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8740d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8741e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            f.this.q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.this.p();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final int f8743e = 0;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f8744f;

        /* renamed from: a, reason: collision with root package name */
        public final View f8745a;

        /* renamed from: b, reason: collision with root package name */
        public final List<o> f8746b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f8747c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public a f8748d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference<b> f8749a;

            public a(@NonNull b bVar) {
                this.f8749a = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(f.f8735f, 2)) {
                    Log.v(f.f8735f, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f8749a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f8745a = view;
        }

        public static int c(@NonNull Context context) {
            if (f8744f == null) {
                Display defaultDisplay = ((WindowManager) fl.m.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f8744f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f8744f.intValue();
        }

        public void a() {
            if (this.f8746b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f8745a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f8748d);
            }
            this.f8748d = null;
            this.f8746b.clear();
        }

        public void d(@NonNull o oVar) {
            int g11 = g();
            int f11 = f();
            if (i(g11, f11)) {
                oVar.e(g11, f11);
                return;
            }
            if (!this.f8746b.contains(oVar)) {
                this.f8746b.add(oVar);
            }
            if (this.f8748d == null) {
                ViewTreeObserver viewTreeObserver = this.f8745a.getViewTreeObserver();
                a aVar = new a(this);
                this.f8748d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f8747c && this.f8745a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f8745a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable(f.f8735f, 4)) {
                Log.i(f.f8735f, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f8745a.getContext());
        }

        public final int f() {
            int paddingTop = this.f8745a.getPaddingTop() + this.f8745a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f8745a.getLayoutParams();
            return e(this.f8745a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f8745a.getPaddingLeft() + this.f8745a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f8745a.getLayoutParams();
            return e(this.f8745a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        public final boolean i(int i11, int i12) {
            return h(i11) && h(i12);
        }

        public final void j(int i11, int i12) {
            Iterator it = new ArrayList(this.f8746b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).e(i11, i12);
            }
        }

        public void k(@NonNull o oVar) {
            this.f8746b.remove(oVar);
        }
    }

    public f(@NonNull T t11) {
        this.f8738b = (T) fl.m.e(t11);
        this.f8737a = new b(t11);
    }

    @Nullable
    private Object b() {
        return this.f8738b.getTag(f8736g);
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8739c;
        if (onAttachStateChangeListener == null || this.f8741e) {
            return;
        }
        this.f8738b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f8741e = true;
    }

    private void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8739c;
        if (onAttachStateChangeListener == null || !this.f8741e) {
            return;
        }
        this.f8738b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f8741e = false;
    }

    private void r(@Nullable Object obj) {
        this.f8738b.setTag(f8736g, obj);
    }

    @NonNull
    public final f<T, Z> a() {
        if (this.f8739c != null) {
            return this;
        }
        this.f8739c = new a();
        d();
        return this;
    }

    @NonNull
    public final T c() {
        return this.f8738b;
    }

    @Override // cl.p
    @Nullable
    public final bl.d f() {
        Object b11 = b();
        if (b11 == null) {
            return null;
        }
        if (b11 instanceof bl.d) {
            return (bl.d) b11;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // cl.p
    public final void g(@NonNull o oVar) {
        this.f8737a.k(oVar);
    }

    @Override // cl.p
    public final void i(@Nullable Drawable drawable) {
        this.f8737a.b();
        n(drawable);
        if (this.f8740d) {
            return;
        }
        e();
    }

    @Override // cl.p
    public final void j(@NonNull o oVar) {
        this.f8737a.d(oVar);
    }

    @Override // cl.p
    public final void k(@Nullable bl.d dVar) {
        r(dVar);
    }

    @Override // cl.p
    public final void l(@Nullable Drawable drawable) {
        d();
        o(drawable);
    }

    public abstract void n(@Nullable Drawable drawable);

    public final void p() {
        bl.d f11 = f();
        if (f11 != null) {
            this.f8740d = true;
            f11.clear();
            this.f8740d = false;
        }
    }

    public final void q() {
        bl.d f11 = f();
        if (f11 == null || !f11.f()) {
            return;
        }
        f11.c();
    }

    @NonNull
    public final f<T, Z> t() {
        this.f8737a.f8747c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.f8738b;
    }

    @Override // yk.l
    public void onDestroy() {
    }

    @Override // yk.l
    public void onStart() {
    }

    @Override // yk.l
    public void onStop() {
    }

    public void o(@Nullable Drawable drawable) {
    }

    @Deprecated
    public final f<T, Z> s(@IdRes int i11) {
        return this;
    }
}
