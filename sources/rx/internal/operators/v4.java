package rx.internal.operators;

import java.util.Arrays;
import rx.e;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class v4<T, Resource> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.o<Resource> f86194a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super Resource, ? extends rx.e<? extends T>> f86195b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.b<? super Resource> f86196c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86197d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f86198b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.f f86199c;

        public a(Object obj, qb0.f fVar) {
            this.f86198b = obj;
            this.f86199c = fVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            v4 v4Var = v4.this;
            if (v4Var.f86197d) {
                try {
                    v4Var.f86196c.call((Object) this.f86198b);
                } catch (Throwable th2) {
                    vb0.a.e(th2);
                    this.f86199c.onError(th2);
                    return;
                }
            }
            this.f86199c.h(t11);
            v4 v4Var2 = v4.this;
            if (v4Var2.f86197d) {
                return;
            }
            try {
                v4Var2.f86196c.call((Object) this.f86198b);
            } catch (Throwable th3) {
                vb0.a.e(th3);
                ac0.c.I(th3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.f
        public void onError(Throwable th2) {
            v4.this.b(this.f86199c, this.f86198b, th2);
        }
    }

    public v4(wb0.o<Resource> oVar, wb0.p<? super Resource, ? extends rx.e<? extends T>> pVar, wb0.b<? super Resource> bVar, boolean z11) {
        this.f86194a = oVar;
        this.f86195b = pVar;
        this.f86196c = bVar;
        this.f86197d = z11;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        try {
            Resource call = this.f86194a.call();
            try {
                rx.e<? extends T> call2 = this.f86195b.call(call);
                if (call2 == null) {
                    b(fVar, call, new NullPointerException("The single"));
                    return;
                }
                a aVar = new a(call, fVar);
                fVar.b(aVar);
                call2.j0(aVar);
            } catch (Throwable th2) {
                b(fVar, call, th2);
            }
        } catch (Throwable th3) {
            vb0.a.e(th3);
            fVar.onError(th3);
        }
    }

    public void b(qb0.f<? super T> fVar, Resource resource, Throwable th2) {
        vb0.a.e(th2);
        if (this.f86197d) {
            try {
                this.f86196c.call(resource);
            } catch (Throwable th3) {
                vb0.a.e(th3);
                th2 = new CompositeException(Arrays.asList(th2, th3));
            }
        }
        fVar.onError(th2);
        if (this.f86197d) {
            return;
        }
        try {
            this.f86196c.call(resource);
        } catch (Throwable th4) {
            vb0.a.e(th4);
            ac0.c.I(th4);
        }
    }
}
