package h40;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes8.dex */
public final class n1 extends k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n1 f58259a = new n1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ReentrantReadWriteLock f58260b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final WeakHashMap<Class<? extends Throwable>, x00.l<Throwable, Throwable>> f58261c = new WeakHashMap<>();

    @Override // h40.k
    @m80.k
    public x00.l<Throwable, Throwable> a(@m80.k Class<? extends Throwable> cls) {
        x00.l<Throwable, Throwable> g11;
        ReentrantReadWriteLock reentrantReadWriteLock = f58260b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            x00.l<Throwable, Throwable> lVar = f58261c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i11 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount; i12++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, x00.l<Throwable, Throwable>> weakHashMap = f58261c;
                x00.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                g11 = s.g(cls);
                weakHashMap.put(cls, g11);
                while (i11 < readHoldCount) {
                    readLock2.lock();
                    i11++;
                }
                writeLock.unlock();
                return g11;
            } finally {
                while (i11 < readHoldCount) {
                    readLock2.lock();
                    i11++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
