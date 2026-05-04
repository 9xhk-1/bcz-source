package rx.internal.operators;

import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class x4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.e<? extends T> f86371a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<Throwable, ? extends rx.e<? extends T>> f86372b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.p<Throwable, rx.e<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.e f86373a;

        public a(rx.e eVar) {
            this.f86373a = eVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.e<? extends T> call(Throwable th2) {
            return this.f86373a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.f f86374b;

        public b(qb0.f fVar) {
            this.f86374b = fVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f86374b.h(t11);
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            try {
                x4.this.f86372b.call(th2).j0(this.f86374b);
            } catch (Throwable th3) {
                vb0.a.h(th3, this.f86374b);
            }
        }
    }

    public x4(rx.e<? extends T> eVar, wb0.p<Throwable, ? extends rx.e<? extends T>> pVar) {
        if (eVar == null) {
            throw new NullPointerException("originalSingle must not be null");
        }
        if (pVar == null) {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
        this.f86371a = eVar;
        this.f86372b = pVar;
    }

    public static <T> x4<T> b(rx.e<? extends T> eVar, wb0.p<Throwable, ? extends rx.e<? extends T>> pVar) {
        return new x4<>(eVar, pVar);
    }

    public static <T> x4<T> h(rx.e<? extends T> eVar, rx.e<? extends T> eVar2) {
        if (eVar2 != null) {
            return new x4<>(eVar, new a(eVar2));
        }
        throw new NullPointerException("resumeSingleInCaseOfError must not be null");
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        b bVar = new b(fVar);
        fVar.b(bVar);
        this.f86371a.j0(bVar);
    }
}
