package com.tencent.liteav.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    protected static n f43845a = new n();

    /* renamed from: b, reason: collision with root package name */
    private Context f43846b = null;

    /* renamed from: c, reason: collision with root package name */
    private long f43847c = 3;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public float f43848a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        public float f43849b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f43850c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f43851d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public long f43852e = 0;

        public a() {
        }
    }

    public static n a() {
        return f43845a;
    }

    private void d() {
        long a11 = com.tencent.liteav.basic.d.c.a().a("Network", "QualityDataCacheCount");
        this.f43847c = a11;
        if (a11 == -1 || a11 < 3) {
            this.f43847c = 3L;
        }
    }

    public String b() {
        try {
            Context context = this.f43846b;
            if (context != null) {
                int d11 = com.tencent.liteav.basic.util.h.d(context);
                return d11 == 0 ? "" : d11 == 1 ? "wifi:" : d11 == 2 ? "4g:" : d11 == 3 ? "3g:" : d11 == 4 ? "2g:" : d11 == 5 ? "ethernet:" : "xg:";
            }
        } catch (Exception e11) {
            TXCLog.e("UploadQualityData", "get network type failed." + e11.getMessage());
        }
        return "";
    }

    public boolean c() {
        d();
        String b11 = b();
        String str = "isDomainAddressBetter: accessID = " + b11 + " minQualityDataCount = " + this.f43847c;
        a a11 = a(b11, true);
        a a12 = a(b11, false);
        if (a11 != null) {
            str = String.format("%s \n isDomainAddressBetter：domainQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str, Long.valueOf(a11.f43852e), Float.valueOf(a11.f43848a), Float.valueOf(a11.f43849b), Float.valueOf(a11.f43850c), Float.valueOf(a11.f43851d));
        }
        String str2 = str;
        if (a12 != null) {
            str2 = String.format("%s \n isDomainAddressBetter：originQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str2, Long.valueOf(a12.f43852e), Float.valueOf(a12.f43848a), Float.valueOf(a12.f43849b), Float.valueOf(a12.f43850c), Float.valueOf(a12.f43851d));
        }
        TXCLog.e("UploadQualityData", str2);
        if (a11 != null) {
            long j11 = a11.f43852e;
            long j12 = this.f43847c;
            if (j11 >= j12 && a12 != null && a12.f43852e >= j12 && a11.f43849b < a12.f43849b && a11.f43850c < a12.f43850c && a11.f43851d < a12.f43851d) {
                return true;
            }
        }
        return false;
    }

    public void a(Context context) {
        if (this.f43846b == null) {
            this.f43846b = context.getApplicationContext();
        }
    }

    public void a(String str, long j11, long j12, long j13, float f11, float f12, float f13) {
        if (com.tencent.liteav.basic.d.c.a().a("Network", "QualityDataCacheCount") > 0) {
            TXCLog.e("UploadQualityData", String.format("updateQualityData: accessID = %s serverType = %d totalTime = %d networkRTT = %d avgBlockCnt = %f avgVideoQue = %f avgAudioQue = %f", str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
            if (b(str)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f43846b.getSharedPreferences("com.tencent.liteav.network", 0);
                JSONObject c11 = c(sharedPreferences.getString("34238512-C08C-4931-A000-40E1D8B5BA5B", ""));
                JSONObject optJSONObject = c11.optJSONObject(str);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                String str2 = j11 == 3 ? "DomainArrayData" : "OriginArrayData";
                JSONArray optJSONArray = optJSONObject.optJSONArray(str2);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("totalTime", j12);
                jSONObject.put("networkRTT", j13);
                jSONObject.put("avgBlockCnt", f11);
                jSONObject.put("avgVideoQue", f12);
                jSONObject.put("avgAudioQue", f13);
                optJSONArray.put(jSONObject);
                int length = optJSONArray.length();
                long j14 = length;
                if (j14 > this.f43847c) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i11 = (int) (j14 - this.f43847c); i11 < length; i11++) {
                        jSONArray.put(optJSONArray.get(i11));
                    }
                    optJSONArray = jSONArray;
                }
                optJSONObject.put(str2, optJSONArray);
                c11.put(str, optJSONObject);
                sharedPreferences.edit().putString("34238512-C08C-4931-A000-40E1D8B5BA5B", c11.toString()).commit();
            } catch (Exception e11) {
                TXCLog.e("UploadQualityData", "build json object failed.", e11);
            }
        }
    }

    private boolean b(String str) {
        return str == null || str.length() == 0;
    }

    private JSONObject c(String str) {
        if (!b(str)) {
            try {
                return new JSONObject(str);
            } catch (Exception e11) {
                TXCLog.e("UploadQualityData", "failed to parse json string", e11);
            }
        }
        return new JSONObject();
    }

    private a a(String str, boolean z11) {
        a aVar;
        JSONObject optJSONObject;
        String str2 = "avgAudioQue";
        if (b(str)) {
            return null;
        }
        try {
            String string = this.f43846b.getSharedPreferences("com.tencent.liteav.network", 0).getString("34238512-C08C-4931-A000-40E1D8B5BA5B", "");
            if (b(string) || (optJSONObject = new JSONObject(string).optJSONObject(str)) == null) {
                return null;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray(z11 ? "DomainArrayData" : "OriginArrayData");
            if (optJSONArray == null) {
                return null;
            }
            long length = optJSONArray.length();
            if (length == 0) {
                return null;
            }
            String str3 = "";
            aVar = null;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i11 = 0;
            float f14 = 0.0f;
            while (i11 < length) {
                try {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i11);
                    f12 = (float) (f12 + jSONObject.optDouble("avgBlockCnt"));
                    f14 = (float) (f14 + jSONObject.optDouble("avgVideoQue"));
                    float optDouble = (float) (f13 + jSONObject.optDouble(str2));
                    str3 = String.format("%s \n isDomainAddressBetter：itemData domain = %b NetworkRTT = %d avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str3, Boolean.valueOf(z11), Long.valueOf(jSONObject.optLong("networkRTT")), Double.valueOf(jSONObject.optDouble("avgBlockCnt")), Double.valueOf(jSONObject.optDouble("avgVideoQue")), Double.valueOf(jSONObject.optDouble(str2)));
                    i11++;
                    f13 = optDouble;
                    f11 += jSONObject.optLong("networkRTT");
                    str2 = str2;
                } catch (Exception e11) {
                    e = e11;
                    TXCLog.e("UploadQualityData", "get quality data failed.", e);
                    return aVar;
                }
            }
            float f15 = length;
            float f16 = f11 / f15;
            float f17 = f12 / f15;
            float f18 = f14 / f15;
            float f19 = f13 / f15;
            a aVar2 = new a();
            aVar2.f43848a = f16;
            aVar2.f43849b = f17;
            aVar2.f43850c = f18;
            aVar2.f43851d = f19;
            aVar2.f43852e = length;
            return aVar2;
        } catch (Exception e12) {
            e = e12;
            aVar = null;
        }
    }

    public long a(String str) {
        Context context = this.f43846b;
        if (context != null) {
            return context.getSharedPreferences("com.tencent.liteav.network", 0).getLong(str, 0L);
        }
        return 0L;
    }

    public void a(String str, long j11) {
        Context context = this.f43846b;
        if (context != null) {
            context.getSharedPreferences("com.tencent.liteav.network", 0).edit().putLong(str, j11).commit();
        }
    }
}
