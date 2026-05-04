package e10;

import java.util.Random;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends Random {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f48324c = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kotlin.random.Random f48325a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48326b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public c(@k kotlin.random.Random impl) {
        g0.p(impl, "impl");
        this.f48325a = impl;
    }

    @k
    public final kotlin.random.Random a() {
        return this.f48325a;
    }

    @Override // java.util.Random
    public int next(int i11) {
        return this.f48325a.nextBits(i11);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f48325a.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(@k byte[] bytes) {
        g0.p(bytes, "bytes");
        this.f48325a.nextBytes(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f48325a.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f48325a.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f48325a.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f48325a.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j11) {
        if (this.f48326b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f48326b = true;
    }

    @Override // java.util.Random
    public int nextInt(int i11) {
        return this.f48325a.nextInt(i11);
    }
}
