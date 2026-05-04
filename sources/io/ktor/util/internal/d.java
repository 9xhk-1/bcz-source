package io.ktor.util.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class d extends f {
    @Override // io.ktor.util.internal.f
    public final boolean B() {
        throw new UnsupportedOperationException();
    }

    @k
    public final Void I() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ <T extends f> void J(l<? super T, g2> block) {
        g0.p(block, "block");
        Object s11 = s();
        g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        for (f fVar = (f) s11; !g0.g(fVar, this); fVar = fVar.t()) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (fVar != null) {
                block.invoke(fVar);
            }
        }
    }

    public final boolean K() {
        return s() == this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.ktor.util.internal.f] */
    public final void L() {
        Object s11 = s();
        g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        d dVar = this;
        d dVar2 = (f) s11;
        while (!g0.g(dVar2, this)) {
            f t11 = dVar2.t();
            dVar2.H(dVar, t11);
            dVar = dVar2;
            dVar2 = t11;
        }
        Object s12 = s();
        g0.n(s12, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        H(dVar, (f) s12);
    }

    @Override // io.ktor.util.internal.f
    public /* bridge */ /* synthetic */ a n() {
        return (a) I();
    }
}
