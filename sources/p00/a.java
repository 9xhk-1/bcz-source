package p00;

import a00.q;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import o00.m;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a extends m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: p00.a$a, reason: collision with other inner class name */
    public static final class C0966a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0966a f78547a = new C0966a();

        /* renamed from: b, reason: collision with root package name */
        @l
        @g
        public static final Integer f78548b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f78548b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f78548b = num2;
        }
    }

    private final boolean f(int i11) {
        Integer num = C0966a.f78548b;
        return num == null || num.intValue() >= i11;
    }

    @Override // o00.m
    public void a(@k Throwable cause, @k Throwable exception) {
        g0.p(cause, "cause");
        g0.p(exception, "exception");
        if (f(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // o00.m
    @k
    public List<Throwable> d(@k Throwable exception) {
        g0.p(exception, "exception");
        if (!f(19)) {
            return super.d(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        g0.o(suppressed, "getSuppressed(...)");
        return q.t(suppressed);
    }
}
