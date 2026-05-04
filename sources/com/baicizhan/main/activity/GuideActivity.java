package com.baicizhan.main.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import c10.d;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.GuideActivity;
import com.jiongji.andriod.card.R;
import gi.e;
import gs.t0;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q9.x;
import u30.f0;
import w00.o;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GuideActivity extends BaseAppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f17939a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f17940b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final String f17941c = GuideActivity.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f17942d = "home_tab";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f17943e = "user_guide";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f17944f = "url";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f17945g = "login_flag";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f17946h = "guide";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f17947i = "guide_long";

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final String f17948j = ".jpg";

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final String f17949k = ".png";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideActivity.kt\ncom/baicizhan/main/activity/GuideActivity$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,274:1\n13805#2,2:275\n*S KotlinDebug\n*F\n+ 1 GuideActivity.kt\ncom/baicizhan/main/activity/GuideActivity$Companion\n*L\n248#1:275,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ void h(a aVar, Context context, int i11, boolean z11, String str, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z11 = false;
            }
            if ((i12 & 8) != 0) {
                str = "";
            }
            aVar.g(context, i11, z11, str);
        }

        @o
        @k
        public final String b() {
            return "guide_version_" + fs.b.f52356f;
        }

        @o
        public final boolean c(@k Context context) {
            g0.p(context, "context");
            return d(context, GuideActivity.f17947i) || d(context, GuideActivity.f17946h);
        }

        public final boolean d(Context context, String str) {
            String[] list = context.getAssets().list(str);
            if (list == null) {
                return false;
            }
            boolean z11 = false;
            for (String str2 : list) {
                Log.d("GuideActivity", "file: " + str2);
                a aVar = GuideActivity.f17939a;
                g0.m(str2);
                if (aVar.e(str2)) {
                    z11 = true;
                }
            }
            return z11;
        }

        public final boolean e(String str) {
            return f0.a2(str, ".jpg", true) || f0.a2(str, GuideActivity.f17949k, true);
        }

        @o
        public final void f(@k Context context, int i11) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) GuideActivity.class);
            intent.putExtra(GuideActivity.f17945g, i11);
            context.startActivity(intent);
        }

        @o
        public final void g(@k Context context, int i11, boolean z11, @k String url) {
            g0.p(context, "context");
            g0.p(url, "url");
            Intent intent = new Intent(context, (Class<?>) GuideActivity.class);
            intent.putExtra(GuideActivity.f17942d, i11);
            intent.putExtra(GuideActivity.f17943e, z11);
            intent.putExtra("url", url);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideActivity.kt\ncom/baicizhan/main/activity/GuideActivity$GuideAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,274:1\n13805#2,2:275\n*S KotlinDebug\n*F\n+ 1 GuideActivity.kt\ncom/baicizhan/main/activity/GuideActivity$GuideAdapter\n*L\n132#1:275,2\n*E\n"})
    public final class b extends PagerAdapter {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList<String> f17950a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Point f17951b;

        public b() {
            this.f17951b = new Point(f.i(GuideActivity.this), f.f(GuideActivity.this));
            if (a(GuideActivity.this, this, gi.k.n(GuideActivity.this, 0.0f, 2, null) ? GuideActivity.f17947i : GuideActivity.f17946h) || a(GuideActivity.this, this, GuideActivity.f17947i)) {
                return;
            }
            a(GuideActivity.this, this, GuideActivity.f17946h);
        }

        public static final boolean a(GuideActivity guideActivity, b bVar, String str) {
            String[] list = guideActivity.getAssets().list(str);
            if (list != null) {
                for (String str2 : list) {
                    a aVar = GuideActivity.f17939a;
                    g0.m(str2);
                    if (aVar.e(str2)) {
                        bVar.f17950a.add(str + File.separator + str2);
                    }
                }
            }
            return !bVar.f17950a.isEmpty();
        }

        public final int b(@k BitmapFactory.Options options, int i11, int i12) {
            g0.p(options, "options");
            int i13 = options.outHeight;
            int i14 = options.outWidth;
            if (i13 > i12 || i14 > i11) {
                return i14 > i13 ? d.L0(i13 / i12) : d.L0(i14 / i11);
            }
            return 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@k ViewGroup container, int i11, @k Object object) {
            g0.p(container, "container");
            g0.p(object, "object");
            container.removeView((View) object);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f17950a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @k
        public Object instantiateItem(@k ViewGroup container, int i11) {
            g0.p(container, "container");
            ImageView imageView = new ImageView(container.getContext());
            GuideActivity guideActivity = GuideActivity.this;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(guideActivity.getAssets().open(this.f17950a.get(i11)), null, options);
            Point point = this.f17951b;
            options.inSampleSize = b(options, point.x, point.y);
            options.inJustDecodeBounds = false;
            imageView.setImageBitmap(BitmapFactory.decodeStream(guideActivity.getAssets().open(this.f17950a.get(i11)), null, options));
            container.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            return imageView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@k View view, @k Object object) {
            g0.p(view, "view");
            g0.p(object, "object");
            return g0.g(view, object);
        }
    }

    private final void K0() {
        ia.a.i(f17939a.b(), true);
        P0();
    }

    @o
    @k
    public static final String L0() {
        return f17939a.b();
    }

    @o
    public static final boolean M0(@k Context context) {
        return f17939a.c(context);
    }

    public static final void N0(GuideActivity guideActivity, View view) {
        guideActivity.K0();
    }

    public static final void O0(GuideActivity guideActivity, View view) {
        guideActivity.K0();
    }

    private final void P0() {
        int intExtra = getIntent().getIntExtra(f17945g, 0);
        if (intExtra == 1) {
            e.o(this, false);
            finish();
        } else {
            if (intExtra == 2) {
                startActivity(new Intent(this, (Class<?>) IntroductionPageActivity.class));
                finish();
                return;
            }
            qb.c.d(f17941c, "ERROR InitializationObservables type: " + intExtra, new Object[0]);
        }
    }

    @o
    public static final void Q0(@k Context context, int i11) {
        f17939a.f(context, i11);
    }

    @o
    public static final void R0(@k Context context, int i11, boolean z11, @k String str) {
        f17939a.g(context, i11, z11, str);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableCustomSystemBar() {
        return true;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (x.r().c(this)) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1280);
        t0 c11 = t0.c(getLayoutInflater());
        c11.f56811c.setPageMargin(getResources().getDimensionPixelSize(R.dimen.startup_guide_pic_padding));
        c11.f56811c.setAdapter(new b());
        c11.f56811c.setOffscreenPageLimit(2);
        c11.f56811c.addOnPageChangeListener(new c(c11));
        c11.f56812d.setOnClickListener(new View.OnClickListener() { // from class: fd.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity.N0(GuideActivity.this, view);
            }
        });
        c11.f56813e.setOnClickListener(new View.OnClickListener() { // from class: fd.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity.O0(GuideActivity.this, view);
            }
        });
        PagerAdapter adapter = c11.f56811c.getAdapter();
        if (adapter != null && adapter.getCount() == 1) {
            c11.f56813e.setAlpha(1.0f);
        }
        TextView textView = c11.f56813e;
        textView.setEnabled(textView.getAlpha() == 1.0f);
        setContentView(c11.getRoot());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ViewPager.OnPageChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t0 f17953a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t0 f17954a;

            public a(t0 t0Var) {
                this.f17954a = t0Var;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                g0.p(animation, "animation");
                super.onAnimationEnd(animation);
                TextView textView = this.f17954a.f56813e;
                textView.setEnabled(textView.getAlpha() == 1.0f);
            }
        }

        public c(t0 t0Var) {
            this.f17953a = t0Var;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            ViewPropertyAnimator animate = this.f17953a.f56813e.animate();
            PagerAdapter adapter = this.f17953a.f56811c.getAdapter();
            g0.m(adapter);
            ViewPropertyAnimator alpha = animate.alpha(i11 == adapter.getCount() + (-1) ? 1.0f : 0.0f);
            PagerAdapter adapter2 = this.f17953a.f56811c.getAdapter();
            g0.m(adapter2);
            alpha.setDuration(i11 == adapter2.getCount() + (-1) ? 300L : 150L).setListener(new a(this.f17953a)).start();
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float f11, int i12) {
        }
    }
}
