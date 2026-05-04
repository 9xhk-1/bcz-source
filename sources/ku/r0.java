package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Properties;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class r0 implements ju.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<LinkedList<r0>> f68789d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final int f68790e = 50;

    /* renamed from: f, reason: collision with root package name */
    public static final String f68791f = "application/json";

    /* renamed from: g, reason: collision with root package name */
    public static final String f68792g = "text/x-java-properties";

    /* renamed from: h, reason: collision with root package name */
    public static final String f68793h = "application/hocon";

    /* renamed from: a, reason: collision with root package name */
    public ju.c f68794a;

    /* renamed from: b, reason: collision with root package name */
    public ju.o f68795b;

    /* renamed from: c, reason: collision with root package name */
    public ju.m f68796c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends ThreadLocal<LinkedList<r0>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkedList<r0> initialValue() {
            return new LinkedList<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68797a;

        static {
            int[] iArr = new int[ConfigSyntax.values().length];
            f68797a = iArr;
            try {
                iArr[ConfigSyntax.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68797a[ConfigSyntax.CONF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68797a[ConfigSyntax.PROPERTIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends r0 {

        /* renamed from: i, reason: collision with root package name */
        public final File f68798i;

        public d(File file, ju.o oVar) {
            this.f68798i = file;
            D(oVar);
        }

        @Override // ku.r0
        public Reader I() throws IOException {
            if (p.N()) {
                r0.O("Loading config from a file: " + this.f68798i);
            }
            return r0.K(new FileInputStream(this.f68798i));
        }

        @Override // ku.r0
        public ju.p a(String str) {
            File file = new File(str).isAbsolute() ? new File(str) : r0.M(this.f68798i, str);
            if (file == null) {
                return null;
            }
            if (file.exists()) {
                r0.O(file + " exists, so loading it as a file");
                return r0.n(file, options().l(null));
            }
            r0.O(file + " does not exist, so trying it as a classpath resource");
            return super.a(str);
        }

        @Override // ku.r0
        public ju.m h() {
            return x1.t(this.f68798i.getPath());
        }

        @Override // ku.r0
        public ConfigSyntax l() {
            return q.l(this.f68798i.getName());
        }

        @Override // ku.r0
        public String toString() {
            return d.class.getSimpleName() + pn.j.f81006c + this.f68798i.getPath() + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends r0 {

        /* renamed from: i, reason: collision with root package name */
        public final String f68799i;

        /* renamed from: j, reason: collision with root package name */
        public final String f68800j;

        public e(String str, String str2, ju.o oVar) {
            this.f68799i = str;
            this.f68800j = str2;
            D(oVar);
        }

        @Override // ku.r0
        public Reader I() throws IOException {
            throw new FileNotFoundException(this.f68800j);
        }

        @Override // ku.r0
        public ju.m h() {
            return x1.w(this.f68799i);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends r0 {

        /* renamed from: i, reason: collision with root package name */
        public final Properties f68801i;

        public f(Properties properties, ju.o oVar) {
            this.f68801i = properties;
            D(oVar);
        }

        @Override // ku.r0
        public Reader I() throws IOException {
            throw new ConfigException.BugOrBroken("reader() should not be called on props");
        }

        @Override // ku.r0
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public ku.c H(ju.m mVar, ju.o oVar) {
            if (p.N()) {
                r0.O("Loading config from properties " + this.f68801i);
            }
            return v0.e(mVar, this.f68801i);
        }

        @Override // ku.r0
        public ju.m h() {
            return x1.w("properties");
        }

        @Override // ku.r0
        public ConfigSyntax l() {
            return ConfigSyntax.PROPERTIES;
        }

        @Override // ku.r0
        public String toString() {
            return f.class.getSimpleName() + pn.j.f81006c + this.f68801i.size() + " props)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends r0 {

        /* renamed from: i, reason: collision with root package name */
        public final Reader f68802i;

        public g(Reader reader, ju.o oVar) {
            this.f68802i = reader;
            D(oVar);
        }

        @Override // ku.r0
        public Reader I() {
            if (p.N()) {
                r0.O("Loading config from reader " + this.f68802i);
            }
            return this.f68802i;
        }

        @Override // ku.r0
        public ju.m h() {
            return x1.w("Reader");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends k {

        /* renamed from: k, reason: collision with root package name */
        public final l f68803k;

        /* renamed from: l, reason: collision with root package name */
        public final String f68804l;

        public h(URL url, ju.o oVar, String str, l lVar) {
            super(url);
            this.f68803k = lVar;
            this.f68804l = str;
            D(oVar);
        }

        @Override // ku.r0.k, ku.r0
        public ju.p a(String str) {
            return this.f68803k.a(str);
        }

        @Override // ku.r0.k, ku.r0
        public ju.m h() {
            return x1.v(this.f68804l, this.f68807i);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends r0 implements l {

        /* renamed from: i, reason: collision with root package name */
        public final String f68805i;

        public i(String str, ju.o oVar) {
            this.f68805i = str;
            D(oVar);
        }

        public static String P(String str) {
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf < 0) {
                return null;
            }
            return str.substring(0, lastIndexOf);
        }

        @Override // ku.r0
        public Reader I() throws IOException {
            throw new ConfigException.BugOrBroken("reader() should not be called on resources");
        }

        @Override // ku.r0
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public ku.c H(ju.m mVar, ju.o oVar) throws IOException {
            ClassLoader d11 = oVar.d();
            if (d11 == null) {
                throw new ConfigException.BugOrBroken("null class loader; pass in a class loader or use Thread.currentThread().setContextClassLoader()");
            }
            Enumeration<URL> resources = d11.getResources(this.f68805i);
            if (!resources.hasMoreElements()) {
                if (p.N()) {
                    r0.O("Loading config from class loader " + d11 + " but there were no resources called " + this.f68805i);
                }
                throw new IOException("resource not found on classpath: " + this.f68805i);
            }
            ku.c v12 = w1.v1(mVar);
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                if (p.N()) {
                    r0.O("Loading config from resource '" + this.f68805i + "' URL " + nextElement.toExternalForm() + " from class loader " + d11);
                }
                v12 = v12.R0(r0.r(nextElement, oVar, this.f68805i, this).A());
            }
            return v12;
        }

        @Override // ku.r0
        public ju.p a(String str) {
            if (str.startsWith("/")) {
                return r0.t(str.substring(1), options().l(null));
            }
            String P = P(this.f68805i);
            if (P == null) {
                return r0.t(str, options().l(null));
            }
            return r0.t(P + "/" + str, options().l(null));
        }

        @Override // ku.r0
        public ju.m h() {
            return x1.u(this.f68805i);
        }

        @Override // ku.r0
        public ConfigSyntax l() {
            return q.l(this.f68805i);
        }

        @Override // ku.r0
        public String toString() {
            return i.class.getSimpleName() + pn.j.f81006c + this.f68805i + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends r0 {

        /* renamed from: i, reason: collision with root package name */
        public final String f68806i;

        public j(String str, ju.o oVar) {
            this.f68806i = str;
            D(oVar);
        }

        @Override // ku.r0
        public Reader I() {
            if (p.N()) {
                r0.O("Loading config from a String " + this.f68806i);
            }
            return new StringReader(this.f68806i);
        }

        @Override // ku.r0
        public ju.m h() {
            return x1.w("String");
        }

        @Override // ku.r0
        public String toString() {
            return j.class.getSimpleName() + pn.j.f81006c + this.f68806i + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface l {
        ju.p a(String str);
    }

    public static Reader K(InputStream inputStream) {
        return L(inputStream, "UTF-8");
    }

    public static Reader L(InputStream inputStream, String str) {
        try {
            return new BufferedReader(new InputStreamReader(inputStream, str));
        } catch (UnsupportedEncodingException e11) {
            throw new ConfigException.BugOrBroken("Java runtime does not support UTF-8", e11);
        }
    }

    public static File M(File file, String str) {
        File parentFile;
        if (new File(str).isAbsolute() || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        return new File(parentFile, str);
    }

    public static URL N(URL url, String str) {
        if (new File(str).isAbsolute()) {
            return null;
        }
        try {
            return url.toURI().resolve(new URI(str)).toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            return null;
        }
    }

    public static void O(String str) {
        if (p.N()) {
            p.M(str);
        }
    }

    public static String f(Class<?> cls, String str) {
        if (str.startsWith("/")) {
            return str.substring(1);
        }
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return name.substring(0, lastIndexOf).replace('.', '/') + "/" + str;
    }

    public static Reader i(Reader reader) {
        return new b(reader);
    }

    public static ku.c k(ju.t tVar) {
        if (tVar instanceof ku.c) {
            return (ku.c) tVar;
        }
        throw new ConfigException.WrongType(tVar.g(), "", "object at file root", tVar.valueType().name());
    }

    public static r0 n(File file, ju.o oVar) {
        return new d(file, oVar);
    }

    public static r0 o(String str, String str2, ju.o oVar) {
        return new e(str, str2, oVar);
    }

    public static r0 p(Properties properties, ju.o oVar) {
        return new f(properties, oVar);
    }

    public static r0 q(Reader reader, ju.o oVar) {
        return new g(i(reader), oVar);
    }

    public static r0 r(URL url, ju.o oVar, String str, l lVar) {
        return new h(url, oVar, str, lVar);
    }

    public static r0 s(Class<?> cls, String str, ju.o oVar) {
        return t(f(cls, str), oVar.j(cls.getClassLoader()));
    }

    public static r0 t(String str, ju.o oVar) {
        if (oVar.d() != null) {
            return new i(str, oVar);
        }
        throw new ConfigException.BugOrBroken("null class loader; pass in a class loader or use Thread.currentThread().setContextClassLoader()");
    }

    public static r0 u(String str, ju.o oVar) {
        return new j(str, oVar);
    }

    public static r0 v(URL url, ju.o oVar) {
        return url.getProtocol().equals("file") ? n(q.p(url), oVar) : new k(url, oVar);
    }

    public ku.d A() {
        return C(options());
    }

    public final ku.d B(ju.m mVar, ju.o oVar) {
        try {
            return H(mVar, oVar);
        } catch (IOException e11) {
            if (oVar.c()) {
                O(e11.getMessage() + ". Allowing Missing File, this can be turned off by setting ConfigParseOptions.allowMissing = false");
                return w1.w1(mVar);
            }
            O("exception loading " + mVar.description() + ": " + e11.getClass().getName() + ": " + e11.getMessage());
            throw new ConfigException.IO(mVar, e11.getClass().getName() + ": " + e11.getMessage(), e11);
        }
    }

    public final ku.d C(ju.o oVar) {
        ju.o j11 = j(oVar);
        return B(j11.f() != null ? x1.w(j11.f()) : this.f68796c, j11);
    }

    public void D(ju.o oVar) {
        this.f68795b = j(oVar);
        this.f68794a = new y1(this);
        if (this.f68795b.f() != null) {
            this.f68796c = x1.w(this.f68795b.f());
        } else {
            this.f68796c = h();
        }
    }

    public final lu.a E(Reader reader, ju.m mVar, ju.o oVar) throws IOException {
        return new u1(ku.l.a(d2.d(mVar, reader, oVar.g()), mVar, oVar), oVar);
    }

    public lu.a F(ju.m mVar, ju.o oVar) throws IOException {
        Reader J = J(oVar);
        ConfigSyntax e11 = e();
        if (e11 != null) {
            if (p.N() && oVar.g() != null) {
                O("Overriding syntax " + oVar.g() + " with Content-Type which specified " + e11);
            }
            oVar = oVar.m(e11);
        }
        try {
            return E(J, mVar, oVar);
        } finally {
            J.close();
        }
    }

    public final ku.d G(Reader reader, ju.m mVar, ju.o oVar) throws IOException {
        return oVar.g() == ConfigSyntax.PROPERTIES ? v0.i(reader, mVar) : h0.a(ku.l.a(d2.d(mVar, reader, oVar.g()), mVar, oVar), mVar, oVar, m());
    }

    public ku.d H(ju.m mVar, ju.o oVar) throws IOException {
        Reader J = J(oVar);
        ConfigSyntax e11 = e();
        if (e11 != null) {
            if (p.N() && oVar.g() != null) {
                O("Overriding syntax " + oVar.g() + " with Content-Type which specified " + e11);
            }
            oVar = oVar.m(e11);
        }
        try {
            return G(J, mVar, oVar);
        } finally {
            J.close();
        }
    }

    public abstract Reader I() throws IOException;

    public Reader J(ju.o oVar) throws IOException {
        return I();
    }

    public ju.p a(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return t(str, options().l(null));
    }

    @Override // ju.p
    public ju.l b(ju.o oVar) {
        ThreadLocal<LinkedList<r0>> threadLocal = f68789d;
        LinkedList<r0> linkedList = threadLocal.get();
        if (linkedList.size() >= 50) {
            throw new ConfigException.Parse(this.f68796c, "include statements nested more than 50 times, you probably have a cycle in your includes. Trace: " + linkedList);
        }
        linkedList.addFirst(this);
        try {
            ku.c k11 = k(C(oVar));
            linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                threadLocal.remove();
            }
            return k11;
        } catch (Throwable th2) {
            linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                f68789d.remove();
            }
            throw th2;
        }
    }

    public ConfigSyntax e() {
        return null;
    }

    @Override // ju.p
    public final ju.m g() {
        return this.f68796c;
    }

    public abstract ju.m h();

    public final ju.o j(ju.o oVar) {
        ConfigSyntax g11 = oVar.g();
        if (g11 == null) {
            g11 = l();
        }
        if (g11 == null) {
            g11 = ConfigSyntax.CONF;
        }
        ju.o a11 = oVar.m(g11).a(p.f());
        return a11.k(z1.l(a11.e()));
    }

    public ConfigSyntax l() {
        return null;
    }

    public ju.c m() {
        return this.f68794a;
    }

    @Override // ju.p
    public ju.o options() {
        return this.f68795b;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public ju.l w() {
        return k(C(options()));
    }

    public lu.a x() {
        return z(options());
    }

    public final lu.a y(ju.m mVar, ju.o oVar) {
        try {
            return F(mVar, oVar);
        } catch (IOException e11) {
            if (oVar.c()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new a0(new ArrayList()));
                return new u1(new c0(arrayList, mVar), oVar);
            }
            O("exception loading " + mVar.description() + ": " + e11.getClass().getName() + ": " + e11.getMessage());
            throw new ConfigException.IO(mVar, e11.getClass().getName() + ": " + e11.getMessage(), e11);
        }
    }

    public final lu.a z(ju.o oVar) {
        ju.o j11 = j(oVar);
        return y(j11.f() != null ? x1.w(j11.f()) : this.f68796c, j11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends r0 {

        /* renamed from: i, reason: collision with root package name */
        public final URL f68807i;

        /* renamed from: j, reason: collision with root package name */
        public String f68808j;

        public k(URL url) {
            this.f68808j = null;
            this.f68807i = url;
        }

        public static String P(ju.o oVar) {
            if (oVar.g() == null) {
                return null;
            }
            int i11 = c.f68797a[oVar.g().ordinal()];
            if (i11 == 1) {
                return r0.f68791f;
            }
            if (i11 == 2) {
                return r0.f68793h;
            }
            if (i11 != 3) {
                return null;
            }
            return r0.f68792g;
        }

        @Override // ku.r0
        public Reader I() throws IOException {
            throw new ConfigException.BugOrBroken("reader() without options should not be called on ParseableURL");
        }

        @Override // ku.r0
        public Reader J(ju.o oVar) throws IOException {
            try {
                if (p.N()) {
                    r0.O("Loading config from a URL: " + this.f68807i.toExternalForm());
                }
                URLConnection openConnection = this.f68807i.openConnection();
                String P = P(oVar);
                if (P != null) {
                    openConnection.setRequestProperty("Accept", P);
                }
                openConnection.connect();
                String contentType = openConnection.getContentType();
                this.f68808j = contentType;
                if (contentType != null) {
                    if (p.N()) {
                        r0.O("URL sets Content-Type: '" + this.f68808j + "'");
                    }
                    String trim = this.f68808j.trim();
                    this.f68808j = trim;
                    int indexOf = trim.indexOf(59);
                    if (indexOf >= 0) {
                        this.f68808j = this.f68808j.substring(0, indexOf);
                    }
                }
                return r0.K(openConnection.getInputStream());
            } catch (FileNotFoundException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new ConfigException.BugOrBroken("Cannot load config from URL: " + this.f68807i.toExternalForm(), e12);
            }
        }

        @Override // ku.r0
        public ju.p a(String str) {
            URL N = r0.N(this.f68807i, str);
            if (N == null) {
                return null;
            }
            return r0.v(N, options().l(null));
        }

        @Override // ku.r0
        public ConfigSyntax e() {
            String str = this.f68808j;
            if (str != null) {
                if (str.equals(r0.f68791f)) {
                    return ConfigSyntax.JSON;
                }
                if (this.f68808j.equals(r0.f68792g)) {
                    return ConfigSyntax.PROPERTIES;
                }
                if (this.f68808j.equals(r0.f68793h)) {
                    return ConfigSyntax.CONF;
                }
                if (p.N()) {
                    r0.O("'" + this.f68808j + "' isn't a known content type");
                }
            }
            return null;
        }

        @Override // ku.r0
        public ju.m h() {
            return x1.x(this.f68807i);
        }

        @Override // ku.r0
        public ConfigSyntax l() {
            return q.l(this.f68807i.getPath());
        }

        @Override // ku.r0
        public String toString() {
            return getClass().getSimpleName() + pn.j.f81006c + this.f68807i.toExternalForm() + pn.j.f81007d;
        }

        public k(URL url, ju.o oVar) {
            this(url);
            D(oVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends FilterReader {
        public b(Reader reader) {
            super(reader);
        }

        @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
