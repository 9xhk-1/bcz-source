package tz;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import io.openinstall.sdk.az;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class x {

    /* renamed from: f, reason: collision with root package name */
    public static x f91399f;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f91403d;

    /* renamed from: e, reason: collision with root package name */
    public Map f91404e;

    /* renamed from: b, reason: collision with root package name */
    public final z f91401b = new z();

    /* renamed from: c, reason: collision with root package name */
    public final b0 f91402c = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final io.openinstall.sdk.c f91400a = new io.openinstall.sdk.c();

    public x(q0 q0Var) {
        this.f91403d = q0Var;
    }

    public static x f(q0 q0Var) {
        if (f91399f == null) {
            synchronized (x.class) {
                try {
                    if (f91399f == null) {
                        f91399f = new x(q0Var);
                    }
                } finally {
                }
            }
        }
        return f91399f;
    }

    public az a(String str) {
        return b(d(true, "stats/events"), e(), str, true);
    }

    public az b(String str, Map map, String str2, boolean z11) {
        String i11 = i(map);
        byte[] bArr = new byte[0];
        try {
            bArr = str2.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        HashMap hashMap = new HashMap();
        if (z11) {
            hashMap.put(com.alipay.sdk.m.p.e.f10902f, "text/plain;charset=utf-8");
            hashMap.put("content-length", String.valueOf(bArr.length));
        }
        return this.f91400a.a(str, i11, bArr, hashMap);
    }

    public az c(Map map) {
        return b(d(false, "init"), e(), i(map), false);
    }

    public String d(boolean z11, String str) {
        boolean booleanValue = m0.a().p().booleanValue();
        return String.format("https://%s/api/%s/android/%s/%s", z11 ? w.b() : w.a(), booleanValue ? "v2_5" : com.alipay.sdk.m.x.c.f11163d, m0.a().j(), str);
    }

    public Map e() {
        y0 d11 = this.f91403d.d();
        w0 e11 = this.f91403d.e();
        e g11 = this.f91403d.g();
        String j11 = m0.a().j();
        if (this.f91404e == null) {
            this.f91404e = new HashMap();
            if (m0.a().o().booleanValue()) {
                this.f91404e.put("sN", d11.d());
            }
            this.f91404e.put("andI", d11.a());
            this.f91404e.put("Pk", d11.g());
            this.f91404e.put("cF", d11.f());
            this.f91404e.put("ver", d11.h());
            this.f91404e.put("verI", String.valueOf(d11.i()));
            this.f91404e.put("apV", "2.6.3");
        }
        this.f91404e.put("iI", TextUtils.isEmpty(e11.p()) ? g11.a(j11) : e11.p());
        this.f91404e.put("ts", String.valueOf(System.currentTimeMillis()));
        return this.f91404e;
    }

    public az g(Map map) {
        return b(d(false, "decode-wakeup-url"), e(), i(map), false);
    }

    public az h(Map map) {
        return b(d(true, "stats/wakeup"), e(), i(map), false);
    }

    public final String i(Map map) {
        if (map == null) {
            return "";
        }
        HashMap hashMap = new HashMap(map);
        a0 a0Var = m0.a().p().booleanValue() ? this.f91401b : this.f91402c;
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && value != null) {
                String a11 = a0Var.a(str);
                if (!TextUtils.isEmpty(a11)) {
                    if (value instanceof String) {
                        String b11 = a0Var.b((String) value);
                        if (!TextUtils.isEmpty(b11)) {
                            sb2.append(a11);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(b11);
                            sb2.append("&");
                        }
                    } else if (value instanceof List) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            String b12 = a0Var.b((String) it.next());
                            if (!TextUtils.isEmpty(b12)) {
                                sb2.append(a11);
                                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                                sb2.append(b12);
                                sb2.append("&");
                            }
                        }
                    }
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
