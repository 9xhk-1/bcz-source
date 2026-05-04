package da0;

import ba0.c2;
import ba0.e4;
import ba0.g4;
import da0.k;
import da0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.9", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public class y0 implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final ca0.l f47594a;

    /* renamed from: b, reason: collision with root package name */
    public final SortedSet<Integer> f47595b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f47596a;

        /* renamed from: b, reason: collision with root package name */
        public int f47597b;

        public a(int start) {
            this.f47596a = start;
            this.f47597b = start;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class b implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47599a = "iteration";

        /* renamed from: b, reason: collision with root package name */
        public static final Pattern f47600b = Pattern.compile("(?<parentIdentifier>.+)\\[(?<indices>(\\d+)(\\.\\.\\d+)?(\\s*,\\s*(\\d+)(\\.\\.\\d+)?)*)]");

        public static /* synthetic */ y0 b(final b bVar, Matcher matcher, ca0.l lVar) {
            String group;
            bVar.getClass();
            group = matcher.group("indices");
            return x.t(lVar, Arrays.stream(group.split(",")).flatMapToInt(new Function() { // from class: da0.z0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    IntStream f11;
                    f11 = y0.b.this.f((String) obj);
                    return f11;
                }
            }).toArray());
        }

        @Override // da0.k
        public Optional<y0> a(ca0.o identifier, k.a context) {
            String group;
            final Matcher matcher = f47600b.matcher(identifier.e());
            c2.e(matcher.matches(), "Invalid format: must be IDENTIFIER[INDEX(,INDEX)*]");
            group = matcher.group("parentIdentifier");
            return context.parse(group).map(new Function() { // from class: da0.a1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return y0.b.b(y0.b.this, matcher, (ca0.l) obj);
                }
            });
        }

        public final IntStream f(String value) {
            return (IntStream) e4.n(zr.m.f102856e, value).a(new Function() { // from class: da0.b1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    IntStream of2;
                    of2 = IntStream.of(Integer.parseInt((String) obj));
                    return of2;
                }
            }, new BiFunction() { // from class: da0.c1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    IntStream rangeClosed;
                    rangeClosed = IntStream.rangeClosed(Integer.parseInt((String) obj), Integer.parseInt((String) obj2));
                    return rangeClosed;
                }
            });
        }

        @Override // da0.k
        public String getPrefix() {
            return f47599a;
        }
    }

    public y0(ca0.l parentSelector, int... iterationIndices) {
        this.f47594a = parentSelector;
        this.f47595b = g(iterationIndices);
    }

    public static /* synthetic */ String b(a aVar) {
        int i11 = aVar.f47596a;
        int i12 = aVar.f47597b;
        if (i11 == i12) {
            return String.valueOf(i11);
        }
        if (i11 == i12 - 1) {
            return aVar.f47596a + "," + aVar.f47597b;
        }
        return aVar.f47596a + zr.m.f102856e + aVar.f47597b;
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return this.f47594a.a().map(new Function() { // from class: da0.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ca0.o c11;
                c11 = ca0.o.c(y0.b.f47599a, String.format("%s[%s]", (ca0.o) obj, y0.this.d()));
                return c11;
            }
        });
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        a aVar = new a(this.f47595b.first().intValue());
        arrayList.add(aVar);
        Iterator<Integer> it = this.f47595b.tailSet(Integer.valueOf(aVar.f47596a + 1)).iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == aVar.f47597b + 1) {
                aVar.f47597b = intValue;
            } else {
                aVar = new a(intValue);
                arrayList.add(aVar);
            }
        }
        return (String) arrayList.stream().map(new Function() { // from class: da0.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return y0.b((y0.a) obj);
            }
        }).collect(Collectors.joining(","));
    }

    public SortedSet<Integer> e() {
        return this.f47595b;
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            y0 y0Var = (y0) o11;
            if (this.f47594a.equals(y0Var.f47594a) && this.f47595b.equals(y0Var.f47595b)) {
                return true;
            }
        }
        return false;
    }

    public ca0.l f() {
        return this.f47594a;
    }

    public final SortedSet<Integer> g(int[] iterationIndices) {
        return (SortedSet) Arrays.stream(iterationIndices).boxed().collect(Collectors.collectingAndThen(Collectors.toCollection(new Supplier() { // from class: da0.v0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new TreeSet();
            }
        }), new Function() { // from class: da0.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collections.unmodifiableSortedSet((TreeSet) obj);
            }
        }));
    }

    public int hashCode() {
        return Objects.hash(this.f47594a, this.f47595b);
    }

    public String toString() {
        return new g4(this).a("parentSelector", this.f47594a).a("iterationIndices", this.f47595b).toString();
    }
}
