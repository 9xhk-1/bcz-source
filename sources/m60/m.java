package m60;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import l60.g1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m extends l60.w {

    /* renamed from: b, reason: collision with root package name */
    public final long f72455b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72456c;

    /* renamed from: d, reason: collision with root package name */
    public long f72457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@m80.k g1 delegate, long j11, boolean z11) {
        super(delegate);
        g0.p(delegate, "delegate");
        this.f72455b = j11;
        this.f72456c = z11;
    }

    @Override // l60.w, l60.g1
    public long L3(@m80.k l60.k sink, long j11) {
        g0.p(sink, "sink");
        long j12 = this.f72457d;
        long j13 = this.f72455b;
        if (j12 > j13) {
            j11 = 0;
        } else if (this.f72456c) {
            long j14 = j13 - j12;
            if (j14 == 0) {
                return -1L;
            }
            j11 = Math.min(j11, j14);
        }
        long L3 = super.L3(sink, j11);
        if (L3 != -1) {
            this.f72457d += L3;
        }
        long j15 = this.f72457d;
        long j16 = this.f72455b;
        if ((j15 >= j16 || L3 != -1) && j15 <= j16) {
            return L3;
        }
        if (L3 > 0 && j15 > j16) {
            e(sink, sink.size() - (this.f72457d - this.f72455b));
        }
        throw new IOException("expected " + this.f72455b + " bytes but got " + this.f72457d);
    }

    public final void e(l60.k kVar, long j11) {
        l60.k kVar2 = new l60.k();
        kVar2.V2(kVar);
        kVar.y8(kVar2, j11);
        kVar2.e();
    }
}
