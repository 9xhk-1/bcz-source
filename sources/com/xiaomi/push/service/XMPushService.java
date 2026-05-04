package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.aj;
import com.xiaomi.push.dc;
import com.xiaomi.push.de;
import com.xiaomi.push.ec;
import com.xiaomi.push.en;
import com.xiaomi.push.et;
import com.xiaomi.push.fg;
import com.xiaomi.push.fi;
import com.xiaomi.push.fk;
import com.xiaomi.push.fr;
import com.xiaomi.push.fv;
import com.xiaomi.push.fw;
import com.xiaomi.push.fy;
import com.xiaomi.push.ga;
import com.xiaomi.push.gb;
import com.xiaomi.push.gg;
import com.xiaomi.push.gl;
import com.xiaomi.push.gm;
import com.xiaomi.push.ha;
import com.xiaomi.push.hc;
import com.xiaomi.push.hf;
import com.xiaomi.push.hh;
import com.xiaomi.push.hm;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.ir;
import com.xiaomi.push.ix;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.service.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class XMPushService extends Service implements fy {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f46201b = false;

    /* renamed from: a, reason: collision with other field name */
    private ContentObserver f873a;

    /* renamed from: a, reason: collision with other field name */
    private fr f875a;

    /* renamed from: a, reason: collision with other field name */
    private fv f876a;

    /* renamed from: a, reason: collision with other field name */
    private fw f877a;

    /* renamed from: a, reason: collision with other field name */
    private a f879a;

    /* renamed from: a, reason: collision with other field name */
    private f f880a;

    /* renamed from: a, reason: collision with other field name */
    private k f881a;

    /* renamed from: a, reason: collision with other field name */
    private r f882a;

    /* renamed from: a, reason: collision with other field name */
    private t f883a;

    /* renamed from: a, reason: collision with other field name */
    private bq f885a;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.j f886a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f891a = false;

    /* renamed from: a, reason: collision with root package name */
    private int f46202a = 0;

    /* renamed from: b, reason: collision with other field name */
    private int f892b = 0;

    /* renamed from: a, reason: collision with other field name */
    private long f872a = 0;

    /* renamed from: a, reason: collision with other field name */
    protected Class f888a = XMJobService.class;

    /* renamed from: a, reason: collision with other field name */
    private be f884a = null;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.p f887a = null;

    /* renamed from: a, reason: collision with other field name */
    Messenger f874a = null;

    /* renamed from: a, reason: collision with other field name */
    private Collection<ar> f890a = Collections.synchronizedCollection(new ArrayList());

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<n> f889a = new ArrayList<>();

    /* renamed from: a, reason: collision with other field name */
    private ga f878a = new ci(this);

    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with other field name */
        private final Object f893a;

        private a() {
            this.f893a = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f893a) {
                try {
                    this.f893a.notifyAll();
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("[Alarm] notify lock. " + e11);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] heartbeat alarm has been triggered.");
            if (!bk.f46315p.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("[Alarm] cancel the old ping timer");
                et.a();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    a(3000L);
                    com.xiaomi.channel.commonutils.logger.b.m5639a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ a(XMPushService xMPushService, ci ciVar) {
            this();
        }

        private void a(long j11) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f893a) {
                try {
                    this.f893a.wait(j11);
                } catch (InterruptedException e11) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("[Alarm] interrupt from waiting state. " + e11);
                }
            }
        }
    }

    public class b extends j {

        /* renamed from: a, reason: collision with other field name */
        bg.b f894a;

        public b(bg.b bVar) {
            super(9);
            this.f894a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "bind the client. " + this.f894a.f46286g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            StringBuilder sb2;
            try {
                if (!XMPushService.this.m6214c()) {
                    com.xiaomi.channel.commonutils.logger.b.d("trying bind while the connection is not created, quit!");
                    return;
                }
                bg a11 = bg.a();
                bg.b bVar = this.f894a;
                bg.b a12 = a11.a(bVar.f46286g, bVar.f968b);
                if (a12 == null) {
                    sb2 = new StringBuilder();
                    sb2.append("ignore bind because the channel ");
                    sb2.append(this.f894a.f46286g);
                    sb2.append(" is removed ");
                } else if (a12.f963a == bg.c.unbind) {
                    a12.a(bg.c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.this.f876a.a(a12);
                    fi.a(XMPushService.this, a12);
                    return;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("trying duplicate bind, ingore! ");
                    sb2.append(a12.f963a);
                }
                com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.d("Meet error when trying to bind. " + e11);
                XMPushService.this.a(10, e11);
            } catch (Throwable unused) {
            }
        }
    }

    public static class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final bg.b f46205a;

        public c(bg.b bVar) {
            super(12);
            this.f46205a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "bind time out. chid=" + this.f46205a.f46286g;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return TextUtils.equals(((c) obj).f46205a.f46286g, this.f46205a.f46286g);
            }
            return false;
        }

        public int hashCode() {
            return this.f46205a.f46286g.hashCode();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            this.f46205a.a(bg.c.unbind, 1, 21, (String) null, (String) null);
        }
    }

    public class d extends j {

        /* renamed from: a, reason: collision with root package name */
        private fk f46206a;

        public d(fk fkVar) {
            super(8);
            this.f46206a = fkVar;
        }

        public fk a() {
            return this.f46206a;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a, reason: collision with other method in class */
        public String mo6216a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            an anVar = this.f46206a.f405a;
            if (anVar != null) {
                anVar.f46247c = System.currentTimeMillis();
            }
            XMPushService.this.f884a.a(this.f46206a);
        }
    }

    public class e extends j {
        public e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            if (XMPushService.this.m6209a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("should not connect. quit the job.");
        }
    }

    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("network changed, " + com.xiaomi.push.j.a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class g extends j {

        /* renamed from: a, reason: collision with other field name */
        public Exception f896a;

        /* renamed from: b, reason: collision with root package name */
        public int f46210b;

        public g(int i11, Exception exc) {
            super(2);
            this.f46210b = i11;
            this.f896a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            XMPushService.this.a(this.f46210b, this.f896a);
        }
    }

    public class h extends j {
        public h() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            XMPushService.this.c();
        }
    }

    public class i extends j {

        /* renamed from: a, reason: collision with root package name */
        private Intent f46212a;

        public i(Intent intent) {
            super(15);
            this.f46212a = intent;
        }

        public Intent a() {
            return this.f46212a;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "Handle intent action = " + this.f46212a.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            XMPushService.this.d(this.f46212a);
        }
    }

    public static abstract class j extends p.b {
        public j(int i11) {
            super(i11);
        }

        /* renamed from: a */
        public abstract String mo6216a();

        /* renamed from: a */
        public abstract void mo5933a();

        @Override // java.lang.Runnable
        public void run() {
            int i11 = this.f46384a;
            if (i11 != 4 && i11 != 8) {
                com.xiaomi.channel.commonutils.logger.b.m5640a(com.xiaomi.channel.commonutils.logger.a.f45142a, mo6216a());
            }
            mo5933a();
        }
    }

    public class k extends BroadcastReceiver {
        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] hold short heartbeat, " + com.xiaomi.push.j.a(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class l extends j {
        public l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            XMPushService.this.f887a.m6286a();
        }
    }

    public class m extends j {

        /* renamed from: a, reason: collision with root package name */
        private gm f46215a;

        public m(gm gmVar) {
            super(8);
            this.f46215a = gmVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            XMPushService.this.f884a.a(this.f46215a);
        }
    }

    public interface n {
        /* renamed from: a */
        void mo6008a();
    }

    public class o extends j {

        /* renamed from: a, reason: collision with other field name */
        boolean f899a;

        public o(boolean z11) {
            super(4);
            this.f899a = z11;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            if (XMPushService.this.m6214c()) {
                try {
                    if (!this.f899a) {
                        fi.a();
                    }
                    XMPushService.this.f876a.b(this.f899a);
                } catch (gg e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                    XMPushService.this.a(10, e11);
                }
            }
        }
    }

    public class p extends j {

        /* renamed from: a, reason: collision with other field name */
        bg.b f900a;

        public p(bg.b bVar) {
            super(4);
            this.f900a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "rebind the client. " + this.f900a.f46286g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            try {
                this.f900a.a(bg.c.unbind, 1, 16, (String) null, (String) null);
                fv fvVar = XMPushService.this.f876a;
                bg.b bVar = this.f900a;
                fvVar.a(bVar.f46286g, bVar.f968b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.a(xMPushService.new b(this.f900a), 300L);
            } catch (gg e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
                XMPushService.this.a(10, e11);
            }
        }
    }

    public class q extends j {
        public q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.m6209a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                }
            }
        }
    }

    public class r extends BroadcastReceiver {
        public r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class s extends j {

        /* renamed from: a, reason: collision with other field name */
        bg.b f901a;

        /* renamed from: a, reason: collision with other field name */
        String f902a;

        /* renamed from: b, reason: collision with root package name */
        int f46221b;

        /* renamed from: b, reason: collision with other field name */
        String f903b;

        public s(bg.b bVar, int i11, String str, String str2) {
            super(9);
            this.f901a = bVar;
            this.f46221b = i11;
            this.f902a = str;
            this.f903b = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo6216a() {
            return "unbind the channel. " + this.f901a.f46286g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo5933a() {
            if (this.f901a.f963a != bg.c.unbind && XMPushService.this.f876a != null) {
                try {
                    fv fvVar = XMPushService.this.f876a;
                    bg.b bVar = this.f901a;
                    fvVar.a(bVar.f46286g, bVar.f968b);
                } catch (gg e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                    XMPushService.this.a(10, e11);
                }
            }
            this.f901a.a(bg.c.unbind, this.f46221b, 0, this.f903b, this.f902a);
        }
    }

    public class t extends BroadcastReceiver {
        public t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f891a) {
                XMPushService.this.f891a = true;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("[HB] wifi changed, " + com.xiaomi.push.j.a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5 A[Catch: Exception -> 0x00bb, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bb, blocks: (B:16:0x00af, B:18:0x00b5), top: B:15:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r5 = this;
            com.xiaomi.push.cu r0 = com.xiaomi.push.cu.a()
            r0.m5813d()
            android.content.Context r0 = r5.getApplicationContext()
            com.xiaomi.push.service.o r0 = com.xiaomi.push.service.o.a(r0)
            r0.m6281a()
            android.content.Context r0 = r5.getApplicationContext()
            com.xiaomi.push.service.a r0 = com.xiaomi.push.service.a.a(r0)
            java.lang.String r1 = r0.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "region of cache is "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.xiaomi.channel.commonutils.logger.b.m5639a(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L44
            java.lang.String r1 = r5.b()
            com.xiaomi.push.n r1 = com.xiaomi.push.j.a(r1)
            java.lang.String r1 = r1.name()
        L44:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "CN"
            r4 = 1
            if (r2 != 0) goto L60
            com.xiaomi.push.n r2 = com.xiaomi.push.n.China
            java.lang.String r2 = r2.name()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L60
        L59:
            r0.a(r1, r4)
            r0.b(r3, r4)
            goto L83
        L60:
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L7d
            java.lang.String r1 = "com.xiaomi.xmsf"
            java.lang.String r2 = r5.getPackageName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L76
            java.lang.String r3 = ""
            r1 = r3
            goto L59
        L76:
            com.xiaomi.push.n r1 = com.xiaomi.push.n.China
            java.lang.String r1 = r1.name()
            goto L59
        L7d:
            com.xiaomi.push.n r0 = com.xiaomi.push.n.China
            java.lang.String r1 = r0.name()
        L83:
            com.xiaomi.push.n r0 = com.xiaomi.push.n.China
            java.lang.String r0 = r0.name()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L94
            java.lang.String r0 = "cn.app.chat.xiaomi.net"
            com.xiaomi.push.fw.a(r0)
        L94:
            a(r1)
            boolean r0 = r5.m6204h()
            if (r0 == 0) goto Laf
            com.xiaomi.push.service.cs r0 = new com.xiaomi.push.service.cs
            r1 = 11
            r0.<init>(r5, r1)
            r5.a(r0)
            com.xiaomi.push.service.ct r1 = new com.xiaomi.push.service.ct
            r1.<init>(r5, r0)
            com.xiaomi.push.service.u.a(r1)
        Laf:
            boolean r0 = com.xiaomi.push.s.m6185a()     // Catch: java.lang.Exception -> Lbb
            if (r0 == 0) goto Lbd
            com.xiaomi.push.service.j r0 = r5.f886a     // Catch: java.lang.Exception -> Lbb
            r0.a(r5)     // Catch: java.lang.Exception -> Lbb
            return
        Lbb:
            r0 = move-exception
            goto Lbe
        Lbd:
            return
        Lbe:
            com.xiaomi.channel.commonutils.logger.b.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.c():void");
    }

    private void d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            networkInfo = null;
        }
        com.xiaomi.push.service.o.a(getApplicationContext()).a(networkInfo);
        if (networkInfo != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("network changed,");
            sb2.append("[type: " + networkInfo.getTypeName() + "[" + networkInfo.getSubtypeName() + "], state: " + networkInfo.getState() + "/" + networkInfo.getDetailedState());
            com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.m5639a("network changed, no active network");
        }
        if (fg.a() != null) {
            fg.a().m5935a();
        }
        ha.m6006a((Context) this);
        this.f875a.d();
        if (com.xiaomi.push.bi.b(this)) {
            if (m6214c() && m6202f()) {
                b(false);
            }
            if (!m6214c() && !m6215d()) {
                this.f887a.a(1);
                a(new e());
            }
            de.a(this).a();
        } else {
            a(new g(2, null));
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!m6209a()) {
            et.a();
        } else {
            if (et.m5927a()) {
                return;
            }
            et.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        fv fvVar = this.f876a;
        if (fvVar != null && fvVar.m5969b()) {
            com.xiaomi.channel.commonutils.logger.b.d("try to connect while connecting.");
            return;
        }
        fv fvVar2 = this.f876a;
        if (fvVar2 != null && fvVar2.m5970c()) {
            com.xiaomi.channel.commonutils.logger.b.d("try to connect while is connected.");
            return;
        }
        this.f877a.b(com.xiaomi.push.bi.m5747a((Context) this));
        g();
        if (this.f876a == null) {
            bg.a().a(this);
            c(false);
        }
    }

    private void g() {
        try {
            this.f875a.a(this.f878a, new cl(this));
            this.f875a.e();
            this.f876a = this.f875a;
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a("fail to create Slim connection", e11);
            this.f875a.b(3, e11);
        }
    }

    private void h() {
    }

    private void i() {
        synchronized (this.f889a) {
            this.f889a.clear();
        }
    }

    private boolean j() {
        int intValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i11 = this.f46202a;
        int i12 = this.f892b;
        return i11 > i12 ? intValue >= i11 || intValue < i12 : i11 < i12 && intValue >= i11 && intValue < i12;
    }

    private boolean k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return ba.a(this).a(hm.ForegroundServiceSwitch.a(), false);
    }

    /* renamed from: a, reason: collision with other method in class */
    public fv m6206a() {
        return this.f876a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public com.xiaomi.push.service.j m6211b() {
        return this.f886a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f874a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] split;
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.b.a(getApplicationContext());
        com.xiaomi.push.s.a((Context) this);
        com.xiaomi.push.service.t m6297a = u.m6297a((Context) this);
        if (m6297a != null) {
            com.xiaomi.push.ab.a(m6297a.f46399a);
        }
        ci ciVar = null;
        if (com.xiaomi.push.j.m6172a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f879a = new a(this, ciVar);
            registerReceiver(this.f879a, new IntentFilter(bk.f46315p), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler);
            f46201b = true;
            handler.post(new cn(this));
        }
        this.f874a = new Messenger(new co(this));
        bl.a(this);
        cp cpVar = new cp(this, null, 5222, "xiaomi.com", null);
        this.f877a = cpVar;
        cpVar.a(true);
        this.f875a = new fr(this, this.f877a);
        this.f886a = m6207a();
        et.a(this);
        this.f875a.a(this);
        this.f884a = new be(this);
        this.f885a = new bq(this);
        new com.xiaomi.push.service.k().a();
        fg.m5936a().a(this);
        this.f887a = new com.xiaomi.push.service.p("Connection Controller Thread");
        bg a11 = bg.a();
        a11.b();
        a11.a(new cq(this));
        if (k()) {
            h();
        }
        hf.a(this).a(new com.xiaomi.push.service.r(this), "UPLOADER_PUSH_CHANNEL");
        a(new hc(this));
        a(new cg(this));
        if (com.xiaomi.push.j.m6172a((Context) this)) {
            a(new bf());
        }
        a(new h());
        this.f890a.add(bx.a(this));
        if (m6204h()) {
            this.f880a = new f();
            registerReceiver(this.f880a, new IntentFilter(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE));
        }
        if (com.xiaomi.push.j.m6172a(getApplicationContext())) {
            this.f883a = new t();
            registerReceiver(this.f883a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null);
            k kVar = new k();
            this.f881a = kVar;
            registerReceiver(kVar, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f873a = new cr(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f873a);
                } catch (Throwable th2) {
                    com.xiaomi.channel.commonutils.logger.b.d("register super-power-mode observer err:" + th2.getMessage());
                }
            }
            int[] m6199a = m6199a();
            if (m6199a != null) {
                this.f882a = new r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f882a, intentFilter);
                this.f46202a = m6199a[0];
                this.f892b = m6199a[1];
                com.xiaomi.channel.commonutils.logger.b.m5639a("falldown initialized: " + this.f46202a + "," + this.f892b);
            }
        }
        String str = "";
        if (m6297a != null) {
            try {
                if (!TextUtils.isEmpty(m6297a.f1035a) && (split = m6297a.f1035a.split(EmailAutoCompleteEditText.f17091d)) != null && split.length > 0) {
                    str = split[0];
                }
            } catch (Exception unused) {
            }
        }
        dc.a(this);
        com.xiaomi.channel.commonutils.logger.b.e("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + com.xiaomi.push.g.a(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = this.f880a;
        if (fVar != null) {
            a(fVar);
            this.f880a = null;
        }
        t tVar = this.f883a;
        if (tVar != null) {
            a(tVar);
            this.f883a = null;
        }
        k kVar = this.f881a;
        if (kVar != null) {
            a(kVar);
            this.f881a = null;
        }
        r rVar = this.f882a;
        if (rVar != null) {
            a(rVar);
            this.f882a = null;
        }
        a aVar = this.f879a;
        if (aVar != null) {
            a(aVar);
            this.f879a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f873a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f873a);
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.d("unregister super-power-mode err:" + th2.getMessage());
            }
        }
        this.f890a.clear();
        this.f887a.m6289b();
        a(new ck(this, 2));
        a(new l());
        bg.a().b();
        bg.a().a(this, 15);
        bg.a().m6256a();
        this.f875a.b(this);
        bv.a().m6270a();
        et.a();
        i();
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.b.m5639a("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i11) {
        i iVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.b.d("onStart() with intent NULL");
        } else {
            try {
                com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), intent.getStringExtra(bk.f46319t), intent.getStringExtra(bk.B), intent.getStringExtra("mipush_app_package")));
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.d("onStart() cause error: " + th2.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f887a.m6287a()) {
                    com.xiaomi.channel.commonutils.logger.b.d("ERROR, the job controller is blocked.");
                    bg.a().a(this, 14);
                    stopSelf();
                } else {
                    iVar = new i(intent);
                    a(iVar);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                if (Constants.VIA_REPORT_TYPE_SHARE_TO_QQ.equals(intent.getStringExtra("ext_chid"))) {
                    intent.putExtra("rx_msg", System.currentTimeMillis());
                    intent.putExtra("screen_on", com.xiaomi.push.t.a(getApplicationContext()));
                    intent.putExtra("wifi", com.xiaomi.push.bi.e(getApplicationContext()));
                }
                iVar = new i(intent);
                a(iVar);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.b.c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        onStart(intent, i12);
        return 1;
    }

    private String b() {
        String str;
        com.xiaomi.push.ap.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i11 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            bn a11 = bn.a(this);
            String str2 = null;
            while (true) {
                if (!TextUtils.isEmpty(str2) && a11.a() != 0) {
                    str = a();
                    break;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = a();
                }
                try {
                    synchronized (obj) {
                        if (i11 < 30) {
                            try {
                                obj.wait(1000L);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i11++;
            }
        } else {
            str = "CN";
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("wait coutrycode :" + str + " cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " , count = " + i11);
        return str;
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(bk.B);
        String stringExtra2 = intent.getStringExtra(bk.F);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        gl[] glVarArr = new gl[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i11 = 0; i11 < parcelableArrayExtra.length; i11++) {
            gl glVar = new gl((Bundle) parcelableArrayExtra[i11]);
            glVarArr[i11] = glVar;
            gl glVar2 = (gl) a(glVar, stringExtra, stringExtra2);
            glVarArr[i11] = glVar2;
            if (glVar2 == null) {
                return;
            }
        }
        bg a11 = bg.a();
        fk[] fkVarArr = new fk[length];
        for (int i12 = 0; i12 < length; i12++) {
            gl glVar3 = glVarArr[i12];
            fkVarArr[i12] = fk.a(glVar3, a11.a(glVar3.k(), glVar3.m()).f46287h);
        }
        c(new com.xiaomi.push.service.c(this, fkVarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 2303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.d(android.content.Intent):void");
    }

    private void e(Intent intent) {
        int i11;
        try {
            ec.a(getApplicationContext()).a(new bm());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra == null) {
                return;
            }
            ig igVar = new ig();
            ir.a(igVar, byteArrayExtra);
            String b11 = igVar.b();
            Map<String, String> m6101a = igVar.m6101a();
            if (m6101a != null) {
                String str = m6101a.get("extra_help_aw_info");
                String str2 = m6101a.get("extra_aw_app_online_cmd");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    i11 = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                    i11 = 0;
                }
                int i12 = i11;
                if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(b11) || TextUtils.isEmpty(str)) {
                    return;
                }
                ec.a(getApplicationContext()).a(this, str, i12, stringExtra, b11);
            }
        } catch (ix e11) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_logic: translate fail. " + e11.getMessage());
        }
    }

    /* renamed from: f, reason: collision with other method in class */
    private boolean m6202f() {
        if (SystemClock.elapsedRealtime() - this.f872a < 30000) {
            return false;
        }
        return com.xiaomi.push.bi.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: collision with other method in class */
    public boolean m6203g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* renamed from: h, reason: collision with other method in class */
    private boolean m6204h() {
        if (!"com.xiaomi.xmsf".equals(getPackageName())) {
            return !v.a(this).m6302b(getPackageName());
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("current sdk expect region is cn");
        return com.xiaomi.push.n.China.name().equals(com.xiaomi.push.service.a.a(getApplicationContext()).a());
    }

    /* renamed from: i, reason: collision with other method in class */
    private boolean m6205i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && j() && !com.xiaomi.push.i.m6071b((Context) this) && !com.xiaomi.push.i.m6069a(getApplicationContext());
    }

    private void c(j jVar) {
        this.f887a.a(jVar);
    }

    /* renamed from: e, reason: collision with other method in class */
    public static boolean m6201e() {
        return f46201b;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m6212b() {
        com.xiaomi.push.service.o.a(getApplicationContext()).m6285d();
        Iterator it = new ArrayList(this.f889a).iterator();
        while (it.hasNext()) {
            ((n) it.next()).mo6008a();
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m6215d() {
        fv fvVar = this.f876a;
        return fvVar != null && fvVar.m5969b();
    }

    private void b(Intent intent) {
        long j11;
        String str;
        fk fkVar;
        String stringExtra = intent.getStringExtra(bk.B);
        String stringExtra2 = intent.getStringExtra(bk.F);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        bg a11 = bg.a();
        if (bundleExtra != null) {
            gl glVar = (gl) a(new gl(bundleExtra), stringExtra, stringExtra2);
            if (glVar == null) {
                return;
            } else {
                fkVar = fk.a(glVar, a11.a(glVar.k(), glVar.m()).f46287h);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j11 = Long.parseLong(intent.getStringExtra(bk.f46316q));
                } catch (NumberFormatException unused) {
                    j11 = 0;
                }
                String stringExtra3 = intent.getStringExtra(bk.f46317r);
                String stringExtra4 = intent.getStringExtra(bk.f46318s);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                bg.b a12 = a11.a(stringExtra5, String.valueOf(j11));
                if (a12 != null) {
                    fk fkVar2 = new fk();
                    if (Constants.VIA_REPORT_TYPE_SHARE_TO_QQ.equals(stringExtra5)) {
                        fkVar2.b(Integer.parseInt(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ));
                        fkVar2.f405a.f931a = intent.getBooleanExtra("screen_on", true);
                        fkVar2.f405a.f933b = intent.getBooleanExtra("wifi", true);
                        str = stringExtra3;
                        fkVar2.f405a.f930a = intent.getLongExtra("rx_msg", -1L);
                        fkVar2.f405a.f932b = intent.getLongExtra("enqueue", -1L);
                        fkVar2.f405a.f46246b = intent.getIntExtra("num", -1);
                        fkVar2.f405a.f46247c = intent.getLongExtra("run", -1L);
                    } else {
                        str = stringExtra3;
                    }
                    try {
                        fkVar2.a(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    fkVar2.a("SECMSG", (String) null);
                    fkVar2.a(j11, TextUtils.isEmpty(str) ? "xiaomi.com" : str, stringExtra4);
                    fkVar2.a(intent.getStringExtra("ext_pkt_id"));
                    fkVar2.a(byteArrayExtra, a12.f46287h);
                    com.xiaomi.channel.commonutils.logger.b.m5639a("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    fkVar = fkVar2;
                }
            }
            fkVar = null;
        }
        if (fkVar != null) {
            c(new bt(this, fkVar));
        }
    }

    private gm a(gm gmVar, String str, String str2) {
        StringBuilder sb2;
        String str3;
        bg a11 = bg.a();
        List<String> m6255a = a11.m6255a(str);
        if (m6255a.isEmpty()) {
            sb2 = new StringBuilder();
            str3 = "open channel should be called first before sending a packet, pkg=";
        } else {
            gmVar.o(str);
            str = gmVar.k();
            if (TextUtils.isEmpty(str)) {
                str = m6255a.get(0);
                gmVar.l(str);
            }
            bg.b a12 = a11.a(str, gmVar.m());
            if (!m6214c()) {
                sb2 = new StringBuilder();
                str3 = "drop a packet as the channel is not connected, chid=";
            } else {
                if (a12 != null && a12.f963a == bg.c.binded) {
                    if (TextUtils.equals(str2, a12.f46288i)) {
                        return gmVar;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("invalid session. ");
                    sb2.append(str2);
                    com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
                    return null;
                }
                sb2 = new StringBuilder();
                str3 = "drop a packet as the channel is not opened, chid=";
            }
        }
        sb2.append(str3);
        sb2.append(str);
        com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
        return null;
    }

    private void c(boolean z11) {
        try {
            if (com.xiaomi.push.s.m6185a()) {
                if (!z11) {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
                    return;
                }
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (ar arVar : (ar[]) this.f890a.toArray(new ar[0])) {
                    arVar.mo6272a();
                }
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
        }
    }

    @Override // com.xiaomi.push.fy
    public void b(fv fvVar) {
        fg.a().b(fvVar);
        c(true);
        this.f885a.m6264a();
        if (!et.m5927a() && !m6205i()) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("reconnection successful, reactivate alarm.");
            et.a(true);
        }
        Iterator<bg.b> it = bg.a().m6253a().iterator();
        while (it.hasNext()) {
            a(new b(it.next()));
        }
        if (this.f891a || !com.xiaomi.push.j.m6172a(getApplicationContext())) {
            return;
        }
        com.xiaomi.push.aj.a(getApplicationContext()).a(new cm(this));
    }

    public void b(j jVar) {
        this.f887a.a(jVar.f46384a, jVar);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6214c() {
        fv fvVar = this.f876a;
        return fvVar != null && fvVar.m5970c();
    }

    private bg.b a(String str, Intent intent) {
        bg.b a11 = bg.a().a(str, intent.getStringExtra(bk.f46316q));
        if (a11 == null) {
            a11 = new bg.b(this);
        }
        a11.f46286g = intent.getStringExtra(bk.f46319t);
        a11.f968b = intent.getStringExtra(bk.f46316q);
        a11.f46282c = intent.getStringExtra(bk.f46321v);
        a11.f965a = intent.getStringExtra(bk.B);
        a11.f46284e = intent.getStringExtra(bk.f46325z);
        a11.f46285f = intent.getStringExtra(bk.A);
        a11.f967a = intent.getBooleanExtra(bk.f46324y, false);
        a11.f46287h = intent.getStringExtra(bk.f46323x);
        a11.f46288i = intent.getStringExtra(bk.F);
        a11.f46283d = intent.getStringExtra(bk.f46322w);
        a11.f964a = this.f886a;
        a11.a((Messenger) intent.getParcelableExtra(bk.J));
        a11.f957a = getApplicationContext();
        bg.a().a(a11);
        return a11;
    }

    private void b(boolean z11) {
        this.f872a = SystemClock.elapsedRealtime();
        if (!m6214c()) {
            a(true);
        } else if (com.xiaomi.push.bi.b(this)) {
            c(new o(z11));
        } else {
            c(new g(17, null));
            a(true);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public com.xiaomi.push.service.j m6207a() {
        return new com.xiaomi.push.service.j();
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6213b() {
        try {
            Class<?> a11 = com.xiaomi.push.s.a(this, "miui.os.Build");
            Field field = a11.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = a11.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = a11.getField("IS_CT_CUSTOMIZATION_TEST");
            if (!field.getBoolean(null) && !field2.getBoolean(null)) {
                if (!field3.getBoolean(null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private String a() {
        String m6169a = com.xiaomi.push.j.m6169a("ro.miui.region");
        return TextUtils.isEmpty(m6169a) ? com.xiaomi.push.j.m6169a("ro.product.locale.region") : m6169a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6208a() {
        if (SystemClock.elapsedRealtime() - this.f872a >= gb.a() && com.xiaomi.push.bi.d(this)) {
            b(true);
        }
    }

    public void a(int i11) {
        this.f887a.a(i11);
    }

    public void a(int i11, Exception exc) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("disconnect ");
        sb2.append(hashCode());
        sb2.append(j2.O);
        fv fvVar = this.f876a;
        sb2.append(fvVar == null ? null : Integer.valueOf(fvVar.hashCode()));
        com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
        fv fvVar2 = this.f876a;
        if (fvVar2 != null) {
            fvVar2.b(i11, exc);
            this.f876a = null;
        }
        a(7);
        a(4);
        bg.a().a(this, i11);
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        com.xiaomi.push.service.o.a(getApplicationContext()).m6282a(extras.getString("digest"));
    }

    private void a(Intent intent, int i11) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        ig igVar = new ig();
        try {
            ir.a(igVar, byteArrayExtra);
            com.xiaomi.push.aj.a(getApplicationContext()).a((aj.a) new com.xiaomi.push.service.b(igVar, new WeakReference(this), booleanExtra), i11);
        } catch (ix unused) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_ping : send help app ping  error");
        }
    }

    public void a(fk fkVar) {
        fv fvVar = this.f876a;
        if (fvVar == null) {
            throw new gg("try send msg while connection is null.");
        }
        fvVar.b(fkVar);
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar) {
        com.xiaomi.channel.commonutils.logger.b.c("begin to connect...");
        fg.a().a(fvVar);
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar, int i11, Exception exc) {
        fg.a().a(fvVar, i11, exc);
        if (m6205i()) {
            return;
        }
        a(false);
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar, Exception exc) {
        fg.a().a(fvVar, exc);
        c(false);
        if (m6205i()) {
            return;
        }
        a(false);
    }

    public void a(j jVar) {
        a(jVar, 0L);
    }

    public void a(j jVar, long j11) {
        try {
            this.f887a.a(jVar, j11);
        } catch (IllegalStateException e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("can't execute job err = " + e11.getMessage());
        }
    }

    public void a(n nVar) {
        synchronized (this.f889a) {
            this.f889a.add(nVar);
        }
    }

    public void a(bg.b bVar) {
        if (bVar != null) {
            long a11 = bVar.a();
            com.xiaomi.channel.commonutils.logger.b.m5639a("schedule rebind job in " + (a11 / 1000));
            a(new b(bVar), a11);
        }
    }

    private static void a(String str) {
        if (com.xiaomi.push.n.China.name().equals(str)) {
            com.xiaomi.push.cu.a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            com.xiaomi.push.cu.a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            com.xiaomi.push.cu.a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            com.xiaomi.push.cu.a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            com.xiaomi.push.cu.a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            com.xiaomi.push.cu.a("resolver.msg.xiaomi.net", "111.13.142.153:443");
            com.xiaomi.push.cu.a("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    private void a(String str, int i11) {
        int i12;
        Collection<bg.b> m6254a = bg.a().m6254a(str);
        if (m6254a != null) {
            for (bg.b bVar : m6254a) {
                if (bVar != null) {
                    i12 = i11;
                    a(new s(bVar, i12, null, null));
                } else {
                    i12 = i11;
                }
                i11 = i12;
            }
        }
        bg.a().m6257a(str);
    }

    public void a(String str, String str2, int i11, String str3, String str4) {
        bg.b a11 = bg.a().a(str, str2);
        if (a11 != null) {
            a(new s(a11, i11, str4, str3));
        }
        bg.a().m6258a(str, str2);
    }

    public void a(String str, byte[] bArr, boolean z11) {
        Collection<bg.b> m6254a = bg.a().m6254a("5");
        if (m6254a.isEmpty()) {
            if (z11) {
                x.b(str, bArr);
            }
        } else if (m6254a.iterator().next().f963a == bg.c.binded) {
            a(new cj(this, 4, str, bArr));
        } else if (z11) {
            x.b(str, bArr);
        }
    }

    public void a(boolean z11) {
        this.f885a.a(z11);
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            x.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            com.xiaomi.channel.commonutils.logger.b.m5639a("register request without payload");
            return;
        }
        id idVar = new id();
        try {
            ir.a(idVar, bArr);
            if (idVar.f661a == hh.Registration) {
                ih ihVar = new ih();
                try {
                    ir.a(ihVar, idVar.m6091a());
                    a(new w(this, idVar.b(), ihVar.b(), ihVar.c(), bArr));
                    en.a(getApplicationContext()).a(idVar.b(), "E100003", ihVar.a(), 6002, null);
                } catch (ix e11) {
                    com.xiaomi.channel.commonutils.logger.b.d("app register error. " + e11);
                    x.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                x.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                com.xiaomi.channel.commonutils.logger.b.m5639a("register request with invalid payload");
            }
        } catch (ix e12) {
            com.xiaomi.channel.commonutils.logger.b.d("app register fail. " + e12);
            x.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    public void a(fk[] fkVarArr) {
        fv fvVar = this.f876a;
        if (fvVar == null) {
            throw new gg("try send msg while connection is null.");
        }
        fvVar.a(fkVarArr);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6209a() {
        boolean b11 = com.xiaomi.push.bi.b(this);
        boolean z11 = false;
        boolean z12 = bg.a().m6252a() > 0;
        boolean m6213b = m6213b();
        boolean z13 = !m6213b;
        boolean m6204h = m6204h();
        boolean m6203g = m6203g();
        boolean z14 = !m6203g;
        if (b11 && z12 && !m6213b && m6204h && !m6203g) {
            z11 = true;
        }
        if (!z11) {
            com.xiaomi.channel.commonutils.logger.b.e(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(b11), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(m6204h), Boolean.valueOf(z14)));
        }
        return z11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6210a(int i11) {
        return this.f887a.m6288a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            com.xiaomi.push.ap.a();
            for (int i11 = 100; i11 > 0; i11--) {
                if (com.xiaomi.push.bi.c(context)) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m6198a(String str, Intent intent) {
        bg.b a11 = bg.a().a(str, intent.getStringExtra(bk.f46316q));
        boolean z11 = false;
        if (a11 != null && str != null) {
            String stringExtra = intent.getStringExtra(bk.F);
            String stringExtra2 = intent.getStringExtra(bk.f46323x);
            if (!TextUtils.isEmpty(a11.f46288i) && !TextUtils.equals(stringExtra, a11.f46288i)) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("session changed. old session=" + a11.f46288i + ", new session=" + stringExtra + " chid = " + str);
                z11 = true;
            }
            if (!stringExtra2.equals(a11.f46287h)) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("security changed. chid = " + str + " sechash = " + com.xiaomi.push.bn.a(stringExtra2));
                return true;
            }
        }
        return z11;
    }

    /* renamed from: a, reason: collision with other method in class */
    private int[] m6199a() {
        String[] split;
        String a11 = ba.a(getApplicationContext()).a(hm.FallDownTimeRange.a(), "");
        if (!TextUtils.isEmpty(a11) && (split = a11.split(",")) != null && split.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(split[0]).intValue();
                int intValue = Integer.valueOf(split[1]).intValue();
                iArr[1] = intValue;
                int i11 = iArr[0];
                if (i11 >= 0 && i11 <= 23 && intValue >= 0 && intValue <= 23 && i11 != intValue) {
                    return iArr;
                }
            } catch (NumberFormatException e11) {
                com.xiaomi.channel.commonutils.logger.b.d("parse falldown time range failure: " + e11);
            }
        }
        return null;
    }
}
