package da0;

import ba0.c2;
import da0.k;
import da0.q;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        INSTANCE;


        /* renamed from: a, reason: collision with root package name */
        public final Map<String, k> f47571a;

        a() {
            HashMap hashMap = new HashMap();
            for (final k kVar : ServiceLoader.load(k.class, ba0.m.b())) {
                final k kVar2 = (k) hashMap.put(kVar.getPrefix(), kVar);
                c2.f(kVar2 == null, new Supplier() { // from class: da0.p
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return q.a.a(k.this, kVar2);
                    }
                });
            }
            this.f47571a = Collections.unmodifiableMap(hashMap);
        }

        public static /* synthetic */ String a(k kVar, k kVar2) {
            String prefix = kVar.getPrefix();
            Objects.requireNonNull(kVar2);
            return String.format("Duplicate parser for prefix: [%s] candidate a: [%s] candidate b: [%s] ", prefix, kVar2.getClass().getName(), kVar.getClass().getName());
        }
    }

    public static Optional<? extends ca0.l> a(ca0.o identifier) {
        c2.r(identifier, "identifier must not be null");
        k kVar = (k) a.INSTANCE.f47571a.get(identifier.d());
        c2.r(kVar, "No parser for prefix: " + identifier.d());
        return kVar.a(identifier, new k.a() { // from class: da0.o
            @Override // da0.k.a
            public final Optional parse(String str) {
                return q.b(str);
            }
        });
    }

    public static Optional<? extends ca0.l> b(String identifier) {
        c2.r(identifier, "identifier must not be null");
        return a(ca0.o.f(identifier));
    }

    public static Stream<? extends ca0.l> c(Collection<ca0.o> identifiers) {
        c2.r(identifiers, "identifiers must not be null");
        return identifiers.stream().map(new Function() { // from class: da0.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return q.a((ca0.o) obj);
            }
        }).filter(new w80.d1()).map(new m());
    }

    public static Stream<? extends ca0.l> d(String... identifiers) {
        c2.r(identifiers, "identifiers must not be null");
        return Stream.of((Object[]) identifiers).map(new Function() { // from class: da0.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return q.b((String) obj);
            }
        }).filter(new w80.d1()).map(new m());
    }
}
