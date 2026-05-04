package l50;

import yz.c2;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r1
/* loaded from: classes8.dex */
public final class w extends s {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@m80.k e0 writer, boolean z11) {
        super(writer);
        kotlin.jvm.internal.g0.p(writer, "writer");
        this.f70081c = z11;
    }

    @Override // l50.s
    public void e(byte b11) {
        boolean z11 = this.f70081c;
        String f02 = yz.o1.f0(yz.o1.i(b11));
        if (z11) {
            n(f02);
        } else {
            k(f02);
        }
    }

    @Override // l50.s
    public void i(int i11) {
        boolean z11 = this.f70081c;
        String a11 = f.a(yz.s1.i(i11));
        if (z11) {
            n(a11);
        } else {
            k(a11);
        }
    }

    @Override // l50.s
    public void j(long j11) {
        String a11;
        String a12;
        boolean z11 = this.f70081c;
        long i11 = w1.i(j11);
        if (z11) {
            a12 = k50.n.a(i11, 10);
            n(a12);
        } else {
            a11 = k50.n.a(i11, 10);
            k(a11);
        }
    }

    @Override // l50.s
    public void l(short s11) {
        boolean z11 = this.f70081c;
        String f02 = c2.f0(c2.i(s11));
        if (z11) {
            n(f02);
        } else {
            k(f02);
        }
    }
}
