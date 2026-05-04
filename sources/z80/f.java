package z80;

import ba0.e4;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final y90.e f102371a = y90.g.c(f.class);

    /* renamed from: b, reason: collision with root package name */
    public static final p80.h f102372b = p80.h.c("No 'disabled' conditions encountered");

    public p80.h c(a90.o extensionRegistry, v80.e0 configuration, final p80.n context) {
        return (p80.h) extensionRegistry.a(p80.k.class).filter(configuration.f()).map(new Function() { // from class: z80.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                p80.h d11;
                d11 = f.this.d((p80.k) obj, context);
                return d11;
            }
        }).filter(new o80.f()).findFirst().orElse(f102372b);
    }

    public final p80.h d(p80.k condition, p80.n context) {
        try {
            p80.h h11 = condition.h(context);
            f(condition.getClass(), h11, context);
            return h11;
        } catch (Exception e11) {
            throw e(condition.getClass(), e11);
        }
    }

    public final c e(Class<?> conditionType, Exception ex2) {
        String str;
        if (e4.h(ex2.getMessage())) {
            str = ": " + ex2.getMessage();
        } else {
            str = "";
        }
        return new c(String.format("Failed to evaluate condition [%s]%s", conditionType.getName(), str), ex2);
    }

    public final void f(final Class<?> conditionType, final p80.h result, final p80.n context) {
        f102371a.l(new Supplier() { // from class: z80.e
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Evaluation of condition [%s] on [%s] resulted in: %s", conditionType.getName(), context.e().get(), result);
                return format;
            }
        });
    }
}
