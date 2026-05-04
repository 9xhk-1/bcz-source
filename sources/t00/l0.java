package t00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,327:1\n1#2:328\n1#2:330\n57#3:329\n1321#4,2:331\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n208#1:330\n208#1:329\n208#1:331,2\n*E\n"})
/* loaded from: classes8.dex */
public class l0 {
    @yz.y0(version = "1.5")
    @o00.f
    public static final Path A(Path path, q30.m<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Path write;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        write = Files.write(path, q30.k0.l0(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path B(Path path, Iterable lines, Charset charset, OpenOption[] options, int i11, Object obj) throws IOException {
        Path write;
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        write = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path C(Path path, q30.m lines, Charset charset, OpenOption[] options, int i11, Object obj) throws IOException {
        Path write;
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        write = Files.write(path, q30.k0.l0(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }

    @yz.y0(version = "1.5")
    public static final void D(@m80.k Path path, @m80.k CharSequence text, @m80.k Charset charset, @m80.k OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        try {
            if (text instanceof String) {
                kotlin.jvm.internal.g0.m(newOutputStream);
                r00.l.L(newOutputStream, (String) text, charset);
            } else {
                CharsetEncoder u11 = r00.l.u(charset);
                CharBuffer asReadOnlyBuffer = text instanceof CharBuffer ? ((CharBuffer) text).asReadOnlyBuffer() : CharBuffer.wrap(text);
                int min = Math.min(text.length(), 8192);
                kotlin.jvm.internal.g0.m(u11);
                ByteBuffer o11 = r00.l.o(min, u11);
                while (asReadOnlyBuffer.hasRemaining()) {
                    if (u11.encode(asReadOnlyBuffer, o11, true).isError()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    newOutputStream.write(o11.array(), 0, o11.position());
                    o11.clear();
                }
            }
            yz.g2 g2Var = yz.g2.f100423a;
            r00.b.a(newOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                r00.b.a(newOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final OutputStreamWriter F(Path path, Charset charset, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] options, int i11, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final void a(Path path, byte[] array) throws IOException {
        StandardOpenOption standardOpenOption;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(array, "array");
        standardOpenOption = StandardOpenOption.APPEND;
        Files.write(path, array, standardOpenOption);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final Path b(Path path, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, lines, charset, standardOpenOption);
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final Path c(Path path, q30.m<? extends CharSequence> lines, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        Iterable l02 = q30.k0.l0(lines);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, l02, charset, standardOpenOption);
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path d(Path path, Iterable lines, Charset charset, int i11, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, lines, charset, standardOpenOption);
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path e(Path path, q30.m lines, Charset charset, int i11, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        Iterable l02 = q30.k0.l0(lines);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, l02, charset, standardOpenOption);
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }

    @yz.y0(version = "1.5")
    public static final void f(@m80.k Path path, @m80.k CharSequence text, @m80.k Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        D(path, text, charset, standardOpenOption);
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        f(path, charSequence, charset);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final BufferedReader h(Path path, Charset charset, int i11, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i11);
    }

    public static /* synthetic */ BufferedReader i(Path path, Charset charset, int i11, OpenOption[] options, int i12, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i12 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i11);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final BufferedWriter j(Path path, Charset charset, int i11, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i11);
    }

    public static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i11, OpenOption[] options, int i12, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i12 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i11);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final void l(Path path, Charset charset, x00.l<? super String, yz.g2> action) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(action, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.g0.o(newBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = r00.u.i(newBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            yz.g2 g2Var = yz.g2.f100423a;
            kotlin.jvm.internal.d0.d(1);
            r00.b.a(newBufferedReader, null);
            kotlin.jvm.internal.d0.c(1);
        } finally {
        }
    }

    public static /* synthetic */ void m(Path path, Charset charset, x00.l action, int i11, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(action, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.g0.o(newBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = r00.u.i(newBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            yz.g2 g2Var = yz.g2.f100423a;
            kotlin.jvm.internal.d0.d(1);
            r00.b.a(newBufferedReader, null);
            kotlin.jvm.internal.d0.c(1);
        } finally {
        }
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final InputStream n(Path path, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(newInputStream, "newInputStream(...)");
        return newInputStream;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final OutputStream o(Path path, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(newOutputStream, "newOutputStream(...)");
        return newOutputStream;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final byte[] p(Path path) throws IOException {
        byte[] readAllBytes;
        kotlin.jvm.internal.g0.p(path, "<this>");
        readAllBytes = Files.readAllBytes(path);
        kotlin.jvm.internal.g0.o(readAllBytes, "readAllBytes(...)");
        return readAllBytes;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final List<String> q(Path path, Charset charset) throws IOException {
        List<String> readAllLines;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.g0.o(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    public static /* synthetic */ List r(Path path, Charset charset, int i11, Object obj) throws IOException {
        List readAllLines;
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.g0.o(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    @yz.y0(version = "1.5")
    @m80.k
    public static final String s(@m80.k Path path, @m80.k Charset charset) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
        InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, charset);
        try {
            String m11 = r00.u.m(inputStreamReader);
            r00.b.a(inputStreamReader, null);
            return m11;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return s(path, charset);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final InputStreamReader u(Path path, Charset charset, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new InputStreamReader(newInputStream, charset);
    }

    public static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] options, int i11, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new InputStreamReader(newInputStream, charset);
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final <T> T w(Path path, Charset charset, x00.l<? super q30.m<String>, ? extends T> block) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(block, "block");
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.g0.m(newBufferedReader);
            T invoke = block.invoke(r00.u.i(newBufferedReader));
            kotlin.jvm.internal.d0.d(1);
            r00.b.a(newBufferedReader, null);
            kotlin.jvm.internal.d0.c(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object x(Path path, Charset charset, x00.l block, int i11, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(block, "block");
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.g0.m(newBufferedReader);
            Object invoke = block.invoke(r00.u.i(newBufferedReader));
            kotlin.jvm.internal.d0.d(1);
            r00.b.a(newBufferedReader, null);
            kotlin.jvm.internal.d0.c(1);
            return invoke;
        } finally {
        }
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final void y(Path path, byte[] array, OpenOption... options) throws IOException {
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(array, "array");
        kotlin.jvm.internal.g0.p(options, "options");
        Files.write(path, array, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final Path z(Path path, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Path write;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(lines, "lines");
        kotlin.jvm.internal.g0.p(charset, "charset");
        kotlin.jvm.internal.g0.p(options, "options");
        write = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.g0.o(write, "write(...)");
        return write;
    }
}
