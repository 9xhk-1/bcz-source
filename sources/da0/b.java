package da0;

import ba0.c2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final List<Pattern> f47516b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47517c;

    public b(String... patterns) {
        c2.p(patterns, "patterns array must not be null or empty");
        c2.i(patterns, "patterns array must not contain null elements");
        this.f47516b = (List) Arrays.stream(patterns).map(new ba0.s()).collect(Collectors.toList());
        this.f47517c = (String) Arrays.stream(patterns).collect(Collectors.joining("' OR '", "'", "'"));
    }

    @Override // ca0.v
    public abstract Predicate<String> h();

    public Optional<Pattern> o(final String className) {
        return this.f47516b.stream().filter(new Predicate() { // from class: da0.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean matches;
                matches = ((Pattern) obj).matcher(className).matches();
                return matches;
            }
        }).findAny();
    }
}
