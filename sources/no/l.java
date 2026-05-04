package no;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@go.a
/* loaded from: classes7.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a implements Funnel<byte[]> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void funnel(byte[] from, f0 into) {
            into.b(from);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b implements Funnel<Integer> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void funnel(Integer from, f0 into) {
            into.putInt(from.intValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c implements Funnel<Long> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void funnel(Long from, f0 into) {
            into.putLong(from.longValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<E> implements Funnel<Iterable<? extends E>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Funnel<E> f75332a;

        public d(Funnel<E> elementFunnel) {
            this.f75332a = (Funnel) Preconditions.checkNotNull(elementFunnel);
        }

        @Override // com.google.common.hash.Funnel
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void funnel(Iterable<? extends E> from, f0 into) {
            Iterator<? extends E> it = from.iterator();
            while (it.hasNext()) {
                this.f75332a.funnel(it.next(), into);
            }
        }

        public boolean equals(@CheckForNull Object o11) {
            if (o11 instanceof d) {
                return this.f75332a.equals(((d) o11).f75332a);
            }
            return false;
        }

        public int hashCode() {
            return d.class.hashCode() ^ this.f75332a.hashCode();
        }

        public String toString() {
            return "Funnels.sequentialFunnel(" + this.f75332a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final f0 f75333a;

        public e(f0 sink) {
            this.f75333a = (f0) Preconditions.checkNotNull(sink);
        }

        public String toString() {
            return "Funnels.asOutputStream(" + this.f75333a + pn.j.f81007d;
        }

        @Override // java.io.OutputStream
        public void write(int b11) {
            this.f75333a.a((byte) b11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes) {
            this.f75333a.b(bytes);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) {
            this.f75333a.e(bytes, off, len);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements Funnel<CharSequence>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f75334a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Serializable {
            private static final long serialVersionUID = 0;

            /* renamed from: a, reason: collision with root package name */
            public final String f75335a;

            public a(Charset charset) {
                this.f75335a = charset.name();
            }

            private Object readResolve() {
                return l.f(Charset.forName(this.f75335a));
            }
        }

        public f(Charset charset) {
            this.f75334a = (Charset) Preconditions.checkNotNull(charset);
        }

        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.hash.Funnel
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void funnel(CharSequence from, f0 into) {
            into.g(from, this.f75334a);
        }

        public boolean equals(@CheckForNull Object o11) {
            if (o11 instanceof f) {
                return this.f75334a.equals(((f) o11).f75334a);
            }
            return false;
        }

        public int hashCode() {
            return f.class.hashCode() ^ this.f75334a.hashCode();
        }

        public String toString() {
            return "Funnels.stringFunnel(" + this.f75334a.name() + pn.j.f81007d;
        }

        public Object writeReplace() {
            return new a(this.f75334a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum g implements Funnel<CharSequence> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void funnel(CharSequence from, f0 into) {
            into.d(from);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    public static OutputStream a(f0 sink) {
        return new e(sink);
    }

    public static Funnel<byte[]> b() {
        return a.INSTANCE;
    }

    public static Funnel<Integer> c() {
        return b.INSTANCE;
    }

    public static Funnel<Long> d() {
        return c.INSTANCE;
    }

    public static <E> Funnel<Iterable<? extends E>> e(Funnel<E> elementFunnel) {
        return new d(elementFunnel);
    }

    public static Funnel<CharSequence> f(Charset charset) {
        return new f(charset);
    }

    public static Funnel<CharSequence> g() {
        return g.INSTANCE;
    }
}
