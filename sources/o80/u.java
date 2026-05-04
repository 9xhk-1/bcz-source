package o80;

import ba0.c2;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class u extends g<r> {

    /* renamed from: c, reason: collision with root package name */
    public static final p80.h f76606c = p80.h.c("No @DisabledIfEnvironmentVariable conditions resulting in 'disabled' execution encountered");

    public u() {
        super(r.class);
    }

    public static /* synthetic */ String Q(r rVar) {
        return "The 'named' attribute must not be blank in " + rVar;
    }

    public static /* synthetic */ String R(r rVar) {
        return "The 'matches' attribute must not be blank in " + rVar;
    }

    @Override // o80.g
    public p80.h O() {
        return f76606c;
    }

    @Override // o80.g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public p80.h N(final r annotation) {
        String trim = annotation.named().trim();
        String matches = annotation.matches();
        c2.l(trim, new Supplier() { // from class: o80.s
            @Override // java.util.function.Supplier
            public final Object get() {
                return u.Q(r.this);
            }
        });
        c2.l(matches, new Supplier() { // from class: o80.t
            @Override // java.util.function.Supplier
            public final Object get() {
                return u.R(r.this);
            }
        });
        String T = T(trim);
        return T == null ? p80.h.c(String.format("Environment variable [%s] does not exist", trim)) : T.matches(matches) ? p80.h.b(String.format("Environment variable [%s] with value [%s] matches regular expression [%s]", trim, T, matches), annotation.disabledReason()) : p80.h.c(String.format("Environment variable [%s] with value [%s] does not match regular expression [%s]", trim, T, matches));
    }

    public String T(String name) {
        return System.getenv(name);
    }
}
