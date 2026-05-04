package com.rd;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.text.TextUtilsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.rd.a;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.PositionSavedState;
import com.rd.draw.data.RtlMode;
import vt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class PageIndicatorView extends View implements ViewPager.OnPageChangeListener, a.InterfaceC0496a, ViewPager.OnAdapterChangeListener, View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public static final Handler f41564f = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public com.rd.a f41565a;

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f41566b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPager f41567c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41568d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f41569e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PageIndicatorView.this.y();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PageIndicatorView.this.f41565a.d().I(true);
            PageIndicatorView.this.k();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41572a;

        static {
            int[] iArr = new int[RtlMode.values().length];
            f41572a = iArr;
            try {
                iArr[RtlMode.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41572a[RtlMode.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41572a[RtlMode.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PageIndicatorView(Context context) {
        super(context);
        this.f41569e = new b();
        l(null);
    }

    private boolean n() {
        int i11 = c.f41572a[this.f41565a.d().n().ordinal()];
        if (i11 != 1) {
            return i11 == 3 && TextUtilsCompat.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        ViewPager viewPager = this.f41567c;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        int count = this.f41567c.getAdapter().getCount();
        int currentItem = n() ? (count - 1) - this.f41567c.getCurrentItem() : this.f41567c.getCurrentItem();
        this.f41565a.d().W(currentItem);
        this.f41565a.d().X(currentItem);
        this.f41565a.d().L(currentItem);
        this.f41565a.d().E(count);
        this.f41565a.b().b();
        z();
        requestLayout();
    }

    @Override // com.rd.a.InterfaceC0496a
    public void b() {
        invalidate();
    }

    public final int f(int i11) {
        int c11 = this.f41565a.d().c() - 1;
        if (i11 < 0) {
            return 0;
        }
        return i11 > c11 ? c11 : i11;
    }

    public void g() {
        wt.a d11 = this.f41565a.d();
        d11.K(false);
        d11.L(-1);
        d11.X(-1);
        d11.W(-1);
        this.f41565a.b().a();
    }

    public long getAnimationDuration() {
        return this.f41565a.d().a();
    }

    public int getCount() {
        return this.f41565a.d().c();
    }

    public int getPadding() {
        return this.f41565a.d().h();
    }

    public int getRadius() {
        return this.f41565a.d().m();
    }

    public float getScaleFactor() {
        return this.f41565a.d().o();
    }

    public int getSelectedColor() {
        return this.f41565a.d().p();
    }

    public int getSelection() {
        return this.f41565a.d().q();
    }

    public int getStrokeWidth() {
        return this.f41565a.d().s();
    }

    public int getUnselectedColor() {
        return this.f41565a.d().t();
    }

    public final void h() {
        animate().cancel();
        animate().alpha(1.0f).setDuration(250L);
    }

    @Nullable
    public final ViewPager i(@NonNull ViewGroup viewGroup, int i11) {
        View findViewById;
        if (viewGroup.getChildCount() > 0 && (findViewById = viewGroup.findViewById(i11)) != null && (findViewById instanceof ViewPager)) {
            return (ViewPager) findViewById;
        }
        return null;
    }

    public final void j(@Nullable ViewParent viewParent) {
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            return;
        }
        ViewPager i11 = i((ViewGroup) viewParent, this.f41565a.d().u());
        if (i11 != null) {
            setViewPager(i11);
        } else {
            j(viewParent.getParent());
        }
    }

    public final void k() {
        animate().cancel();
        animate().alpha(0.0f).setDuration(250L);
    }

    public final void l(@Nullable AttributeSet attributeSet) {
        u();
        m(attributeSet);
        if (this.f41565a.d().y()) {
            v();
        }
    }

    public final void m(@Nullable AttributeSet attributeSet) {
        com.rd.a aVar = new com.rd.a(this);
        this.f41565a = aVar;
        aVar.c().c(getContext(), attributeSet);
        wt.a d11 = this.f41565a.d();
        d11.P(getPaddingLeft());
        d11.R(getPaddingTop());
        d11.Q(getPaddingRight());
        d11.O(getPaddingBottom());
        this.f41568d = d11.A();
    }

    public final boolean o() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
        y();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j(getParent());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        x();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f41565a.c().a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        Pair<Integer, Integer> d11 = this.f41565a.c().d(i11, i12);
        setMeasuredDimension(((Integer) d11.first).intValue(), ((Integer) d11.second).intValue());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i11) {
        if (i11 == 0) {
            this.f41565a.d().K(this.f41568d);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i11, float f11, int i12) {
        p(i11, f11);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i11) {
        q(i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PositionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wt.a d11 = this.f41565a.d();
        PositionSavedState positionSavedState = (PositionSavedState) parcelable;
        d11.W(positionSavedState.b());
        d11.X(positionSavedState.c());
        d11.L(positionSavedState.a());
        super.onRestoreInstanceState(positionSavedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        wt.a d11 = this.f41565a.d();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.e(d11.q());
        positionSavedState.g(d11.r());
        positionSavedState.d(d11.f());
        return positionSavedState;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f41565a.d().y()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            w();
        } else if (action == 1) {
            v();
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f41565a.c().f(motionEvent);
        return true;
    }

    public final void p(int i11, float f11) {
        wt.a d11 = this.f41565a.d();
        AnimationType b11 = d11.b();
        boolean A = d11.A();
        if (o() && A && b11 != AnimationType.NONE) {
            Pair<Integer, Float> e11 = au.a.e(d11, i11, f11, n());
            t(((Integer) e11.first).intValue(), ((Float) e11.second).floatValue());
        }
    }

    public final void q(int i11) {
        wt.a d11 = this.f41565a.d();
        boolean o11 = o();
        int c11 = d11.c();
        if (o11) {
            if (n()) {
                i11 = (c11 - 1) - i11;
            }
            setSelection(i11);
        }
    }

    public final void r() {
        ViewPager viewPager;
        if (this.f41566b != null || (viewPager = this.f41567c) == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f41566b = new a();
        try {
            this.f41567c.getAdapter().registerDataSetObserver(this.f41566b);
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
        }
    }

    public void s() {
        ViewPager viewPager = this.f41567c;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
            this.f41567c.removeOnAdapterChangeListener(this);
            this.f41567c = null;
        }
    }

    public void setAnimationDuration(long j11) {
        this.f41565a.d().B(j11);
    }

    public void setAnimationType(@Nullable AnimationType animationType) {
        this.f41565a.a(null);
        if (animationType != null) {
            this.f41565a.d().C(animationType);
        } else {
            this.f41565a.d().C(AnimationType.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z11) {
        if (!z11) {
            setVisibility(0);
        }
        this.f41565a.d().D(z11);
        z();
    }

    public void setClickListener(@Nullable b.InterfaceC1271b interfaceC1271b) {
        this.f41565a.c().e(interfaceC1271b);
    }

    public void setCount(int i11) {
        if (i11 < 0 || this.f41565a.d().c() == i11) {
            return;
        }
        this.f41565a.d().E(i11);
        z();
        requestLayout();
    }

    public void setDynamicCount(boolean z11) {
        this.f41565a.d().F(z11);
        if (z11) {
            r();
        } else {
            x();
        }
    }

    public void setFadeOnIdle(boolean z11) {
        this.f41565a.d().G(z11);
        if (z11) {
            v();
        } else {
            w();
        }
    }

    public void setIdleDuration(long j11) {
        this.f41565a.d().J(j11);
        if (this.f41565a.d().y()) {
            v();
        } else {
            w();
        }
    }

    public void setInteractiveAnimation(boolean z11) {
        this.f41565a.d().K(z11);
        this.f41568d = z11;
    }

    public void setOrientation(@Nullable Orientation orientation) {
        if (orientation != null) {
            this.f41565a.d().M(orientation);
            requestLayout();
        }
    }

    public void setPadding(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f41565a.d().N(au.b.a(i11));
        invalidate();
    }

    public void setRadius(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f41565a.d().S(au.b.a(i11));
        invalidate();
    }

    public void setRtlMode(@Nullable RtlMode rtlMode) {
        wt.a d11 = this.f41565a.d();
        if (rtlMode == null) {
            d11.T(RtlMode.Off);
        } else {
            d11.T(rtlMode);
        }
        if (this.f41567c == null) {
            return;
        }
        int q11 = d11.q();
        if (n()) {
            q11 = (d11.c() - 1) - q11;
        } else {
            ViewPager viewPager = this.f41567c;
            if (viewPager != null) {
                q11 = viewPager.getCurrentItem();
            }
        }
        d11.L(q11);
        d11.X(q11);
        d11.W(q11);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r3 < 0.3f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setScaleFactor(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto L10
        L8:
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L10
            goto L6
        L10:
            com.rd.a r0 = r2.f41565a
            wt.a r0 = r0.d()
            r0.U(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.setScaleFactor(float):void");
    }

    public void setSelected(int i11) {
        wt.a d11 = this.f41565a.d();
        AnimationType b11 = d11.b();
        d11.C(AnimationType.NONE);
        setSelection(i11);
        d11.C(b11);
    }

    public void setSelectedColor(int i11) {
        this.f41565a.d().V(i11);
        invalidate();
    }

    public void setSelection(int i11) {
        wt.a d11 = this.f41565a.d();
        int f11 = f(i11);
        if (f11 == d11.q() || f11 == d11.r()) {
            return;
        }
        d11.K(false);
        d11.L(d11.q());
        d11.X(f11);
        d11.W(f11);
        this.f41565a.b().a();
    }

    public void setStrokeWidth(float f11) {
        int m11 = this.f41565a.d().m();
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else {
            float f12 = m11;
            if (f11 > f12) {
                f11 = f12;
            }
        }
        this.f41565a.d().Y((int) f11);
        invalidate();
    }

    public void setUnselectedColor(int i11) {
        this.f41565a.d().Z(i11);
        invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(@Nullable ViewPager viewPager) {
        s();
        if (viewPager == null) {
            return;
        }
        this.f41567c = viewPager;
        viewPager.addOnPageChangeListener(this);
        this.f41567c.addOnAdapterChangeListener(this);
        this.f41567c.setOnTouchListener(this);
        this.f41565a.d().a0(this.f41567c.getId());
        setDynamicCount(this.f41565a.d().x());
        y();
    }

    public void t(int i11, float f11) {
        wt.a d11 = this.f41565a.d();
        if (d11.A()) {
            int c11 = d11.c();
            if (c11 <= 0 || i11 < 0) {
                i11 = 0;
            } else {
                int i12 = c11 - 1;
                if (i11 > i12) {
                    i11 = i12;
                }
            }
            if (f11 < 0.0f) {
                f11 = 0.0f;
            } else if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            if (f11 == 1.0f) {
                d11.L(d11.q());
                d11.W(i11);
            }
            d11.X(i11);
            this.f41565a.b().c(f11);
        }
    }

    public final void u() {
        if (getId() == -1) {
            setId(au.c.b());
        }
    }

    public final void v() {
        Handler handler = f41564f;
        handler.removeCallbacks(this.f41569e);
        handler.postDelayed(this.f41569e, this.f41565a.d().e());
    }

    public final void w() {
        f41564f.removeCallbacks(this.f41569e);
        h();
    }

    public final void x() {
        ViewPager viewPager;
        if (this.f41566b == null || (viewPager = this.f41567c) == null || viewPager.getAdapter() == null) {
            return;
        }
        try {
            this.f41567c.getAdapter().unregisterDataSetObserver(this.f41566b);
            this.f41566b = null;
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
        }
    }

    public final void z() {
        if (this.f41565a.d().w()) {
            int c11 = this.f41565a.d().c();
            int visibility = getVisibility();
            if (visibility != 0 && c11 > 1) {
                setVisibility(0);
            } else {
                if (visibility == 4 || c11 > 1) {
                    return;
                }
                setVisibility(4);
            }
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41569e = new b();
        l(attributeSet);
    }

    public void setPadding(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        this.f41565a.d().N((int) f11);
        invalidate();
    }

    public void setRadius(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        this.f41565a.d().S((int) f11);
        invalidate();
    }

    public void setStrokeWidth(int i11) {
        int a11 = au.b.a(i11);
        int m11 = this.f41565a.d().m();
        if (a11 < 0) {
            a11 = 0;
        } else if (a11 > m11) {
            a11 = m11;
        }
        this.f41565a.d().Y(a11);
        invalidate();
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f41569e = new b();
        l(attributeSet);
    }

    @TargetApi(21)
    public PageIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f41569e = new b();
        l(attributeSet);
    }
}
