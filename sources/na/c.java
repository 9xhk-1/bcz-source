package na;

import org.apache.thrift.TServiceClient;
import qb0.g;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f75016a;

        public a(final b val$builder) {
            this.f75016a = val$builder;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g<? super T> subscriber) {
            try {
                subscriber.onNext((TServiceClient) this.f75016a.a());
                subscriber.onCompleted();
            } catch (Throwable th2) {
                subscriber.onError(th2);
            }
        }
    }

    public static <T extends TServiceClient> rx.c<T> a() {
        return b(new b());
    }

    public static <T extends TServiceClient> rx.c<T> b(final b<T> builder) {
        return rx.c.j1(new a(builder));
    }
}
