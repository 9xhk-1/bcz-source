package s40;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface e0<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f87661a = a.f87662a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f87662a = new a();

        @m80.k
        public final String a(@m80.k e0<?> format) {
            List e11;
            kotlin.jvm.internal.g0.p(format, "format");
            if (!(format instanceof s40.a)) {
                throw new NoWhenBranchMatchedException();
            }
            u40.f e12 = ((s40.a) format).e();
            e11 = j0.e();
            return h0.b(e12, e11);
        }
    }

    @m80.l
    T a(@m80.k CharSequence charSequence);

    @m80.k
    <A extends Appendable> A b(@m80.k A a11, T t11);

    @m80.k
    String c(T t11);

    T d(@m80.k CharSequence charSequence);
}
