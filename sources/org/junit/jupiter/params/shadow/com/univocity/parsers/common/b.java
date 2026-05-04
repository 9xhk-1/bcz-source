package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.f;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final T f78013a;

    /* renamed from: b, reason: collision with root package name */
    public final x f78014b;

    /* renamed from: c, reason: collision with root package name */
    public final long f78015c;

    /* renamed from: d, reason: collision with root package name */
    public final char f78016d;

    /* renamed from: f, reason: collision with root package name */
    public y f78018f;

    /* renamed from: g, reason: collision with root package name */
    public o90.z f78019g;

    /* renamed from: h, reason: collision with root package name */
    public k90.c f78020h;

    /* renamed from: i, reason: collision with root package name */
    public char f78021i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f78022j;

    /* renamed from: k, reason: collision with root package name */
    public final long f78023k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<Long, String> f78024l;

    /* renamed from: m, reason: collision with root package name */
    public String f78025m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f78026n;

    /* renamed from: o, reason: collision with root package name */
    public final int f78027o;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f78029q;

    /* renamed from: r, reason: collision with root package name */
    public final int f78030r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f78031s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f78032t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f78033u;

    /* renamed from: e, reason: collision with root package name */
    public final t f78017e = new t();

    /* renamed from: p, reason: collision with root package name */
    public boolean f78028p = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends m90.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f78034b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, InputStream inputStream) {
            super(bVar);
            this.f78034b = inputStream;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.e(this.f78034b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: org.junit.jupiter.params.shadow.com.univocity.parsers.common.b$b, reason: collision with other inner class name */
    public class C0956b extends m90.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f78036b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Charset f78037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0956b(b bVar, File file, Charset charset) {
            super(bVar);
            this.f78036b = file;
            this.f78037c = charset;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.d(this.f78036b, this.f78037c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends m90.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f78039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, File file) {
            super(bVar);
            this.f78039b = file;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.b(this.f78039b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends m90.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Reader f78041b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b bVar, Reader reader) {
            super(bVar);
            this.f78041b = reader;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.h(this.f78041b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends m90.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f78043b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Charset f78044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, InputStream inputStream, Charset charset) {
            super(bVar);
            this.f78043b = inputStream;
            this.f78044c = charset;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.g(this.f78043b, this.f78044c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends m90.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f78046b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar, InputStream inputStream) {
            super(bVar);
            this.f78046b = inputStream;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.e(this.f78046b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends m90.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f78048b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Charset f78049c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, File file, Charset charset) {
            super(bVar);
            this.f78048b = file;
            this.f78049c = charset;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.d(this.f78048b, this.f78049c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends m90.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f78051b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, File file) {
            super(bVar);
            this.f78051b = file;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.b(this.f78051b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends m90.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Reader f78053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b bVar, Reader reader) {
            super(bVar);
            this.f78053b = reader;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.h(this.f78053b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends m90.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f78055b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Charset f78056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b bVar, InputStream inputStream, Charset charset) {
            super(bVar);
            this.f78055b = inputStream;
            this.f78056c = charset;
        }

        @Override // m90.a
        public void a() {
            this.f72701a.g(this.f78055b, this.f78056c);
        }
    }

    public b(T t11) {
        t11.b();
        this.f78013a = t11;
        this.f78027o = t11.l();
        this.f78031s = t11.s();
        this.f78032t = t11.q();
        this.f78014b = new x(this, t11);
        this.f78019g = t11.q0();
        this.f78015c = t11.o0();
        this.f78016d = t11.o().b();
        this.f78022j = t11.w();
        this.f78023k = t11.p0();
        boolean v02 = t11.v0();
        this.f78026n = v02;
        this.f78024l = v02 ? new TreeMap<>() : Collections.EMPTY_MAP;
        this.f78029q = t11.z0();
        this.f78030r = t11.A();
        this.f78033u = t11.x0();
    }

    public final s<String[], y> A(File file, Charset charset) {
        return new C0956b(this, file, charset);
    }

    public final String[] A0() {
        while (!this.f78018f.isStopped()) {
            try {
                this.f78020h.o();
                this.f78021i = this.f78020h.c();
                if (this.f78033u && u()) {
                    E0();
                } else {
                    if (this.f78014b.f78213q.isEmpty()) {
                        D0();
                    }
                    String[] m11 = this.f78014b.m();
                    if (m11 != null) {
                        if (this.f78015c >= 0 && this.f78018f.p() >= this.f78015c) {
                            this.f78018f.stop();
                            if (this.f78015c == 0) {
                                H0();
                                return null;
                            }
                        }
                        if (this.f78019g != o90.y.f76714a) {
                            G0(m11);
                        }
                        return m11;
                    }
                    if (this.f78028p) {
                        return null;
                    }
                }
            } catch (NullPointerException e11) {
                if (this.f78018f == null) {
                    throw new IllegalStateException("Cannot parse without invoking method beginParsing(Reader) first");
                }
                if (this.f78020h != null) {
                    H0();
                }
                throw new IllegalStateException("Error parsing next record.", e11);
            } catch (EOFException unused) {
                String[] s11 = s();
                if (this.f78014b.f78213q.isEmpty()) {
                    H0();
                }
                return s11;
            } catch (Throwable th2) {
                try {
                    I0(t(th2));
                    return null;
                } catch (Throwable th3) {
                    I0(th2);
                    throw th3;
                }
            }
        }
        x xVar = this.f78014b;
        if (xVar.f78197a != 0) {
            return xVar.m();
        }
        H0();
        return null;
    }

    public final s<String[], y> B(InputStream inputStream) {
        return new f(this, inputStream);
    }

    public final p90.c B0() {
        String[] A0 = A0();
        if (A0 != null) {
            return this.f78018f.k(A0);
        }
        return null;
    }

    public final s<String[], y> C(InputStream inputStream, String str) {
        return D(inputStream, Charset.forName(str));
    }

    public final p90.c C0(String str) {
        String[] z02 = z0(str);
        if (z02 == null) {
            return null;
        }
        return this.f78018f.k(z02);
    }

    public final s<String[], y> D(InputStream inputStream, Charset charset) {
        return new e(this, inputStream, charset);
    }

    public abstract void D0();

    public final s<String[], y> E(Reader reader) {
        return new d(this, reader);
    }

    public void E0() {
        if (!this.f78026n) {
            try {
                this.f78020h.d(1L);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
        long n11 = this.f78020h.n();
        String r11 = this.f78020h.r();
        if (r11 != null) {
            this.f78025m = r11;
            this.f78024l.put(Long.valueOf(n11), this.f78025m);
        }
    }

    public final s<p90.c, y> F(File file) {
        return new h(this, file);
    }

    public final void F0() {
        this.f78014b.j();
        y yVar = this.f78018f;
        if (yVar instanceof o) {
            ((o) yVar).u();
        }
    }

    public final s<p90.c, y> G(File file, String str) {
        return H(file, Charset.forName(str));
    }

    public final void G0(String[] strArr) {
        r.a(strArr, this.f78019g, this.f78018f, this.f78022j);
    }

    public final s<p90.c, y> H(File file, Charset charset) {
        return new g(this, file, charset);
    }

    /* JADX WARN: Finally extract failed */
    public final void H0() {
        try {
            this.f78021i = (char) 0;
            try {
                y yVar = this.f78018f;
                if (yVar != null) {
                    yVar.stop();
                }
                try {
                    o90.z zVar = this.f78019g;
                    if (zVar != null) {
                        zVar.i(this.f78018f);
                    }
                    x xVar = this.f78014b;
                    if (xVar != null) {
                        xVar.f78203g.reset();
                    }
                    k90.c cVar = this.f78020h;
                    if (cVar != null) {
                        cVar.stop();
                    }
                } catch (Throwable th2) {
                    x xVar2 = this.f78014b;
                    if (xVar2 != null) {
                        xVar2.f78203g.reset();
                    }
                    k90.c cVar2 = this.f78020h;
                    if (cVar2 != null) {
                        cVar2.stop();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    o90.z zVar2 = this.f78019g;
                    if (zVar2 != null) {
                        zVar2.i(this.f78018f);
                    }
                    x xVar3 = this.f78014b;
                    if (xVar3 != null) {
                        xVar3.f78203g.reset();
                    }
                    k90.c cVar3 = this.f78020h;
                    if (cVar3 != null) {
                        cVar3.stop();
                    }
                    throw th3;
                } catch (Throwable th4) {
                    x xVar4 = this.f78014b;
                    if (xVar4 != null) {
                        xVar4.f78203g.reset();
                    }
                    k90.c cVar4 = this.f78020h;
                    if (cVar4 != null) {
                        cVar4.stop();
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            throw t(th5);
        }
    }

    public final s<p90.c, y> I(InputStream inputStream) {
        return new a(this, inputStream);
    }

    public final void I0(Throwable th2) {
        if (th2 == null) {
            H0();
            return;
        }
        try {
            H0();
        } catch (Throwable unused) {
        }
        if (th2 instanceof DataProcessingException) {
            DataProcessingException dataProcessingException = (DataProcessingException) th2;
            dataProcessingException.setContext(this.f78018f);
            throw dataProcessingException;
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new IllegalStateException(th2.getMessage(), th2);
        }
        throw ((Error) th2);
    }

    public final s<p90.c, y> J(InputStream inputStream, String str) {
        return K(inputStream, Charset.forName(str));
    }

    public final s<p90.c, y> K(InputStream inputStream, Charset charset) {
        return new j(this, inputStream, charset);
    }

    public final s<p90.c, y> L(Reader reader) {
        return new i(this, reader);
    }

    public final void M(File file) {
        S(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file));
    }

    public final void N(File file, String str) {
        S(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str));
    }

    public final void O(File file, Charset charset) {
        S(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset));
    }

    public final void P(InputStream inputStream) {
        S(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream));
    }

    public final void Q(InputStream inputStream, String str) {
        S(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str));
    }

    public final void R(InputStream inputStream, Charset charset) {
        S(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset));
    }

    public final void S(Reader reader) {
        h(reader);
        while (!this.f78018f.isStopped()) {
            try {
                try {
                    this.f78020h.o();
                    this.f78021i = this.f78020h.c();
                    if (this.f78033u && u()) {
                        E0();
                    } else {
                        if (this.f78014b.f78213q.isEmpty()) {
                            D0();
                        }
                        String[] m11 = this.f78014b.m();
                        if (m11 == null) {
                            continue;
                        } else {
                            if (this.f78015c >= 0 && this.f78018f.p() >= this.f78015c) {
                                this.f78018f.stop();
                                if (this.f78015c == 0) {
                                    return;
                                }
                            }
                            if (this.f78019g != o90.y.f76714a) {
                                G0(m11);
                            }
                        }
                    }
                } finally {
                    H0();
                }
            } catch (EOFException unused) {
                s();
                while (!this.f78014b.f78213q.isEmpty()) {
                    s();
                }
                return;
            } catch (Throwable th2) {
                try {
                    I0(t(th2));
                    return;
                } catch (Throwable th3) {
                    I0(th2);
                    throw th3;
                }
            }
        }
    }

    public List<String[]> T() {
        return w(false, null, -1);
    }

    public List<String[]> U(int i11) {
        return w(false, null, i11);
    }

    public final List<String[]> V(File file) {
        return h0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file));
    }

    public final List<String[]> W(File file, int i11) {
        return i0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file), i11);
    }

    public final List<String[]> X(File file, String str) {
        return h0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str));
    }

    public final List<String[]> Y(File file, String str, int i11) {
        return i0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str), i11);
    }

    public final List<String[]> Z(File file, Charset charset) {
        return h0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset));
    }

    public final <T> List<T> a(boolean z11, Reader reader, int i11) {
        if (reader == null) {
            if (z11) {
                throw new IllegalStateException("Input reader must not be null");
            }
            y yVar = this.f78018f;
            if (yVar == null) {
                throw new IllegalStateException("Input not defined. Please call method 'beginParsing()' with a valid input.");
            }
            if (yVar.isStopped()) {
                return Collections.EMPTY_LIST;
            }
        }
        if (i11 <= 0) {
            i11 = 10000;
        }
        ArrayList arrayList = new ArrayList(i11);
        if (reader != null) {
            h(reader);
        }
        return arrayList;
    }

    public final List<String[]> a0(File file, Charset charset, int i11) {
        return i0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset), i11);
    }

    public final void b(File file) {
        h(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file));
    }

    public final List<String[]> b0(InputStream inputStream) {
        return h0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream));
    }

    public final void c(File file, String str) {
        h(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str));
    }

    public final List<String[]> c0(InputStream inputStream, int i11) {
        return i0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream), i11);
    }

    public final void d(File file, Charset charset) {
        h(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset));
    }

    public final List<String[]> d0(InputStream inputStream, String str) {
        return h0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str));
    }

    public final void e(InputStream inputStream) {
        h(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream));
    }

    public final List<String[]> e0(InputStream inputStream, String str, int i11) {
        return i0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str), i11);
    }

    public final void f(InputStream inputStream, String str) {
        h(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str));
    }

    public final List<String[]> f0(InputStream inputStream, Charset charset) {
        return h0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset));
    }

    public final void g(InputStream inputStream, Charset charset) {
        h(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset));
    }

    public final List<String[]> g0(InputStream inputStream, Charset charset, int i11) {
        return i0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset), i11);
    }

    public final void h(Reader reader) {
        this.f78014b.l();
        if (reader instanceof t) {
            this.f78020h = new org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.b(this.f78013a.o().e(), this.f78013a.o().g(), this.f78013a.n0(), this.f78030r, true);
        } else {
            this.f78020h = this.f78013a.E0(this.f78030r);
        }
        this.f78020h.t(true);
        y j11 = j();
        this.f78018f = j11;
        Object obj = this.f78019g;
        if (obj instanceof n) {
            n nVar = (n) obj;
            nVar.f78179g = this.f78022j;
            nVar.f78180h = j11;
        }
        k90.c cVar = this.f78020h;
        if (cVar instanceof org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a) {
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a aVar = (org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a) cVar;
            aVar.w(n());
            Iterator<k90.g> it = this.f78013a.m0().iterator();
            while (it.hasNext()) {
                aVar.w(it.next());
            }
        }
        try {
            this.f78020h.v(reader);
            this.f78020h.d(this.f78023k);
            v();
            this.f78019g.h(this.f78018f);
        } catch (Throwable th2) {
            throw t(th2);
        }
    }

    public final List<String[]> h0(Reader reader) {
        return i0(reader, 0);
    }

    public boolean i() {
        return false;
    }

    public final List<String[]> i0(Reader reader, int i11) {
        return w(true, reader, i11);
    }

    public y j() {
        o oVar = new o(this, this.f78027o);
        oVar.f78167a = false;
        return oVar;
    }

    public List<p90.c> j0() {
        return x(false, null, -1);
    }

    public void k() {
        while (this.f78029q && this.f78014b.f78214r == null && !this.f78018f.isStopped() && !this.f78028p) {
            o90.z zVar = this.f78019g;
            try {
                this.f78019g = o90.y.f76714a;
                this.f78028p = true;
                A0();
            } finally {
                this.f78028p = false;
                this.f78019g = zVar;
            }
        }
    }

    public List<p90.c> k0(int i11) {
        return x(false, null, i11);
    }

    public final Map<Long, String> l() {
        return this.f78024l;
    }

    public final List<p90.c> l0(File file) {
        return x0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file));
    }

    public final y m() {
        return this.f78018f;
    }

    public final List<p90.c> m0(File file, int i11) {
        return y0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.j(file), i11);
    }

    public k90.g n() {
        return null;
    }

    public final List<p90.c> n0(File file, String str) {
        return x0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str));
    }

    public final String o() {
        return this.f78025m;
    }

    public final List<p90.c> o0(File file, String str, int i11) {
        return y0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.k(file, str), i11);
    }

    public final String p(CharSequence charSequence) {
        return "Parsed content: " + org.junit.jupiter.params.shadow.com.univocity.parsers.common.a.restrictContent(this.f78027o, charSequence);
    }

    public final List<p90.c> p0(File file, Charset charset) {
        return x0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset));
    }

    public final String[] q() {
        k();
        return this.f78014b.f78214r;
    }

    public final List<p90.c> q0(File file, Charset charset, int i11) {
        return y0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.l(file, charset), i11);
    }

    public final p90.f r() {
        y yVar = this.f78018f;
        if (yVar != null) {
            return yVar.s();
        }
        throw new IllegalStateException("Record metadata not available. The parser has not been started.");
    }

    public final List<p90.c> r0(InputStream inputStream) {
        return x0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] s() {
        /*
            r3 = this;
            boolean r0 = r3.i()     // Catch: java.lang.Throwable -> L15
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r1 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            int r1 = r1.f78197a     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L5e
            if (r0 == 0) goto L18
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.y r1 = r3.f78018f     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isStopped()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L18
            goto L5e
        L15:
            r0 = move-exception
            goto L90
        L18:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            k90.a r0 = r0.f78203g     // Catch: java.lang.Throwable -> L15
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r0 > 0) goto L42
            k90.c r0 = r3.f78020h     // Catch: java.lang.Throwable -> L15
            int r0 = r0.j()     // Catch: java.lang.Throwable -> L15
            if (r0 <= 0) goto L2b
            goto L42
        L2b:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            java.util.Deque<java.lang.String[]> r0 = r0.f78213q     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L40
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            java.util.Deque<java.lang.String[]> r0 = r0.f78213q     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L15
            goto L84
        L40:
            r0 = 0
            goto L84
        L42:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            k90.a r0 = r0.f78203g     // Catch: java.lang.Throwable -> L15
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L52
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            r0.b()     // Catch: java.lang.Throwable -> L15
            goto L57
        L52:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            r0.n()     // Catch: java.lang.Throwable -> L15
        L57:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r0 = r0.m()     // Catch: java.lang.Throwable -> L15
            goto L84
        L5e:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r1 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            k90.a r1 = r1.f78203g     // Catch: java.lang.Throwable -> L15
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L15
            if (r1 > 0) goto L79
            if (r0 == 0) goto L6b
            goto L79
        L6b:
            k90.c r0 = r3.f78020h     // Catch: java.lang.Throwable -> L15
            int r0 = r0.j()     // Catch: java.lang.Throwable -> L15
            if (r0 <= 0) goto L7e
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            r0.b()     // Catch: java.lang.Throwable -> L15
            goto L7e
        L79:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            r0.n()     // Catch: java.lang.Throwable -> L15
        L7e:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.x r0 = r3.f78014b     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r0 = r0.m()     // Catch: java.lang.Throwable -> L15
        L84:
            if (r0 == 0) goto L8f
            o90.z r1 = r3.f78019g
            o90.z r2 = o90.y.f76714a
            if (r1 == r2) goto L8f
            r3.G0(r0)
        L8f:
            return r0
        L90:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException r0 = r3.t(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.jupiter.params.shadow.com.univocity.parsers.common.b.s():java.lang.String[]");
    }

    public final List<p90.c> s0(InputStream inputStream, int i11) {
        return y0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.m(inputStream), i11);
    }

    public final TextParsingException t(Throwable th2) {
        y yVar = this.f78018f;
        if (yVar != null) {
            yVar.stop();
        }
        if (th2 instanceof DataProcessingException) {
            DataProcessingException dataProcessingException = (DataProcessingException) th2;
            dataProcessingException.restrictContent(Integer.valueOf(this.f78027o));
            dataProcessingException.setContext(this.f78018f);
            throw dataProcessingException;
        }
        String str = th2.getClass().getName() + " - " + th2.getMessage();
        char[] k11 = this.f78014b.f78203g.k();
        if (k11 != null) {
            int length = this.f78014b.f78203g.length();
            if (length > k11.length) {
                str = "Length of parsed input (" + length + ") exceeds the maximum number of characters defined in your parser settings (" + this.f78013a.t() + "). ";
                length = k11.length;
            }
            String str2 = new String(k11);
            if (str2.contains("\n") || str2.contains(c1.g.f7467d)) {
                String a11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.a(str2, true);
                str = str + "\nIdentified line separator characters in the parsed content. This may be the cause of the error. The line separator in your parser settings is set to '" + org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.a(this.f78013a.o().f(), false) + "'. " + p(a11);
            }
            if (length > 1073741823) {
                length = 1073741822;
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char c11 = k11[i12];
                if (c11 == 0) {
                    sb2.append('\\');
                    sb2.append('0');
                    i11++;
                } else {
                    sb2.append(c11);
                }
            }
            String sb3 = sb2.toString();
            if (i11 > 0) {
                str = str + "\nIdentified " + i11 + " null characters ('\u0000') on parsed content. This may indicate the data is corrupt or its encoding is invalid. Parsed content:\n\t" + p(sb3);
            }
        }
        if (th2 instanceof ArrayIndexOutOfBoundsException) {
            try {
                int parseInt = Integer.parseInt(th2.getMessage());
                if (parseInt == this.f78013a.t()) {
                    str = str + "\nHint: Number of characters processed may have exceeded limit of " + parseInt + " characters per column. Use settings.setMaxCharsPerColumn(int) to define the maximum number of characters a column can have";
                }
                if (parseInt == this.f78013a.u()) {
                    str = str + "\nHint: Number of columns processed may have exceeded limit of " + parseInt + " columns. Use settings.setMaxColumns(int) to define the maximum number of columns your input can have";
                }
                str = str + "\nEnsure your configuration is correct, with delimiters, quotes and escape sequences that match the input format you are trying to parse";
            } catch (Throwable unused) {
            }
        }
        try {
            if (!str.isEmpty()) {
                str = str + "\n";
            }
            str = str + "Parser Configuration: " + this.f78013a.toString();
        } catch (Exception unused2) {
        }
        if (this.f78027o == 0) {
            this.f78014b.f78203g.reset();
        }
        TextParsingException textParsingException = new TextParsingException(this.f78018f, str, th2);
        textParsingException.setErrorContentLength(this.f78027o);
        return textParsingException;
    }

    public final List<p90.c> t0(InputStream inputStream, String str) {
        return x0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str));
    }

    public boolean u() {
        return this.f78021i == this.f78016d;
    }

    public final List<p90.c> u0(InputStream inputStream, String str, int i11) {
        return y0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.n(inputStream, str), i11);
    }

    public final List<p90.c> v0(InputStream inputStream, Charset charset) {
        return x0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset));
    }

    public final List<String[]> w(boolean z11, Reader reader, int i11) {
        List<T> a11 = a(z11, reader, i11);
        while (true) {
            String[] A0 = A0();
            if (A0 == null) {
                return a11;
            }
            a11.add(A0);
        }
    }

    public final List<p90.c> w0(InputStream inputStream, Charset charset, int i11) {
        return y0(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.o(inputStream, charset), i11);
    }

    public final List<p90.c> x(boolean z11, Reader reader, int i11) {
        List<T> a11 = a(z11, reader, i11);
        if (!this.f78018f.isStopped()) {
            while (true) {
                p90.c B0 = B0();
                if (B0 == null) {
                    break;
                }
                a11.add(B0);
            }
        }
        return a11;
    }

    public final List<p90.c> x0(Reader reader) {
        return y0(reader, 0);
    }

    public final s<String[], y> y(File file) {
        return new c(this, file);
    }

    public final List<p90.c> y0(Reader reader, int i11) {
        return x(true, reader, i11);
    }

    public final s<String[], y> z(File file, String str) {
        return A(file, Charset.forName(str));
    }

    public final String[] z0(String str) {
        String[] m11;
        if (str == null || str.isEmpty()) {
            return null;
        }
        this.f78017e.a(str);
        y yVar = this.f78018f;
        if (yVar == null || yVar.isStopped()) {
            h(this.f78017e);
        } else {
            k90.c cVar = this.f78020h;
            if (cVar instanceof org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.b) {
                ((org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.b) cVar).x();
            } else if (cVar instanceof k90.i) {
                ((k90.i) cVar).x();
            }
        }
        do {
            try {
                if (this.f78018f.isStopped()) {
                    return null;
                }
                this.f78020h.o();
                this.f78021i = this.f78020h.c();
                if (this.f78033u && u()) {
                    E0();
                    return null;
                }
                if (this.f78014b.f78213q.isEmpty()) {
                    D0();
                }
                m11 = this.f78014b.m();
            } catch (NullPointerException e11) {
                if (this.f78020h != null) {
                    I0(null);
                }
                throw new IllegalStateException("Error parsing next record.", e11);
            } catch (EOFException unused) {
                return s();
            } catch (Throwable th2) {
                try {
                    I0(t(th2));
                    return null;
                } catch (Throwable th3) {
                    I0(th2);
                    throw th3;
                }
            }
        } while (m11 == null);
        if (this.f78019g != o90.y.f76714a) {
            G0(m11);
        }
        return m11;
    }

    public void v() {
    }
}
