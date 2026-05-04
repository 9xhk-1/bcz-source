package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.q6;
import com.google.common.collect.q8;
import com.google.common.collect.s6;
import com.google.common.collect.u6;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public class CycleDetectingLockFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> f34459b = new s6().l().i();

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f34460c = new o1(CycleDetectingLockFactory.class);

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<ArrayList<h>> f34461d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final i f34462a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Policies implements i {
        public static final Policies THROW = new a("THROW", 0);
        public static final Policies WARN = new b("WARN", 1);
        public static final Policies DISABLED = new c("DISABLED", 2);
        private static final /* synthetic */ Policies[] $VALUES = $values();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends Policies {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.i
            public void a(PotentialDeadlockException e11) {
                CycleDetectingLockFactory.f34460c.a().log(Level.SEVERE, "Detected potential deadlock", (Throwable) e11);
            }
        }

        private static /* synthetic */ Policies[] $values() {
            return new Policies[]{THROW, WARN, DISABLED};
        }

        private Policies(String $enum$name, int $enum$ordinal) {
        }

        public static Policies valueOf(String name) {
            return (Policies) Enum.valueOf(Policies.class, name);
        }

        public static Policies[] values() {
            return (Policies[]) $VALUES.clone();
        }

        public /* synthetic */ Policies(String str, int i11, a aVar) {
            this(str, i11);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends Policies {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.i
            public void a(PotentialDeadlockException e11) {
                throw e11;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends Policies {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.i
            public void a(PotentialDeadlockException e11) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PotentialDeadlockException extends g {
        private final g conflictingStackTrace;

        public /* synthetic */ PotentialDeadlockException(h hVar, h hVar2, g gVar, a aVar) {
            this(hVar, hVar2, gVar);
        }

        public g getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable th2 = this.conflictingStackTrace; th2 != null; th2 = th2.getCause()) {
                sb2.append(org.junit.jupiter.api.j2.O);
                sb2.append(th2.getMessage());
            }
            return sb2.toString();
        }

        private PotentialDeadlockException(h node1, h node2, g conflictingStackTrace) {
            super(node1, node2);
            this.conflictingStackTrace = conflictingStackTrace;
            initCause(conflictingStackTrace);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ThreadLocal<ArrayList<h>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<h> initialValue() {
            return q6.u(3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        h a();

        boolean b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends ReentrantLock implements b {

        /* renamed from: a, reason: collision with root package name */
        public final h f34463a;

        public /* synthetic */ c(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z11, a aVar) {
            this(hVar, z11);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public h a() {
            return this.f34463a;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        public c(h lockGraphNode, boolean fair) {
            super(fair);
            this.f34463a = (h) Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends ReentrantReadWriteLock implements b {

        /* renamed from: a, reason: collision with root package name */
        public final d f34467a;

        /* renamed from: b, reason: collision with root package name */
        public final f f34468b;

        /* renamed from: c, reason: collision with root package name */
        public final h f34469c;

        public /* synthetic */ e(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z11, a aVar) {
            this(hVar, z11);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public h a() {
            return this.f34469c;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        public e(h lockGraphNode, boolean fair) {
            super(fair);
            this.f34467a = CycleDetectingLockFactory.this.new d(this);
            this.f34468b = CycleDetectingLockFactory.this.new f(this);
            this.f34469c = (h) Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.f34467a;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f34468b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.of(CycleDetectingLockFactory.class.getName(), g.class.getName(), h.class.getName());

        public g(h node1, h node2) {
            super(node1.d() + " -> " + node2.d());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (j.class.getName().equals(stackTrace[i11].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else {
                    if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i11].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11, length));
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Map<h, g> f34473a = new s6().l().i();

        /* renamed from: b, reason: collision with root package name */
        public final Map<h, PotentialDeadlockException> f34474b = new s6().l().i();

        /* renamed from: c, reason: collision with root package name */
        public final String f34475c;

        public h(String lockName) {
            this.f34475c = (String) Preconditions.checkNotNull(lockName);
        }

        public void a(i policy, h acquiredLock) {
            Preconditions.checkState(this != acquiredLock, "Attempted to acquire multiple locks with the same rank %s", acquiredLock.d());
            if (this.f34473a.containsKey(acquiredLock)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = this.f34474b.get(acquiredLock);
            a aVar = null;
            if (potentialDeadlockException != null) {
                policy.a(new PotentialDeadlockException(acquiredLock, this, potentialDeadlockException.getConflictingStackTrace(), aVar));
                return;
            }
            g c11 = acquiredLock.c(this, q8.z());
            if (c11 == null) {
                this.f34473a.put(acquiredLock, new g(acquiredLock, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(acquiredLock, this, c11, aVar);
            this.f34474b.put(acquiredLock, potentialDeadlockException2);
            policy.a(potentialDeadlockException2);
        }

        public void b(i policy, List<h> acquiredLocks) {
            Iterator<h> it = acquiredLocks.iterator();
            while (it.hasNext()) {
                a(policy, it.next());
            }
        }

        @CheckForNull
        public final g c(h node, Set<h> seen) {
            if (!seen.add(this)) {
                return null;
            }
            g gVar = this.f34473a.get(node);
            if (gVar != null) {
                return gVar;
            }
            for (Map.Entry<h, g> entry : this.f34473a.entrySet()) {
                h key = entry.getKey();
                g c11 = key.c(node, seen);
                if (c11 != null) {
                    g gVar2 = new g(key, this);
                    gVar2.setStackTrace(entry.getValue().getStackTrace());
                    gVar2.initCause(c11);
                    return gVar2;
                }
            }
            return null;
        }

        public String d() {
            return this.f34475c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface i {
        void a(PotentialDeadlockException exception);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<E extends Enum<E>> extends CycleDetectingLockFactory {

        /* renamed from: e, reason: collision with root package name */
        public final Map<E, h> f34476e;

        @go.e
        public j(i policy, Map<E, h> lockGraphNodes) {
            super(policy, null);
            this.f34476e = lockGraphNodes;
        }

        public ReentrantLock o(E rank) {
            return p(rank, false);
        }

        public ReentrantLock p(E rank, boolean fair) {
            if (this.f34462a == Policies.DISABLED) {
                return new ReentrantLock(fair);
            }
            h hVar = this.f34476e.get(rank);
            Objects.requireNonNull(hVar);
            return new c(this, hVar, fair, null);
        }

        public ReentrantReadWriteLock q(E rank) {
            return r(rank, false);
        }

        public ReentrantReadWriteLock r(E rank, boolean fair) {
            if (this.f34462a == Policies.DISABLED) {
                return new ReentrantReadWriteLock(fair);
            }
            h hVar = this.f34476e.get(rank);
            Objects.requireNonNull(hVar);
            return new e(this, hVar, fair, null);
        }
    }

    public /* synthetic */ CycleDetectingLockFactory(i iVar, a aVar) {
        this(iVar);
    }

    @go.e
    public static <E extends Enum<E>> Map<E, h> e(Class<E> clazz) {
        EnumMap W = u6.W(clazz);
        E[] enumConstants = clazz.getEnumConstants();
        int length = enumConstants.length;
        ArrayList u11 = q6.u(length);
        int i11 = 0;
        for (E e11 : enumConstants) {
            h hVar = new h(f(e11));
            u11.add(hVar);
            W.put((EnumMap) e11, (E) hVar);
        }
        for (int i12 = 1; i12 < length; i12++) {
            ((h) u11.get(i12)).b(Policies.THROW, u11.subList(0, i12));
        }
        while (i11 < length - 1) {
            i11++;
            ((h) u11.get(i11)).b(Policies.DISABLED, u11.subList(i11, length));
        }
        return Collections.unmodifiableMap(W);
    }

    public static String f(Enum<?> rank) {
        return rank.getDeclaringClass().getSimpleName() + "." + rank.name();
    }

    public static <E extends Enum<E>> Map<? extends E, h> g(Class<E> clazz) {
        ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> concurrentMap = f34459b;
        Map<? extends E, h> map = (Map) concurrentMap.get(clazz);
        if (map != null) {
            return map;
        }
        Map<? extends Enum<?>, h> e11 = e(clazz);
        return (Map) ho.b0.a(concurrentMap.putIfAbsent(clazz, e11), e11);
    }

    public static void h(b lock) {
        if (lock.b()) {
            return;
        }
        ArrayList<h> arrayList = f34461d.get();
        Objects.requireNonNull(arrayList);
        h a11 = lock.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == a11) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static CycleDetectingLockFactory i(i policy) {
        return new CycleDetectingLockFactory(policy);
    }

    public static <E extends Enum<E>> j<E> j(Class<E> enumClass, i policy) {
        Preconditions.checkNotNull(enumClass);
        Preconditions.checkNotNull(policy);
        return new j<>(policy, g(enumClass));
    }

    public final void a(b lock) {
        if (lock.b()) {
            return;
        }
        ArrayList<h> arrayList = f34461d.get();
        Objects.requireNonNull(arrayList);
        h a11 = lock.a();
        a11.b(this.f34462a, arrayList);
        arrayList.add(a11);
    }

    public ReentrantLock k(String lockName) {
        return l(lockName, false);
    }

    public ReentrantLock l(String lockName, boolean fair) {
        return this.f34462a == Policies.DISABLED ? new ReentrantLock(fair) : new c(this, new h(lockName), fair, null);
    }

    public ReentrantReadWriteLock m(String lockName) {
        return n(lockName, false);
    }

    public ReentrantReadWriteLock n(String lockName, boolean fair) {
        return this.f34462a == Policies.DISABLED ? new ReentrantReadWriteLock(fair) : new e(this, new h(lockName), fair, null);
    }

    public CycleDetectingLockFactory(i policy) {
        this.f34462a = (i) Preconditions.checkNotNull(policy);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends ReentrantReadWriteLock.ReadLock {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final e f34465a;

        public d(e readWriteLock) {
            super(readWriteLock);
            this.f34465a = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f34465a);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f34465a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f34465a);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f34465a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f34465a);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f34465a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f34465a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f34465a);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                CycleDetectingLockFactory.h(this.f34465a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends ReentrantReadWriteLock.WriteLock {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final e f34471a;

        public f(e readWriteLock) {
            super(readWriteLock);
            this.f34471a = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f34471a);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f34471a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f34471a);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f34471a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f34471a);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f34471a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f34471a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f34471a);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                CycleDetectingLockFactory.h(this.f34471a);
            }
        }
    }
}
