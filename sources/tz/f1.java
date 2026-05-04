package tz;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes8.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final File f91269a;

    public f1(Context context, String str) {
        this.f91269a = new File(context.getFilesDir(), str);
    }

    public void a(String str) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(this.f91269a, true);
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused2) {
                return;
            }
        } catch (IOException unused3) {
            fileWriter = null;
        } catch (Throwable th3) {
            th = th3;
            fileWriter = null;
        }
        try {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException unused4) {
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException unused5) {
                    throw th;
                }
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
            throw th;
        }
    }

    public boolean b() {
        try {
            return this.f91269a.length() >= 2097152;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean c() {
        try {
            if (this.f91269a.exists()) {
                return this.f91269a.length() > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void d() {
        try {
            if (this.f91269a.exists()) {
                return;
            }
            File parentFile = this.f91269a.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            this.f91269a.createNewFile();
        } catch (Exception unused) {
        }
    }

    public void e() {
        try {
            if (this.f91269a.exists()) {
                this.f91269a.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r3 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f() {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            java.io.File r3 = r4.f91269a     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
        L1b:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            if (r1 == 0) goto L2a
            r0.append(r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            goto L1b
        L25:
            r0 = move-exception
        L26:
            r1 = r2
            goto L3b
        L28:
            r1 = r2
            goto L46
        L2a:
            r2.close()     // Catch: java.io.IOException -> L4e
        L2d:
            r3.close()     // Catch: java.io.IOException -> L4e
            goto L4e
        L31:
            r0 = move-exception
            r3 = r1
            goto L26
        L34:
            r3 = r1
            goto L28
        L36:
            r0 = move-exception
            r3 = r1
            goto L3b
        L39:
            r3 = r1
            goto L46
        L3b:
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.io.IOException -> L45
        L40:
            if (r3 == 0) goto L45
            r3.close()     // Catch: java.io.IOException -> L45
        L45:
            throw r0
        L46:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.io.IOException -> L4e
        L4b:
            if (r3 == 0) goto L4e
            goto L2d
        L4e:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tz.f1.f():java.lang.String");
    }
}
