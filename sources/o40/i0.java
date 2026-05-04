package o40;

import h40.k1;
import h40.l1;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i0<T> implements Comparable<i0<?>>, l1 {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final k0 f75748a;

    /* renamed from: b, reason: collision with root package name */
    public final long f75749b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f75750c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final T f75751d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final boolean f75752e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final x00.a<Boolean> f75753f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public k1<?> f75754g;

    /* renamed from: h, reason: collision with root package name */
    public int f75755h;

    public i0(@m80.k k0 k0Var, long j11, long j12, T t11, boolean z11, @m80.k x00.a<Boolean> aVar) {
        this.f75748a = k0Var;
        this.f75749b = j11;
        this.f75750c = j12;
        this.f75751d = t11;
        this.f75752e = z11;
        this.f75753f = aVar;
    }

    @Override // h40.l1
    @m80.l
    public k1<?> a() {
        return this.f75754g;
    }

    @Override // h40.l1
    public void b(@m80.l k1<?> k1Var) {
        this.f75754g = k1Var;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(@m80.k i0<?> i0Var) {
        return e00.g.o(this, i0Var, new PropertyReference1Impl() { // from class: o40.i0.a
            @Override // kotlin.jvm.internal.PropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return Long.valueOf(((i0) obj).f75750c);
            }
        }, new PropertyReference1Impl() { // from class: o40.i0.b
            @Override // kotlin.jvm.internal.PropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return Long.valueOf(((i0) obj).f75749b);
            }
        });
    }

    @Override // h40.l1
    public int getIndex() {
        return this.f75755h;
    }

    @Override // h40.l1
    public void setIndex(int i11) {
        this.f75755h = i11;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TestDispatchEvent(time=");
        sb2.append(this.f75750c);
        sb2.append(", dispatcher=");
        sb2.append(this.f75748a);
        sb2.append(this.f75752e ? "" : ", background");
        sb2.append(')');
        return sb2.toString();
    }
}
