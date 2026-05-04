package xo;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f extends cp.a {
    public static final Reader V = new a();
    public static final Object W = new Object();
    public Object[] R;
    public int S;
    public String[] T;
    public int[] U;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i11, int i12) throws IOException {
            throw new AssertionError();
        }
    }

    public f(com.google.gson.j jVar) {
        super(V);
        this.R = new Object[32];
        this.S = 0;
        this.T = new String[32];
        this.U = new int[32];
        L0(jVar);
    }

    private String L() {
        return " at path " + getPath();
    }

    @Override // cp.a
    public String C() {
        return w(true);
    }

    @Override // cp.a
    public void C0() throws IOException {
        if (k0() == JsonToken.NAME) {
            a0();
            this.T[this.S - 2] = "null";
        } else {
            H0();
            int i11 = this.S;
            if (i11 > 0) {
                this.T[i11 - 1] = "null";
            }
        }
        int i12 = this.S;
        if (i12 > 0) {
            int[] iArr = this.U;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
    }

    @Override // cp.a
    public boolean E() throws IOException {
        JsonToken k02 = k0();
        return (k02 == JsonToken.END_OBJECT || k02 == JsonToken.END_ARRAY || k02 == JsonToken.END_DOCUMENT) ? false : true;
    }

    public final void E0(JsonToken jsonToken) throws IOException {
        if (k0() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + k0() + L());
    }

    public com.google.gson.j F0() throws IOException {
        JsonToken k02 = k0();
        if (k02 != JsonToken.NAME && k02 != JsonToken.END_ARRAY && k02 != JsonToken.END_OBJECT && k02 != JsonToken.END_DOCUMENT) {
            com.google.gson.j jVar = (com.google.gson.j) G0();
            C0();
            return jVar;
        }
        throw new IllegalStateException("Unexpected " + k02 + " when reading a JsonElement.");
    }

    public final Object G0() {
        return this.R[this.S - 1];
    }

    public final Object H0() {
        Object[] objArr = this.R;
        int i11 = this.S - 1;
        this.S = i11;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    public void K0() throws IOException {
        E0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) G0()).next();
        L0(entry.getValue());
        L0(new com.google.gson.n((String) entry.getKey()));
    }

    public final void L0(Object obj) {
        int i11 = this.S;
        Object[] objArr = this.R;
        if (i11 == objArr.length) {
            int i12 = i11 * 2;
            this.R = Arrays.copyOf(objArr, i12);
            this.U = Arrays.copyOf(this.U, i12);
            this.T = (String[]) Arrays.copyOf(this.T, i12);
        }
        Object[] objArr2 = this.R;
        int i13 = this.S;
        this.S = i13 + 1;
        objArr2[i13] = obj;
    }

    @Override // cp.a
    public boolean S() throws IOException {
        E0(JsonToken.BOOLEAN);
        boolean f11 = ((com.google.gson.n) H0()).f();
        int i11 = this.S;
        if (i11 > 0) {
            int[] iArr = this.U;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return f11;
    }

    @Override // cp.a
    public double U() throws IOException {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (k02 != jsonToken && k02 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + L());
        }
        double j11 = ((com.google.gson.n) G0()).j();
        if (!H() && (Double.isNaN(j11) || Double.isInfinite(j11))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j11);
        }
        H0();
        int i11 = this.S;
        if (i11 > 0) {
            int[] iArr = this.U;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return j11;
    }

    @Override // cp.a
    public int V() throws IOException {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (k02 != jsonToken && k02 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + L());
        }
        int l11 = ((com.google.gson.n) G0()).l();
        H0();
        int i11 = this.S;
        if (i11 > 0) {
            int[] iArr = this.U;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return l11;
    }

    @Override // cp.a
    public long Z() throws IOException {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (k02 != jsonToken && k02 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + L());
        }
        long q11 = ((com.google.gson.n) G0()).q();
        H0();
        int i11 = this.S;
        if (i11 > 0) {
            int[] iArr = this.U;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return q11;
    }

    @Override // cp.a
    public void a() throws IOException {
        E0(JsonToken.BEGIN_ARRAY);
        L0(((com.google.gson.g) G0()).iterator());
        this.U[this.S - 1] = 0;
    }

    @Override // cp.a
    public String a0() throws IOException {
        E0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) G0()).next();
        String str = (String) entry.getKey();
        this.T[this.S - 1] = str;
        L0(entry.getValue());
        return str;
    }

    @Override // cp.a
    public void c() throws IOException {
        E0(JsonToken.BEGIN_OBJECT);
        L0(((com.google.gson.l) G0()).entrySet().iterator());
    }

    @Override // cp.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.R = new Object[]{W};
        this.S = 1;
    }

    @Override // cp.a
    public void d0() throws IOException {
        E0(JsonToken.NULL);
        H0();
        int i11 = this.S;
        if (i11 > 0) {
            int[] iArr = this.U;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // cp.a
    public String getPath() {
        return w(false);
    }

    @Override // cp.a
    public String h0() throws IOException {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.STRING;
        if (k02 == jsonToken || k02 == JsonToken.NUMBER) {
            String t11 = ((com.google.gson.n) H0()).t();
            int i11 = this.S;
            if (i11 > 0) {
                int[] iArr = this.U;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
            return t11;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + L());
    }

    @Override // cp.a
    public void k() throws IOException {
        E0(JsonToken.END_ARRAY);
        H0();
        H0();
        int i11 = this.S;
        if (i11 > 0) {
            int[] iArr = this.U;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // cp.a
    public JsonToken k0() throws IOException {
        if (this.S == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object G0 = G0();
        if (G0 instanceof Iterator) {
            boolean z11 = this.R[this.S - 2] instanceof com.google.gson.l;
            Iterator it = (Iterator) G0;
            if (!it.hasNext()) {
                return z11 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z11) {
                return JsonToken.NAME;
            }
            L0(it.next());
            return k0();
        }
        if (G0 instanceof com.google.gson.l) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (G0 instanceof com.google.gson.g) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(G0 instanceof com.google.gson.n)) {
            if (G0 instanceof com.google.gson.k) {
                return JsonToken.NULL;
            }
            if (G0 == W) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        com.google.gson.n nVar = (com.google.gson.n) G0;
        if (nVar.C()) {
            return JsonToken.STRING;
        }
        if (nVar.z()) {
            return JsonToken.BOOLEAN;
        }
        if (nVar.B()) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // cp.a
    public void q() throws IOException {
        E0(JsonToken.END_OBJECT);
        H0();
        H0();
        int i11 = this.S;
        if (i11 > 0) {
            int[] iArr = this.U;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // cp.a
    public String toString() {
        return f.class.getSimpleName() + L();
    }

    public final String w(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i11 = 0;
        while (true) {
            int i12 = this.S;
            if (i11 >= i12) {
                return sb2.toString();
            }
            Object[] objArr = this.R;
            Object obj = objArr[i11];
            if (obj instanceof com.google.gson.g) {
                i11++;
                if (i11 < i12 && (objArr[i11] instanceof Iterator)) {
                    int i13 = this.U[i11];
                    if (z11 && i13 > 0 && (i11 == i12 - 1 || i11 == i12 - 2)) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(l50.b.f69930l);
                }
            } else if ((obj instanceof com.google.gson.l) && (i11 = i11 + 1) < i12 && (objArr[i11] instanceof Iterator)) {
                sb2.append('.');
                String str = this.T[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i11++;
        }
    }
}
