package f10;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends e10.a {
    @Override // e10.a
    @k
    public Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g0.o(current, "current(...)");
        return current;
    }

    @Override // kotlin.random.Random
    public double nextDouble(double d11) {
        return ThreadLocalRandom.current().nextDouble(d11);
    }

    @Override // kotlin.random.Random
    public int nextInt(int i11, int i12) {
        return ThreadLocalRandom.current().nextInt(i11, i12);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j11) {
        return ThreadLocalRandom.current().nextLong(j11);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j11, long j12) {
        return ThreadLocalRandom.current().nextLong(j11, j12);
    }
}
