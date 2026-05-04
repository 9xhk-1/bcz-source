package r00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q30.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "TextStreamsKt")
@u0({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n57#1:158\n1#2:159\n1#2:162\n1321#3,2:160\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158\n35#1:159\n35#1:160,2\n*E\n"})
/* loaded from: classes8.dex */
public final class u {
    @o00.f
    public static final BufferedReader b(Reader reader, int i11) {
        g0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i11);
    }

    @o00.f
    public static final BufferedWriter c(Writer writer, int i11) {
        g0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i11);
    }

    public static /* synthetic */ BufferedReader d(Reader reader, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        g0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i11);
    }

    public static /* synthetic */ BufferedWriter e(Writer writer, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        g0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i11);
    }

    public static final long f(@m80.k Reader reader, @m80.k Writer out, int i11) {
        g0.p(reader, "<this>");
        g0.p(out, "out");
        char[] cArr = new char[i11];
        int read = reader.read(cArr);
        long j11 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j11 += read;
            read = reader.read(cArr);
        }
        return j11;
    }

    public static /* synthetic */ long g(Reader reader, Writer writer, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        return f(reader, writer, i11);
    }

    public static final void h(@m80.k Reader reader, @m80.k x00.l<? super String, g2> action) {
        g0.p(reader, "<this>");
        g0.p(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = i(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            g2 g2Var = g2.f100423a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    @m80.k
    public static final q30.m<String> i(@m80.k BufferedReader bufferedReader) {
        g0.p(bufferedReader, "<this>");
        return x.k(new q(bufferedReader));
    }

    @m80.k
    public static final byte[] j(@m80.k URL url) {
        g0.p(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            g0.m(openStream);
            byte[] p11 = a.p(openStream);
            b.a(openStream, null);
            return p11;
        } finally {
        }
    }

    @m80.k
    public static final List<String> k(@m80.k Reader reader) {
        g0.p(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        h(reader, new x00.l() { // from class: r00.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l11;
                l11 = u.l(arrayList, (String) obj);
                return l11;
            }
        });
        return arrayList;
    }

    public static final g2 l(ArrayList arrayList, String it) {
        g0.p(it, "it");
        arrayList.add(it);
        return g2.f100423a;
    }

    @m80.k
    public static final String m(@m80.k Reader reader) {
        g0.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        g(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        g0.o(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    @o00.f
    public static final String n(URL url, Charset charset) {
        g0.p(url, "<this>");
        g0.p(charset, "charset");
        return new String(j(url), charset);
    }

    public static /* synthetic */ String o(URL url, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(url, "<this>");
        g0.p(charset, "charset");
        return new String(j(url), charset);
    }

    @o00.f
    public static final StringReader p(String str) {
        g0.p(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T q(@m80.k Reader reader, @m80.k x00.l<? super q30.m<String>, ? extends T> block) {
        g0.p(reader, "<this>");
        g0.p(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T invoke = block.invoke(i(bufferedReader));
            d0.d(1);
            b.a(bufferedReader, null);
            d0.c(1);
            return invoke;
        } finally {
        }
    }
}
