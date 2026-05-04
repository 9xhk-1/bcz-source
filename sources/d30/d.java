package d30;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class d implements k {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Lock f47122b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @m80.k
    public final Lock a() {
        return this.f47122b;
    }

    @Override // d30.k
    public void lock() {
        this.f47122b.lock();
    }

    @Override // d30.k
    public void unlock() {
        this.f47122b.unlock();
    }

    public d(@m80.k Lock lock) {
        g0.p(lock, "lock");
        this.f47122b = lock;
    }

    public /* synthetic */ d(Lock lock, int i11, v vVar) {
        this((i11 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
