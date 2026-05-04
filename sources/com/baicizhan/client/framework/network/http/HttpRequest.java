package com.baicizhan.client.framework.network.http;

import android.util.Pair;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import qb.c;
import sb.e;
import sb.f;
import xb.d;
import xb.l;
import xb.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class HttpRequest {

    /* renamed from: m, reason: collision with root package name */
    public static final int f17576m = 1024;

    /* renamed from: n, reason: collision with root package name */
    public static final String f17577n = "\r\n";

    /* renamed from: o, reason: collision with root package name */
    public static final String f17578o = "--";

    /* renamed from: b, reason: collision with root package name */
    public HTTP_METHOD f17580b;

    /* renamed from: f, reason: collision with root package name */
    public String f17584f;

    /* renamed from: k, reason: collision with root package name */
    public int f17589k;

    /* renamed from: l, reason: collision with root package name */
    public l f17590l;

    /* renamed from: a, reason: collision with root package name */
    public String f17579a = "";

    /* renamed from: c, reason: collision with root package name */
    public Map<String, String> f17581c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public LinkedList<Pair<String, String>> f17582d = new LinkedList<>();

    /* renamed from: e, reason: collision with root package name */
    public HashMap<String, byte[]> f17583e = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public boolean f17585g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f17586h = f.e().a();

    /* renamed from: i, reason: collision with root package name */
    public int f17587i = 10000;

    /* renamed from: j, reason: collision with root package name */
    public int f17588j = 5000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum HTTP_METHOD {
        GET,
        POST
    }

    public void A(List<Map.Entry<String, Object>> data) {
        if (data != null) {
            for (Map.Entry<String, Object> entry : data) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof String) {
                        this.f17582d.add(new Pair<>(entry.getKey(), (String) entry.getValue()));
                    } else {
                        if (!(value instanceof byte[])) {
                            throw new UnsupportedOperationException("post type is not String and byte[]");
                        }
                        this.f17583e.put(entry.getKey(), (byte[]) entry.getValue());
                    }
                }
            }
        }
    }

    public void B(int readTimeout) {
        this.f17587i = readTimeout;
    }

    public void C(String url) {
        if (url == null) {
            this.f17579a = "";
        } else {
            this.f17579a = url;
        }
    }

    public void D(HttpURLConnection connection) {
        Map<String, String> map;
        if (connection == null || (map = this.f17581c) == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            connection.addRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public void E(HttpURLConnection connection, String boundary, e stat) throws Exception {
        int i11;
        r();
        if (connection != null) {
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            try {
                LinkedList<Pair<String, String>> linkedList = this.f17582d;
                if (linkedList != null) {
                    Iterator<Pair<String, String>> it = linkedList.iterator();
                    while (it.hasNext()) {
                        Pair<String, String> next = it.next();
                        if (next != null) {
                            String str = (String) next.first;
                            String str2 = (String) next.second;
                            dataOutputStream.writeBytes(f17578o + boundary + "\r\n");
                            byte[] bytes = str2.getBytes("UTF-8");
                            dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str + "\"\r\n");
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.write(bytes);
                            dataOutputStream.writeBytes("\r\n");
                        }
                    }
                }
                HashMap<String, byte[]> hashMap = this.f17583e;
                if (hashMap != null) {
                    for (Map.Entry<String, byte[]> entry : hashMap.entrySet()) {
                        String key = entry.getKey();
                        byte[] value = entry.getValue();
                        if (value != null) {
                            dataOutputStream.writeBytes(f17578o + boundary + "\r\n");
                            dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + key + "\"; filename=\"file\"\r\n");
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.write(value);
                            dataOutputStream.writeBytes("\r\n");
                        }
                    }
                }
                dataOutputStream.writeBytes(f17578o + boundary + f17578o + "\r\n");
                dataOutputStream.flush();
                i11 = dataOutputStream.size();
                d.e(dataOutputStream);
            } catch (Throwable th2) {
                d.e(dataOutputStream);
                throw th2;
            }
        } else {
            i11 = 0;
        }
        if (stat != null) {
            stat.f88222a = i11;
        }
    }

    public void F(HttpURLConnection connection, e stat) throws Exception {
        int i11 = 0;
        if (connection != null) {
            String sb2 = q().toString();
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            if (qb.d.b()) {
                c.i("", "POST:" + this.f17579a + "?" + sb2, new Object[0]);
            }
            try {
                dataOutputStream.writeBytes(sb2);
                dataOutputStream.flush();
                d.e(dataOutputStream);
                i11 = sb2.length();
            } catch (Throwable th2) {
                d.e(dataOutputStream);
                throw th2;
            }
        }
        if (stat != null) {
            stat.f88222a = i11;
        }
    }

    public void a(String string, String host) {
        Map<String, String> map = this.f17581c;
        if (map != null) {
            map.put(string, host);
        }
    }

    public void b(String key, String value) {
        this.f17582d.add(new Pair<>(key, value));
    }

    public void c(String key, byte[] value) {
        this.f17583e.put(key, value);
    }

    public void d(LinkedList<Pair<String, String>> parts) {
        this.f17582d.addAll(parts);
    }

    public String e(e stat) {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(this.f17579a);
        if (this.f17579a.indexOf("?") < 0) {
            sb2.append("?");
        } else if (!this.f17579a.endsWith("?") && !this.f17579a.endsWith("&")) {
            sb2.append("&");
        }
        for (int i11 = 0; i11 < this.f17582d.size(); i11++) {
            if (i11 != 0) {
                sb2.append("&");
            }
            sb2.append((String) this.f17582d.get(i11).first);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(q.F((String) this.f17582d.get(i11).second));
        }
        if (stat != null) {
            stat.f88222a = sb2.length();
        }
        return sb2.toString();
    }

    public l f() {
        return this.f17590l;
    }

    public int g() {
        return this.f17589k;
    }

    public int h() {
        return this.f17588j;
    }

    public String i() {
        return this.f17584f;
    }

    public String j(String key) {
        Map<String, String> map = this.f17581c;
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public int k() {
        return this.f17586h;
    }

    public HTTP_METHOD l() {
        return this.f17580b;
    }

    public int m() {
        return this.f17587i;
    }

    public String n() {
        return this.f17579a;
    }

    public boolean o() {
        HashMap<String, byte[]> hashMap = this.f17583e;
        return hashMap != null && hashMap.size() > 0;
    }

    public boolean p() {
        return this.f17585g;
    }

    public final StringBuilder q() {
        StringBuilder sb2 = new StringBuilder(1024);
        LinkedList<Pair<String, String>> linkedList = this.f17582d;
        if (linkedList != null) {
            Iterator<Pair<String, String>> it = linkedList.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Pair<String, String> next = it.next();
                if (next != null) {
                    String str = (String) next.first;
                    String str2 = (String) next.second;
                    if (i11 != 0) {
                        sb2.append("&");
                    }
                    sb2.append(str + ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(q.F(str2));
                    i11++;
                }
            }
        }
        return sb2;
    }

    public void s(boolean autoDecomp) {
        this.f17585g = autoDecomp;
    }

    public void t(l bfpolicy) {
        this.f17590l = bfpolicy;
    }

    public void u(int concurrence) {
        this.f17589k = concurrence;
    }

    public void v(int connTimeout) {
        this.f17588j = connTimeout;
    }

    public void w(String dest) {
        this.f17584f = dest;
    }

    public void x(HashMap<String, String> head) {
        this.f17581c = head;
    }

    public void y(int maxRetry) {
        this.f17586h = maxRetry;
    }

    public void z(HTTP_METHOD method) {
        this.f17580b = method;
    }

    public void r() {
    }
}
