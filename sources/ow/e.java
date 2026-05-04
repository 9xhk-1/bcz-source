package ow;

import c40.l2;
import c40.m0;
import c40.q0;
import io.ktor.utils.io.b0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import ow.a;
import xy.a0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class e implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f78443d = AtomicIntegerFieldUpdater.newUpdater(e.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f78444a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f78445b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f78446c;

    @m80.k
    private volatile /* synthetic */ int closed;

    public e(@m80.k String engineName) {
        g0.p(engineName, "engineName");
        this.f78444a = engineName;
        this.closed = 0;
        this.f78445b = e0.c(new x00.a() { // from class: ow.c
            @Override // x00.a
            public final Object invoke() {
                m0 r11;
                r11 = e.r(e.this);
                return r11;
            }
        });
        this.f78446c = e0.c(new x00.a() { // from class: ow.d
            @Override // x00.a
            public final Object invoke() {
                kotlin.coroutines.d i11;
                i11 = e.i(e.this);
                return i11;
            }
        });
    }

    public static final kotlin.coroutines.d i(e eVar) {
        return a0.b(null, 1, null).plus(eVar.E8()).plus(new q0(eVar.f78444a + "-context"));
    }

    public static final m0 r(e eVar) {
        m0 a11 = eVar.getConfig().a();
        return a11 == null ? g.a() : a11;
    }

    @Override // ow.a
    @m80.k
    public Set<h<?>> D2() {
        return a.C0962a.g(this);
    }

    @Override // ow.a
    @m80.k
    public m0 E8() {
        return (m0) this.f78445b.getValue();
    }

    public void close() {
        if (f78443d.compareAndSet(this, 0, 1)) {
            d.b bVar = getCoroutineContext().get(l2.f7886e0);
            c40.a0 a0Var = bVar instanceof c40.a0 ? (c40.a0) bVar : null;
            if (a0Var == null) {
                return;
            }
            a0Var.complete();
        }
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return (kotlin.coroutines.d) this.f78446c.getValue();
    }

    @Override // ow.a
    @b0
    public void z5(@m80.k lw.c cVar) {
        a.C0962a.h(this, cVar);
    }
}
