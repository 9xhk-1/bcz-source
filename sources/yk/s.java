package yk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.igexin.sdk.PushConsts;
import fl.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import yk.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static volatile s f100195d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f100196e = "ConnectivityMonitor";

    /* renamed from: a, reason: collision with root package name */
    public final c f100197a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<b.a> f100198b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f100199c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements h.b<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f100200a;

        public a(Context context) {
            this.f100200a = context;
        }

        @Override // fl.h.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f100200a.getSystemService("connectivity");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements b.a {
        public b() {
        }

        @Override // yk.b.a
        public void a(boolean z11) {
            ArrayList arrayList;
            fl.o.b();
            synchronized (s.this) {
                arrayList = new ArrayList(s.this.f100198b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        boolean register();

        void unregister();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f100203a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f100204b;

        /* renamed from: c, reason: collision with root package name */
        public final h.b<ConnectivityManager> f100205c;

        /* renamed from: d, reason: collision with root package name */
        public final ConnectivityManager.NetworkCallback f100206d = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends ConnectivityManager.NetworkCallback {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: yk.s$d$a$a, reason: collision with other inner class name */
            public class RunnableC1369a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f100208a;

                public RunnableC1369a(boolean z11) {
                    this.f100208a = z11;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f100208a);
                }
            }

            public a() {
            }

            public void a(boolean z11) {
                fl.o.b();
                d dVar = d.this;
                boolean z12 = dVar.f100203a;
                dVar.f100203a = z11;
                if (z12 != z11) {
                    dVar.f100204b.a(z11);
                }
            }

            public final void b(boolean z11) {
                fl.o.z(new RunnableC1369a(z11));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                b(false);
            }
        }

        public d(h.b<ConnectivityManager> bVar, b.a aVar) {
            this.f100205c = bVar;
            this.f100204b = aVar;
        }

        @Override // yk.s.c
        @SuppressLint({"MissingPermission"})
        public boolean register() {
            this.f100203a = this.f100205c.get().getActiveNetwork() != null;
            try {
                this.f100205c.get().registerDefaultNetworkCallback(this.f100206d);
                return true;
            } catch (RuntimeException e11) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e11);
                }
                return false;
            }
        }

        @Override // yk.s.c
        public void unregister() {
            this.f100205c.get().unregisterNetworkCallback(this.f100206d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements c {

        /* renamed from: g, reason: collision with root package name */
        public static final Executor f100210g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a, reason: collision with root package name */
        public final Context f100211a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f100212b;

        /* renamed from: c, reason: collision with root package name */
        public final h.b<ConnectivityManager> f100213c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f100214d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f100215e;

        /* renamed from: f, reason: collision with root package name */
        public final BroadcastReceiver f100216f = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@NonNull Context context, Intent intent) {
                e.this.c();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f100214d = eVar.a();
                try {
                    e eVar2 = e.this;
                    eVar2.f100211a.registerReceiver(eVar2.f100216f, new IntentFilter(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE));
                    e.this.f100215e = true;
                } catch (SecurityException e11) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e11);
                    }
                    e.this.f100215e = false;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f100215e) {
                    e.this.f100215e = false;
                    e eVar = e.this;
                    eVar.f100211a.unregisterReceiver(eVar.f100216f);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z11 = e.this.f100214d;
                e eVar = e.this;
                eVar.f100214d = eVar.a();
                if (z11 != e.this.f100214d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f100214d);
                    }
                    e eVar2 = e.this;
                    eVar2.b(eVar2.f100214d);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: yk.s$e$e, reason: collision with other inner class name */
        public class RunnableC1370e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f100221a;

            public RunnableC1370e(boolean z11) {
                this.f100221a = z11;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f100212b.a(this.f100221a);
            }
        }

        public e(Context context, h.b<ConnectivityManager> bVar, b.a aVar) {
            this.f100211a = context.getApplicationContext();
            this.f100213c = bVar;
            this.f100212b = aVar;
        }

        @SuppressLint({"MissingPermission"})
        public boolean a() {
            try {
                NetworkInfo activeNetworkInfo = this.f100213c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e11) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e11);
                }
                return true;
            }
        }

        public void b(boolean z11) {
            fl.o.z(new RunnableC1370e(z11));
        }

        public void c() {
            f100210g.execute(new d());
        }

        @Override // yk.s.c
        public boolean register() {
            f100210g.execute(new b());
            return true;
        }

        @Override // yk.s.c
        public void unregister() {
            f100210g.execute(new c());
        }
    }

    public s(@NonNull Context context) {
        this.f100197a = new d(fl.h.a(new a(context)), new b());
    }

    public static s a(@NonNull Context context) {
        if (f100195d == null) {
            synchronized (s.class) {
                try {
                    if (f100195d == null) {
                        f100195d = new s(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f100195d;
    }

    @VisibleForTesting
    public static void e() {
        f100195d = null;
    }

    @GuardedBy("this")
    public final void b() {
        if (this.f100199c || this.f100198b.isEmpty()) {
            return;
        }
        this.f100199c = this.f100197a.register();
    }

    @GuardedBy("this")
    public final void c() {
        if (this.f100199c && this.f100198b.isEmpty()) {
            this.f100197a.unregister();
            this.f100199c = false;
        }
    }

    public synchronized void d(b.a aVar) {
        this.f100198b.add(aVar);
        b();
    }

    public synchronized void f(b.a aVar) {
        this.f100198b.remove(aVar);
        c();
    }
}
