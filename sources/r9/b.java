package r9;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.baicizhan.client.business.util.Redirector;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.online.advertise_api.AdvertiseLoadingItem;
import com.baicizhan.online.advertise_api.AdvertiseLoadingModule;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import r9.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: m, reason: collision with root package name */
    public static final String f83679m = "AdLoader";

    /* renamed from: n, reason: collision with root package name */
    public static final long f83680n = 2000;

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f83681o = true;

    /* renamed from: p, reason: collision with root package name */
    public static final int f83682p = 1000;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f83683a;

    /* renamed from: b, reason: collision with root package name */
    public View f83684b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f83685c;

    /* renamed from: d, reason: collision with root package name */
    public View f83686d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressBar f83687e;

    /* renamed from: f, reason: collision with root package name */
    public e f83688f;

    /* renamed from: g, reason: collision with root package name */
    public long f83689g = 2000;

    /* renamed from: h, reason: collision with root package name */
    public boolean f83690h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f83691i = false;

    /* renamed from: j, reason: collision with root package name */
    public AdvertiseLoadingModule f83692j = AdvertiseLoadingModule.MODULE_MAIN;

    /* renamed from: k, reason: collision with root package name */
    public d f83693k;

    /* renamed from: l, reason: collision with root package name */
    public ValueAnimator f83694l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            b.this.f83687e.setProgress((int) ((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdvertiseLoadingItem f83698a;

        public c(final AdvertiseLoadingItem val$adItem) {
            this.f83698a = val$adItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            Activity activity = (Activity) b.this.f83683a.get();
            if (activity != null && new Redirector(activity).redirect(this.f83698a.getRedirect_info())) {
                activity.finish();
                b.this.f83693k = null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<b> f83700a;

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f83700a.get();
            if (bVar == null || bVar.f83693k == null) {
                return;
            }
            bVar.f83693k.a();
        }

        public e(b loader) {
            this.f83700a = new WeakReference<>(loader);
        }
    }

    public b(Activity activity, View parent) {
        this.f83683a = new WeakReference<>(activity);
        if (parent != null) {
            this.f83684b = parent.findViewById(R.id.ad_content);
            this.f83685c = (ImageView) parent.findViewById(R.id.ad_card);
            this.f83686d = parent.findViewById(R.id.ad_click_rect);
            this.f83687e = (ProgressBar) parent.findViewById(R.id.ad_loading);
        } else {
            this.f83684b = activity.findViewById(R.id.ad_content);
            this.f83685c = (ImageView) activity.findViewById(R.id.ad_card);
            this.f83686d = activity.findViewById(R.id.ad_click_rect);
            this.f83687e = (ProgressBar) activity.findViewById(R.id.ad_loading);
        }
        this.f83687e.setMax(1000);
        r(activity, this.f83687e, 8, activity.getResources().getColor(R.color.main_color_weak_bg), activity.getResources().getColor(R.color.main_color_link_blue));
        this.f83688f = new e();
    }

    public static b i(Activity activity, View parent) {
        return new b(activity, parent);
    }

    public static void r(Context context, ProgressBar pb2, int corner, int bgColor, int pgColor) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ThemeResUtil.ShapeDrawableBuilder().with(context).setColor(bgColor).setCorner(corner).build(), new ClipDrawable(new ThemeResUtil.ShapeDrawableBuilder().with(context).setColor(pgColor).setCorner(corner).build(), 3, 1)});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.progress);
        pb2.setProgressDrawable(layerDrawable);
    }

    public final void g(String desc) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone((ConstraintLayout) this.f83685c.getParent());
        constraintSet.setDimensionRatio(R.id.ad_card, "H," + desc);
        constraintSet.applyTo((ConstraintLayout) this.f83685c.getParent());
    }

    public void h() {
        this.f83684b.removeCallbacks(this.f83688f);
        ValueAnimator valueAnimator = this.f83694l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public b j(boolean enabled) {
        this.f83690h = enabled;
        return this;
    }

    public int k() {
        n(100, 1000);
        return 100;
    }

    public b l() {
        if (this.f83684b.getVisibility() != 0) {
            return this;
        }
        if (this.f83690h) {
            this.f83684b.startAnimation(AnimationUtils.loadAnimation(this.f83684b.getContext(), android.R.anim.fade_out));
        }
        this.f83684b.setVisibility(8);
        return this;
    }

    public b m() {
        AdvertiseLoadingItem e11 = this.f83691i ? null : r9.e.g().e(this.f83692j);
        if (e11 == null) {
            t();
        } else if (!s(e11)) {
            t();
        }
        if (this.f83689g <= 0) {
            this.f83689g = 2000L;
        }
        this.f83684b.postDelayed(this.f83688f, this.f83689g);
        n(this.f83689g, 900);
        return this;
    }

    public final void n(long duration, int to2) {
        ValueAnimator valueAnimator = this.f83694l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f83687e.getProgress(), to2);
        this.f83694l = ofFloat;
        ofFloat.setDuration(duration);
        this.f83694l.setInterpolator(new DecelerateInterpolator());
        this.f83694l.addUpdateListener(new a());
        this.f83694l.start();
    }

    public final void o(final AdvertiseLoadingItem adItem) {
        Activity activity = this.f83683a.get();
        if (activity == null) {
            return;
        }
        int i11 = xb.f.i(activity);
        int f11 = xb.f.f(activity);
        double d11 = i11;
        int i12 = (int) (adItem.btn_x * d11);
        double d12 = f11;
        int i13 = (int) (adItem.btn_y * d12);
        int i14 = (i11 - i12) - ((int) (adItem.btn_w * d11));
        int i15 = (f11 - i13) - ((int) (adItem.btn_h * d12));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f83686d.getLayoutParams();
        layoutParams.setMargins(i12, i13, i14, i15);
        this.f83686d.setLayoutParams(layoutParams);
    }

    public b p(d l11) {
        this.f83693k = l11;
        return this;
    }

    public b q(AdvertiseLoadingModule module) {
        this.f83692j = module;
        return this;
    }

    public final boolean s(final AdvertiseLoadingItem adItem) {
        Activity activity = this.f83683a.get();
        if (activity == null) {
            return false;
        }
        g("1080:1920");
        this.f83685c.setVisibility(0);
        File f11 = r9.e.f(adItem.getImage_url());
        if (f11 == null || !f11.exists() || f11.length() <= 0) {
            return false;
        }
        hc.c.k(f11).h().g(this.f83685c, new C1045b(f11));
        this.f83689g = TimeUnit.MILLISECONDS.convert(adItem.getShow_time(), TimeUnit.SECONDS);
        o(adItem);
        this.f83686d.setOnClickListener(new c(adItem));
        ka.a.o(activity, adItem.ad_name);
        return true;
    }

    public final void t() {
        Activity activity = this.f83683a.get();
        if (activity == null) {
            return;
        }
        g("1125:2000");
        this.f83685c.setVisibility(0);
        try {
            String[] list = activity.getAssets().list("quote_loading");
            if (list == null || list.length == 0) {
                throw new IOException("empty dir");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            hc.c.l("file:///android_asset/quote_loading/" + ((String) arrayList.get(new Random().nextInt(arrayList.size())))).h().o(this.f83685c);
        } catch (IOException e11) {
            qb.c.c(f83679m, "", e11);
        }
    }

    public b u(boolean skip) {
        this.f83691i = skip;
        return this;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r9.b$b, reason: collision with other inner class name */
    public class C1045b implements hc.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f83696a;

        public C1045b(final File val$file) {
            this.f83696a = val$file;
        }

        @Override // hc.d
        public void a(@m80.l Exception e11) {
            qb.c.i(b.f83679m, "Delete " + this.f83696a.getPath() + " because of error. -- " + this.f83696a.delete(), new Object[0]);
            b.this.f83685c.post(new Runnable() { // from class: r9.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C1045b.this.c();
                }
            });
        }

        public final /* synthetic */ void c() {
            b.this.t();
        }

        @Override // hc.d
        public void onSuccess() {
        }
    }
}
