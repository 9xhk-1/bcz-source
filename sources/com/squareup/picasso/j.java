package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.igexin.sdk.PushConsts;
import com.squareup.picasso.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j {
    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 10;
    public static final int D = 11;
    public static final int E = 12;
    public static final int F = 13;
    public static final String G = "Dispatcher";
    public static final int H = 200;

    /* renamed from: q, reason: collision with root package name */
    public static final int f41888q = 500;

    /* renamed from: r, reason: collision with root package name */
    public static final int f41889r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f41890s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f41891t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f41892u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f41893v = 3;

    /* renamed from: w, reason: collision with root package name */
    public static final int f41894w = 4;

    /* renamed from: x, reason: collision with root package name */
    public static final int f41895x = 5;

    /* renamed from: y, reason: collision with root package name */
    public static final int f41896y = 6;

    /* renamed from: z, reason: collision with root package name */
    public static final int f41897z = 7;

    /* renamed from: a, reason: collision with root package name */
    public final c f41898a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f41899b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f41900c;

    /* renamed from: d, reason: collision with root package name */
    public final k f41901d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, com.squareup.picasso.c> f41902e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Object, com.squareup.picasso.a> f41903f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<Object, com.squareup.picasso.a> f41904g;

    /* renamed from: h, reason: collision with root package name */
    public final Set<Object> f41905h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f41906i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f41907j;

    /* renamed from: k, reason: collision with root package name */
    public final e f41908k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f41909l;

    /* renamed from: m, reason: collision with root package name */
    public final List<com.squareup.picasso.c> f41910m;

    /* renamed from: n, reason: collision with root package name */
    public final d f41911n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f41912o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f41913p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f41911n.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final j f41915a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f41916a;

            public a(Message message) {
                this.f41916a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f41916a.what);
            }
        }

        public b(Looper looper, j jVar) {
            super(looper);
            this.f41915a = jVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f41915a.x((com.squareup.picasso.a) message.obj);
                    break;
                case 2:
                    this.f41915a.q((com.squareup.picasso.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    Picasso.f41724q.post(new a(message));
                    break;
                case 4:
                    this.f41915a.r((com.squareup.picasso.c) message.obj);
                    break;
                case 5:
                    this.f41915a.w((com.squareup.picasso.c) message.obj);
                    break;
                case 6:
                    this.f41915a.s((com.squareup.picasso.c) message.obj, false);
                    break;
                case 7:
                    this.f41915a.p();
                    break;
                case 9:
                    this.f41915a.t((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f41915a.o(message.arg1 == 1);
                    break;
                case 11:
                    this.f41915a.u(message.obj);
                    break;
                case 12:
                    this.f41915a.v(message.obj);
                    break;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends HandlerThread {
        public c() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final String f41918b = "state";

        /* renamed from: a, reason: collision with root package name */
        public final j f41919a;

        public d(j jVar) {
            this.f41919a = jVar;
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f41919a.f41912o) {
                intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
            }
            this.f41919a.f41899b.registerReceiver(this, intentFilter);
        }

        public void b() {
            this.f41919a.f41899b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f41919a.b(intent.getBooleanExtra("state", false));
                }
            } else if (PushConsts.ACTION_BROADCAST_NETWORK_CHANGE.equals(action)) {
                this.f41919a.f(((ConnectivityManager) h0.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public j(Context context, ExecutorService executorService, Handler handler, k kVar, e eVar, c0 c0Var) {
        c cVar = new c();
        this.f41898a = cVar;
        cVar.start();
        h0.i(cVar.getLooper());
        this.f41899b = context;
        this.f41900c = executorService;
        this.f41902e = new LinkedHashMap();
        this.f41903f = new WeakHashMap();
        this.f41904g = new WeakHashMap();
        this.f41905h = new LinkedHashSet();
        this.f41906i = new b(cVar.getLooper(), this);
        this.f41901d = kVar;
        this.f41907j = handler;
        this.f41908k = eVar;
        this.f41909l = c0Var;
        this.f41910m = new ArrayList(4);
        this.f41913p = h0.q(context);
        this.f41912o = h0.p(context, yk.e.f100168b);
        d dVar = new d(this);
        this.f41911n = dVar;
        dVar.a();
    }

    public final void a(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        Bitmap bitmap = cVar.f41796m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f41910m.add(cVar);
        if (this.f41906i.hasMessages(7)) {
            return;
        }
        this.f41906i.sendEmptyMessageDelayed(7, 200L);
    }

    public void b(boolean z11) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(10, z11 ? 1 : 0, 0));
    }

    public void c(com.squareup.picasso.a aVar) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    public void d(com.squareup.picasso.c cVar) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    public void e(com.squareup.picasso.c cVar) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    public void f(NetworkInfo networkInfo) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void g(Object obj) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    public void h(Object obj) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    public void i(com.squareup.picasso.c cVar) {
        Handler handler = this.f41906i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    public void j(com.squareup.picasso.a aVar) {
        Handler handler = this.f41906i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public final void k() {
        if (this.f41903f.isEmpty()) {
            return;
        }
        Iterator<com.squareup.picasso.a> it = this.f41903f.values().iterator();
        while (it.hasNext()) {
            com.squareup.picasso.a next = it.next();
            it.remove();
            if (next.g().f41739n) {
                h0.t("Dispatcher", h0.f41884z, next.i().e());
            }
            y(next, false);
        }
    }

    public final void l(List<com.squareup.picasso.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).q().f41739n) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (com.squareup.picasso.c cVar : list) {
            if (sb2.length() > 0) {
                sb2.append(j2.O);
            }
            sb2.append(h0.k(cVar));
        }
        h0.t("Dispatcher", h0.f41883y, sb2.toString());
    }

    public final void m(com.squareup.picasso.a aVar) {
        Object k11 = aVar.k();
        if (k11 != null) {
            aVar.f41767k = true;
            this.f41903f.put(k11, aVar);
        }
    }

    public final void n(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h11 = cVar.h();
        if (h11 != null) {
            m(h11);
        }
        List<com.squareup.picasso.a> i11 = cVar.i();
        if (i11 != null) {
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                m(i11.get(i12));
            }
        }
    }

    public void o(boolean z11) {
        this.f41913p = z11;
    }

    public void p() {
        ArrayList arrayList = new ArrayList(this.f41910m);
        this.f41910m.clear();
        Handler handler = this.f41907j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        l(arrayList);
    }

    public void q(com.squareup.picasso.a aVar) {
        String d11 = aVar.d();
        com.squareup.picasso.c cVar = this.f41902e.get(d11);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f41902e.remove(d11);
                if (aVar.g().f41739n) {
                    h0.t("Dispatcher", h0.f41875q, aVar.i().e());
                }
            }
        }
        if (this.f41905h.contains(aVar.j())) {
            this.f41904g.remove(aVar.k());
            if (aVar.g().f41739n) {
                h0.u("Dispatcher", h0.f41875q, aVar.i().e(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.a remove = this.f41903f.remove(aVar.k());
        if (remove == null || !remove.g().f41739n) {
            return;
        }
        h0.u("Dispatcher", h0.f41875q, remove.i().e(), "from replaying");
    }

    public void r(com.squareup.picasso.c cVar) {
        if (MemoryPolicy.shouldWriteToMemoryCache(cVar.p())) {
            this.f41908k.b(cVar.n(), cVar.s());
        }
        this.f41902e.remove(cVar.n());
        a(cVar);
        if (cVar.q().f41739n) {
            h0.u("Dispatcher", h0.f41876r, h0.k(cVar), "for completion");
        }
    }

    public void s(com.squareup.picasso.c cVar, boolean z11) {
        if (cVar.q().f41739n) {
            String k11 = h0.k(cVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z11 ? " (will replay)" : "");
            h0.u("Dispatcher", h0.f41876r, k11, sb2.toString());
        }
        this.f41902e.remove(cVar.n());
        a(cVar);
    }

    public void t(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f41900c;
        if (executorService instanceof v) {
            ((v) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        k();
    }

    public void u(Object obj) {
        if (this.f41905h.add(obj)) {
            Iterator<com.squareup.picasso.c> it = this.f41902e.values().iterator();
            while (it.hasNext()) {
                com.squareup.picasso.c next = it.next();
                boolean z11 = next.q().f41739n;
                com.squareup.picasso.a h11 = next.h();
                List<com.squareup.picasso.a> i11 = next.i();
                boolean z12 = (i11 == null || i11.isEmpty()) ? false : true;
                if (h11 != null || z12) {
                    if (h11 != null && h11.j().equals(obj)) {
                        next.f(h11);
                        this.f41904g.put(h11.k(), h11);
                        if (z11) {
                            h0.u("Dispatcher", h0.C, h11.f41758b.e(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z12) {
                        for (int size = i11.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = i11.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.f41904g.put(aVar.k(), aVar);
                                if (z11) {
                                    h0.u("Dispatcher", h0.C, aVar.f41758b.e(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it.remove();
                        if (z11) {
                            h0.u("Dispatcher", h0.f41875q, h0.k(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    public void v(Object obj) {
        if (this.f41905h.remove(obj)) {
            Iterator<com.squareup.picasso.a> it = this.f41904g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                com.squareup.picasso.a next = it.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f41907j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void w(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        boolean z11 = false;
        if (this.f41900c.isShutdown()) {
            s(cVar, false);
            return;
        }
        if (cVar.w(this.f41913p, this.f41912o ? ((ConnectivityManager) h0.o(this.f41899b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (cVar.q().f41739n) {
                h0.t("Dispatcher", h0.f41877s, h0.k(cVar));
            }
            if (cVar.k() instanceof s.a) {
                cVar.f41792i |= NetworkPolicy.NO_CACHE.index;
            }
            cVar.f41797n = this.f41900c.submit(cVar);
            return;
        }
        if (this.f41912o && cVar.x()) {
            z11 = true;
        }
        s(cVar, z11);
        if (z11) {
            n(cVar);
        }
    }

    public void x(com.squareup.picasso.a aVar) {
        y(aVar, true);
    }

    public void y(com.squareup.picasso.a aVar, boolean z11) {
        if (this.f41905h.contains(aVar.j())) {
            this.f41904g.put(aVar.k(), aVar);
            if (aVar.g().f41739n) {
                h0.u("Dispatcher", h0.C, aVar.f41758b.e(), "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar = this.f41902e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
            return;
        }
        if (this.f41900c.isShutdown()) {
            if (aVar.g().f41739n) {
                h0.u("Dispatcher", h0.f41873o, aVar.f41758b.e(), "because shut down");
                return;
            }
            return;
        }
        com.squareup.picasso.c g11 = com.squareup.picasso.c.g(aVar.g(), this, this.f41908k, this.f41909l, aVar);
        g11.f41797n = this.f41900c.submit(g11);
        this.f41902e.put(aVar.d(), g11);
        if (z11) {
            this.f41903f.remove(aVar.k());
        }
        if (aVar.g().f41739n) {
            h0.t("Dispatcher", h0.f41874p, aVar.f41758b.e());
        }
    }

    public void z() {
        ExecutorService executorService = this.f41900c;
        if (executorService instanceof v) {
            executorService.shutdown();
        }
        this.f41901d.shutdown();
        this.f41898a.quit();
        Picasso.f41724q.post(new a());
    }
}
