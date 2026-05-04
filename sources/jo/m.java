package jo;

import ho.p0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final p0<l> f64467a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p0<l> {
        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l get() {
            return new n();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p0<l> {
        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l get() {
            return new c(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends AtomicLong implements l {
        public c() {
        }

        @Override // jo.l
        public void add(long x11) {
            getAndAdd(x11);
        }

        @Override // jo.l
        public void increment() {
            getAndIncrement();
        }

        @Override // jo.l
        public long sum() {
            return get();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        p0<l> bVar;
        try {
            new n();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f64467a = bVar;
    }

    public static l a() {
        return f64467a.get();
    }
}
