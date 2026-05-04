package com.baicizhan.main.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.ActivityLifeController;
import com.baicizhan.client.business.util.SpKeys;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.baicizhan.main.auth.AccountVerificationActivity;
import com.baicizhan.main.customview.CountDownButton;
import com.baicizhan.online.thrift.basic.ErrorCode;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.unified_user_service.BindPhoneResult;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import gi.g0;
import java.io.Serializable;
import kc.d;
import kc.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.r;
import ma.t;
import org.junit.jupiter.api.j2;
import sa.q;
import tf.j0;
import u30.k0;
import w00.o;
import yg.y;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAccountVerificationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountVerificationActivity.kt\ncom/baicizhan/main/auth/AccountVerificationActivity\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,853:1\n18#2,3:854\n18#2,3:857\n18#2,3:860\n18#2,3:863\n18#2,3:866\n*S KotlinDebug\n*F\n+ 1 AccountVerificationActivity.kt\ncom/baicizhan/main/auth/AccountVerificationActivity\n*L\n229#1:854,3\n235#1:857,3\n297#1:860,3\n682#1:863,3\n703#1:866,3\n*E\n"})
/* loaded from: classes4.dex */
public final class AccountVerificationActivity extends BaseAppCompatActivity implements View.OnClickListener {

    @k
    public static final String A = "bind_user_login_info";

    @k
    public static final String B = "bind_user_for_result";

    @k
    public static final String C = "verify_tag";

    @k
    public static final String D = "hide_other";

    @k
    public static final String E = "user_login_result";

    @k
    public static final String F = "reset_account";

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f19901o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f19902p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final String f19903q = AccountVerificationActivity.class.getSimpleName();

    /* renamed from: r, reason: collision with root package name */
    public static final int f19904r = 100;

    /* renamed from: s, reason: collision with root package name */
    public static final int f19905s = 101;

    /* renamed from: t, reason: collision with root package name */
    public static final int f19906t = 102;

    /* renamed from: u, reason: collision with root package name */
    public static final int f19907u = 103;

    /* renamed from: v, reason: collision with root package name */
    public static final int f19908v = 60;

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final String f19909w = "verification_type";

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final String f19910x = "account";

    /* renamed from: y, reason: collision with root package name */
    @k
    public static final String f19911y = "token";

    /* renamed from: z, reason: collision with root package name */
    @k
    public static final String f19912z = "bind_type";

    /* renamed from: b, reason: collision with root package name */
    @l
    public String f19914b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f19915c;

    /* renamed from: d, reason: collision with root package name */
    public gs.e f19916d;

    /* renamed from: e, reason: collision with root package name */
    public y f19917e;

    /* renamed from: i, reason: collision with root package name */
    @l
    public View f19921i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public ThriftRequest<UnifiedUserService.Client, UserLoginResult> f19922j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public ThriftRequest<UnifiedUserService.Client, Integer> f19923k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19924l;

    /* renamed from: a, reason: collision with root package name */
    @k
    public VerificationType f19913a = VerificationType.LOGIN_PHONE;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c0 f19918f = e0.c(new x00.a() { // from class: sf.j
        @Override // x00.a
        public final Object invoke() {
            g0 P1;
            P1 = AccountVerificationActivity.P1(AccountVerificationActivity.this);
            return P1;
        }
    });

    /* renamed from: g, reason: collision with root package name */
    @k
    public final c0 f19919g = e0.c(new x00.a() { // from class: sf.k
        @Override // x00.a
        public final Object invoke() {
            int G1;
            G1 = AccountVerificationActivity.G1();
            return Integer.valueOf(G1);
        }
    });

    /* renamed from: h, reason: collision with root package name */
    @k
    public final c0 f19920h = e0.c(new x00.a() { // from class: sf.l
        @Override // x00.a
        public final Object invoke() {
            int H1;
            H1 = AccountVerificationActivity.H1();
            return Integer.valueOf(H1);
        }
    });

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Observer<UserLoginResult> f19925m = new Observer() { // from class: sf.m
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            AccountVerificationActivity.K1(AccountVerificationActivity.this, (UserLoginResult) obj);
        }
    };

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Observer<Triple<BindPhoneResult, UserLoginResult, Throwable>> f19926n = new Observer() { // from class: sf.n
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            AccountVerificationActivity.j1(AccountVerificationActivity.this, (Triple) obj);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ void f(a aVar, Context context, VerificationType verificationType, String str, String str2, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                str = null;
            }
            if ((i12 & 8) != 0) {
                str2 = null;
            }
            if ((i12 & 16) != 0) {
                i11 = -1;
            }
            if ((i12 & 32) != 0) {
                z11 = false;
            }
            aVar.e(context, verificationType, str, str2, i11, z11);
        }

        public static /* synthetic */ void h(a aVar, Activity activity, VerificationType verificationType, String str, int i11, UserLoginResult userLoginResult, int i12, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                str = null;
            }
            aVar.g(activity, verificationType, str, i11, userLoginResult, i12);
        }

        public static /* synthetic */ void m(a aVar, Fragment fragment, VerificationType verificationType, int i11, String str, String str2, int i12, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                str = null;
            }
            if ((i13 & 16) != 0) {
                str2 = null;
            }
            if ((i13 & 32) != 0) {
                i12 = -1;
            }
            aVar.l(fragment, verificationType, i11, str, str2, i12);
        }

        public static /* synthetic */ void v(a aVar, Activity activity, VerificationType verificationType, String str, String str2, int i11, boolean z11, int i12, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                str = null;
            }
            if ((i13 & 8) != 0) {
                str2 = null;
            }
            if ((i13 & 16) != 0) {
                i11 = -1;
            }
            if ((i13 & 32) != 0) {
                z11 = false;
            }
            if ((i13 & 64) != 0) {
                i12 = -1;
            }
            aVar.u(activity, verificationType, str, str2, i11, z11, i12);
        }

        @w00.k
        @o
        public final void a(@k Context context, @k VerificationType type) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            f(this, context, type, null, null, 0, false, 60, null);
        }

        @w00.k
        @o
        public final void b(@k Context context, @k VerificationType type, @l String str) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            f(this, context, type, str, null, 0, false, 56, null);
        }

        @w00.k
        @o
        public final void c(@k Context context, @k VerificationType type, @l String str, @l String str2) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            f(this, context, type, str, str2, 0, false, 48, null);
        }

        @w00.k
        @o
        public final void d(@k Context context, @k VerificationType type, @l String str, @l String str2, int i11) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            f(this, context, type, str, str2, i11, false, 32, null);
        }

        @w00.k
        @o
        public final void e(@k Context context, @k VerificationType type, @l String str, @l String str2, int i11, boolean z11) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            Intent intent = new Intent(context, (Class<?>) AccountVerificationActivity.class);
            intent.putExtra(AccountVerificationActivity.f19909w, type);
            intent.putExtra(AccountVerificationActivity.f19910x, str);
            intent.putExtra("token", str2);
            intent.putExtra(AccountVerificationActivity.f19912z, i11);
            intent.putExtra(AccountVerificationActivity.D, z11);
            context.startActivity(intent);
        }

        @o
        public final void g(@k Activity context, @k VerificationType type, @l String str, int i11, @k UserLoginResult userLoginResult, int i12) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            kotlin.jvm.internal.g0.p(userLoginResult, "userLoginResult");
            Intent intent = new Intent(context, (Class<?>) AccountVerificationActivity.class);
            intent.putExtra(AccountVerificationActivity.f19909w, type);
            intent.putExtra("token", str);
            intent.putExtra(AccountVerificationActivity.f19912z, i11);
            intent.putExtra(AccountVerificationActivity.A, userLoginResult);
            context.startActivityForResult(intent, i12);
        }

        @w00.k
        @o
        public final void i(@k Fragment fragment, @k VerificationType type, int i11) {
            kotlin.jvm.internal.g0.p(fragment, "fragment");
            kotlin.jvm.internal.g0.p(type, "type");
            m(this, fragment, type, i11, null, null, 0, 56, null);
        }

        @w00.k
        @o
        public final void j(@k Fragment fragment, @k VerificationType type, int i11, @l String str) {
            kotlin.jvm.internal.g0.p(fragment, "fragment");
            kotlin.jvm.internal.g0.p(type, "type");
            m(this, fragment, type, i11, str, null, 0, 48, null);
        }

        @w00.k
        @o
        public final void k(@k Fragment fragment, @k VerificationType type, int i11, @l String str, @l String str2) {
            kotlin.jvm.internal.g0.p(fragment, "fragment");
            kotlin.jvm.internal.g0.p(type, "type");
            m(this, fragment, type, i11, str, str2, 0, 32, null);
        }

        @w00.k
        @o
        public final void l(@k Fragment fragment, @k VerificationType type, int i11, @l String str, @l String str2, int i12) {
            kotlin.jvm.internal.g0.p(fragment, "fragment");
            kotlin.jvm.internal.g0.p(type, "type");
            Intent intent = new Intent(fragment.getContext(), (Class<?>) AccountVerificationActivity.class);
            intent.putExtra(AccountVerificationActivity.f19909w, type);
            intent.putExtra(AccountVerificationActivity.f19910x, str);
            intent.putExtra("token", str2);
            intent.putExtra(AccountVerificationActivity.f19912z, i12);
            intent.putExtra(AccountVerificationActivity.B, true);
            fragment.startActivityForResult(intent, i11);
        }

        public final void n(@k Activity context, @k String account, int i11) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(account, "account");
            Intent intent = new Intent(context, (Class<?>) AccountVerificationActivity.class);
            intent.putExtra(AccountVerificationActivity.f19909w, VerificationType.EMAIL_PASSWORD_RESET);
            intent.putExtra(AccountVerificationActivity.f19910x, account);
            context.startActivityForResult(intent, i11);
        }

        @o
        public final void o(@k Fragment fragment, @k String account, @k String tag, int i11) {
            kotlin.jvm.internal.g0.p(fragment, "fragment");
            kotlin.jvm.internal.g0.p(account, "account");
            kotlin.jvm.internal.g0.p(tag, "tag");
            Intent intent = new Intent(fragment.getContext(), (Class<?>) AccountVerificationActivity.class);
            intent.putExtra(AccountVerificationActivity.f19909w, VerificationType.VERIFY_PHONE_FOR_RESULT);
            intent.putExtra(AccountVerificationActivity.f19910x, account);
            intent.putExtra(AccountVerificationActivity.C, tag);
            fragment.startActivityForResult(intent, i11);
        }

        @w00.k
        @o
        public final void p(@k Activity context, @k VerificationType type) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            v(this, context, type, null, null, 0, false, 0, 124, null);
        }

        @w00.k
        @o
        public final void q(@k Activity context, @k VerificationType type, @l String str) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            v(this, context, type, str, null, 0, false, 0, 120, null);
        }

        @w00.k
        @o
        public final void r(@k Activity context, @k VerificationType type, @l String str, @l String str2) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            v(this, context, type, str, str2, 0, false, 0, 112, null);
        }

        @w00.k
        @o
        public final void s(@k Activity context, @k VerificationType type, @l String str, @l String str2, int i11) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            v(this, context, type, str, str2, i11, false, 0, 96, null);
        }

        @w00.k
        @o
        public final void t(@k Activity context, @k VerificationType type, @l String str, @l String str2, int i11, boolean z11) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            v(this, context, type, str, str2, i11, z11, 0, 64, null);
        }

        @w00.k
        @o
        public final void u(@k Activity context, @k VerificationType type, @l String str, @l String str2, int i11, boolean z11, int i12) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(type, "type");
            Intent intent = new Intent(context, (Class<?>) AccountVerificationActivity.class);
            intent.putExtra(AccountVerificationActivity.f19909w, type);
            intent.putExtra(AccountVerificationActivity.f19910x, str);
            intent.putExtra("token", str2);
            intent.putExtra(AccountVerificationActivity.f19912z, i11);
            intent.putExtra(AccountVerificationActivity.D, z11);
            context.startActivityForResult(intent, i12);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@k Editable s11) {
            kotlin.jvm.internal.g0.p(s11, "s");
            gs.e eVar = AccountVerificationActivity.this.f19916d;
            gs.e eVar2 = null;
            if (eVar == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar = null;
            }
            eVar.f54686v.setEnabled((AccountVerificationActivity.this.l1().length() == 0 || AccountVerificationActivity.this.r1().length() == 0 || (AccountVerificationActivity.this.f19913a == VerificationType.EMAIL_PASSWORD_RESET && AccountVerificationActivity.this.p1().length() <= 0)) ? false : true);
            gs.e eVar3 = AccountVerificationActivity.this.f19916d;
            if (eVar3 == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar3 = null;
            }
            ImageView accountClear = eVar3.f54667c;
            kotlin.jvm.internal.g0.o(accountClear, "accountClear");
            gs.e eVar4 = AccountVerificationActivity.this.f19916d;
            if (eVar4 == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar4 = null;
            }
            q.z(accountClear, eVar4.f54665a.isEnabled() && AccountVerificationActivity.this.l1().length() > 0);
            gs.e eVar5 = AccountVerificationActivity.this.f19916d;
            if (eVar5 == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar5 = null;
            }
            ImageView verifyCodeClear = eVar5.f54687w;
            kotlin.jvm.internal.g0.o(verifyCodeClear, "verifyCodeClear");
            q.z(verifyCodeClear, AccountVerificationActivity.this.r1().length() > 0);
            gs.e eVar6 = AccountVerificationActivity.this.f19916d;
            if (eVar6 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar2 = eVar6;
            }
            ImageView noproguardNewPasswordClear = eVar2.f54678n;
            kotlin.jvm.internal.g0.o(noproguardNewPasswordClear, "noproguardNewPasswordClear");
            q.z(noproguardNewPasswordClear, AccountVerificationActivity.this.p1().length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@k CharSequence s11, int i11, int i12, int i13) {
            kotlin.jvm.internal.g0.p(s11, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@k CharSequence s11, int i11, int i12, int i13) {
            kotlin.jvm.internal.g0.p(s11, "s");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19928a;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.BIND_PHONE_DIRECTLY_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationType.BIND_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_DIRECTLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationType.BIND_PHONE_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VerificationType.LOGIN_EMAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VerificationType.LOGIN_PHONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VerificationType.LOGIN_PHONE_PURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VerificationType.LOGIN_PHONE_DIRECTLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VerificationType.VERIFY_PHONE_FOR_RESULT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VerificationType.EMAIL_PASSWORD_RESET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f19928a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements CountDownButton.b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19929a;

        public d() {
        }

        @Override // com.baicizhan.main.customview.CountDownButton.b
        public void a(CountDownButton button) {
            kotlin.jvm.internal.g0.p(button, "button");
            button.setEnabled(AccountVerificationActivity.this.l1().length() > 0 || AccountVerificationActivity.this.f19924l);
            if (AccountVerificationActivity.this.f19924l) {
                AccountVerificationActivity.this.f19924l = false;
            }
            gs.e eVar = AccountVerificationActivity.this.f19916d;
            if (eVar == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar = null;
            }
            eVar.f54675k.setTextColor(AccountVerificationActivity.this.getResources().getColor(R.color.main_color_blue_light));
            this.f19929a = false;
        }

        @Override // com.baicizhan.main.customview.CountDownButton.b
        public void b(CountDownButton button, int i11) {
            kotlin.jvm.internal.g0.p(button, "button");
            if (this.f19929a) {
                return;
            }
            gs.e eVar = AccountVerificationActivity.this.f19916d;
            gs.e eVar2 = null;
            if (eVar == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar = null;
            }
            eVar.f54675k.setTextColor(-5131081);
            this.f19929a = true;
            if (AccountVerificationActivity.this.l1().length() > 0) {
                AccountVerificationActivity accountVerificationActivity = AccountVerificationActivity.this;
                gs.e eVar3 = accountVerificationActivity.f19916d;
                if (eVar3 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                } else {
                    eVar2 = eVar3;
                }
                EditText noproguardVerifyCode = eVar2.f54682r;
                kotlin.jvm.internal.g0.o(noproguardVerifyCode, "noproguardVerifyCode");
                accountVerificationActivity.T1(noproguardVerifyCode);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends ThriftRequest<UnifiedUserService.Client, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserLoginResult f19932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UserLoginResult userLoginResult) {
            super("/rpc/unified_user_service");
            this.f19932b = userLoginResult;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(UnifiedUserService.Client client) {
            AccountVerificationActivity accountVerificationActivity = AccountVerificationActivity.this;
            UserLoginResult userLoginResult = this.f19932b;
            UserRecord userRecord = new UserRecord();
            AccountVerificationActivity accountVerificationActivity2 = AccountVerificationActivity.this;
            userRecord.setLoginType(6);
            userRecord.setUser(accountVerificationActivity2.l1());
            g2 g2Var = g2.f100423a;
            gi.e.n(accountVerificationActivity, userLoginResult, 6, userRecord);
            return 0;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Integer num) {
            if (num == null || num.intValue() != 0) {
                va.g.g(R.string.verification_toast_login_failed, 0);
            } else {
                gi.e.o(AccountVerificationActivity.this, true);
                AccountVerificationActivity.this.finish();
            }
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exc) {
            AccountVerificationActivity.this.N1(exc);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends ThriftRequest<UnifiedUserService.Client, UserLoginResult> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserRecord f19934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(UserRecord userRecord) {
            super("/rpc/unified_user_service");
            this.f19934b = userRecord;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserLoginResult doInBackground(UnifiedUserService.Client client) {
            return gi.e.k(AccountVerificationActivity.this, client, this.f19934b, 0);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(UserLoginResult userLoginResult) {
            String str;
            qb.c.b(AccountVerificationActivity.f19903q, "Email login: force_bind_phone: " + (userLoginResult != null ? Integer.valueOf(userLoginResult.force_bind_phone) : null), new Object[0]);
            if (AccountVerificationActivity.this.isFinishing() || userLoginResult == null) {
                return;
            }
            if (userLoginResult.force_bind_phone == 0 || !((str = userLoginResult.phone) == null || str.length() == 0)) {
                AccountVerificationActivity.this.M1();
                return;
            }
            nc.b.b().j(SpKeys.VERIFICATION_LOGIN_BINDING_UNDONE, true);
            com.baicizhan.main.auth.onekey.a aVar = com.baicizhan.main.auth.onekey.a.f19954a;
            aVar.p(AccountVerificationActivity.this, VerificationType.BIND_PHONE_DIRECTLY_AUTO, userLoginResult, 102);
            r.g().n(userLoginResult.access_token);
            boolean i11 = aVar.i();
            j0 e11 = aVar.e();
            aVar.l(ma.a.f72793m3, i11, e11 != null ? e11.i() : null);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exc) {
            AccountVerificationActivity.this.N1(exc);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f19935a;

        public g(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f19935a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f19935a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19935a.invoke(obj);
        }
    }

    public static final void A1(AccountVerificationActivity accountVerificationActivity) {
        gs.e eVar = accountVerificationActivity.f19916d;
        gs.e eVar2 = null;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        eVar.f54665a.setText(accountVerificationActivity.f19914b);
        gs.e eVar3 = accountVerificationActivity.f19916d;
        if (eVar3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar3 = null;
        }
        ImageView accountClear = eVar3.f54667c;
        kotlin.jvm.internal.g0.o(accountClear, "accountClear");
        q.z(accountClear, false);
        gs.e eVar4 = accountVerificationActivity.f19916d;
        if (eVar4 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            eVar2 = eVar4;
        }
        eVar2.f54665a.setEnabled(false);
    }

    public static final void B1(AccountVerificationActivity accountVerificationActivity, View view) {
        accountVerificationActivity.onBackPressed();
    }

    public static final void C1(AccountVerificationActivity accountVerificationActivity, View view) {
        accountVerificationActivity.k1();
    }

    public static final boolean D1(AccountVerificationActivity accountVerificationActivity, View view, MotionEvent motionEvent) {
        accountVerificationActivity.s1();
        return false;
    }

    public static final boolean E1(AccountVerificationActivity accountVerificationActivity, TextView textView, int i11, KeyEvent keyEvent) {
        qb.c.i(f19903q, "%d ", Integer.valueOf(i11));
        gs.e eVar = accountVerificationActivity.f19916d;
        gs.e eVar2 = null;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        if (textView != eVar.f54665a || i11 != 5) {
            return false;
        }
        gs.e eVar3 = accountVerificationActivity.f19916d;
        if (eVar3 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            eVar2 = eVar3;
        }
        EditText noproguardVerifyCode = eVar2.f54682r;
        kotlin.jvm.internal.g0.o(noproguardVerifyCode, "noproguardVerifyCode");
        accountVerificationActivity.T1(noproguardVerifyCode);
        return true;
    }

    public static final void F1(AccountVerificationActivity accountVerificationActivity) {
        String l12 = accountVerificationActivity.l1();
        if (l12.length() > 0) {
            gs.e eVar = accountVerificationActivity.f19916d;
            if (eVar == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar = null;
            }
            eVar.f54665a.setSelection(l12.length());
        }
    }

    public static final int G1() {
        return 129;
    }

    public static final int H1() {
        return 145;
    }

    private final void I1(UserLoginResult userLoginResult) {
        ThriftRequest<UnifiedUserService.Client, Integer> thriftRequest = this.f19923k;
        if (thriftRequest != null) {
            thriftRequest.cancel();
        }
        com.baicizhan.client.business.thrift.r b11 = com.baicizhan.client.business.thrift.c.b();
        e eVar = new e(userLoginResult);
        this.f19923k = eVar;
        b11.a(eVar);
    }

    public static final void K1(AccountVerificationActivity accountVerificationActivity, UserLoginResult userLoginResult) {
        if (userLoginResult != null) {
            accountVerificationActivity.I1(userLoginResult);
        }
    }

    public static final void L1(AccountVerificationActivity accountVerificationActivity) {
        qb.c.q(f19903q, "direct auto binding failed", new Object[0]);
        ThirdPartyUserInfo.clearThirdPartyLoginCache(accountVerificationActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1(Exception exc) {
        LoadingDialogActivity.setLoading$default(this, false, 0L, null, 6, null);
        qb.c.p(f19903q, "onServerError ", exc);
        va.g.j(exc, 0);
        q1().b();
    }

    public static final g0 P1(AccountVerificationActivity accountVerificationActivity) {
        return new g0(accountVerificationActivity);
    }

    public static final g2 R1(AccountVerificationActivity accountVerificationActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        gs.e eVar = accountVerificationActivity.f19916d;
        gs.e eVar2 = null;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        eVar.f54665a.setText((CharSequence) null);
        gs.e eVar3 = accountVerificationActivity.f19916d;
        if (eVar3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar3 = null;
        }
        eVar3.f54682r.setText((CharSequence) null);
        gs.e eVar4 = accountVerificationActivity.f19916d;
        if (eVar4 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            eVar2 = eVar4;
        }
        EmailAutoCompleteEditText account = eVar2.f54665a;
        kotlin.jvm.internal.g0.o(account, "account");
        accountVerificationActivity.T1(account);
        ma.l.a(t.f73023v, ma.a.A2);
        return g2.f100423a;
    }

    public static final g2 S1(AccountVerificationActivity accountVerificationActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        gi.e.t(accountVerificationActivity);
        ma.l.a(t.f73023v, ma.a.B2);
        a.f(f19901o, accountVerificationActivity, VerificationType.LOGIN_PHONE_PURE, accountVerificationActivity.l1(), null, 0, false, 56, null);
        accountVerificationActivity.finish();
        return g2.f100423a;
    }

    @w00.k
    @o
    public static final void U1(@k Context context, @k VerificationType verificationType) {
        f19901o.a(context, verificationType);
    }

    @w00.k
    @o
    public static final void V1(@k Context context, @k VerificationType verificationType, @l String str) {
        f19901o.b(context, verificationType, str);
    }

    @w00.k
    @o
    public static final void W1(@k Context context, @k VerificationType verificationType, @l String str, @l String str2) {
        f19901o.c(context, verificationType, str, str2);
    }

    @w00.k
    @o
    public static final void X1(@k Context context, @k VerificationType verificationType, @l String str, @l String str2, int i11) {
        f19901o.d(context, verificationType, str, str2, i11);
    }

    @w00.k
    @o
    public static final void Y1(@k Context context, @k VerificationType verificationType, @l String str, @l String str2, int i11, boolean z11) {
        f19901o.e(context, verificationType, str, str2, i11, z11);
    }

    @o
    public static final void Z1(@k Activity activity, @k VerificationType verificationType, @l String str, int i11, @k UserLoginResult userLoginResult, int i12) {
        f19901o.g(activity, verificationType, str, i11, userLoginResult, i12);
    }

    @w00.k
    @o
    public static final void a2(@k Fragment fragment, @k VerificationType verificationType, int i11) {
        f19901o.i(fragment, verificationType, i11);
    }

    @w00.k
    @o
    public static final void b2(@k Fragment fragment, @k VerificationType verificationType, int i11, @l String str) {
        f19901o.j(fragment, verificationType, i11, str);
    }

    @w00.k
    @o
    public static final void c2(@k Fragment fragment, @k VerificationType verificationType, int i11, @l String str, @l String str2) {
        f19901o.k(fragment, verificationType, i11, str, str2);
    }

    @w00.k
    @o
    public static final void d2(@k Fragment fragment, @k VerificationType verificationType, int i11, @l String str, @l String str2, int i12) {
        f19901o.l(fragment, verificationType, i11, str, str2, i12);
    }

    @o
    public static final void e2(@k Fragment fragment, @k String str, @k String str2, int i11) {
        f19901o.o(fragment, str, str2, i11);
    }

    @w00.k
    @o
    public static final void f2(@k Activity activity, @k VerificationType verificationType) {
        f19901o.p(activity, verificationType);
    }

    @w00.k
    @o
    public static final void g2(@k Activity activity, @k VerificationType verificationType, @l String str) {
        f19901o.q(activity, verificationType, str);
    }

    @w00.k
    @o
    public static final void h2(@k Activity activity, @k VerificationType verificationType, @l String str, @l String str2) {
        f19901o.r(activity, verificationType, str, str2);
    }

    @w00.k
    @o
    public static final void i2(@k Activity activity, @k VerificationType verificationType, @l String str, @l String str2, int i11) {
        f19901o.s(activity, verificationType, str, str2, i11);
    }

    public static final void j1(AccountVerificationActivity accountVerificationActivity, Triple it) {
        kotlin.jvm.internal.g0.p(it, "it");
        BindPhoneResult bindPhoneResult = (BindPhoneResult) it.getFirst();
        String str = bindPhoneResult != null ? bindPhoneResult.phone : null;
        boolean z11 = true;
        if (str == null || str.length() == 0) {
            VerificationType verificationType = accountVerificationActivity.f19913a;
            if (verificationType != VerificationType.BIND_PHONE_AUTO && verificationType != VerificationType.BIND_PHONE_DIRECTLY_AUTO && verificationType != VerificationType.LOGIN_EMAIL) {
                z11 = false;
            }
            Throwable th2 = (Throwable) it.getThird();
            if (th2 != null) {
                LogicException logicException = th2 instanceof LogicException ? (LogicException) th2 : null;
                if (logicException != null && logicException.getCode() == ErrorCode.ALREADY_IN_USE.getValue() && z11) {
                    accountVerificationActivity.Q1();
                    return;
                } else {
                    va.g.k(th2, R.string.verification_toast_bind_failed, 0);
                    return;
                }
            }
            return;
        }
        va.g.g(R.string.user_center_bind_success, 0);
        VerificationType verificationType2 = accountVerificationActivity.f19913a;
        int[] iArr = c.f19928a;
        int i11 = iArr[verificationType2.ordinal()];
        if (i11 == 1) {
            ma.l.a(t.f73023v, ma.a.f72862w2);
        } else if (i11 == 2) {
            ma.l.a(t.f73023v, ma.a.f72841t2);
        } else if (i11 == 3 || i11 == 4) {
            ma.l.a(t.f73023v, ma.a.E2);
        } else if (i11 == 5) {
            ma.l.a(t.f73023v, ma.a.G2);
        }
        int i12 = iArr[accountVerificationActivity.f19913a.ordinal()];
        if (i12 == 2 || i12 == 3 || i12 == 5) {
            accountVerificationActivity.setResult(-1);
            accountVerificationActivity.finish();
            return;
        }
        if (i12 == 6) {
            nc.b.b().j(SpKeys.VERIFICATION_LOGIN_BINDING_UNDONE, false);
            accountVerificationActivity.M1();
            return;
        }
        Intent intent = new Intent();
        Serializable serializable = (UserLoginResult) it.getSecond();
        if (serializable == null) {
            serializable = accountVerificationActivity.getIntent().getSerializableExtra(A);
        }
        intent.putExtra("user_login_result", serializable);
        g2 g2Var = g2.f100423a;
        accountVerificationActivity.setResult(-1, intent);
        accountVerificationActivity.finish();
    }

    @w00.k
    @o
    public static final void j2(@k Activity activity, @k VerificationType verificationType, @l String str, @l String str2, int i11, boolean z11) {
        f19901o.t(activity, verificationType, str, str2, i11, z11);
    }

    @w00.k
    @o
    public static final void k2(@k Activity activity, @k VerificationType verificationType, @l String str, @l String str2, int i11, boolean z11, int i12) {
        f19901o.u(activity, verificationType, str, str2, i11, z11, i12);
    }

    private final g0 q1() {
        return (g0) this.f19918f.getValue();
    }

    private final void s1() {
        View view = this.f19921i;
        if (view != null) {
            SystemUtil.hideIME(view);
            return;
        }
        gs.e eVar = this.f19916d;
        gs.e eVar2 = null;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        SystemUtil.hideIME(eVar.f54665a);
        gs.e eVar3 = this.f19916d;
        if (eVar3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar3 = null;
        }
        SystemUtil.hideIME(eVar3.f54682r);
        gs.e eVar4 = this.f19916d;
        if (eVar4 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            eVar2 = eVar4;
        }
        SystemUtil.hideIME(eVar2.f54677m);
    }

    public static final g2 u1(AccountVerificationActivity accountVerificationActivity, Boolean bool) {
        qb.c.b(f19903q, "loadingState: " + bool, new Object[0]);
        LoadingDialogActivity.setLoading$default(accountVerificationActivity, kotlin.jvm.internal.g0.g(bool, Boolean.TRUE), 500L, null, 4, null);
        return g2.f100423a;
    }

    public static final g2 v1(AccountVerificationActivity accountVerificationActivity, Pair pair) {
        Throwable th2;
        gs.e eVar = null;
        if (pair != null ? kotlin.jvm.internal.g0.g(pair.getFirst(), Boolean.TRUE) : false) {
            gs.e eVar2 = accountVerificationActivity.f19916d;
            if (eVar2 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar = eVar2;
            }
            eVar.f54675k.j(60);
        } else {
            if ((pair != null ? (Boolean) pair.getFirst() : null) == null) {
                VerificationType verificationType = accountVerificationActivity.f19913a;
                VerificationType verificationType2 = VerificationType.BIND_PHONE_AUTO;
                if (verificationType == verificationType2 || verificationType == VerificationType.BIND_PHONE_DIRECTLY_AUTO) {
                    if (verificationType == VerificationType.BIND_PHONE_DIRECTLY_AUTO) {
                        ma.l.a(t.f73023v, ma.a.f72869x2);
                    } else if (verificationType == verificationType2) {
                        ma.l.a(t.f73023v, ma.a.f72848u2);
                    }
                    accountVerificationActivity.Q1();
                } else if (pair != null && (th2 = (Throwable) pair.getSecond()) != null) {
                    va.g.j(th2, 0);
                }
            }
        }
        return g2.f100423a;
    }

    public static final g2 w1(AccountVerificationActivity accountVerificationActivity, Boolean bool) {
        if (kotlin.jvm.internal.g0.g(bool, Boolean.TRUE)) {
            gs.e eVar = accountVerificationActivity.f19916d;
            if (eVar == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar = null;
            }
            eVar.f54675k.j(60);
        }
        return g2.f100423a;
    }

    public static final g2 x1(AccountVerificationActivity accountVerificationActivity, Boolean bool) {
        if (kotlin.jvm.internal.g0.g(bool, Boolean.TRUE)) {
            accountVerificationActivity.setResult(-1);
            accountVerificationActivity.finish();
        }
        return g2.f100423a;
    }

    public static final g2 y1(AccountVerificationActivity accountVerificationActivity, Boolean bool) {
        if (kotlin.jvm.internal.g0.g(bool, Boolean.TRUE)) {
            va.g.g(R.string.verification_toast_reset_password_success, 0);
            Intent intent = new Intent();
            intent.putExtra(F, accountVerificationActivity.l1());
            g2 g2Var = g2.f100423a;
            accountVerificationActivity.setResult(-1, intent);
            accountVerificationActivity.finish();
        }
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04c6  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z1() {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.auth.AccountVerificationActivity.z1():void");
    }

    public final void J1() {
        String l12 = l1();
        String r12 = r1();
        if (!StringUtil.isValidEmailAddr(l12) && !StringUtil.isValidMobilePhone(l12)) {
            va.g.g(R.string.verification_toast_account_format_error, 0);
            gs.e eVar = this.f19916d;
            if (eVar == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar = null;
            }
            EmailAutoCompleteEditText account = eVar.f54665a;
            kotlin.jvm.internal.g0.o(account, "account");
            T1(account);
            return;
        }
        LoadingDialogActivity.setLoading$default(this, true, 500L, null, 4, null);
        UserRecord userRecord = new UserRecord();
        userRecord.setUser(l12);
        userRecord.setPasswordMD5(StringUtil.md5Hex(r12, true));
        userRecord.setLoginType(StringUtil.isValidEmailAddr(l12) ? 0 : 6);
        ThriftRequest<UnifiedUserService.Client, UserLoginResult> thriftRequest = this.f19922j;
        if (thriftRequest != null) {
            thriftRequest.cancel();
        }
        com.baicizhan.client.business.thrift.r b11 = com.baicizhan.client.business.thrift.c.b();
        f fVar = new f(userRecord);
        this.f19922j = fVar;
        b11.a(fVar);
    }

    public final void M1() {
        LoadingDialogActivity.setLoading$default(this, false, 0L, null, 6, null);
        setResult(-1);
        finish();
    }

    public final void O1() {
        gs.e eVar = null;
        gs.e eVar2 = null;
        y yVar = null;
        if (!StringUtil.isValidEmailAddr(l1())) {
            va.g.i(getResources().getString(R.string.verification_toast_account_format_error), 0);
            gs.e eVar3 = this.f19916d;
            if (eVar3 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar2 = eVar3;
            }
            EmailAutoCompleteEditText account = eVar2.f54665a;
            kotlin.jvm.internal.g0.o(account, "account");
            T1(account);
            return;
        }
        int length = p1().length();
        if (6 <= length && length < 36) {
            y yVar2 = this.f19917e;
            if (yVar2 == null) {
                kotlin.jvm.internal.g0.S("model");
            } else {
                yVar = yVar2;
            }
            yVar.c0(l1(), p1(), r1());
            return;
        }
        va.g.i(getResources().getString(R.string.main_password_length_error), 0);
        gs.e eVar4 = this.f19916d;
        if (eVar4 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            eVar = eVar4;
        }
        EditText noproguardNewPassword = eVar.f54677m;
        kotlin.jvm.internal.g0.o(noproguardNewPassword, "noproguardNewPassword");
        T1(noproguardNewPassword);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kc.d, kc.h] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kc.d$a] */
    public final void Q1() {
        mc.a.p(this, ((u.a) d.a.I(mc.a.f(this).U(R.string.verification_dialog_already_bound_tip).o(R.string.verification_dialog_already_bound_cancel, new x00.l() { // from class: sf.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 R1;
                R1 = AccountVerificationActivity.R1(AccountVerificationActivity.this, (View) obj);
                return R1;
            }
        }), R.string.verification_dialog_already_bound_ok, null, new x00.l() { // from class: sf.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 S1;
                S1 = AccountVerificationActivity.S1(AccountVerificationActivity.this, (View) obj);
                return S1;
            }
        }, 2, null)).d(), null, 2, null);
        ma.l.a(t.f73023v, ma.a.f72883z2);
    }

    public final void T1(View view) {
        view.requestFocus();
        SystemUtil.showIME(view);
        this.f19921i = view;
    }

    public final void k1() {
        Intent intent = new Intent();
        intent.putExtra("user_login_result", getIntent().getSerializableExtra(A));
        g2 g2Var = g2.f100423a;
        setResult(-1, intent);
        finish();
    }

    public final String l1() {
        String obj;
        String obj2;
        gs.e eVar = this.f19916d;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        Editable text = eVar.f54665a.getText();
        return (text == null || (obj = text.toString()) == null || (obj2 = k0.b6(obj).toString()) == null) ? "" : obj2;
    }

    public final void m1() {
        SmsCaptcha smsCaptcha;
        gs.e eVar = this.f19916d;
        String str = null;
        y yVar = null;
        str = null;
        str = null;
        str = null;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        eVar.f54665a.clearFocus();
        gs.e eVar2 = this.f19916d;
        if (eVar2 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar2 = null;
        }
        String textToComplete = eVar2.f54665a.getTextToComplete();
        kotlin.jvm.internal.g0.o(textToComplete, "getTextToComplete(...)");
        if (textToComplete.length() == 0) {
            va.g.g(R.string.verification_toast_account_empty, 0);
            return;
        }
        if (this.f19913a == VerificationType.EMAIL_PASSWORD_RESET) {
            if (!StringUtil.isValidEmailAddr(textToComplete)) {
                va.g.g(R.string.verification_toast_account_format_error, 0);
                return;
            }
            y yVar2 = this.f19917e;
            if (yVar2 == null) {
                kotlin.jvm.internal.g0.S("model");
            } else {
                yVar = yVar2;
            }
            yVar.X(textToComplete);
            return;
        }
        if (!StringUtil.isValidMobilePhone(textToComplete)) {
            va.g.g(R.string.verification_toast_account_format_error, 0);
            return;
        }
        y yVar3 = this.f19917e;
        if (yVar3 == null) {
            kotlin.jvm.internal.g0.S("model");
            yVar3 = null;
        }
        switch (c.f19928a[this.f19913a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                smsCaptcha = SmsCaptcha.NEW_BINDING;
                break;
            case 6:
            default:
                throw new RuntimeException("not supported type: " + this.f19913a);
            case 7:
            case 8:
            case 9:
                smsCaptcha = SmsCaptcha.LOGIN_OR_REG;
                break;
            case 10:
                smsCaptcha = SmsCaptcha.SECURITY_VERIFICATION;
                break;
        }
        VerificationType verificationType = this.f19913a;
        if (verificationType != VerificationType.LOGIN_PHONE && verificationType != VerificationType.LOGIN_PHONE_PURE && verificationType != VerificationType.LOGIN_PHONE_DIRECTLY && verificationType != VerificationType.VERIFY_PHONE_FOR_RESULT) {
            str = this.f19915c;
        }
        yVar3.R(textToComplete, smsCaptcha, str);
    }

    public final int n1() {
        return ((Number) this.f19919g.getValue()).intValue();
    }

    public final int o1() {
        return ((Number) this.f19920h.getValue()).intValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        String str = f19903q;
        qb.c.b(str, "on result: " + i11 + j2.O + i12, new Object[0]);
        gs.e eVar = null;
        switch (i11) {
            case 100:
                if (i12 != -1) {
                    qb.c.q(str, "weibo login result: canceled", new Object[0]);
                    break;
                } else {
                    finish();
                    break;
                }
            case 101:
                if (i12 == -1) {
                    String stringExtra = intent != null ? intent.getStringExtra(F) : null;
                    if (stringExtra != null && stringExtra.length() != 0) {
                        gs.e eVar2 = this.f19916d;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.g0.S("binding");
                            eVar2 = null;
                        }
                        eVar2.f54665a.setText(stringExtra);
                        gs.e eVar3 = this.f19916d;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.g0.S("binding");
                        } else {
                            eVar = eVar3;
                        }
                        eVar.f54682r.requestFocus();
                        break;
                    }
                }
                break;
            case 102:
                if (i12 != -1) {
                    L1(this);
                    LoadingDialogActivity.setLoading$default(this, false, 0L, null, 6, null);
                    if (this.f19913a == VerificationType.LOGIN_EMAIL) {
                        gi.e.t(this);
                        nc.b.b().j(SpKeys.VERIFICATION_LOGIN_BINDING_UNDONE, false);
                        break;
                    }
                } else if (intent == null) {
                    L1(this);
                    break;
                } else {
                    Serializable serializableExtra = intent.getSerializableExtra("user_login_result");
                    if ((serializableExtra instanceof UserLoginResult ? (UserLoginResult) serializableExtra : null) != null && !isFinishing()) {
                        nc.b.b().j(SpKeys.VERIFICATION_LOGIN_BINDING_UNDONE, false);
                        M1();
                        break;
                    } else {
                        L1(this);
                        break;
                    }
                }
                break;
            case 103:
                if (i12 != -1) {
                    qb.c.b(str, "mail login no result...", new Object[0]);
                    break;
                } else {
                    gi.e.o(this, true);
                    finish();
                    break;
                }
            default:
                qb.c.q(str, "unknown request: " + i11, new Object[0]);
                break;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        s1();
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l View view) {
        gs.e eVar = this.f19916d;
        String str = null;
        gs.e eVar2 = null;
        gs.e eVar3 = null;
        gs.e eVar4 = null;
        gs.e eVar5 = null;
        gs.e eVar6 = null;
        y yVar = null;
        y yVar2 = null;
        y yVar3 = null;
        str = null;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar.f54667c)) {
            gs.e eVar7 = this.f19916d;
            if (eVar7 == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar7 = null;
            }
            eVar7.f54665a.setText((CharSequence) null);
            gs.e eVar8 = this.f19916d;
            if (eVar8 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar2 = eVar8;
            }
            EmailAutoCompleteEditText account = eVar2.f54665a;
            kotlin.jvm.internal.g0.o(account, "account");
            T1(account);
            return;
        }
        gs.e eVar9 = this.f19916d;
        if (eVar9 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar9 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar9.f54687w)) {
            gs.e eVar10 = this.f19916d;
            if (eVar10 == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar10 = null;
            }
            eVar10.f54682r.setText((CharSequence) null);
            gs.e eVar11 = this.f19916d;
            if (eVar11 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar3 = eVar11;
            }
            EditText noproguardVerifyCode = eVar3.f54682r;
            kotlin.jvm.internal.g0.o(noproguardVerifyCode, "noproguardVerifyCode");
            T1(noproguardVerifyCode);
            return;
        }
        gs.e eVar12 = this.f19916d;
        if (eVar12 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar12 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar12.f54678n)) {
            gs.e eVar13 = this.f19916d;
            if (eVar13 == null) {
                kotlin.jvm.internal.g0.S("binding");
                eVar13 = null;
            }
            eVar13.f54677m.setText((CharSequence) null);
            gs.e eVar14 = this.f19916d;
            if (eVar14 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar4 = eVar14;
            }
            EditText noproguardNewPassword = eVar4.f54677m;
            kotlin.jvm.internal.g0.o(noproguardNewPassword, "noproguardNewPassword");
            T1(noproguardNewPassword);
            return;
        }
        gs.e eVar15 = this.f19916d;
        if (eVar15 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar15 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar15.f54675k)) {
            m1();
            return;
        }
        gs.e eVar16 = this.f19916d;
        if (eVar16 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar16 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar16.f54680p)) {
            view.setSelected(!view.isSelected());
            if (view.isSelected()) {
                gs.e eVar17 = this.f19916d;
                if (eVar17 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    eVar17 = null;
                }
                eVar17.f54682r.setInputType(o1());
            } else {
                gs.e eVar18 = this.f19916d;
                if (eVar18 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    eVar18 = null;
                }
                eVar18.f54682r.setInputType(n1());
            }
            gs.e eVar19 = this.f19916d;
            if (eVar19 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar5 = eVar19;
            }
            eVar5.f54682r.setSelection(r1().length());
            return;
        }
        gs.e eVar20 = this.f19916d;
        if (eVar20 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar20 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar20.f54679o)) {
            view.setSelected(!view.isSelected());
            if (view.isSelected()) {
                gs.e eVar21 = this.f19916d;
                if (eVar21 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    eVar21 = null;
                }
                eVar21.f54677m.setInputType(o1());
            } else {
                gs.e eVar22 = this.f19916d;
                if (eVar22 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    eVar22 = null;
                }
                eVar22.f54677m.setInputType(n1());
            }
            gs.e eVar23 = this.f19916d;
            if (eVar23 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                eVar6 = eVar23;
            }
            eVar6.f54677m.setSelection(p1().length());
            return;
        }
        gs.e eVar24 = this.f19916d;
        if (eVar24 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar24 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar24.f54686v)) {
            s1();
            switch (c.f19928a[this.f19913a.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    y yVar4 = this.f19917e;
                    if (yVar4 == null) {
                        kotlin.jvm.internal.g0.S("model");
                    } else {
                        yVar3 = yVar4;
                    }
                    yVar3.z(l1(), r1(), this.f19915c);
                    return;
                case 6:
                    J1();
                    return;
                case 7:
                case 8:
                case 9:
                    y yVar5 = this.f19917e;
                    if (yVar5 == null) {
                        kotlin.jvm.internal.g0.S("model");
                    } else {
                        yVar2 = yVar5;
                    }
                    yVar2.M(l1(), r1());
                    return;
                case 10:
                    y yVar6 = this.f19917e;
                    if (yVar6 == null) {
                        kotlin.jvm.internal.g0.S("model");
                    } else {
                        yVar = yVar6;
                    }
                    yVar.i0(l1(), r1());
                    return;
                case 11:
                    O1();
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        gs.e eVar25 = this.f19916d;
        if (eVar25 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar25 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar25.f54689y)) {
            WeiboLoginTransparentActivity.f19936k.a(this, 100);
            return;
        }
        gs.e eVar26 = this.f19916d;
        if (eVar26 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar26 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar26.f54674j)) {
            a.v(f19901o, this, VerificationType.LOGIN_EMAIL, null, null, 0, false, 103, 60, null);
            return;
        }
        gs.e eVar27 = this.f19916d;
        if (eVar27 == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar27 = null;
        }
        if (kotlin.jvm.internal.g0.g(view, eVar27.f54673i)) {
            a aVar = f19901o;
            String l12 = l1();
            if (l12 != null && l12.length() != 0) {
                str = StringUtil.isValidEmailAddr(l12) ? l12 : "";
            }
            aVar.n(this, str != null ? str : "", 101);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ActivityLifeController.get().register(this);
        this.f19917e = (y) new ViewModelProvider(this).get(y.class);
        t1();
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_account_verification);
        kotlin.jvm.internal.g0.o(contentView, "setContentView(...)");
        this.f19916d = (gs.e) contentView;
        Serializable serializableExtra = getIntent().getSerializableExtra(f19909w);
        VerificationType verificationType = serializableExtra instanceof VerificationType ? (VerificationType) serializableExtra : null;
        if (verificationType == null) {
            verificationType = VerificationType.LOGIN_PHONE;
        }
        this.f19913a = verificationType;
        this.f19914b = getIntent().getStringExtra(f19910x);
        this.f19915c = getIntent().getStringExtra("token");
        int intExtra = getIntent().getIntExtra("test_type", -1);
        if (intExtra >= 0) {
            this.f19913a = VerificationType.values()[intExtra];
        }
        String stringExtra = getIntent().getStringExtra("test_phone");
        if (stringExtra != null && stringExtra.length() != 0) {
            this.f19914b = stringExtra;
        }
        z1();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityLifeController.get().unregister(this);
    }

    public final String p1() {
        String obj;
        String obj2;
        gs.e eVar = this.f19916d;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        Editable text = eVar.f54677m.getText();
        return (text == null || (obj = text.toString()) == null || (obj2 = k0.b6(obj).toString()) == null) ? "" : obj2;
    }

    public final String r1() {
        String obj;
        String obj2;
        gs.e eVar = this.f19916d;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            eVar = null;
        }
        Editable text = eVar.f54682r.getText();
        return (text == null || (obj = text.toString()) == null || (obj2 = k0.b6(obj).toString()) == null) ? "" : obj2;
    }

    public final void t1() {
        y yVar = this.f19917e;
        y yVar2 = null;
        if (yVar == null) {
            kotlin.jvm.internal.g0.S("model");
            yVar = null;
        }
        yVar.G().observe(this, new g(new x00.l() { // from class: sf.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u12;
                u12 = AccountVerificationActivity.u1(AccountVerificationActivity.this, (Boolean) obj);
                return u12;
            }
        }));
        y yVar3 = this.f19917e;
        if (yVar3 == null) {
            kotlin.jvm.internal.g0.S("model");
            yVar3 = null;
        }
        yVar3.L().observe(this, new g(new x00.l() { // from class: sf.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v12;
                v12 = AccountVerificationActivity.v1(AccountVerificationActivity.this, (Pair) obj);
                return v12;
            }
        }));
        y yVar4 = this.f19917e;
        if (yVar4 == null) {
            kotlin.jvm.internal.g0.S("model");
            yVar4 = null;
        }
        yVar4.I().observe(this, new g(new x00.l() { // from class: sf.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 w12;
                w12 = AccountVerificationActivity.w1(AccountVerificationActivity.this, (Boolean) obj);
                return w12;
            }
        }));
        y yVar5 = this.f19917e;
        if (yVar5 == null) {
            kotlin.jvm.internal.g0.S("model");
            yVar5 = null;
        }
        yVar5.H().observe(this, this.f19925m);
        y yVar6 = this.f19917e;
        if (yVar6 == null) {
            kotlin.jvm.internal.g0.S("model");
            yVar6 = null;
        }
        yVar6.F().observe(this, this.f19926n);
        y yVar7 = this.f19917e;
        if (yVar7 == null) {
            kotlin.jvm.internal.g0.S("model");
            yVar7 = null;
        }
        yVar7.J().observe(this, new g(new x00.l() { // from class: sf.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x12;
                x12 = AccountVerificationActivity.x1(AccountVerificationActivity.this, (Boolean) obj);
                return x12;
            }
        }));
        y yVar8 = this.f19917e;
        if (yVar8 == null) {
            kotlin.jvm.internal.g0.S("model");
        } else {
            yVar2 = yVar8;
        }
        yVar2.K().observe(this, new g(new x00.l() { // from class: sf.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 y12;
                y12 = AccountVerificationActivity.y1(AccountVerificationActivity.this, (Boolean) obj);
                return y12;
            }
        }));
    }
}
