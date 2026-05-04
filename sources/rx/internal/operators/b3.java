package rx.internal.operators;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f85144a = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.q<Object, Object, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.q f85145a;

        public a(wb0.q qVar) {
            this.f85145a = qVar;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            Object obj3 = b3.f85144a;
            boolean z11 = obj == obj3;
            boolean z12 = obj2 == obj3;
            return (z11 && z12) ? Boolean.TRUE : (z11 || z12) ? Boolean.FALSE : (Boolean) this.f85145a.call(obj, obj2);
        }
    }

    public b3() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> rx.c<Object> a(rx.c<T> cVar) {
        return rx.c.v0(cVar, rx.c.M2(f85144a));
    }

    public static <T> rx.c<Boolean> b(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, wb0.q<? super T, ? super T, Boolean> qVar) {
        return rx.c.r7(a(cVar), a(cVar2), new a(qVar)).c(rx.internal.util.o.c());
    }
}
