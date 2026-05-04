package com.getui.gtc.base.log.a;

import android.content.Context;
import com.getui.gtc.base.log.ILogController;
import com.getui.gtc.base.log.ILogFormatter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class a implements ILogController {

    /* renamed from: b, reason: collision with root package name */
    private static List<String> f29800b;

    /* renamed from: a, reason: collision with root package name */
    private String f29801a = "sdk.debug";

    /* renamed from: c, reason: collision with root package name */
    private final Context f29802c;

    /* renamed from: d, reason: collision with root package name */
    private final ILogFormatter f29803d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29804e;

    public a(Context context, ILogFormatter iLogFormatter) {
        this.f29802c = context;
        this.f29803d = (ILogFormatter) com.getui.gtc.base.log.e.a.a(iLogFormatter);
        a(this.f29801a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:52|53)(5:5|(1:7)(2:48|(1:50)(1:51))|8|(2:12|13)|39)|14|15|(4:18|(3:26|27|28)|29|16)|33|(2:41|39)|35|36|38|39|2) */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.lang.String> a(android.content.Context r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.getPackageName()
            r1.append(r2)
            java.lang.String r2 = ".properties"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = com.getui.gtc.base.util.CommonUtil.getExternalFilesDir(r9)
            r3 = 0
        L1f:
            r4 = 4
            if (r3 >= r4) goto Lb0
            if (r3 != 0) goto L2d
            android.content.res.AssetManager r4 = r9.getAssets()     // Catch: java.lang.Throwable -> La8
            java.io.InputStream r4 = r4.open(r1)     // Catch: java.lang.Throwable -> La8
            goto L70
        L2d:
            r4 = 1
            if (r3 != r4) goto L36
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> La8
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> La8
            goto L5e
        L36:
            r4 = 2
            if (r3 != r4) goto L43
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> La8
            java.io.File r5 = r9.getFilesDir()     // Catch: java.lang.Throwable -> La8
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> La8
            goto L5e
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r4.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = r9.getPackageName()     // Catch: java.lang.Throwable -> La8
            r4.append(r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "-online.properties"
            r4.append(r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La8
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> La8
            r5.<init>(r2, r4)     // Catch: java.lang.Throwable -> La8
            r4 = r5
        L5e:
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> La8
            if (r5 == 0) goto Lac
            boolean r5 = r4.canRead()     // Catch: java.lang.Throwable -> La8
            if (r5 == 0) goto Lac
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La8
            r5.<init>(r4)     // Catch: java.lang.Throwable -> La8
            r4 = r5
        L70:
            java.util.Properties r5 = new java.util.Properties     // Catch: java.lang.Throwable -> La9
            r5.<init>()     // Catch: java.lang.Throwable -> La9
            r5.load(r4)     // Catch: java.lang.Throwable -> La9
            java.util.Enumeration r6 = r5.keys()     // Catch: java.lang.Throwable -> La9
        L7c:
            boolean r7 = r6.hasMoreElements()     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto La2
            java.lang.Object r7 = r6.nextElement()     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> La9
            java.lang.String r8 = r5.getProperty(r7)     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L7c
            java.lang.String r8 = r8.trim()     // Catch: java.lang.Throwable -> La9
            boolean r8 = java.lang.Boolean.parseBoolean(r8)     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L7c
            boolean r8 = r0.contains(r7)     // Catch: java.lang.Throwable -> La9
            if (r8 != 0) goto L7c
            r0.add(r7)     // Catch: java.lang.Throwable -> La9
            goto L7c
        La2:
            if (r4 == 0) goto Lac
        La4:
            r4.close()     // Catch: java.io.IOException -> Lac
            goto Lac
        La8:
            r4 = 0
        La9:
            if (r4 == 0) goto Lac
            goto La4
        Lac:
            int r3 = r3 + 1
            goto L1f
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.base.log.a.a.a(android.content.Context):java.util.List");
    }

    @Override // com.getui.gtc.base.log.ILogController
    public boolean isLoggable(int i11, String str) {
        int i12 = i11 & 240;
        if (i12 == 0 || i12 == 32) {
            return this.f29804e;
        }
        return false;
    }

    @Override // com.getui.gtc.base.log.ILogController
    public void log(int i11, String str, String str2, Throwable th2) {
        if ((i11 & 240) != 0) {
            i11 &= 15;
        }
        this.f29803d.log(i11, str, str2, th2);
    }

    public final void a(String str) {
        this.f29801a = str;
        this.f29804e = a(this.f29802c, str);
    }

    private static boolean a(Context context, String str) {
        try {
            if (f29800b == null) {
                synchronized (a.class) {
                    try {
                        if (f29800b == null) {
                            f29800b = Collections.unmodifiableList(a(context));
                        }
                    } finally {
                    }
                }
            }
            return f29800b.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
