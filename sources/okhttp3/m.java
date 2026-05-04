package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.g1;
import l60.r0;
import okio.ByteString;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f77487a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nokhttp3/RequestBody$Companion$asRequestBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
        /* renamed from: okhttp3.m$a$a, reason: collision with other inner class name */
        public static final class C0955a extends m {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f77488b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ File f77489c;

            public C0955a(j jVar, File file) {
                this.f77488b = jVar;
                this.f77489c = file;
            }

            @Override // okhttp3.m
            public long a() {
                return this.f77489c.length();
            }

            @Override // okhttp3.m
            @m80.l
            public j b() {
                return this.f77488b;
            }

            @Override // okhttp3.m
            public void r(@m80.k l60.l sink) {
                g0.p(sink, "sink");
                g1 u11 = r0.u(this.f77489c);
                try {
                    sink.V2(u11);
                    r00.b.a(u11, null);
                } finally {
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends m {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f77490b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ByteString f77491c;

            public b(j jVar, ByteString byteString) {
                this.f77490b = jVar;
                this.f77491c = byteString;
            }

            @Override // okhttp3.m
            public long a() {
                return this.f77491c.size();
            }

            @Override // okhttp3.m
            @m80.l
            public j b() {
                return this.f77490b;
            }

            @Override // okhttp3.m
            public void r(@m80.k l60.l sink) {
                g0.p(sink, "sink");
                sink.X3(this.f77491c);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends m {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f77492b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f77493c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ byte[] f77494d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f77495e;

            public c(j jVar, int i11, byte[] bArr, int i12) {
                this.f77492b = jVar;
                this.f77493c = i11;
                this.f77494d = bArr;
                this.f77495e = i12;
            }

            @Override // okhttp3.m
            public long a() {
                return this.f77493c;
            }

            @Override // okhttp3.m
            @m80.l
            public j b() {
                return this.f77492b;
            }

            @Override // okhttp3.m
            public void r(@m80.k l60.l sink) {
                g0.p(sink, "sink");
                sink.write(this.f77494d, this.f77495e, this.f77493c);
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ m n(a aVar, File file, j jVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = null;
            }
            return aVar.a(file, jVar);
        }

        public static /* synthetic */ m o(a aVar, String str, j jVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = null;
            }
            return aVar.b(str, jVar);
        }

        public static /* synthetic */ m p(a aVar, j jVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                i11 = 0;
            }
            if ((i13 & 8) != 0) {
                i12 = bArr.length;
            }
            return aVar.h(jVar, bArr, i11, i12);
        }

        public static /* synthetic */ m q(a aVar, ByteString byteString, j jVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jVar = null;
            }
            return aVar.i(byteString, jVar);
        }

        public static /* synthetic */ m r(a aVar, byte[] bArr, j jVar, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                jVar = null;
            }
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = bArr.length;
            }
            return aVar.m(bArr, jVar, i11, i12);
        }

        @w00.j(name = "create")
        @w00.o
        @m80.k
        public final m a(@m80.k File file, @m80.l j jVar) {
            g0.p(file, "<this>");
            return new C0955a(jVar, file);
        }

        @w00.j(name = "create")
        @w00.o
        @m80.k
        public final m b(@m80.k String str, @m80.l j jVar) {
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
            byte[] bytes = str.getBytes(charset);
            g0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return m(bytes, jVar, 0, bytes.length);
        }

        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @w0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @m80.k
        public final m c(@m80.l j jVar, @m80.k File file) {
            g0.p(file, "file");
            return a(file, jVar);
        }

        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @m80.k
        public final m d(@m80.l j jVar, @m80.k String content) {
            g0.p(content, "content");
            return b(content, jVar);
        }

        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @m80.k
        public final m e(@m80.l j jVar, @m80.k ByteString content) {
            g0.p(content, "content");
            return i(content, jVar);
        }

        @w00.k
        @m80.k
        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final m f(@m80.l j jVar, @m80.k byte[] content) {
            g0.p(content, "content");
            return p(this, jVar, content, 0, 0, 12, null);
        }

        @w00.k
        @m80.k
        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final m g(@m80.l j jVar, @m80.k byte[] content, int i11) {
            g0.p(content, "content");
            return p(this, jVar, content, i11, 0, 8, null);
        }

        @w00.k
        @m80.k
        @w00.o
        @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final m h(@m80.l j jVar, @m80.k byte[] content, int i11, int i12) {
            g0.p(content, "content");
            return m(content, jVar, i11, i12);
        }

        @w00.j(name = "create")
        @w00.o
        @m80.k
        public final m i(@m80.k ByteString byteString, @m80.l j jVar) {
            g0.p(byteString, "<this>");
            return new b(jVar, byteString);
        }

        @w00.j(name = "create")
        @w00.k
        @m80.k
        @w00.o
        public final m j(@m80.k byte[] bArr) {
            g0.p(bArr, "<this>");
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @w00.j(name = "create")
        @w00.k
        @m80.k
        @w00.o
        public final m k(@m80.k byte[] bArr, @m80.l j jVar) {
            g0.p(bArr, "<this>");
            return r(this, bArr, jVar, 0, 0, 6, null);
        }

        @w00.j(name = "create")
        @w00.k
        @m80.k
        @w00.o
        public final m l(@m80.k byte[] bArr, @m80.l j jVar, int i11) {
            g0.p(bArr, "<this>");
            return r(this, bArr, jVar, i11, 0, 4, null);
        }

        @w00.j(name = "create")
        @w00.k
        @m80.k
        @w00.o
        public final m m(@m80.k byte[] bArr, @m80.l j jVar, int i11, int i12) {
            g0.p(bArr, "<this>");
            u50.f.n(bArr.length, i11, i12);
            return new c(jVar, i12, bArr, i11);
        }

        public a() {
        }
    }

    @w00.j(name = "create")
    @w00.o
    @m80.k
    public static final m c(@m80.k File file, @m80.l j jVar) {
        return f77487a.a(file, jVar);
    }

    @w00.j(name = "create")
    @w00.o
    @m80.k
    public static final m d(@m80.k String str, @m80.l j jVar) {
        return f77487a.b(str, jVar);
    }

    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @w0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @m80.k
    public static final m e(@m80.l j jVar, @m80.k File file) {
        return f77487a.c(jVar, file);
    }

    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @m80.k
    public static final m f(@m80.l j jVar, @m80.k String str) {
        return f77487a.d(jVar, str);
    }

    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @m80.k
    public static final m g(@m80.l j jVar, @m80.k ByteString byteString) {
        return f77487a.e(jVar, byteString);
    }

    @w00.k
    @m80.k
    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final m h(@m80.l j jVar, @m80.k byte[] bArr) {
        return f77487a.f(jVar, bArr);
    }

    @w00.k
    @m80.k
    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final m i(@m80.l j jVar, @m80.k byte[] bArr, int i11) {
        return f77487a.g(jVar, bArr, i11);
    }

    @w00.k
    @m80.k
    @w00.o
    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @w0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final m j(@m80.l j jVar, @m80.k byte[] bArr, int i11, int i12) {
        return f77487a.h(jVar, bArr, i11, i12);
    }

    @w00.j(name = "create")
    @w00.o
    @m80.k
    public static final m k(@m80.k ByteString byteString, @m80.l j jVar) {
        return f77487a.i(byteString, jVar);
    }

    @w00.j(name = "create")
    @w00.k
    @m80.k
    @w00.o
    public static final m l(@m80.k byte[] bArr) {
        return f77487a.j(bArr);
    }

    @w00.j(name = "create")
    @w00.k
    @m80.k
    @w00.o
    public static final m m(@m80.k byte[] bArr, @m80.l j jVar) {
        return f77487a.k(bArr, jVar);
    }

    @w00.j(name = "create")
    @w00.k
    @m80.k
    @w00.o
    public static final m n(@m80.k byte[] bArr, @m80.l j jVar, int i11) {
        return f77487a.l(bArr, jVar, i11);
    }

    @w00.j(name = "create")
    @w00.k
    @m80.k
    @w00.o
    public static final m o(@m80.k byte[] bArr, @m80.l j jVar, int i11, int i12) {
        return f77487a.m(bArr, jVar, i11, i12);
    }

    public long a() throws IOException {
        return -1L;
    }

    @m80.l
    public abstract j b();

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(@m80.k l60.l lVar) throws IOException;
}
