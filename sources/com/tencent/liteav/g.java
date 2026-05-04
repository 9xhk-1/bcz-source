package com.tencent.liteav;

import android.content.Context;
import android.content.SharedPreferences;
import c40.t0;
import com.heytap.mcssdk.constant.IntentConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static volatile g f43579d;

    /* renamed from: a, reason: collision with root package name */
    private Context f43580a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, List<b>> f43581b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Long> f43582c = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends b {

        /* renamed from: c, reason: collision with root package name */
        private int f43585c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43586d;

        /* renamed from: e, reason: collision with root package name */
        private long f43587e;

        public a(int i11, boolean z11, long j11, String str) {
            super(str, "40302");
            this.f43585c = i11;
            this.f43586d = z11;
            this.f43587e = j11;
        }

        public String toString() {
            return a().toString();
        }

        private JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("SengmentDuration", this.f43585c);
                jSONObject.put("ReportSwitch", this.f43586d);
                jSONObject.put("ExpireTime", this.f43587e);
                jSONObject.put("appid", this.f43588a);
                jSONObject.put("eventid", this.f43589b);
                return jSONObject;
            } catch (JSONException e11) {
                TXCLog.e("TXCVodPlayReportControl", "toJsonObject jsonexception: " + e11.toString());
                return jSONObject;
            }
        }

        public a(String str) {
            this.f43585c = 60;
            this.f43586d = false;
            this.f43587e = 0L;
            a(str);
        }

        @Override // com.tencent.liteav.g.b
        public void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f43585c = jSONObject.optInt("SengmentDuration", 60);
                this.f43586d = jSONObject.optBoolean("ReportSwitch", false);
                this.f43587e = jSONObject.optLong("ExpireTime", (System.currentTimeMillis() / 1000) + 3600);
                this.f43588a = jSONObject.optString("appid", "");
                this.f43589b = jSONObject.optString("eventid", "");
            } catch (JSONException e11) {
                TXCLog.i("TXCVodPlayReportControl", "parseFromString: " + e11.toString());
                this.f43585c = 60;
                this.f43586d = false;
                this.f43587e = 0L;
                this.f43588a = "";
                this.f43589b = "40302";
            }
        }
    }

    private g(Context context) {
        this.f43580a = context.getApplicationContext();
        a();
    }

    private long d(String str) {
        if (str == null || str.isEmpty()) {
            return (System.currentTimeMillis() / 1000) + 3600;
        }
        if (this.f43582c.containsKey(str)) {
            return this.f43582c.get(str).longValue();
        }
        List<b> list = this.f43581b.get(str);
        if (list == null) {
            return 0L;
        }
        for (b bVar : list) {
            if ("40302".equals(bVar.f43589b) && str.equalsIgnoreCase(bVar.f43588a)) {
                return ((a) bVar).f43587e;
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.g.e(java.lang.String):void");
    }

    private void f(String str) {
        if (str == null || str.isEmpty()) {
            TXCLog.i("TXCVodPlayReportControl", "response msg is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("code");
            TXCLog.i("TXCVodPlayReportControl", "code = " + i11 + " ,message = " + jSONObject.optString("message") + " , requestID= " + jSONObject.optString(HwPayConstant.KEY_REQUESTID));
            if (i11 == 0 && jSONObject.getInt("version") == 1) {
                a(jSONObject);
            }
        } catch (JSONException e11) {
            TXCLog.e("TXCVodPlayReportControl", "parseJson err: " + e11.toString());
        }
    }

    private String g(String str) {
        String str2 = "https://vodreport.qcloud.com/describeControlInfos/v1/" + str + "?sdkVersion=" + TXCCommonUtil.getSDKVersionStr();
        TXCLog.i("TXCVodPlayReportControl", "makeUrl: " + str2);
        return str2;
    }

    private List<b> h(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null) {
                    optJSONObject.optString("appid", "");
                    if (optJSONObject.optString("eventid", "").equalsIgnoreCase("40302")) {
                        String optString = optJSONObject.optString("40302", "");
                        if (!optString.isEmpty()) {
                            arrayList.add(new a(optString));
                        }
                    }
                }
            }
            return arrayList;
        } catch (JSONException e11) {
            TXCLog.e("TXCVodPlayReportControl", "controlDataListParseFormString :" + e11.toString());
            return arrayList;
        }
    }

    public boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        synchronized (this) {
            try {
                List<b> list = this.f43581b.get(str);
                if (list != null) {
                    for (b bVar : list) {
                        if (bVar != null && "40302".equals(bVar.f43589b) && str.equalsIgnoreCase(bVar.f43588a)) {
                            a aVar = (a) bVar;
                            if (aVar.f43587e > System.currentTimeMillis() / 1000) {
                                return aVar.f43586d;
                            }
                        }
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(final String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        synchronized (this) {
            try {
                if (d(str) < System.currentTimeMillis() / 1000) {
                    TXCLog.i("TXCVodPlayReportControl", "RequestReportControl");
                    a(str, (System.currentTimeMillis() / 1000) + 3600);
                    new Thread(new Runnable() { // from class: com.tencent.liteav.g.1
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.e(str);
                            g.this.b();
                        }
                    }, "report_control").start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        protected String f43588a;

        /* renamed from: b, reason: collision with root package name */
        protected String f43589b;

        public b(String str, String str2) {
            this.f43588a = str;
            this.f43589b = str2;
        }

        public void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f43588a = jSONObject.optString("appid", "");
                this.f43589b = jSONObject.optString("eventid", "");
            } catch (JSONException e11) {
                TXCLog.i("TXCVodPlayReportControl", "parseFromString: " + e11.toString());
                this.f43588a = "";
                this.f43589b = "";
            }
        }

        public b() {
            this.f43588a = "";
            this.f43589b = "";
        }
    }

    public static g a(Context context) {
        if (f43579d == null) {
            synchronized (g.class) {
                try {
                    if (f43579d == null) {
                        f43579d = new g(context);
                    }
                } finally {
                }
            }
        }
        return f43579d;
    }

    public int a(String str) {
        if (str == null || str.isEmpty()) {
            return 60;
        }
        synchronized (this) {
            try {
                List<b> list = this.f43581b.get(str);
                if (list != null) {
                    for (b bVar : list) {
                        if (bVar != null && "40302".equals(bVar.f43589b) && str.equalsIgnoreCase(bVar.f43588a)) {
                            a aVar = (a) bVar;
                            if (aVar.f43587e > System.currentTimeMillis() / 1000) {
                                return aVar.f43585c;
                            }
                        }
                    }
                }
                return 60;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        SharedPreferences.Editor edit;
        int i11 = 0;
        SharedPreferences sharedPreferences = this.f43580a.getSharedPreferences("vod_report_config", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || this.f43581b.size() <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Map.Entry<String, List<b>>> it = this.f43581b.entrySet().iterator();
        while (it.hasNext()) {
            int i12 = i11 + 1;
            try {
                jSONArray.put(i11, a(it.next().getValue()));
            } catch (JSONException e11) {
                TXCLog.e("TXCVodPlayReportControl", "" + e11.toString());
            }
            i11 = i12;
        }
        edit.putString("value", jSONArray.toString());
        edit.apply();
    }

    private void a(String str, long j11) {
        this.f43582c.put(str, Long.valueOf(j11));
        TXCLog.i("TXCVodPlayReportControl", "SetReportExpireTime in mem appid= " + str + " , time=" + j11);
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f43580a.getSharedPreferences("vod_report_config", 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("value", "");
            if (string.isEmpty()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    List<b> h11 = h(jSONArray.optString(i11));
                    if (h11 != null && h11.size() > 0) {
                        this.f43581b.put(h11.get(0).f43588a, h11);
                    }
                }
            } catch (JSONException e11) {
                TXCLog.e("TXCVodPlayReportControl", "" + e11.toString());
            }
        }
    }

    private void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("controlInfos");
        int optInt = jSONObject.optInt("appId");
        if (optInt == 0) {
            TXCLog.i("TXCVodPlayReportControl", "response appid is zero!");
            return;
        }
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
            if (optJSONObject != null && "40302".equals(optJSONObject.optString(IntentConstant.EVENT_ID))) {
                long optLong = optJSONObject.optLong(HwPayConstant.KEY_EXPIRETIME, 0L);
                if (optLong > System.currentTimeMillis() / 1000) {
                    String optString = optJSONObject.optString("switch");
                    int optInt2 = optJSONObject.optInt("frequency", 60);
                    int i12 = optInt2 < 60 ? 60 : optInt2;
                    arrayList.add(new a(i12, t0.f7979d.equalsIgnoreCase(optString), optLong, "" + optInt));
                }
            }
        }
        synchronized (this) {
            try {
                if (arrayList.size() != 0) {
                    this.f43581b.put("" + optInt, arrayList);
                    this.f43582c.remove(Integer.valueOf(optInt));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String a(List<b> list) {
        if (list == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        int i11 = 0;
        for (b bVar : list) {
            JSONObject jSONObject = new JSONObject();
            if ("40302".equals(bVar.f43589b)) {
                a aVar = (a) bVar;
                try {
                    jSONObject.put("appid", aVar.f43588a);
                    jSONObject.put("eventid", aVar.f43589b);
                    jSONObject.put("40302", aVar.toString());
                } catch (JSONException e11) {
                    TXCLog.e("TXCVodPlayReportControl", "controlDataListToString jsonObject.put：" + e11.toString());
                }
            }
            int i12 = i11 + 1;
            try {
                jSONArray.put(i11, jSONObject);
            } catch (JSONException e12) {
                TXCLog.e("TXCVodPlayReportControl", "jsonArray.put： " + e12.toString());
            }
            i11 = i12;
        }
        return jSONArray.toString();
    }
}
