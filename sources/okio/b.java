package okio;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.e1;
import l60.g1;
import l60.r;
import l60.r0;
import l60.s;
import m60.q;
import m80.k;
import okio.f;
import q30.m;
import w00.j;
import w00.o;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,191:1\n58#2,22:192\n58#2,22:214\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n73#1:192,22\n95#1:214,22\n*E\n"})
/* loaded from: classes8.dex */
public abstract class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f77534a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public static final b f77535b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public static final f f77536c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public static final b f77537d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @j(name = ct.d.f46852f)
        @o
        @k
        public final b a(@k FileSystem fileSystem) {
            g0.p(fileSystem, "<this>");
            return new d(fileSystem);
        }

        public a() {
        }
    }

    static {
        b cVar;
        try {
            Class.forName("java.nio.file.Files");
            cVar = new e();
        } catch (ClassNotFoundException unused) {
            cVar = new c();
        }
        f77535b = cVar;
        f.a aVar = f.f77539b;
        String property = System.getProperty("java.io.tmpdir");
        g0.o(property, "getProperty(...)");
        f77536c = f.a.h(aVar, property, false, 1, null);
        ClassLoader classLoader = q.class.getClassLoader();
        g0.o(classLoader, "getClassLoader(...)");
        f77537d = new q(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ r A0(b bVar, f fVar, boolean z11, boolean z12, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return bVar.z0(fVar, z11, z12);
    }

    public static /* synthetic */ void E(b bVar, f fVar, boolean z11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        bVar.C(fVar, z11);
    }

    public static /* synthetic */ e1 E0(b bVar, f fVar, boolean z11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return bVar.D0(fVar, z11);
    }

    public static /* synthetic */ void L(b bVar, f fVar, boolean z11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        bVar.I(fVar, z11);
    }

    public static /* synthetic */ void Z(b bVar, f fVar, boolean z11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        bVar.V(fVar, z11);
    }

    public static /* synthetic */ void d0(b bVar, f fVar, boolean z11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        bVar.c0(fVar, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static /* synthetic */ Object e(b bVar, f file, boolean z11, l writerAction, int i11, Object obj) throws IOException {
        ?? r42;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        g0.p(file, "file");
        g0.p(writerAction, "writerAction");
        l60.l d11 = r0.d(bVar.D0(file, z11));
        Object th2 = null;
        try {
            Object invoke = writerAction.invoke(d11);
            d0.d(1);
            if (d11 != null) {
                try {
                    d11.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            d0.c(1);
            r42 = th2;
            th2 = invoke;
        } catch (Throwable th4) {
            d0.d(1);
            if (d11 != null) {
                try {
                    d11.close();
                } catch (Throwable th5) {
                    yz.r.a(th4, th5);
                }
            }
            d0.c(1);
            r42 = th4;
        }
        if (r42 == 0) {
            return th2;
        }
        throw r42;
    }

    @j(name = ct.d.f46852f)
    @o
    @k
    public static final b h0(@k FileSystem fileSystem) {
        return f77534a.a(fileSystem);
    }

    public static /* synthetic */ e1 j(b bVar, f fVar, boolean z11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return bVar.i(fVar, z11);
    }

    public static /* synthetic */ m s0(b bVar, f fVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return bVar.o0(fVar, z11);
    }

    public final void C(@k f dir, boolean z11) throws IOException {
        g0.p(dir, "dir");
        m60.e.c(this, dir, z11);
    }

    @k
    public final e1 C0(@k f file) throws IOException {
        g0.p(file, "file");
        return D0(file, false);
    }

    @k
    public abstract e1 D0(@k f fVar, boolean z11) throws IOException;

    @k
    public abstract g1 F0(@k f fVar) throws IOException;

    public final void H(@k f dir) throws IOException {
        g0.p(dir, "dir");
        I(dir, false);
    }

    public abstract void I(@k f fVar, boolean z11) throws IOException;

    public abstract void S(@k f fVar, @k f fVar2) throws IOException;

    public final void U(@k f path) throws IOException {
        g0.p(path, "path");
        V(path, false);
    }

    public abstract void V(@k f fVar, boolean z11) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @j(name = "-read")
    public final <T> T a(@k f file, @k l<? super l60.m, ? extends T> readerAction) throws IOException {
        ?? r52;
        g0.p(file, "file");
        g0.p(readerAction, "readerAction");
        l60.m e11 = r0.e(F0(file));
        T th2 = null;
        try {
            T invoke = readerAction.invoke(e11);
            d0.d(1);
            if (e11 != null) {
                try {
                    e11.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            d0.c(1);
            T t11 = th2;
            th2 = invoke;
            r52 = t11;
        } catch (Throwable th4) {
            d0.d(1);
            if (e11 != null) {
                try {
                    e11.close();
                } catch (Throwable th5) {
                    yz.r.a(th4, th5);
                }
            }
            d0.c(1);
            r52 = th4;
        }
        if (r52 == 0) {
            return th2;
        }
        throw r52;
    }

    public final void a0(@k f fileOrDirectory) throws IOException {
        g0.p(fileOrDirectory, "fileOrDirectory");
        c0(fileOrDirectory, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @j(name = "-write")
    public final <T> T c(@k f file, boolean z11, @k l<? super l60.l, ? extends T> writerAction) throws IOException {
        ?? r52;
        g0.p(file, "file");
        g0.p(writerAction, "writerAction");
        l60.l d11 = r0.d(D0(file, z11));
        T th2 = null;
        try {
            T invoke = writerAction.invoke(d11);
            d0.d(1);
            if (d11 != null) {
                try {
                    d11.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            d0.c(1);
            T t11 = th2;
            th2 = invoke;
            r52 = t11;
        } catch (Throwable th4) {
            d0.d(1);
            if (d11 != null) {
                try {
                    d11.close();
                } catch (Throwable th5) {
                    yz.r.a(th4, th5);
                }
            }
            d0.c(1);
            r52 = th4;
        }
        if (r52 == 0) {
            return th2;
        }
        throw r52;
    }

    public void c0(@k f fileOrDirectory, boolean z11) throws IOException {
        g0.p(fileOrDirectory, "fileOrDirectory");
        m60.e.d(this, fileOrDirectory, z11);
    }

    @k
    public final e1 f(@k f file) throws IOException {
        g0.p(file, "file");
        return i(file, false);
    }

    public final boolean f0(@k f path) throws IOException {
        g0.p(path, "path");
        return m60.e.e(this, path);
    }

    @k
    public abstract e1 i(@k f fVar, boolean z11) throws IOException;

    @k
    public abstract List<f> i0(@k f fVar) throws IOException;

    public abstract void k(@k f fVar, @k f fVar2) throws IOException;

    @m80.l
    public abstract List<f> k0(@k f fVar);

    @k
    public final m<f> m0(@k f dir) {
        g0.p(dir, "dir");
        return o0(dir, false);
    }

    @k
    public m<f> o0(@k f dir, boolean z11) {
        g0.p(dir, "dir");
        return m60.e.f(this, dir, z11);
    }

    @k
    public abstract f q(@k f fVar) throws IOException;

    public void r(@k f source, @k f target) throws IOException {
        g0.p(source, "source");
        g0.p(target, "target");
        m60.e.b(this, source, target);
    }

    @k
    public final s v0(@k f path) throws IOException {
        g0.p(path, "path");
        return m60.e.g(this, path);
    }

    public final void w(@k f dir) throws IOException {
        g0.p(dir, "dir");
        C(dir, false);
    }

    @m80.l
    public abstract s w0(@k f fVar) throws IOException;

    @k
    public abstract r x0(@k f fVar) throws IOException;

    @k
    public final r y0(@k f file) throws IOException {
        g0.p(file, "file");
        return z0(file, false, false);
    }

    @k
    public abstract r z0(@k f fVar, boolean z11, boolean z12) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
