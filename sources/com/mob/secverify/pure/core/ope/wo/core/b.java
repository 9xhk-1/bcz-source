package com.mob.secverify.pure.core.ope.wo.core;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.provider.a;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.igexin.sdk.PushConsts;
import com.mob.secverify.pure.core.ope.wo.c.e;
import com.mob.secverify.pure.core.ope.wo.c.g;
import com.mob.secverify.pure.core.ope.wo.listener.WoCallback;
import com.mob.secverify.pure.core.ope.wo.net.WoHttpManager;
import com.mob.secverify.pure.core.ope.wo.net.WoNetwork;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;
import q9.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f41078a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f41079b = new Handler(Looper.getMainLooper());

    public static b a() {
        if (f41078a == null) {
            synchronized (b.class) {
                try {
                    if (f41078a == null) {
                        f41078a = new b();
                    }
                } finally {
                }
            }
        }
        return f41078a;
    }

    private String a(Context context, int i11, String str) {
        try {
            String packageName = context.getPackageName();
            String b11 = com.mob.secverify.pure.core.ope.wo.c.b.b(context, context.getPackageName());
            String a11 = com.mob.secverify.pure.core.ope.wo.a.b.a();
            String str2 = i11 != 2 ? "1" : "";
            String str3 = "" + System.currentTimeMillis();
            String a12 = e.a(com.mob.secverify.pure.core.ope.wo.c.b.b(context).getBytes());
            String decode = URLDecoder.decode(com.mob.secverify.pure.core.ope.wo.c.b.e(str), "utf-8");
            String a13 = com.mob.secverify.pure.core.ope.wo.c.b.a(str2 + a11 + "30100jsonp" + a12 + decode + packageName + b11 + str3 + "4.6.0AR002B0101" + com.mob.secverify.pure.core.ope.wo.a.b.b());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", a11);
            jSONObject.put("client_type", "30100");
            jSONObject.put(IjkMediaMeta.IJKM_KEY_FORMAT, "jsonp");
            jSONObject.put("version", "4.6.0AR002B0101");
            if (i11 != 2) {
                jSONObject.put("business_type", str2);
            }
            jSONObject.put("packname", packageName);
            jSONObject.put("packsign", URLEncoder.encode(b11, "utf-8"));
            jSONObject.put("timeStamp", str3);
            jSONObject.put(a.d.C0245a.f16161a, decode);
            jSONObject.put("fp", a12);
            jSONObject.put(HwPayConstant.KEY_SIGN, a13);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private HashMap<String, String> a(Context context) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("model", Build.MODEL);
        hashMap.put(h.f81945i, Build.VERSION.RELEASE);
        hashMap.put("device_id", g.a(context));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i11, String str, String str2, Network network, final WoCallback woCallback) {
        try {
            WoHttpManager.a().a(str2 + com.mob.secverify.pure.core.ope.wo.c.a.a(a(context, i11, str), "&"), a(context), network, new WoHttpManager.ExcutorCallback() { // from class: com.mob.secverify.pure.core.ope.wo.core.b.1
                @Override // com.mob.secverify.pure.core.ope.wo.net.WoHttpManager.ExcutorCallback
                public void complete(String str3) {
                    WoNetwork.a().b();
                    if (TextUtils.isEmpty(str3)) {
                        woCallback.onResult(10022, "网络请求响应为空");
                    } else {
                        woCallback.onResult(0, str3);
                    }
                }
            });
        } catch (Exception e11) {
            woCallback.onResult(PushConsts.SET_TAG_RESULT, "10009" + e11.getMessage());
            WoNetwork.a().b();
        }
    }

    public void a(final Context context, final int i11, final String str, final WoCallback woCallback) {
        WoCallback woCallback2;
        try {
            try {
                if (com.mob.secverify.pure.core.ope.wo.c.b.a(context.getApplicationContext()) == 1) {
                    this.f41079b.post(new Runnable() { // from class: com.mob.secverify.pure.core.ope.wo.core.b.2
                        @Override // java.lang.Runnable
                        public void run() {
                            WoNetwork.a().a(context, "https://opencloud.wostore.cn/openapi/netauth/precheck/wp?", new WoNetwork.NetInterface() { // from class: com.mob.secverify.pure.core.ope.wo.core.b.2.1
                                @Override // com.mob.secverify.pure.core.ope.wo.net.WoNetwork.NetInterface
                                public void onSwitch(boolean z11, Network network) {
                                    if (z11) {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        b.this.a(context, i11, str, "https://opencloud.wostore.cn/openapi/netauth/precheck/wp?", network, woCallback);
                                    } else {
                                        woCallback.onResult(IjkMediaPlayer.FFP_PROP_FLOAT_PLAYBACK_RATE, "无法切换至数据网络");
                                        WoNetwork.a().b();
                                    }
                                }
                            });
                        }
                    });
                    return;
                }
                if (com.mob.secverify.pure.core.ope.wo.c.b.a(context.getApplicationContext()) == 0) {
                    try {
                        a(context, i11, str, "https://opencloud.wostore.cn/openapi/netauth/precheck/wp?", null, woCallback);
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        woCallback2 = woCallback;
                        woCallback2.onResult(10005, "网络判断异常" + e.getMessage());
                        WoNetwork.a().b();
                        return;
                    }
                }
                woCallback.onResult(IjkMediaPlayer.FFP_PROP_FLOAT_AVDELAY, "数据网络未开启");
                WoNetwork.a().b();
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            woCallback2 = woCallback;
        }
    }
}
