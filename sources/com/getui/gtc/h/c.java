package com.getui.gtc.h;

import android.os.Build;
import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.http.MediaType;
import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.RequestBody;
import com.getui.gtc.base.http.crypt.PtRASCryptoInterceptor;
import com.getui.gtc.base.util.ScheduleQueue;
import com.getui.gtc.dim.Caller;
import com.getui.gtc.dim.DimManager;
import com.getui.gtc.dim.DimRequest;
import com.getui.gtc.i.d.b;
import com.getui.gtc.server.ServerManager;
import com.huawei.hms.android.SystemUtils;
import com.vivo.push.PushClientConstants;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c {

    public interface a {
        void a(String str);
    }

    public static String a(String str) throws Exception {
        com.getui.gtc.i.d.b unused;
        com.getui.gtc.i.d.b unused2;
        com.getui.gtc.i.d.b unused3;
        com.getui.gtc.i.d.b unused4;
        while (true) {
            String server = ServerManager.getServer("gtc.as");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", "1.0");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("data", jSONObject2);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject2.put("gtcid", str);
                }
                unused = b.C0360b.f30118a;
                DimRequest.Builder key = new DimRequest.Builder().key("dim-2-1-5-1");
                Caller caller = Caller.UNKNOWN;
                String str2 = (String) DimManager.getInstance().get(key.caller(caller).useExpiredCacheForReserve(true).build());
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject2.put("oaid", str2);
                }
                if (SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(Build.MANUFACTURER)) {
                    unused2 = b.C0360b.f30118a;
                    String str3 = (String) DimManager.getInstance().get(new DimRequest.Builder().key("dim-2-1-5-2").caller(caller).build());
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject2.put("oaid2", str3);
                    }
                }
                jSONObject2.put("gtAppid", com.getui.gtc.c.b.f29824a);
                jSONObject2.put(PushClientConstants.TAG_PKG_NAME, GtcProvider.context().getPackageName());
                jSONObject2.put("os", "android");
                unused3 = b.C0360b.f30118a;
                String str4 = (String) DimManager.getInstance().get(new DimRequest.Builder().key("dim-2-1-8-1").caller(caller).useExpiredCacheForReserve(true).build());
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject2.put("androidAid", str4);
                }
                unused4 = b.C0360b.f30118a;
                String str5 = (String) DimManager.getInstance().get(new DimRequest.Builder().key("dim-2-1-10-1").caller(caller).useExpiredCacheForReserve(true).build());
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject2.put("phoneModel", str5);
                }
                JSONObject jSONObject3 = new JSONObject(d.f30097a.newCall(new Request.Builder().url(String.format("%s/cidserver/getcid", server)).method("POST").body(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString())).cryptInterceptor(new PtRASCryptoInterceptor(com.getui.gtc.c.b.f29832i, com.getui.gtc.c.b.f29831h)).tag("register gtcid").build()).execute().body().string());
                int i11 = jSONObject3.getInt("errno");
                String string = jSONObject3.getString("errmsg");
                if (i11 == 0) {
                    return jSONObject3.getJSONObject("data").getString("gtcid");
                }
                throw new Exception(string);
            } catch (Throwable th2) {
                if (!(th2 instanceof IOException) || !ServerManager.switchServer("gtc.as", server)) {
                    throw th2;
                }
                com.getui.gtc.i.c.a.c("register gtcId failed with server: " + server + ", try again with: " + ServerManager.getServer("gtc.as"));
            }
        }
        throw th2;
    }

    public static void a(final String str, final a aVar) {
        ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.h.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String a11 = c.a(str);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(a11);
                    }
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.c("register gtcId failed: " + th2.getMessage());
                }
            }
        });
    }
}
