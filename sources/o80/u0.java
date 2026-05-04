package o80;

import ba0.c2;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class u0 extends g<r0> {

    /* renamed from: c, reason: collision with root package name */
    public static final p80.h f76607c = p80.h.c("No @EnabledIfEnvironmentVariable conditions resulting in 'disabled' execution encountered");

    public u0() {
        super(r0.class);
    }

    public static /* synthetic */ String Q(r0 r0Var) {
        return "The 'matches' attribute must not be blank in " + r0Var;
    }

    public static /* synthetic */ String R(r0 r0Var) {
        return "The 'named' attribute must not be blank in " + r0Var;
    }

    @Override // o80.g
    public p80.h O() {
        return f76607c;
    }

    @Override // o80.g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public p80.h N(final r0 annotation) {
        String trim = annotation.named().trim();
        String matches = annotation.matches();
        c2.l(trim, new Supplier() { // from class: o80.s0
            @Override // java.util.function.Supplier
            public final Object get() {
                return u0.R(r0.this);
            }
        });
        c2.l(matches, new Supplier() { // from class: o80.t0
            @Override // java.util.function.Supplier
            public final Object get() {
                return u0.Q(r0.this);
            }
        });
        String T = T(trim);
        return T == null ? p80.h.b(String.format("Environment variable [%s] does not exist", trim), annotation.disabledReason()) : T.matches(matches) ? p80.h.c(String.format("Environment variable [%s] with value [%s] matches regular expression [%s]", trim, T, matches)) : p80.h.b(String.format("Environment variable [%s] with value [%s] does not match regular expression [%s]", trim, T, matches), annotation.disabledReason());
    }

    public String T(String name) {
        return System.getenv(name);
    }
}
