package com.baicizhan.main.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.media3.ui.DefaultTimeBar;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.ActivityLifeController;
import com.baicizhan.client.business.util.AuthCallback;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.main.activity.IntroductionPageActivity;
import com.baicizhan.main.auth.VerificationType;
import com.jiongji.andriod.card.R;
import gs.y0;
import java.util.HashMap;
import ma.l;
import ma.t;
import me.o;
import q9.x;
import sf.d0;
import tf.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class IntroductionPageActivity extends ThirdPartyWrapperActivity implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public static final String f17960n = "IntroductionPageActivity";

    /* renamed from: o, reason: collision with root package name */
    public static final String f17961o = "extra_last_account";

    /* renamed from: p, reason: collision with root package name */
    public static final String f17962p = "extra_last_account_name";

    /* renamed from: k, reason: collision with root package name */
    public y0 f17963k;

    /* renamed from: l, reason: collision with root package name */
    public final AuthCallback<ThirdPartyUserInfo> f17964l = new b();

    /* renamed from: m, reason: collision with root package name */
    public boolean f17965m = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AuthCallback<ThirdPartyUserInfo> {
        public b() {
        }

        @Override // com.baicizhan.client.business.util.AuthCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ThirdPartyUserInfo thirdPartyUserInfo) {
            qb.c.i(IntroductionPageActivity.f17960n, "third party auth success: " + thirdPartyUserInfo, new Object[0]);
            IntroductionPageActivity.this.X0(ThirdPartyUserInfo.thirdPartyInfoToUserRecord(thirdPartyUserInfo), thirdPartyUserInfo);
        }

        @Override // com.baicizhan.client.business.util.AuthCallback
        public void onError(Throwable throwable) {
            qb.c.q(IntroductionPageActivity.f17960n, "third party auth failed: " + throwable.getMessage(), new Object[0]);
            ThirdPartyUserInfo.clearThirdPartyLoginCache(IntroductionPageActivity.this);
            va.g.i("认证失败 " + throwable.getMessage(), 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends sa.c {
        public c() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            IntroductionPageActivity.this.w1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends sa.c {
        public d() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            IntroductionPageActivity.this.u1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends sa.c {
        public e() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            IntroductionPageActivity.this.s1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends sa.c {
        public f() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            IntroductionPageActivity.this.t1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends sa.c {
        public g() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            IntroductionPageActivity.this.v1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends ClickableSpan {
        public h() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull final View widget) {
            widget.setEnabled(false);
            ((BaseAppCompatActivity) IntroductionPageActivity.this).mHandler.postDelayed(new Runnable() { // from class: fd.i1
                @Override // java.lang.Runnable
                public final void run() {
                    widget.setEnabled(true);
                }
            }, 1000L);
            BczWebHelperKt.startBczProtocolWeb(IntroductionPageActivity.this);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint ds2) {
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends ClickableSpan {
        public i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull final View widget) {
            widget.setEnabled(false);
            ((BaseAppCompatActivity) IntroductionPageActivity.this).mHandler.postDelayed(new Runnable() { // from class: fd.j1
                @Override // java.lang.Runnable
                public final void run() {
                    widget.setEnabled(true);
                }
            }, 1000L);
            BczWebHelperKt.startPrivacyProtocolWeb(IntroductionPageActivity.this);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint ds2) {
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends ClickableSpan {
        public j() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull final View widget) {
            widget.setEnabled(false);
            ((BaseAppCompatActivity) IntroductionPageActivity.this).mHandler.postDelayed(new Runnable() { // from class: fd.k1
                @Override // java.lang.Runnable
                public final void run() {
                    widget.setEnabled(true);
                }
            }, 1000L);
            BczWebHelperKt.startChildProtocolWeb(IntroductionPageActivity.this);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint ds2) {
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    public static void x1(Context context, UserRecord user) {
        Intent intent = new Intent(context, (Class<?>) IntroductionPageActivity.class);
        if (user != null) {
            String verboseLoginType = user.getVerboseLoginType();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(user.getLoginType() == 3 ? "" : user.getUser());
            intent.putExtra(f17961o, context.getString(R.string.last_login, verboseLoginType, sb2.toString()));
            intent.putExtra(f17962p, user.getUser());
        }
        context.startActivity(intent);
    }

    public final boolean n1() {
        if (this.f17965m) {
            return false;
        }
        if (this.f17963k.f57533k.isSelected()) {
            return true;
        }
        va.g.g(R.string.app_protocol_login_unconfirm_toast, 1);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17963k.f57532j, "translationX", 0.0f, -xb.f.a(this, 8.0f), 0.0f);
        ofFloat.addListener(new a());
        ofFloat.setDuration(800L);
        ofFloat.setInterpolator(new BounceInterpolator());
        ofFloat.start();
        return false;
    }

    public final void o1() {
        TextView textView = (TextView) findViewById(R.id.protocol);
        if (textView == null) {
            return;
        }
        this.f17963k.f57533k.setOnClickListener(new View.OnClickListener() { // from class: fd.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroductionPageActivity.this.p1(view);
            }
        });
        SpannableString spannableString = new SpannableString(getString(R.string.main_login_protocol));
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        spannableString.setSpan(hVar, 9, 13, 34);
        spannableString.setSpan(iVar, 15, 19, 34);
        spannableString.setSpan(jVar, 22, spannableString.length() - 1, 34);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.back) {
            finish();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        o.f73181a.C(false);
        this.mClosedFit = true;
        ActivityLifeController.get().register(this);
        qb.c.b(f17960n, "IntroductionPageActivity onCreate", new Object[0]);
        setTheme(R.style.AppCompatStandardDefaultDarkStatus);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.login_bg_blue));
        if (x.r().c(this)) {
            return;
        }
        y0 y0Var = (y0) DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_introduction_page, null, false);
        this.f17963k = y0Var;
        y0Var.k(this);
        this.f17963k.f57530h.setOnClickListener(new c());
        this.f17963k.f57528f.setOnClickListener(new d());
        this.f17963k.f57526d.setOnClickListener(new e());
        this.f17963k.f57527e.setOnClickListener(new f());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17963k.f57524b.getLayoutParams();
        layoutParams.topMargin = zb.a.k(this);
        this.f17963k.f57524b.setLayoutParams(layoutParams);
        this.f17963k.f57524b.setOnClickListener(new g());
        setContentView(this.f17963k.getRoot());
        ia.a.l(ia.a.f60460k, 0L);
        this.f17963k.l(getIntent().getStringExtra(f17961o));
        ThirdPartyUserInfo o11 = c9.a.o();
        if (o11 != null) {
            this.f17964l.postSuccess(o11);
        }
        if (x.r().j() == null) {
            R0().b();
        }
        o1();
        q.f90552a.a().f();
        HashMap hashMap = new HashMap();
        hashMap.put("device_id", DeviceUtil.getUniqueID(this));
        l.g(t.f73003b, ma.a.f72871x4, hashMap);
        if (DeviceUtil.isHuawei()) {
            this.f17963k.f57526d.setVisibility(0);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.baicizhan.client.business.thrift.c.b().b(f17960n);
        ActivityLifeController.get().unregister(this);
        R0().c();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        qb.c.b(f17960n, "WOCAO!", new Object[0]);
    }

    @Override // com.baicizhan.main.activity.ThirdPartyWrapperActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
    }

    public final /* synthetic */ void p1(View view) {
        this.f17963k.f57533k.setSelected(!r2.isSelected());
        o.f73181a.C(this.f17963k.f57533k.isSelected());
    }

    public final /* synthetic */ void q1(Boolean bool) {
        setLoading(false);
        gi.e.o(this, true);
    }

    public final /* synthetic */ void r1(Throwable th2) {
        setLoading(false);
        qb.c.c(f17960n, "", th2);
        va.g.j(th2, 0);
    }

    public final void s1() {
        if (n1()) {
            Y0();
            c9.a.g(this, P0(7));
        }
    }

    public final void t1() {
        if (n1()) {
            Y0();
            com.baicizhan.main.auth.onekey.a.f19954a.n(this, VerificationType.LOGIN_PHONE_DIRECTLY);
        }
    }

    public final void u1() {
        if (n1()) {
            if (!c9.a.c(this)) {
                va.g.g(R.string.qq_not_install, 0);
            } else {
                Y0();
                c9.a.h(this, P0(5));
            }
        }
    }

    public final void v1() {
        if (n1()) {
            Y0();
            setLoading(true);
            d0.f88406a.i(this).I3(tb0.a.a()).u5(new wb0.b() { // from class: fd.g1
                @Override // wb0.b
                public final void call(Object obj) {
                    IntroductionPageActivity.this.q1((Boolean) obj);
                }
            }, new wb0.b() { // from class: fd.h1
                @Override // wb0.b
                public final void call(Object obj) {
                    IntroductionPageActivity.this.r1((Throwable) obj);
                }
            });
        }
    }

    public final void w1() {
        if (n1()) {
            if (!c9.a.f(this)) {
                va.g.g(R.string.weixin_not_install, 0);
            } else {
                Y0();
                c9.a.j(this, P0(4));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IntroductionPageActivity.this.f17965m = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IntroductionPageActivity.this.f17965m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }
}
