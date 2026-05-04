package com.baicizhan.main.customview;

import a00.r0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.customview.MainPopdownMessageView;
import com.baicizhan.main.home.plan.k3;
import com.baicizhan.online.ad_property.AdExtraResp;
import com.baicizhan.online.notify.Feedback;
import com.baicizhan.online.notify.Notify;
import com.baicizhan.online.notify.NotifyResult;
import com.jiongji.andriod.card.R;
import gi.k;
import hg.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import ma.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MainPopdownMessageView extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final String f20056j = "MainPopdownMessageView";

    /* renamed from: a, reason: collision with root package name */
    public TextView f20057a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f20058b;

    /* renamed from: c, reason: collision with root package name */
    public s f20059c;

    /* renamed from: d, reason: collision with root package name */
    public TranslateAnimation f20060d;

    /* renamed from: e, reason: collision with root package name */
    public TranslateAnimation f20061e;

    /* renamed from: f, reason: collision with root package name */
    public h f20062f;

    /* renamed from: g, reason: collision with root package name */
    public Dialog f20063g;

    /* renamed from: h, reason: collision with root package name */
    public String f20064h;

    /* renamed from: i, reason: collision with root package name */
    public i f20065i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends HashMap<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NotifyResult f20067a;

        public b(final NotifyResult val$notify) {
            this.f20067a = val$notify;
            put(ma.b.f72900e, k.o(val$notify.notify));
            put("extra_info", String.format("{\"%s\":\"%s\"}", "adv_id", k.o(val$notify.notify)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends HashMap<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NotifyResult f20069a;

        public c(final NotifyResult val$result) {
            this.f20069a = val$result;
            put(ma.b.f72900e, k.o(val$result.notify));
            put("extra_info", String.format("{\"%s\":\"%s\"}", "adv_id", k.o(val$result.notify)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends HashMap<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NotifyResult f20071a;

        public d(final NotifyResult val$notifyResult) {
            this.f20071a = val$notifyResult;
            put(ma.b.f72900e, k.o(val$notifyResult.notify));
            put("extra_info", String.format("{\"%s\":\"%s\"}", "adv_id", k.o(val$notifyResult.notify)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends HashMap<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Notify f20073a;

        public e(final Notify val$notify) {
            this.f20073a = val$notify;
            put(ma.b.f72900e, k.o(val$notify));
            put("extra_info", String.format("{\"%s\":\"%s\"}", "adv_id", k.o(val$notify)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends HashMap<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Notify f20075a;

        public f(final Notify val$notify) {
            this.f20075a = val$notify;
            put(ma.b.f72900e, k.o(val$notify));
            put("extra_info", String.format("{\"%s\":\"%s\"}", "adv_id", k.o(val$notify)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends HashMap<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Notify f20077a;

        public g(final Notify val$notify) {
            this.f20077a = val$notify;
            put(ma.b.f72900e, k.o(val$notify));
            put("extra_info", String.format("{\"%s\":\"%s\"}", "adv_id", k.o(val$notify)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20082a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20083b = 2;

        void a(int type);

        void b(int type);

        void c(int type);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends sa.c {
        public j() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            int id2 = v11.getId();
            if (id2 == R.id.notification_container) {
                MainPopdownMessageView mainPopdownMessageView = MainPopdownMessageView.this;
                mainPopdownMessageView.q((NotifyResult) mainPopdownMessageView.getTag());
            } else if (id2 == R.id.notification_close) {
                MainPopdownMessageView mainPopdownMessageView2 = MainPopdownMessageView.this;
                mainPopdownMessageView2.i((NotifyResult) mainPopdownMessageView2.getTag());
            }
        }
    }

    public MainPopdownMessageView(Context context) {
        super(context);
    }

    public final void i(NotifyResult result) {
        if (result != null && result.notify != null) {
            l.b("notify-popup", ma.a.W, new c(result));
        }
        k();
    }

    public final void j() {
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        startAnimation(this.f20060d);
    }

    public final void k() {
        removeCallbacks(this.f20062f);
        if (this.f20062f == null) {
            this.f20062f = new h(this);
        }
        post(this.f20062f);
    }

    public boolean l() {
        Dialog dialog = this.f20063g;
        return dialog != null && dialog.isShowing();
    }

    public final /* synthetic */ void m(Notify notify, DialogInterface dialogInterface, int i11) {
        if (i11 != -1 || TextUtils.isEmpty(notify.url)) {
            if (i11 == -2) {
                l.b("notify-popup", ma.a.W, new f(notify));
                return;
            }
            return;
        }
        l.b("notify-popup", ma.a.V, new e(notify));
        AdExtraResp ad_resp = notify.getAd_resp();
        mg.a aVar = new mg.a();
        aVar.w(va.e.f93732b);
        aVar.x(va.e.f93733c);
        aVar.z(va.e.f93734d);
        aVar.A(va.e.f93735e);
        k3.y(getContext(), ad_resp, notify.url, aVar);
        i iVar = this.f20065i;
        if (iVar != null) {
            iVar.b(2);
        }
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void n(DialogInterface dialogInterface) {
        i iVar = this.f20065i;
        if (iVar != null) {
            iVar.a(2);
        }
    }

    public final /* synthetic */ g2 o(NotifyResult notifyResult, final Notify notify, AtomicLong atomicLong, Bitmap bitmap) {
        Feedback advFeedback = notifyResult.getAdvFeedback();
        Dialog i11 = va.e.i(getContext(), bitmap, notify, advFeedback == null ? null : new ea.a(r0.C3(advFeedback.selection, new x00.l() { // from class: zf.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                return new ea.b((String) obj);
            }
        }), advFeedback.toast), new DialogInterface.OnClickListener() { // from class: zf.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                MainPopdownMessageView.this.m(notify, dialogInterface, i12);
            }
        });
        i11.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: zf.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MainPopdownMessageView.this.n(dialogInterface);
            }
        });
        try {
            i iVar = this.f20065i;
            if (iVar != null) {
                iVar.c(2);
            }
            i11.setCancelable(false);
            i11.show();
            if (notify.ad_resp != null) {
                mg.a aVar = new mg.a();
                aVar.y(String.valueOf(notify.ad_resp.price));
                aVar.C(va.e.f93736f.getWidth());
                aVar.B(va.e.f93736f.getHeight());
                Iterator<String> it = notify.ad_resp.imp_trackers.iterator();
                while (it.hasNext()) {
                    k3.s(aVar, it.next());
                }
            }
            this.f20063g = i11;
            this.f20064h = notify.img_url;
            l.b("notify-popup", "notify-popup", new g(notify));
            r(Boolean.TRUE, Long.valueOf(atomicLong.get()), notify.aid);
        } catch (Exception e11) {
            r(Boolean.FALSE, Long.valueOf(atomicLong.get()), notify.aid);
            qb.c.c(f20056j, "", e11);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f20062f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.notification_container).setOnClickListener(new j());
        this.f20057a = (TextView) findViewById(R.id.notification_title);
        findViewById(R.id.notification_close).setOnClickListener(new j());
        ImageView imageView = (ImageView) findViewById(R.id.ad_image);
        this.f20058b = imageView;
        imageView.getLayoutParams().height = (xb.f.i(getContext()) - xb.f.a(getContext(), 40.0f)) / 3;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 2, -1.0f, 1, 0.0f);
        this.f20060d = translateAnimation;
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        this.f20060d.setAnimationListener(new a());
        this.f20060d.setDuration(500L);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 2, -1.0f);
        this.f20061e = translateAnimation2;
        translateAnimation2.setDuration(500L);
    }

    public final /* synthetic */ g2 p(AtomicLong atomicLong, Notify notify) {
        r(Boolean.FALSE, Long.valueOf(atomicLong.get()), notify.aid);
        return null;
    }

    public final void q(NotifyResult notify) {
        k();
        Notify notify2 = notify.notify;
        if (notify2 == null) {
            return;
        }
        String str = !TextUtils.isEmpty(notify2.url) ? notify.notify.url : notify.service_url;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l.b("notify-popup", ma.a.V, new b(notify));
        BczWebExecutorKt.startNormalWeb(getContext(), str);
        i iVar = this.f20065i;
        if (iVar != null) {
            iVar.b(1);
        }
    }

    public void r(Boolean bool, Long l11, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("adv_id", str);
        hashMap.put(ma.b.f72906g, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        hashMap.put(ma.b.f72903f, Long.valueOf(System.currentTimeMillis() - l11.longValue()));
        l.e("notify-popup", ma.a.Y, hashMap);
    }

    public void s(final NotifyResult notifyResult) {
        final Notify notify = notifyResult.advNotify;
        if (notify == null || TextUtils.isEmpty(notify.img_url)) {
            qb.c.d(f20056j, "tryPopImgDialog: img_url null", new Object[0]);
            return;
        }
        Dialog dialog = this.f20063g;
        if (dialog != null && dialog.isShowing()) {
            if (notify.img_url.equalsIgnoreCase(this.f20064h)) {
                return;
            } else {
                this.f20063g.dismiss();
            }
        }
        final AtomicLong atomicLong = new AtomicLong();
        atomicLong.set(System.currentTimeMillis());
        hc.c.p(notify.img_url).l(new x00.l() { // from class: zf.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = MainPopdownMessageView.this.o(notifyResult, notify, atomicLong, (Bitmap) obj);
                return o11;
            }
        }, new x00.a() { // from class: zf.i
            @Override // x00.a
            public final Object invoke() {
                g2 p11;
                p11 = MainPopdownMessageView.this.p(atomicLong, notify);
                return p11;
            }
        });
    }

    public void setOnNotificationListener(i listener) {
        this.f20065i = listener;
    }

    public void t(NotifyResult notifyResult) {
        Notify notify = notifyResult.notify;
        if (notify == null) {
            return;
        }
        this.f20057a.setText(notify.title);
        if (TextUtils.isEmpty(notifyResult.notify.banner_img_url)) {
            this.f20058b.setVisibility(8);
        } else {
            this.f20058b.setVisibility(0);
            hc.c.l(notifyResult.notify.banner_img_url).f(R.drawable.ic_ad_notice_default).j(R.drawable.ic_ad_notice_default).o(this.f20058b);
        }
        setTag(notifyResult);
        j();
        l.b("notify-popup", "notify-popup", new d(notifyResult));
    }

    public MainPopdownMessageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MainPopdownMessageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<MainPopdownMessageView> f20079a;

        public h(MainPopdownMessageView holder) {
            this.f20079a = new WeakReference<>(holder);
        }

        @Override // java.lang.Runnable
        public void run() {
            MainPopdownMessageView mainPopdownMessageView = this.f20079a.get();
            if (mainPopdownMessageView == null) {
                return;
            }
            mainPopdownMessageView.startAnimation(mainPopdownMessageView.f20061e);
            mainPopdownMessageView.f20061e.setAnimationListener(new a(mainPopdownMessageView));
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainPopdownMessageView f20080a;

            public a(final MainPopdownMessageView val$holder) {
                this.f20080a = val$holder;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f20080a.setVisibility(8);
                if (this.f20080a.f20065i != null) {
                    this.f20080a.f20065i.a(1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (MainPopdownMessageView.this.f20065i != null) {
                MainPopdownMessageView.this.f20065i.c(1);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }
}
