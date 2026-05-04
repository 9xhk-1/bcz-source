package okhttp3;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import okio.ByteString;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
/* loaded from: classes8.dex */
public abstract class o implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f77523b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Reader f77524a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l60.m f77525a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Charset f77526b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f77527c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Reader f77528d;

        public a(@m80.k l60.m source, @m80.k Charset charset) {
            g0.p(source, "source");
            g0.p(charset, "charset");
            this.f77525a = source;
            this.f77526b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            g2 g2Var;
            this.f77527c = true;
            Reader reader = this.f77528d;
            if (reader != null) {
                reader.close();
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            if (g2Var == null) {
                this.f77525a.close();
            }
        }

        @Override // java.io.Reader
        public int read(@m80.k char[] cbuf, int i11, int i12) throws IOException {
            g0.p(cbuf, "cbuf");
            if (this.f77527c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f77528d;
            if (reader == null) {
                reader = new InputStreamReader(this.f77525a.R8(), u50.f.T(this.f77525a, this.f77526b));
                this.f77528d = reader;
            }
            return reader.read(cbuf, i11, i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends o {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f77529c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f77530d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l60.m f77531e;

            public a(j jVar, long j11, l60.m mVar) {
                this.f77529c = jVar;
                this.f77530d = j11;
                this.f77531e = mVar;
            }

            @Override // okhttp3.o
            @m80.k
            public l60.m V() {
                return this.f77531e;
            }

            @Override // okhttp3.o
            public long q() {
                return this.f77530d;
            }

            @Override // okhttp3.o
            @m80.l
            public j r() {
                return this.f77529c;
            }
        }

        public /* synthetic */ b(v vVar) {
            this();
        }

        public static /* synthetic */ o i(b bVar, String str, j jVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = null;
            }
            return bVar.a(str, jVar);
        }

        public static /* synthetic */ o j(b bVar, l60.m mVar, j jVar, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = null;
            }
            if ((i11 & 2) != 0) {
                j11 = -1;
            }
            return bVar.b(mVar, jVar, j11);
        }

        public static /* synthetic */ o k(b bVar, ByteString byteString, j jVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = null;
            }
            return bVar.g(byteString, jVar);
        }

        public static /* synthetic */ o l(b bVar, byte[] bArr, j jVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = null;
            }
            return bVar.h(bArr, jVar);
        }

        @w00.j(name = "create")
        @w00.o
        @m80.k
        public final o a(@m80.k String str, @m80.l j jVar) {
            g0.p(str, "<this>");
            Charset charset = u30.d.f91599b;
            if (jVar != null) {
                Charset g11 = j.g(jVar, null, 1, null);
                if (g11 == null) {
                    jVar = j.f77447e.d(jVar + "; charset=utf-8");
                } else {
                    charset = g11;
                }
            }
            l60.k R7 = new l60.k().R7(str, charset);
            return b(R7, jVar, R7.size());
        }

        @w00.j(name = "create")
        @w00.o
        @m80.k
        public final o b(@m80.k l60.m mVar, @m80.l j jVar, long j11) {
            g0.p(mVar, "<this>");
            return new a(jVar, j11, mVar);
        }

        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @m80.k
        public final o c(@m80.l j jVar, long j11, @m80.k l60.m content) {
            g0.p(content, "content");
            return b(content, jVar, j11);
        }

        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @m80.k
        public final o d(@m80.l j jVar, @m80.k String content) {
            g0.p(content, "content");
            return a(content, jVar);
        }

        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @m80.k
        public final o e(@m80.l j jVar, @m80.k ByteString content) {
            g0.p(content, "content");
            return g(content, jVar);
        }

        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @m80.k
        public final o f(@m80.l j jVar, @m80.k byte[] content) {
            g0.p(content, "content");
            return h(content, jVar);
        }

        @w00.j(name = "create")
        @w00.o
        @m80.k
        public final o g(@m80.k ByteString byteString, @m80.l j jVar) {
            g0.p(byteString, "<this>");
            return b(new l60.k().X3(byteString), jVar, byteString.size());
        }

        @w00.j(name = "create")
        @w00.o
        @m80.k
        public final o h(@m80.k byte[] bArr, @m80.l j jVar) {
            g0.p(bArr, "<this>");
            return b(new l60.k().write(bArr), jVar, bArr.length);
        }

        public b() {
        }
    }

    @w00.j(name = "create")
    @w00.o
    @m80.k
    public static final o C(@m80.k l60.m mVar, @m80.l j jVar, long j11) {
        return f77523b.b(mVar, jVar, j11);
    }

    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @m80.k
    public static final o E(@m80.l j jVar, long j11, @m80.k l60.m mVar) {
        return f77523b.c(jVar, j11, mVar);
    }

    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @m80.k
    public static final o H(@m80.l j jVar, @m80.k String str) {
        return f77523b.d(jVar, str);
    }

    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @m80.k
    public static final o I(@m80.l j jVar, @m80.k ByteString byteString) {
        return f77523b.e(jVar, byteString);
    }

    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @m80.k
    public static final o L(@m80.l j jVar, @m80.k byte[] bArr) {
        return f77523b.f(jVar, bArr);
    }

    @w00.j(name = "create")
    @w00.o
    @m80.k
    public static final o S(@m80.k ByteString byteString, @m80.l j jVar) {
        return f77523b.g(byteString, jVar);
    }

    @w00.j(name = "create")
    @w00.o
    @m80.k
    public static final o U(@m80.k byte[] bArr, @m80.l j jVar) {
        return f77523b.h(bArr, jVar);
    }

    @w00.j(name = "create")
    @w00.o
    @m80.k
    public static final o w(@m80.k String str, @m80.l j jVar) {
        return f77523b.a(str, jVar);
    }

    @m80.k
    public abstract l60.m V();

    @m80.k
    public final String Z() throws IOException {
        l60.m V = V();
        try {
            String h32 = V.h3(u50.f.T(V, j()));
            r00.b.a(V, null);
            return h32;
        } finally {
        }
    }

    @m80.k
    public final InputStream a() {
        return V().R8();
    }

    @m80.k
    public final ByteString c() throws IOException {
        long q11 = q();
        if (q11 > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + q11);
        }
        l60.m V = V();
        try {
            ByteString q32 = V.q3();
            r00.b.a(V, null);
            int size = q32.size();
            if (q11 == -1 || q11 == size) {
                return q32;
            }
            throw new IOException("Content-Length (" + q11 + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        u50.f.o(V());
    }

    @m80.k
    public final byte[] e() throws IOException {
        long q11 = q();
        if (q11 > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + q11);
        }
        l60.m V = V();
        try {
            byte[] w22 = V.w2();
            r00.b.a(V, null);
            int length = w22.length;
            if (q11 == -1 || q11 == length) {
                return w22;
            }
            throw new IOException("Content-Length (" + q11 + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @m80.k
    public final Reader f() {
        Reader reader = this.f77524a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(V(), j());
        this.f77524a = aVar;
        return aVar;
    }

    public final Charset j() {
        Charset f11;
        j r11 = r();
        return (r11 == null || (f11 = r11.f(u30.d.f91599b)) == null) ? u30.d.f91599b : f11;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    public final <T> T k(x00.l<? super l60.m, ? extends T> lVar, x00.l<? super T, Integer> lVar2) {
        long q11 = q();
        if (q11 > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + q11);
        }
        l60.m V = V();
        try {
            T invoke = lVar.invoke(V);
            d0.d(1);
            r00.b.a(V, null);
            d0.c(1);
            int intValue = lVar2.invoke(invoke).intValue();
            if (q11 == -1 || q11 == intValue) {
                return invoke;
            }
            throw new IOException("Content-Length (" + q11 + ") and stream length (" + intValue + ") disagree");
        } finally {
        }
    }

    public abstract long q();

    @m80.l
    public abstract j r();
}
