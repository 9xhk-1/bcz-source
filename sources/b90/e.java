package b90;

import ba0.h4;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.support.hierarchical.m;
import org.opentest4j.TestAbortedException;
import y90.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6503d = "org.junit.internal.AssumptionViolatedException";

    /* renamed from: c, reason: collision with root package name */
    public static final y90.e f6502c = g.c(e.class);

    /* renamed from: e, reason: collision with root package name */
    public static final String f6504e = "Failed to load class org.junit.internal.AssumptionViolatedException: only supporting " + TestAbortedException.class.getName() + " for aborted execution.";

    /* renamed from: f, reason: collision with root package name */
    public static final Predicate<? super Throwable> f6505f = k();

    public e() {
        super(f6505f);
    }

    public static /* synthetic */ String i() {
        return f6504e + " Note that " + f6503d + " requires that Hamcrest is on the classpath.";
    }

    public static Predicate<? super Throwable> k() {
        b bVar = new b(TestAbortedException.class);
        try {
            Class<?> i11 = ReflectionUtils.X1(f6503d).i();
            return i11 != null ? bVar.or(new b(i11)) : bVar;
        } catch (Throwable th2) {
            h4.a(th2);
            f6502c.a(th2, th2 instanceof NoClassDefFoundError ? new Supplier() { // from class: b90.c
                @Override // java.util.function.Supplier
                public final Object get() {
                    return e.i();
                }
            } : new Supplier() { // from class: b90.d
                @Override // java.util.function.Supplier
                public final Object get() {
                    String str;
                    str = e.f6504e;
                    return str;
                }
            });
            return bVar;
        }
    }
}
