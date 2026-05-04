package ha;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import wb0.p;
import wb0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements p<rx.c<? extends Throwable>, rx.c<?>> {

    /* renamed from: b, reason: collision with root package name */
    public static final String f59088b = "DefaultRetryStrategy";

    /* renamed from: a, reason: collision with root package name */
    public final List<Class<? extends Throwable>> f59089a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ha.a$a, reason: collision with other inner class name */
    public class C0670a implements p<c, rx.c<?>> {
        public C0670a() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<?> call(c result) {
            if (result.f59092a > 0) {
                qb.c.d("", "default rxjava retry count [%d]", Integer.valueOf(result.f59092a));
                qb.c.b(a.f59088b, "retry count: " + result.f59092a, new Object[0]);
                return rx.c.o6(result.f59092a, TimeUnit.SECONDS);
            }
            qb.c.d("", "default rxjava retry exit for error: " + result.f59093b, new Object[0]);
            qb.c.b(a.f59088b, "retry exit for error: " + result.f59093b, new Object[0]);
            return rx.c.T1(result.f59093b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements q<Throwable, Integer, c> {
        public b() {
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c call(Throwable error, Integer count) {
            c cVar = new c();
            if (!a.this.h(error) || count.intValue() >= 4) {
                cVar.f59092a = 0;
            } else {
                cVar.f59092a = count.intValue();
            }
            cVar.f59093b = error;
            return cVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f59092a;

        /* renamed from: b, reason: collision with root package name */
        public Throwable f59093b;

        public c() {
        }
    }

    public a(List<Class<? extends Throwable>> shouldRetryErrors) {
        this.f59089a = shouldRetryErrors;
    }

    @Override // wb0.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public rx.c<?> call(rx.c<? extends Throwable> attempts) {
        return attempts.v7(rx.c.b4(1, 4), new b()).b2(new C0670a());
    }

    public final boolean h(Throwable error) {
        List<Class<? extends Throwable>> list = this.f59089a;
        if (list == null) {
            return true;
        }
        Iterator<Class<? extends Throwable>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isAssignableFrom(error.getClass())) {
                return true;
            }
        }
        return false;
    }
}
