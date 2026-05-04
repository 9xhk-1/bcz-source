package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: o, reason: collision with root package name */
    private static final String f35685o = "d";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f35686a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f35687b;

    /* renamed from: c, reason: collision with root package name */
    private int f35688c;

    /* renamed from: d, reason: collision with root package name */
    private long f35689d;

    /* renamed from: e, reason: collision with root package name */
    private long f35690e;

    /* renamed from: f, reason: collision with root package name */
    private long f35691f;

    /* renamed from: g, reason: collision with root package name */
    private String f35692g;

    /* renamed from: h, reason: collision with root package name */
    private int f35693h;

    /* renamed from: i, reason: collision with root package name */
    private int f35694i;

    /* renamed from: j, reason: collision with root package name */
    private String f35695j;

    /* renamed from: k, reason: collision with root package name */
    private long f35696k;

    /* renamed from: l, reason: collision with root package name */
    private String f35697l;

    /* renamed from: m, reason: collision with root package name */
    private Exception f35698m;

    /* renamed from: n, reason: collision with root package name */
    private String f35699n;

    public d(int i11, Map<String, List<String>> map, byte[] bArr, long j11) {
        this.f35693h = 2;
        this.f35694i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f35695j = "";
        this.f35696k = 0L;
        this.f35697l = "";
        this.f35688c = i11;
        this.f35686a = map;
        this.f35687b = ByteBuffer.wrap(bArr).array();
        this.f35689d = j11;
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0053, code lost:
    
        if (r8.getInt("resultCode") == 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            r9 = this;
            java.lang.String r0 = "errorList"
            java.lang.String r1 = "errorDesc"
            java.lang.String r2 = "errorCode"
            java.lang.String r3 = "resultCode"
            java.lang.String r4 = "isSuccess"
            boolean r5 = r9.m()
            r6 = 1
            if (r5 == 0) goto L1c
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.f35685o
            java.lang.String r1 = "GRSSDK get httpcode{304} not any changed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r9.c(r6)
            return
        L1c:
            boolean r5 = r9.o()
            r7 = 2
            if (r5 != 0) goto L2e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.f35685o
            java.lang.String r1 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r9.c(r7)
            return
        L2e:
            byte[] r5 = r9.f35687b     // Catch: org.json.JSONException -> L46
            java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.byte2Str(r5)     // Catch: org.json.JSONException -> L46
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L46
            r8.<init>(r5)     // Catch: org.json.JSONException -> L46
            boolean r5 = r8.has(r4)     // Catch: org.json.JSONException -> L46
            if (r5 == 0) goto L49
            int r3 = r8.getInt(r4)     // Catch: org.json.JSONException -> L46
            if (r3 != r6) goto L57
            goto L55
        L46:
            r0 = move-exception
            goto Lb9
        L49:
            boolean r4 = r8.has(r3)     // Catch: org.json.JSONException -> L46
            if (r4 == 0) goto L59
            int r3 = r8.getInt(r3)     // Catch: org.json.JSONException -> L46
            if (r3 != 0) goto L57
        L55:
            r3 = r6
            goto L61
        L57:
            r3 = r7
            goto L61
        L59:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.f35685o     // Catch: org.json.JSONException -> L46
            java.lang.String r4 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r3, r4)     // Catch: org.json.JSONException -> L46
            r3 = -1
        L61:
            java.lang.String r4 = "services"
            if (r3 == r6) goto L6c
            boolean r5 = r8.has(r4)     // Catch: org.json.JSONException -> L46
            if (r5 == 0) goto L6c
            r3 = 0
        L6c:
            r9.c(r3)     // Catch: org.json.JSONException -> L46
            java.lang.String r5 = ""
            if (r3 == r6) goto L94
            if (r3 != 0) goto L76
            goto L94
        L76:
            boolean r0 = r8.has(r2)     // Catch: org.json.JSONException -> L46
            if (r0 == 0) goto L81
            int r0 = r8.getInt(r2)     // Catch: org.json.JSONException -> L46
            goto L83
        L81:
            r0 = 9001(0x2329, float:1.2613E-41)
        L83:
            r9.b(r0)     // Catch: org.json.JSONException -> L46
            boolean r0 = r8.has(r1)     // Catch: org.json.JSONException -> L46
            if (r0 == 0) goto L90
            java.lang.String r5 = r8.getString(r1)     // Catch: org.json.JSONException -> L46
        L90:
            r9.d(r5)     // Catch: org.json.JSONException -> L46
            return
        L94:
            boolean r1 = r8.has(r4)     // Catch: org.json.JSONException -> L46
            if (r1 == 0) goto La3
            org.json.JSONObject r1 = r8.getJSONObject(r4)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L46
            goto La4
        La3:
            r1 = r5
        La4:
            r9.f(r1)     // Catch: org.json.JSONException -> L46
            boolean r1 = r8.has(r0)     // Catch: org.json.JSONException -> L46
            if (r1 == 0) goto Lb5
            org.json.JSONObject r0 = r8.getJSONObject(r0)     // Catch: org.json.JSONException -> L46
            java.lang.String r5 = r0.toString()     // Catch: org.json.JSONException -> L46
        Lb5:
            r9.e(r5)     // Catch: org.json.JSONException -> L46
            return
        Lb9:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.f35685o
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "GrsResponse GrsResponse(String result) JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r2, r0)
            r9.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: JSONException -> 0x0032, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0032, blocks: (B:14:0x0025, B:16:0x002b, B:19:0x003a, B:21:0x0040, B:25:0x0034), top: B:13:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            r3 = this;
            boolean r0 = r3.o()
            if (r0 != 0) goto L13
            boolean r0 = r3.n()
            if (r0 != 0) goto L13
            boolean r0 = r3.m()
            if (r0 != 0) goto L13
            goto L43
        L13:
            java.util.Map r0 = r3.r()
            int r1 = r0.size()
            if (r1 > 0) goto L25
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.f35685o
            java.lang.String r1 = "parseHeader {headers.size() <= 0}"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
        L25:
            boolean r1 = r3.o()     // Catch: org.json.JSONException -> L32
            if (r1 != 0) goto L34
            boolean r1 = r3.m()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L3a
            goto L34
        L32:
            r0 = move-exception
            goto L44
        L34:
            r3.b(r0)     // Catch: org.json.JSONException -> L32
            r3.a(r0)     // Catch: org.json.JSONException -> L32
        L3a:
            boolean r1 = r3.n()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L43
            r3.c(r0)     // Catch: org.json.JSONException -> L32
        L43:
            return
        L44:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.f35685o
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "parseHeader catch JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.q():void");
    }

    private Map<String, String> r() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.f35686a;
        if (map == null || map.size() <= 0) {
            Logger.v(f35685o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return hashMap;
        }
        for (Map.Entry<String, List<String>> entry : this.f35686a.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                hashMap.put(key, it.next());
            }
        }
        return hashMap;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.f35695j;
    }

    public int b() {
        return this.f35688c;
    }

    public int c() {
        return this.f35694i;
    }

    public Exception d() {
        return this.f35698m;
    }

    public String e() {
        return this.f35697l;
    }

    public int f() {
        return this.f35693h;
    }

    public long g() {
        return this.f35691f;
    }

    public long h() {
        return this.f35690e;
    }

    public long i() {
        return this.f35689d;
    }

    public String j() {
        return this.f35692g;
    }

    public long k() {
        return this.f35696k;
    }

    public String l() {
        return this.f35699n;
    }

    public boolean m() {
        return this.f35688c == 304;
    }

    public boolean n() {
        return this.f35688c == 503;
    }

    public boolean o() {
        return this.f35688c == 200;
    }

    public d(Exception exc, long j11) {
        this.f35688c = 0;
        this.f35693h = 2;
        this.f35694i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f35695j = "";
        this.f35696k = 0L;
        this.f35697l = "";
        this.f35698m = exc;
        this.f35689d = j11;
    }

    private void b(int i11) {
        this.f35694i = i11;
    }

    private void c(int i11) {
        this.f35693h = i11;
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.f35692g = str;
    }

    public void a(int i11) {
    }

    private void c(long j11) {
        this.f35696k = j11;
    }

    public void a(long j11) {
        this.f35691f = j11;
    }

    public void b(long j11) {
        this.f35690e = j11;
    }

    private void c(String str) {
        this.f35695j = str;
    }

    public void a(String str) {
        this.f35697l = str;
    }

    public void b(String str) {
        this.f35699n = str;
    }

    private void a(Map<String, String> map) {
        if (!map.containsKey("ETag")) {
            Logger.i(f35685o, "Response Heads has not Etag");
            return;
        }
        String str = map.get("ETag");
        if (TextUtils.isEmpty(str)) {
            Logger.i(f35685o, "The Response Heads Etag is Empty");
        } else {
            Logger.i(f35685o, "success get Etag from server");
            a(str);
        }
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                } catch (NumberFormatException e11) {
                    e = e11;
                    time = 0;
                }
                try {
                    Logger.v(f35685o, "Cache-Control value{%s}", Long.valueOf(time));
                } catch (NumberFormatException e12) {
                    e = e12;
                    Logger.w(f35685o, "getExpireTime addHeadersToResult NumberFormatException", e);
                    if (time > 0) {
                    }
                    time = 86400;
                    long j11 = time * 1000;
                    Logger.i(f35685o, "convert expireTime{%s}", Long.valueOf(j11));
                    c(String.valueOf(j11 + System.currentTimeMillis()));
                }
            }
            time = 0;
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(f35685o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e13) {
                    Logger.w(f35685o, "getExpireTime ParseException.", e13);
                }
            } else {
                Logger.i(f35685o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time > 0 || time > 2592000) {
            time = 86400;
        }
        long j112 = time * 1000;
        Logger.i(f35685o, "convert expireTime{%s}", Long.valueOf(j112));
        c(String.valueOf(j112 + System.currentTimeMillis()));
    }

    private void c(Map<String, String> map) {
        long j11;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j11 = Long.parseLong(str);
                } catch (NumberFormatException e11) {
                    Logger.w(f35685o, "getRetryAfter addHeadersToResult NumberFormatException", e11);
                }
                long j12 = j11 * 1000;
                Logger.v(f35685o, "convert retry-afterTime{%s}", Long.valueOf(j12));
                c(j12);
            }
        }
        j11 = 0;
        long j122 = j11 * 1000;
        Logger.v(f35685o, "convert retry-afterTime{%s}", Long.valueOf(j122));
        c(j122);
    }
}
