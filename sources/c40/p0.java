package c40;

import kotlin.coroutines.d;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@IgnoreJRERequirement
/* loaded from: classes8.dex */
public final class p0 extends kotlin.coroutines.a implements m3<String> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f7906b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f7907a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements d.c<p0> {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public p0(long j11) {
        super(f7906b);
        this.f7907a = j11;
    }

    public static /* synthetic */ p0 E(p0 p0Var, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = p0Var.f7907a;
        }
        return p0Var.w(j11);
    }

    public final long H() {
        return this.f7907a;
    }

    @Override // c40.m3
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void restoreThreadContext(@m80.k kotlin.coroutines.d dVar, @m80.k String str) {
        Thread.currentThread().setName(str);
    }

    @Override // c40.m3
    @m80.k
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public String updateThreadContext(@m80.k kotlin.coroutines.d dVar) {
        String str;
        q0 q0Var = (q0) dVar.get(q0.f7924b);
        if (q0Var == null || (str = q0Var.H()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int Y3 = u30.k0.Y3(name, k0.f7882a, 0, false, 6, null);
        if (Y3 < 0) {
            Y3 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + Y3 + 10);
        String substring = name.substring(0, Y3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        sb2.append(substring);
        sb2.append(k0.f7882a);
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.f7907a);
        currentThread.setName(sb2.toString());
        return name;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && this.f7907a == ((p0) obj).f7907a;
    }

    public int hashCode() {
        return Long.hashCode(this.f7907a);
    }

    public final long q() {
        return this.f7907a;
    }

    @m80.k
    public String toString() {
        return "CoroutineId(" + this.f7907a + ')';
    }

    @m80.k
    public final p0 w(long j11) {
        return new p0(j11);
    }
}
