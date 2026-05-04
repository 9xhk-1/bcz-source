package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l {
    public l() {
        throw new UnsupportedOperationException();
    }

    public static com.google.gson.j a(cp.a aVar) throws JsonParseException {
        boolean z11;
        try {
            try {
                aVar.k0();
                z11 = false;
            } catch (EOFException e11) {
                e = e11;
                z11 = true;
            }
            try {
                return xo.n.V.e(aVar);
            } catch (EOFException e12) {
                e = e12;
                if (z11) {
                    return com.google.gson.k.f35047a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e13) {
            throw new JsonSyntaxException(e13);
        } catch (IOException e14) {
            throw new JsonIOException(e14);
        } catch (NumberFormatException e15) {
            throw new JsonSyntaxException(e15);
        }
    }

    public static void b(com.google.gson.j jVar, cp.c cVar) throws IOException {
        xo.n.V.i(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        public final Appendable f35039a;

        /* renamed from: b, reason: collision with root package name */
        public final C0436a f35040b = new C0436a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.gson.internal.l$a$a, reason: collision with other inner class name */
        public static class C0436a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            public char[] f35041a;

            @Override // java.lang.CharSequence
            public char charAt(int i11) {
                return this.f35041a[i11];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f35041a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i11, int i12) {
                return new String(this.f35041a, i11, i12 - i11);
            }
        }

        public a(Appendable appendable) {
            this.f35039a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) throws IOException {
            C0436a c0436a = this.f35040b;
            c0436a.f35041a = cArr;
            this.f35039a.append(c0436a, i11, i12 + i11);
        }

        @Override // java.io.Writer
        public void write(int i11) throws IOException {
            this.f35039a.append((char) i11);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
