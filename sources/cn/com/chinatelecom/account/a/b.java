package cn.com.chinatelecom.account.a;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/* loaded from: classes3.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r2 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r5) {
        /*
            java.io.File r5 = c(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 == 0) goto L95
            boolean r1 = r5.exists()
            if (r1 != 0) goto L13
            goto L95
        L13:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L52
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L52
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L48
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L48
        L23:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2f
            r0.append(r1)     // Catch: java.lang.Throwable -> L2d
            goto L23
        L2d:
            r1 = move-exception
            goto L56
        L2f:
            r3.close()     // Catch: java.lang.Exception -> L33
            goto L37
        L33:
            r1 = move-exception
            r1.printStackTrace()
        L37:
            r5.close()     // Catch: java.lang.Exception -> L3b
            goto L3f
        L3b:
            r5 = move-exception
            r5.printStackTrace()
        L3f:
            r2.close()     // Catch: java.lang.Exception -> L43
            goto L70
        L43:
            r5 = move-exception
            r5.printStackTrace()
            goto L70
        L48:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
            goto L56
        L4d:
            r5 = move-exception
            r3 = r1
        L4f:
            r1 = r5
            r5 = r3
            goto L56
        L52:
            r5 = move-exception
            r2 = r1
            r3 = r2
            goto L4f
        L56:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L63
            r3.close()     // Catch: java.lang.Exception -> L5f
            goto L63
        L5f:
            r1 = move-exception
            r1.printStackTrace()
        L63:
            if (r5 == 0) goto L6d
            r5.close()     // Catch: java.lang.Exception -> L69
            goto L6d
        L69:
            r5 = move-exception
            r5.printStackTrace()
        L6d:
            if (r2 == 0) goto L70
            goto L3f
        L70:
            java.lang.String r5 = r0.toString()
            return r5
        L75:
            r0 = move-exception
            if (r3 == 0) goto L80
            r3.close()     // Catch: java.lang.Exception -> L7c
            goto L80
        L7c:
            r1 = move-exception
            r1.printStackTrace()
        L80:
            if (r5 == 0) goto L8a
            r5.close()     // Catch: java.lang.Exception -> L86
            goto L8a
        L86:
            r5 = move-exception
            r5.printStackTrace()
        L8a:
            if (r2 == 0) goto L94
            r2.close()     // Catch: java.lang.Exception -> L90
            goto L94
        L90:
            r5 = move-exception
            r5.printStackTrace()
        L94:
            throw r0
        L95:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.a.b.a(android.content.Context):java.lang.String");
    }

    private static File b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            File file = new File(context.getFilesDir() + "/eAccount/Log/");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "ipa_ol.ds");
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            return file2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static File c(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir() + "/eAccount/Log/");
                if (!file.exists()) {
                    return null;
                }
                File file2 = new File(file, "ipa_ol.ds");
                if (file2.exists()) {
                    return file2;
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    public static void a(Context context, String str) {
        File c11 = c(context);
        if (c11 == null || !c11.exists()) {
            a(b(context), str);
        } else {
            a(c11, str);
        }
    }

    private static void a(File file, String str) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        if (file == null || !file.exists()) {
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            fileWriter = new FileWriter(file, false);
            try {
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                bufferedWriter.write(str);
                bufferedWriter.flush();
                try {
                    bufferedWriter.close();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } catch (Exception e13) {
                e = e13;
                bufferedWriter2 = bufferedWriter;
                e.printStackTrace();
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                }
                if (fileWriter == null) {
                    return;
                }
                fileWriter.close();
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                }
                if (fileWriter == null) {
                    throw th;
                }
                try {
                    fileWriter.close();
                    throw th;
                } catch (Exception e16) {
                    e16.printStackTrace();
                    throw th;
                }
            }
        } catch (Exception e17) {
            e = e17;
            fileWriter = null;
        } catch (Throwable th4) {
            th = th4;
            fileWriter = null;
        }
        try {
            fileWriter.close();
        } catch (Exception e18) {
            e18.printStackTrace();
        }
    }
}
