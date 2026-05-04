package s3;

import c4.n;
import kotlin.jvm.internal.g0;
import m80.k;
import w30.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i {
    public static final <T> T a(@k String tag, @k x00.a<? extends T> block) {
        g0.p(tag, "tag");
        g0.p(block, "block");
        b.C1273b c1273b = b.C1273b.f94770b;
        long epochMilliseconds = c1273b.a().toEpochMilliseconds();
        try {
            T invoke = block.invoke();
            if (n.h().k()) {
                z6.b.d(z6.b.f101032b, c.f87469a, '[' + tag + "] cost: " + (c1273b.a().toEpochMilliseconds() - epochMilliseconds), null, 4, null);
            }
            return invoke;
        } finally {
        }
    }
}
