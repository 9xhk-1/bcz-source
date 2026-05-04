package po;

import com.google.common.base.Preconditions;
import com.google.common.collect.q6;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class g0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements x<List<String>> {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f81046a = q6.q();

        @Override // po.x
        public boolean a(String line) {
            this.f81046a.add(line);
            return true;
        }

        @Override // po.x
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f81046a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final URL f81047a;

        public /* synthetic */ b(URL url, a aVar) {
            this(url);
        }

        @Override // po.f
        public InputStream m() throws IOException {
            return this.f81047a.openStream();
        }

        public String toString() {
            return "Resources.asByteSource(" + this.f81047a + pn.j.f81007d;
        }

        public b(URL url) {
            this.f81047a = (URL) Preconditions.checkNotNull(url);
        }
    }

    public static f a(URL url) {
        return new b(url, null);
    }

    public static j b(URL url, Charset charset) {
        return a(url).a(charset);
    }

    public static void c(URL from, OutputStream to2) throws IOException {
        a(from).f(to2);
    }

    @uo.a
    public static URL d(Class<?> contextClass, String resourceName) {
        URL resource = contextClass.getResource(resourceName);
        Preconditions.checkArgument(resource != null, "resource %s relative to %s not found.", resourceName, contextClass.getName());
        return resource;
    }

    @uo.a
    public static URL e(String resourceName) {
        URL resource = ((ClassLoader) ho.b0.a(Thread.currentThread().getContextClassLoader(), g0.class.getClassLoader())).getResource(resourceName);
        Preconditions.checkArgument(resource != null, "resource %s not found.", resourceName);
        return resource;
    }

    @d0
    @uo.a
    public static <T> T f(URL url, Charset charset, x<T> xVar) throws IOException {
        return (T) b(url, charset).q(xVar);
    }

    public static List<String> g(URL url, Charset charset) throws IOException {
        return (List) f(url, charset, new a());
    }

    public static byte[] h(URL url) throws IOException {
        return a(url).o();
    }

    public static String i(URL url, Charset charset) throws IOException {
        return b(url, charset).n();
    }
}
