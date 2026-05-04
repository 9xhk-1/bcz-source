package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class r3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.q<? super T, ? super Integer, Boolean> f86005a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.q<T, Integer, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.p f86006a;

        public a(wb0.p pVar) {
            this.f86006a = pVar;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t11, Integer num) {
            return (Boolean) this.f86006a.call(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f86007a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f86008b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qb0.g gVar, boolean z11, qb0.g gVar2) {
            super(gVar, z11);
            this.f86009c = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86008b) {
                return;
            }
            this.f86009c.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86008b) {
                return;
            }
            this.f86009c.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                wb0.q<? super T, ? super Integer, Boolean> qVar = r3.this.f86005a;
                int i11 = this.f86007a;
                this.f86007a = i11 + 1;
                if (qVar.call(t11, Integer.valueOf(i11)).booleanValue()) {
                    this.f86009c.onNext(t11);
                    return;
                }
                this.f86008b = true;
                this.f86009c.onCompleted();
                unsubscribe();
            } catch (Throwable th2) {
                this.f86008b = true;
                vb0.a.g(th2, this.f86009c, t11);
                unsubscribe();
            }
        }
    }

    public r3(wb0.p<? super T, Boolean> pVar) {
        this(new a(pVar));
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar, false, gVar);
        gVar.add(bVar);
        return bVar;
    }

    public r3(wb0.q<? super T, ? super Integer, Boolean> qVar) {
        this.f86005a = qVar;
    }
}
