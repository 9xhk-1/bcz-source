package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.m.a;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.n;
import com.baicizhan.client.business.webview.JsonParams;
import com.heytap.mcssdk.constant.IntentConstant;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.igexin.assist.sdk.AssistPushConsts;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class OpenAuthTask {
    public static final int Duplex = 5000;
    public static final int NOT_INSTALLED = 4001;
    public static final int OK = 9000;
    public static final int SYS_ERR = 4000;

    /* renamed from: e, reason: collision with root package name */
    public static final Map<String, Callback> f10413e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static long f10414f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10415g = 122;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f10417b;

    /* renamed from: c, reason: collision with root package name */
    public Callback f10418c;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f10416a = false;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f10419d = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        public String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        void onResult(int i11, String str, Bundle bundle);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10420a;

        static {
            int[] iArr = new int[BizType.values().length];
            f10420a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10420a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10420a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f10421a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10422b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f10423c;

        public /* synthetic */ b(OpenAuthTask openAuthTask, int i11, String str, Bundle bundle, a aVar) {
            this(i11, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenAuthTask.this.f10418c != null) {
                OpenAuthTask.this.f10418c.onResult(this.f10421a, this.f10422b, this.f10423c);
            }
        }

        public b(int i11, String str, Bundle bundle) {
            this.f10421a = i11;
            this.f10422b = str;
            this.f10423c = bundle;
        }
    }

    public OpenAuthTask(Activity activity) {
        this.f10417b = activity;
        com.alipay.sdk.m.s.b.d().a(activity);
    }

    public void execute(String str, BizType bizType, Map<String, String> map, Callback callback, boolean z11) {
        com.alipay.sdk.m.s.a aVar = new com.alipay.sdk.m.s.a(this.f10417b, String.valueOf(map), "oa-" + bizType);
        this.f10418c = callback;
        if (a(aVar, str, bizType, map, z11)) {
            com.alipay.sdk.m.k.a.b(this.f10417b, aVar, "", aVar.f11016d);
        }
    }

    private boolean a(com.alipay.sdk.m.s.a aVar, String str, BizType bizType, Map<String, String> map, boolean z11) {
        PackageInfo packageInfo;
        String str2;
        if (this.f10416a) {
            this.f10419d.post(new b(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f10416a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f10414f <= 3000) {
            this.f10419d.post(new b(this, 5000, "3s 内重复支付", null, null));
            return true;
        }
        f10414f = elapsedRealtime;
        com.alipay.sdk.m.j.a.a("");
        String a11 = n.a(32);
        HashMap hashMap = new HashMap(map);
        hashMap.put("mqpPkgName", this.f10417b.getPackageName());
        hashMap.put("mqpScene", "sdk");
        List<a.b> l11 = com.alipay.sdk.m.m.a.D().l();
        if (!com.alipay.sdk.m.m.a.D().f10810h || l11 == null) {
            l11 = com.alipay.sdk.m.j.a.f10605d;
        }
        n.c a12 = n.a(aVar, this.f10417b, l11);
        if (a12 == null || a12.a(aVar) || a12.a() || (packageInfo = a12.f11124a) == null || packageInfo.versionCode < 122) {
            if (!z11) {
                this.f10419d.post(new b(this, 4001, "支付宝未安装或签名错误", null, null));
                return true;
            }
            hashMap.put("mqpScheme", String.valueOf(str));
            hashMap.put("mqpNotifyName", a11);
            hashMap.put("mqpScene", "landing");
            String a13 = a(bizType, hashMap);
            Intent intent = new Intent(this.f10417b, (Class<?>) H5OpenAuthActivity.class);
            intent.putExtra("url", String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(a13)));
            a.C0175a.a(aVar, intent);
            this.f10417b.startActivity(intent);
            return false;
        }
        try {
            try {
                HashMap<String, String> a14 = com.alipay.sdk.m.s.a.a(aVar);
                a14.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                hashMap.put("mqpLoc", new JSONObject(a14).toString());
            } catch (Throwable th2) {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "OpenAuthLocEx", th2);
            }
            String a15 = a(bizType, hashMap);
            f10413e.put(a11, this.f10418c);
            try {
                str2 = a(elapsedRealtime, a11, bizType, a15);
            } catch (JSONException e11) {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10664q0, e11);
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                this.f10419d.post(new b(this, 4000, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme("alipays").authority("platformapi").path(com.igexin.push.core.b.f37745q).appendQueryParameter("appId", "20001129").appendQueryParameter(AssistPushConsts.MSG_TYPE_PAYLOAD, str2).build());
            intent2.addFlags(268435456);
            intent2.setPackage(a12.f11124a.packageName);
            try {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.Y, "" + elapsedRealtime);
                a.C0175a.a(aVar, a11);
                this.f10417b.startActivity(intent2);
            } catch (Throwable th3) {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "StartWalletEx", th3);
            }
            return false;
        } catch (Throwable unused) {
            this.f10419d.post(new b(this, 4000, "业务参数错误", null, null));
            return true;
        }
    }

    private String a(BizType bizType, Map<String, String> map) {
        if (bizType != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path(com.igexin.push.core.b.f37745q).appendQueryParameter("appId", bizType.appId);
            if (a.f10420a[bizType.ordinal()] == 1) {
                appendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return appendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    private String a(long j11, String str, BizType bizType, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", String.valueOf(j11));
        jSONObject.put(JsonParams.ShareResultO.CHANNEL_WEIXIN, str);
        jSONObject.put("package", this.f10417b.getPackageName());
        if (bizType != null) {
            jSONObject.put("appId", bizType.appId);
        }
        jSONObject.put(IntentConstant.SDK_VERSION, "h.a.3.8.15");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName("UTF-8")), 2);
    }

    public static void a(String str, int i11, String str2, Bundle bundle) {
        Callback remove = f10413e.remove(str);
        if (remove != null) {
            try {
                remove.onResult(i11, str2, bundle);
            } catch (Throwable th2) {
                e.a(th2);
            }
        }
    }
}
