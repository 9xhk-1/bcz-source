package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.push.gb;
import com.xiaomi.push.hm;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile o f46377a;

    /* renamed from: a, reason: collision with other field name */
    private long f1013a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f1014a;

    /* renamed from: a, reason: collision with other field name */
    private final SharedPreferences f1015a;

    /* renamed from: b, reason: collision with other field name */
    private final boolean f1020b;

    /* renamed from: c, reason: collision with other field name */
    private final boolean f1021c;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicInteger f1017a = new AtomicInteger(0);

    /* renamed from: a, reason: collision with other field name */
    private String f1016a = null;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f1018a = false;

    /* renamed from: b, reason: collision with root package name */
    private String f46378b = null;

    /* renamed from: b, reason: collision with other field name */
    private final AtomicInteger f1019b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f46379c = new AtomicInteger(0);

    /* renamed from: a, reason: collision with other field name */
    private int f1012a = -1;

    public static class a {
        public static String a() {
            return "support_wifi_digest";
        }

        public static String b() {
            return "record_support_wifi_digest_reported";
        }

        public static String c() {
            return "record_hb_count_start";
        }

        public static String d() {
            return "record_short_hb_count";
        }

        public static String e() {
            return "record_long_hb_count";
        }

        public static String f() {
            return "record_hb_change";
        }

        public static String g() {
            return "record_mobile_ptc";
        }

        public static String h() {
            return "record_wifi_ptc";
        }

        public static String i() {
            return "record_ptc_start";
        }

        public static String j() {
            return "keep_short_hb_effective_time";
        }

        public static String a(String str) {
            return String.format("HB_%s", str);
        }

        public static String b(String str) {
            return String.format("HB_dead_time_%s", str);
        }
    }

    private o(Context context) {
        this.f1014a = context;
        this.f1021c = com.xiaomi.push.j.m6172a(context);
        this.f1020b = ba.a(context).a(hm.IntelligentHeartbeatSwitchBoolean.a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f1015a = sharedPreferences;
        long currentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(a.c(), -1L) == -1) {
            sharedPreferences.edit().putLong(a.c(), currentTimeMillis).apply();
        }
        long j11 = sharedPreferences.getLong(a.i(), -1L);
        this.f1013a = j11;
        if (j11 == -1) {
            this.f1013a = currentTimeMillis;
            sharedPreferences.edit().putLong(a.i(), currentTimeMillis).apply();
        }
    }

    private int a() {
        if (!TextUtils.isEmpty(this.f1016a)) {
            try {
                return this.f1015a.getInt(a.a(this.f1016a), -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    private long b() {
        return this.f1015a.getLong(a.j(), -1L);
    }

    private long c() {
        return ba.a(this.f1014a).a(hm.ShortHeartbeatEffectivePeriodMsLong.a(), 777600000L);
    }

    private void e() {
        if (this.f1015a.getBoolean(a.a(), false)) {
            return;
        }
        this.f1015a.edit().putBoolean(a.a(), true).apply();
    }

    private void f() {
        int i11 = this.f1012a;
        String h11 = i11 != 0 ? i11 != 1 ? null : a.h() : a.g();
        if (TextUtils.isEmpty(h11)) {
            return;
        }
        if (this.f1015a.getLong(a.i(), -1L) == -1) {
            this.f1013a = System.currentTimeMillis();
            this.f1015a.edit().putLong(a.i(), this.f1013a).apply();
        }
        this.f1015a.edit().putInt(h11, this.f1015a.getInt(h11, 0) + 1).apply();
    }

    private void g() {
        int i11;
        String[] split;
        String[] split2;
        if (m6277c()) {
            String string = this.f1015a.getString(a.f(), null);
            char c11 = 1;
            char c12 = 0;
            if (!TextUtils.isEmpty(string) && (split = string.split("###")) != null) {
                int i12 = 0;
                while (i12 < split.length) {
                    if (!TextUtils.isEmpty(split[i12]) && (split2 = split[i12].split(":::")) != null && split2.length >= 4) {
                        String str = split2[c12];
                        String str2 = split2[c11];
                        String str3 = split2[2];
                        String str4 = split2[3];
                        HashMap hashMap = new HashMap();
                        hashMap.put(NotificationCompat.CATEGORY_EVENT, "change");
                        hashMap.put("model", Build.MODEL);
                        hashMap.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, str2);
                        hashMap.put("net_name", str);
                        hashMap.put("interval", str3);
                        hashMap.put(com.alipay.sdk.m.t.a.f11034k, str4);
                        a("category_hb_change", null, hashMap);
                        com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] report hb changed events.");
                    }
                    i12++;
                    c11 = 1;
                    c12 = 0;
                }
                this.f1015a.edit().remove(a.f()).apply();
            }
            if (this.f1015a.getBoolean(a.a(), false) && !this.f1015a.getBoolean(a.b(), false)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(NotificationCompat.CATEGORY_EVENT, "support");
                hashMap2.put("model", Build.MODEL);
                hashMap2.put(com.alipay.sdk.m.t.a.f11034k, String.valueOf(System.currentTimeMillis() / 1000));
                a("category_hb_change", null, hashMap2);
                com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] report support wifi digest events.");
                this.f1015a.edit().putBoolean(a.b(), true).apply();
            }
            if (m6278e()) {
                int i13 = this.f1015a.getInt(a.d(), 0);
                int i14 = this.f1015a.getInt(a.e(), 0);
                if (i13 > 0 || i14 > 0) {
                    long j11 = this.f1015a.getLong(a.c(), -1L);
                    String valueOf = String.valueOf(235000);
                    String valueOf2 = String.valueOf(j11);
                    String valueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("interval", valueOf);
                        jSONObject.put("c_short", String.valueOf(i13));
                        jSONObject.put("c_long", String.valueOf(i14));
                        jSONObject.put("count", String.valueOf(i13 + i14));
                        jSONObject.put("start_time", valueOf2);
                        jSONObject.put("end_time", valueOf3);
                        String jSONObject2 = jSONObject.toString();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(NotificationCompat.CATEGORY_EVENT, "long_and_short_hb_count");
                        a("category_hb_count", jSONObject2, hashMap3);
                        com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f1015a.edit().putInt(a.d(), 0).putInt(a.e(), 0).putLong(a.c(), System.currentTimeMillis()).apply();
            }
            if (m6279f()) {
                String valueOf4 = String.valueOf(this.f1013a);
                String valueOf5 = String.valueOf(System.currentTimeMillis());
                int i15 = this.f1015a.getInt(a.g(), 0);
                if (i15 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, "M");
                        jSONObject3.put("ptc", i15);
                        jSONObject3.put("start_time", valueOf4);
                        jSONObject3.put("end_time", valueOf5);
                        String jSONObject4 = jSONObject3.toString();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put(NotificationCompat.CATEGORY_EVENT, "ptc_event");
                        a("category_lc_ptc", jSONObject4, hashMap4);
                        com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] report ping timeout count events of mobile network.");
                        this.f1015a.edit().putInt(a.g(), 0).apply();
                    } catch (Throwable unused2) {
                        i11 = 0;
                        this.f1015a.edit().putInt(a.g(), 0).apply();
                    }
                }
                i11 = 0;
                int i16 = this.f1015a.getInt(a.h(), i11);
                if (i16 > 0) {
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, ExifInterface.LONGITUDE_WEST);
                        jSONObject5.put("ptc", i16);
                        jSONObject5.put("start_time", valueOf4);
                        jSONObject5.put("end_time", valueOf5);
                        String jSONObject6 = jSONObject5.toString();
                        HashMap hashMap5 = new HashMap();
                        hashMap5.put(NotificationCompat.CATEGORY_EVENT, "ptc_event");
                        a("category_lc_ptc", jSONObject6, hashMap5);
                        com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f1015a.edit().putInt(a.h(), 0).apply();
                }
                this.f1013a = System.currentTimeMillis();
                this.f1015a.edit().putLong(a.i(), this.f1013a).apply();
            }
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m6285d() {
        if (d()) {
            g();
            if (this.f1018a) {
                this.f1017a.getAndSet(0);
            }
        }
    }

    private void d(String str) {
        String str2;
        String str3;
        if (m6277c() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = ExifInterface.LONGITUDE_WEST;
            } else if (!str.startsWith("M-")) {
                return;
            } else {
                str2 = "M";
            }
            String valueOf = String.valueOf(235000);
            String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(":::");
            sb2.append(str2);
            sb2.append(":::");
            sb2.append(valueOf);
            sb2.append(":::");
            sb2.append(valueOf2);
            String string = this.f1015a.getString(a.f(), null);
            if (TextUtils.isEmpty(string)) {
                str3 = sb2.toString();
            } else {
                str3 = string + "###" + sb2.toString();
            }
            this.f1015a.edit().putString(a.f(), str3).apply();
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    private boolean m6278e() {
        long j11 = this.f1015a.getLong(a.c(), -1L);
        if (j11 == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j11 > currentTimeMillis || currentTimeMillis - j11 >= 259200000;
    }

    /* renamed from: f, reason: collision with other method in class */
    private boolean m6279f() {
        if (this.f1013a == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f1013a;
        return j11 > currentTimeMillis || currentTimeMillis - j11 >= 259200000;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m6280a() {
        int a11;
        long b11 = gb.b();
        if (this.f1021c && !m6276b() && ((ba.a(this.f1014a).a(hm.IntelligentHeartbeatSwitchBoolean.a(), true) || b() >= System.currentTimeMillis()) && (a11 = a()) != -1)) {
            b11 = a11;
        }
        if (!TextUtils.isEmpty(this.f1016a) && !"WIFI-ID-UNKNOWN".equals(this.f1016a) && this.f1012a == 1) {
            a(b11 < 300000);
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] ping interval:" + b11);
        return b11;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m6283b() {
        if (d()) {
            f();
            if (this.f1018a && !TextUtils.isEmpty(this.f1016a) && this.f1016a.equals(this.f46378b)) {
                this.f1017a.getAndIncrement();
                com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] ping timeout count:" + this.f1017a);
                if (m6275a()) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] change hb interval for net:" + this.f1016a);
                    c(this.f1016a);
                    this.f1018a = false;
                    this.f1017a.getAndSet(0);
                    d(this.f1016a);
                }
            }
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m6284c() {
        if (d()) {
            this.f46378b = this.f1016a;
        }
    }

    public static o a(Context context) {
        if (f46377a == null) {
            synchronized (o.class) {
                try {
                    if (f46377a == null) {
                        f46377a = new o(context);
                    }
                } finally {
                }
            }
        }
        return f46377a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "WIFI-ID-UNKNOWN"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L16
            java.lang.String r10 = r9.f1016a
            if (r10 == 0) goto L15
            java.lang.String r0 = "W-"
            boolean r10 = r10.startsWith(r0)
            if (r10 == 0) goto L15
            goto L18
        L15:
            r10 = 0
        L16:
            r9.f1016a = r10
        L18:
            android.content.SharedPreferences r10 = r9.f1015a
            java.lang.String r0 = r9.f1016a
            java.lang.String r0 = com.xiaomi.push.service.o.a.a(r0)
            r1 = -1
            int r10 = r10.getInt(r0, r1)
            android.content.SharedPreferences r0 = r9.f1015a
            java.lang.String r2 = r9.f1016a
            java.lang.String r2 = com.xiaomi.push.service.o.a.b(r2)
            r3 = -1
            long r5 = r0.getLong(r2, r3)
            long r7 = java.lang.System.currentTimeMillis()
            if (r10 == r1) goto L75
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L56
            android.content.SharedPreferences r10 = r9.f1015a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f1016a
            java.lang.String r0 = com.xiaomi.push.service.o.a.b(r0)
            long r2 = r9.c()
            long r7 = r7 + r2
            android.content.SharedPreferences$Editor r10 = r10.putLong(r0, r7)
        L52:
            r10.apply()
            goto L75
        L56:
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L75
            android.content.SharedPreferences r10 = r9.f1015a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f1016a
            java.lang.String r0 = com.xiaomi.push.service.o.a.a(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            java.lang.String r0 = r9.f1016a
            java.lang.String r0 = com.xiaomi.push.service.o.a.b(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            goto L52
        L75:
            java.util.concurrent.atomic.AtomicInteger r10 = r9.f1017a
            r0 = 0
            r10.getAndSet(r0)
            java.lang.String r10 = r9.f1016a
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L8e
            int r10 = r9.a()
            if (r10 == r1) goto L8a
            goto L8e
        L8a:
            r10 = 1
            r9.f1018a = r10
            goto L90
        L8e:
            r9.f1018a = r0
        L90:
            java.lang.String r10 = r9.f1016a
            boolean r0 = r9.f1018a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r0}
            java.lang.String r0 = "[HB] network changed, netid:%s, %s"
            java.lang.String r10 = java.lang.String.format(r0, r10)
            com.xiaomi.channel.commonutils.logger.b.m5639a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.o.b(java.lang.String):void");
    }

    private void c(String str) {
        if (a(str)) {
            this.f1015a.edit().putInt(a.a(str), 235000).apply();
            this.f1015a.edit().putLong(a.b(this.f1016a), System.currentTimeMillis() + c()).apply();
        }
    }

    private boolean d() {
        return this.f1021c && (this.f1020b || ((b() > System.currentTimeMillis() ? 1 : (b() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    /* renamed from: b, reason: collision with other method in class */
    private boolean m6276b() {
        return (TextUtils.isEmpty(this.f1016a) || !this.f1016a.startsWith("M-") || ba.a(this.f1014a).a(hm.IntelligentHeartbeatUseInMobileNetworkBoolean.a(), false)) ? false : true;
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m6277c() {
        return d() && ba.a(this.f1014a).a(hm.IntelligentHeartbeatDataCollectSwitchBoolean.a(), true) && com.xiaomi.push.n.China.name().equals(com.xiaomi.push.service.a.a(this.f1014a).a());
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6281a() {
    }

    public void a(int i11) {
        this.f1015a.edit().putLong(a.j(), System.currentTimeMillis() + (i11 * 1000)).apply();
    }

    public synchronized void a(NetworkInfo networkInfo) {
        try {
            if (d()) {
                String str = null;
                if (networkInfo != null) {
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        if (!TextUtils.isEmpty(subtypeName) && !"UNKNOWN".equalsIgnoreCase(subtypeName)) {
                            str = "M-" + subtypeName;
                        }
                        b(str);
                        this.f1012a = 0;
                    } else {
                        if (networkInfo.getType() != 1) {
                            if (networkInfo.getType() == 6) {
                            }
                        }
                        b("WIFI-ID-UNKNOWN");
                        this.f1012a = 1;
                    }
                }
                b(null);
                this.f1012a = -1;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m6282a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                e();
            }
            if (d() && !TextUtils.isEmpty(str)) {
                b("W-" + str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r3 = this;
            com.xiaomi.push.hl r0 = new com.xiaomi.push.hl
            r0.<init>()
            r0.d(r4)
            java.lang.String r4 = "hb_name"
            r0.c(r4)
            java.lang.String r4 = "hb_channel"
            r0.a(r4)
            r1 = 1
            r0.a(r1)
            r0.b(r5)
            r4 = 0
            r0.a(r4)
            long r1 = java.lang.System.currentTimeMillis()
            r0.b(r1)
            android.content.Context r5 = r3.f1014a
            java.lang.String r5 = r5.getPackageName()
            r0.g(r5)
            java.lang.String r5 = "com.xiaomi.xmsf"
            r0.e(r5)
            if (r6 != 0) goto L3a
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
        L3a:
            android.content.Context r5 = r3.f1014a
            com.xiaomi.push.service.t r5 = com.xiaomi.push.service.u.m6297a(r5)
            if (r5 == 0) goto L58
            java.lang.String r1 = r5.f1035a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L58
            java.lang.String r5 = r5.f1035a
            java.lang.String r1 = "@"
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            if (r1 <= 0) goto L58
            r4 = r5[r4]
            goto L59
        L58:
            r4 = 0
        L59:
            java.lang.String r5 = "uuid"
            r6.put(r5, r4)
            java.lang.String r4 = "model"
            java.lang.String r5 = android.os.Build.MODEL
            r6.put(r4, r5)
            android.content.Context r4 = r3.f1014a
            java.lang.String r5 = r4.getPackageName()
            int r4 = com.xiaomi.push.g.a(r4, r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "avc"
            r6.put(r5, r4)
            r4 = 50008(0xc358, float:7.0076E-41)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "pvc"
            r6.put(r5, r4)
            r4 = 48
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "cvc"
            r6.put(r5, r4)
            r0.a(r6)
            android.content.Context r4 = r3.f1014a
            com.xiaomi.push.hf r4 = com.xiaomi.push.hf.a(r4)
            if (r4 == 0) goto La3
            android.content.Context r5 = r3.f1014a
            java.lang.String r5 = r5.getPackageName()
            r4.a(r0, r5)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.o.a(java.lang.String, java.lang.String, java.util.Map):void");
    }

    private void a(boolean z11) {
        if (m6277c()) {
            int incrementAndGet = (z11 ? this.f1019b : this.f46379c).incrementAndGet();
            com.xiaomi.channel.commonutils.logger.b.b(String.format("[HB] %s ping interval count: %s", z11 ? "short" : "long", Integer.valueOf(incrementAndGet)));
            if (incrementAndGet >= 5) {
                String d11 = z11 ? a.d() : a.e();
                int i11 = this.f1015a.getInt(d11, 0) + incrementAndGet;
                this.f1015a.edit().putInt(d11, i11).apply();
                com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("[HB] accumulate %s hb count(%s) and write to file. ", z11 ? "short" : "long", Integer.valueOf(i11)));
                (z11 ? this.f1019b : this.f46379c).set(0);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m6275a() {
        return this.f1017a.get() >= Math.max(ba.a(this.f1014a).a(hm.IntelligentHeartbeatNATCountInt.a(), 5), 3);
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }
}
