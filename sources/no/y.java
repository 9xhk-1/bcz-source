package no;

import ho.p0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final p0<x> f75364a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p0<x> {
        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x get() {
            return new z();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p0<x> {
        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x get() {
            return new c(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends AtomicLong implements x {
        public c() {
        }

        @Override // no.x
        public void add(long x11) {
            getAndAdd(x11);
        }

        @Override // no.x
        public void increment() {
            getAndIncrement();
        }

        @Override // no.x
        public long sum() {
            return get();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        p0<x> bVar;
        try {
            new z();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f75364a = bVar;
    }

    public static x a() {
        return f75364a.get();
    }
}
