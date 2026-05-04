package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends s<T> {
        public a() {
        }

        @Override // com.google.gson.s
        public T e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return (T) s.this.e(aVar);
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        public void i(cp.c cVar, T t11) throws IOException {
            if (t11 == null) {
                cVar.L();
            } else {
                s.this.i(cVar, t11);
            }
        }
    }

    public final T a(Reader reader) throws IOException {
        return e(new cp.a(reader));
    }

    public final T b(String str) throws IOException {
        return a(new StringReader(str));
    }

    public final T c(j jVar) {
        try {
            return e(new xo.f(jVar));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public final s<T> d() {
        return new a();
    }

    public abstract T e(cp.a aVar) throws IOException;

    public final String f(T t11) {
        StringWriter stringWriter = new StringWriter();
        try {
            g(stringWriter, t11);
            return stringWriter.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public final void g(Writer writer, T t11) throws IOException {
        i(new cp.c(writer), t11);
    }

    public final j h(T t11) {
        try {
            xo.g gVar = new xo.g();
            i(gVar, t11);
            return gVar.y0();
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public abstract void i(cp.c cVar, T t11) throws IOException;
}
