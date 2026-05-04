package org.junit.jupiter.api;

import ba0.h4;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.opentest4j.MultipleFailuresError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f {
    public static /* synthetic */ Throwable a(r80.a aVar) {
        ba0.c2.r(aVar, "individual executables must not be null");
        try {
            aVar.execute();
            return null;
        } catch (Throwable th2) {
            h4.a(th2);
            return th2;
        }
    }

    public static void b(String heading, Collection<r80.a> executables) {
        ba0.c2.r(executables, "executables collection must not be null");
        ba0.c2.g(executables, "individual executables must not be null");
        c(heading, executables.stream());
    }

    public static void c(String heading, Stream<r80.a> executables) {
        ba0.c2.r(executables, "executables stream must not be null");
        List list = (List) executables.map(new Function() { // from class: org.junit.jupiter.api.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f.a((r80.a) obj);
            }
        }).filter(new Predicate() { // from class: org.junit.jupiter.api.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((Throwable) obj);
            }
        }).collect(Collectors.toList());
        if (list.isEmpty()) {
            return;
        }
        final MultipleFailuresError multipleFailuresError = new MultipleFailuresError(heading, list);
        list.forEach(new Consumer() { // from class: org.junit.jupiter.api.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                MultipleFailuresError.this.addSuppressed((Throwable) obj);
            }
        });
        throw multipleFailuresError;
    }

    public static void d(String heading, r80.a... executables) {
        ba0.c2.p(executables, "executables array must not be null or empty");
        ba0.c2.i(executables, "individual executables must not be null");
        c(heading, Arrays.stream(executables));
    }

    public static void e(Collection<r80.a> executables) {
        b(null, executables);
    }

    public static void f(Stream<r80.a> executables) {
        c(null, executables);
    }

    public static void g(r80.a... executables) {
        d(null, executables);
    }
}
