package r00;

import androidx.collection.SieveCacheKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* loaded from: classes8.dex */
public class l extends j {
    public static /* synthetic */ List A(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return z(file, charset);
    }

    public static final g2 B(ArrayList arrayList, String it) {
        g0.p(it, "it");
        arrayList.add(it);
        return g2.f100423a;
    }

    @m80.k
    public static final String C(@m80.k File file, @m80.k Charset charset) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m11 = u.m(inputStreamReader);
            b.a(inputStreamReader, null);
            return m11;
        } finally {
        }
    }

    public static /* synthetic */ String D(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return C(file, charset);
    }

    @o00.f
    public static final InputStreamReader E(File file, Charset charset) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader F(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T G(@m80.k File file, @m80.k Charset charset, @m80.k x00.l<? super q30.m<String>, ? extends T> block) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        g0.p(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T invoke = block.invoke(u.i(bufferedReader));
            d0.d(1);
            b.a(bufferedReader, null);
            d0.c(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object H(File file, Charset charset, x00.l block, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        g0.p(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object invoke = block.invoke(u.i(bufferedReader));
            d0.d(1);
            b.a(bufferedReader, null);
            d0.c(1);
            return invoke;
        } finally {
        }
    }

    public static final void I(@m80.k File file, @m80.k byte[] array) {
        g0.p(file, "<this>");
        g0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            g2 g2Var = g2.f100423a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void J(@m80.k File file, @m80.k String text, @m80.k Charset charset) {
        g0.p(file, "<this>");
        g0.p(text, "text");
        g0.p(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            L(fileOutputStream, text, charset);
            g2 g2Var = g2.f100423a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void K(File file, String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        J(file, str, charset);
    }

    public static void L(@m80.k OutputStream outputStream, @m80.k String text, @m80.k Charset charset) {
        g0.p(outputStream, "<this>");
        g0.p(text, "text");
        g0.p(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            g0.o(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder u11 = u(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        g0.m(u11);
        ByteBuffer o11 = o(8192, u11);
        int i11 = 0;
        int i12 = 0;
        while (i11 < text.length()) {
            int min = Math.min(8192 - i12, text.length() - i11);
            int i13 = i11 + min;
            char[] array = allocate.array();
            g0.o(array, "array(...)");
            text.getChars(i11, i13, array, i12);
            allocate.limit(min + i12);
            i12 = 1;
            if (!u11.encode(allocate, o11, i13 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(o11.array(), 0, o11.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i12 = 0;
            }
            allocate.clear();
            o11.clear();
            i11 = i13;
        }
    }

    @o00.f
    public static final OutputStreamWriter M(File file, Charset charset) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter N(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void h(@m80.k File file, @m80.k byte[] array) {
        g0.p(file, "<this>");
        g0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            g2 g2Var = g2.f100423a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void i(@m80.k File file, @m80.k String text, @m80.k Charset charset) {
        g0.p(file, "<this>");
        g0.p(text, "text");
        g0.p(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            L(fileOutputStream, text, charset);
            g2 g2Var = g2.f100423a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void j(File file, String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        i(file, str, charset);
    }

    @o00.f
    public static final BufferedReader k(File file, Charset charset, int i11) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i11);
    }

    public static /* synthetic */ BufferedReader l(File file, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i11);
    }

    @o00.f
    public static final BufferedWriter m(File file, Charset charset, int i11) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i11);
    }

    public static /* synthetic */ BufferedWriter n(File file, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i11);
    }

    @m80.k
    public static ByteBuffer o(int i11, @m80.k CharsetEncoder encoder) {
        g0.p(encoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i11 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        g0.o(allocate, "allocate(...)");
        return allocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void p(@m80.k File file, int i11, @m80.k x00.p<? super byte[], ? super Integer, g2> action) {
        g0.p(file, "<this>");
        g0.p(action, "action");
        ?? r22 = new byte[g10.u.u(i11, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r22);
                if (read <= 0) {
                    g2 g2Var = g2.f100423a;
                    b.a(fileInputStream, null);
                    return;
                }
                action.invoke(r22, Integer.valueOf(read));
            } finally {
            }
        }
    }

    public static final void q(@m80.k File file, @m80.k x00.p<? super byte[], ? super Integer, g2> action) {
        g0.p(file, "<this>");
        g0.p(action, "action");
        p(file, 4096, action);
    }

    public static final void r(@m80.k File file, @m80.k Charset charset, @m80.k x00.l<? super String, g2> action) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        g0.p(action, "action");
        u.h(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void s(File file, Charset charset, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        r(file, charset, lVar);
    }

    @o00.f
    public static final FileInputStream t(File file) {
        g0.p(file, "<this>");
        return new FileInputStream(file);
    }

    public static CharsetEncoder u(@m80.k Charset charset) {
        g0.p(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @o00.f
    public static final FileOutputStream v(File file) {
        g0.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @o00.f
    public static final PrintWriter w(File file, Charset charset) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    public static /* synthetic */ PrintWriter x(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @m80.k
    public static final byte[] y(@m80.k File file) {
        g0.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > SieveCacheKt.NodeLinkMask) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i11 = (int) length;
            byte[] bArr = new byte[i11];
            int i12 = i11;
            int i13 = 0;
            while (i12 > 0) {
                int read = fileInputStream.read(bArr, i13, i12);
                if (read < 0) {
                    break;
                }
                i12 -= read;
                i13 += read;
            }
            if (i12 > 0) {
                bArr = Arrays.copyOf(bArr, i13);
                g0.o(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    f fVar = new f(8193);
                    fVar.write(read2);
                    a.l(fileInputStream, fVar, 0, 2, null);
                    int size = fVar.size() + i11;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a11 = fVar.a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    g0.o(copyOf, "copyOf(...)");
                    bArr = a00.q.v0(a11, copyOf, i11, 0, fVar.size());
                }
            }
            b.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @m80.k
    public static final List<String> z(@m80.k File file, @m80.k Charset charset) {
        g0.p(file, "<this>");
        g0.p(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        r(file, charset, new x00.l() { // from class: r00.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 B;
                B = l.B(arrayList, (String) obj);
                return B;
            }
        });
        return arrayList;
    }
}
