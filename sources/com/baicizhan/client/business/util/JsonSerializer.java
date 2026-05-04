package com.baicizhan.client.business.util;

import java.io.File;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class JsonSerializer<T> {
    private final Type mType;

    public JsonSerializer(Type type) {
        this.mType = type;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T read(java.lang.String r5) {
        /*
            r4 = this;
            java.io.File r5 = com.baicizhan.client.business.util.PathUtil.getBaicizhanFile(r5)
            r0 = 0
            if (r5 == 0) goto L5a
            boolean r1 = r5.exists()
            if (r1 != 0) goto Le
            goto L5a
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
        L1d:
            java.lang.String r5 = r2.readLine()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            if (r5 == 0) goto L2c
            r1.append(r5)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            goto L1d
        L27:
            r5 = move-exception
            r0 = r2
            goto L4f
        L2a:
            r5 = move-exception
            goto L41
        L2c:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.lang.Object r5 = r4.readFromJson(r5)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r2.close()     // Catch: java.lang.Throwable -> L38
            return r5
        L38:
            r0 = move-exception
            r0.printStackTrace()
            return r5
        L3d:
            r5 = move-exception
            goto L4f
        L3f:
            r5 = move-exception
            r2 = r0
        L41:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r5 = move-exception
            r5.printStackTrace()
        L4e:
            return r0
        L4f:
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            throw r5
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.JsonSerializer.read(java.lang.String):java.lang.Object");
    }

    public T readFromJson(String str) {
        return (T) new com.google.gson.d().o(str, this.mType);
    }

    public void write(T t11, String path) {
        if (t11 == null) {
            return;
        }
        try {
            File baicizhanFile = PathUtil.getBaicizhanFile(path);
            if (!baicizhanFile.exists()) {
                File parentFile = baicizhanFile.getParentFile();
                if (!parentFile.exists()) {
                    if (!parentFile.mkdirs()) {
                        return;
                    }
                }
                if (!baicizhanFile.createNewFile()) {
                    return;
                }
            } else if (!baicizhanFile.delete() || !baicizhanFile.createNewFile()) {
                return;
            }
            FileUtils.stringToFile(baicizhanFile.getAbsolutePath(), writeToJson(t11));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public String writeToJson(T t11) {
        return new com.google.gson.d().A(t11, this.mType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T read(android.content.res.AssetManager r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r5 = r5.open(r6)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.lang.String r3 = "UTF-8"
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
        L16:
            java.lang.String r5 = r6.readLine()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            if (r5 == 0) goto L25
            r0.append(r5)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            goto L16
        L20:
            r5 = move-exception
            r1 = r6
            goto L48
        L23:
            r5 = move-exception
            goto L3a
        L25:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            java.lang.Object r5 = r4.readFromJson(r5)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r6.close()     // Catch: java.lang.Throwable -> L31
            return r5
        L31:
            r6 = move-exception
            r6.printStackTrace()
            return r5
        L36:
            r5 = move-exception
            goto L48
        L38:
            r5 = move-exception
            r6 = r1
        L3a:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L20
            if (r6 == 0) goto L47
            r6.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r5 = move-exception
            r5.printStackTrace()
        L47:
            return r1
        L48:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r6 = move-exception
            r6.printStackTrace()
        L52:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.JsonSerializer.read(android.content.res.AssetManager, java.lang.String):java.lang.Object");
    }
}
