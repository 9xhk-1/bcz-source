package ja0;

import java.util.concurrent.ForkJoinPool;
import java.util.function.Predicate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f63937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63939c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63941e;

    /* renamed from: f, reason: collision with root package name */
    public final Predicate<? super ForkJoinPool> f63942f;

    public b(int parallelism, int minimumRunnable, int maxPoolSize, int corePoolSize, int keepAliveSeconds, Predicate<? super ForkJoinPool> saturate) {
        this.f63937a = parallelism;
        this.f63938b = minimumRunnable;
        this.f63939c = maxPoolSize;
        this.f63940d = corePoolSize;
        this.f63941e = keepAliveSeconds;
        this.f63942f = saturate;
    }

    @Override // ja0.l1
    public int a() {
        return this.f63937a;
    }

    @Override // ja0.l1
    public int b() {
        return this.f63941e;
    }

    @Override // ja0.l1
    public int c() {
        return this.f63938b;
    }

    @Override // ja0.l1
    public Predicate<? super ForkJoinPool> d() {
        return this.f63942f;
    }

    @Override // ja0.l1
    public int e() {
        return this.f63940d;
    }

    @Override // ja0.l1
    public int f() {
        return this.f63939c;
    }
}
