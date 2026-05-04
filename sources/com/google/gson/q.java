package com.google.gson;

import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class q implements Iterator<j> {

    /* renamed from: a, reason: collision with root package name */
    public final cp.a f35050a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35051b;

    public q(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j next() throws JsonParseException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return com.google.gson.internal.l.a(this.f35050a);
        } catch (JsonParseException e11) {
            if (e11.getCause() instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e11;
        } catch (OutOfMemoryError e12) {
            throw new JsonParseException("Failed parsing JSON source to Json", e12);
        } catch (StackOverflowError e13) {
            throw new JsonParseException("Failed parsing JSON source to Json", e13);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z11;
        synchronized (this.f35051b) {
            try {
                try {
                    try {
                        z11 = this.f35050a.k0() != JsonToken.END_DOCUMENT;
                    } catch (IOException e11) {
                        throw new JsonIOException(e11);
                    }
                } catch (MalformedJsonException e12) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public q(Reader reader) {
        cp.a aVar = new cp.a(reader);
        this.f35050a = aVar;
        aVar.w0(true);
        this.f35051b = new Object();
    }
}
