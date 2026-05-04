package b9;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import c9.a;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public static AccountAuthService f6473b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static AccountAuthParams f6474c;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public static a.InterfaceC0141a f6477f;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g f6472a = new g();

    /* renamed from: d, reason: collision with root package name */
    public static final int f6475d = 1000;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f6476e = "HwAuthHelper";

    /* renamed from: g, reason: collision with root package name */
    public static final int f6478g = 8;

    public static final void f(AuthAccount authAccount) {
        g gVar = f6472a;
        g0.m(authAccount);
        gVar.c(authAccount);
    }

    public static final void g(Activity activity, Exception exc) {
        if (exc instanceof ApiException) {
            AccountAuthService accountAuthService = f6473b;
            g0.m(accountAuthService);
            Intent signInIntent = accountAuthService.getSignInIntent();
            signInIntent.putExtra("intent.extra.isfullscreen", true);
            activity.startActivityForResult(signInIntent, f6475d);
        }
    }

    public final void c(AuthAccount authAccount) {
        qb.c.b(f6476e, "dealWithResultOfSignIn:" + authAccount.getUnionId(), new Object[0]);
        ThirdPartyUserInfo thirdPartyUserInfo = new ThirdPartyUserInfo();
        thirdPartyUserInfo.loginType = 7;
        thirdPartyUserInfo.provider = "huawei";
        String displayName = authAccount.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        thirdPartyUserInfo.nickName = displayName;
        String avatarUriString = authAccount.getAvatarUriString();
        thirdPartyUserInfo.imageUrl = avatarUriString != null ? avatarUriString : "";
        thirdPartyUserInfo.gender = "3";
        thirdPartyUserInfo.authorizationCode = authAccount.getAuthorizationCode();
        a.InterfaceC0141a interfaceC0141a = f6477f;
        if (interfaceC0141a != null) {
            interfaceC0141a.onComplete(thirdPartyUserInfo);
        }
    }

    public final void d(int i11, int i12, @m80.k Intent data) {
        g0.p(data, "data");
        int i13 = f6475d;
        if (i11 == i13) {
            String str = f6476e;
            qb.c.i(str, "onActivitResult of sigInInIntent, request code: " + i13, new Object[0]);
            fr.k<AuthAccount> parseAuthResultFromIntent = AccountAuthManager.parseAuthResultFromIntent(data);
            if (parseAuthResultFromIntent.isSuccessful()) {
                AuthAccount result = parseAuthResultFromIntent.getResult();
                g0.m(result);
                c(result);
                qb.c.i(str, "onActivitResult of sigInInIntent, request code: " + i13, new Object[0]);
                return;
            }
            a.InterfaceC0141a interfaceC0141a = f6477f;
            if (interfaceC0141a != null) {
                Exception exception = parseAuthResultFromIntent.getException();
                g0.n(exception, "null cannot be cast to non-null type com.huawei.hms.common.ApiException");
                interfaceC0141a.onError(new Throwable(((ApiException) exception).getMessage()));
            }
            Exception exception2 = parseAuthResultFromIntent.getException();
            g0.n(exception2, "null cannot be cast to non-null type com.huawei.hms.common.ApiException");
            qb.c.d(str, "sign in failed : " + ((ApiException) exception2).getStatusCode(), new Object[0]);
        }
    }

    public final void e(@m80.k final Activity activity, @m80.k a.InterfaceC0141a callback) {
        g0.p(activity, "activity");
        g0.p(callback, "callback");
        f6477f = callback;
        callback.onStart();
        AccountAuthParams createParams = new AccountAuthParamsHelper(AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setAuthorizationCode().createParams();
        f6474c = createParams;
        AccountAuthService service = AccountAuthManager.getService(activity, createParams);
        f6473b = service;
        fr.k<AuthAccount> silentSignIn = service != null ? service.silentSignIn() : null;
        if (silentSignIn != null) {
            silentSignIn.addOnSuccessListener(new fr.i() { // from class: b9.e
                @Override // fr.i
                public final void onSuccess(Object obj) {
                    g.f((AuthAccount) obj);
                }
            });
        }
        if (silentSignIn != null) {
            silentSignIn.addOnFailureListener(new fr.h() { // from class: b9.f
                @Override // fr.h
                public final void onFailure(Exception exc) {
                    g.g(activity, exc);
                }
            });
        }
    }
}
