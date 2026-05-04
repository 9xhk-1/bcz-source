package o80;

import ba0.c2;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a1 extends g<x0> {

    /* renamed from: c, reason: collision with root package name */
    public static final p80.h f76563c = p80.h.c("No @EnabledIfSystemProperty conditions resulting in 'disabled' execution encountered");

    public a1() {
        super(x0.class);
    }

    public static /* synthetic */ String Q(x0 x0Var) {
        return "The 'named' attribute must not be blank in " + x0Var;
    }

    public static /* synthetic */ String R(x0 x0Var) {
        return "The 'matches' attribute must not be blank in " + x0Var;
    }

    @Override // o80.g
    public p80.h O() {
        return f76563c;
    }

    @Override // o80.g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public p80.h N(final x0 annotation) {
        String trim = annotation.named().trim();
        String matches = annotation.matches();
        c2.l(trim, new Supplier() { // from class: o80.y0
            @Override // java.util.function.Supplier
            public final Object get() {
                return a1.Q(x0.this);
            }
        });
        c2.l(matches, new Supplier() { // from class: o80.z0
            @Override // java.util.function.Supplier
            public final Object get() {
                return a1.R(x0.this);
            }
        });
        String property = System.getProperty(trim);
        return property == null ? p80.h.b(String.format("System property [%s] does not exist", trim), annotation.disabledReason()) : property.matches(matches) ? p80.h.c(String.format("System property [%s] with value [%s] matches regular expression [%s]", trim, property, matches)) : p80.h.b(String.format("System property [%s] with value [%s] does not match regular expression [%s]", trim, property, matches), annotation.disabledReason());
    }
}
