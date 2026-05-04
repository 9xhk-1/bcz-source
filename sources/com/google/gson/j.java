package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class j {
    public abstract j a();

    public BigDecimal b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public g m() {
        if (u()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public k n() {
        if (v()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public l o() {
        if (w()) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public n p() {
        if (x()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String t() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            cp.c cVar = new cp.c(stringWriter);
            cVar.d0(true);
            com.google.gson.internal.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean u() {
        return this instanceof g;
    }

    public boolean v() {
        return this instanceof k;
    }

    public boolean w() {
        return this instanceof l;
    }

    public boolean x() {
        return this instanceof n;
    }
}
