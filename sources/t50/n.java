package t50;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f89631b = b.f89632a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        int a();

        @m80.k
        a b(int i11, @m80.k TimeUnit timeUnit);

        @m80.k
        okhttp3.n c(@m80.k okhttp3.l lVar) throws IOException;

        @m80.k
        t50.b call();

        @m80.l
        f connection();

        @m80.k
        a d(int i11, @m80.k TimeUnit timeUnit);

        @m80.k
        a e(int i11, @m80.k TimeUnit timeUnit);

        int f();

        int g();

        @m80.k
        okhttp3.l request();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f89632a = new b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interceptor.kt\nokhttp3/Interceptor$Companion$invoke$1\n*L\n1#1,105:1\n*E\n"})
        public static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<a, okhttp3.n> f89633a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(x00.l<? super a, okhttp3.n> lVar) {
                this.f89633a = lVar;
            }

            @Override // t50.n
            @m80.k
            public final okhttp3.n intercept(@m80.k a it) {
                g0.p(it, "it");
                return this.f89633a.invoke(it);
            }
        }

        @m80.k
        public final n a(@m80.k x00.l<? super a, okhttp3.n> block) {
            g0.p(block, "block");
            return new a(block);
        }
    }

    @m80.k
    okhttp3.n intercept(@m80.k a aVar) throws IOException;
}
