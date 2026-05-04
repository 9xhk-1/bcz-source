package com.alipay.sdk.m.n0;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.main.vld.bonding.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    public static d f10870j;

    /* renamed from: a, reason: collision with root package name */
    public Context f10872a;

    /* renamed from: c, reason: collision with root package name */
    public e f10874c;

    /* renamed from: d, reason: collision with root package name */
    public String f10875d;

    /* renamed from: e, reason: collision with root package name */
    public String f10876e;

    /* renamed from: f, reason: collision with root package name */
    public com.alipay.sdk.m.m0.a f10877f;

    /* renamed from: g, reason: collision with root package name */
    public com.alipay.sdk.m.m0.a f10878g;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f10869i = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final String f10871k = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: b, reason: collision with root package name */
    public String f10873b = null;

    /* renamed from: h, reason: collision with root package name */
    public Pattern f10879h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f10872a = null;
        this.f10874c = null;
        this.f10875d = "xx_utdid_key";
        this.f10876e = "xx_utdid_domain";
        this.f10877f = null;
        this.f10878g = null;
        this.f10872a = context;
        this.f10878g = new com.alipay.sdk.m.m0.a(context, f10871k, "Alvin2", false, true);
        this.f10877f = new com.alipay.sdk.m.m0.a(context, ".DataStorage", "ContextData", false, true);
        this.f10874c = new e();
        this.f10875d = String.format("K_%d", Integer.valueOf(com.alipay.sdk.m.l0.f.a(this.f10875d)));
        this.f10876e = String.format("D_%d", Integer.valueOf(com.alipay.sdk.m.l0.f.a(this.f10876e)));
    }

    public static d a(Context context) {
        if (context != null && f10870j == null) {
            synchronized (f10869i) {
                try {
                    if (f10870j == null) {
                        d dVar = new d(context);
                        f10870j = dVar;
                        dVar.d();
                    }
                } finally {
                }
            }
        }
        return f10870j;
    }

    private void b(String str) {
        com.alipay.sdk.m.m0.a aVar;
        if (a(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (aVar = this.f10878g) == null) {
                return;
            }
            aVar.a("UTDID2", str);
            this.f10878g.a();
        }
    }

    private void c(String str) {
        com.alipay.sdk.m.m0.a aVar;
        if (str == null || (aVar = this.f10877f) == null || str.equals(aVar.a(this.f10875d))) {
            return;
        }
        this.f10877f.a(this.f10875d, str);
        this.f10877f.a();
    }

    private void d() {
        boolean z11;
        com.alipay.sdk.m.m0.a aVar = this.f10878g;
        if (aVar != null) {
            if (com.alipay.sdk.m.l0.f.m5632a(aVar.a("UTDID2"))) {
                String a11 = this.f10878g.a("UTDID");
                if (!com.alipay.sdk.m.l0.f.m5632a(a11)) {
                    b(a11);
                }
            }
            boolean z12 = true;
            if (com.alipay.sdk.m.l0.f.m5632a(this.f10878g.a("DID"))) {
                z11 = false;
            } else {
                this.f10878g.b("DID");
                z11 = true;
            }
            if (!com.alipay.sdk.m.l0.f.m5632a(this.f10878g.a("EI"))) {
                this.f10878g.b("EI");
                z11 = true;
            }
            if (com.alipay.sdk.m.l0.f.m5632a(this.f10878g.a("SI"))) {
                z12 = z11;
            } else {
                this.f10878g.b("SI");
            }
            if (z12) {
                this.f10878g.a();
            }
        }
    }

    private byte[] e() throws Exception {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] a11 = com.alipay.sdk.m.l0.c.a(currentTimeMillis);
        byte[] a12 = com.alipay.sdk.m.l0.c.a(nextInt);
        byteArrayOutputStream.write(a11, 0, 4);
        byteArrayOutputStream.write(a12, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = com.alipay.sdk.m.l0.d.a(this.f10872a);
        } catch (Exception unused) {
            str = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(com.alipay.sdk.m.l0.c.a(com.alipay.sdk.m.l0.f.a(str)), 0, 4);
        byteArrayOutputStream.write(com.alipay.sdk.m.l0.c.a(com.alipay.sdk.m.l0.f.a(a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private String f() {
        com.alipay.sdk.m.m0.a aVar = this.f10878g;
        if (aVar == null) {
            return null;
        }
        String a11 = aVar.a("UTDID2");
        if (com.alipay.sdk.m.l0.f.m5632a(a11) || this.f10874c.a(a11) == null) {
            return null;
        }
        return a11;
    }

    public synchronized String c() {
        String f11 = f();
        if (a(f11)) {
            c(this.f10874c.a(f11));
            this.f10873b = f11;
            return f11;
        }
        String a11 = this.f10877f.a(this.f10875d);
        if (!com.alipay.sdk.m.l0.f.m5632a(a11)) {
            String a12 = new f().a(a11);
            if (!a(a12)) {
                a12 = this.f10874c.b(a11);
            }
            if (a(a12) && !com.alipay.sdk.m.l0.f.m5632a(a12)) {
                this.f10873b = a12;
                b(a12);
                return this.f10873b;
            }
        }
        return null;
    }

    private boolean a(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f10879h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public synchronized String b() {
        String str = this.f10873b;
        if (str != null) {
            return str;
        }
        return a();
    }

    public synchronized String a() {
        String c11 = c();
        this.f10873b = c11;
        if (!TextUtils.isEmpty(c11)) {
            return this.f10873b;
        }
        try {
            byte[] e11 = e();
            if (e11 != null) {
                String c12 = com.alipay.sdk.m.l0.b.c(e11, 2);
                this.f10873b = c12;
                b(c12);
                String a11 = this.f10874c.a(e11);
                if (a11 != null) {
                    c(a11);
                }
                return this.f10873b;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return null;
    }

    public static String a(byte[] bArr) throws Exception {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, j.f25376a, -17, -99, 64, ho.c.A, -95, ws.c.f96765j, -82, j.f25378c, 113, 116, -16, -103, 49, -30, 9, -39, 33, j.f25377b, -68, -78, -117, 53, ho.c.H, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(com.alipay.sdk.m.l0.e.a(bArr2), mac.getAlgorithm()));
        return com.alipay.sdk.m.l0.b.c(mac.doFinal(bArr), 2);
    }
}
