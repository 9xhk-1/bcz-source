package com.huawei.hms.opendevice;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.android.hms.openid.R;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36080a = "c";

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, String> f36081b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f36082c = new Object();

    public static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    public static byte[] b() {
        return a(d(), e(), c(), g());
    }

    public static void c(Context context) {
        synchronized (f36082c) {
            try {
                d(context.getApplicationContext());
                if (i()) {
                    HMSLog.i(f36080a, "The local secret is already in separate file mode.");
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(p.c(context.getApplicationContext()));
                sb2.append("/shared_prefs/LocalAvengers.xml");
                File file = new File(sb2.toString());
                if (file.exists()) {
                    zr.e.i(file);
                    HMSLog.i(f36080a, "destroy C, delete file LocalAvengers.xml.");
                }
                byte[] d11 = ur.c.d(32);
                byte[] d12 = ur.c.d(32);
                byte[] d13 = ur.c.d(32);
                byte[] d14 = ur.c.d(32);
                String a11 = a.a(d11);
                String a12 = a.a(d12);
                String a13 = a.a(d13);
                String a14 = a.a(d14);
                a(a11, a12, a13, a14, ur.f.j(a.a(ur.c.d(32)), a(a11, a12, a13, a14)), context);
                HMSLog.i(f36080a, "generate D.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(Context context) {
        if (i()) {
            HMSLog.i(f36080a, "secretKeyCache not empty.");
            return;
        }
        f36081b.clear();
        String c11 = p.c(context);
        if (TextUtils.isEmpty(c11)) {
            return;
        }
        String a11 = s.a(c11 + "/files/math/m");
        String a12 = s.a(c11 + "/files/panda/p");
        String a13 = s.a(c11 + "/files/panda/d");
        String a14 = s.a(c11 + "/files/math/t");
        String a15 = s.a(c11 + "/files/s");
        if (t.a(a11, a12, a13, a14, a15)) {
            f36081b.put("m", a11);
            f36081b.put("p", a12);
            f36081b.put("d", a13);
            f36081b.put("t", a14);
            f36081b.put("s", a15);
        }
    }

    public static synchronized String e(Context context) {
        synchronized (c.class) {
            String b11 = ur.f.b(f(), b());
            if (t.a(b11)) {
                HMSLog.i(f36080a, "keyS has been upgraded, no require operate again.");
                return b11;
            }
            String a11 = ur.f.a(f(), h());
            if (t.a(a11)) {
                HMSLog.i(f36080a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
                a(ur.f.j(a11, b()), context);
                return a11;
            }
            String b12 = ur.f.b(f(), ur.a.f(d(), e(), c(), g(), 32, false));
            if (!t.a(b12)) {
                HMSLog.e(f36080a, "all mode unable to decrypt root key.");
                return "";
            }
            HMSLog.i(f36080a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
            a(ur.f.j(b12, b()), context);
            return b12;
        }
    }

    public static String f() {
        return a("s");
    }

    public static String g() {
        return a("t");
    }

    public static ur.e h() {
        return ur.e.e(d(), e(), c(), g());
    }

    public static boolean i() {
        return !TextUtils.isEmpty(f());
    }

    public static byte[] a(String str, String str2, String str3, String str4) {
        return Build.VERSION.SDK_INT >= 26 ? ur.a.f(str, str2, str3, str4, 32, true) : ur.a.f(str, str2, str3, str4, 32, false);
    }

    public static String b(Context context) {
        if (!i()) {
            HMSLog.i(f36080a, "work key is empty, execute init.");
            c(context);
        }
        String b11 = ur.f.b(f(), b());
        return t.a(b11) ? b11 : e(context);
    }

    public static byte[] a(Context context) {
        byte[] a11 = a.a(context.getString(R.string.push_cat_head));
        byte[] a12 = a.a(context.getString(R.string.push_cat_body));
        return a(a(a(a11, a12), a.a(a())));
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length != 0 && bArr2.length != 0) {
            int length = bArr.length;
            if (length != bArr2.length) {
                return new byte[0];
            }
            byte[] bArr3 = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            }
            return bArr3;
        }
        return new byte[0];
    }

    public static byte[] a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                bArr[i11] = (byte) (bArr[i11] >> 2);
            }
            return bArr;
        }
        return new byte[0];
    }

    public static String e() {
        return a("p");
    }

    public static String d() {
        return a("m");
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Context context) {
        String c11 = p.c(context.getApplicationContext());
        if (TextUtils.isEmpty(c11)) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c11);
            sb2.append("/files/math/m");
            a("m", str, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c11);
            sb3.append("/files/panda/p");
            a("p", str2, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c11);
            sb4.append("/files/panda/d");
            a("d", str3, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(c11);
            sb5.append("/files/math/t");
            a("t", str4, sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(c11);
            sb6.append("/files/s");
            a("s", str5, sb6.toString());
        } catch (IOException unused) {
            HMSLog.e(f36080a, "save key IOException.");
        }
    }

    public static String c() {
        return a("d");
    }

    public static void a(String str, Context context) {
        String c11 = p.c(context.getApplicationContext());
        if (TextUtils.isEmpty(c11)) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c11);
            sb2.append("/files/s");
            a("s", str, sb2.toString());
        } catch (IOException unused) {
            HMSLog.e(f36080a, "save keyS IOException.");
        }
    }

    public static void a(String str, String str2, String str3) throws IOException {
        OutputStreamWriter outputStreamWriter;
        HMSLog.i(f36080a, "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            s.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    f36081b.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = null;
        }
    }

    public static String a(String str) {
        String str2 = f36081b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }
}
