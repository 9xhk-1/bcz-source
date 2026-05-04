package okhttp3;

import ix.g;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import okhttp3.i;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends m {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f77266d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final j f77267e = j.f77447e.c("application/x-www-form-urlencoded");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<String> f77268b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<String> f77269c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final Charset f77270a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<String> f77271b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<String> f77272c;

        /* JADX WARN: Multi-variable type inference failed */
        @w00.k
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @m80.k
        public final a a(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            List<String> list = this.f77271b;
            i.b bVar = i.f77284k;
            list.add(i.b.f(bVar, name, 0, 0, i.f77294u, false, false, true, false, this.f77270a, 91, null));
            this.f77272c.add(i.b.f(bVar, value, 0, 0, i.f77294u, false, false, true, false, this.f77270a, 91, null));
            return this;
        }

        @m80.k
        public final a b(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            List<String> list = this.f77271b;
            i.b bVar = i.f77284k;
            list.add(i.b.f(bVar, name, 0, 0, i.f77294u, true, false, true, false, this.f77270a, 83, null));
            this.f77272c.add(i.b.f(bVar, value, 0, 0, i.f77294u, true, false, true, false, this.f77270a, 83, null));
            return this;
        }

        @m80.k
        public final f c() {
            return new f(this.f77271b, this.f77272c);
        }

        @w00.k
        public a(@m80.l Charset charset) {
            this.f77270a = charset;
            this.f77271b = new ArrayList();
            this.f77272c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i11, v vVar) {
            this((i11 & 1) != 0 ? null : charset);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    public f(@m80.k List<String> encodedNames, @m80.k List<String> encodedValues) {
        g0.p(encodedNames, "encodedNames");
        g0.p(encodedValues, "encodedValues");
        this.f77268b = u50.f.h0(encodedNames);
        this.f77269c = u50.f.h0(encodedValues);
    }

    @Override // okhttp3.m
    public long a() {
        return y(null, true);
    }

    @Override // okhttp3.m
    @m80.k
    public j b() {
        return f77267e;
    }

    @Override // okhttp3.m
    public void r(@m80.k l60.l sink) throws IOException {
        g0.p(sink, "sink");
        y(sink, false);
    }

    @w00.j(name = "-deprecated_size")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = g.b.f62794h, imports = {}))
    public final int s() {
        return w();
    }

    @m80.k
    public final String t(int i11) {
        return this.f77268b.get(i11);
    }

    @m80.k
    public final String u(int i11) {
        return this.f77269c.get(i11);
    }

    @m80.k
    public final String v(int i11) {
        return i.b.n(i.f77284k, t(i11), 0, 0, true, 3, null);
    }

    @w00.j(name = g.b.f62794h)
    public final int w() {
        return this.f77268b.size();
    }

    @m80.k
    public final String x(int i11) {
        return i.b.n(i.f77284k, u(i11), 0, 0, true, 3, null);
    }

    public final long y(l60.l lVar, boolean z11) {
        l60.k buffer;
        if (z11) {
            buffer = new l60.k();
        } else {
            g0.m(lVar);
            buffer = lVar.getBuffer();
        }
        int size = this.f77268b.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                buffer.writeByte(38);
            }
            buffer.n5(this.f77268b.get(i11));
            buffer.writeByte(61);
            buffer.n5(this.f77269c.get(i11));
        }
        if (!z11) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.e();
        return size2;
    }
}
