package r9;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.baicizhan.client.business.managers.ad.entity.Action;
import com.baicizhan.client.business.managers.ad.entity.AdItem;
import com.baicizhan.client.business.managers.ad.view.SplashVideoView;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.online.ad_property.AdExtraResp;
import com.baicizhan.online.ad_property.AdLunchApp;
import com.baicizhan.online.advertise_api.StartupAd;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import r9.j;
import ub.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class p {

    /* renamed from: s, reason: collision with root package name */
    public static final String f83784s = "OwnAdMgr";

    /* renamed from: t, reason: collision with root package name */
    public static volatile p f83785t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final String f83786u = "own_ad_time_current_";

    /* renamed from: v, reason: collision with root package name */
    public static final String f83787v = "own_ad_list";

    /* renamed from: w, reason: collision with root package name */
    public static final int f83788w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final String f83789x = "OwnAdImg/";

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<View> f83790a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<TextView> f83791b;

    /* renamed from: e, reason: collision with root package name */
    public q f83794e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference<v> f83795f;

    /* renamed from: g, reason: collision with root package name */
    public List<AdItem> f83796g;

    /* renamed from: j, reason: collision with root package name */
    public qb0.h f83799j;

    /* renamed from: k, reason: collision with root package name */
    public int f83800k;

    /* renamed from: l, reason: collision with root package name */
    public int f83801l;

    /* renamed from: r, reason: collision with root package name */
    public SplashVideoView f83807r;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83792c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f83793d = false;

    /* renamed from: h, reason: collision with root package name */
    public String f83797h = null;

    /* renamed from: i, reason: collision with root package name */
    public AdItem f83798i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f83802m = false;

    /* renamed from: n, reason: collision with root package name */
    public float f83803n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public float f83804o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f83805p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f83806q = 0.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends bp.a<List<AdItem>> {
        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent event) {
            int action = event.getAction();
            if (action == 0) {
                p.this.f83803n = event.getX();
                p.this.f83804o = event.getY();
            } else if (action != 1) {
                return false;
            }
            p.this.f83805p = event.getX();
            p.this.f83806q = event.getY();
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends sa.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Action f83810a;

        public c(final Action val$action) {
            this.f83810a = val$action;
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            if (p.this.f83792c || p.this.f83802m) {
                return;
            }
            j.a aVar = j.f83727a;
            Context context = v11.getContext();
            int i11 = this.f83810a.jump_type;
            AdExtraResp adExtraResp = p.this.f83798i.extraResp;
            p pVar = p.this;
            if (!aVar.e(context, i11, adExtraResp, aVar.b(pVar.f83803n, pVar.f83804o, pVar.f83805p, pVar.f83806q))) {
                p.this.r(v11.getContext());
                return;
            }
            p.this.f83802m = true;
            v vVar = (v) p.this.f83795f.get();
            if (vVar == null) {
                return;
            }
            vVar.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements SplashVideoView.b {
        public d() {
        }

        @Override // com.baicizhan.client.business.managers.ad.view.SplashVideoView.b
        public void onCompleted() {
            qb.c.i(p.f83784s, "Video completed", new Object[0]);
            if (p.this.f83794e != null) {
                p.this.f83794e.a(true);
            }
        }

        @Override // com.baicizhan.client.business.managers.ad.view.SplashVideoView.b
        public void onError() {
            qb.c.d(p.f83784s, "Video error", new Object[0]);
            if (p.this.f83794e != null) {
                p.this.f83794e.a(false);
            }
        }

        @Override // com.baicizhan.client.business.managers.ad.view.SplashVideoView.b
        public void onPrepared() {
            if (p.this.f83791b != null && p.this.f83791b.get() != null) {
                ((TextView) p.this.f83791b.get()).setVisibility(0);
            }
            if (p.this.f83800k > 0) {
                p.this.L();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements bl.f<Drawable> {
        public e() {
        }

        @Override // bl.f
        public boolean a(@Nullable GlideException e11, Object model, cl.p<Drawable> target, boolean isFirstResource) {
            qb.c.c(p.f83784s, "Image load failed", e11);
            p.this.t();
            if (p.this.f83794e != null) {
                p.this.f83794e.a(false);
            }
            return false;
        }

        @Override // bl.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(Drawable resource, Object model, cl.p<Drawable> target, DataSource dataSource, boolean isFirstResource) {
            p.this.L();
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends bp.a<List<AdItem>> {
        public g() {
        }
    }

    public static /* synthetic */ Boolean b(File file, File file2, AdItem adItem) {
        try {
            try {
                ub.a a11 = new a.b().a();
                a11.D(3000);
                a11.G(5000);
                a11.F(2);
                a11.H(adItem.img);
                a11.E(file.getAbsolutePath());
                if (!a11.I() || !file.exists() || file.length() <= 0) {
                    qb.c.i(f83784s, "Download failed %d, %s", Integer.valueOf(a11.r()), adItem.img);
                    Boolean bool = Boolean.FALSE;
                    if (file.exists()) {
                        file.delete();
                    }
                    return bool;
                }
                if (file.renameTo(file2)) {
                    qb.c.i(f83784s, "Ad downloaded %s %s -> %s", adItem.extraId, adItem.img, file2.getAbsolutePath());
                    Boolean bool2 = Boolean.TRUE;
                    if (file.exists()) {
                        file.delete();
                    }
                    return bool2;
                }
                qb.c.d(f83784s, "Failed to rename temp file to final file", new Object[0]);
                Boolean bool3 = Boolean.FALSE;
                if (file.exists()) {
                    file.delete();
                }
                return bool3;
            } catch (Exception e11) {
                qb.c.c(f83784s, "Download failed", e11);
                Boolean bool4 = Boolean.FALSE;
                if (file.exists()) {
                    file.delete();
                }
                return bool4;
            }
        } catch (Throwable th2) {
            if (file.exists()) {
                file.delete();
            }
            throw th2;
        }
    }

    public static /* synthetic */ void c(File file, Boolean bool) {
        qb.c.b(f83784s, "download success:" + bool, new Object[0]);
        if (bool.booleanValue() || !file.exists()) {
            return;
        }
        file.delete();
    }

    public static /* synthetic */ void d(File file, File file2, Throwable th2) {
        qb.c.c(f83784s, "Download error", th2);
        if (file.exists()) {
            file.delete();
        }
        if (file2.exists()) {
            file2.delete();
        }
    }

    public static p y() {
        if (f83785t == null) {
            synchronized (p.class) {
                try {
                    if (f83785t == null) {
                        f83785t = new p();
                    }
                } finally {
                }
            }
        }
        return f83785t;
    }

    public final void A() {
        qb.c.i(f83784s, "GOGOGO", new Object[0]);
        if (this.f83794e != null) {
            SplashVideoView splashVideoView = this.f83807r;
            if (splashVideoView != null) {
                splashVideoView.w();
                this.f83807r.t();
                this.f83807r = null;
            }
            this.f83792c = true;
            this.f83794e.a(true);
            this.f83794e = null;
        }
    }

    public void B() {
        this.f83792c = false;
        this.f83802m = false;
        this.f83793d = false;
        this.f83797h = null;
        this.f83800k = 5;
        this.f83801l = 0;
        String b11 = i9.g.c().b(f83787v);
        try {
            this.f83796g = (List) new com.google.gson.d().o(b11, new a().getType());
            C();
        } catch (Exception e11) {
            qb.c.h(f83784s, "", e11);
        }
        qb.c.i(f83784s, "[count, list] [%d, %s]", Integer.valueOf(this.f83800k), b11);
        if (this.f83796g == null) {
            this.f83796g = new ArrayList();
        }
    }

    public final void C() {
        this.f83797h = null;
        this.f83800k = 5;
        if (xb.e.h(this.f83796g)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AdItem adItem : this.f83796g) {
            if (adItem.isShow() && !D(adItem)) {
                arrayList.add(adItem);
            }
        }
        if (xb.e.h(arrayList)) {
            qb.c.i(f83784s, "NO AD", new Object[0]);
            return;
        }
        int nextInt = new Random(System.currentTimeMillis()).nextInt(arrayList.size());
        qb.c.i(f83784s, "POOL size %d, random idx %d", Integer.valueOf(arrayList.size()), Integer.valueOf(nextInt));
        this.f83797h = ((AdItem) arrayList.get(nextInt)).extraId;
        this.f83800k = ((AdItem) arrayList.get(nextInt)).show_seconds;
        this.f83801l = ((AdItem) arrayList.get(nextInt)).show_times;
        this.f83798i = (AdItem) arrayList.get(nextInt);
    }

    public final boolean D(AdItem adItem) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f83786u);
        sb2.append(adItem.extraId);
        return r9.a.a(sb2.toString()) >= adItem.show_times;
    }

    public boolean E() {
        if (this.f83797h != null && this.f83798i != null) {
            int a11 = r9.a.a(f83786u + this.f83797h);
            int i11 = this.f83801l;
            if (i11 > 0 && i11 >= a11) {
                File x11 = x(this.f83798i.img.hashCode());
                String str = this.f83798i.img;
                if (str != null && !TextUtils.isEmpty(str) && (x11 == null || !x11.exists())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ void F(View view) {
        w();
    }

    public void G() {
        t();
        SplashVideoView splashVideoView = this.f83807r;
        if (splashVideoView != null) {
            splashVideoView.r();
        }
    }

    public final void H() {
        if (xb.e.h(this.f83796g)) {
            return;
        }
        Iterator<AdItem> it = this.f83796g.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public final void I() {
        int i11 = this.f83800k - 1;
        this.f83800k = i11;
        qb.c.i(f83784s, "count down %d", Integer.valueOf(i11));
        int i12 = this.f83800k;
        if (i12 > 0) {
            J(i12);
        } else {
            t();
            A();
        }
    }

    public final void J(int count) {
        TextView textView = this.f83791b.get();
        if (textView != null) {
            textView.setText(textView.getContext().getString(R.string.own_splash_ad_skip, Integer.valueOf(count)));
        }
    }

    public void K() {
        if (this.f83802m) {
            A();
            return;
        }
        if (this.f83793d) {
            if (this.f83798i.show_seconds > 0) {
                L();
            }
            SplashVideoView splashVideoView = this.f83807r;
            if (splashVideoView != null) {
                splashVideoView.u();
            }
        }
    }

    public final void L() {
        t();
        this.f83799j = rx.c.H2(1L, 1L, TimeUnit.SECONDS, tb0.a.a()).r5(new f());
    }

    public void M() {
        qb.c.i(f83784s, "", new Object[0]);
        this.f83796g = null;
        WeakReference<TextView> weakReference = this.f83791b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<View> weakReference2 = this.f83790a;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        qb0.h hVar = this.f83799j;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f83799j.unsubscribe();
    }

    public void N(List<StartupAd> ownAd) {
        this.f83796g = new ArrayList();
        if (ownAd == null) {
            if (!this.f83793d) {
                C();
            }
            i9.g.c().d(f83787v, "");
            return;
        }
        for (StartupAd startupAd : ownAd) {
            if (startupAd.ext_ad_id != null) {
                this.f83796g.add(AdItem.from(startupAd));
            }
        }
        String A = new com.google.gson.d().A(this.f83796g, new g().getType());
        if (!this.f83793d) {
            C();
        }
        H();
        i9.g.c().d(f83787v, A);
        qb.c.i(f83784s, "[ads, hasShow] [%s, %b]", A, Boolean.valueOf(this.f83793d));
    }

    public boolean q() {
        AdItem adItem;
        if (this.f83797h != null && (adItem = this.f83798i) != null) {
            File x11 = x(adItem.img.hashCode());
            int a11 = r9.a.a(f83786u + this.f83797h);
            qb.c.i(f83784s, "[limit, today, AdId, file], [%d, %d, %s, %b]", Integer.valueOf(this.f83801l), Integer.valueOf(a11), this.f83797h, Boolean.valueOf(x11 != null && x11.exists()));
            int i11 = this.f83801l;
            if (i11 > 0 && i11 >= a11 && x11 != null && x11.exists()) {
                return true;
            }
        }
        return false;
    }

    public final void r(Context context) {
        List<AdItem> list = this.f83796g;
        if (list == null) {
            return;
        }
        for (AdItem adItem : list) {
            if (adItem.extraId.equals(this.f83797h)) {
                qb.c.i(f83784s, "click %s", new com.google.gson.d().z(adItem));
                s9.g a11 = s9.f.a(context, adItem);
                if (a11.a()) {
                    this.f83802m = true;
                    if (this.f83795f.get() == null) {
                        return;
                    }
                    t();
                    qb.c.i(f83784s, "jump success %s", a11);
                    i.d(pb.a.a(), this.f83797h);
                } else {
                    continue;
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void s(w splashView, q readToGo, v adClickCallback) {
        int i11;
        AdLunchApp adLunchApp;
        qb.c.i(f83784s, "", new Object[0]);
        this.f83793d = true;
        this.f83790a = new WeakReference<>(splashView.m());
        this.f83791b = new WeakReference<>(splashView.s());
        this.f83794e = readToGo;
        this.f83795f = new WeakReference<>(adClickCallback);
        qb.c.b("tjy", "adItem:" + this.f83798i.toString(), new Object[0]);
        int i12 = this.f83800k;
        if (i12 > 0) {
            J(i12);
        } else {
            TextView textView = this.f83791b.get();
            if (textView != null) {
                textView.setText("跳过");
            }
        }
        if (this.f83798i.isFull) {
            splashView.l().setVisibility(8);
        } else {
            splashView.l().setVisibility(0);
        }
        splashView.q().setOnTouchListener(new b());
        AdItem adItem = this.f83798i;
        Action action = adItem.action;
        AdExtraResp adExtraResp = adItem.extraResp;
        splashView.q().setOnClickListener(new c(action));
        if ((adExtraResp != null && (((adLunchApp = adExtraResp.launch_app) != null && adLunchApp.deeplink != null) || adExtraResp.launch_wechat_program != null)) || (action != null && ((action.jump_type == 4 && !TextUtils.isEmpty(action.mini_program_id)) || (((i11 = action.jump_type) == 1 || i11 == 2 || i11 == 3) && !TextUtils.isEmpty(action.link))))) {
            splashView.n().setVisibility(0);
            splashView.q().setVisibility(0);
        }
        if (this.f83798i.btnLight) {
            ColorStateList valueOf = ColorStateList.valueOf(Color.parseColor("#33FFFFFF"));
            splashView.q().setBackgroundTintList(valueOf);
            splashView.n().setBackgroundTintList(valueOf);
            splashView.s().setBackgroundTintList(valueOf);
        } else {
            ColorStateList valueOf2 = ColorStateList.valueOf(Color.parseColor("#33141822"));
            splashView.n().setBackgroundTintList(valueOf2);
            splashView.s().setBackgroundTintList(valueOf2);
            splashView.q().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#99141822")));
        }
        splashView.m().setVisibility(0);
        if (this.f83798i.resourceType == 1) {
            SplashVideoView splashVideoView = new SplashVideoView(splashView.p().getContext());
            this.f83807r = splashVideoView;
            splashVideoView.setOnVideoListener(new d());
            splashView.p().addView(this.f83807r, 0, new ViewGroup.LayoutParams(-1, -1));
            WeakReference<TextView> weakReference = this.f83791b;
            if (weakReference != null && weakReference.get() != null) {
                this.f83791b.get().setVisibility(4);
            }
            File x11 = x(this.f83798i.img.hashCode());
            if (x11.exists()) {
                this.f83807r.setVideoPath(x11.getAbsolutePath());
            } else {
                this.f83807r.setVideoPath(this.f83798i.img);
            }
        } else {
            ImageView imageView = new ImageView(splashView.p().getContext());
            if (this.f83798i.isFull) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            splashView.p().addView(imageView, 0, new ViewGroup.LayoutParams(-1, -1));
            File x12 = x(this.f83798i.img.hashCode());
            Context context = imageView.getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    qb.c.d(f83784s, "Activity is destroyed or finishing, skip loading image", new Object[0]);
                    return;
                }
            }
            (x12.exists() ? com.bumptech.glide.c.G(imageView).load(x12) : com.bumptech.glide.c.G(imageView).load(this.f83798i.img)).transition(uk.i.n()).listener(new e()).into(imageView);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            splashView.r().setImageResource(R.drawable.startup_logo);
            splashView.o().setVisibility(0);
        }
        splashView.k();
        splashView.s().setOnClickListener(new View.OnClickListener() { // from class: r9.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.F(view);
            }
        });
        i.e(splashView.m().getContext(), this.f83797h);
        if (this.f83798i.extraResp != null) {
            k kVar = new k();
            kVar.y(String.valueOf(this.f83798i.extraResp.price));
            kVar.C(splashView.p().getWidth());
            kVar.B(splashView.p().getWidth());
            Iterator<String> it = this.f83798i.extraResp.imp_trackers.iterator();
            while (it.hasNext()) {
                j.f83727a.d(kVar, it.next());
            }
        }
        r9.a.b(f83786u + this.f83797h, r9.a.a(f83786u + this.f83797h) + 1);
    }

    public final void t() {
        qb0.h hVar = this.f83799j;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f83799j.unsubscribe();
        }
        this.f83799j = null;
    }

    public void u() {
        r9.a.b(f83786u + this.f83797h, 0);
        this.f83797h = null;
        this.f83796g = new ArrayList();
        i9.f.n(pb.a.a(), f83787v, "", false);
        WeakReference<View> weakReference = this.f83790a;
        if (weakReference == null || !(weakReference.get() instanceof ViewGroup)) {
            return;
        }
        View childAt = ((ViewGroup) this.f83790a.get()).getChildAt(0);
        if (childAt instanceof SplashVideoView) {
            ((SplashVideoView) childAt).t();
        }
    }

    public final void v(AdItem item) {
        qb.c.b(f83784s, "start download:" + item.img, new Object[0]);
        if (TextUtils.isEmpty(item.img)) {
            return;
        }
        final File x11 = x(item.img.hashCode());
        if (x11.exists()) {
            qb.c.i(f83784s, "Skip download %s, file exists", item.extraId);
            return;
        }
        File parentFile = x11.getParentFile();
        if (!parentFile.exists()) {
            qb.c.b(f83784s, "parent make" + parentFile.getAbsolutePath(), new Object[0]);
            parentFile.mkdirs();
        }
        final File file = new File(x11.getAbsolutePath() + ".tmp");
        qb.c.b(f83784s, "download observable: temp=" + file + ", final=" + x11, new Object[0]);
        if (file.exists()) {
            file.delete();
        }
        rx.c.M2(item).c3(new wb0.p() { // from class: r9.l
            @Override // wb0.p
            public final Object call(Object obj) {
                return p.b(file, x11, (AdItem) obj);
            }
        }).w5(bc0.c.e()).I3(tb0.a.a()).u5(new wb0.b() { // from class: r9.m
            @Override // wb0.b
            public final void call(Object obj) {
                p.c(x11, (Boolean) obj);
            }
        }, new wb0.b() { // from class: r9.n
            @Override // wb0.b
            public final void call(Object obj) {
                p.d(x11, file, (Throwable) obj);
            }
        });
    }

    public final void w() {
        i.f(pb.a.a(), this.f83797h);
        t();
        A();
    }

    public final File x(int hashCode) {
        return PathUtil.getBaicizhanFile(new File(f83789x, String.valueOf(hashCode)).getPath());
    }

    public AdItem z() {
        return this.f83798i;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends qb0.g<Long> {
        public f() {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Long aLong) {
            p.this.I();
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }
}
