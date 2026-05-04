package e10;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a extends Random {
    @k
    public abstract java.util.Random a();

    @Override // kotlin.random.Random
    public int nextBits(int i11) {
        return e.j(a().nextInt(), i11);
    }

    @Override // kotlin.random.Random
    public boolean nextBoolean() {
        return a().nextBoolean();
    }

    @Override // kotlin.random.Random
    @k
    public byte[] nextBytes(@k byte[] array) {
        g0.p(array, "array");
        a().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.Random
    public double nextDouble() {
        return a().nextDouble();
    }

    @Override // kotlin.random.Random
    public float nextFloat() {
        return a().nextFloat();
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        return a().nextInt();
    }

    @Override // kotlin.random.Random
    public long nextLong() {
        return a().nextLong();
    }

    @Override // kotlin.random.Random
    public int nextInt(int i11) {
        return a().nextInt(i11);
    }
}
