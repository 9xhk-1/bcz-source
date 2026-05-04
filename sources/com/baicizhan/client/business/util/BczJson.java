package com.baicizhan.client.business.util;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BczJson {
    private BczJson() {
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) gson().n(str, cls);
    }

    public static com.google.gson.d gson() {
        return new com.google.gson.d();
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
    public static <T> T read(android.content.res.AssetManager r4, java.lang.String r5, java.lang.reflect.Type r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r4 = r4.open(r5)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.lang.String r3 = "UTF-8"
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
        L16:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            if (r4 == 0) goto L25
            r0.append(r4)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            goto L16
        L20:
            r4 = move-exception
            r1 = r5
            goto L48
        L23:
            r4 = move-exception
            goto L3a
        L25:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            java.lang.Object r4 = readFromJson(r4, r6)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r5.close()     // Catch: java.lang.Throwable -> L31
            return r4
        L31:
            r5 = move-exception
            r5.printStackTrace()
            return r4
        L36:
            r4 = move-exception
            goto L48
        L38:
            r4 = move-exception
            r5 = r1
        L3a:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r4 = move-exception
            r4.printStackTrace()
        L47:
            return r1
        L48:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r5 = move-exception
            r5.printStackTrace()
        L52:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.BczJson.read(android.content.res.AssetManager, java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    public static <T> T readFromJson(String str, Type type) {
        return (T) gson().o(str, type);
    }

    public static String toJson(Object o11) {
        return gson().z(o11);
    }

    public static <T> String writeToJson(T t11, Type type) {
        return gson().A(t11, type);
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) gson().o(str, type);
    }
}
