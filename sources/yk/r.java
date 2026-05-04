package yk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class r {

    /* renamed from: d, reason: collision with root package name */
    public static final String f100191d = "RequestTracker";

    /* renamed from: a, reason: collision with root package name */
    public final Set<bl.d> f100192a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final Set<bl.d> f100193b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f100194c;

    @VisibleForTesting
    public void a(bl.d dVar) {
        this.f100192a.add(dVar);
    }

    public boolean b(@Nullable bl.d dVar) {
        boolean z11 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f100192a.remove(dVar);
        if (!this.f100193b.remove(dVar) && !remove) {
            z11 = false;
        }
        if (z11) {
            dVar.clear();
        }
        return z11;
    }

    public void c() {
        Iterator it = fl.o.l(this.f100192a).iterator();
        while (it.hasNext()) {
            b((bl.d) it.next());
        }
        this.f100193b.clear();
    }

    public boolean d() {
        return this.f100194c;
    }

    public void e() {
        this.f100194c = true;
        for (bl.d dVar : fl.o.l(this.f100192a)) {
            if (dVar.isRunning() || dVar.isComplete()) {
                dVar.clear();
                this.f100193b.add(dVar);
            }
        }
    }

    public void f() {
        this.f100194c = true;
        for (bl.d dVar : fl.o.l(this.f100192a)) {
            if (dVar.isRunning()) {
                dVar.pause();
                this.f100193b.add(dVar);
            }
        }
    }

    public void g() {
        for (bl.d dVar : fl.o.l(this.f100192a)) {
            if (!dVar.isComplete() && !dVar.f()) {
                dVar.clear();
                if (this.f100194c) {
                    this.f100193b.add(dVar);
                } else {
                    dVar.c();
                }
            }
        }
    }

    public void h() {
        this.f100194c = false;
        for (bl.d dVar : fl.o.l(this.f100192a)) {
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.c();
            }
        }
        this.f100193b.clear();
    }

    public void i(@NonNull bl.d dVar) {
        this.f100192a.add(dVar);
        if (!this.f100194c) {
            dVar.c();
            return;
        }
        dVar.clear();
        if (Log.isLoggable(f100191d, 2)) {
            Log.v(f100191d, "Paused, delaying request");
        }
        this.f100193b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f100192a.size() + ", isPaused=" + this.f100194c + com.alipay.sdk.m.u.i.f11099d;
    }
}
