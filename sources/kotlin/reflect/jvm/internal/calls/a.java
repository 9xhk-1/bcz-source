package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.g0;
import l10.g;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a<M extends Member> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.reflect.jvm.internal.calls.a$a, reason: collision with other inner class name */
    public static final class C0783a {
        public static <M extends Member> void a(@k a<? extends M> aVar, @k Object[] args) {
            g0.p(args, "args");
            if (g.a(aVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + g.a(aVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    @k
    List<Type> a();

    M b();

    @l
    Object call(@k Object[] objArr);

    @k
    Type getReturnType();
}
