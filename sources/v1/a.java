package v1;

import a3.x0;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.utils.GdxRuntimeException;
import en.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import pn.j;
import q1.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public File f92809a;

    /* renamed from: b, reason: collision with root package name */
    public Files.FileType f92810b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v1.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1248a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92811a;

        static {
            int[] iArr = new int[Files.FileType.values().length];
            f92811a = iArr;
            try {
                iArr[Files.FileType.Internal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92811a[Files.FileType.Classpath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92811a[Files.FileType.Absolute.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92811a[Files.FileType.External.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a() {
    }

    public static a P(String str) {
        try {
            File createTempFile = File.createTempFile(str, null);
            if (!createTempFile.delete()) {
                throw new IOException("Unable to delete temp file: " + createTempFile);
            }
            if (createTempFile.mkdir()) {
                return new a(createTempFile);
            }
            throw new IOException("Unable to create temp directory: " + createTempFile);
        } catch (IOException e11) {
            throw new GdxRuntimeException("Unable to create temp file.", e11);
        }
    }

    public static a Q(String str) {
        try {
            return new a(File.createTempFile(str, null));
        } catch (IOException e11) {
            throw new GdxRuntimeException("Unable to create temp file.", e11);
        }
    }

    public static void b(a aVar, a aVar2) {
        aVar2.x();
        for (a aVar3 : aVar.r()) {
            a a11 = aVar2.a(aVar3.z());
            if (aVar3.o()) {
                b(aVar3, a11);
            } else {
                c(aVar3, a11);
            }
        }
    }

    public static void c(a aVar, a aVar2) {
        try {
            aVar2.U(aVar.F(), false);
        } catch (Exception e11) {
            throw new GdxRuntimeException("Error copying source file: " + aVar.f92809a + " (" + aVar.f92810b + ")\nTo destination: " + aVar2.f92809a + " (" + aVar2.f92810b + j.f81007d, e11);
        }
    }

    public static boolean g(File file) {
        i(file, false);
        return file.delete();
    }

    public static void i(File file, boolean z11) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        int length = listFiles.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!listFiles[i11].isDirectory()) {
                listFiles[i11].delete();
            } else if (z11) {
                i(listFiles[i11], true);
            } else {
                g(listFiles[i11]);
            }
        }
    }

    public String A() {
        String name = this.f92809a.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    public a B() {
        File parentFile = this.f92809a.getParentFile();
        if (parentFile == null) {
            parentFile = this.f92810b == Files.FileType.Absolute ? new File("/") : new File("");
        }
        return new a(parentFile, this.f92810b);
    }

    public String C() {
        return this.f92809a.getPath().replace('\\', '/');
    }

    public String D() {
        String replace = this.f92809a.getPath().replace('\\', '/');
        int lastIndexOf = replace.lastIndexOf(46);
        return lastIndexOf == -1 ? replace : replace.substring(0, lastIndexOf);
    }

    public BufferedInputStream E(int i11) {
        return new BufferedInputStream(F(), i11);
    }

    public InputStream F() {
        Files.FileType fileType = this.f92810b;
        if (fileType == Files.FileType.Classpath || ((fileType == Files.FileType.Internal && !n().exists()) || (this.f92810b == Files.FileType.Local && !n().exists()))) {
            InputStream resourceAsStream = a.class.getResourceAsStream("/" + this.f92809a.getPath().replace('\\', '/'));
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new GdxRuntimeException("File not found: " + this.f92809a + " (" + this.f92810b + j.f81007d);
        }
        try {
            return new FileInputStream(n());
        } catch (Exception e11) {
            if (n().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
            }
            throw new GdxRuntimeException("Error reading file: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
        }
    }

    public int G(byte[] bArr, int i11, int i12) {
        InputStream F = F();
        int i13 = 0;
        while (true) {
            try {
                try {
                    int read = F.read(bArr, i11 + i13, i12 - i13);
                    if (read <= 0) {
                        x0.a(F);
                        return i13 - i11;
                    }
                    i13 += read;
                } catch (IOException e11) {
                    throw new GdxRuntimeException("Error reading file: " + this, e11);
                }
            } catch (Throwable th2) {
                x0.a(F);
                throw th2;
            }
        }
    }

    public byte[] H() {
        InputStream F = F();
        try {
            try {
                return x0.i(F, k());
            } catch (IOException e11) {
                throw new GdxRuntimeException("Error reading file: " + this, e11);
            }
        } finally {
            x0.a(F);
        }
    }

    public String I() {
        return J(null);
    }

    public String J(String str) {
        StringBuilder sb2 = new StringBuilder(k());
        InputStreamReader inputStreamReader = null;
        try {
            try {
                inputStreamReader = str == null ? new InputStreamReader(F()) : new InputStreamReader(F(), str);
                char[] cArr = new char[256];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        x0.a(inputStreamReader);
                        return sb2.toString();
                    }
                    sb2.append(cArr, 0, read);
                }
            } catch (IOException e11) {
                throw new GdxRuntimeException("Error reading layout file: " + this, e11);
            }
        } catch (Throwable th2) {
            x0.a(inputStreamReader);
            throw th2;
        }
    }

    public BufferedReader K(int i11) {
        return new BufferedReader(new InputStreamReader(F()), i11);
    }

    public BufferedReader L(int i11, String str) {
        try {
            return new BufferedReader(new InputStreamReader(F(), str), i11);
        } catch (UnsupportedEncodingException e11) {
            throw new GdxRuntimeException("Error reading file: " + this, e11);
        }
    }

    public Reader M() {
        return new InputStreamReader(F());
    }

    public Reader N(String str) {
        InputStream F = F();
        try {
            return new InputStreamReader(F, str);
        } catch (UnsupportedEncodingException e11) {
            x0.a(F);
            throw new GdxRuntimeException("Error reading file: " + this, e11);
        }
    }

    public a O(String str) {
        if (this.f92809a.getPath().length() != 0) {
            return new a(new File(this.f92809a.getParent(), str), this.f92810b);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    public Files.FileType R() {
        return this.f92810b;
    }

    public OutputStream S(boolean z11) {
        Files.FileType fileType = this.f92810b;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot write to a classpath file: " + this.f92809a);
        }
        if (fileType == Files.FileType.Internal) {
            throw new GdxRuntimeException("Cannot write to an internal file: " + this.f92809a);
        }
        B().x();
        try {
            return new FileOutputStream(n(), z11);
        } catch (Exception e11) {
            if (n().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
            }
            throw new GdxRuntimeException("Error writing file: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
        }
    }

    public OutputStream T(boolean z11, int i11) {
        return new BufferedOutputStream(S(z11), i11);
    }

    public void U(InputStream inputStream, boolean z11) {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = S(z11);
                x0.c(inputStream, outputStream);
            } catch (Exception e11) {
                throw new GdxRuntimeException("Error stream writing to file: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
            }
        } finally {
            x0.a(inputStream);
            x0.a(outputStream);
        }
    }

    public void V(byte[] bArr, int i11, int i12, boolean z11) {
        OutputStream S = S(z11);
        try {
            try {
                S.write(bArr, i11, i12);
            } catch (IOException e11) {
                throw new GdxRuntimeException("Error writing file: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
            }
        } finally {
            x0.a(S);
        }
    }

    public void W(byte[] bArr, boolean z11) {
        OutputStream S = S(z11);
        try {
            try {
                S.write(bArr);
            } catch (IOException e11) {
                throw new GdxRuntimeException("Error writing file: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
            }
        } finally {
            x0.a(S);
        }
    }

    public void X(String str, boolean z11) {
        Y(str, z11, null);
    }

    public void Y(String str, boolean z11, String str2) {
        Writer writer = null;
        try {
            try {
                writer = a0(z11, str2);
                writer.write(str);
            } catch (Exception e11) {
                throw new GdxRuntimeException("Error writing file: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
            }
        } finally {
            x0.a(writer);
        }
    }

    public Writer Z(boolean z11) {
        return a0(z11, null);
    }

    public a a(String str) {
        return this.f92809a.getPath().length() == 0 ? new a(new File(str), this.f92810b) : new a(new File(this.f92809a, str), this.f92810b);
    }

    public Writer a0(boolean z11, String str) {
        Files.FileType fileType = this.f92810b;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot write to a classpath file: " + this.f92809a);
        }
        if (fileType == Files.FileType.Internal) {
            throw new GdxRuntimeException("Cannot write to an internal file: " + this.f92809a);
        }
        B().x();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n(), z11);
            return str == null ? new OutputStreamWriter(fileOutputStream) : new OutputStreamWriter(fileOutputStream, str);
        } catch (IOException e11) {
            if (n().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
            }
            throw new GdxRuntimeException("Error writing file: " + this.f92809a + " (" + this.f92810b + j.f81007d, e11);
        }
    }

    public void d(a aVar) {
        if (!o()) {
            if (aVar.o()) {
                aVar = aVar.a(z());
            }
            c(this, aVar);
            return;
        }
        if (!aVar.l()) {
            aVar.x();
            if (!aVar.o()) {
                throw new GdxRuntimeException("Destination directory cannot be created: " + aVar);
            }
        } else if (!aVar.o()) {
            throw new GdxRuntimeException("Destination exists but is not a directory: " + aVar);
        }
        b(this, aVar.a(z()));
    }

    public boolean e() {
        Files.FileType fileType = this.f92810b;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot delete a classpath file: " + this.f92809a);
        }
        if (fileType != Files.FileType.Internal) {
            return n().delete();
        }
        throw new GdxRuntimeException("Cannot delete an internal file: " + this.f92809a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f92810b == aVar.f92810b && C().equals(aVar.C());
    }

    public boolean f() {
        Files.FileType fileType = this.f92810b;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot delete a classpath file: " + this.f92809a);
        }
        if (fileType != Files.FileType.Internal) {
            return g(n());
        }
        throw new GdxRuntimeException("Cannot delete an internal file: " + this.f92809a);
    }

    public void h() {
        j(false);
    }

    public int hashCode() {
        return ((37 + this.f92810b.hashCode()) * 67) + C().hashCode();
    }

    public void j(boolean z11) {
        Files.FileType fileType = this.f92810b;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot delete a classpath file: " + this.f92809a);
        }
        if (fileType != Files.FileType.Internal) {
            i(n(), z11);
            return;
        }
        throw new GdxRuntimeException("Cannot delete an internal file: " + this.f92809a);
    }

    public final int k() {
        int q11 = (int) q();
        if (q11 != 0) {
            return q11;
        }
        return 512;
    }

    public boolean l() {
        int i11 = C1248a.f92811a[this.f92810b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return n().exists();
            }
        } else if (n().exists()) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/");
        sb2.append(this.f92809a.getPath().replace('\\', '/'));
        return a.class.getResource(sb2.toString()) != null;
    }

    public String m() {
        String name = this.f92809a.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }

    public File n() {
        return this.f92810b == Files.FileType.External ? new File(g.f81382e.g(), this.f92809a.getPath()) : this.f92809a;
    }

    public boolean o() {
        if (this.f92810b == Files.FileType.Classpath) {
            return false;
        }
        return n().isDirectory();
    }

    public long p() {
        return n().lastModified();
    }

    public long q() {
        Files.FileType fileType = this.f92810b;
        if (fileType != Files.FileType.Classpath && (fileType != Files.FileType.Internal || this.f92809a.exists())) {
            return n().length();
        }
        InputStream F = F();
        try {
            long available = F.available();
            x0.a(F);
            return available;
        } catch (Exception unused) {
            x0.a(F);
            return 0L;
        } catch (Throwable th2) {
            x0.a(F);
            throw th2;
        }
    }

    public a[] r() {
        if (this.f92810b == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot list a classpath directory: " + this.f92809a);
        }
        String[] list = n().list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int length = list.length;
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11] = a(list[i11]);
        }
        return aVarArr;
    }

    public a[] s(FileFilter fileFilter) {
        if (this.f92810b == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot list a classpath directory: " + this.f92809a);
        }
        String[] list = n().list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int i11 = 0;
        for (String str : list) {
            a a11 = a(str);
            if (fileFilter.accept(a11.n())) {
                aVarArr[i11] = a11;
                i11++;
            }
        }
        if (i11 >= list.length) {
            return aVarArr;
        }
        a[] aVarArr2 = new a[i11];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
        return aVarArr2;
    }

    public a[] t(FilenameFilter filenameFilter) {
        if (this.f92810b == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot list a classpath directory: " + this.f92809a);
        }
        File n11 = n();
        String[] list = n11.list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int i11 = 0;
        for (String str : list) {
            if (filenameFilter.accept(n11, str)) {
                aVarArr[i11] = a(str);
                i11++;
            }
        }
        if (i11 >= list.length) {
            return aVarArr;
        }
        a[] aVarArr2 = new a[i11];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
        return aVarArr2;
    }

    public String toString() {
        return this.f92809a.getPath().replace('\\', '/');
    }

    public a[] u(String str) {
        if (this.f92810b == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot list a classpath directory: " + this.f92809a);
        }
        String[] list = n().list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int i11 = 0;
        for (String str2 : list) {
            if (str2.endsWith(str)) {
                aVarArr[i11] = a(str2);
                i11++;
            }
        }
        if (i11 >= list.length) {
            return aVarArr;
        }
        a[] aVarArr2 = new a[i11];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
        return aVarArr2;
    }

    public ByteBuffer v() {
        return w(FileChannel.MapMode.READ_ONLY);
    }

    public ByteBuffer w(FileChannel.MapMode mapMode) {
        Exception exc;
        Throwable th2;
        File n11;
        RandomAccessFile randomAccessFile;
        if (this.f92810b == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot map a classpath file: " + this);
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                n11 = n();
                randomAccessFile = new RandomAccessFile(n11, mapMode == FileChannel.MapMode.READ_ONLY ? r.f50027a : "rw");
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Exception e11) {
            exc = e11;
        }
        try {
            MappedByteBuffer map = randomAccessFile.getChannel().map(mapMode, 0L, n11.length());
            map.order(ByteOrder.nativeOrder());
            x0.a(randomAccessFile);
            return map;
        } catch (Exception e12) {
            exc = e12;
            throw new GdxRuntimeException("Error memory mapping file: " + this + " (" + this.f92810b + j.f81007d, exc);
        } catch (Throwable th4) {
            th2 = th4;
            randomAccessFile2 = randomAccessFile;
            x0.a(randomAccessFile2);
            throw th2;
        }
    }

    public void x() {
        Files.FileType fileType = this.f92810b;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot mkdirs with a classpath file: " + this.f92809a);
        }
        if (fileType != Files.FileType.Internal) {
            n().mkdirs();
            return;
        }
        throw new GdxRuntimeException("Cannot mkdirs with an internal file: " + this.f92809a);
    }

    public void y(a aVar) {
        int i11 = C1248a.f92811a[this.f92810b.ordinal()];
        if (i11 == 1) {
            throw new GdxRuntimeException("Cannot move an internal file: " + this.f92809a);
        }
        if (i11 == 2) {
            throw new GdxRuntimeException("Cannot move a classpath file: " + this.f92809a);
        }
        if ((i11 == 3 || i11 == 4) && n().renameTo(aVar.n())) {
            return;
        }
        d(aVar);
        e();
        if (l() && o()) {
            f();
        }
    }

    public String z() {
        return this.f92809a.getName();
    }

    public a(String str) {
        this.f92809a = new File(str);
        this.f92810b = Files.FileType.Absolute;
    }

    public a(File file) {
        this.f92809a = file;
        this.f92810b = Files.FileType.Absolute;
    }

    public a(String str, Files.FileType fileType) {
        this.f92810b = fileType;
        this.f92809a = new File(str);
    }

    public a(File file, Files.FileType fileType) {
        this.f92809a = file;
        this.f92810b = fileType;
    }
}
