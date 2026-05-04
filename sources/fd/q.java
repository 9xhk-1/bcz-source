package fd;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final int f51703f = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f51704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51705b;

    /* renamed from: c, reason: collision with root package name */
    public final long f51706c;

    /* renamed from: d, reason: collision with root package name */
    public final long f51707d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f51708e;

    public /* synthetic */ q(String str, int i11, long j11, long j12, x00.a aVar, kotlin.jvm.internal.v vVar) {
        this(str, i11, j11, j12, aVar);
    }

    public static final yz.g2 b() {
        return yz.g2.f100423a;
    }

    public static /* synthetic */ q i(q qVar, String str, int i11, long j11, long j12, x00.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = qVar.f51704a;
        }
        if ((i12 & 2) != 0) {
            i11 = qVar.f51705b;
        }
        if ((i12 & 4) != 0) {
            j11 = qVar.f51706c;
        }
        if ((i12 & 8) != 0) {
            j12 = qVar.f51707d;
        }
        if ((i12 & 16) != 0) {
            aVar = qVar.f51708e;
        }
        x00.a aVar2 = aVar;
        long j13 = j12;
        return qVar.h(str, i11, j11, j13, aVar2);
    }

    @m80.k
    public final String c() {
        return this.f51704a;
    }

    public final int d() {
        return this.f51705b;
    }

    public final long e() {
        return this.f51706c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.g0.g(this.f51704a, qVar.f51704a) && this.f51705b == qVar.f51705b && Color.m2510equalsimpl0(this.f51706c, qVar.f51706c) && Color.m2510equalsimpl0(this.f51707d, qVar.f51707d) && kotlin.jvm.internal.g0.g(this.f51708e, qVar.f51708e);
    }

    public final long f() {
        return this.f51707d;
    }

    @m80.k
    public final x00.a<yz.g2> g() {
        return this.f51708e;
    }

    @m80.k
    public final q h(@m80.k String title, int i11, long j11, long j12, @m80.k x00.a<yz.g2> handler) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(handler, "handler");
        return new q(title, i11, j11, j12, handler, null);
    }

    public int hashCode() {
        return (((((((this.f51704a.hashCode() * 31) + Integer.hashCode(this.f51705b)) * 31) + Color.m2516hashCodeimpl(this.f51706c)) * 31) + Color.m2516hashCodeimpl(this.f51707d)) * 31) + this.f51708e.hashCode();
    }

    public final long j() {
        return this.f51706c;
    }

    public final long k() {
        return this.f51707d;
    }

    @m80.k
    public final x00.a<yz.g2> l() {
        return this.f51708e;
    }

    public final int m() {
        return this.f51705b;
    }

    @m80.k
    public final String n() {
        return this.f51704a;
    }

    @m80.k
    public String toString() {
        return "ExtensionItemInfo(title=" + this.f51704a + ", icon=" + this.f51705b + ", background=" + Color.m2517toStringimpl(this.f51706c) + ", backgroundPressed=" + Color.m2517toStringimpl(this.f51707d) + ", handler=" + this.f51708e + pn.j.f81007d;
    }

    public q(String title, int i11, long j11, long j12, x00.a<yz.g2> handler) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(handler, "handler");
        this.f51704a = title;
        this.f51705b = i11;
        this.f51706c = j11;
        this.f51707d = j12;
        this.f51708e = handler;
    }

    public /* synthetic */ q(String str, int i11, long j11, long j12, x00.a aVar, int i12, kotlin.jvm.internal.v vVar) {
        this(str, i11, j11, j12, (i12 & 16) != 0 ? new x00.a() { // from class: fd.p
            @Override // x00.a
            public final Object invoke() {
                yz.g2 b11;
                b11 = q.b();
                return b11;
            }
        } : aVar, null);
    }
}
