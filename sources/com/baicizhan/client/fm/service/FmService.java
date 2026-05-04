package com.baicizhan.client.fm.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.util.n;
import androidx.media3.common.util.o;
import com.baicizhan.client.business.media.update.MediaUpdatorService;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import com.baicizhan.client.fm.data.FmList;
import com.baicizhan.client.fm.data.FmMidList;
import com.baicizhan.client.fm.data.NotifyInfo;
import com.baicizhan.client.fm.data.load.FmLoader;
import com.baicizhan.client.fm.data.load.FmLoaderCreator;
import com.baicizhan.client.fm.data.update.FmUpdatorService;
import com.baicizhan.client.fm.service.a;
import com.baicizhan.client.fm.service.b;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q9.x;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmService extends Service {
    public static final int A = 12;
    public static final int B = 13;
    public static final int C = 14;
    public static final int D = 15;
    public static final String E = "bcz_fm_01";
    public static final String F = "bcz_fm_02";
    public static final int G = (FmService.class.getName().length() * 100) + 1;

    /* renamed from: j, reason: collision with root package name */
    public static final String f17427j = "FmService";

    /* renamed from: k, reason: collision with root package name */
    public static final int f17428k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17429l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17430m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17431n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17432o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17433p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f17434q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f17435r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final int f17436s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final int f17437t = 5;

    /* renamed from: u, reason: collision with root package name */
    public static final int f17438u = 6;

    /* renamed from: v, reason: collision with root package name */
    public static final int f17439v = 7;

    /* renamed from: w, reason: collision with root package name */
    public static final int f17440w = 8;

    /* renamed from: x, reason: collision with root package name */
    public static final int f17441x = 9;

    /* renamed from: y, reason: collision with root package name */
    public static final int f17442y = 10;

    /* renamed from: z, reason: collision with root package name */
    public static final int f17443z = 11;

    /* renamed from: c, reason: collision with root package name */
    public List<String> f17446c;

    /* renamed from: d, reason: collision with root package name */
    public List<String> f17447d;

    /* renamed from: e, reason: collision with root package name */
    public com.baicizhan.client.fm.service.a f17448e;

    /* renamed from: g, reason: collision with root package name */
    public h f17450g;

    /* renamed from: i, reason: collision with root package name */
    public d f17452i;

    /* renamed from: a, reason: collision with root package name */
    public final RemoteCallbackList<com.baicizhan.client.fm.service.c> f17444a = new RemoteCallbackList<>();

    /* renamed from: b, reason: collision with root package name */
    public int f17445b = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f17449f = -1;

    /* renamed from: h, reason: collision with root package name */
    public final b.AbstractBinderC0277b f17451h = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends b.AbstractBinderC0277b {
        public a() {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void I(int index) throws RemoteException {
            qb.c.b(FmService.f17427j, "new play in service, index: " + index + "; player: " + FmService.this.f17448e, new Object[0]);
            FmService.this.o0(index);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void M() throws RemoteException {
            FmService.this.w0();
        }

        @Override // com.baicizhan.client.fm.service.b
        public void N(com.baicizhan.client.fm.service.c callback) throws RemoteException {
            qb.c.b(FmService.f17427j, "launch fm service, state: " + FmService.this.f17449f + "; callback: " + callback, new Object[0]);
            FmService.this.n0(callback);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void P(boolean high) throws RemoteException {
            FmService.this.x0(high);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void b0(com.baicizhan.client.fm.service.c callback) throws RemoteException {
            FmService.this.m0(callback);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void d(String absPath) throws RemoteException {
            FmService.this.q0(absPath);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void d0() throws RemoteException {
            FmService.this.u0();
        }

        @Override // com.baicizhan.client.fm.service.b
        public void f0() throws RemoteException {
            FmService.this.y0();
        }

        @Override // com.baicizhan.client.fm.service.b
        public void k0(String notifyJson) throws RemoteException {
            FmService.this.r0(notifyJson);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void pause() throws RemoteException {
            FmService.this.s0();
        }

        @Override // com.baicizhan.client.fm.service.b
        public void play() throws RemoteException {
            FmService.this.t0();
        }

        @Override // com.baicizhan.client.fm.service.b
        public void r0(int index) throws RemoteException {
            FmService.this.p0(index);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void stop() throws RemoteException {
            FmService.this.A0();
        }

        @Override // com.baicizhan.client.fm.service.b
        public void t0(int limit) throws RemoteException {
            FmService.this.z0(limit);
        }

        @Override // com.baicizhan.client.fm.service.b
        public void toggle() {
            FmService.this.B0();
        }

        @Override // com.baicizhan.client.fm.service.b
        public void u0() throws RemoteException {
            FmService.this.v0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements qb0.c<FmLoaderCreator.FmMetaData> {
        public c() {
        }

        @Override // qb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(FmLoaderCreator.FmMetaData fmMetaData) {
            FmService.this.i0(fmMetaData);
        }

        @Override // qb0.c
        public void onCompleted() {
            MediaUpdatorService.b(FmService.this);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            FmService.this.f17449f = 2;
            FmService fmService = FmService.this;
            fmService.j0(false, fmService.f17446c, FmService.this.f17447d, -3);
            qb.c.c(FmService.f17427j, "create fm loader failed.", e11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<FmService> f17456a;

        public d(FmService service) {
            this.f17456a = new WeakReference<>(service);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            FmService fmService = this.f17456a.get();
            if (fmService == null) {
                return;
            }
            switch (msg.what) {
                case 0:
                    fmService.S(msg);
                    break;
                case 1:
                    fmService.R(msg);
                    break;
                case 2:
                    fmService.T(msg);
                    break;
                case 3:
                    fmService.U(msg);
                    break;
                case 4:
                    fmService.V(msg);
                    break;
                case 5:
                    fmService.Y(msg);
                    break;
                case 6:
                    fmService.a0(msg);
                    break;
                case 7:
                    fmService.b0(msg);
                    break;
                case 8:
                    fmService.X(msg);
                    break;
                case 9:
                    fmService.f0(msg);
                    break;
                case 10:
                    fmService.g0(msg);
                    break;
                case 11:
                    fmService.c0(msg);
                    break;
                case 12:
                    fmService.Z(msg);
                    break;
                case 13:
                    fmService.e0(msg);
                    break;
                case 14:
                    fmService.W(msg);
                    break;
                case 15:
                    fmService.d0(msg);
                    break;
            }
        }
    }

    public static int N(int errCode) {
        switch (errCode) {
            case -8:
                return -8;
            case -7:
                return -7;
            case -6:
                return -6;
            case -5:
                return -5;
            case -4:
                return -4;
            case -3:
                return -3;
            case -2:
                return -2;
            case -1:
                return -1;
            default:
                return 0;
        }
    }

    public final void A0() {
        this.f17452i.sendEmptyMessage(9);
    }

    public final void B0() {
        this.f17452i.sendEmptyMessage(10);
    }

    public final void C0(FmList updateList) {
        h hVar = this.f17450g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f17450g.unsubscribe();
        }
        this.f17450g = FmLoaderCreator.updateAndCreate(this, x.r().l(), updateList, 12).I3(tb0.a.a()).q5(new c());
    }

    public final void O() {
        h hVar = this.f17450g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f17450g.unsubscribe();
        }
        this.f17450g = FmLoaderCreator.create(this, x.r().l(), 12).I3(tb0.a.a()).q5(new b());
    }

    @TargetApi(26)
    public final void P(Context context, NotificationManager notificationManager) {
        NotificationChannel notificationChannel;
        notificationChannel = notificationManager.getNotificationChannel(E);
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel(E);
        }
        o.a();
        NotificationChannel a11 = n.a(F, context.getString(R.string.notify_channel_word_tm_title), 3);
        a11.enableLights(false);
        a11.enableVibration(false);
        a11.setLockscreenVisibility(1);
        a11.setShowBadge(true);
        a11.setBypassDnd(true);
        a11.setSound(null, null);
        notificationManager.createNotificationChannel(a11);
    }

    public final void Q() {
        FmLoader<FmList> l11;
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar == null || (l11 = aVar.l()) == null) {
            return;
        }
        FmUpdatorService.start(this, l11.getTargets());
    }

    public final void R(Message msg) {
        com.baicizhan.client.fm.service.c cVar = (com.baicizhan.client.fm.service.c) msg.obj;
        if (cVar != null) {
            this.f17444a.unregister(cVar);
            this.f17445b--;
            qb.c.i(f17427j, "close failed test, callback count-- thread: " + Thread.currentThread() + "; count: " + this.f17445b, new Object[0]);
        }
        if (this.f17445b == 0) {
            stopSelf();
        } else {
            stopSelf();
            qb.c.i(f17427j, "fm service callbacks is not empty, count is [%d]", Integer.valueOf(this.f17445b));
        }
    }

    public final void S(Message msg) {
        com.baicizhan.client.fm.service.c cVar = (com.baicizhan.client.fm.service.c) msg.obj;
        if (cVar != null) {
            this.f17444a.register(cVar);
            this.f17445b++;
            qb.c.i(f17427j, "close failed test, callback count++ thread: " + Thread.currentThread() + "; count: " + this.f17445b, new Object[0]);
        }
        int i11 = this.f17449f;
        if (i11 != 0) {
            if (i11 != 1) {
                this.f17449f = 0;
                O();
                qb.c.i(f17427j, "get fm list, start create fm loader creator from service.", new Object[0]);
            } else {
                j0(true, this.f17446c, this.f17447d, 0);
                com.baicizhan.client.fm.service.a aVar = this.f17448e;
                if (aVar != null) {
                    aVar.w();
                }
            }
        }
    }

    public final void T(Message msg) {
        int i11 = msg.arg1;
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.q(i11);
        }
    }

    public final void U(Message msg) {
        int i11 = msg.arg1;
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.s(i11);
        }
    }

    public final void V(Message msg) {
        String str = (String) msg.obj;
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.r(str);
        }
    }

    public final void W(Message msg) {
        startForeground(G, h0((String) msg.obj));
    }

    public final void X(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.z();
        }
    }

    public final void Y(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.A();
        }
    }

    public final void Z(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            FmLoader<FmList> l11 = aVar.l();
            if (l11 != null) {
                FmList targets = l11.getTargets();
                if (targets != null) {
                    for (int i11 = 0; i11 < targets.size(); i11++) {
                        targets.get(i11).accumViewed();
                    }
                }
                C0(l11.getTargets());
            }
            this.f17448e.i();
        }
    }

    public final void a0(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.B();
        }
    }

    public final void b0(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.C();
        }
    }

    public final void c0(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.p(msg.arg1 != 0);
        }
    }

    public final void d0(Message msg) {
        O();
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.i();
        }
    }

    public final void e0(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.D(msg.arg1);
        }
    }

    public final void f0(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.F();
        }
    }

    public final void g0(Message msg) {
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.G();
        }
    }

    public final Notification h0(String notifyJson) {
        Class cls;
        NotificationCompat.Builder builder;
        NotifyInfo fromJson = NotifyInfo.fromJson(notifyJson);
        try {
            cls = Class.forName(fromJson.targetActivityName);
        } catch (ClassNotFoundException e11) {
            qb.c.c(f17427j, "set fm service notify target failed.", e11);
            cls = AudioCenterActivity.class;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) cls);
        intent.setFlags(603979776);
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 335544320);
        if (i11 >= 26) {
            Object systemService = getSystemService("notification");
            Objects.requireNonNull(systemService);
            P(this, (NotificationManager) systemService);
            builder = new NotificationCompat.Builder(this, F);
        } else {
            builder = new NotificationCompat.Builder(this);
        }
        builder.setSmallIcon(fromJson.smallIcon).setLargeIcon(BitmapFactory.decodeResource(getResources(), fromJson.largeIcon)).setContentTitle(fromJson.contentTitle).setContentText(fromJson.contentText).setTicker(fromJson.ticker).setContentIntent(activity);
        return builder.build();
    }

    public final void i0(FmLoaderCreator.FmMetaData fmMetaData) {
        int i11 = fmMetaData.errCode;
        boolean z11 = i11 != -3;
        int N = N(i11);
        if (-1 == N) {
            FmLoader<FmList> fmLoader = fmMetaData.fmloader;
            if (fmLoader != null) {
                fmLoader.extractOfflineFms();
            }
            FmLoader<FmMidList> fmLoader2 = fmMetaData.midloader;
            if (fmLoader2 != null) {
                fmLoader2.extractOfflineFms();
            }
        }
        FmLoader<FmList> fmLoader3 = fmMetaData.fmloader;
        if (fmLoader3 != null && fmLoader3.getTargets() != null) {
            FmList targets = fmMetaData.fmloader.getTargets();
            int size = targets.size();
            this.f17446c = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                this.f17446c.add(targets.get(i12).getWordid());
            }
        }
        FmLoader<FmMidList> fmLoader4 = fmMetaData.midloader;
        if (fmLoader4 != null && fmLoader4.getTargets() != null) {
            FmMidList targets2 = fmMetaData.midloader.getTargets();
            int size2 = targets2.size();
            this.f17447d = new ArrayList(size2);
            for (int i13 = 0; i13 < size2; i13++) {
                this.f17447d.add(targets2.getSavedPath(i13, false));
            }
        }
        qb.c.b(f17427j, "launch fm service complete, success: " + z11 + "; err code: " + fmMetaData.errCode + "; fmlist: " + this.f17446c + "; midlist: " + this.f17447d, new Object[0]);
        qb.c.i(f17427j, "get fm list, fm loader created, success [%b], err code [%s]", Boolean.valueOf(z11), Integer.valueOf(fmMetaData.errCode));
        if (z11) {
            this.f17449f = 1;
            this.f17448e = new a.b().e(this).b(fmMetaData.fmloader).c(fmMetaData.midloader).d(N).a();
        } else {
            this.f17449f = 2;
        }
        j0(z11, this.f17446c, this.f17447d, N);
    }

    public final void j0(boolean success, List<String> wordids, List<String> midPaths, int errCode) {
        qb.c.b(f17427j, "launch fm service callback start 0", new Object[0]);
        int beginBroadcast = this.f17444a.beginBroadcast();
        for (int i11 = 0; i11 < beginBroadcast; i11++) {
            try {
                qb.c.b(f17427j, "launch fm service callback, item: " + i11 + "; mid paths: " + midPaths, new Object[0]);
                this.f17444a.getBroadcastItem(i11).Q(success, wordids, midPaths, errCode);
            } catch (RemoteException unused) {
            }
        }
        this.f17444a.finishBroadcast();
    }

    public void k0(int limit, List<String> wordids, List<String> midPaths) {
        qb.c.b(f17427j, "launch fm service callback start 1", new Object[0]);
        int beginBroadcast = this.f17444a.beginBroadcast();
        for (int i11 = 0; i11 < beginBroadcast; i11++) {
            try {
                this.f17444a.getBroadcastItem(i11).e(limit, wordids, midPaths);
            } catch (RemoteException unused) {
            }
        }
        this.f17444a.finishBroadcast();
    }

    public void l0(int state, int curIndex, int type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("launch fm service callback start 2, main thread? ");
        sb2.append(Looper.getMainLooper() == Looper.myLooper());
        qb.c.b(f17427j, sb2.toString(), new Object[0]);
        int beginBroadcast = this.f17444a.beginBroadcast();
        for (int i11 = 0; i11 < beginBroadcast; i11++) {
            try {
                this.f17444a.getBroadcastItem(i11).E(state, curIndex, type);
            } catch (RemoteException unused) {
            }
        }
        this.f17444a.finishBroadcast();
    }

    public final void m0(com.baicizhan.client.fm.service.c callback) {
        Message obtainMessage = this.f17452i.obtainMessage(1);
        obtainMessage.obj = callback;
        this.f17452i.sendMessage(obtainMessage);
    }

    public final void n0(com.baicizhan.client.fm.service.c callback) {
        Message obtainMessage = this.f17452i.obtainMessage(0);
        obtainMessage.obj = callback;
        this.f17452i.sendMessage(obtainMessage);
    }

    public final void o0(int index) {
        Message obtainMessage = this.f17452i.obtainMessage(2);
        obtainMessage.arg1 = index;
        this.f17452i.sendMessage(obtainMessage);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f17451h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f17452i = new d(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        qb.c.i(f17427j, "get fm list, fm service is destroyed.", new Object[0]);
        stopForeground(true);
        this.f17444a.kill();
        Q();
        com.baicizhan.client.fm.service.a aVar = this.f17448e;
        if (aVar != null) {
            aVar.i();
        }
        h hVar = this.f17450g;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f17450g.unsubscribe();
    }

    public final void p0(int index) {
        Message obtainMessage = this.f17452i.obtainMessage(3);
        obtainMessage.arg1 = index;
        this.f17452i.sendMessage(obtainMessage);
    }

    public final void q0(String absPath) {
        Message obtainMessage = this.f17452i.obtainMessage(4);
        obtainMessage.obj = absPath;
        this.f17452i.sendMessage(obtainMessage);
    }

    public final void r0(String notifyJson) {
        Message obtainMessage = this.f17452i.obtainMessage(14);
        obtainMessage.obj = notifyJson;
        this.f17452i.sendMessage(obtainMessage);
    }

    public final void s0() {
        this.f17452i.sendEmptyMessage(8);
    }

    public final void t0() {
        this.f17452i.sendEmptyMessage(5);
    }

    public final void u0() {
        this.f17452i.sendEmptyMessage(12);
    }

    public final void v0() {
        this.f17452i.sendEmptyMessage(6);
    }

    public final void w0() {
        this.f17452i.sendEmptyMessage(7);
    }

    public final void x0(boolean z11) {
        Message obtainMessage = this.f17452i.obtainMessage(11);
        obtainMessage.arg1 = z11 ? 1 : 0;
        this.f17452i.sendMessage(obtainMessage);
    }

    public final void y0() {
        this.f17452i.sendEmptyMessage(15);
    }

    public final void z0(int limit) {
        Message obtainMessage = this.f17452i.obtainMessage(13);
        obtainMessage.arg1 = limit;
        this.f17452i.sendMessage(obtainMessage);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements qb0.c<FmLoaderCreator.FmMetaData> {
        public b() {
        }

        @Override // qb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(FmLoaderCreator.FmMetaData fmMetaData) {
            FmService.this.i0(fmMetaData);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            FmService.this.f17449f = 2;
            FmService fmService = FmService.this;
            fmService.j0(false, fmService.f17446c, FmService.this.f17447d, -3);
            qb.c.c(FmService.f17427j, "create fm loader failed.", e11);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
