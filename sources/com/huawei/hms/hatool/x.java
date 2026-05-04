package com.huawei.hms.hatool;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private String f35933a = q0.i().getFilesDir().getPath();

    private String b(String str) {
        File file = new File(a(str), "hianalytics_" + str);
        if (a(file)) {
            return k1.a(file);
        }
        String e11 = ur.c.e(128);
        k1.a(file, e11);
        return e11;
    }

    public static boolean c() {
        return b(new File(q0.i().getFilesDir().getPath() + "/hms"));
    }

    private String d() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public String a() {
        String b11;
        String b12;
        String b13;
        String b14;
        String d11 = d();
        if (b()) {
            v.c("hmsSdk", "refresh components");
            b11 = ur.c.e(128);
            a("aprpap", b11);
            b12 = ur.c.e(128);
            a("febdoc", b12);
            b13 = ur.c.e(128);
            a("marfil", b13);
            b14 = ur.c.e(128);
            a("maywnj", b14);
            d.b(q0.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            b11 = b("aprpap");
            b12 = b("febdoc");
            b13 = b("marfil");
            b14 = b("maywnj");
        }
        return ur.d.b(qr.c.c(a(b11, b12, b13, d11), ur.d.c(b14), 10000, 16));
    }

    private String a(String str) {
        return this.f35933a + "/hms/component/".replace("component", str);
    }

    private boolean b() {
        long a11 = d.a(q0.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != a11) {
            return System.currentTimeMillis() - a11 > 31536000000L;
        }
        v.c("hmsSdk", "First init components");
        return true;
    }

    private void a(String str, String str2) {
        File file = new File(a(str));
        File file2 = new File(a(str), "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            v.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            k1.a(file2, str2);
        } else {
            v.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    private static boolean b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    v.c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    private boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            v.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    private char[] a(String str, String str2, String str3, String str4) {
        byte[] c11 = ur.d.c(str);
        byte[] c12 = ur.d.c(str2);
        byte[] c13 = ur.d.c(str3);
        byte[] c14 = ur.d.c(str4);
        int length = c11.length;
        if (length > c12.length) {
            length = c12.length;
        }
        if (length > c13.length) {
            length = c13.length;
        }
        if (length > c14.length) {
            length = c14.length;
        }
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = (char) (((c11[i11] ^ c12[i11]) ^ c13[i11]) ^ c14[i11]);
        }
        return cArr;
    }
}
