package m60;

import a00.i0;
import a00.m0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.e1;
import l60.g1;
import l60.r0;
import okio.f;
import u30.f0;
import u30.k0;
import yz.c0;
import yz.e0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n774#2:216\n865#2,2:217\n1563#2:219\n1634#2,3:220\n774#2:223\n865#2,2:224\n1563#2:226\n1634#2,3:227\n1617#2,9:230\n1869#2:239\n1870#2:241\n1626#2:242\n1617#2,9:243\n1869#2:252\n1870#2:254\n1626#2:255\n1#3:240\n1#3:253\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n75#1:216\n75#1:217,2\n76#1:219\n76#1:220,3\n91#1:223\n91#1:224,2\n92#1:226\n92#1:227,3\n178#1:230,9\n178#1:239\n178#1:241\n178#1:242\n179#1:243,9\n179#1:252\n179#1:254\n179#1:255\n178#1:240\n179#1:253\n*E\n"})
/* loaded from: classes8.dex */
public final class q extends okio.b {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f72461h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final okio.f f72462i = f.a.h(okio.f.f77539b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ClassLoader f72463e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final okio.b f72464f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c0 f72465g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final okio.f b() {
            return q.f72462i;
        }

        public final boolean c(okio.f fVar) {
            return !f0.a2(fVar.q(), ".class", true);
        }

        @m80.k
        public final okio.f d(@m80.k okio.f fVar, @m80.k okio.f base) {
            g0.p(fVar, "<this>");
            g0.p(base, "base");
            return b().v(f0.y2(k0.x4(fVar.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        public a() {
        }
    }

    public q(@m80.k ClassLoader classLoader, boolean z11, @m80.k okio.b systemFileSystem) {
        g0.p(classLoader, "classLoader");
        g0.p(systemFileSystem, "systemFileSystem");
        this.f72463e = classLoader;
        this.f72464f = systemFileSystem;
        this.f72465g = e0.c(new x00.a() { // from class: m60.p
            @Override // x00.a
            public final Object invoke() {
                List P0;
                P0 = q.P0(q.this);
                return P0;
            }
        });
        if (z11) {
            N0().size();
        }
    }

    private final okio.f L0(okio.f fVar) {
        return f72462i.A(fVar, true);
    }

    public static final List P0(q qVar) {
        return qVar.Q0(qVar.f72463e);
    }

    public static final boolean Y0(s entry) {
        g0.p(entry, "entry");
        return f72461h.c(entry.b());
    }

    @Override // okio.b
    @m80.k
    public e1 D0(@m80.k okio.f file, boolean z11) {
        g0.p(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.b
    @m80.k
    public g1 F0(@m80.k okio.f file) {
        g0.p(file, "file");
        if (!f72461h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        okio.f fVar = f72462i;
        URL resource = this.f72463e.getResource(okio.f.D(fVar, file, false, 2, null).u(fVar).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        g0.o(inputStream, "getInputStream(...)");
        return r0.v(inputStream);
    }

    @Override // okio.b
    public void I(@m80.k okio.f dir, boolean z11) {
        g0.p(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    public final List<Pair<okio.b, okio.f>> N0() {
        return (List) this.f72465g.getValue();
    }

    public final List<Pair<okio.b, okio.f>> Q0(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources("");
        g0.o(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        g0.o(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            g0.m(url);
            Pair<okio.b, okio.f> R0 = R0(url);
            if (R0 != null) {
                arrayList.add(R0);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        g0.o(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        g0.o(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            g0.m(url2);
            Pair<okio.b, okio.f> W0 = W0(url2);
            if (W0 != null) {
                arrayList2.add(W0);
            }
        }
        return a00.r0.I4(arrayList, arrayList2);
    }

    public final Pair<okio.b, okio.f> R0(URL url) {
        if (g0.g(url.getProtocol(), "file")) {
            return h1.a(this.f72464f, f.a.g(okio.f.f77539b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    @Override // okio.b
    public void S(@m80.k okio.f source, @m80.k okio.f target) {
        g0.p(source, "source");
        g0.p(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.b
    public void V(@m80.k okio.f path, boolean z11) {
        g0.p(path, "path");
        throw new IOException(this + " is read-only");
    }

    public final Pair<okio.b, okio.f> W0(URL url) {
        int Y3;
        String url2 = url.toString();
        g0.o(url2, "toString(...)");
        if (!f0.J2(url2, "jar:file:", false, 2, null) || (Y3 = k0.Y3(url2, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        f.a aVar = okio.f.f77539b;
        String substring = url2.substring(4, Y3);
        g0.o(substring, "substring(...)");
        return h1.a(x.i(f.a.g(aVar, new File(URI.create(substring)), false, 1, null), this.f72464f, new x00.l() { // from class: m60.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean Y0;
                Y0 = q.Y0((s) obj);
                return Boolean.valueOf(Y0);
            }
        }), f72462i);
    }

    public final String Z0(okio.f fVar) {
        return L0(fVar).u(f72462i).toString();
    }

    @Override // okio.b
    @m80.k
    public e1 i(@m80.k okio.f file, boolean z11) {
        g0.p(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.b
    @m80.k
    public List<okio.f> i0(@m80.k okio.f dir) {
        g0.p(dir, "dir");
        String Z0 = Z0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z11 = false;
        for (Pair<okio.b, okio.f> pair : N0()) {
            okio.b component1 = pair.component1();
            okio.f component2 = pair.component2();
            try {
                List<okio.f> i02 = component1.i0(component2.v(Z0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : i02) {
                    if (f72461h.c((okio.f) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f72461h.d((okio.f) it.next(), component2));
                }
                m0.s0(linkedHashSet, arrayList2);
                z11 = true;
            } catch (IOException unused) {
            }
        }
        if (z11) {
            return a00.r0.a6(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.b
    public void k(@m80.k okio.f source, @m80.k okio.f target) {
        g0.p(source, "source");
        g0.p(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.b
    @m80.l
    public List<okio.f> k0(@m80.k okio.f dir) {
        g0.p(dir, "dir");
        String Z0 = Z0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<okio.b, okio.f>> it = N0().iterator();
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<okio.b, okio.f> next = it.next();
            okio.b component1 = next.component1();
            okio.f component2 = next.component2();
            List<okio.f> k02 = component1.k0(component2.v(Z0));
            if (k02 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : k02) {
                    if (f72461h.c((okio.f) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(f72461h.d((okio.f) it2.next(), component2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                m0.s0(linkedHashSet, arrayList);
                z11 = true;
            }
        }
        if (z11) {
            return a00.r0.a6(linkedHashSet);
        }
        return null;
    }

    @Override // okio.b
    @m80.k
    public okio.f q(@m80.k okio.f path) {
        g0.p(path, "path");
        return L0(path);
    }

    @Override // okio.b
    @m80.l
    public l60.s w0(@m80.k okio.f path) {
        g0.p(path, "path");
        if (!f72461h.c(path)) {
            return null;
        }
        String Z0 = Z0(path);
        for (Pair<okio.b, okio.f> pair : N0()) {
            l60.s w02 = pair.component1().w0(pair.component2().v(Z0));
            if (w02 != null) {
                return w02;
            }
        }
        return null;
    }

    @Override // okio.b
    @m80.k
    public l60.r x0(@m80.k okio.f file) {
        g0.p(file, "file");
        if (!f72461h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String Z0 = Z0(file);
        for (Pair<okio.b, okio.f> pair : N0()) {
            try {
                return pair.component1().x0(pair.component2().v(Z0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.b
    @m80.k
    public l60.r z0(@m80.k okio.f file, boolean z11, boolean z12) {
        g0.p(file, "file");
        throw new IOException("resources are not writable");
    }

    public /* synthetic */ q(ClassLoader classLoader, boolean z11, okio.b bVar, int i11, kotlin.jvm.internal.v vVar) {
        this(classLoader, z11, (i11 & 4) != 0 ? okio.b.f77535b : bVar);
    }
}
