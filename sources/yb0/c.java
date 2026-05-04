package yb0;

import qb0.h;
import rx.c;
import rx.internal.operators.OnSubscribeAutoConnect;
import rx.internal.operators.z0;
import wb0.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c<T> extends rx.c<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.b<h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h[] f99853a;

        public a(h[] hVarArr) {
            this.f99853a = hVarArr;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(h hVar) {
            this.f99853a[0] = hVar;
        }
    }

    public c(c.a<T> aVar) {
        super(aVar);
    }

    public abstract void A7(wb0.b<? super h> bVar);

    public rx.c<T> B7() {
        return rx.c.I6(new z0(this));
    }

    public rx.c<T> w7() {
        return x7(1);
    }

    public rx.c<T> x7(int i11) {
        return y7(i11, m.a());
    }

    public rx.c<T> y7(int i11, wb0.b<? super h> bVar) {
        if (i11 > 0) {
            return rx.c.I6(new OnSubscribeAutoConnect(this, i11, bVar));
        }
        A7(bVar);
        return this;
    }

    public final h z7() {
        h[] hVarArr = new h[1];
        A7(new a(hVarArr));
        return hVarArr[0];
    }
}
