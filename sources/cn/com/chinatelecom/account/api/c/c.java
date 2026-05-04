package cn.com.chinatelecom.account.api.c;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.d.j;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8912a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static String f8913b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f8914c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static long f8915d = 1800000;

    private static String c(Context context) {
        int myPid = Process.myPid();
        String str = "";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getApplicationContext().getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                str = runningAppProcessInfo.processName;
            }
        }
        return str;
    }

    public static synchronized String a() {
        synchronized (c.class) {
            if (System.currentTimeMillis() >= f8914c || !cn.com.chinatelecom.account.api.d.d.a(f8913b)) {
                return null;
            }
            return f8913b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2, int i11) {
        StringBuilder sb2;
        String str3;
        try {
            cn.com.chinatelecom.account.api.d.f.a(str2).b(i11);
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception e11) {
            if (i11 == 0) {
                sb2 = new StringBuilder();
                str3 = "first exception: ";
            } else {
                sb2 = new StringBuilder();
                str3 = "retry exception: ";
            }
            sb2.append(str3);
            sb2.append(e11.getMessage());
            cn.com.chinatelecom.account.api.d.f.a(str2).g(sb2.toString());
            return null;
        }
    }

    public static boolean b(Context context) {
        try {
            return context.getPackageName().equals(c(context));
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    public static void a(final Context context) {
        if (b(context) && f8913b == null && cn.com.chinatelecom.account.api.d.g.a() == null) {
            new cn.com.chinatelecom.account.api.b.d().a(new cn.com.chinatelecom.account.api.b.e() { // from class: cn.com.chinatelecom.account.api.c.c.1
                @Override // cn.com.chinatelecom.account.api.b.e
                public void a() {
                    cn.com.chinatelecom.account.api.d.e a11;
                    String a12;
                    try {
                        String a13 = cn.com.chinatelecom.account.api.d.d.a();
                        cn.com.chinatelecom.account.api.d.f.a(a13).a(cn.com.chinatelecom.account.api.d.d.a(context)).c("dns").b(cn.com.chinatelecom.account.api.d.g.f(context));
                        String a14 = cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.d.b.f8958f);
                        String b11 = c.b(a14, a13, 0);
                        if (TextUtils.isEmpty(b11)) {
                            b11 = c.b(a14, a13, 1);
                        }
                        synchronized (c.class) {
                            try {
                                if (TextUtils.isEmpty(b11)) {
                                    a11 = cn.com.chinatelecom.account.api.d.f.a(a13).a(80011);
                                    a12 = cn.com.chinatelecom.account.api.a.d.a(j.f9014q);
                                } else {
                                    String unused = c.f8913b = b11;
                                    long unused2 = c.f8914c = System.currentTimeMillis() + c.f8915d;
                                    a11 = cn.com.chinatelecom.account.api.d.f.a(a13).a(0);
                                    a12 = "success";
                                }
                                a11.e(a12);
                            } finally {
                            }
                        }
                        cn.com.chinatelecom.account.api.d.f.b(a13);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
        }
    }
}
