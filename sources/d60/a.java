package d60;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import l60.e1;
import l60.g1;
import l60.r0;
import l60.s0;
import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C0549a f47272a = C0549a.f47274a;

    /* renamed from: b, reason: collision with root package name */
    @g
    @k
    public static final a f47273b = new C0549a.C0550a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: d60.a$a, reason: collision with other inner class name */
    public static final class C0549a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0549a f47274a = new C0549a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: d60.a$a$a, reason: collision with other inner class name */
        public static final class C0550a implements a {
            @Override // d60.a
            public void a(@k File directory) throws IOException {
                g0.p(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        g0.o(file, "file");
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // d60.a
            public void b(@k File from, @k File to2) throws IOException {
                g0.p(from, "from");
                g0.p(to2, "to");
                c(to2);
                if (from.renameTo(to2)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to2);
            }

            @Override // d60.a
            public void c(@k File file) throws IOException {
                g0.p(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // d60.a
            public boolean d(@k File file) {
                g0.p(file, "file");
                return file.exists();
            }

            @Override // d60.a
            @k
            public e1 e(@k File file) throws FileNotFoundException {
                g0.p(file, "file");
                try {
                    return r0.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return r0.a(file);
                }
            }

            @Override // d60.a
            public long f(@k File file) {
                g0.p(file, "file");
                return file.length();
            }

            @Override // d60.a
            @k
            public g1 g(@k File file) throws FileNotFoundException {
                g0.p(file, "file");
                return r0.u(file);
            }

            @Override // d60.a
            @k
            public e1 h(@k File file) throws FileNotFoundException {
                g0.p(file, "file");
                try {
                    return s0.o(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return s0.o(file, false, 1, null);
                }
            }

            @k
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }

    void a(@k File file) throws IOException;

    void b(@k File file, @k File file2) throws IOException;

    void c(@k File file) throws IOException;

    boolean d(@k File file);

    @k
    e1 e(@k File file) throws FileNotFoundException;

    long f(@k File file);

    @k
    g1 g(@k File file) throws FileNotFoundException;

    @k
    e1 h(@k File file) throws FileNotFoundException;
}
