package o80;

import ba0.c2;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a0 extends g<x> {

    /* renamed from: c, reason: collision with root package name */
    public static final p80.h f76562c = p80.h.c("No @DisabledIfSystemProperty conditions resulting in 'disabled' execution encountered");

    public a0() {
        super(x.class);
    }

    public static /* synthetic */ String Q(x xVar) {
        return "The 'named' attribute must not be blank in " + xVar;
    }

    public static /* synthetic */ String R(x xVar) {
        return "The 'matches' attribute must not be blank in " + xVar;
    }

    @Override // o80.g
    public p80.h O() {
        return f76562c;
    }

    @Override // o80.g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public p80.h N(final x annotation) {
        String trim = annotation.named().trim();
        String matches = annotation.matches();
        c2.l(trim, new Supplier() { // from class: o80.y
            @Override // java.util.function.Supplier
            public final Object get() {
                return a0.Q(x.this);
            }
        });
        c2.l(matches, new Supplier() { // from class: o80.z
            @Override // java.util.function.Supplier
            public final Object get() {
                return a0.R(x.this);
            }
        });
        String property = System.getProperty(trim);
        return property == null ? p80.h.c(String.format("System property [%s] does not exist", trim)) : property.matches(matches) ? p80.h.b(String.format("System property [%s] with value [%s] matches regular expression [%s]", trim, property, matches), annotation.disabledReason()) : p80.h.c(String.format("System property [%s] with value [%s] does not match regular expression [%s]", trim, property, matches));
    }
}
