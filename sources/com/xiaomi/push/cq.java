package com.xiaomi.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class cq {

    /* renamed from: a, reason: collision with other field name */
    private long f213a;

    /* renamed from: a, reason: collision with other field name */
    public String f214a;

    /* renamed from: b, reason: collision with other field name */
    public String f216b;

    /* renamed from: c, reason: collision with root package name */
    public String f45354c;

    /* renamed from: d, reason: collision with root package name */
    public String f45355d;

    /* renamed from: e, reason: collision with root package name */
    public String f45356e;

    /* renamed from: f, reason: collision with root package name */
    public String f45357f;

    /* renamed from: g, reason: collision with root package name */
    public String f45358g;

    /* renamed from: h, reason: collision with root package name */
    protected String f45359h;

    /* renamed from: i, reason: collision with root package name */
    private String f45360i;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<cz> f215a = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private double f45352a = 0.1d;

    /* renamed from: j, reason: collision with root package name */
    private String f45361j = "s.mi1.cc";

    /* renamed from: b, reason: collision with root package name */
    private long f45353b = 86400000;

    public cq(String str) {
        this.f214a = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f213a = System.currentTimeMillis();
        this.f215a.add(new cz(str, -1));
        this.f214a = cu.m5803a();
        this.f216b = str;
    }

    private synchronized void c(String str) {
        Iterator<cz> it = this.f215a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f232a, str)) {
                it.remove();
            }
        }
    }

    public synchronized cq a(JSONObject jSONObject) {
        this.f214a = jSONObject.optString(com.alipay.sdk.m.k.b.f10651k);
        this.f45353b = jSONObject.getLong(RemoteMessageConst.TTL);
        this.f45352a = jSONObject.getDouble("pct");
        this.f213a = jSONObject.getLong("ts");
        this.f45355d = jSONObject.optString("city");
        this.f45354c = jSONObject.optString("prv");
        this.f45358g = jSONObject.optString("cty");
        this.f45356e = jSONObject.optString("isp");
        this.f45357f = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        this.f216b = jSONObject.optString("host");
        this.f45359h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            a(new cz().a(jSONArray.getJSONObject(i11)));
        }
        return this;
    }

    public void b(String str) {
        this.f45361j = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f214a);
        sb2.append("\n");
        sb2.append(a());
        Iterator<cz> it = this.f215a.iterator();
        while (it.hasNext()) {
            cz next = it.next();
            sb2.append("\n");
            sb2.append(next.toString());
        }
        sb2.append("\n");
        return sb2.toString();
    }

    public synchronized String a() {
        if (!TextUtils.isEmpty(this.f45360i)) {
            return this.f45360i;
        }
        if (TextUtils.isEmpty(this.f45356e)) {
            return "hardcode_isp";
        }
        String a11 = bo.a(new String[]{this.f45356e, this.f45354c, this.f45355d, this.f45358g, this.f45357f}, "_");
        this.f45360i = a11;
        return a11;
    }

    public void b(String str, long j11, long j12) {
        a(str, 0, j11, j12, null);
    }

    public boolean c() {
        long j11 = this.f45353b;
        if (864000000 >= j11) {
            j11 = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = this.f213a;
        if (currentTimeMillis - j12 <= j11) {
            return currentTimeMillis - j12 > this.f45353b && this.f214a.startsWith("WIFI-");
        }
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<String> m5794a() {
        return a(false);
    }

    public void b(String str, long j11, long j12, Exception exc) {
        a(str, -1, j11, j12, exc);
    }

    public ArrayList<String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.f216b)) {
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = a(true).iterator();
        while (it.hasNext()) {
            cs a11 = cs.a(it.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), a11.m5802a(), a11.a(), url.getFile()).toString());
        }
        return arrayList;
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f213a < this.f45353b;
    }

    public synchronized ArrayList<String> a(boolean z11) {
        ArrayList<String> arrayList;
        int indexOf;
        try {
            int size = this.f215a.size();
            cz[] czVarArr = new cz[size];
            this.f215a.toArray(czVarArr);
            Arrays.sort(czVarArr);
            arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < size; i11++) {
                cz czVar = czVarArr[i11];
                arrayList.add((z11 || (indexOf = czVar.f232a.indexOf(":")) == -1) ? czVar.f232a : czVar.f232a.substring(0, indexOf));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m5795a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put(com.alipay.sdk.m.k.b.f10651k, this.f214a);
            jSONObject.put(RemoteMessageConst.TTL, this.f45353b);
            jSONObject.put("pct", this.f45352a);
            jSONObject.put("ts", this.f213a);
            jSONObject.put("city", this.f45355d);
            jSONObject.put("prv", this.f45354c);
            jSONObject.put("cty", this.f45358g);
            jSONObject.put("isp", this.f45356e);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f45357f);
            jSONObject.put("host", this.f216b);
            jSONObject.put("xf", this.f45359h);
            JSONArray jSONArray = new JSONArray();
            Iterator<cz> it = this.f215a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().a());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public void a(double d11) {
        this.f45352a = d11;
    }

    public void a(long j11) {
        if (j11 > 0) {
            this.f45353b = j11;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j11);
    }

    public synchronized void a(cz czVar) {
        c(czVar.f232a);
        this.f215a.add(czVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m5796a(String str) {
        a(new cz(str));
    }

    public void a(String str, int i11, long j11, long j12, Exception exc) {
        a(str, new cp(i11, j11, j12, exc));
    }

    public void a(String str, long j11, long j12) {
        try {
            b(new URL(str).getHost(), j11, j12);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, long j11, long j12, Exception exc) {
        try {
            b(new URL(str).getHost(), j11, j12, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1.a(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.lang.String r4, com.xiaomi.push.cp r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList<com.xiaomi.push.cz> r0 = r3.f215a     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1f
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1f
            com.xiaomi.push.cz r1 = (com.xiaomi.push.cz) r1     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r1.f232a     // Catch: java.lang.Throwable -> L1f
            boolean r2 = android.text.TextUtils.equals(r4, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L7
            r1.a(r5)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r4 = move-exception
            goto L23
        L21:
            monitor-exit(r3)
            return
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cq.a(java.lang.String, com.xiaomi.push.cp):void");
    }

    public synchronized void a(String[] strArr) {
        int i11;
        try {
            int size = this.f215a.size() - 1;
            while (true) {
                i11 = 0;
                if (size < 0) {
                    break;
                }
                int length = strArr.length;
                while (true) {
                    if (i11 < length) {
                        if (TextUtils.equals(this.f215a.get(size).f232a, strArr[i11])) {
                            this.f215a.remove(size);
                            break;
                        }
                        i11++;
                    }
                }
                size--;
            }
            Iterator<cz> it = this.f215a.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int i13 = it.next().f45372a;
                if (i13 > i12) {
                    i12 = i13;
                }
            }
            while (i11 < strArr.length) {
                a(new cz(strArr[i11], (strArr.length + i12) - i11));
                i11++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5797a() {
        return TextUtils.equals(this.f214a, cu.m5803a());
    }

    public boolean a(cq cqVar) {
        return TextUtils.equals(this.f214a, cqVar.f214a);
    }
}
