package okio;

import a00.r0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.c0;
import l60.e1;
import l60.g1;
import l60.m;
import l60.r;
import m60.s;
import m60.x;
import m80.k;
import m80.l;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,142:1\n58#2,4:143\n58#2,22:147\n66#2,10:169\n62#2,3:179\n77#2,3:182\n58#2,22:185\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n55#1:143,4\n56#1:147,22\n55#1:169,10\n55#1:179,3\n55#1:182,3\n99#1:185,22\n*E\n"})
/* loaded from: classes8.dex */
public final class h extends b {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f77542i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final f f77543j = f.a.h(f.f77539b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final f f77544e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f77545f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<f, s> f77546g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f77547h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final f a() {
            return h.f77543j;
        }

        public a() {
        }
    }

    public h(@k f zipPath, @k b fileSystem, @k Map<f, s> entries, @l String str) {
        g0.p(zipPath, "zipPath");
        g0.p(fileSystem, "fileSystem");
        g0.p(entries, "entries");
        this.f77544e = zipPath;
        this.f77545f = fileSystem;
        this.f77546g = entries;
        this.f77547h = str;
    }

    private final List<f> K0(f fVar, boolean z11) {
        s sVar = this.f77546g.get(H0(fVar));
        if (sVar != null) {
            return r0.a6(sVar.c());
        }
        if (!z11) {
            return null;
        }
        throw new IOException("not a directory: " + fVar);
    }

    @Override // okio.b
    @k
    public e1 D0(@k f file, boolean z11) {
        g0.p(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // okio.b
    @k
    public g1 F0(@k f file) throws IOException {
        g0.p(file, "file");
        s sVar = this.f77546g.get(H0(file));
        if (sVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        r x02 = this.f77545f.x0(this.f77544e);
        m th2 = null;
        try {
            m e11 = l60.r0.e(x02.i0(sVar.s()));
            if (x02 != null) {
                try {
                    x02.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = e11;
        } catch (Throwable th4) {
            th = th4;
            if (x02 != null) {
                try {
                    x02.close();
                } catch (Throwable th5) {
                    yz.r.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        x.u(th2);
        return sVar.f() == 0 ? new m60.m(th2, sVar.t(), true) : new m60.m(new c0(new m60.m(th2, sVar.e(), true), new Inflater(true)), sVar.t(), false);
    }

    public final f H0(f fVar) {
        return f77543j.A(fVar, true);
    }

    @Override // okio.b
    public void I(@k f dir, boolean z11) {
        g0.p(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.b
    public void S(@k f source, @k f target) {
        g0.p(source, "source");
        g0.p(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.b
    public void V(@k f path, boolean z11) {
        g0.p(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.b
    @k
    public e1 i(@k f file, boolean z11) {
        g0.p(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.b
    @k
    public List<f> i0(@k f dir) {
        g0.p(dir, "dir");
        List<f> K0 = K0(dir, true);
        g0.m(K0);
        return K0;
    }

    @Override // okio.b
    public void k(@k f source, @k f target) {
        g0.p(source, "source");
        g0.p(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.b
    @l
    public List<f> k0(@k f dir) {
        g0.p(dir, "dir");
        return K0(dir, false);
    }

    @Override // okio.b
    @k
    public f q(@k f path) {
        g0.p(path, "path");
        f H0 = H0(path);
        if (this.f77546g.containsKey(H0)) {
            return H0;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.b
    @l
    public l60.s w0(@k f path) {
        Throwable th2;
        Throwable th3;
        g0.p(path, "path");
        s sVar = this.f77546g.get(H0(path));
        if (sVar == null) {
            return null;
        }
        if (sVar.s() != -1) {
            r x02 = this.f77545f.x0(this.f77544e);
            try {
                m e11 = l60.r0.e(x02.i0(sVar.s()));
                try {
                    sVar = x.q(e11, sVar);
                    if (e11 != null) {
                        try {
                            e11.close();
                        } catch (Throwable th4) {
                            th3 = th4;
                        }
                    }
                    th3 = null;
                } catch (Throwable th5) {
                    if (e11 != null) {
                        try {
                            e11.close();
                        } catch (Throwable th6) {
                            yz.r.a(th5, th6);
                        }
                    }
                    th3 = th5;
                    sVar = null;
                }
            } catch (Throwable th7) {
                if (x02 != null) {
                    try {
                        x02.close();
                    } catch (Throwable th8) {
                        yz.r.a(th7, th8);
                    }
                }
                th2 = th7;
                sVar = null;
            }
            if (th3 != null) {
                throw th3;
            }
            if (x02 != null) {
                try {
                    x02.close();
                } catch (Throwable th9) {
                    th2 = th9;
                }
            }
            th2 = null;
            if (th2 != null) {
                throw th2;
            }
        }
        return new l60.s(!sVar.u(), sVar.u(), null, sVar.u() ? null : Long.valueOf(sVar.t()), sVar.h(), sVar.o(), sVar.n(), null, 128, null);
    }

    @Override // okio.b
    @k
    public r x0(@k f file) {
        g0.p(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.b
    @k
    public r z0(@k f file, boolean z11, boolean z12) {
        g0.p(file, "file");
        throw new IOException("zip entries are not writable");
    }
}
