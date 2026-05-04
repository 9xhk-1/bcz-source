package xo;

import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j extends s<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final t f98184c = k(ToNumberPolicy.DOUBLE);

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.d f98185a;

    /* renamed from: b, reason: collision with root package name */
    public final r f98186b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f98187a;

        public a(r rVar) {
            this.f98187a = rVar;
        }

        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Object.class) {
                return new j(dVar, this.f98187a, aVar2);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98188a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f98188a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98188a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98188a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98188a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98188a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98188a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public /* synthetic */ j(com.google.gson.d dVar, r rVar, a aVar) {
        this(dVar, rVar);
    }

    public static t j(r rVar) {
        return rVar == ToNumberPolicy.DOUBLE ? f98184c : k(rVar);
    }

    private static t k(r rVar) {
        return new a(rVar);
    }

    @Override // com.google.gson.s
    public Object e(cp.a aVar) throws IOException {
        JsonToken k02 = aVar.k0();
        Object m11 = m(aVar, k02);
        if (m11 == null) {
            return l(aVar, k02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.E()) {
                String a02 = m11 instanceof Map ? aVar.a0() : null;
                JsonToken k03 = aVar.k0();
                Object m12 = m(aVar, k03);
                boolean z11 = m12 != null;
                if (m12 == null) {
                    m12 = l(aVar, k03);
                }
                if (m11 instanceof List) {
                    ((List) m11).add(m12);
                } else {
                    ((Map) m11).put(a02, m12);
                }
                if (z11) {
                    arrayDeque.addLast(m11);
                    m11 = m12;
                }
            } else {
                if (m11 instanceof List) {
                    aVar.k();
                } else {
                    aVar.q();
                }
                if (arrayDeque.isEmpty()) {
                    return m11;
                }
                m11 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.s
    public void i(cp.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.L();
            return;
        }
        s q11 = this.f98185a.q(obj.getClass());
        if (!(q11 instanceof j)) {
            q11.i(cVar, obj);
        } else {
            cVar.f();
            cVar.k();
        }
    }

    public final Object l(cp.a aVar, JsonToken jsonToken) throws IOException {
        int i11 = b.f98188a[jsonToken.ordinal()];
        if (i11 == 3) {
            return aVar.h0();
        }
        if (i11 == 4) {
            return this.f98186b.a(aVar);
        }
        if (i11 == 5) {
            return Boolean.valueOf(aVar.S());
        }
        if (i11 == 6) {
            aVar.d0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    public final Object m(cp.a aVar, JsonToken jsonToken) throws IOException {
        int i11 = b.f98188a[jsonToken.ordinal()];
        if (i11 == 1) {
            aVar.a();
            return new ArrayList();
        }
        if (i11 != 2) {
            return null;
        }
        aVar.c();
        return new LinkedTreeMap();
    }

    public j(com.google.gson.d dVar, r rVar) {
        this.f98185a = dVar;
        this.f98186b = rVar;
    }
}
