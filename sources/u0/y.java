package u0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.u0;
import n0.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSystemCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n+ 2 Logs.kt\ncoil/util/-Logs\n*L\n1#1,98:1\n89#1,2:99\n89#1,2:101\n89#1,2:103\n89#1:105\n90#1:110\n89#1:111\n90#1:116\n21#2,4:106\n21#2,4:112\n*S KotlinDebug\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n*L\n39#1:99,2\n48#1:101,2\n71#1:103,2\n74#1:105\n74#1:110\n83#1:111\n83#1:116\n75#1:106,4\n84#1:112,4\n*E\n"})
/* loaded from: classes3.dex */
public final class y implements ComponentCallbacks2, d.a {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f91492f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f91493g = "NetworkObserver";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f91494h = "ONLINE";

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f91495i = "OFFLINE";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WeakReference<b0.i> f91496a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Context f91497b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public n0.d f91498c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91499d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91500e = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public y(@m80.k b0.i iVar) {
        this.f91496a = new WeakReference<>(iVar);
    }

    @Override // n0.d.a
    public synchronized void a(boolean z11) {
        try {
            b0.i iVar = this.f91496a.get();
            g2 g2Var = null;
            if (iVar != null) {
                w q11 = iVar.q();
                if (q11 != null && q11.getLevel() <= 4) {
                    q11.a("NetworkObserver", 4, z11 ? f91494h : f91495i, null);
                }
                this.f91500e = z11;
                g2Var = g2.f100423a;
            }
            if (g2Var == null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @m80.k
    public final WeakReference<b0.i> b() {
        return this.f91496a;
    }

    public final boolean d() {
        return this.f91499d;
    }

    public final synchronized boolean f() {
        h();
        return this.f91500e;
    }

    public final synchronized void g() {
        g2 g2Var;
        try {
            b0.i iVar = this.f91496a.get();
            if (iVar != null) {
                if (this.f91497b == null) {
                    Context m11 = iVar.m();
                    this.f91497b = m11;
                    m11.registerComponentCallbacks(this);
                }
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            if (g2Var == null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void h() {
        g2 g2Var;
        try {
            b0.i iVar = this.f91496a.get();
            if (iVar != null) {
                if (this.f91498c == null) {
                    n0.d a11 = iVar.t().f() ? n0.e.a(iVar.m(), this, iVar.q()) : new n0.c();
                    this.f91498c = a11;
                    this.f91500e = a11.a();
                }
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            if (g2Var == null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(boolean z11) {
        this.f91499d = z11;
    }

    public final synchronized void j() {
        try {
            if (this.f91499d) {
                return;
            }
            this.f91499d = true;
            Context context = this.f91497b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            n0.d dVar = this.f91498c;
            if (dVar != null) {
                dVar.shutdown();
            }
            this.f91496a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void k(x00.l<? super b0.i, g2> lVar) {
        g2 g2Var;
        b0.i iVar = this.f91496a.get();
        if (iVar != null) {
            lVar.invoke(iVar);
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            j();
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(@m80.k Configuration configuration) {
        try {
            if ((this.f91496a.get() != null ? g2.f100423a : null) == null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int i11) {
        try {
            b0.i iVar = this.f91496a.get();
            g2 g2Var = null;
            if (iVar != null) {
                w q11 = iVar.q();
                if (q11 != null && q11.getLevel() <= 2) {
                    q11.a("NetworkObserver", 2, "trimMemory, level=" + i11, null);
                }
                iVar.x(i11);
                g2Var = g2.f100423a;
            }
            if (g2Var == null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void c() {
    }

    @VisibleForTesting
    public static /* synthetic */ void e() {
    }
}
