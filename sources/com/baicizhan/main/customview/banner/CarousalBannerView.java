package com.baicizhan.main.customview.banner;

import a00.r0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.main.customview.banner.CarousalBannerView;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q30.k0;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nCarousalBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarousalBannerView.kt\ncom/baicizhan/main/customview/banner/CarousalBannerView\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,232:1\n1321#2,2:233\n*S KotlinDebug\n*F\n+ 1 CarousalBannerView.kt\ncom/baicizhan/main/customview/banner/CarousalBannerView\n*L\n68#1:233,2\n*E\n"})
/* loaded from: classes4.dex */
public final class CarousalBannerView<T> extends ConstraintLayout implements LifecycleObserver {

    /* renamed from: m, reason: collision with root package name */
    public static final int f20197m = 8;

    /* renamed from: a, reason: collision with root package name */
    public ViewPager2 f20198a;

    /* renamed from: b, reason: collision with root package name */
    public ag.b<T, ?> f20199b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f20200c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f20201d;

    /* renamed from: e, reason: collision with root package name */
    public int f20202e;

    /* renamed from: f, reason: collision with root package name */
    public int f20203f;

    /* renamed from: g, reason: collision with root package name */
    public int f20204g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20205h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20206i;

    /* renamed from: j, reason: collision with root package name */
    public long f20207j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Handler f20208k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Runnable f20209l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CarousalBannerView<T> f20210a;

        public b(CarousalBannerView<T> carousalBannerView) {
            this.f20210a = carousalBannerView;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            if (this.f20210a.u() && i11 == 0) {
                ViewPager2 viewPager2 = null;
                if (this.f20210a.f20203f == 0) {
                    ViewPager2 viewPager22 = this.f20210a.f20198a;
                    if (viewPager22 == null) {
                        g0.S("mViewPager2");
                        viewPager22 = null;
                    }
                    ag.b bVar = this.f20210a.f20199b;
                    if (bVar == null) {
                        g0.S("mAdapter");
                        bVar = null;
                    }
                    viewPager22.setCurrentItem(bVar.getItemCount() - 2, false);
                }
                int i12 = this.f20210a.f20203f;
                ag.b bVar2 = this.f20210a.f20199b;
                if (bVar2 == null) {
                    g0.S("mAdapter");
                    bVar2 = null;
                }
                if (i12 == bVar2.getItemCount() - 1) {
                    ViewPager2 viewPager23 = this.f20210a.f20198a;
                    if (viewPager23 == null) {
                        g0.S("mViewPager2");
                    } else {
                        viewPager2 = viewPager23;
                    }
                    viewPager2.setCurrentItem(1, false);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            this.f20210a.f20203f = i11;
            CarousalBannerView<T> carousalBannerView = this.f20210a;
            carousalBannerView.x(carousalBannerView.f20203f);
            a mPageShowCallback = this.f20210a.getMPageShowCallback();
            if (mPageShowCallback != null) {
                CarousalBannerView<T> carousalBannerView2 = this.f20210a;
                mPageShowCallback.a(carousalBannerView2.q(carousalBannerView2.f20203f));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CarousalBannerView<T> f20211a;

        public c(CarousalBannerView<T> carousalBannerView) {
            this.f20211a = carousalBannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager2 viewPager2 = this.f20211a.f20198a;
            ViewPager2 viewPager22 = null;
            if (viewPager2 == null) {
                g0.S("mViewPager2");
                viewPager2 = null;
            }
            int currentItem = viewPager2.getCurrentItem();
            ViewPager2 viewPager23 = this.f20211a.f20198a;
            if (viewPager23 == null) {
                g0.S("mViewPager2");
            } else {
                viewPager22 = viewPager23;
            }
            viewPager22.setCurrentItem(currentItem + 1);
            this.f20211a.f20208k.postDelayed(this, this.f20211a.getCarousalInterval());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public CarousalBannerView(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    private final void r() {
        View.inflate(getContext(), R.layout.carousal_banner_layout, this);
        View findViewById = findViewById(R.id.banner_viewpager);
        g0.o(findViewById, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById;
        this.f20198a = viewPager2;
        if (viewPager2 == null) {
            g0.S("mViewPager2");
            viewPager2 = null;
        }
        Iterator<T> it = k0.P0(ViewGroupKt.getChildren(viewPager2), new x00.l() { // from class: ag.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean s11;
                s11 = CarousalBannerView.s((View) obj);
                return Boolean.valueOf(s11);
            }
        }).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setNestedScrollingEnabled(false);
        }
        View findViewById2 = findViewById(R.id.indicator_layout);
        g0.o(findViewById2, "findViewById(...)");
        this.f20200c = (LinearLayout) findViewById2;
    }

    public static final boolean s(View it) {
        g0.p(it, "it");
        return it instanceof RecyclerView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@l MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            w();
        } else if ((valueOf != null && valueOf.intValue() == 1) || ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4))) {
            v();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final long getCarousalInterval() {
        return this.f20207j;
    }

    @l
    public final a getMPageShowCallback() {
        return this.f20201d;
    }

    public final void o() {
        ViewPager2 viewPager2 = this.f20198a;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            g0.S("mViewPager2");
            viewPager2 = null;
        }
        ag.b<T, ?> bVar = this.f20199b;
        if (bVar == null) {
            g0.S("mAdapter");
            bVar = null;
        }
        viewPager2.setAdapter(bVar);
        ViewPager2 viewPager23 = this.f20198a;
        if (viewPager23 == null) {
            g0.S("mViewPager2");
            viewPager23 = null;
        }
        viewPager23.registerOnPageChangeCallback(new b(this));
        if (this.f20206i) {
            ViewPager2 viewPager24 = this.f20198a;
            if (viewPager24 == null) {
                g0.S("mViewPager2");
            } else {
                viewPager22 = viewPager24;
            }
            viewPager22.setCurrentItem(1);
        }
        v();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        w();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        v();
    }

    public final void p(@k List<? extends T> data, @k ag.b<T, ?> adapter) {
        g0.p(data, "data");
        g0.p(adapter, "adapter");
        if (data.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f20199b = adapter;
        this.f20202e = data.size();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(data);
        if (this.f20206i && data.size() > 1) {
            arrayList.add(0, r0.u3(data));
            arrayList.add(r0.G2(data));
        }
        ag.b<T, ?> bVar = this.f20199b;
        if (bVar == null) {
            g0.S("mAdapter");
            bVar = null;
        }
        bVar.h(arrayList);
        o();
    }

    public final int q(int i11) {
        if (this.f20206i) {
            if (i11 == 0) {
                return this.f20202e - 1;
            }
            if (i11 == this.f20202e + 1) {
                return 0;
            }
        }
        return i11 - 1;
    }

    public final void setAutoCarousal(boolean z11) {
        this.f20205h = z11;
    }

    public final void setCarousalInterval(long j11) {
        this.f20207j = j11;
    }

    public final void setLoop(boolean z11) {
        this.f20206i = z11;
    }

    public final void setMPageShowCallback(@l a aVar) {
        this.f20201d = aVar;
    }

    public final boolean t() {
        return this.f20205h;
    }

    public final boolean u() {
        return this.f20206i;
    }

    public final void v() {
        w();
        if (!this.f20205h || this.f20202e <= 1) {
            return;
        }
        this.f20208k.postDelayed(this.f20209l, this.f20207j);
    }

    public final void w() {
        this.f20208k.removeCallbacks(this.f20209l);
    }

    public final void x(int i11) {
        LinearLayout linearLayout = null;
        if (this.f20202e <= 1) {
            LinearLayout linearLayout2 = this.f20200c;
            if (linearLayout2 == null) {
                g0.S("mIndicatorLayout");
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.removeAllViews();
            return;
        }
        int q11 = q(i11);
        if (q11 == this.f20204g) {
            return;
        }
        LinearLayout linearLayout3 = this.f20200c;
        if (linearLayout3 == null) {
            g0.S("mIndicatorLayout");
            linearLayout3 = null;
        }
        linearLayout3.removeAllViews();
        int i12 = this.f20202e;
        int i13 = 0;
        while (i13 < i12) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.shape_carousal_indicator_selected);
            imageView.setSelected(i13 == q11);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(i.a(getContext(), 3.0f), 0, i.a(getContext(), 3.0f), 0);
            imageView.setLayoutParams(layoutParams);
            LinearLayout linearLayout4 = this.f20200c;
            if (linearLayout4 == null) {
                g0.S("mIndicatorLayout");
                linearLayout4 = null;
            }
            linearLayout4.addView(imageView);
            i13++;
        }
        this.f20204g = q11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public CarousalBannerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public CarousalBannerView(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f20203f = 1;
        this.f20204g = -1;
        this.f20205h = true;
        this.f20206i = true;
        this.f20207j = 5000L;
        r();
        this.f20208k = new Handler(Looper.getMainLooper());
        this.f20209l = new c(this);
    }

    public /* synthetic */ CarousalBannerView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
