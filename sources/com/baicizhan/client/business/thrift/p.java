package com.baicizhan.client.business.thrift;

import org.apache.thrift.TServiceClient;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f16667a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f16668b;

        public a(final l val$builder, final RuntimeException val$runtimeException) {
            this.f16667a = val$builder;
            this.f16668b = val$runtimeException;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> subscriber) {
            try {
                subscriber.onNext((TServiceClient) this.f16667a.a());
                subscriber.onCompleted();
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof IllegalStateException) {
                    th = this.f16668b;
                }
                subscriber.onError(th);
            }
        }
    }

    public static <T extends TServiceClient> rx.c<T> a(final l<T> builder) {
        return rx.c.j1(new a(builder, new RuntimeException("createClient")));
    }

    public static <T extends TServiceClient> rx.c<T> b(final String domain) {
        return a(new l(domain));
    }
}
