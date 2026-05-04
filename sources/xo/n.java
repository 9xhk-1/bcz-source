package xo;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n {
    public static final com.google.gson.s<BigInteger> A;
    public static final com.google.gson.s<LazilyParsedNumber> B;
    public static final com.google.gson.t C;
    public static final com.google.gson.s<StringBuilder> D;
    public static final com.google.gson.t E;
    public static final com.google.gson.s<StringBuffer> F;
    public static final com.google.gson.t G;
    public static final com.google.gson.s<URL> H;
    public static final com.google.gson.t I;
    public static final com.google.gson.s<URI> J;
    public static final com.google.gson.t K;
    public static final com.google.gson.s<InetAddress> L;
    public static final com.google.gson.t M;
    public static final com.google.gson.s<UUID> N;
    public static final com.google.gson.t O;
    public static final com.google.gson.s<Currency> P;
    public static final com.google.gson.t Q;
    public static final com.google.gson.s<Calendar> R;
    public static final com.google.gson.t S;
    public static final com.google.gson.s<Locale> T;
    public static final com.google.gson.t U;
    public static final com.google.gson.s<com.google.gson.j> V;
    public static final com.google.gson.t W;
    public static final com.google.gson.t X;

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.s<Class> f98223a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.t f98224b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.s<BitSet> f98225c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.t f98226d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.s<Boolean> f98227e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.gson.s<Boolean> f98228f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.t f98229g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.gson.s<Number> f98230h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.t f98231i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.gson.s<Number> f98232j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.gson.t f98233k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.google.gson.s<Number> f98234l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.gson.t f98235m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.gson.s<AtomicInteger> f98236n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.gson.t f98237o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.gson.s<AtomicBoolean> f98238p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.gson.t f98239q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.gson.s<AtomicIntegerArray> f98240r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.gson.t f98241s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.gson.s<Number> f98242t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.gson.s<Number> f98243u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.gson.s<Number> f98244v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.google.gson.s<Character> f98245w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.google.gson.t f98246x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.google.gson.s<String> f98247y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.google.gson.s<BigDecimal> f98248z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.google.gson.s<AtomicIntegerArray> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray e(cp.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.E()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.V()));
                } catch (NumberFormatException e11) {
                    throw new JsonSyntaxException(e11);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicIntegerArray.set(i11, ((Integer) arrayList.get(i11)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.e();
            int length = atomicIntegerArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                cVar.m0(atomicIntegerArray.get(i11));
            }
            cVar.j();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a0 implements com.google.gson.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f98249a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.s f98250b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a<T1> extends com.google.gson.s<T1> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f98251a;

            public a(Class cls) {
                this.f98251a = cls;
            }

            @Override // com.google.gson.s
            public T1 e(cp.a aVar) throws IOException {
                T1 t12 = (T1) a0.this.f98250b.e(aVar);
                if (t12 == null || this.f98251a.isInstance(t12)) {
                    return t12;
                }
                throw new JsonSyntaxException("Expected a " + this.f98251a.getName() + " but was " + t12.getClass().getName() + "; at path " + aVar.C());
            }

            @Override // com.google.gson.s
            public void i(cp.c cVar, T1 t12) throws IOException {
                a0.this.f98250b.i(cVar, t12);
            }
        }

        public a0(Class cls, com.google.gson.s sVar) {
            this.f98249a = cls;
            this.f98250b = sVar;
        }

        @Override // com.google.gson.t
        public <T2> com.google.gson.s<T2> a(com.google.gson.d dVar, bp.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.f98249a.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f98249a.getName() + ",adapter=" + this.f98250b + "]";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends com.google.gson.s<Number> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            try {
                return Long.valueOf(aVar.Z());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            cVar.s0(number);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b0 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98253a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f98253a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98253a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98253a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98253a[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98253a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98253a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends com.google.gson.s<Number> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.U());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            cVar.s0(number);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c0 extends com.google.gson.s<Boolean> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean e(cp.a aVar) throws IOException {
            JsonToken k02 = aVar.k0();
            if (k02 != JsonToken.NULL) {
                return k02 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.h0())) : Boolean.valueOf(aVar.S());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Boolean bool) throws IOException {
            cVar.o0(bool);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends com.google.gson.s<Number> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return Double.valueOf(aVar.U());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            cVar.s0(number);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d0 extends com.google.gson.s<Boolean> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return Boolean.valueOf(aVar.h0());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Boolean bool) throws IOException {
            cVar.v0(bool == null ? "null" : bool.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends com.google.gson.s<Character> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Character e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            String h02 = aVar.h0();
            if (h02.length() == 1) {
                return Character.valueOf(h02.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + h02 + "; at " + aVar.C());
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Character ch2) throws IOException {
            cVar.v0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e0 extends com.google.gson.s<Number> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            try {
                int V = aVar.V();
                if (V <= 255 && V >= -128) {
                    return Byte.valueOf((byte) V);
                }
                throw new JsonSyntaxException("Lossy conversion from " + V + " to byte; at path " + aVar.C());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            cVar.s0(number);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends com.google.gson.s<String> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String e(cp.a aVar) throws IOException {
            JsonToken k02 = aVar.k0();
            if (k02 != JsonToken.NULL) {
                return k02 == JsonToken.BOOLEAN ? Boolean.toString(aVar.S()) : aVar.h0();
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, String str) throws IOException {
            cVar.v0(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f0 extends com.google.gson.s<Number> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            try {
                int V = aVar.V();
                if (V <= 65535 && V >= -32768) {
                    return Short.valueOf((short) V);
                }
                throw new JsonSyntaxException("Lossy conversion from " + V + " to short; at path " + aVar.C());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            cVar.s0(number);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends com.google.gson.s<BigDecimal> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            String h02 = aVar.h0();
            try {
                return new BigDecimal(h02);
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException("Failed parsing '" + h02 + "' as BigDecimal; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.s0(bigDecimal);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g0 extends com.google.gson.s<Number> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.V());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            cVar.s0(number);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends com.google.gson.s<BigInteger> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BigInteger e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            String h02 = aVar.h0();
            try {
                return new BigInteger(h02);
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException("Failed parsing '" + h02 + "' as BigInteger; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, BigInteger bigInteger) throws IOException {
            cVar.s0(bigInteger);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h0 extends com.google.gson.s<AtomicInteger> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicInteger e(cp.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.V());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.m0(atomicInteger.get());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends com.google.gson.s<LazilyParsedNumber> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public LazilyParsedNumber e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return new LazilyParsedNumber(aVar.h0());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, LazilyParsedNumber lazilyParsedNumber) throws IOException {
            cVar.s0(lazilyParsedNumber);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i0 extends com.google.gson.s<AtomicBoolean> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean e(cp.a aVar) throws IOException {
            return new AtomicBoolean(aVar.S());
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.w0(atomicBoolean.get());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends com.google.gson.s<StringBuilder> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public StringBuilder e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return new StringBuilder(aVar.h0());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, StringBuilder sb2) throws IOException {
            cVar.v0(sb2 == null ? null : sb2.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j0<T extends Enum<T>> extends com.google.gson.s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, T> f98254a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, T> f98255b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Map<T, String> f98256c = new HashMap();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f98257a;

            public a(Class cls) {
                this.f98257a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f98257a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public j0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    wo.c cVar = (wo.c) field.getAnnotation(wo.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str2 : cVar.alternate()) {
                            this.f98254a.put(str2, r42);
                        }
                    }
                    this.f98254a.put(name, r42);
                    this.f98255b.put(str, r42);
                    this.f98256c.put(r42, name);
                }
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public T e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            String h02 = aVar.h0();
            T t11 = this.f98254a.get(h02);
            return t11 == null ? this.f98255b.get(h02) : t11;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, T t11) throws IOException {
            cVar.v0(t11 == null ? null : this.f98256c.get(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends com.google.gson.s<Class> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Class e(cp.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l extends com.google.gson.s<StringBuffer> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public StringBuffer e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return new StringBuffer(aVar.h0());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.v0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m extends com.google.gson.s<URL> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public URL e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            String h02 = aVar.h0();
            if ("null".equals(h02)) {
                return null;
            }
            return new URL(h02);
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, URL url) throws IOException {
            cVar.v0(url == null ? null : url.toExternalForm());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xo.n$n, reason: collision with other inner class name */
    public class C1327n extends com.google.gson.s<URI> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public URI e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            try {
                String h02 = aVar.h0();
                if ("null".equals(h02)) {
                    return null;
                }
                return new URI(h02);
            } catch (URISyntaxException e11) {
                throw new JsonIOException(e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, URI uri) throws IOException {
            cVar.v0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o extends com.google.gson.s<InetAddress> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public InetAddress e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return InetAddress.getByName(aVar.h0());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, InetAddress inetAddress) throws IOException {
            cVar.v0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class p extends com.google.gson.s<UUID> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public UUID e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            String h02 = aVar.h0();
            try {
                return UUID.fromString(h02);
            } catch (IllegalArgumentException e11) {
                throw new JsonSyntaxException("Failed parsing '" + h02 + "' as UUID; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, UUID uuid) throws IOException {
            cVar.v0(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class q extends com.google.gson.s<Currency> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Currency e(cp.a aVar) throws IOException {
            String h02 = aVar.h0();
            try {
                return Currency.getInstance(h02);
            } catch (IllegalArgumentException e11) {
                throw new JsonSyntaxException("Failed parsing '" + h02 + "' as Currency; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Currency currency) throws IOException {
            cVar.v0(currency.getCurrencyCode());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class r extends com.google.gson.s<Calendar> {

        /* renamed from: a, reason: collision with root package name */
        public static final String f98259a = "year";

        /* renamed from: b, reason: collision with root package name */
        public static final String f98260b = "month";

        /* renamed from: c, reason: collision with root package name */
        public static final String f98261c = "dayOfMonth";

        /* renamed from: d, reason: collision with root package name */
        public static final String f98262d = "hourOfDay";

        /* renamed from: e, reason: collision with root package name */
        public static final String f98263e = "minute";

        /* renamed from: f, reason: collision with root package name */
        public static final String f98264f = "second";

        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Calendar e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            aVar.c();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (aVar.k0() != JsonToken.END_OBJECT) {
                String a02 = aVar.a0();
                int V = aVar.V();
                if (f98259a.equals(a02)) {
                    i11 = V;
                } else if (f98260b.equals(a02)) {
                    i12 = V;
                } else if (f98261c.equals(a02)) {
                    i13 = V;
                } else if (f98262d.equals(a02)) {
                    i14 = V;
                } else if (f98263e.equals(a02)) {
                    i15 = V;
                } else if (f98264f.equals(a02)) {
                    i16 = V;
                }
            }
            aVar.q();
            return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.L();
                return;
            }
            cVar.f();
            cVar.H(f98259a);
            cVar.m0(calendar.get(1));
            cVar.H(f98260b);
            cVar.m0(calendar.get(2));
            cVar.H(f98261c);
            cVar.m0(calendar.get(5));
            cVar.H(f98262d);
            cVar.m0(calendar.get(11));
            cVar.H(f98263e);
            cVar.m0(calendar.get(12));
            cVar.H(f98264f);
            cVar.m0(calendar.get(13));
            cVar.k();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class s extends com.google.gson.s<Locale> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Locale e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.h0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Locale locale) throws IOException {
            cVar.v0(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class t extends com.google.gson.s<com.google.gson.j> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public com.google.gson.j e(cp.a aVar) throws IOException {
            if (aVar instanceof xo.f) {
                return ((xo.f) aVar).F0();
            }
            JsonToken k02 = aVar.k0();
            com.google.gson.j l11 = l(aVar, k02);
            if (l11 == null) {
                return k(aVar, k02);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.E()) {
                    String a02 = l11 instanceof com.google.gson.l ? aVar.a0() : null;
                    JsonToken k03 = aVar.k0();
                    com.google.gson.j l12 = l(aVar, k03);
                    boolean z11 = l12 != null;
                    if (l12 == null) {
                        l12 = k(aVar, k03);
                    }
                    if (l11 instanceof com.google.gson.g) {
                        ((com.google.gson.g) l11).y(l12);
                    } else {
                        ((com.google.gson.l) l11).y(a02, l12);
                    }
                    if (z11) {
                        arrayDeque.addLast(l11);
                        l11 = l12;
                    }
                } else {
                    if (l11 instanceof com.google.gson.g) {
                        aVar.k();
                    } else {
                        aVar.q();
                    }
                    if (arrayDeque.isEmpty()) {
                        return l11;
                    }
                    l11 = (com.google.gson.j) arrayDeque.removeLast();
                }
            }
        }

        public final com.google.gson.j k(cp.a aVar, JsonToken jsonToken) throws IOException {
            int i11 = b0.f98253a[jsonToken.ordinal()];
            if (i11 == 1) {
                return new com.google.gson.n(new LazilyParsedNumber(aVar.h0()));
            }
            if (i11 == 2) {
                return new com.google.gson.n(aVar.h0());
            }
            if (i11 == 3) {
                return new com.google.gson.n(Boolean.valueOf(aVar.S()));
            }
            if (i11 == 6) {
                aVar.d0();
                return com.google.gson.k.f35047a;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        public final com.google.gson.j l(cp.a aVar, JsonToken jsonToken) throws IOException {
            int i11 = b0.f98253a[jsonToken.ordinal()];
            if (i11 == 4) {
                aVar.a();
                return new com.google.gson.g();
            }
            if (i11 != 5) {
                return null;
            }
            aVar.c();
            return new com.google.gson.l();
        }

        @Override // com.google.gson.s
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, com.google.gson.j jVar) throws IOException {
            if (jVar == null || jVar.v()) {
                cVar.L();
                return;
            }
            if (jVar.x()) {
                com.google.gson.n p11 = jVar.p();
                if (p11.B()) {
                    cVar.s0(p11.r());
                    return;
                } else if (p11.z()) {
                    cVar.w0(p11.f());
                    return;
                } else {
                    cVar.v0(p11.t());
                    return;
                }
            }
            if (jVar.u()) {
                cVar.e();
                Iterator<com.google.gson.j> it = jVar.m().iterator();
                while (it.hasNext()) {
                    i(cVar, it.next());
                }
                cVar.j();
                return;
            }
            if (!jVar.w()) {
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            }
            cVar.f();
            for (Map.Entry<String, com.google.gson.j> entry : jVar.o().entrySet()) {
                cVar.H(entry.getKey());
                i(cVar, entry.getValue());
            }
            cVar.k();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class u implements com.google.gson.t {
        @Override // com.google.gson.t
        public <T> com.google.gson.s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new j0(rawType);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class v extends com.google.gson.s<BitSet> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BitSet e(cp.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.a();
            JsonToken k02 = aVar.k0();
            int i11 = 0;
            while (k02 != JsonToken.END_ARRAY) {
                int i12 = b0.f98253a[k02.ordinal()];
                boolean z11 = true;
                if (i12 == 1 || i12 == 2) {
                    int V = aVar.V();
                    if (V == 0) {
                        z11 = false;
                    } else if (V != 1) {
                        throw new JsonSyntaxException("Invalid bitset value " + V + ", expected 0 or 1; at path " + aVar.C());
                    }
                } else {
                    if (i12 != 3) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + k02 + "; at path " + aVar.getPath());
                    }
                    z11 = aVar.S();
                }
                if (z11) {
                    bitSet.set(i11);
                }
                i11++;
                k02 = aVar.k0();
            }
            aVar.k();
            return bitSet;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, BitSet bitSet) throws IOException {
            cVar.e();
            int length = bitSet.length();
            for (int i11 = 0; i11 < length; i11++) {
                cVar.m0(bitSet.get(i11) ? 1L : 0L);
            }
            cVar.j();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class w implements com.google.gson.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bp.a f98265a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.s f98266b;

        public w(bp.a aVar, com.google.gson.s sVar) {
            this.f98265a = aVar;
            this.f98266b = sVar;
        }

        @Override // com.google.gson.t
        public <T> com.google.gson.s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            if (aVar.equals(this.f98265a)) {
                return this.f98266b;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class x implements com.google.gson.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f98267a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.s f98268b;

        public x(Class cls, com.google.gson.s sVar) {
            this.f98267a = cls;
            this.f98268b = sVar;
        }

        @Override // com.google.gson.t
        public <T> com.google.gson.s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            if (aVar.getRawType() == this.f98267a) {
                return this.f98268b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f98267a.getName() + ",adapter=" + this.f98268b + "]";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class y implements com.google.gson.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f98269a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f98270b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.s f98271c;

        public y(Class cls, Class cls2, com.google.gson.s sVar) {
            this.f98269a = cls;
            this.f98270b = cls2;
            this.f98271c = sVar;
        }

        @Override // com.google.gson.t
        public <T> com.google.gson.s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f98269a || rawType == this.f98270b) {
                return this.f98271c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f98270b.getName() + "+" + this.f98269a.getName() + ",adapter=" + this.f98271c + "]";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class z implements com.google.gson.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f98272a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f98273b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.s f98274c;

        public z(Class cls, Class cls2, com.google.gson.s sVar) {
            this.f98272a = cls;
            this.f98273b = cls2;
            this.f98274c = sVar;
        }

        @Override // com.google.gson.t
        public <T> com.google.gson.s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f98272a || rawType == this.f98273b) {
                return this.f98274c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f98272a.getName() + "+" + this.f98273b.getName() + ",adapter=" + this.f98274c + "]";
        }
    }

    static {
        com.google.gson.s<Class> d11 = new k().d();
        f98223a = d11;
        f98224b = b(Class.class, d11);
        com.google.gson.s<BitSet> d12 = new v().d();
        f98225c = d12;
        f98226d = b(BitSet.class, d12);
        c0 c0Var = new c0();
        f98227e = c0Var;
        f98228f = new d0();
        f98229g = c(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f98230h = e0Var;
        f98231i = c(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f98232j = f0Var;
        f98233k = c(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f98234l = g0Var;
        f98235m = c(Integer.TYPE, Integer.class, g0Var);
        com.google.gson.s<AtomicInteger> d13 = new h0().d();
        f98236n = d13;
        f98237o = b(AtomicInteger.class, d13);
        com.google.gson.s<AtomicBoolean> d14 = new i0().d();
        f98238p = d14;
        f98239q = b(AtomicBoolean.class, d14);
        com.google.gson.s<AtomicIntegerArray> d15 = new a().d();
        f98240r = d15;
        f98241s = b(AtomicIntegerArray.class, d15);
        f98242t = new b();
        f98243u = new c();
        f98244v = new d();
        e eVar = new e();
        f98245w = eVar;
        f98246x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f98247y = fVar;
        f98248z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        C1327n c1327n = new C1327n();
        J = c1327n;
        K = b(URI.class, c1327n);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = b(UUID.class, pVar);
        com.google.gson.s<Currency> d16 = new q().d();
        P = d16;
        Q = b(Currency.class, d16);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = e(com.google.gson.j.class, tVar);
        X = new u();
    }

    public n() {
        throw new UnsupportedOperationException();
    }

    public static <TT> com.google.gson.t a(bp.a<TT> aVar, com.google.gson.s<TT> sVar) {
        return new w(aVar, sVar);
    }

    public static <TT> com.google.gson.t b(Class<TT> cls, com.google.gson.s<TT> sVar) {
        return new x(cls, sVar);
    }

    public static <TT> com.google.gson.t c(Class<TT> cls, Class<TT> cls2, com.google.gson.s<? super TT> sVar) {
        return new y(cls, cls2, sVar);
    }

    public static <TT> com.google.gson.t d(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.s<? super TT> sVar) {
        return new z(cls, cls2, sVar);
    }

    public static <T1> com.google.gson.t e(Class<T1> cls, com.google.gson.s<T1> sVar) {
        return new a0(cls, sVar);
    }
}
