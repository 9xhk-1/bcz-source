package po;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.q6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public abstract class j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f81058a;

        public a(Charset charset) {
            this.f81058a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // po.f
        public j a(Charset charset) {
            return charset.equals(this.f81058a) ? j.this : super.a(charset);
        }

        @Override // po.f
        public InputStream m() throws IOException {
            return new f0(j.this.m(), this.f81058a, 8192);
        }

        public String toString() {
            return j.this.toString() + ".asByteSource(" + this.f81058a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends j {

        /* renamed from: b, reason: collision with root package name */
        public static final ho.m0 f81060b = ho.m0.l("\r\n|\n|\r");

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f81061a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<String> {

            /* renamed from: c, reason: collision with root package name */
            public Iterator<String> f81062c;

            public a() {
                this.f81062c = b.f81060b.n(b.this.f81061a).iterator();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public String a() {
                if (this.f81062c.hasNext()) {
                    String next = this.f81062c.next();
                    if (this.f81062c.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return b();
            }
        }

        public b(CharSequence seq) {
            this.f81061a = (CharSequence) Preconditions.checkNotNull(seq);
        }

        @Override // po.j
        public boolean i() {
            return this.f81061a.length() == 0;
        }

        @Override // po.j
        public long j() {
            return this.f81061a.length();
        }

        @Override // po.j
        public Optional<Long> k() {
            return Optional.of(Long.valueOf(this.f81061a.length()));
        }

        @Override // po.j
        public Reader m() {
            return new h(this.f81061a);
        }

        @Override // po.j
        public String n() {
            return this.f81061a.toString();
        }

        @Override // po.j
        @CheckForNull
        public String o() {
            Iterator<String> t11 = t();
            if (t11.hasNext()) {
                return t11.next();
            }
            return null;
        }

        @Override // po.j
        public ImmutableList<String> p() {
            return ImmutableList.copyOf(t());
        }

        @Override // po.j
        @d0
        public <T> T q(x<T> processor) throws IOException {
            Iterator<String> t11 = t();
            while (t11.hasNext() && processor.a(t11.next())) {
            }
            return processor.getResult();
        }

        public final Iterator<String> t() {
            return new a();
        }

        public String toString() {
            return "CharSource.wrap(" + ho.c.k(this.f81061a, 30, "...") + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public final Iterable<? extends j> f81064a;

        public c(Iterable<? extends j> sources) {
            this.f81064a = (Iterable) Preconditions.checkNotNull(sources);
        }

        @Override // po.j
        public boolean i() throws IOException {
            Iterator<? extends j> it = this.f81064a.iterator();
            while (it.hasNext()) {
                if (!it.next().i()) {
                    return false;
                }
            }
            return true;
        }

        @Override // po.j
        public long j() throws IOException {
            Iterator<? extends j> it = this.f81064a.iterator();
            long j11 = 0;
            while (it.hasNext()) {
                j11 += it.next().j();
            }
            return j11;
        }

        @Override // po.j
        public Optional<Long> k() {
            Iterator<? extends j> it = this.f81064a.iterator();
            long j11 = 0;
            while (it.hasNext()) {
                Optional<Long> k11 = it.next().k();
                if (!k11.isPresent()) {
                    return Optional.absent();
                }
                j11 += k11.get().longValue();
            }
            return Optional.of(Long.valueOf(j11));
        }

        @Override // po.j
        public Reader m() throws IOException {
            return new c0(this.f81064a.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.f81064a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends e {

        /* renamed from: c, reason: collision with root package name */
        public static final d f81065c = new d();

        public d() {
            super("");
        }

        @Override // po.j.b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends b {
        public e(String seq) {
            super(seq);
        }

        @Override // po.j
        public long e(Appendable appendable) throws IOException {
            appendable.append(this.f81061a);
            return this.f81061a.length();
        }

        @Override // po.j
        public long f(i sink) throws IOException {
            Preconditions.checkNotNull(sink);
            try {
                ((Writer) n.c().e(sink.b())).write((String) this.f81061a);
                return this.f81061a.length();
            } finally {
            }
        }

        @Override // po.j.b, po.j
        public Reader m() {
            return new StringReader((String) this.f81061a);
        }
    }

    public static j b(Iterable<? extends j> sources) {
        return new c(sources);
    }

    public static j c(Iterator<? extends j> sources) {
        return b(ImmutableList.copyOf(sources));
    }

    public static j d(j... sources) {
        return b(ImmutableList.copyOf(sources));
    }

    public static j h() {
        return d.f81065c;
    }

    public static j r(CharSequence charSequence) {
        return charSequence instanceof String ? new e((String) charSequence) : new b(charSequence);
    }

    public f a(Charset charset) {
        return new a(charset);
    }

    @uo.a
    public long e(Appendable appendable) throws IOException {
        Preconditions.checkNotNull(appendable);
        try {
            return k.b((Reader) n.c().e(m()), appendable);
        } finally {
        }
    }

    @uo.a
    public long f(i sink) throws IOException {
        Preconditions.checkNotNull(sink);
        n c11 = n.c();
        try {
            return k.b((Reader) c11.e(m()), (Writer) c11.e(sink.b()));
        } finally {
        }
    }

    public final long g(Reader reader) throws IOException {
        long j11 = 0;
        while (true) {
            long skip = reader.skip(Long.MAX_VALUE);
            if (skip == 0) {
                return j11;
            }
            j11 += skip;
        }
    }

    public boolean i() throws IOException {
        Optional<Long> k11 = k();
        if (k11.isPresent()) {
            return k11.get().longValue() == 0;
        }
        try {
            return ((Reader) n.c().e(m())).read() == -1;
        } finally {
        }
    }

    public long j() throws IOException {
        Optional<Long> k11 = k();
        if (k11.isPresent()) {
            return k11.get().longValue();
        }
        try {
            return g((Reader) n.c().e(m()));
        } finally {
        }
    }

    public Optional<Long> k() {
        return Optional.absent();
    }

    public BufferedReader l() throws IOException {
        Reader m11 = m();
        return m11 instanceof BufferedReader ? (BufferedReader) m11 : new BufferedReader(m11);
    }

    public abstract Reader m() throws IOException;

    public String n() throws IOException {
        try {
            return k.k((Reader) n.c().e(m()));
        } finally {
        }
    }

    @CheckForNull
    public String o() throws IOException {
        try {
            return ((BufferedReader) n.c().e(l())).readLine();
        } finally {
        }
    }

    public ImmutableList<String> p() throws IOException {
        try {
            BufferedReader bufferedReader = (BufferedReader) n.c().e(l());
            ArrayList q11 = q6.q();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return ImmutableList.copyOf((Collection) q11);
                }
                q11.add(readLine);
            }
        } finally {
        }
    }

    @d0
    @uo.a
    public <T> T q(x<T> xVar) throws IOException {
        Preconditions.checkNotNull(xVar);
        try {
            return (T) k.h((Reader) n.c().e(m()), xVar);
        } finally {
        }
    }
}
