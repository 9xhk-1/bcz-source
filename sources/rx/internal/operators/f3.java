package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f85334a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Deque<Object> f85335a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85336b = gVar2;
            this.f85335a = new ArrayDeque();
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85336b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85336b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        public void onNext(T t11) {
            if (f3.this.f85334a == 0) {
                this.f85336b.onNext(t11);
                return;
            }
            if (this.f85335a.size() == f3.this.f85334a) {
                this.f85336b.onNext(v.e(this.f85335a.removeFirst()));
            } else {
                request(1L);
            }
            this.f85335a.offerLast(v.j(t11));
        }
    }

    public f3(int i11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.f85334a = i11;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
