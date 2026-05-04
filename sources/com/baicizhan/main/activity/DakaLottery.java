package com.baicizhan.main.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.user_study_api.OpenBoxResult;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.jiongji.andriod.card.R;
import org.apache.thrift.TException;
import qb0.h;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DakaLottery extends BaseActivity implements View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    public static final String f17841m = "DakaLottery";

    /* renamed from: a, reason: collision with root package name */
    public TextView f17842a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f17843b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f17844c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f17845d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f17846e;

    /* renamed from: f, reason: collision with root package name */
    public View f17847f;

    /* renamed from: g, reason: collision with root package name */
    public View f17848g;

    /* renamed from: h, reason: collision with root package name */
    public View f17849h;

    /* renamed from: i, reason: collision with root package name */
    public ProgressBar f17850i;

    /* renamed from: j, reason: collision with root package name */
    public h f17851j;

    /* renamed from: k, reason: collision with root package name */
    public h f17852k;

    /* renamed from: l, reason: collision with root package name */
    public g f17853l = g.LOADING;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Boolean> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof LogicException) {
                va.g.i(cause.getMessage(), 1);
            } else {
                va.g.g(R.string.daka_lotter_unknown_error, 1);
            }
            DakaLottery.this.W0();
        }

        @Override // qb0.g
        public void onStart() {
            DakaLottery.this.X0();
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (aBoolean.booleanValue()) {
                DakaLottery.this.Y0();
            } else {
                DakaLottery.this.Z0();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements hc.d {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.baicizhan.main.activity.DakaLottery$c$a$a, reason: collision with other inner class name */
            public class C0280a extends Animatable2Compat.AnimationCallback {
                public C0280a() {
                }

                @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
                public void onAnimationEnd(Drawable drawable) {
                    super.onAnimationEnd(drawable);
                    ObjectAnimator.ofFloat(DakaLottery.this.f17845d, "alpha", 0.0f, 1.0f).setDuration(300L).start();
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = DakaLottery.this.f17844c.getDrawable();
                if (drawable instanceof wk.c) {
                    wk.c cVar = (wk.c) drawable;
                    cVar.q(0);
                    cVar.registerAnimationCallback(new C0280a());
                }
            }
        }

        public c() {
        }

        @Override // hc.d
        public void a(@Nullable Exception e11) {
            qb.c.c(DakaLottery.f17841m, "", e11);
        }

        @Override // hc.d
        public void onSuccess() {
            DakaLottery.this.f17844c.postDelayed(new a(), 100L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements p<UserStudyApiService.Client, Boolean> {
        public d() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserStudyApiService.Client client) {
            try {
                return Boolean.valueOf(client.can_open_box(System.currentTimeMillis()));
            } catch (TException e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements p<UserStudyApiService.Client, OpenBoxResult> {
        public e() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public OpenBoxResult call(UserStudyApiService.Client client) {
            try {
                return client.open_box(System.currentTimeMillis());
            } catch (TException e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17861a;

        static {
            int[] iArr = new int[g.values().length];
            f17861a = iArr;
            try {
                iArr[g.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17861a[g.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17861a[g.OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17861a[g.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum g {
        LOADING,
        OPEN,
        OPENED,
        FAILED
    }

    public static rx.c<UserStudyApiService.Client> S0() {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/user_study").c(1).b(3000).d(3000)).w5(bc0.c.e());
    }

    public static void V0(Activity context) {
        context.startActivity(new Intent(context, (Class<?>) DakaLottery.class));
        context.overridePendingTransition(R.anim.push_up_in, R.anim.activity_nothing);
    }

    public final rx.c<Boolean> O0() {
        return S0().c3(new d());
    }

    public final void P0() {
        this.f17845d = (ImageView) findViewById(R.id.image_final);
        this.f17844c = (ImageView) findViewById(R.id.image);
        this.f17845d.setAlpha(0.0f);
        this.f17843b = (TextView) findViewById(R.id.cancel);
        this.f17842a = (TextView) findViewById(R.id.confirm);
        this.f17847f = findViewById(R.id.confirm_area);
        this.f17848g = findViewById(R.id.title);
        this.f17849h = findViewById(R.id.subtitle);
        this.f17846e = (ImageView) findViewById(R.id.img_box);
        this.f17850i = (ProgressBar) findViewById(R.id.loading_progress);
        this.f17847f.setOnClickListener(this);
        this.f17843b.setOnClickListener(this);
        hc.c.i(R.drawable.daka_gift_25fps).g(this.f17844c, new c());
        U0(R.color.white_color, this.f17850i);
    }

    public final void Q0() {
        h hVar = this.f17851j;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f17851j.unsubscribe();
        }
        this.f17851j = O0().I3(tb0.a.a()).r5(new a());
    }

    public final void R0() {
        h hVar = this.f17852k;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f17852k.unsubscribe();
        }
        this.f17852k = T0().I3(tb0.a.a()).r5(new b());
    }

    public final rx.c<OpenBoxResult> T0() {
        return S0().c3(new e());
    }

    public void U0(int colorId, ProgressBar progressBar) {
        progressBar.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(this, colorId), PorterDuff.Mode.SRC_IN);
    }

    public final void W0() {
        this.f17853l = g.FAILED;
        this.f17850i.setVisibility(8);
        this.f17842a.setText(R.string.daka_lottery_retry);
        this.f17846e.setVisibility(8);
        this.f17848g.setVisibility(4);
        this.f17849h.setVisibility(4);
        this.f17847f.setSelected(false);
        this.f17847f.setEnabled(true);
    }

    public final void X0() {
        this.f17853l = g.LOADING;
        this.f17850i.setVisibility(0);
        this.f17842a.setText(R.string.daka_lottery_confirm);
        this.f17846e.setVisibility(8);
        this.f17848g.setVisibility(4);
        this.f17849h.setVisibility(4);
        this.f17847f.setSelected(false);
        this.f17847f.setEnabled(false);
    }

    public final void Y0() {
        this.f17853l = g.OPEN;
        this.f17850i.setVisibility(8);
        this.f17842a.setText(R.string.daka_lottery_confirm);
        this.f17846e.setVisibility(0);
        this.f17848g.setVisibility(0);
        this.f17849h.setVisibility(4);
        this.f17847f.setSelected(false);
        this.f17847f.setEnabled(true);
    }

    public final void Z0() {
        this.f17853l = g.OPENED;
        this.f17850i.setVisibility(8);
        this.f17842a.setText(R.string.daka_lottery_opened);
        this.f17846e.setVisibility(8);
        this.f17848g.setVisibility(4);
        this.f17849h.setVisibility(0);
        this.f17847f.setSelected(true);
        this.f17847f.setEnabled(false);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_no_fade, R.anim.business_no_fade);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.confirm_area) {
            if (view.getId() == R.id.cancel) {
                finish();
                overridePendingTransition(R.anim.activity_nothing, R.anim.push_down_out);
                return;
            }
            return;
        }
        int i11 = f.f17861a[this.f17853l.ordinal()];
        if (i11 == 1) {
            Q0();
        } else {
            if (i11 != 2) {
                return;
            }
            R0();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daka_lottery);
        P0();
        Q0();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f17851j;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f17851j.unsubscribe();
        }
        h hVar2 = this.f17852k;
        if (hVar2 == null || hVar2.isUnsubscribed()) {
            return;
        }
        this.f17852k.unsubscribe();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<OpenBoxResult> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof LogicException) {
                va.g.i(cause.getMessage(), 1);
            } else {
                va.g.g(R.string.daka_lotter_unknown_error, 1);
            }
            DakaLottery.this.Y0();
        }

        @Override // qb0.g
        public void onStart() {
            super.onStart();
            DakaLottery.this.X0();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(OpenBoxResult openBoxResult) {
            DakaLottery.this.finish();
            OpenGoldBoxActivity.L0(DakaLottery.this, openBoxResult.coin_count, openBoxResult.lucky_strike);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
