package androidx.room.concurrent;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ExclusiveLock {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Map<String, ReentrantLock> threadLocksMap = new LinkedHashMap();

    @l
    private final FileLock fileLock;

    @k
    private final ReentrantLock threadLock;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExclusiveLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExclusiveLock.kt\nandroidx/room/concurrent/ExclusiveLock$Companion\n+ 2 Synchronized.jvmAndroid.kt\nandroidx/room/concurrent/Synchronized_jvmAndroidKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n22#2:78\n381#3,7:79\n*S KotlinDebug\n*F\n+ 1 ExclusiveLock.kt\nandroidx/room/concurrent/ExclusiveLock$Companion\n*L\n70#1:78\n71#1:79,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final FileLock getFileLock(String str) {
            return new FileLock(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReentrantLock getThreadLock(String str) {
            ReentrantLock reentrantLock;
            synchronized (this) {
                try {
                    Map map = ExclusiveLock.threadLocksMap;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    reentrantLock = (ReentrantLock) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return reentrantLock;
        }

        private Companion() {
        }
    }

    public ExclusiveLock(@k String filename, boolean z11) {
        g0.p(filename, "filename");
        Companion companion = Companion;
        this.threadLock = companion.getThreadLock(filename);
        this.fileLock = z11 ? companion.getFileLock(filename) : null;
    }

    public final <T> T withLock(@k a<? extends T> onLocked, @k x00.l onLockError) {
        g0.p(onLocked, "onLocked");
        g0.p(onLockError, "onLockError");
        this.threadLock.lock();
        boolean z11 = false;
        try {
            FileLock fileLock = this.fileLock;
            if (fileLock != null) {
                fileLock.lock();
            }
            z11 = true;
            try {
                T invoke = onLocked.invoke();
                this.threadLock.unlock();
                return invoke;
            } finally {
                FileLock fileLock2 = this.fileLock;
                if (fileLock2 != null) {
                    fileLock2.unlock();
                }
            }
        } catch (Throwable th2) {
            try {
                if (z11) {
                    throw th2;
                }
                onLockError.invoke(th2);
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                this.threadLock.unlock();
                throw th3;
            }
        }
    }
}
