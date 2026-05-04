package xl;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a extends RecyclerView.ItemDecoration {

    /* renamed from: e, reason: collision with root package name */
    public static final int f98139e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f98140f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final String f98141g = "LinearDecoration";

    /* renamed from: a, reason: collision with root package name */
    public boolean f98144a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Drawable f98145b;

    /* renamed from: c, reason: collision with root package name */
    public int f98146c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Rect f98147d;

    /* renamed from: i, reason: collision with root package name */
    public static final C1325a f98143i = new C1325a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f98142h = {R.attr.listDivider};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xl.a$a, reason: collision with other inner class name */
    public static final class C1325a {
        public C1325a() {
        }

        public /* synthetic */ C1325a(v vVar) {
            this();
        }
    }

    public a(@k Context context, int i11) {
        g0.q(context, "context");
        this.f98147d = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f98142h);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f98145b = drawable;
        if (drawable == null) {
            Log.w(f98141g, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        setOrientation(i11);
    }

    @k
    public final Rect a() {
        return this.f98147d;
    }

    public final boolean b() {
        return this.f98144a;
    }

    @l
    public final Drawable c() {
        return this.f98145b;
    }

    public final int d() {
        return this.f98146c;
    }

    public abstract void e(@k Canvas canvas, @k RecyclerView recyclerView);

    public abstract void f(@k Canvas canvas, @k RecyclerView recyclerView);

    public final void g(boolean z11) {
        this.f98144a = z11;
    }

    public final void h(@l Drawable drawable) {
        this.f98145b = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@k Canvas c11, @k RecyclerView parent, @k RecyclerView.State state) {
        g0.q(c11, "c");
        g0.q(parent, "parent");
        g0.q(state, "state");
        if (parent.getLayoutManager() == null || this.f98145b == null) {
            return;
        }
        if (d() == 1) {
            f(c11, parent);
        } else {
            e(c11, parent);
        }
    }

    public final void setDrawable(@NonNull @k Drawable drawable) {
        g0.q(drawable, "drawable");
        this.f98145b = drawable;
    }

    public final void setOrientation(int i11) {
        boolean z11 = true;
        if (i11 != 0 && i11 != 1) {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f98146c = i11;
    }
}
