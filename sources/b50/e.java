package b50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import y40.o;
import y40.p;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f6112a = e0.c(new x00.a() { // from class: b50.d
        @Override // x00.a
        public final Object invoke() {
            g e11;
            e11 = e.e();
            return e11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c f6113b = new a();

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final j f6114c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6115d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFileSystemJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystemJvm.kt\nkotlinx/io/files/FileSystemJvmKt$SystemFileSystem$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,118:1\n13346#2,2:119\n*S KotlinDebug\n*F\n+ 1 FileSystemJvm.kt\nkotlinx/io/files/FileSystemJvmKt$SystemFileSystem$1\n*L\n105#1:119,2\n*E\n"})
    public static final class a extends m {
        @Override // b50.c
        public o b(j path, boolean z11) {
            g0.p(path, "path");
            return y40.l.a(new FileOutputStream(path.a(), z11));
        }

        @Override // b50.c
        public void c(j path, boolean z11) {
            g0.p(path, "path");
            if (f(path)) {
                if (!path.a().delete()) {
                    throw new IOException("Deletion failed");
                }
            } else if (z11) {
                throw new FileNotFoundException("File does not exist: " + path.a());
            }
        }

        @Override // b50.c
        public boolean f(j path) {
            g0.p(path, "path");
            return path.a().exists();
        }

        @Override // b50.c
        public b50.b g(j path) {
            g0.p(path, "path");
            if (path.a().exists()) {
                return new b50.b(path.a().isFile(), path.a().isDirectory(), path.a().isFile() ? path.a().length() : -1L);
            }
            return null;
        }

        @Override // b50.c
        public p h(j path) {
            g0.p(path, "path");
            return y40.l.b(new FileInputStream(path.a()));
        }

        @Override // b50.c
        public Collection<j> i(j directory) {
            g0.p(directory, "directory");
            File a11 = directory.a();
            if (!a11.exists()) {
                throw new FileNotFoundException(a11.getAbsolutePath());
            }
            if (!a11.isDirectory()) {
                throw new IOException("Not a directory: " + a11.getAbsolutePath());
            }
            List j11 = a00.g0.j();
            String[] list = a11.list();
            if (list != null) {
                for (String str : list) {
                    j11.add(l.a(directory, str));
                }
            }
            return a00.g0.b(j11);
        }

        @Override // b50.c
        public void j(j source, j destination) {
            g0.p(source, "source");
            g0.p(destination, "destination");
            e.c().a(source, destination);
        }

        @Override // b50.c
        public j k(j path) {
            g0.p(path, "path");
            if (!path.a().exists()) {
                throw new FileNotFoundException(path.a().getAbsolutePath());
            }
            File canonicalFile = path.a().getCanonicalFile();
            g0.o(canonicalFile, "getCanonicalFile(...)");
            return new j(canonicalFile);
        }

        @Override // b50.c
        public void l(j path, boolean z11) {
            g0.p(path, "path");
            if (path.a().mkdirs()) {
                return;
            }
            if (z11) {
                throw new IOException("Path already exist: " + path);
            }
            if (path.a().isFile()) {
                throw new IOException("Path already exists and it's a file: " + path);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements g {
        @Override // b50.g
        public void a(j source, j destination) {
            g0.p(source, "source");
            g0.p(destination, "destination");
            throw new UnsupportedOperationException("Atomic move not supported");
        }
    }

    static {
        String property = System.getProperty("java.io.tmpdir");
        g0.o(property, "getProperty(...)");
        f6114c = k.a(property);
        String property2 = System.getProperty("os.name");
        f6115d = property2 != null ? f0.J2(property2, "Windows", false, 2, null) : false;
    }

    public static final g c() {
        return (g) f6112a.getValue();
    }

    public static final boolean d() {
        return f6115d;
    }

    public static final g e() {
        try {
            Class.forName("java.nio.file.Files");
            return new i();
        } catch (ClassNotFoundException unused) {
            return new b();
        }
    }
}
