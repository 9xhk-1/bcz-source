package q;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.igexin.assist.sdk.AssistPushConsts;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.web.WebActivity;
import com.sina.weibo.sdk.web.WebData;
import gw.a;
import gw.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import q.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public WbAuthListener f81355a;

    public final void a(Activity activity) {
        c.a("WBSsoTag", "startClientAuth()");
        try {
            a.C0646a a11 = gw.a.a(activity);
            Intent intent = new Intent();
            if (a11 == null) {
                intent.setClassName(BuildConfig.LIBRARY_PACKAGE_NAME, "com.sina.weibo.SSOActivity");
            } else {
                intent.setClassName(a11.f57825a, a11.f57826b);
            }
            if (!a.a.f1056a) {
                throw new RuntimeException("please init sdk before use it. Wb.install()");
            }
            AuthInfo authInfo = a.a.f1057b;
            intent.putExtra(IntentConstant.APP_KEY, authInfo.getAppKey());
            intent.putExtra("redirectUri", authInfo.getRedirectUrl());
            intent.putExtra("scope", authInfo.getScope());
            intent.putExtra("packagename", authInfo.getPackageName());
            intent.putExtra("key_hash", authInfo.getHash());
            intent.putExtra("_weibo_command_type", 3);
            intent.putExtra("_weibo_transaction", System.currentTimeMillis() + "");
            if (activity == null) {
                this.f81355a.onError(new UiError(-1, "activity is null", ""));
            } else if (!gw.a.b(activity, intent)) {
                this.f81355a.onError(new UiError(-2, "your app is illegal", ""));
            } else {
                activity.startActivityForResult(intent, 32973);
                c.a("WBSsoTag", "start SsoActivity ");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            c.b("WBSsoTag", e11.getMessage());
            this.f81355a.onError(new UiError(-3, "occur exception", e11.getMessage()));
        }
    }

    public final void b(Activity activity) {
        b bVar;
        HashMap hashMap = new HashMap();
        if (!a.a.f1056a) {
            throw new RuntimeException("please init sdk before use it. Wb.install()");
        }
        AuthInfo authInfo = a.a.f1057b;
        if (authInfo == null) {
            return;
        }
        hashMap.put("client_id", authInfo.getAppKey());
        hashMap.put(CommonConstant.ReqAccessTokenParam.REDIRECT_URI, authInfo.getRedirectUrl());
        hashMap.put("scope", authInfo.getScope());
        hashMap.put("packagename", authInfo.getPackageName());
        hashMap.put("key_hash", authInfo.getHash());
        hashMap.put(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "code");
        hashMap.put("version", "0041005000");
        hashMap.put("luicode", "10000360");
        hashMap.put("lfid", AssistPushConsts.OPPO_PREFIX + authInfo.getAppKey());
        Oauth2AccessToken readAccessToken = AccessTokenHelper.readAccessToken(activity);
        if (readAccessToken != null) {
            String accessToken = readAccessToken.getAccessToken();
            if (!TextUtils.isEmpty(readAccessToken.getAccessToken())) {
                hashMap.put("trans_token", accessToken);
                hashMap.put("trans_access_token", accessToken);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://open.weibo.cn/oauth2/authorize?");
        StringBuilder sb3 = new StringBuilder();
        boolean z11 = true;
        for (String str : hashMap.keySet()) {
            if (z11) {
                z11 = false;
            } else {
                sb3.append("&");
            }
            String str2 = (String) hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    sb3.append(URLEncoder.encode(str, "UTF-8"));
                    sb3.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb3.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e11) {
                    e11.printStackTrace();
                }
            }
        }
        sb2.append(sb3.toString());
        String sb4 = sb2.toString();
        if (this.f81355a != null) {
            synchronized (b.class) {
                bVar = b.a.f81357a;
            }
            bVar.getClass();
            String str3 = System.currentTimeMillis() + "";
            WbAuthListener wbAuthListener = this.f81355a;
            synchronized (bVar) {
                if (!TextUtils.isEmpty(str3) && wbAuthListener != null) {
                    bVar.f81356a.put(str3, wbAuthListener);
                }
            }
            Intent intent = new Intent(activity, (Class<?>) WebActivity.class);
            WebData webData = new WebData(authInfo, 2, sb4, str3);
            String str4 = System.currentTimeMillis() + "";
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
            bundle.putString("_weibo_transaction", str4);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }
}
