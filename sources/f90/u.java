package f90;

import f90.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.PreconditionViolationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class u extends f90.b<a0> {

    /* renamed from: b, reason: collision with root package name */
    public final c f51413b;

    /* renamed from: c, reason: collision with root package name */
    public Charset f51414c;

    /* renamed from: d, reason: collision with root package name */
    public int f51415d;

    /* renamed from: e, reason: collision with root package name */
    public s90.d f51416e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Iterator<f90.d> {

        /* renamed from: a, reason: collision with root package name */
        public final s90.d f51417a;

        /* renamed from: b, reason: collision with root package name */
        public final a0 f51418b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f51419c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f51420d;

        /* renamed from: e, reason: collision with root package name */
        public f90.d f51421e;

        /* renamed from: f, reason: collision with root package name */
        public String[] f51422f;

        public a(s90.d csvParser, a0 csvFileSource) {
            this.f51417a = csvParser;
            this.f51418b = csvFileSource;
            this.f51419c = csvFileSource.useHeadersInDisplayName();
            this.f51420d = ba0.n1.h(csvFileSource.nullValues());
            a();
        }

        public final void a() {
            try {
                String[] A0 = this.f51417a.A0();
                if (A0 == null) {
                    this.f51421e = null;
                    return;
                }
                if (this.f51419c && this.f51422f == null) {
                    this.f51422f = n.j(this.f51417a);
                }
                this.f51421e = n.n(A0, this.f51420d, this.f51419c, this.f51422f);
            } catch (Throwable th2) {
                n.k(th2, this.f51418b);
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f90.d next() {
            f90.d dVar = this.f51421e;
            a();
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51421e != null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f51423a = new b();

        public static /* synthetic */ String i(String str) {
            return "Classpath resource [" + str + "] must not be null or blank";
        }

        public static /* synthetic */ String j(String str) {
            return "Classpath resource [" + str + "] does not exist";
        }

        public static /* synthetic */ String k(String str) {
            return "File [" + str + "] must not be null or blank";
        }

        @Override // f90.u.c
        public InputStream a(Class<?> baseClass, final String path) {
            ba0.c2.l(path, new Supplier() { // from class: f90.w
                @Override // java.util.function.Supplier
                public final Object get() {
                    return u.b.i(path);
                }
            });
            return (InputStream) ba0.c2.s(baseClass.getResourceAsStream(path), new Supplier() { // from class: f90.x
                @Override // java.util.function.Supplier
                public final Object get() {
                    return u.b.j(path);
                }
            });
        }

        @Override // f90.u.c
        public InputStream b(final String path) {
            Path path2;
            InputStream newInputStream;
            ba0.c2.l(path, new Supplier() { // from class: f90.v
                @Override // java.util.function.Supplier
                public final Object get() {
                    return u.b.k(path);
                }
            });
            try {
                path2 = Paths.get(path, new String[0]);
                newInputStream = Files.newInputStream(path2, new OpenOption[0]);
                return newInputStream;
            } catch (IOException e11) {
                throw new JUnitException("File [" + path + "] could not be read", e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        InputStream a(Class<?> baseClass, String path);

        InputStream b(String path);

        default d d(final String path) {
            return new d() { // from class: f90.z
                @Override // f90.u.d
                public final InputStream a(p80.n nVar) {
                    InputStream g11;
                    g11 = u.c.this.g(path, nVar);
                    return g11;
                }
            };
        }

        default d f(final String path) {
            return new d() { // from class: f90.y
                @Override // f90.u.d
                public final InputStream a(p80.n nVar) {
                    InputStream h11;
                    h11 = u.c.this.h(path, nVar);
                    return h11;
                }
            };
        }

        /* synthetic */ default InputStream g(String str, p80.n nVar) {
            return a(nVar.Z(), str);
        }

        /* synthetic */ default InputStream h(String str, p80.n nVar) {
            return b(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface d {
        InputStream a(p80.n context);
    }

    public u() {
        this(b.f51423a);
    }

    public static /* synthetic */ void g(s90.d dVar, a0 a0Var) {
        try {
            dVar.H0();
        } catch (Throwable th2) {
            n.k(th2, a0Var);
        }
    }

    public final s90.d i(InputStream inputStream, a0 csvFileSource) {
        try {
            this.f51416e.g(inputStream, this.f51414c);
        } catch (Throwable th2) {
            n.k(th2, csvFileSource);
        }
        return this.f51416e;
    }

    public final Charset j(a0 csvFileSource) {
        try {
            return Charset.forName(csvFileSource.encoding());
        } catch (Exception e11) {
            throw new PreconditionViolationException("The charset supplied in " + csvFileSource + " is invalid", e11);
        }
    }

    @Override // f90.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Stream<? extends f90.d> d(final p80.n context, final a0 csvFileSource) {
        this.f51414c = j(csvFileSource);
        this.f51415d = csvFileSource.numLinesToSkip();
        this.f51416e = e0.d(csvFileSource);
        Stream stream = Arrays.stream(csvFileSource.resources());
        final c cVar = this.f51413b;
        Objects.requireNonNull(cVar);
        Stream map = stream.map(new Function() { // from class: f90.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u.c.this.d((String) obj);
            }
        });
        Stream stream2 = Arrays.stream(csvFileSource.files());
        final c cVar2 = this.f51413b;
        Objects.requireNonNull(cVar2);
        return ((List) ba0.c2.m((List) Stream.concat(map, stream2.map(new Function() { // from class: f90.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u.c.this.f((String) obj);
            }
        })).collect(Collectors.toList()), "Resources or files must not be empty")).stream().map(new Function() { // from class: f90.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InputStream a11;
                a11 = ((u.d) obj).a(p80.n.this);
                return a11;
            }
        }).map(new Function() { // from class: f90.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s90.d i11;
                i11 = u.this.i((InputStream) obj, csvFileSource);
                return i11;
            }
        }).flatMap(new Function() { // from class: f90.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream l11;
                l11 = u.this.l((s90.d) obj, csvFileSource);
                return l11;
            }
        });
    }

    public final Stream<f90.d> l(final s90.d csvParser, final a0 csvFileSource) {
        return (Stream) StreamSupport.stream(Spliterators.spliteratorUnknownSize(new a(csvParser, csvFileSource), 16), false).skip(this.f51415d).onClose(new Runnable() { // from class: f90.o
            @Override // java.lang.Runnable
            public final void run() {
                u.g(s90.d.this, csvFileSource);
            }
        });
    }

    public u(c inputStreamProvider) {
        this.f51413b = inputStreamProvider;
    }
}
