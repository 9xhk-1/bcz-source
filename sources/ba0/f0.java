package ba0;

import java.nio.file.Path;
import java.util.function.Predicate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6529a = ".class";

    /* renamed from: b, reason: collision with root package name */
    public static final String f6530b = "package-info.class";

    /* renamed from: c, reason: collision with root package name */
    public static final String f6531c = "module-info.class";

    public static /* synthetic */ boolean a(Path path) {
        return !d(path);
    }

    public static /* synthetic */ boolean b(Path path) {
        return f(path) && e(path) && d(path);
    }

    public static Predicate<Path> c() {
        return new Predicate() { // from class: ba0.e0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f0.b((Path) obj);
            }
        };
    }

    public static boolean d(Path file) {
        Path fileName;
        String path;
        fileName = file.getFileName();
        path = fileName.toString();
        return path.endsWith(".class");
    }

    public static boolean e(Path path) {
        boolean endsWith;
        endsWith = path.endsWith(f6531c);
        return !endsWith;
    }

    public static boolean f(Path path) {
        boolean endsWith;
        endsWith = path.endsWith(f6530b);
        return !endsWith;
    }

    public static Predicate<Path> g() {
        return new Predicate() { // from class: ba0.d0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f0.a((Path) obj);
            }
        };
    }
}
