package po;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.q6;
import com.google.common.io.FileWriteMode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;
import mo.k1;
import mo.l1;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final k1<File> f81084a = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements x<List<String>> {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f81085a = q6.q();

        @Override // po.x
        public boolean a(String line) {
            this.f81085a.add(line);
            return true;
        }

        @Override // po.x
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f81085a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements k1<File> {
        @Override // mo.k1, mo.k0
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public Iterable<File> a(File file) {
            File[] listFiles;
            return (!file.isDirectory() || (listFiles = file.listFiles()) == null) ? ImmutableList.of() : Collections.unmodifiableList(Arrays.asList(listFiles));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends po.e {

        /* renamed from: a, reason: collision with root package name */
        public final File f81086a;

        /* renamed from: b, reason: collision with root package name */
        public final ImmutableSet<FileWriteMode> f81087b;

        public /* synthetic */ c(File file, FileWriteMode[] fileWriteModeArr, a aVar) {
            this(file, fileWriteModeArr);
        }

        @Override // po.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public FileOutputStream c() throws IOException {
            return new FileOutputStream(this.f81086a, this.f81087b.contains(FileWriteMode.APPEND));
        }

        public String toString() {
            return "Files.asByteSink(" + this.f81086a + j2.O + this.f81087b + pn.j.f81007d;
        }

        public c(File file, FileWriteMode... modes) {
            this.f81086a = (File) Preconditions.checkNotNull(file);
            this.f81087b = ImmutableSet.copyOf(modes);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends f {

        /* renamed from: a, reason: collision with root package name */
        public final File f81088a;

        public /* synthetic */ d(File file, a aVar) {
            this(file);
        }

        @Override // po.f
        public byte[] o() throws IOException {
            try {
                FileInputStream fileInputStream = (FileInputStream) n.c().e(m());
                return g.v(fileInputStream, fileInputStream.getChannel().size());
            } finally {
            }
        }

        @Override // po.f
        public long p() throws IOException {
            if (this.f81088a.isFile()) {
                return this.f81088a.length();
            }
            throw new FileNotFoundException(this.f81088a.toString());
        }

        @Override // po.f
        public Optional<Long> q() {
            return this.f81088a.isFile() ? Optional.of(Long.valueOf(this.f81088a.length())) : Optional.absent();
        }

        @Override // po.f
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public FileInputStream m() throws IOException {
            return new FileInputStream(this.f81088a);
        }

        public String toString() {
            return "Files.asByteSource(" + this.f81088a + pn.j.f81007d;
        }

        public d(File file) {
            this.f81088a = (File) Preconditions.checkNotNull(file);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class e implements ho.i0<File> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f81089a = new a("IS_DIRECTORY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f81090b = new b("IS_FILE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ e[] f81091c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends e {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // ho.i0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean apply(File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends e {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // ho.i0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean apply(File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }
        }

        public e(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ e[] a() {
            return new e[]{f81089a, f81090b};
        }

        public static e valueOf(String name) {
            return (e) Enum.valueOf(e.class, name);
        }

        public static e[] values() {
            return (e[]) f81091c.clone();
        }

        public /* synthetic */ e(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    @d0
    @Deprecated
    @uo.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    @uo.a
    public static <T> T A(File file, Charset charset, x<T> xVar) throws IOException {
        return (T) e(file, charset).q(xVar);
    }

    public static List<String> B(File file, Charset charset) throws IOException {
        return (List) e(file, charset).q(new a());
    }

    public static String C(String pathname) {
        Preconditions.checkNotNull(pathname);
        if (pathname.length() == 0) {
            return ".";
        }
        Iterable<String> n11 = ho.m0.h('/').g().n(pathname);
        ArrayList arrayList = new ArrayList();
        for (String str : n11) {
            str.getClass();
            if (!str.equals(".")) {
                if (!str.equals(zr.m.f102856e)) {
                    arrayList.add(str);
                } else if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals(zr.m.f102856e)) {
                    arrayList.add(zr.m.f102856e);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String k11 = ho.a0.o('/').k(arrayList);
        if (pathname.charAt(0) == '/') {
            k11 = "/" + k11;
        }
        while (k11.startsWith("/../")) {
            k11 = k11.substring(3);
        }
        return k11.equals("/..") ? "/" : "".equals(k11) ? "." : k11;
    }

    public static byte[] D(File file) throws IOException {
        return c(file).o();
    }

    @uo.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    @Deprecated
    public static String E(File file, Charset charset) throws IOException {
        return e(file, charset).n();
    }

    public static void F(File file) throws IOException {
        Preconditions.checkNotNull(file);
        if (file.createNewFile() || file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        throw new IOException("Unable to update modification time of " + file);
    }

    @uo.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    @Deprecated
    public static void G(CharSequence from, File to2, Charset charset) throws IOException {
        d(to2, charset, new FileWriteMode[0]).c(from);
    }

    public static void H(byte[] from, File to2) throws IOException {
        b(to2, new FileWriteMode[0]).d(from);
    }

    @uo.l(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    @Deprecated
    public static void a(CharSequence from, File to2, Charset charset) throws IOException {
        d(to2, charset, FileWriteMode.APPEND).c(from);
    }

    public static po.e b(File file, FileWriteMode... modes) {
        return new c(file, modes, null);
    }

    public static f c(File file) {
        return new d(file, null);
    }

    public static i d(File file, Charset charset, FileWriteMode... modes) {
        return b(file, modes).a(charset);
    }

    public static j e(File file, Charset charset) {
        return c(file).a(charset);
    }

    public static void f(File from, File to2) throws IOException {
        Preconditions.checkArgument(!from.equals(to2), "Source %s and destination %s must be different", from, to2);
        c(from).g(b(to2, new FileWriteMode[0]));
    }

    public static void g(File from, OutputStream to2) throws IOException {
        c(from).f(to2);
    }

    @uo.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    @Deprecated
    public static void h(File from, Charset charset, Appendable to2) throws IOException {
        e(from, charset).e(to2);
    }

    public static void i(File file) throws IOException {
        Preconditions.checkNotNull(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    @go.a
    @Deprecated
    public static File j() {
        return h0.f81052a.a();
    }

    public static boolean k(File file1, File file2) throws IOException {
        Preconditions.checkNotNull(file1);
        Preconditions.checkNotNull(file2);
        if (file1 == file2 || file1.equals(file2)) {
            return true;
        }
        long length = file1.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return c(file1).e(c(file2));
        }
        return false;
    }

    public static l1<File> l() {
        return l1.h(f81084a);
    }

    public static String m(String fullName) {
        Preconditions.checkNotNull(fullName);
        String name = new File(fullName).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }

    public static String n(String file) {
        Preconditions.checkNotNull(file);
        String name = new File(file).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    @uo.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    @Deprecated
    public static no.m o(File file, no.n hashFunction) throws IOException {
        return c(file).j(hashFunction);
    }

    public static ho.i0<File> p() {
        return e.f81089a;
    }

    public static ho.i0<File> q() {
        return e.f81090b;
    }

    public static MappedByteBuffer r(File file) throws IOException {
        Preconditions.checkNotNull(file);
        return s(file, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer s(File file, FileChannel.MapMode mode) throws IOException {
        return u(file, mode, -1L);
    }

    public static MappedByteBuffer t(File file, FileChannel.MapMode mode, long size) throws IOException {
        Preconditions.checkArgument(size >= 0, "size (%s) may not be negative", size);
        return u(file, mode, size);
    }

    public static MappedByteBuffer u(File file, FileChannel.MapMode mode, long size) throws IOException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(mode);
        n c11 = n.c();
        try {
            FileChannel fileChannel = (FileChannel) c11.e(((RandomAccessFile) c11.e(new RandomAccessFile(file, mode == FileChannel.MapMode.READ_ONLY ? en.r.f50027a : "rw"))).getChannel());
            if (size == -1) {
                size = fileChannel.size();
            }
            return fileChannel.map(mode, 0L, size);
        } finally {
        }
    }

    public static void v(File from, File to2) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to2);
        Preconditions.checkArgument(!from.equals(to2), "Source %s and destination %s must be different", from, to2);
        if (from.renameTo(to2)) {
            return;
        }
        f(from, to2);
        if (from.delete()) {
            return;
        }
        if (to2.delete()) {
            throw new IOException("Unable to delete " + from);
        }
        throw new IOException("Unable to delete " + to2);
    }

    public static BufferedReader w(File file, Charset charset) throws FileNotFoundException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter x(File file, Charset charset) throws FileNotFoundException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @d0
    @Deprecated
    @uo.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    @uo.a
    public static <T> T y(File file, po.d<T> dVar) throws IOException {
        return (T) c(file).n(dVar);
    }

    @CheckForNull
    @Deprecated
    @uo.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    public static String z(File file, Charset charset) throws IOException {
        return e(file, charset).o();
    }
}
