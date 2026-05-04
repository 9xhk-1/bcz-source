package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.g;
import com.tencent.open.utils.i;
import com.tencent.open.utils.j;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SocialApiIml extends BaseApi {

    /* renamed from: a, reason: collision with root package name */
    private Activity f44383a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends DefaultUiListener {

        /* renamed from: b, reason: collision with root package name */
        private IUiListener f44385b;

        /* renamed from: c, reason: collision with root package name */
        private String f44386c;

        /* renamed from: d, reason: collision with root package name */
        private String f44387d;

        /* renamed from: e, reason: collision with root package name */
        private Bundle f44388e;

        /* renamed from: f, reason: collision with root package name */
        private Activity f44389f;

        public a(Activity activity, IUiListener iUiListener, String str, String str2, Bundle bundle) {
            this.f44385b = iUiListener;
            this.f44386c = str;
            this.f44387d = str2;
            this.f44388e = bundle;
            this.f44389f = activity;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            this.f44385b.onCancel();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            String str;
            try {
                str = ((JSONObject) obj).getString(SocialConstants.PARAM_ENCRY_EOKEN);
            } catch (JSONException e11) {
                e11.printStackTrace();
                SLog.e("openSDK_LOG.SocialApiIml", "OpenApi, EncrytokenListener() onComplete error", e11);
                str = null;
            }
            this.f44388e.putString("encrytoken", str);
            SocialApiIml socialApiIml = SocialApiIml.this;
            socialApiIml.a((Context) socialApiIml.f44383a, this.f44386c, this.f44388e, this.f44387d, this.f44385b);
            if (TextUtils.isEmpty(str)) {
                SLog.d("openSDK_LOG.SocialApiIml", "The token get from qq or qzone is empty. Write temp token to localstorage.");
                SocialApiIml.this.writeEncryToken(this.f44389f);
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            SLog.d("openSDK_LOG.SocialApiIml", "OpenApi, EncryptTokenListener() onError" + uiError.errorMessage);
            this.f44385b.onError(uiError);
        }
    }

    public SocialApiIml(QQToken qQToken) {
        super(qQToken);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        a(activity, SocialConstants.ACTION_ASK, bundle, iUiListener);
    }

    @Override // com.tencent.connect.common.BaseApi
    public Intent b(String str) {
        Intent intent = new Intent();
        intent.setClassName(Constants.PACKAGE_QQ_PAD, str);
        if (m.c(g.a()) && k.a(g.a(), intent)) {
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setClassName("com.tencent.mobileqq", str);
        if (k.a(g.a(), intent2) && k.c(g.a(), "4.7") >= 0) {
            return intent2;
        }
        Intent intent3 = new Intent();
        intent3.setClassName(Constants.PACKAGE_QZONE, str);
        if (k.a(g.a(), intent3) && k.a(k.a(g.a(), Constants.PACKAGE_QZONE), "4.2") >= 0 && k.a(g.a(), intent3.getComponent().getPackageName(), Constants.SIGNATRUE_QZONE)) {
            return intent3;
        }
        return null;
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        a(activity, SocialConstants.ACTION_GIFT, bundle, iUiListener);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f44383a = activity;
        Intent c11 = c(SocialConstants.ACTIVITY_FRIEND_CHOOSER);
        if (c11 == null) {
            SLog.i("openSDK_LOG.SocialApiIml", "--invite--friend chooser not found");
            c11 = c(SocialConstants.ACTIVITY_INVITE);
        }
        bundle.putAll(b());
        a(activity, c11, SocialConstants.ACTION_INVITE, bundle, j.a().a(g.a(), "https://imgcache.qq.com/open/mobile/invite/sdk_invite.html?"), iUiListener, false);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f44383a = activity;
        Intent c11 = c(SocialConstants.ACTIVITY_STORY);
        bundle.putAll(b());
        a(activity, c11, SocialConstants.ACTION_STORY, bundle, j.a().a(g.a(), "https://imgcache.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"), iUiListener, false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void writeEncryToken(Context context) {
        String str;
        String accessToken = this.f42865c.getAccessToken();
        String appId = this.f42865c.getAppId();
        String openId = this.f42865c.getOpenId();
        if (accessToken == null || accessToken.length() <= 0 || appId == null || appId.length() <= 0 || openId == null || openId.length() <= 0) {
            str = null;
        } else {
            str = m.g("tencent&sdk&qazxc***14969%%" + accessToken + appId + openId + "qzone3.4");
        }
        com.tencent.open.c.b bVar = new com.tencent.open.c.b(context);
        WebSettings settings = bVar.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        com.tencent.open.web.a.a(bVar);
        String str2 = "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = 'qq.com';localStorage[\"" + this.f42865c.getOpenId() + "_" + this.f42865c.getAppId() + "\"]=\"" + str + "\";</script></head><body></body></html>";
        String a11 = j.a().a(context, "https://imgcache.qq.com");
        bVar.loadDataWithBaseURL(a11, str2, "text/html", "utf-8", a11);
    }

    public SocialApiIml(com.tencent.connect.auth.c cVar, QQToken qQToken) {
        super(cVar, qQToken);
    }

    private void a(Activity activity, String str, Bundle bundle, IUiListener iUiListener) {
        this.f44383a = activity;
        Intent c11 = c(SocialConstants.ACTIVITY_FRIEND_CHOOSER);
        if (c11 == null) {
            SLog.i("openSDK_LOG.SocialApiIml", "--askgift--friend chooser not found");
            c11 = c(SocialConstants.ACTIVITY_ASK_GIFT);
        }
        Intent intent = c11;
        bundle.putAll(b());
        if (SocialConstants.ACTION_ASK.equals(str)) {
            bundle.putString("type", SocialConstants.TYPE_REQUEST);
        } else if (SocialConstants.ACTION_GIFT.equals(str)) {
            bundle.putString("type", SocialConstants.TYPE_FREEGIFT);
        }
        a(activity, intent, str, bundle, j.a().a(g.a(), "https://imgcache.qq.com/open/mobile/request/sdk_request.html?"), iUiListener, false);
    }

    private void a(Activity activity, Intent intent, String str, Bundle bundle, String str2, IUiListener iUiListener, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("-->handleIntent action = ");
        sb2.append(str);
        sb2.append(", activityIntent = null ? ");
        sb2.append(intent == null);
        SLog.i("openSDK_LOG.SocialApiIml", sb2.toString());
        if (intent != null) {
            a(activity, intent, str, bundle, iUiListener);
            return;
        }
        i a11 = i.a(g.a(), this.f42865c.getAppId());
        if (!z11 && !a11.b("C_LoginH5")) {
            a(activity, bundle, iUiListener);
        } else {
            a(activity, str, bundle, str2, iUiListener);
        }
    }

    private void a(Activity activity, Intent intent, String str, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithAgent action = " + str);
        intent.putExtra(Constants.KEY_ACTION, str);
        intent.putExtra(Constants.KEY_PARAMS, bundle);
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_SOCIAL_API, iUiListener);
        a(activity, intent, Constants.REQUEST_SOCIAL_API);
    }

    private void a(Activity activity, String str, Bundle bundle, String str2, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5 action = " + str);
        Intent c11 = c();
        IUiListener aVar = new a(activity, iUiListener, str, str2, bundle);
        Intent b11 = b("com.tencent.open.agent.EncryTokenActivity");
        if (b11 != null && c11 != null && c11.getComponent() != null && b11.getComponent() != null && c11.getComponent().getPackageName().equals(b11.getComponent().getPackageName())) {
            b11.putExtra("oauth_consumer_key", this.f42865c.getAppId());
            b11.putExtra("openid", this.f42865c.getOpenId());
            b11.putExtra("access_token", this.f42865c.getAccessToken());
            b11.putExtra(Constants.KEY_ACTION, SocialConstants.ACTION_CHECK_TOKEN);
            if (a(b11)) {
                SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--found token activity");
                UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_SOCIAL_H5, aVar);
                a(activity, b11, Constants.REQUEST_SOCIAL_H5);
                return;
            }
            return;
        }
        SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--token activity not found");
        String g11 = m.g("tencent&sdk&qazxc***14969%%" + this.f42865c.getAccessToken() + this.f42865c.getAppId() + this.f42865c.getOpenId() + "qzone3.4");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SocialConstants.PARAM_ENCRY_EOKEN, g11);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        aVar.onComplete(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, Bundle bundle, String str2, IUiListener iUiListener) {
        SLog.v("openSDK_LOG.SocialApiIml", "OpenUi, showDialog --start");
        CookieSyncManager.createInstance(context);
        bundle.putString("oauth_consumer_key", this.f42865c.getAppId());
        if (this.f42865c.isSessionValid()) {
            bundle.putString("access_token", this.f42865c.getAccessToken());
        }
        String openId = this.f42865c.getOpenId();
        if (openId != null) {
            bundle.putString("openid", openId);
        }
        try {
            bundle.putString(Constants.PARAM_PLATFORM_ID, g.a().getSharedPreferences(Constants.PREFERENCE_PF, 0).getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
        } catch (Exception e11) {
            e11.printStackTrace();
            bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        String str3 = str2 + HttpUtils.encodeUrl(bundle);
        SLog.d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog TDialog");
        if (!SocialConstants.ACTION_CHALLENGE.equals(str) && !SocialConstants.ACTION_BRAG.equals(str)) {
            new TDialog(this.f44383a, str, str3, iUiListener, this.f42865c).show();
        } else {
            SLog.d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog PKDialog");
            new d(this.f44383a, str, str3, iUiListener, this.f42865c).show();
        }
    }
}
