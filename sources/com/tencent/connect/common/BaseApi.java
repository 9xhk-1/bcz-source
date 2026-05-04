package com.tencent.connect.common;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import com.tencent.connect.common.Constants;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.f;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class BaseApi {
    public static String businessId = null;
    public static String installChannel = null;
    public static boolean isOEM = false;
    public static String registerChannel;

    /* renamed from: b, reason: collision with root package name */
    protected c f42864b;

    /* renamed from: c, reason: collision with root package name */
    protected QQToken f42865c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class TempRequestListener implements IRequestListener {

        /* renamed from: b, reason: collision with root package name */
        private final IUiListener f42867b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f42868c;

        public TempRequestListener(IUiListener iUiListener) {
            this.f42867b = iUiListener;
            this.f42868c = new Handler(g.a().getMainLooper()) { // from class: com.tencent.connect.common.BaseApi.TempRequestListener.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.what == 0) {
                        TempRequestListener.this.f42867b.onComplete(message.obj);
                    } else {
                        TempRequestListener.this.f42867b.onError(new UiError(message.what, (String) message.obj, null));
                    }
                }
            };
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onComplete(JSONObject jSONObject) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = jSONObject;
            obtainMessage.what = 0;
            this.f42868c.sendMessage(obtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onHttpStatusException(HttpUtils.HttpStatusException httpStatusException) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = httpStatusException.getMessage();
            obtainMessage.what = -9;
            this.f42868c.sendMessage(obtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onIOException(IOException iOException) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = iOException.getMessage();
            obtainMessage.what = -2;
            this.f42868c.sendMessage(obtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onJSONException(JSONException jSONException) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = jSONException.getMessage();
            obtainMessage.what = -4;
            this.f42868c.sendMessage(obtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onMalformedURLException(MalformedURLException malformedURLException) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = malformedURLException.getMessage();
            obtainMessage.what = -3;
            this.f42868c.sendMessage(obtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onNetworkUnavailableException(HttpUtils.NetworkUnavailableException networkUnavailableException) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = networkUnavailableException.getMessage();
            obtainMessage.what = -10;
            this.f42868c.sendMessage(obtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onSocketTimeoutException(SocketTimeoutException socketTimeoutException) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = socketTimeoutException.getMessage();
            obtainMessage.what = -8;
            this.f42868c.sendMessage(obtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onUnknowException(Exception exc) {
            Message obtainMessage = this.f42868c.obtainMessage();
            obtainMessage.obj = exc.getMessage();
            obtainMessage.what = -6;
            this.f42868c.sendMessage(obtainMessage);
        }
    }

    public BaseApi(c cVar, QQToken qQToken) {
        this.f42864b = cVar;
        this.f42865c = qQToken;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(IjkMediaMeta.IJKM_KEY_FORMAT, "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", f.a().c(g.a()));
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        QQToken qQToken = this.f42865c;
        if (qQToken != null && qQToken.isSessionValid()) {
            bundle.putString("access_token", this.f42865c.getAccessToken());
            bundle.putString("oauth_consumer_key", this.f42865c.getAppId());
            bundle.putString("openid", this.f42865c.getOpenId());
        }
        SharedPreferences sharedPreferences = g.a().getSharedPreferences(Constants.PREFERENCE_PF, 0);
        if (!isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            return bundle;
        }
        bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + businessId);
        return bundle;
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("appid", this.f42865c.getAppId());
        if (this.f42865c.isSessionValid()) {
            bundle.putString(Constants.PARAM_KEY_STR, this.f42865c.getAccessToken());
            bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
        }
        String openId = this.f42865c.getOpenId();
        if (openId != null) {
            bundle.putString("hopenid", openId);
        }
        bundle.putString(Constants.PARAM_PLATFORM, "androidqz");
        SharedPreferences sharedPreferences = g.a().getSharedPreferences(Constants.PREFERENCE_PF, 0);
        if (isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + businessId);
        } else {
            bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (com.tencent.open.utils.k.c(com.tencent.open.utils.g.a(), r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent c() {
        /*
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.m.c(r1)
            java.lang.String r2 = "com.tencent.open.agent.AgentActivity"
            if (r1 == 0) goto L21
            java.lang.String r1 = "com.tencent.minihd.qq"
            r0.setClassName(r1, r2)
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.k.c(r1, r0)
            if (r1 == 0) goto L21
            goto L40
        L21:
            java.lang.String r1 = "com.tencent.mobileqq"
            r0.setClassName(r1, r2)
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.k.c(r1, r0)
            if (r1 == 0) goto L31
            goto L40
        L31:
            java.lang.String r1 = "com.tencent.tim"
            r0.setClassName(r1, r2)
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.k.c(r1, r0)
            if (r1 == 0) goto L41
        L40:
            return r0
        L41:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.common.BaseApi.c():android.content.Intent");
    }

    public BaseApi(QQToken qQToken) {
        this(null, qQToken);
    }

    public Intent c(String str) {
        Intent intent = new Intent();
        Intent b11 = b(str);
        if (b11 == null || b11.getComponent() == null) {
            return null;
        }
        intent.setClassName(b11.getComponent().getPackageName(), "com.tencent.open.agent.AgentActivity");
        return intent;
    }

    public String a(String str) {
        Bundle a11 = a();
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            a11.putString("need_version", str);
        }
        sb2.append("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        sb2.append(HttpUtils.encodeUrl(a11));
        return sb2.toString();
    }

    public void releaseResource() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (com.tencent.open.utils.k.a(com.tencent.open.utils.g.a(), r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent b(java.lang.String r3) {
        /*
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.m.c(r1)
            if (r1 == 0) goto L1f
            java.lang.String r1 = "com.tencent.minihd.qq"
            r0.setClassName(r1, r3)
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.k.a(r1, r0)
            if (r1 == 0) goto L1f
            goto L3e
        L1f:
            java.lang.String r1 = "com.tencent.mobileqq"
            r0.setClassName(r1, r3)
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.k.a(r1, r0)
            if (r1 == 0) goto L2f
            goto L3e
        L2f:
            java.lang.String r1 = "com.tencent.tim"
            r0.setClassName(r1, r3)
            android.content.Context r3 = com.tencent.open.utils.g.a()
            boolean r3 = com.tencent.open.utils.k.a(r3, r0)
            if (r3 == 0) goto L3f
        L3e:
            return r0
        L3f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.common.BaseApi.b(java.lang.String):android.content.Intent");
    }

    public void a(StringBuilder sb2, Activity activity) {
        if (sb2.indexOf("?") < 0) {
            sb2.append("?");
        } else {
            sb2.append("&");
        }
        sb2.append(Constants.JumpUrlConstants.URL_KEY_SRC);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append("app");
        String appId = this.f42865c.getAppId();
        String openId = this.f42865c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            a(sb2, "app_id", appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            a(sb2, Constants.JumpUrlConstants.URL_KEY_OPENID, m.k(openId));
        }
        String a11 = m.a(activity);
        if (!TextUtils.isEmpty(a11)) {
            if (a11.length() > 20) {
                a11 = a11.substring(0, 20) + "...";
            }
            a(sb2, "app_name", m.k(a11));
        }
        a(sb2, "sdk_version", m.k(Constants.SDK_VERSION));
    }

    public void a(StringBuilder sb2, String str, String str2) {
        sb2.append("&");
        sb2.append(str);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(m.f(str2));
    }

    private Intent a(Activity activity, Intent intent, Map<String, Object> map) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        intent2.putExtra(AssistActivity.EXTRA_INTENT, intent);
        if (map != null) {
            try {
                if (map.containsKey(Constants.KEY_RESTORE_LANDSCAPE)) {
                    intent2.putExtra(Constants.KEY_RESTORE_LANDSCAPE, ((Boolean) map.get(Constants.KEY_RESTORE_LANDSCAPE)).booleanValue());
                    return intent2;
                }
            } catch (Exception e11) {
                SLog.e("openSDK_LOG.BaseApi", "Exception", e11);
                return intent2;
            }
        }
        return intent2;
    }

    public void a(Activity activity, int i11, Intent intent, boolean z11) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        if (z11) {
            intent2.putExtra("is_qq_mobile_share", true);
        }
        intent2.putExtra(AssistActivity.EXTRA_INTENT, intent);
        try {
            activity.startActivityForResult(intent2, i11);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.BaseApi", "startAssistActivity exception", e11);
        }
    }

    public void a(Activity activity, Intent intent, int i11) {
        a(activity, intent, i11, (Map<String, Object>) null);
    }

    public void a(Activity activity, Intent intent, int i11, Map<String, Object> map) {
        intent.putExtra(Constants.KEY_REQUEST_CODE, i11);
        try {
            activity.startActivityForResult(a(activity, intent, map), i11);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.BaseApi", "startAssitActivity exception", e11);
        }
    }

    public void a(Fragment fragment, Intent intent, int i11, Map<String, Object> map) {
        intent.putExtra(Constants.KEY_REQUEST_CODE, i11);
        try {
            fragment.startActivityForResult(a(fragment.getActivity(), intent, map), i11);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.BaseApi", "startAssitActivity exception", e11);
        }
    }

    public boolean a(Intent intent) {
        if (intent != null) {
            return k.b(g.a(), intent);
        }
        return false;
    }

    public void a(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.BaseApi", "--handleDownloadLastestQQ");
        new TDialog(activity, "", "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + HttpUtils.encodeUrl(bundle), null, this.f42865c).show();
    }
}
