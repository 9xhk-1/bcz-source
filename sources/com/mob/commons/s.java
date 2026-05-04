package com.mob.commons;

import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f40405a = true;

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f40406b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f40407c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f40408d = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z11, boolean z12) {
        if (z11) {
            if (z12) {
                b.i();
            } else {
                i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(boolean z11) {
        try {
            f(z11);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            try {
                f(z11);
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
            }
        }
    }

    private static void f(boolean z11) throws Throwable {
        HashMap<String, Object> f11 = q.f();
        f11.put(com.mob.commons.a.l.a("009QefghfkggeiAjj[hh6f"), String.valueOf(z11));
        String httpGet = new NetworkHelper().httpGet(c.a(c.f40221c) + com.mob.commons.a.l.a("036hfQeief-k<egehej]hfKfdfeefehejIhUegedRed[fdeiefgmegZe_effdel>hNgh6e5eg<e8edgh"), f11, NetCommunicator.getCommonDefaultHeaders());
        MobLog.getInstance().d("RS sp: " + httpGet, new Object[0]);
        HashMap fromJson = HashonHelper.fromJson(httpGet);
        if (fromJson == null) {
            throw new Throwable("RS is illegal: " + httpGet);
        }
        if (BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(fromJson.get(com.mob.commons.a.l.a("004Behfd8ij"))))) {
            return;
        }
        throw new Throwable("RS code is not 200: " + httpGet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i() {
        if (f40407c.compareAndSet(false, true)) {
            n.a(MobSDK.getContext());
            k();
            f();
            u.a();
            l();
            j();
            new com.mob.tools.utils.e("PY-C") { // from class: com.mob.commons.s.2
                @Override // com.mob.tools.utils.e
                public void a() {
                    MobLog.getInstance().d("lk st: " + Process.myPid(), new Object[0]);
                    boolean a11 = l.a(l.a(l.f40360f), new k() { // from class: com.mob.commons.s.2.1
                        @Override // com.mob.commons.k
                        public boolean a(FileLocker fileLocker) {
                            MobLog.getInstance().d("lk pd: " + Process.myPid(), new Object[0]);
                            v.g();
                            b.a();
                            Looper.prepare();
                            Looper.loop();
                            return false;
                        }
                    });
                    MobLog.getInstance().d("lk res: " + a11 + Process.myPid(), new Object[0]);
                }
            }.start();
        }
    }

    private static void j() {
        try {
            com.mob.mgs.impl.b.a();
        } catch (Throwable unused) {
        }
    }

    private static void k() {
        try {
            ServerSocketChannel open = ServerSocketChannel.open();
            open.configureBlocking(false);
            try {
                open.socket().bind(new InetSocketAddress(37926));
                m.f40366a = false;
                open.close();
            } catch (Throwable unused) {
                m.f40366a = true;
            }
        } catch (Throwable unused2) {
        }
    }

    private static void l() {
        i.a().a(new h() { // from class: com.mob.commons.s.3
            @Override // com.mob.commons.h
            public void a(boolean z11, boolean z12, long j11) {
                if (z11) {
                    MobLog.getInstance().d("fg.", new Object[0]);
                    boolean unused = s.f40405a = true;
                } else {
                    MobLog.getInstance().d("bg.", new Object[0]);
                    boolean unused2 = s.f40405a = false;
                }
            }
        });
    }

    public static int c() {
        MobLog.getInstance().d("get py grtd status: " + f40406b, new Object[0]);
        return f40406b;
    }

    public static int d() {
        MobLog.getInstance().d("get py grtd status mem: " + f40406b, new Object[0]);
        if (f40406b != -1) {
            return f40406b;
        }
        int b11 = v.a().b(v.f40432i, -1);
        MobLog.getInstance().d("get py grtd status cache: " + b11, new Object[0]);
        return b11;
    }

    public static void a(final boolean z11) {
        t.f40414c.execute(new com.mob.tools.utils.d() { // from class: com.mob.commons.s.1
            @Override // com.mob.tools.utils.d
            public void a() {
                if (!TextUtils.isEmpty("M-")) {
                    Thread.currentThread().setName("M-" + com.mob.commons.a.l.a("004Khhjjijhl"));
                }
                boolean a11 = v.a().a(v.f40431h, n.f40395e);
                int b11 = v.a().b(v.f40432i, -1);
                if (b11 != -1) {
                    int unused = s.f40406b = b11;
                }
                if (!a11 || s.f40406b == 1) {
                    s.b(true, z11);
                } else {
                    s.b(false, z11);
                }
                NLog mobLog = MobLog.getInstance();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z11 ? com.mob.commons.a.l.a("002(ei-j") : "");
                sb2.append("init cfg over. py ");
                sb2.append(s.f40406b);
                mobLog.d(sb2.toString(), new Object[0]);
            }
        });
    }

    public static boolean b() {
        return !v.a().a(v.f40431h, n.f40395e) || f40406b == 1;
    }

    public static boolean a() {
        return f40405a;
    }

    public static void b(final boolean z11) {
        f40406b = z11 ? 1 : 0;
        MobLog.getInstance().d("submit py: " + z11, new Object[0]);
        new com.mob.tools.utils.e(com.mob.commons.a.l.a("004Shhjjijhk")) { // from class: com.mob.commons.s.4
            @Override // com.mob.tools.utils.e
            public void a() {
                v.a().a(v.f40432i, z11 ? 1 : 0);
                if (z11) {
                    s.i();
                }
                s.e(z11);
            }
        }.start();
    }

    public static String e() {
        return "jvr<1fgxsowakcet{mpzqnWPKUVCN0dy2iuhFDQ|GTXERO:43YJH7lZ;/MI>\"@8A?9[)_]5=.(S'6~盺朼L\\";
    }

    public static void f() {
        if (f40408d.getAndSet(true)) {
            return;
        }
        com.mob.tools.a.g.a(MobSDK.getContext()).a(com.mob.tools.a.g.a(MobSDK.getContext()).b());
        com.mob.tools.a.c.a(MobSDK.getContext()).a(com.mob.tools.a.c.a(MobSDK.getContext()).c());
    }
}
