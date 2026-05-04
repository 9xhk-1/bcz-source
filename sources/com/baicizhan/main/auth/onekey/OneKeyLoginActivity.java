package com.baicizhan.main.auth.onekey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.auth.AccountVerificationActivity;
import com.baicizhan.main.auth.VerificationType;
import com.baicizhan.main.auth.WeiboLoginTransparentActivity;
import com.baicizhan.main.auth.onekey.OneKeyLoginActivity;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import gi.e;
import gs.l1;
import java.io.Serializable;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import org.junit.jupiter.api.j2;
import tf.a0;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOneKeyLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneKeyLoginActivity.kt\ncom/baicizhan/main/auth/onekey/OneKeyLoginActivity\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,298:1\n35#2:299\n35#2:300\n*S KotlinDebug\n*F\n+ 1 OneKeyLoginActivity.kt\ncom/baicizhan/main/auth/onekey/OneKeyLoginActivity\n*L\n179#1:299\n208#1:300\n*E\n"})
/* loaded from: classes4.dex */
public final class OneKeyLoginActivity extends BaseAppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f19939d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f19940e = 8;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f19941f = "OneKeyLoginActivity";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f19942g = "current_state";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f19943h = "user_login_result";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f19944i = "request_code";

    /* renamed from: j, reason: collision with root package name */
    public static final int f19945j = 100;

    /* renamed from: k, reason: collision with root package name */
    public static final int f19946k = 101;

    /* renamed from: l, reason: collision with root package name */
    public static final int f19947l = 102;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f19948a = e0.c(new x00.a() { // from class: tf.m
        @Override // x00.a
        public final Object invoke() {
            l1 m12;
            m12 = OneKeyLoginActivity.m1(OneKeyLoginActivity.this);
            return m12;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f19949b = e0.c(new x00.a() { // from class: tf.n
        @Override // x00.a
        public final Object invoke() {
            a0 n12;
            n12 = OneKeyLoginActivity.n1(OneKeyLoginActivity.this);
            return n12;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public int f19950c = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Activity activity, VerificationType verificationType, UserLoginResult userLoginResult, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                userLoginResult = null;
            }
            if ((i12 & 8) != 0) {
                i11 = -1;
            }
            aVar.b(activity, verificationType, userLoginResult, i11);
        }

        public final void a(@k Context context, @k VerificationType type) {
            g0.p(context, "context");
            g0.p(type, "type");
            Intent intent = new Intent(context, (Class<?>) OneKeyLoginActivity.class);
            intent.putExtra(OneKeyLoginActivity.f19942g, type);
            context.startActivity(intent);
        }

        public final void b(@k Activity context, @k VerificationType type, @l UserLoginResult userLoginResult, int i11) {
            g0.p(context, "context");
            g0.p(type, "type");
            Intent intent = new Intent(context, (Class<?>) OneKeyLoginActivity.class);
            intent.putExtra(OneKeyLoginActivity.f19942g, type);
            intent.putExtra("user_login_result", userLoginResult);
            intent.putExtra(OneKeyLoginActivity.f19944i, i11);
            context.startActivityForResult(intent, i11);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19951a;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.LOGIN_PHONE_DIRECTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_DIRECTLY_AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_DIRECTLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19951a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nOneKeyLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneKeyLoginActivity.kt\ncom/baicizhan/main/auth/onekey/OneKeyLoginActivity$initProtocol$operatorProtocol$1\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,298:1\n35#2:299\n*S KotlinDebug\n*F\n+ 1 OneKeyLoginActivity.kt\ncom/baicizhan/main/auth/onekey/OneKeyLoginActivity$initProtocol$operatorProtocol$1\n*L\n123#1:299\n*E\n"})
    public static final class c extends ClickableSpan {
        public c() {
        }

        public static final void b(View view) {
            view.setEnabled(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(final View widget) {
            g0.p(widget, "widget");
            widget.setEnabled(false);
            ((BaseAppCompatActivity) OneKeyLoginActivity.this).mHandler.postDelayed(new Runnable() { // from class: tf.p
                @Override // java.lang.Runnable
                public final void run() {
                    OneKeyLoginActivity.c.b(widget);
                }
            }, 1000L);
            String C = OneKeyLoginActivity.this.Y0().C();
            OneKeyLoginActivity oneKeyLoginActivity = OneKeyLoginActivity.this;
            if (C != null) {
                BczWebExecutorKt.startNormalWeb$default(oneKeyLoginActivity, C, null, false, 0, null, 60, null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            g0.p(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f19953a;

        public d(x00.l function) {
            g0.p(function, "function");
            this.f19953a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f19953a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19953a.invoke(obj);
        }
    }

    private final void W0() {
        Intent intent = new Intent();
        intent.putExtra("user_login_result", Y0().J());
        g2 g2Var = g2.f100423a;
        setResult(-1, intent);
        finish();
    }

    private final void Z0() {
        Y0().F().observe(this, new d(new x00.l() { // from class: tf.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 a12;
                a12 = OneKeyLoginActivity.a1(OneKeyLoginActivity.this, (Void) obj);
                return a12;
            }
        }));
        Y0().x().observe(this, new d(new x00.l() { // from class: tf.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b12;
                b12 = OneKeyLoginActivity.b1(OneKeyLoginActivity.this, (Boolean) obj);
                return b12;
            }
        }));
        Y0().L().observe(this, new d(new x00.l() { // from class: tf.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c12;
                c12 = OneKeyLoginActivity.c1(OneKeyLoginActivity.this, (Void) obj);
                return c12;
            }
        }));
        Y0().y().observe(this, new d(new x00.l() { // from class: tf.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d12;
                d12 = OneKeyLoginActivity.d1(OneKeyLoginActivity.this, (Void) obj);
                return d12;
            }
        }));
        Y0().c().observe(this, new d(new x00.l() { // from class: tf.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e12;
                e12 = OneKeyLoginActivity.e1(OneKeyLoginActivity.this, (Boolean) obj);
                return e12;
            }
        }));
        Y0().v().observe(this, new d(new x00.l() { // from class: tf.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f12;
                f12 = OneKeyLoginActivity.f1(OneKeyLoginActivity.this, (Boolean) obj);
                return f12;
            }
        }));
        Y0().b().observe(this, new d(new x00.l() { // from class: tf.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g12;
                g12 = OneKeyLoginActivity.g1(OneKeyLoginActivity.this, (Boolean) obj);
                return g12;
            }
        }));
    }

    public static final g2 a1(OneKeyLoginActivity oneKeyLoginActivity, Void r22) {
        int i11 = b.f19951a[oneKeyLoginActivity.Y0().w().ordinal()];
        if (i11 == 1) {
            AccountVerificationActivity.a.f(AccountVerificationActivity.f19901o, oneKeyLoginActivity, VerificationType.LOGIN_PHONE_DIRECTLY, null, null, 0, true, 28, null);
            com.baicizhan.main.auth.onekey.a.k(com.baicizhan.main.auth.onekey.a.f19954a, ma.a.f72786l3, false, null, 6, null);
        } else if (i11 == 2) {
            UserLoginResult J = oneKeyLoginActivity.Y0().J();
            if (J != null) {
                AccountVerificationActivity.f19901o.g(oneKeyLoginActivity, VerificationType.BIND_PHONE_AUTO, J.access_token, J.force_bind_phone, J, oneKeyLoginActivity.f19950c);
            }
            com.baicizhan.main.auth.onekey.a.m(com.baicizhan.main.auth.onekey.a.f19954a, ma.a.f72807o3, false, null, 6, null);
        } else if (i11 == 3) {
            AccountVerificationActivity.a.v(AccountVerificationActivity.f19901o, oneKeyLoginActivity, VerificationType.BIND_PHONE, null, null, 0, false, 101, 60, null);
        }
        return g2.f100423a;
    }

    public static final g2 b1(OneKeyLoginActivity oneKeyLoginActivity, Boolean bool) {
        if (bool.booleanValue()) {
            int i11 = b.f19951a[oneKeyLoginActivity.Y0().w().ordinal()];
            if (i11 == 1) {
                AccountVerificationActivity.a.f(AccountVerificationActivity.f19901o, oneKeyLoginActivity, VerificationType.LOGIN_PHONE_DIRECTLY, null, null, 0, true, 28, null);
            } else if (i11 == 2) {
                UserLoginResult J = oneKeyLoginActivity.Y0().J();
                if (J != null) {
                    AccountVerificationActivity.f19901o.g(oneKeyLoginActivity, VerificationType.BIND_PHONE_DIRECTLY_AUTO, J.access_token, J.force_bind_phone, J, oneKeyLoginActivity.f19950c);
                }
            } else if (i11 == 3) {
                AccountVerificationActivity.a.v(AccountVerificationActivity.f19901o, oneKeyLoginActivity, VerificationType.BIND_PHONE_DIRECTLY, null, null, 0, false, 101, 60, null);
            }
        }
        return g2.f100423a;
    }

    public static final g2 c1(OneKeyLoginActivity oneKeyLoginActivity, Void r22) {
        WeiboLoginTransparentActivity.f19936k.a(oneKeyLoginActivity, 100);
        return g2.f100423a;
    }

    public static final g2 d1(OneKeyLoginActivity oneKeyLoginActivity, Void r11) {
        AccountVerificationActivity.a.v(AccountVerificationActivity.f19901o, oneKeyLoginActivity, VerificationType.LOGIN_EMAIL, null, null, 0, false, 102, 60, null);
        return g2.f100423a;
    }

    public static final g2 e1(OneKeyLoginActivity oneKeyLoginActivity, Boolean bool) {
        if (bool.booleanValue()) {
            e.o(oneKeyLoginActivity, true);
            oneKeyLoginActivity.finish();
        }
        return g2.f100423a;
    }

    public static final g2 f1(OneKeyLoginActivity oneKeyLoginActivity, Boolean bool) {
        if (bool.booleanValue()) {
            if (oneKeyLoginActivity.Y0().w() != VerificationType.BIND_PHONE_DIRECTLY) {
                Intent intent = new Intent();
                intent.putExtra("user_login_result", oneKeyLoginActivity.Y0().J());
                g2 g2Var = g2.f100423a;
                oneKeyLoginActivity.setResult(-1, intent);
            }
            oneKeyLoginActivity.finish();
        }
        return g2.f100423a;
    }

    public static final g2 g1(OneKeyLoginActivity oneKeyLoginActivity, Boolean bool) {
        g0.m(bool);
        LoadingDialogActivity.setLoading$default(oneKeyLoginActivity, bool.booleanValue(), 0L, null, 6, null);
        return g2.f100423a;
    }

    private final void h1() {
        SpannableString spannableString = new SpannableString("我已阅读并同意 " + Y0().D());
        spannableString.setSpan(new c(), 8, spannableString.length(), 34);
        TextView textView = X0().f55673b;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        textView.setLinkTextColor(Color.parseColor("#283044"));
    }

    private final void i1() {
        h1();
        X0().f55672a.D(new View.OnClickListener() { // from class: tf.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneKeyLoginActivity.j1(OneKeyLoginActivity.this, view);
            }
        });
        if (Y0().w() == VerificationType.BIND_PHONE_DIRECTLY_AUTO) {
            X0().f55672a.N(getString(R.string.verification_btn_skip));
            X0().f55672a.L(new View.OnClickListener() { // from class: tf.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneKeyLoginActivity.k1(OneKeyLoginActivity.this, view);
                }
            });
        }
        X0().f55686o.setOnClickListener(new View.OnClickListener() { // from class: tf.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneKeyLoginActivity.l1(OneKeyLoginActivity.this, view);
            }
        });
        X0().f55689r.setVisibility(Y0().R() ? 0 : 8);
        X0().f55679h.setVisibility(Y0().R() ? 0 : 8);
    }

    public static final void j1(OneKeyLoginActivity oneKeyLoginActivity, View view) {
        oneKeyLoginActivity.finish();
    }

    public static final void k1(OneKeyLoginActivity oneKeyLoginActivity, View view) {
        oneKeyLoginActivity.W0();
    }

    public static final void l1(OneKeyLoginActivity oneKeyLoginActivity, View view) {
        view.setSelected(!view.isSelected());
        oneKeyLoginActivity.Y0().Y(view.isSelected());
    }

    public static final l1 m1(OneKeyLoginActivity oneKeyLoginActivity) {
        return l1.e(oneKeyLoginActivity.getLayoutInflater());
    }

    public static final a0 n1(OneKeyLoginActivity oneKeyLoginActivity) {
        return (a0) new ViewModelProvider(oneKeyLoginActivity).get(a0.class);
    }

    public final l1 X0() {
        return (l1) this.f19948a.getValue();
    }

    public final a0 Y0() {
        return (a0) this.f19949b.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        qb.c.b(f19941f, "on result: " + i11 + j2.O + i12, new Object[0]);
        if (i11 == 100) {
            if (i12 == -1) {
                finish();
                return;
            } else {
                qb.c.q(f19941f, "weibo login result: canceled", new Object[0]);
                return;
            }
        }
        if (i11 != -1 && i11 == this.f19950c && i12 == -1) {
            setResult(-1, getIntent());
            finish();
        } else if ((i11 == 101 || i11 == 102) && i12 == -1) {
            if (i11 == 102) {
                e.o(this, true);
            }
            finish();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(X0().getRoot());
        X0().setLifecycleOwner(this);
        X0().j(Y0());
        a0 Y0 = Y0();
        Serializable serializableExtra = getIntent().getSerializableExtra(f19942g);
        VerificationType verificationType = serializableExtra instanceof VerificationType ? (VerificationType) serializableExtra : null;
        if (verificationType == null) {
            verificationType = VerificationType.LOGIN_PHONE_DIRECTLY;
        }
        Y0.d0(verificationType);
        a0 Y02 = Y0();
        Serializable serializableExtra2 = getIntent().getSerializableExtra("user_login_result");
        Y02.c0(serializableExtra2 instanceof UserLoginResult ? (UserLoginResult) serializableExtra2 : null);
        this.f19950c = getIntent().getIntExtra(f19944i, -1);
        i1();
        Z0();
        if (Y0().R()) {
            ma.l.c(t.f73023v, ma.a.f72778k2);
        }
    }
}
