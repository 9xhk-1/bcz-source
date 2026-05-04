package com.getui.gtc.i.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.e.c;
import com.igexin.sdk.PushManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f30106a = new AtomicBoolean(false);

    private static File a() {
        return new File(CommonUtil.getExternalFilesDir(GtcProvider.context()), GtcProvider.context().getPackageName() + "-online.properties");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File b(File file) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        GZIPOutputStream gZIPOutputStream;
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file + ".zip");
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                try {
                                    gZIPOutputStream.close();
                                    fileOutputStream.close();
                                    fileInputStream.close();
                                    return file2;
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    return file2;
                                }
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            th.printStackTrace();
                            if (gZIPOutputStream != null) {
                                try {
                                } catch (Throwable th4) {
                                    return null;
                                }
                            }
                            return null;
                        } finally {
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th42) {
                                    th42.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream = null;
                gZIPOutputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            fileOutputStream = null;
            fileInputStream = null;
            gZIPOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context) {
        String str = "";
        try {
            Object invoke = PushManager.class.getDeclaredMethod("getClientid", Context.class).invoke(PushManager.class.getDeclaredMethod("getInstance", null).invoke(null, null), context);
            if (invoke != null) {
                str = (String) invoke;
            }
        } catch (Throwable th2) {
            a.a("reflect cid", th2);
        }
        a.a("reflect cid:".concat(str));
        return str;
    }

    private static JSONObject a(String str) {
        c cVar;
        JSONObject a11;
        int i11;
        boolean z11;
        c cVar2;
        c cVar3;
        c cVar4;
        try {
            a.a("update file log config:".concat(String.valueOf(str)));
            cVar = c.a.f30027a;
            a11 = cVar.f30024a.a();
            i11 = 0;
            z11 = a11 != null && a11.length() > 0;
        } catch (Throwable th2) {
            a.c(th2);
        }
        if (TextUtils.isEmpty(str)) {
            if (z11) {
                a().delete();
                cVar4 = c.a.f30027a;
                cVar4.f30024a.a((JSONObject) null);
                a.a("file log clear old config and properties");
            }
            return null;
        }
        if (z11 && a11.optString("dycConfig").equals(str)) {
            a.a("file log same config");
            return a11;
        }
        cVar2 = c.a.f30027a;
        cVar2.f30024a.a((JSONObject) null);
        a().delete();
        a.a("file log clear old config and properties");
        String[] split = str.split("\\|");
        if (split.length < 8) {
            throw new IllegalStateException("file log dyc error");
        }
        JSONObject jSONObject = new JSONObject();
        String[] split2 = split[0].split(",");
        String str2 = com.getui.gtc.c.b.f29827d;
        int length = split2.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str3 = split2[i12];
            if (!TextUtils.isEmpty(str3) && str3.equals(str2)) {
                jSONObject.put("gtcid", str2);
                break;
            }
            i12++;
        }
        String[] split3 = split[1].split(",");
        String b11 = b(GtcProvider.context());
        int length2 = split3.length;
        while (true) {
            if (i11 >= length2) {
                break;
            }
            String str4 = split3[i11];
            if (!TextUtils.isEmpty(str4) && str4.equals(b11)) {
                jSONObject.put("cid", b11);
                break;
            }
            i11++;
        }
        if (!jSONObject.has("gtcid") && !jSONObject.has("cid")) {
            a.a("file upload not match cur user");
            return null;
        }
        long time = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(split[2]).getTime();
        long parseLong = Long.parseLong(split[3]);
        if (parseLong <= 0) {
            a.a("file upload interval=" + parseLong + " not valid");
        }
        jSONObject.put("allowMobile", "1".equals(split[6]));
        jSONObject.put("startTime", time);
        jSONObject.put("interval", parseLong);
        jSONObject.put("suffixes", split[4]);
        jSONObject.put("enableKeys", split[5]);
        jSONObject.put("url", split[7]);
        if (a(jSONObject)) {
            jSONObject.put("lastModified", a().lastModified());
        }
        jSONObject.put("dycConfig", str);
        cVar3 = c.a.f30027a;
        cVar3.f30024a.a(jSONObject);
        a.a("save file log dyc to db: " + jSONObject.toString());
        return jSONObject;
    }

    public static void a(Map<String, String> map) {
        String str;
        c cVar;
        String concat;
        try {
            if (f30106a.getAndSet(true)) {
                return;
            }
            final JSONObject a11 = a(map != null ? map.get("sdk.gtc.fileLog.upload") : null);
            if (a11 != null && a11.length() != 0) {
                final long optLong = a11.optLong("startTime");
                String optString = a11.optString("gtcid");
                String optString2 = a11.optString("cid");
                final long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis >= optLong && currentTimeMillis <= 604800000 + optLong) {
                    if ((!TextUtils.isEmpty(optString) && optString.equals(com.getui.gtc.c.b.f29827d)) || (!TextUtils.isEmpty(optString2) && optString2.equals(b(GtcProvider.context())))) {
                        if (CommonUtil.isAppDebugEnable()) {
                            concat = "file log upload is debug, disallow";
                        } else {
                            boolean optBoolean = a11.optBoolean("allowMobile");
                            if (a(optBoolean)) {
                                File a12 = a();
                                long optLong2 = a11.optLong("lastModified");
                                if (optLong2 == 0 || optLong2 != a12.lastModified()) {
                                    if (!a(a11)) {
                                        return;
                                    }
                                    a11.put("lastModified", a12.lastModified());
                                    cVar = c.a.f30027a;
                                    cVar.f30024a.a(a11);
                                }
                                if (currentTimeMillis - a11.optLong("reportTime") < a11.optLong("interval") * 1000) {
                                    a.c("file log report time not expired");
                                    return;
                                }
                                Thread thread = new Thread(new Runnable() { // from class: com.getui.gtc.i.c.b.1
                                    /* JADX WARN: Removed duplicated region for block: B:59:0x02e6 A[Catch: all -> 0x0274, TRY_LEAVE, TryCatch #10 {all -> 0x0274, blocks: (B:64:0x02dd, B:55:0x02e0, B:59:0x02e6, B:60:0x0271, B:89:0x0255, B:91:0x025e, B:125:0x02a4, B:127:0x02aa), top: B:63:0x02dd }] */
                                    /* JADX WARN: Removed duplicated region for block: B:63:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void run() {
                                        /*
                                            Method dump skipped, instructions count: 831
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.i.c.b.AnonymousClass1.run():void");
                                    }
                                });
                                thread.setName("GTC_fileLogUploadThread");
                                thread.start();
                                return;
                            }
                            concat = "file log upload network is not allowed, allowMobile:".concat(String.valueOf(optBoolean));
                        }
                        a.b(concat);
                        return;
                    }
                    a().delete();
                    str = "file log upload gtcid or cid changed";
                    a.a(str);
                }
                a.a("current time is not in file log upload time range");
                a().delete();
                return;
            }
            str = "file log upload no dyc config in db";
            a.a(str);
        } catch (Throwable th2) {
            a.c(th2);
        }
    }

    private static boolean a(JSONObject jSONObject) {
        FileOutputStream fileOutputStream = null;
        try {
            long optLong = jSONObject.optLong("startTime");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= optLong && currentTimeMillis <= optLong + 604800000) {
                String[] split = jSONObject.optString("enableKeys").split(",");
                StringBuilder sb2 = new StringBuilder();
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        sb2.append(str);
                        sb2.append('=');
                        sb2.append("true\n");
                    }
                }
                if (sb2.length() == 0) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(a(), false);
                try {
                    fileOutputStream2.write(sb2.toString().getBytes());
                    fileOutputStream2.flush();
                    a.a("file log write enableKeys success.");
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (Throwable th2) {
                        a.c(th2);
                        return true;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    try {
                        a.c(th);
                        return false;
                    } finally {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                a.c(th4);
                            }
                        }
                    }
                }
            }
            a.a("current time is not in file log upload time range");
            return false;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private static boolean a(boolean z11) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) GtcProvider.context().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            if (!z11) {
                if (activeNetworkInfo.getType() != 1) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
