package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.q<? super T, Integer, Boolean> f85527a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85528a;

        /* renamed from: b, reason: collision with root package name */
        public int f85529b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85530c = gVar2;
            this.f85528a = true;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85530c.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85530c.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (!this.f85528a) {
                this.f85530c.onNext(t11);
                return;
            }
            try {
                wb0.q<? super T, Integer, Boolean> qVar = i3.this.f85527a;
                int i11 = this.f85529b;
                this.f85529b = i11 + 1;
                if (qVar.call(t11, Integer.valueOf(i11)).booleanValue()) {
                    request(1L);
                } else {
                    this.f85528a = false;
                    this.f85530c.onNext(t11);
                }
            } catch (Throwable th2) {
                vb0.a.g(th2, this.f85530c, t11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements wb0.q<T, Integer, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.p f85532a;

        public b(wb0.p pVar) {
            this.f85532a = pVar;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t11, Integer num) {
            return (Boolean) this.f85532a.call(t11);
        }
    }

    public i3(wb0.q<? super T, Integer, Boolean> qVar) {
        this.f85527a = qVar;
    }

    public static <T> wb0.q<T, Integer, Boolean> b(wb0.p<? super T, Boolean> pVar) {
        return new b(pVar);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
