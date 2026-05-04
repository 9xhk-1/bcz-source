package w80;

import java.net.URI;
import java.util.function.Supplier;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.support.descriptor.MethodSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f95849a = "method";

    public static /* synthetic */ String a() {
        return "Invalid method URI (scheme-specific part must not be null). Please consult the Javadoc of " + da0.x.class.getName() + "#selectMethod(String) for details on the supported formats.";
    }

    public static /* synthetic */ String b(URI uri) {
        return "URI [" + uri + "] must have [method] scheme";
    }

    public static /* synthetic */ String c() {
        return "Invalid method URI (fragment must not be null). Please consult the Javadoc of " + da0.x.class.getName() + "#selectMethod(String) for details on the supported formats.";
    }

    public static MethodSource d(final URI uri) {
        ba0.c2.r(uri, "URI must not be null");
        ba0.c2.f("method".equals(uri.getScheme()), new Supplier() { // from class: w80.g3
            @Override // java.util.function.Supplier
            public final Object get() {
                return j3.b(uri);
            }
        });
        String[] A1 = ReflectionUtils.A1(((String) ba0.c2.s(uri.getSchemeSpecificPart(), new Supplier() { // from class: w80.h3
            @Override // java.util.function.Supplier
            public final Object get() {
                return j3.a();
            }
        })) + "#" + ((String) ba0.c2.s(uri.getFragment(), new Supplier() { // from class: w80.i3
            @Override // java.util.function.Supplier
            public final Object get() {
                return j3.c();
            }
        })));
        return MethodSource.from(A1[0], A1[1], A1[2]);
    }
}
