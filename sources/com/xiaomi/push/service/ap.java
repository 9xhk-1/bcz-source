package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.push.dv;
import com.xiaomi.push.fg;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class ap {

    /* renamed from: a, reason: collision with other field name */
    private static final Pattern f937a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* renamed from: a, reason: collision with root package name */
    private static long f46250a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f936a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private static String a(String str) {
        BufferedReader bufferedReader;
        Throwable th2;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String sb3 = sb2.toString();
                        com.xiaomi.push.y.a(bufferedReader);
                        return sb3;
                    }
                    sb2.append("\n");
                    sb2.append(readLine);
                }
            } catch (Exception unused) {
                com.xiaomi.push.y.a(bufferedReader);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                com.xiaomi.push.y.a(bufferedReader);
                throw th2;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    public static void b() {
        String a11 = a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(a11)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("dump tcp for uid = " + Process.myUid());
            com.xiaomi.channel.commonutils.logger.b.m5639a(a11);
        }
        String a12 = a("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(a12)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("dump tcp6 for uid = " + Process.myUid());
        com.xiaomi.channel.commonutils.logger.b.m5639a(a12);
    }

    public static void a() {
        dv.a m6269a;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f936a.getActiveCount() <= 0 || currentTimeMillis - f46250a >= 1800000) && fg.m5936a().m5941a() && (m6269a = bv.a().m6269a()) != null && m6269a.e() > 0) {
            f46250a = currentTimeMillis;
            a(m6269a.m5830a(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.xiaomi.channel.commonutils.logger.b.m5639a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(com.xiaomi.push.cs.m5801a(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            com.xiaomi.channel.commonutils.logger.b.m5639a("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - currentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.d("ConnectivityTest: could not connect to:" + str + " exception: " + th2.getClass().getSimpleName() + " description: " + th2.getMessage());
            return false;
        }
    }

    public static void a(List<String> list, boolean z11) {
        f936a.execute(new aq(list, z11));
    }
}
