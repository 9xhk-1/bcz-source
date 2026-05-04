package mu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.share.ShareTransActivity;
import com.sina.weibo.sdk.share.WbShareCallback;
import com.sina.weibo.sdk.web.WebData;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import cw.f;
import gw.a;
import gw.b;
import gw.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements IWBAPI {

    /* renamed from: a, reason: collision with root package name */
    public Context f73726a;

    /* renamed from: b, reason: collision with root package name */
    public q.a f73727b = new q.a();

    /* renamed from: c, reason: collision with root package name */
    public f f73728c = new f();

    public a(Context context) {
        this.f73726a = context;
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorize(Activity activity, WbAuthListener wbAuthListener) {
        q.a aVar = this.f73727b;
        aVar.getClass();
        c.a("WBSsoTag", "authorize()");
        if (wbAuthListener == null) {
            throw new RuntimeException("listener can not be null.");
        }
        aVar.f81355a = wbAuthListener;
        if (!a.a.b(activity) || gw.a.a(activity) == null) {
            aVar.b(activity);
        } else {
            aVar.a(activity);
        }
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorizeCallback(Activity activity, int i11, int i12, Intent intent) {
        q.a aVar = this.f73727b;
        aVar.getClass();
        c.a("WBSsoTag", "authorizeCallback()");
        WbAuthListener wbAuthListener = aVar.f81355a;
        if (wbAuthListener == null) {
            return;
        }
        if (32973 != i11) {
            wbAuthListener.onError(new UiError(-7, "request code is error", "requestCode is error"));
            return;
        }
        if (i12 != -1) {
            if (i12 == 0) {
                wbAuthListener.onCancel();
                return;
            } else {
                wbAuthListener.onError(new UiError(-6, "result code is error", "result code is error"));
                return;
            }
        }
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("error");
        String stringExtra2 = intent.getStringExtra(PushMessageHelper.ERROR_TYPE);
        String stringExtra3 = intent.getStringExtra("error_description");
        if (!TextUtils.isEmpty(stringExtra) || !TextUtils.isEmpty(stringExtra2) || !TextUtils.isEmpty(stringExtra3)) {
            if ("access_denied".equals(stringExtra) || "OAuthAccessDeniedException".equals(stringExtra)) {
                aVar.f81355a.onCancel();
                return;
            } else {
                aVar.f81355a.onError(new UiError(-5, stringExtra2, stringExtra3));
                return;
            }
        }
        Oauth2AccessToken parseAccessToken = Oauth2AccessToken.parseAccessToken(intent.getExtras());
        if (parseAccessToken == null) {
            aVar.f81355a.onError(new UiError(-4, "oauth2AccessToken is null", "oauth2AccessToken is null"));
        } else {
            AccessTokenHelper.writeAccessToken(activity, parseAccessToken);
            aVar.f81355a.onComplete(parseAccessToken);
        }
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorizeClient(Activity activity, WbAuthListener wbAuthListener) {
        q.a aVar = this.f73727b;
        aVar.getClass();
        c.a("WBSsoTag", "authorizeClient()");
        if (wbAuthListener == null) {
            throw new RuntimeException("listener can not be null.");
        }
        aVar.f81355a = wbAuthListener;
        aVar.a(activity);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorizeWeb(Activity activity, WbAuthListener wbAuthListener) {
        q.a aVar = this.f73727b;
        aVar.getClass();
        c.a("WBSsoTag", "authorizeWeb()");
        if (wbAuthListener == null) {
            throw new RuntimeException("listener can not be null.");
        }
        aVar.f81355a = wbAuthListener;
        aVar.b(activity);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void doResultIntent(Intent intent, WbShareCallback wbShareCallback) {
        Bundle extras;
        this.f73728c.getClass();
        if (intent == null || wbShareCallback == null || (extras = intent.getExtras()) == null) {
            return;
        }
        try {
            int i11 = extras.getInt("_weibo_resp_errcode", -1);
            if (i11 == 0) {
                wbShareCallback.onComplete();
            } else if (i11 == 1) {
                wbShareCallback.onCancel();
            } else {
                if (i11 != 2) {
                    return;
                }
                wbShareCallback.onError(new UiError(i11, extras.getString("_weibo_resp_errstr"), "error from weibo client!"));
            }
        } catch (Exception e11) {
            wbShareCallback.onError(new UiError(-1, e11.getMessage(), e11.getMessage()));
        }
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final boolean isWBAppInstalled() {
        return a.a.b(this.f73726a);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final boolean isWBAppSupportMultipleImage() {
        return a.a.a(this.f73726a);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void registerApp(Context context, AuthInfo authInfo, SdkListener sdkListener) {
        if (a.a.f1056a) {
            return;
        }
        if (authInfo == null) {
            throw new RuntimeException("authInfo must not be null.");
        }
        a.a.f1057b = authInfo;
        a.a.f1056a = true;
        if (sdkListener != null) {
            sdkListener.onInitSuccess();
        }
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void setLoggerEnable(boolean z11) {
        c.f57829a = z11;
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void setShareUriParseV2(boolean z11) {
        b.f57828a = z11;
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void shareMessage(Activity activity, WeiboMultiMessage weiboMultiMessage, boolean z11) {
        a.C0646a a11;
        f fVar = this.f73728c;
        fVar.getClass();
        if (activity == null) {
            return;
        }
        if (a.a.b(activity) || !z11) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - fVar.f46864a < 5000) {
                return;
            }
            fVar.f46864a = currentTimeMillis;
            if (z11) {
                f.a(activity, weiboMultiMessage);
                return;
            }
            a.C0646a a12 = gw.a.a(activity);
            if (a.a.b(activity) && a12 != null && (a11 = gw.a.a(activity)) != null && a11.f57827c > 10000) {
                f.a(activity, weiboMultiMessage);
                return;
            }
            if (!a.a.f1056a) {
                throw new RuntimeException("please init sdk before use it. Wb.install()");
            }
            AuthInfo authInfo = a.a.f1057b;
            if (authInfo == null) {
                return;
            }
            String str = null;
            WebData webData = new WebData(authInfo, 1, null, null);
            String str2 = System.currentTimeMillis() + "";
            String packageName = activity.getPackageName();
            Oauth2AccessToken readAccessToken = AccessTokenHelper.readAccessToken(activity);
            if (readAccessToken != null) {
                String accessToken = readAccessToken.getAccessToken();
                if (!TextUtils.isEmpty(readAccessToken.getAccessToken())) {
                    str = accessToken;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("web_data", webData);
            int i11 = webData.f41600b;
            if (i11 == 1) {
                bundle.putInt("web_type", 1);
            } else if (i11 == 2) {
                bundle.putInt("web_type", 2);
            } else if (i11 == 3) {
                bundle.putInt("web_type", 3);
            }
            bundle.putString("_weibo_transaction", str2);
            if (weiboMultiMessage != null) {
                weiboMultiMessage.writeToBundle(bundle);
            }
            bundle.putString("token", str);
            bundle.putString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, packageName);
            Intent intent = new Intent(activity, (Class<?>) ShareTransActivity.class);
            intent.putExtra("start_flag", 1001);
            intent.putExtra("start_web_activity", "com.sina.weibo.sdk.web.WebActivity");
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, 10001);
        }
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void registerApp(Context context, AuthInfo authInfo) {
        registerApp(context, authInfo, null);
    }
}
