package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import cn.g;
import cn.j;
import cn.m;
import com.google.android.material.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements cn.b, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: p, reason: collision with root package name */
    public static final String f30886p = "CarouselLayoutManager";

    /* renamed from: q, reason: collision with root package name */
    public static final int f30887q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f30888r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f30889s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f30890t = 1;

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public int f30891a;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public int f30892b;

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public int f30893c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30894d;

    /* renamed from: e, reason: collision with root package name */
    public final c f30895e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public g f30896f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public com.google.android.material.carousel.c f30897g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public com.google.android.material.carousel.b f30898h;

    /* renamed from: i, reason: collision with root package name */
    public int f30899i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public Map<Integer, com.google.android.material.carousel.b> f30900j;

    /* renamed from: k, reason: collision with root package name */
    public cn.e f30901k;

    /* renamed from: l, reason: collision with root package name */
    public final View.OnLayoutChangeListener f30902l;

    /* renamed from: m, reason: collision with root package name */
    public int f30903m;

    /* renamed from: n, reason: collision with root package name */
    public int f30904n;

    /* renamed from: o, reason: collision with root package name */
    public int f30905o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends LinearSmoothScroller {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i11) {
            if (CarouselLayoutManager.this.f30897g == null || !CarouselLayoutManager.this.isHorizontal()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.t(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i11) {
            if (CarouselLayoutManager.this.f30897g == null || CarouselLayoutManager.this.isHorizontal()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.t(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        @Nullable
        public PointF computeScrollVectorForPosition(int i11) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f30907a;

        /* renamed from: b, reason: collision with root package name */
        public final float f30908b;

        /* renamed from: c, reason: collision with root package name */
        public final float f30909c;

        /* renamed from: d, reason: collision with root package name */
        public final d f30910d;

        public b(View view, float f11, float f12, d dVar) {
            this.f30907a = view;
            this.f30908b = f11;
            this.f30909c = f12;
            this.f30910d = dVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends RecyclerView.ItemDecoration {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f30911a;

        /* renamed from: b, reason: collision with root package name */
        public List<b.c> f30912b;

        public c() {
            Paint paint = new Paint();
            this.f30911a = paint;
            this.f30912b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void a(List<b.c> list) {
            this.f30912b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.f30911a.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (b.c cVar : this.f30912b) {
                this.f30911a.setColor(ColorUtils.blendARGB(-65281, -16776961, cVar.f30942c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(cVar.f30941b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).K(), cVar.f30941b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).F(), this.f30911a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).H(), cVar.f30941b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).I(), cVar.f30941b, this.f30911a);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final b.c f30913a;

        /* renamed from: b, reason: collision with root package name */
        public final b.c f30914b;

        public d(b.c cVar, b.c cVar2) {
            Preconditions.checkArgument(cVar.f30940a <= cVar2.f30940a);
            this.f30913a = cVar;
            this.f30914b = cVar2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final int f30915a = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f30916b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f30917c = Integer.MIN_VALUE;
    }

    public CarouselLayoutManager() {
        this(new m());
    }

    public static d O(List<b.c> list, float f11, boolean z11) {
        float f12 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        float f13 = -3.4028235E38f;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < list.size(); i15++) {
            b.c cVar = list.get(i15);
            float f16 = z11 ? cVar.f30941b : cVar.f30940a;
            float abs = Math.abs(f16 - f11);
            if (f16 <= f11 && abs <= f12) {
                i11 = i15;
                f12 = abs;
            }
            if (f16 > f11 && abs <= f14) {
                i13 = i15;
                f14 = abs;
            }
            if (f16 <= f15) {
                i12 = i15;
                f15 = f16;
            }
            if (f16 > f13) {
                i14 = i15;
                f13 = f16;
            }
        }
        if (i11 == -1) {
            i11 = i12;
        }
        if (i13 == -1) {
            i13 = i14;
        }
        return new d(list.get(i11), list.get(i13));
    }

    private int convertFocusDirectionToLayoutDirection(int i11) {
        int orientation = getOrientation();
        if (i11 == 1) {
            return -1;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 17) {
            if (orientation == 0) {
                return P() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i11 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 == 66) {
            if (orientation == 0) {
                return P() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i11 == 130) {
            return orientation == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d(f30886p, "Unknown focus request:" + i11);
        return Integer.MIN_VALUE;
    }

    public static /* synthetic */ void e(final CarouselLayoutManager carouselLayoutManager, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        carouselLayoutManager.getClass();
        if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
            return;
        }
        view.post(new Runnable() { // from class: cn.c
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.W();
            }
        });
    }

    private int scrollBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        if (this.f30897g == null) {
            V(recycler);
        }
        int u11 = u(i11, this.f30891a, this.f30892b, this.f30893c);
        this.f30891a += u11;
        e0(this.f30897g);
        float f11 = this.f30898h.f() / 2.0f;
        float r11 = r(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f12 = P() ? this.f30898h.h().f30941b : this.f30898h.a().f30941b;
        float f13 = Float.MAX_VALUE;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            float abs = Math.abs(f12 - U(childAt, r11, f11, rect));
            if (childAt != null && abs < f13) {
                this.f30904n = getPosition(childAt);
                f13 = abs;
            }
            r11 = l(r11, this.f30898h.f());
        }
        w(recycler, state);
        return u11;
    }

    public static int u(int i11, int i12, int i13, int i14) {
        int i15 = i12 + i11;
        return i15 < i13 ? i13 - i12 : i15 > i14 ? i14 - i12 : i11;
    }

    public final com.google.android.material.carousel.b A(int i11) {
        com.google.android.material.carousel.b bVar;
        Map<Integer, com.google.android.material.carousel.b> map = this.f30900j;
        return (map == null || (bVar = map.get(Integer.valueOf(MathUtils.clamp(i11, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f30897g.g() : bVar;
    }

    public final int B() {
        if (getClipToPadding() || !this.f30896f.f()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    public final float C(float f11, d dVar) {
        b.c cVar = dVar.f30913a;
        float f12 = cVar.f30943d;
        b.c cVar2 = dVar.f30914b;
        return vm.b.b(f12, cVar2.f30943d, cVar.f30941b, cVar2.f30941b, f11);
    }

    public int D(int i11, @NonNull com.google.android.material.carousel.b bVar) {
        return M(i11, bVar) - this.f30891a;
    }

    public int E(int i11, boolean z11) {
        int D = D(i11, this.f30897g.k(this.f30891a, this.f30892b, this.f30893c, true));
        int D2 = this.f30900j != null ? D(i11, A(i11)) : D;
        return (!z11 || Math.abs(D2) >= Math.abs(D)) ? D : D2;
    }

    public final int F() {
        return this.f30901k.h();
    }

    public final int G() {
        return this.f30901k.i();
    }

    public final int H() {
        return this.f30901k.j();
    }

    public final int I() {
        return this.f30901k.k();
    }

    public final int J() {
        return this.f30901k.l();
    }

    public final int K() {
        return this.f30901k.m();
    }

    public final int L() {
        if (getClipToPadding() || !this.f30896f.f()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    public final int M(int i11, com.google.android.material.carousel.b bVar) {
        return P() ? (int) (((x() - bVar.h().f30940a) - (i11 * bVar.f())) - (bVar.f() / 2.0f)) : (int) (((i11 * bVar.f()) - bVar.a().f30940a) + (bVar.f() / 2.0f));
    }

    public final int N(int i11, @NonNull com.google.android.material.carousel.b bVar) {
        int i12 = Integer.MAX_VALUE;
        for (b.c cVar : bVar.e()) {
            float f11 = (i11 * bVar.f()) + (bVar.f() / 2.0f);
            int x11 = (P() ? (int) ((x() - cVar.f30940a) - f11) : (int) (f11 - cVar.f30940a)) - this.f30891a;
            if (Math.abs(i12) > Math.abs(x11)) {
                i12 = x11;
            }
        }
        return i12;
    }

    public boolean P() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    public final boolean Q(float f11, d dVar) {
        float m11 = m(f11, C(f11, dVar) / 2.0f);
        return P() ? m11 < 0.0f : m11 > ((float) x());
    }

    public final boolean R(float f11, d dVar) {
        float l11 = l(f11, C(f11, dVar) / 2.0f);
        return P() ? l11 > ((float) x()) : l11 < 0.0f;
    }

    public final void S() {
        if (this.f30894d && Log.isLoggable(f30886p, 3)) {
            Log.d(f30886p, "internal representation of views on the screen");
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                Log.d(f30886p, "item position " + getPosition(childAt) + ", center:" + y(childAt) + ", child index:" + i11);
            }
            Log.d(f30886p, "==============");
        }
    }

    public final b T(RecyclerView.Recycler recycler, float f11, int i11) {
        View viewForPosition = recycler.getViewForPosition(i11);
        measureChildWithMargins(viewForPosition, 0, 0);
        float l11 = l(f11, this.f30898h.f() / 2.0f);
        d O = O(this.f30898h.g(), l11, false);
        return new b(viewForPosition, l11, q(viewForPosition, l11, O), O);
    }

    public final float U(View view, float f11, float f12, Rect rect) {
        float l11 = l(f11, f12);
        d O = O(this.f30898h.g(), l11, false);
        float q11 = q(view, l11, O);
        super.getDecoratedBoundsWithMargins(view, rect);
        d0(view, l11, O);
        this.f30901k.p(view, rect, f12, q11);
        return q11;
    }

    public final void V(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        com.google.android.material.carousel.b g11 = this.f30896f.g(this, viewForPosition);
        if (P()) {
            g11 = com.google.android.material.carousel.b.n(g11, x());
        }
        this.f30897g = com.google.android.material.carousel.c.f(this, g11, z(), B(), L());
    }

    public final void W() {
        this.f30897g = null;
        requestLayout();
    }

    public final void X(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float y11 = y(childAt);
            if (!R(y11, O(this.f30898h.g(), y11, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float y12 = y(childAt2);
            if (!Q(y12, O(this.f30898h.g(), y12, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
    }

    public final void Y(RecyclerView recyclerView, int i11) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i11, 0);
        } else {
            recyclerView.scrollBy(0, i11);
        }
    }

    public void Z(int i11) {
        this.f30905o = i11;
        W();
    }

    @Override // cn.b
    public int a() {
        return getHeight();
    }

    public final void a0(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            Z(obtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // cn.b
    public int b() {
        return getWidth();
    }

    public void b0(@NonNull g gVar) {
        this.f30896f = gVar;
        W();
    }

    @Override // cn.b
    public int c() {
        return this.f30905o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void c0(@NonNull RecyclerView recyclerView, boolean z11) {
        this.f30894d = z11;
        recyclerView.removeItemDecoration(this.f30895e);
        if (z11) {
            recyclerView.addItemDecoration(this.f30895e);
        }
        recyclerView.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f30897g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f30897g.g().f() / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f30891a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.f30893c - this.f30892b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i11) {
        if (this.f30897g == null) {
            return null;
        }
        int D = D(i11, A(i11));
        return isHorizontal() ? new PointF(D, 0.0f) : new PointF(0.0f, D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f30897g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f30897g.g().f() / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f30891a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.f30893c - this.f30892b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(View view, float f11, d dVar) {
        if (view instanceof j) {
            b.c cVar = dVar.f30913a;
            float f12 = cVar.f30942c;
            b.c cVar2 = dVar.f30914b;
            float b11 = vm.b.b(f12, cVar2.f30942c, cVar.f30940a, cVar2.f30940a, f11);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF g11 = this.f30901k.g(height, width, vm.b.b(0.0f, height / 2.0f, 0.0f, 1.0f, b11), vm.b.b(0.0f, width / 2.0f, 0.0f, 1.0f, b11));
            float q11 = q(view, f11, dVar);
            RectF rectF = new RectF(q11 - (g11.width() / 2.0f), q11 - (g11.height() / 2.0f), q11 + (g11.width() / 2.0f), (g11.height() / 2.0f) + q11);
            RectF rectF2 = new RectF(H(), K(), I(), F());
            if (this.f30896f.f()) {
                this.f30901k.a(g11, rectF, rectF2);
            }
            this.f30901k.o(g11, rectF, rectF2);
            ((j) view).setMaskRectF(g11);
        }
    }

    public final void e0(@NonNull com.google.android.material.carousel.c cVar) {
        int i11 = this.f30893c;
        int i12 = this.f30892b;
        if (i11 <= i12) {
            this.f30898h = P() ? cVar.h() : cVar.l();
        } else {
            this.f30898h = cVar.j(this.f30891a, i12, i11);
        }
        this.f30895e.a(this.f30898h.g());
    }

    public final void f0() {
        int itemCount = getItemCount();
        int i11 = this.f30903m;
        if (itemCount == i11 || this.f30897g == null) {
            return;
        }
        if (this.f30896f.j(this, i11)) {
            W();
        }
        this.f30903m = itemCount;
    }

    public final void g0() {
        if (!this.f30894d || getChildCount() < 1) {
            return;
        }
        int i11 = 0;
        while (i11 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i11));
            int i12 = i11 + 1;
            int position2 = getPosition(getChildAt(i12));
            if (position > position2) {
                S();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i11 + "] had adapter position [" + position + "] and child at index [" + i12 + "] had adapter position [" + position2 + "].");
            }
            i11 = i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final View getChildClosestToEnd() {
        return getChildAt(P() ? 0 : getChildCount() - 1);
    }

    public final View getChildClosestToStart() {
        return getChildAt(P() ? getChildCount() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (isHorizontal()) {
            centerY = rect.centerX();
        }
        float C = C(centerY, O(this.f30898h.g(), centerY, true));
        float width = isHorizontal() ? (rect.width() - C) / 2.0f : 0.0f;
        float height = isHorizontal() ? 0.0f : (rect.height() - C) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public int getOrientation() {
        return this.f30901k.f9270a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // cn.b
    public boolean isHorizontal() {
        return this.f30901k.f9270a == 0;
    }

    public final void k(View view, int i11, b bVar) {
        float f11 = this.f30898h.f() / 2.0f;
        addView(view, i11);
        float f12 = bVar.f30909c;
        this.f30901k.n(view, (int) (f12 - f11), (int) (f12 + f11));
        d0(view, bVar.f30908b, bVar.f30910d);
    }

    public final float l(float f11, float f12) {
        return P() ? f11 - f12 : f11 + f12;
    }

    public final float m(float f11, float f12) {
        return P() ? f11 + f12 : f11 - f12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i11, int i12) {
        if (!(view instanceof j)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i13 = i11 + rect.left + rect.right;
        int i14 = i12 + rect.top + rect.bottom;
        com.google.android.material.carousel.c cVar = this.f30897g;
        float f11 = (cVar == null || this.f30901k.f9270a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : cVar.g().f();
        com.google.android.material.carousel.c cVar2 = this.f30897g;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i13, (int) f11, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i14, (int) ((cVar2 == null || this.f30901k.f9270a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : cVar2.g().f()), canScrollVertically()));
    }

    public final void n(@NonNull RecyclerView.Recycler recycler, int i11, int i12) {
        if (i11 < 0 || i11 >= getItemCount()) {
            return;
        }
        b T = T(recycler, r(i11), i11);
        k(T.f30907a, i12, T);
    }

    public final void o(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        float r11 = r(i11);
        while (i11 < state.getItemCount()) {
            b T = T(recycler, r11, i11);
            if (Q(T.f30909c, T.f30910d)) {
                return;
            }
            r11 = l(r11, this.f30898h.f());
            if (!R(T.f30909c, T.f30910d)) {
                k(T.f30907a, -1, T);
            }
            i11++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f30896f.e(recyclerView.getContext());
        W();
        recyclerView.addOnLayoutChangeListener(this.f30902l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.f30902l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view, int i11, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            n(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        n(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsAdded(recyclerView, i11, i12);
        f0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsRemoved(recyclerView, i11, i12);
        f0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0 || x() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.f30899i = 0;
            return;
        }
        boolean P = P();
        boolean z11 = this.f30897g == null;
        if (z11) {
            V(recycler);
        }
        int v11 = v(this.f30897g);
        int s11 = s(state, this.f30897g);
        this.f30892b = P ? s11 : v11;
        if (P) {
            s11 = v11;
        }
        this.f30893c = s11;
        if (z11) {
            this.f30891a = v11;
            this.f30900j = this.f30897g.i(getItemCount(), this.f30892b, this.f30893c, P());
            int i11 = this.f30904n;
            if (i11 != -1) {
                this.f30891a = M(i11, A(i11));
            }
        }
        int i12 = this.f30891a;
        this.f30891a = i12 + u(0, i12, this.f30892b, this.f30893c);
        this.f30899i = MathUtils.clamp(this.f30899i, 0, state.getItemCount());
        e0(this.f30897g);
        detachAndScrapAttachedViews(recycler);
        w(recycler, state);
        this.f30903m = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.f30899i = 0;
        } else {
            this.f30899i = getPosition(getChildAt(0));
        }
        g0();
    }

    public final void p(RecyclerView.Recycler recycler, int i11) {
        float r11 = r(i11);
        while (i11 >= 0) {
            b T = T(recycler, r11, i11);
            if (R(T.f30909c, T.f30910d)) {
                return;
            }
            r11 = m(r11, this.f30898h.f());
            if (!Q(T.f30909c, T.f30910d)) {
                k(T.f30907a, 0, T);
            }
            i11--;
        }
    }

    public final float q(View view, float f11, d dVar) {
        b.c cVar = dVar.f30913a;
        float f12 = cVar.f30941b;
        b.c cVar2 = dVar.f30914b;
        float b11 = vm.b.b(f12, cVar2.f30941b, cVar.f30940a, cVar2.f30940a, f11);
        if (dVar.f30914b != this.f30898h.c() && dVar.f30913a != this.f30898h.j()) {
            return b11;
        }
        float f13 = this.f30901k.f((RecyclerView.LayoutParams) view.getLayoutParams()) / this.f30898h.f();
        b.c cVar3 = dVar.f30914b;
        return b11 + ((f11 - cVar3.f30940a) * ((1.0f - cVar3.f30942c) + f13));
    }

    public final float r(int i11) {
        return l(J() - this.f30891a, this.f30898h.f() * i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
        int N;
        if (this.f30897g == null || (N = N(getPosition(view), A(getPosition(view)))) == 0) {
            return false;
        }
        Y(recyclerView, N(getPosition(view), this.f30897g.j(this.f30891a + u(N, this.f30891a, this.f30892b, this.f30893c), this.f30892b, this.f30893c)));
        return true;
    }

    public final int s(RecyclerView.State state, com.google.android.material.carousel.c cVar) {
        boolean P = P();
        com.google.android.material.carousel.b l11 = P ? cVar.l() : cVar.h();
        b.c a11 = P ? l11.a() : l11.h();
        int itemCount = (int) (((((state.getItemCount() - 1) * l11.f()) * (P ? -1.0f : 1.0f)) - (a11.f30940a - J())) + (G() - a11.f30940a) + (P ? -a11.f30946g : a11.f30947h));
        return P ? Math.min(0, itemCount) : Math.max(0, itemCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i11, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i11) {
        this.f30904n = i11;
        if (this.f30897g == null) {
            return;
        }
        this.f30891a = M(i11, A(i11));
        this.f30899i = MathUtils.clamp(i11, 0, Math.max(0, getItemCount() - 1));
        e0(this.f30897g);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i11, recycler, state);
        }
        return 0;
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        assertNotInLayoutOrScroll(null);
        cn.e eVar = this.f30901k;
        if (eVar == null || i11 != eVar.f9270a) {
            this.f30901k = cn.e.c(this, i11);
            W();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i11);
        startSmoothScroll(aVar);
    }

    public int t(int i11) {
        return (int) (this.f30891a - M(i11, A(i11)));
    }

    public final int v(@NonNull com.google.android.material.carousel.c cVar) {
        boolean P = P();
        com.google.android.material.carousel.b h11 = P ? cVar.h() : cVar.l();
        return (int) (J() - m((P ? h11.h() : h11.a()).f30940a, h11.f() / 2.0f));
    }

    public final void w(RecyclerView.Recycler recycler, RecyclerView.State state) {
        X(recycler);
        if (getChildCount() == 0) {
            p(recycler, this.f30899i - 1);
            o(recycler, state, this.f30899i);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            p(recycler, position - 1);
            o(recycler, state, position2 + 1);
        }
        g0();
    }

    public final int x() {
        return isHorizontal() ? b() : a();
    }

    public final float y(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return isHorizontal() ? r0.centerX() : r0.centerY();
    }

    public final int z() {
        int i11;
        int i12;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.f30901k.f9270a == 0) {
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i11 + i12;
    }

    public CarouselLayoutManager(@NonNull g gVar) {
        this(gVar, 0);
    }

    public CarouselLayoutManager(@NonNull g gVar, int i11) {
        this.f30894d = false;
        this.f30895e = new c();
        this.f30899i = 0;
        this.f30902l = new View.OnLayoutChangeListener() { // from class: cn.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.e(CarouselLayoutManager.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f30904n = -1;
        this.f30905o = 0;
        b0(gVar);
        setOrientation(i11);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f30894d = false;
        this.f30895e = new c();
        this.f30899i = 0;
        this.f30902l = new View.OnLayoutChangeListener() { // from class: cn.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i122, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.e(CarouselLayoutManager.this, view, i122, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f30904n = -1;
        this.f30905o = 0;
        b0(new m());
        a0(context, attributeSet);
    }
}
