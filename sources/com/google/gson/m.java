package com.google.gson;

import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m {
    @Deprecated
    public m() {
    }

    public static j d(cp.a aVar) throws JsonIOException, JsonSyntaxException {
        boolean H = aVar.H();
        aVar.w0(true);
        try {
            try {
                return com.google.gson.internal.l.a(aVar);
            } catch (OutOfMemoryError e11) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e11);
            } catch (StackOverflowError e12) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e12);
            }
        } finally {
            aVar.w0(H);
        }
    }

    public static j e(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            cp.a aVar = new cp.a(reader);
            j d11 = d(aVar);
            if (!d11.v() && aVar.k0() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return d11;
        } catch (MalformedJsonException e11) {
            throw new JsonSyntaxException(e11);
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        } catch (NumberFormatException e13) {
            throw new JsonSyntaxException(e13);
        }
    }

    public static j f(String str) throws JsonSyntaxException {
        return e(new StringReader(str));
    }

    @Deprecated
    public j a(cp.a aVar) throws JsonIOException, JsonSyntaxException {
        return d(aVar);
    }

    @Deprecated
    public j b(Reader reader) throws JsonIOException, JsonSyntaxException {
        return e(reader);
    }

    @Deprecated
    public j c(String str) throws JsonSyntaxException {
        return f(str);
    }
}
