package s30;

import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "TimingKt")
/* loaded from: classes8.dex */
public final class b {
    public static final long a(@k x00.a<g2> block) {
        g0.p(block, "block");
        long nanoTime = System.nanoTime();
        block.invoke();
        return System.nanoTime() - nanoTime;
    }

    public static final long b(@k x00.a<g2> block) {
        g0.p(block, "block");
        long currentTimeMillis = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
