package com.mob.secverify.pure.core.ope.wo.core;

import android.content.Context;
import com.mob.secverify.pure.core.ope.wo.c.e;
import dalvik.system.DexClassLoader;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f41073a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f41074b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f41075c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f41076d;

    /* renamed from: e, reason: collision with root package name */
    private static DexClassLoader f41077e;

    static {
        StringBuilder sb2 = new StringBuilder();
        String str = File.separator;
        sb2.append(str);
        sb2.append(new String(e.b("LnVuaWFjY291bnQ=")));
        sb2.append(str);
        f41073a = sb2.toString();
        f41074b = new String(e.b("dW5pYWNjb3VudC5qYXI="));
        f41075c = new String(e.b("dW5pY29tX3VwZGF0ZQ==")) + str + new String(e.b("dW5pYWNjb3VudF9jb3JlLmRhdA=="));
        f41076d = new String(e.b("dW5pYWNjb3VudF9jb3JlLmRhdA=="));
        f41077e = null;
    }

    public static String a(Context context) {
        return e(context) + f41074b;
    }

    public static InputStream b(Context context) {
        try {
            File file = new File(e(context) + f41075c);
            if (file.exists()) {
                return new FileInputStream(file);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void c(Context context) {
        try {
            a(new File(a(context)));
        } catch (Exception unused) {
        }
    }

    public static void d(Context context) {
        try {
            File file = new File(e(context) + f41075c);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private static String e(Context context) {
        return context.getFilesDir().getParent() + f41073a;
    }

    public static DexClassLoader a() {
        return f41077e;
    }

    public static DexClassLoader a(Context context, String str) {
        try {
            String str2 = e(context) + "optdex";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdir();
            }
            DexClassLoader dexClassLoader = new DexClassLoader(str, str2, null, context.getClassLoader());
            f41077e = dexClassLoader;
            return dexClassLoader;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b(Context context, byte[] bArr) {
        try {
            int length = bArr.length - 16;
            int i11 = (length >> 2) << 2;
            byte[] bArr2 = new byte[i11];
            byte[] bArr3 = new byte[length];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr2[i12] = bArr2[i12 + 16];
            }
            for (int i13 = 0; i13 < i11; i13++) {
                bArr3[i13] = bArr3[i13 + 16];
            }
            byte[] b11 = e.b(bArr2);
            for (int i14 = 0; i14 < i11; i14++) {
                bArr3[i14] = b11[i14];
            }
            File file = new File(e(context));
            if (!file.exists()) {
                file.mkdirs();
            }
            String a11 = a(context);
            File file2 = new File(a11);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            a(bArr3, a11);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte[] a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            return e.a(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            byte[] bArr2 = new byte[15];
            for (int i11 = 0; i11 < 15; i11++) {
                bArr2[i11] = bArr[i11];
            }
            return new String(bArr2);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static void a(byte[] bArr, String str) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                try {
                    bufferedOutputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            } catch (Exception e14) {
                e = e14;
                bufferedOutputStream2 = bufferedOutputStream;
                e.printStackTrace();
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                if (fileOutputStream == null) {
                    return;
                }
                fileOutputStream.close();
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException e17) {
                        e17.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
            fileOutputStream.close();
        } catch (IOException e18) {
            e18.printStackTrace();
        }
    }

    public static void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
            file.delete();
            return;
        }
        file.delete();
    }

    public static void a(Context context, byte[] bArr) {
        try {
            File file = new File(e(context));
            if (!file.exists()) {
                file.mkdirs();
            }
            String a11 = a(context);
            File file2 = new File(a11);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            a(bArr, a11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
