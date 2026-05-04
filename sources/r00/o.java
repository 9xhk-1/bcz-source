package r00;

import a00.r0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.io.OnErrorAction;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1292#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes8.dex */
public class o extends m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f82807a = new a();

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(File file, IOException exception) {
            g0.p(file, "<unused var>");
            g0.p(exception, "exception");
            throw exception;
        }
    }

    public static final boolean T(@m80.k File file, @m80.k File target, boolean z11, @m80.k final x00.p<? super File, ? super IOException, ? extends OnErrorAction> onError) {
        g0.p(file, "<this>");
        g0.p(target, "target");
        g0.p(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            Iterator<File> it = m.R(file).k(new x00.p() { // from class: r00.n
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 V;
                    V = o.V(x00.p.this, (File) obj, (IOException) obj2);
                    return V;
                }
            }).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.exists()) {
                    File file2 = new File(target, u0(next, file));
                    if (file2.exists() && (!next.isDirectory() || !file2.isDirectory())) {
                        if (z11) {
                            if (file2.isDirectory()) {
                                if (!c0(file2)) {
                                }
                            } else if (!file2.delete()) {
                            }
                        }
                        if (onError.invoke(file2, new FileAlreadyExistsException(next, file2, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file2.mkdirs();
                    } else {
                        boolean z12 = z11;
                        if (X(next, file2, z12, 0, 4, null).length() != next.length() && onError.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                        z11 = z12;
                    }
                } else if (onError.invoke(next, new NoSuchFileException(next, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (s unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean U(File file, File file2, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            pVar = a.f82807a;
        }
        return T(file, file2, z11, pVar);
    }

    public static final g2 V(x00.p pVar, File f11, IOException e11) {
        g0.p(f11, "f");
        g0.p(e11, "e");
        if (pVar.invoke(f11, e11) != OnErrorAction.TERMINATE) {
            return g2.f100423a;
        }
        throw new s(f11);
    }

    @m80.k
    public static final File W(@m80.k File file, @m80.k File target, boolean z11, int i11) {
        g0.p(file, "<this>");
        g0.p(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z11) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                r00.a.k(fileInputStream, fileOutputStream, i11);
                b.a(fileOutputStream, null);
                b.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File X(File file, File file2, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 8192;
        }
        return W(file, file2, z11, i11);
    }

    @yz.n(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @m80.k
    public static final File Y(@m80.k String prefix, @m80.l String str, @m80.l File file) {
        g0.p(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            g0.m(createTempFile);
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File Z(String str, String str2, File file, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vb.a.f93812o;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            file = null;
        }
        return Y(str, str2, file);
    }

    @yz.n(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @m80.k
    public static final File a0(@m80.k String prefix, @m80.l String str, @m80.l File file) {
        g0.p(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        g0.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    public static /* synthetic */ File b0(String str, String str2, File file, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vb.a.f93812o;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            file = null;
        }
        return a0(str, str2, file);
    }

    public static final boolean c0(@m80.k File file) {
        g0.p(file, "<this>");
        while (true) {
            boolean z11 = true;
            for (File file2 : m.Q(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z11) {
                        break;
                    }
                }
                z11 = false;
            }
            return z11;
        }
    }

    public static final boolean d0(@m80.k File file, @m80.k File other) {
        g0.p(file, "<this>");
        g0.p(other, "other");
        g f11 = j.f(file);
        g f12 = j.f(other);
        if (f12.i()) {
            return g0.g(file, other);
        }
        int h11 = f11.h() - f12.h();
        if (h11 < 0) {
            return false;
        }
        return f11.g().subList(h11, f11.h()).equals(f12.g());
    }

    public static final boolean e0(@m80.k File file, @m80.k String other) {
        g0.p(file, "<this>");
        g0.p(other, "other");
        return d0(file, new File(other));
    }

    @m80.k
    public static String f0(@m80.k File file) {
        g0.p(file, "<this>");
        String name = file.getName();
        g0.o(name, "getName(...)");
        return k0.N5(name, '.', "");
    }

    @m80.k
    public static final String g0(@m80.k File file) {
        g0.p(file, "<this>");
        char c11 = File.separatorChar;
        if (c11 != '/') {
            String path = file.getPath();
            g0.o(path, "getPath(...)");
            return f0.y2(path, c11, '/', false, 4, null);
        }
        String path2 = file.getPath();
        g0.o(path2, "getPath(...)");
        return path2;
    }

    @m80.k
    public static final String h0(@m80.k File file) {
        g0.p(file, "<this>");
        String name = file.getName();
        g0.o(name, "getName(...)");
        return k0.Y5(name, ".", null, 2, null);
    }

    @m80.k
    public static File i0(@m80.k File file) {
        g0.p(file, "<this>");
        g f11 = j.f(file);
        File e11 = f11.e();
        List<File> j02 = j0(f11.g());
        String separator = File.separator;
        g0.o(separator, "separator");
        return p0(e11, r0.r3(j02, separator, null, null, 0, null, null, 62, null));
    }

    public static final List<File> j0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (g0.g(name, ".")) {
                g2 g2Var = g2.f100423a;
            } else if (!g0.g(name, zr.m.f102856e)) {
                arrayList.add(file);
            } else if (arrayList.isEmpty() || g0.g(((File) r0.u3(arrayList)).getName(), zr.m.f102856e)) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static final g k0(g gVar) {
        return new g(gVar.e(), j0(gVar.g()));
    }

    @m80.k
    public static final File l0(@m80.k File file, @m80.k File base) {
        g0.p(file, "<this>");
        g0.p(base, "base");
        return new File(u0(file, base));
    }

    @m80.l
    public static final File m0(@m80.k File file, @m80.k File base) {
        g0.p(file, "<this>");
        g0.p(base, "base");
        String v02 = v0(file, base);
        if (v02 != null) {
            return new File(v02);
        }
        return null;
    }

    @m80.k
    public static final File n0(@m80.k File file, @m80.k File base) {
        g0.p(file, "<this>");
        g0.p(base, "base");
        String v02 = v0(file, base);
        return v02 != null ? new File(v02) : file;
    }

    @m80.k
    public static File o0(@m80.k File file, @m80.k File relative) {
        g0.p(file, "<this>");
        g0.p(relative, "relative");
        if (j.d(relative)) {
            return relative;
        }
        String file2 = file.toString();
        g0.o(file2, "toString(...)");
        if (file2.length() != 0) {
            char c11 = File.separatorChar;
            if (!k0.s3(file2, c11, false, 2, null)) {
                return new File(file2 + c11 + relative);
            }
        }
        return new File(file2 + relative);
    }

    @m80.k
    public static File p0(@m80.k File file, @m80.k String relative) {
        g0.p(file, "<this>");
        g0.p(relative, "relative");
        return o0(file, new File(relative));
    }

    @m80.k
    public static final File q0(@m80.k File file, @m80.k File relative) {
        g0.p(file, "<this>");
        g0.p(relative, "relative");
        g f11 = j.f(file);
        return o0(o0(f11.e(), f11.h() == 0 ? new File(zr.m.f102856e) : f11.j(0, f11.h() - 1)), relative);
    }

    @m80.k
    public static final File r0(@m80.k File file, @m80.k String relative) {
        g0.p(file, "<this>");
        g0.p(relative, "relative");
        return q0(file, new File(relative));
    }

    public static final boolean s0(@m80.k File file, @m80.k File other) {
        g0.p(file, "<this>");
        g0.p(other, "other");
        g f11 = j.f(file);
        g f12 = j.f(other);
        if (g0.g(f11.e(), f12.e()) && f11.h() >= f12.h()) {
            return f11.g().subList(0, f12.h()).equals(f12.g());
        }
        return false;
    }

    public static boolean t0(@m80.k File file, @m80.k String other) {
        g0.p(file, "<this>");
        g0.p(other, "other");
        return s0(file, new File(other));
    }

    @m80.k
    public static final String u0(@m80.k File file, @m80.k File base) {
        g0.p(file, "<this>");
        g0.p(base, "base");
        String v02 = v0(file, base);
        if (v02 != null) {
            return v02;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    public static final String v0(File file, File file2) {
        g k02 = k0(j.f(file));
        g k03 = k0(j.f(file2));
        if (!g0.g(k02.e(), k03.e())) {
            return null;
        }
        int h11 = k03.h();
        int h12 = k02.h();
        int min = Math.min(h12, h11);
        int i11 = 0;
        while (i11 < min && g0.g(k02.g().get(i11), k03.g().get(i11))) {
            i11++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = h11 - 1;
        if (i11 <= i12) {
            while (!g0.g(k03.g().get(i12).getName(), zr.m.f102856e)) {
                sb2.append(zr.m.f102856e);
                if (i12 != i11) {
                    sb2.append(File.separatorChar);
                }
                if (i12 != i11) {
                    i12--;
                }
            }
            return null;
        }
        if (i11 < h12) {
            if (i11 < h11) {
                sb2.append(File.separatorChar);
            }
            List g22 = r0.g2(k02.g(), i11);
            String separator = File.separator;
            g0.o(separator, "separator");
            r0.p3(g22, sb2, separator, null, null, 0, null, null, 124, null);
        }
        return sb2.toString();
    }
}
