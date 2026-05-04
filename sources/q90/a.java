package q90;

import j90.e;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
import n90.a0;
import n90.y;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextWritingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.c0;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.f;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.h;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<P extends f<?>, W extends h<?>> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f81998a;

    /* renamed from: b, reason: collision with root package name */
    public Writer f81999b;

    /* renamed from: c, reason: collision with root package name */
    public e f82000c;

    /* renamed from: d, reason: collision with root package name */
    public final String f82001d;

    /* renamed from: e, reason: collision with root package name */
    public P f82002e;

    /* renamed from: f, reason: collision with root package name */
    public W f82003f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: q90.a$a, reason: collision with other inner class name */
    public class C1013a implements y {

        /* renamed from: a, reason: collision with root package name */
        public org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<W> f82004a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Writer f82005b;

        public C1013a(Writer writer) {
            this.f82005b = writer;
        }

        @Override // o90.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void i(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            a.this.e(this.f82004a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o90.z
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void h(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            a aVar = a.this;
            this.f82004a = aVar.i(this.f82005b, aVar.f82003f);
        }

        @Override // o90.z
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void q(String[] strArr, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            this.f82004a.X0(strArr);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends n90.e<T> {

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Object[] f82007y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class cls, Object[] objArr) {
            super(cls);
            this.f82007y = objArr;
        }

        @Override // o90.d, o90.z
        /* renamed from: g */
        public void i(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            super.i(yVar);
            a.this.f82002e.W0(null);
        }

        @Override // o90.d
        /* renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void l0(T t11, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            this.f82007y[0] = t11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<T> implements s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> {

        /* renamed from: a, reason: collision with root package name */
        public org.junit.jupiter.params.shadow.com.univocity.parsers.common.y f82009a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Reader f82010b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object[] f82011c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: q90.a$c$a, reason: collision with other inner class name */
        public class C1014a implements c0<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> {

            /* renamed from: a, reason: collision with root package name */
            public String[] f82013a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ org.junit.jupiter.params.shadow.com.univocity.parsers.common.b f82014b;

            public C1014a(org.junit.jupiter.params.shadow.com.univocity.parsers.common.b bVar) {
                this.f82014b = bVar;
            }

            @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public org.junit.jupiter.params.shadow.com.univocity.parsers.common.y getContext() {
                return c.this.f82009a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (c.this.f82011c[0] != null || this.f82013a != null) {
                    return true;
                }
                String[] A0 = this.f82014b.A0();
                this.f82013a = A0;
                return A0 != null;
            }

            @Override // java.util.Iterator
            public T next() {
                T t11 = (T) c.this.f82011c[0];
                if (t11 == null && hasNext()) {
                    t11 = (T) c.this.f82011c[0];
                }
                c.this.f82011c[0] = null;
                this.f82013a = null;
                return t11;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove beans");
            }
        }

        public c(Reader reader, Object[] objArr) {
            this.f82010b = reader;
            this.f82011c = objArr;
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.junit.jupiter.params.shadow.com.univocity.parsers.common.y getContext() {
            return this.f82009a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        public c0<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> iterator() {
            a aVar = a.this;
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.b h11 = aVar.h(aVar.f82002e);
            h11.h(this.f82010b);
            this.f82009a = h11.m();
            return new C1014a(h11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends n90.a {

        /* renamed from: a, reason: collision with root package name */
        public int f82016a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q90.b f82017b;

        public d(q90.b bVar) {
            this.f82017b = bVar;
        }

        @Override // o90.q, o90.z
        /* renamed from: g */
        public void i(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            this.f82017b.f82019a = yVar.p() + 1;
            this.f82017b.f82020b = this.f82016a;
        }

        @Override // o90.q, o90.z
        /* renamed from: t */
        public void q(String[] strArr, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            if (this.f82016a < strArr.length) {
                this.f82016a = strArr.length;
            }
        }
    }

    public a(String str) {
        this(str, null, null);
    }

    public <T> List<T> A(Class<T> cls, File file) {
        return B(cls, file, 0);
    }

    public <T> List<T> B(Class<T> cls, File file, int i11) {
        return N(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file), i11);
    }

    public <T> List<T> C(Class<T> cls, File file, String str) {
        return D(cls, file, str, 0);
    }

    public <T> List<T> D(Class<T> cls, File file, String str, int i11) {
        return N(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str), i11);
    }

    public <T> List<T> E(Class<T> cls, File file, Charset charset) {
        return F(cls, file, charset, 0);
    }

    public <T> List<T> F(Class<T> cls, File file, Charset charset, int i11) {
        return N(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset), i11);
    }

    public <T> List<T> G(Class<T> cls, InputStream inputStream) {
        return H(cls, inputStream, 0);
    }

    public <T> List<T> H(Class<T> cls, InputStream inputStream, int i11) {
        return N(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream), i11);
    }

    public <T> List<T> I(Class<T> cls, InputStream inputStream, String str) {
        return J(cls, inputStream, str, 0);
    }

    public <T> List<T> J(Class<T> cls, InputStream inputStream, String str, int i11) {
        return N(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str), i11);
    }

    public <T> List<T> K(Class<T> cls, InputStream inputStream, Charset charset) {
        return L(cls, inputStream, charset, 0);
    }

    public <T> List<T> L(Class<T> cls, InputStream inputStream, Charset charset, int i11) {
        return N(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset), i11);
    }

    public <T> List<T> M(Class<T> cls, Reader reader) {
        return N(cls, reader, 0);
    }

    public <T> List<T> N(Class<T> cls, Reader reader, int i11) {
        n90.d dVar = new n90.d(cls, i11);
        dVar.g0(this.f82000c);
        S(dVar);
        try {
            h(this.f82002e).S(reader);
            return dVar.m0();
        } finally {
            this.f82002e.W0(null);
        }
    }

    public final void O(Reader reader, Writer writer) {
        T(null);
        S(j(writer));
        try {
            h(this.f82002e).S(reader);
        } finally {
            this.f82002e.W0(null);
        }
    }

    public void P(j90.d dVar) {
        this.f82000c = dVar == null ? new e() : (e) dVar.m6306clone();
    }

    public void Q(boolean z11) {
        this.f81998a = z11;
    }

    public final void R(P p11) {
        this.f82002e = p11;
    }

    public final void S(y yVar) {
        V();
        this.f82002e.W0(yVar);
    }

    public final void T(a0 a0Var) {
        W();
        this.f82003f.u0(a0Var);
    }

    public final void U(W w11) {
        this.f82003f = w11;
    }

    public final void V() {
        if (this.f82002e == null) {
            P f11 = f();
            this.f82002e = f11;
            f11.P0(true);
        }
    }

    public final void W() {
        if (this.f82003f == null) {
            this.f82003f = g();
        }
    }

    public final void X(ResultSet resultSet, File file) {
        Z(resultSet, file, null);
    }

    public final void Y(ResultSet resultSet, File file, String str) {
        Z(resultSet, file, Charset.forName(str));
    }

    public final void Z(ResultSet resultSet, File file, Charset charset) {
        Writer r11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.r(file, charset);
        try {
            d0(resultSet, r11);
            try {
                r11.close();
            } catch (Exception e11) {
                throw new IllegalStateException("Error closing file: '" + file.getAbsolutePath() + "'", e11);
            }
        } catch (Throwable th2) {
            try {
                r11.close();
                throw th2;
            } catch (Exception e12) {
                throw new IllegalStateException("Error closing file: '" + file.getAbsolutePath() + "'", e12);
            }
        }
    }

    public final void a0(ResultSet resultSet, OutputStream outputStream) {
        d0(resultSet, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.s(outputStream));
    }

    public final void b0(ResultSet resultSet, OutputStream outputStream, String str) {
        d0(resultSet, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.t(outputStream, str));
    }

    public final void c0(ResultSet resultSet, OutputStream outputStream, Charset charset) {
        d0(resultSet, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.u(outputStream, charset));
    }

    public final void d0(ResultSet resultSet, Writer writer) {
        Throwable th2;
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<W> cVar;
        Throwable th3;
        Exception exc;
        W();
        boolean z11 = this.f82003f.n0() != null;
        Object[] objArr = null;
        long j11 = 0;
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            String[] strArr = new String[columnCount];
            int[] iArr = new int[columnCount];
            for (int i11 = 1; i11 <= columnCount; i11++) {
                int i12 = i11 - 1;
                strArr[i12] = metaData.getColumnLabel(i11);
                int precision = metaData.getPrecision(i11);
                int scale = metaData.getScale(i11);
                iArr[i12] = (precision == 0 || scale == 0) ? precision + scale : precision + scale + 2;
            }
            String[] p11 = this.f82003f.p();
            if (p11 == null) {
                this.f82003f.Q(strArr);
            } else {
                strArr = p11;
            }
            d(strArr, iArr);
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<W> cVar2 = i(writer, this.f82003f);
            try {
                if (this.f82003f.p0()) {
                    cVar2.z0();
                }
                objArr = new Object[columnCount];
                while (resultSet.next()) {
                    for (int i13 = 1; i13 <= columnCount; i13++) {
                        objArr[i13 - 1] = resultSet.getObject(i13);
                    }
                    if (z11) {
                        cVar2.N(objArr);
                    } else {
                        cVar2.W0(objArr);
                    }
                    j11++;
                }
                try {
                    try {
                        if (!this.f81998a) {
                            resultSet.close();
                        }
                        e(cVar2);
                    } catch (Exception e11) {
                        exc = e11;
                        throw new TextWritingException("Error writing data from result set", j11, objArr, exc);
                    }
                } catch (Throwable th4) {
                    th3 = th4;
                    e(cVar2);
                    throw th3;
                }
            } catch (Throwable th5) {
                cVar = cVar2;
                th2 = th5;
                try {
                    if (this.f81998a) {
                        throw th2;
                    }
                    resultSet.close();
                    throw th2;
                } catch (Exception e12) {
                    exc = e12;
                    cVar2 = cVar;
                    throw new TextWritingException("Error writing data from result set", j11, objArr, exc);
                } catch (Throwable th6) {
                    th3 = th6;
                    cVar2 = cVar;
                    e(cVar2);
                    throw th3;
                }
            }
        } catch (Throwable th7) {
            th2 = th7;
            cVar = null;
        }
    }

    public final void e(org.junit.jupiter.params.shadow.com.univocity.parsers.common.c cVar) {
        if (cVar != null) {
            if (this.f81998a) {
                cVar.u();
            } else {
                cVar.m();
            }
        }
    }

    public <T> void e0(Iterable<T> iterable, Class<T> cls, File file, String str, String[] strArr) {
        k0(iterable, cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.q(file, str), strArr);
    }

    public abstract P f();

    public <T> void f0(Iterable<T> iterable, Class<T> cls, File file, Charset charset, String... strArr) {
        k0(iterable, cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.r(file, charset), strArr);
    }

    public abstract W g();

    public <T> void g0(Iterable<T> iterable, Class<T> cls, File file, String... strArr) {
        k0(iterable, cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.p(file), strArr);
    }

    public abstract org.junit.jupiter.params.shadow.com.univocity.parsers.common.b<P> h(P p11);

    public <T> void h0(Iterable<T> iterable, Class<T> cls, OutputStream outputStream, String str, String[] strArr) {
        k0(iterable, cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.t(outputStream, str), strArr);
    }

    public abstract org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<W> i(Writer writer, W w11);

    public <T> void i0(Iterable<T> iterable, Class<T> cls, OutputStream outputStream, Charset charset, String... strArr) {
        k0(iterable, cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.u(outputStream, charset), strArr);
    }

    public final y j(Writer writer) {
        return new C1013a(writer);
    }

    public <T> void j0(Iterable<T> iterable, Class<T> cls, OutputStream outputStream, String... strArr) {
        k0(iterable, cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.s(outputStream), strArr);
    }

    public j90.d k() {
        return this.f82000c;
    }

    public <T> void k0(Iterable<T> iterable, Class<T> cls, Writer writer, String... strArr) {
        n90.f fVar = new n90.f(cls);
        fVar.g0(this.f82000c);
        T(fVar);
        try {
            if (strArr.length > 0) {
                this.f82003f.Q(strArr);
                this.f82003f.t0(true);
            }
            if (this.f81998a && this.f81999b == writer) {
                this.f82003f.t0(false);
            }
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.c<W> i11 = i(writer, this.f82003f);
            if (this.f81998a) {
                i11.T(iterable);
                this.f81999b = writer;
            } else {
                i11.Y(iterable);
            }
            this.f82003f.u0(null);
        } catch (Throwable th2) {
            this.f82003f.u0(null);
            throw th2;
        }
    }

    public q90.b l(File file) {
        return p(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file));
    }

    public q90.b m(File file, String str) {
        return p(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str));
    }

    public q90.b n(InputStream inputStream) {
        return p(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream));
    }

    public q90.b o(InputStream inputStream, String str) {
        return p(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str));
    }

    public q90.b p(Reader reader) {
        q90.b bVar = new q90.b();
        S(new d(bVar));
        P r11 = r();
        r11.X(-1);
        if (r11.u() < 1000000) {
            r11.Y(1000000);
        }
        r11.K(new Integer[0]);
        r11.I0(false);
        h(r11).S(reader);
        return bVar;
    }

    public boolean q() {
        return this.f81998a;
    }

    public final P r() {
        V();
        return this.f82002e;
    }

    public final W s() {
        W();
        return this.f82003f;
    }

    public <T> s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> t(Class<T> cls, File file) {
        return z(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file));
    }

    public String toString() {
        return this.f82001d;
    }

    public <T> s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> u(Class<T> cls, File file, String str) {
        return z(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str));
    }

    public <T> s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> v(Class<T> cls, File file, Charset charset) {
        return z(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset));
    }

    public <T> s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> w(Class<T> cls, InputStream inputStream) {
        return z(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream));
    }

    public <T> s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> x(Class<T> cls, InputStream inputStream, String str) {
        return z(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str));
    }

    public <T> s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> y(Class<T> cls, InputStream inputStream, Charset charset) {
        return z(cls, org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset));
    }

    public <T> s<T, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> z(Class<T> cls, Reader reader) {
        Object[] objArr = new Object[1];
        b bVar = new b(cls, objArr);
        bVar.g0(this.f82000c);
        S(bVar);
        return new c(reader, objArr);
    }

    public a(String str, P p11) {
        this(str, p11, null);
    }

    public a(String str, W w11) {
        this(str, null, w11);
    }

    public a(String str, P p11, W w11) {
        this.f81998a = false;
        this.f82000c = new e();
        this.f82001d = str;
        this.f82002e = p11;
        this.f82003f = w11;
    }

    public void d(String[] strArr, int[] iArr) {
    }
}
