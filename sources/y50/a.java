package y50;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f99377a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99378b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public c f99379c;

    /* renamed from: d, reason: collision with root package name */
    public long f99380d;

    public a(@k String name, boolean z11) {
        g0.p(name, "name");
        this.f99377a = name;
        this.f99378b = z11;
        this.f99380d = -1L;
    }

    public final boolean a() {
        return this.f99378b;
    }

    @k
    public final String b() {
        return this.f99377a;
    }

    public final long c() {
        return this.f99380d;
    }

    @l
    public final c d() {
        return this.f99379c;
    }

    public final void e(@k c queue) {
        g0.p(queue, "queue");
        c cVar = this.f99379c;
        if (cVar == queue) {
            return;
        }
        if (cVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f99379c = queue;
    }

    public abstract long f();

    public final void g(long j11) {
        this.f99380d = j11;
    }

    public final void h(@l c cVar) {
        this.f99379c = cVar;
    }

    @k
    public String toString() {
        return this.f99377a;
    }

    public /* synthetic */ a(String str, boolean z11, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }
}
