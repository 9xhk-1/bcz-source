package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.g.b;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    public static final g f67569d = new g(true);

    /* renamed from: b, reason: collision with root package name */
    public boolean f67571b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f67572c = false;

    /* renamed from: a, reason: collision with root package name */
    public final s<FieldDescriptorType, Object> f67570a = s.s(16);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67573a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f67574b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f67574b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67574b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67574b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67574b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67574b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67574b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67574b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67574b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f67574b[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f67574b[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f67574b[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f67574b[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f67574b[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f67574b[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f67574b[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f67574b[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f67574b[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f67574b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f67573a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f67573a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f67573a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f67573a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f67573a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f67573a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f67573a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f67573a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f67573a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T extends b<T>> extends Comparable<T> {
        n.a Q(n.a aVar, n nVar);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public g() {
    }

    public static int d(WireFormat.FieldType fieldType, int i11, Object obj) {
        int D = CodedOutputStream.D(i11);
        if (fieldType == WireFormat.FieldType.GROUP) {
            D *= 2;
        }
        return D + e(fieldType, obj);
    }

    public static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f67574b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.C((String) obj);
            case 10:
                return obj instanceof d ? CodedOutputStream.e((d) obj) : CodedOutputStream.c((byte[]) obj);
            case 11:
                return CodedOutputStream.E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.n((n) obj);
            case 17:
                return obj instanceof i ? CodedOutputStream.r((i) obj) : CodedOutputStream.t((n) obj);
            case 18:
                return obj instanceof h.a ? CodedOutputStream.i(((h.a) obj).getNumber()) : CodedOutputStream.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        WireFormat.FieldType liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(liteType, number, obj);
        }
        int i11 = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i11 += e(liteType, it.next());
            }
            return CodedOutputStream.D(number) + i11 + CodedOutputStream.v(i11);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i11 += d(liteType, number, it2.next());
        }
        return i11;
    }

    public static <T extends b<T>> g<T> g() {
        return f67569d;
    }

    public static int l(WireFormat.FieldType fieldType, boolean z11) {
        if (z11) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public static <T extends b<T>> g<T> t() {
        return new g<>();
    }

    public static Object u(e eVar, WireFormat.FieldType fieldType, boolean z11) throws IOException {
        switch (a.f67574b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z11 ? eVar.J() : eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.L());
            case 12:
                return Integer.valueOf(eVar.E());
            case 13:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.f67573a
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.n
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r1 = r0
            goto L44
        L21:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a
            if (r2 == 0) goto L1e
            goto L1f
        L2a:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L1f
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.w(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void x(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i11, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.Y(i11, (n) obj);
        } else {
            codedOutputStream.w0(i11, l(fieldType, false));
            y(codedOutputStream, fieldType, obj);
        }
    }

    public static void y(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f67574b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.R(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.X(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.c0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.b0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.V(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.U(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.M(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    codedOutputStream.N((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.P((d) obj);
                    break;
                }
            case 11:
                codedOutputStream.y0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.q0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.s0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.u0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Z((n) obj);
                break;
            case 17:
                codedOutputStream.e0((n) obj);
                break;
            case 18:
                if (!(obj instanceof h.a)) {
                    codedOutputStream.T(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.T(((h.a) obj).getNumber());
                    break;
                }
        }
    }

    public static void z(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            if (obj instanceof i) {
                x(codedOutputStream, liteType, number, ((i) obj).e());
                return;
            } else {
                x(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(codedOutputStream, liteType, number, it.next());
            }
            return;
        }
        codedOutputStream.w0(number, 2);
        Iterator it2 = list.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            i11 += e(liteType, it2.next());
        }
        codedOutputStream.o0(i11);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(codedOutputStream, liteType, it3.next());
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(fielddescriptortype.getLiteType(), obj);
        Object h11 = h(fielddescriptortype);
        if (h11 == null) {
            list = new ArrayList();
            this.f67570a.put(fielddescriptortype, list);
        } else {
            list = (List) h11;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<FieldDescriptorType> clone() {
        g<FieldDescriptorType> t11 = t();
        for (int i11 = 0; i11 < this.f67570a.m(); i11++) {
            Map.Entry<FieldDescriptorType, Object> l11 = this.f67570a.l(i11);
            t11.v(l11.getKey(), l11.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f67570a.n()) {
            t11.v(entry.getKey(), entry.getValue());
        }
        t11.f67572c = this.f67572c;
        return t11;
    }

    public final Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f67570a.get(fielddescriptortype);
        return obj instanceof i ? ((i) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i11) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object h11 = h(fielddescriptortype);
        if (h11 != null) {
            return ((List) h11).get(i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object h11 = h(fielddescriptortype);
        if (h11 == null) {
            return 0;
        }
        return ((List) h11).size();
    }

    public int k() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f67570a.m(); i12++) {
            Map.Entry<FieldDescriptorType, Object> l11 = this.f67570a.l(i12);
            i11 += f(l11.getKey(), l11.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f67570a.n()) {
            i11 += f(entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f67570a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i11 = 0; i11 < this.f67570a.m(); i11++) {
            if (!o(this.f67570a.l(i11))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f67570a.n().iterator();
        while (it.hasNext()) {
            if (!o(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((n) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof n)) {
                    if (value instanceof i) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((n) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f67572c ? new i.c(this.f67570a.entrySet().iterator()) : this.f67570a.entrySet().iterator();
    }

    public void q() {
        if (this.f67571b) {
            return;
        }
        this.f67570a.r();
        this.f67571b = true;
    }

    public void r(g<FieldDescriptorType> gVar) {
        for (int i11 = 0; i11 < gVar.f67570a.m(); i11++) {
            s(gVar.f67570a.l(i11));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = gVar.f67570a.n().iterator();
        while (it.hasNext()) {
            s(it.next());
        }
    }

    public final void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof i) {
            value = ((i) value).e();
        }
        if (key.isRepeated()) {
            Object h11 = h(key);
            if (h11 == null) {
                h11 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) h11).add(c(it.next()));
            }
            this.f67570a.put(key, h11);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.f67570a.put(key, c(value));
            return;
        }
        Object h12 = h(key);
        if (h12 == null) {
            this.f67570a.put(key, c(value));
        } else {
            this.f67570a.put(key, key.Q(((n) h12).toBuilder(), (n) value).build());
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            w(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof i) {
            this.f67572c = true;
        }
        this.f67570a.put(fielddescriptortype, obj);
    }

    public g(boolean z11) {
        q();
    }
}
