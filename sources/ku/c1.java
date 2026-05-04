package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ku.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c1 extends ku.d implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public ju.t f68622b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f68623c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68624a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f68625b;

        static {
            int[] iArr = new int[d.values().length];
            f68625b = iArr;
            try {
                iArr[d.f68647c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68625b[d.f68646b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68625b[d.f68648d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68625b[d.f68649e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68625b[d.f68650f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68625b[d.f68651g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68625b[d.f68652h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68625b[d.f68653i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[c.values().length];
            f68624a = iArr2;
            try {
                iArr2[c.ORIGIN_DESCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f68624a[c.ORIGIN_LINE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f68624a[c.ORIGIN_END_LINE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f68624a[c.ORIGIN_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f68624a[c.ORIGIN_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f68624a[c.ORIGIN_RESOURCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f68624a[c.ORIGIN_COMMENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f68624a[c.ORIGIN_NULL_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f68624a[c.ORIGIN_NULL_RESOURCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f68624a[c.ORIGIN_NULL_COMMENTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f68624a[c.END_MARKER.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f68624a[c.ROOT_VALUE.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f68624a[c.ROOT_WAS_CONFIG.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f68624a[c.VALUE_DATA.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f68624a[c.VALUE_ORIGIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f68624a[c.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f68626a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteArrayOutputStream f68627b;

        /* renamed from: c, reason: collision with root package name */
        public final DataOutput f68628c;

        public b(c cVar) {
            this.f68626a = cVar;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f68627b = byteArrayOutputStream;
            this.f68628c = new DataOutputStream(byteArrayOutputStream);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c {
        UNKNOWN,
        END_MARKER,
        ROOT_VALUE,
        ROOT_WAS_CONFIG,
        VALUE_DATA,
        VALUE_ORIGIN,
        ORIGIN_DESCRIPTION,
        ORIGIN_LINE_NUMBER,
        ORIGIN_END_LINE_NUMBER,
        ORIGIN_TYPE,
        ORIGIN_URL,
        ORIGIN_COMMENTS,
        ORIGIN_NULL_URL,
        ORIGIN_NULL_COMMENTS,
        ORIGIN_RESOURCE,
        ORIGIN_NULL_RESOURCE;

        public static c a(int i11) {
            return i11 < values().length ? values()[i11] : UNKNOWN;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f68646b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f68647c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f68648d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f68649e;

        /* renamed from: f, reason: collision with root package name */
        public static final d f68650f;

        /* renamed from: g, reason: collision with root package name */
        public static final d f68651g;

        /* renamed from: h, reason: collision with root package name */
        public static final d f68652h;

        /* renamed from: i, reason: collision with root package name */
        public static final d f68653i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ d[] f68654j;

        /* renamed from: a, reason: collision with root package name */
        public ConfigValueType f68655a;

        static {
            d dVar = new d("NULL", 0, ConfigValueType.NULL);
            f68646b = dVar;
            d dVar2 = new d("BOOLEAN", 1, ConfigValueType.BOOLEAN);
            f68647c = dVar2;
            ConfigValueType configValueType = ConfigValueType.NUMBER;
            d dVar3 = new d("INT", 2, configValueType);
            f68648d = dVar3;
            d dVar4 = new d("LONG", 3, configValueType);
            f68649e = dVar4;
            d dVar5 = new d("DOUBLE", 4, configValueType);
            f68650f = dVar5;
            d dVar6 = new d("STRING", 5, ConfigValueType.STRING);
            f68651g = dVar6;
            d dVar7 = new d("LIST", 6, ConfigValueType.LIST);
            f68652h = dVar7;
            d dVar8 = new d("OBJECT", 7, ConfigValueType.OBJECT);
            f68653i = dVar8;
            f68654j = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        }

        public d(String str, int i11, ConfigValueType configValueType) {
            this.f68655a = configValueType;
        }

        public static d a(int i11) {
            if (i11 < values().length) {
                return values()[i11];
            }
            return null;
        }

        public static d b(ju.t tVar) {
            ConfigValueType valueType = tVar.valueType();
            if (valueType != ConfigValueType.NUMBER) {
                for (d dVar : values()) {
                    if (dVar.f68655a == valueType) {
                        return dVar;
                    }
                }
            } else {
                if (tVar instanceof s) {
                    return f68648d;
                }
                if (tVar instanceof t) {
                    return f68649e;
                }
                if (tVar instanceof m) {
                    return f68650f;
                }
            }
            throw new ConfigException.BugOrBroken("don't know how to serialize " + tVar);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f68654j.clone();
        }
    }

    public c1() {
        super(null);
    }

    public static c W0(DataInput dataInput) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != c.UNKNOWN.ordinal()) {
            return c.a(readUnsignedByte);
        }
        throw new IOException("field code " + readUnsignedByte + " is not supposed to be on the wire");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ku.x1 X0(java.io.DataInput r6, ku.x1 r7) throws java.io.IOException {
        /*
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ku.c1$c> r1 = ku.c1.c.class
            r0.<init>(r1)
        L7:
            ku.c1$c r1 = W0(r6)
            int[] r2 = ku.c1.a.f68624a
            int r3 = r1.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L8e;
                case 2: goto L82;
                case 3: goto L76;
                case 4: goto L6a;
                case 5: goto L62;
                case 6: goto L5a;
                case 7: goto L3f;
                case 8: goto L39;
                case 9: goto L39;
                case 10: goto L39;
                case 11: goto L34;
                case 12: goto L1d;
                case 13: goto L1d;
                case 14: goto L1d;
                case 15: goto L1d;
                case 16: goto L17;
                default: goto L16;
            }
        L16:
            goto L1a
        L17:
            b1(r6)
        L1a:
            r2 = 0
            goto L95
        L1d:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Not expecting this field here: "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L34:
            ku.x1 r6 = ku.x1.l(r7, r0)
            return r6
        L39:
            r6.readInt()
            java.lang.String r2 = ""
            goto L95
        L3f:
            r6.readInt()
            int r2 = r6.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
        L4c:
            if (r4 >= r2) goto L58
            java.lang.String r5 = r6.readUTF()
            r3.add(r5)
            int r4 = r4 + 1
            goto L4c
        L58:
            r2 = r3
            goto L95
        L5a:
            r6.readInt()
            java.lang.String r2 = r6.readUTF()
            goto L95
        L62:
            r6.readInt()
            java.lang.String r2 = r6.readUTF()
            goto L95
        L6a:
            r6.readInt()
            int r2 = r6.readUnsignedByte()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L95
        L76:
            r6.readInt()
            int r2 = r6.readInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L95
        L82:
            r6.readInt()
            int r2 = r6.readInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L95
        L8e:
            r6.readInt()
            java.lang.String r2 = r6.readUTF()
        L95:
            if (r2 == 0) goto L7
            r0.put(r1, r2)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: ku.c1.X0(java.io.DataInput, ku.x1):ku.x1");
    }

    public static ku.d Y0(DataInput dataInput, x1 x1Var) throws IOException {
        ku.d dVar = null;
        x1 x1Var2 = null;
        while (true) {
            c W0 = W0(dataInput);
            if (W0 == c.END_MARKER) {
                if (dVar != null) {
                    return dVar;
                }
                throw new IOException("No value data found in serialization of value");
            }
            if (W0 == c.VALUE_DATA) {
                if (x1Var2 == null) {
                    throw new IOException("Origin must be stored before value data");
                }
                dataInput.readInt();
                dVar = Z0(dataInput, x1Var2);
            } else if (W0 == c.VALUE_ORIGIN) {
                dataInput.readInt();
                x1Var2 = X0(dataInput, x1Var);
            } else {
                b1(dataInput);
            }
        }
    }

    public static ku.d Z0(DataInput dataInput, x1 x1Var) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        d a11 = d.a(readUnsignedByte);
        if (a11 == null) {
            throw new IOException("Unknown serialized value type: " + readUnsignedByte);
        }
        int i11 = 0;
        switch (a.f68625b[a11.ordinal()]) {
            case 1:
                return new h(x1Var, dataInput.readBoolean());
            case 2:
                return new f0(x1Var);
            case 3:
                return new s(x1Var, dataInput.readInt(), dataInput.readUTF());
            case 4:
                return new t(x1Var, dataInput.readLong(), dataInput.readUTF());
            case 5:
                return new m(x1Var, dataInput.readDouble(), dataInput.readUTF());
            case 6:
                return new j0.a(x1Var, dataInput.readUTF());
            case 7:
                int readInt = dataInput.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i11 < readInt) {
                    arrayList.add(Y0(dataInput, x1Var));
                    i11++;
                }
                return new v1(x1Var, arrayList);
            case 8:
                int readInt2 = dataInput.readInt();
                HashMap hashMap = new HashMap(readInt2);
                while (i11 < readInt2) {
                    hashMap.put(dataInput.readUTF(), Y0(dataInput, x1Var));
                    i11++;
                }
                return new w1(x1Var, hashMap);
            default:
                throw new IOException("Unhandled serialized value type: " + a11);
        }
    }

    public static ConfigException a1() {
        return new ConfigException.BugOrBroken(c1.class.getName() + " should not exist outside of serialization");
    }

    public static void b1(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        int skipBytes = dataInput.skipBytes(readInt);
        if (skipBytes < readInt) {
            dataInput.readFully(new byte[readInt - skipBytes]);
        }
    }

    public static void c1(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(c.END_MARKER.ordinal());
    }

    public static void d1(DataOutput dataOutput, b bVar) throws IOException {
        byte[] byteArray = bVar.f68627b.toByteArray();
        dataOutput.writeByte(bVar.f68626a.ordinal());
        dataOutput.writeInt(byteArray.length);
        dataOutput.write(byteArray);
    }

    public static void e1(DataOutput dataOutput, x1 x1Var, x1 x1Var2) throws IOException {
        for (Map.Entry<c, Object> entry : (x1Var != null ? x1Var.C(x1Var2) : Collections.EMPTY_MAP).entrySet()) {
            b bVar = new b(entry.getKey());
            f1(bVar.f68628c, bVar.f68626a, entry.getValue());
            d1(dataOutput, bVar);
        }
        c1(dataOutput);
    }

    public static void f1(DataOutput dataOutput, c cVar, Object obj) throws IOException {
        switch (a.f68624a[cVar.ordinal()]) {
            case 1:
                dataOutput.writeUTF((String) obj);
                return;
            case 2:
                dataOutput.writeInt(((Integer) obj).intValue());
                return;
            case 3:
                dataOutput.writeInt(((Integer) obj).intValue());
                return;
            case 4:
                dataOutput.writeByte(((Integer) obj).intValue());
                return;
            case 5:
                dataOutput.writeUTF((String) obj);
                return;
            case 6:
                dataOutput.writeUTF((String) obj);
                return;
            case 7:
                List list = (List) obj;
                dataOutput.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dataOutput.writeUTF((String) it.next());
                }
                return;
            case 8:
            case 9:
            case 10:
                return;
            default:
                throw new IOException("Unhandled field from origin: " + cVar);
        }
    }

    public static void g1(DataOutput dataOutput, ju.t tVar, x1 x1Var) throws IOException {
        b bVar = new b(c.VALUE_ORIGIN);
        e1(bVar.f68628c, (x1) tVar.g(), x1Var);
        d1(dataOutput, bVar);
        b bVar2 = new b(c.VALUE_DATA);
        h1(bVar2.f68628c, tVar);
        d1(dataOutput, bVar2);
        c1(dataOutput);
    }

    public static void h1(DataOutput dataOutput, ju.t tVar) throws IOException {
        d b11 = d.b(tVar);
        dataOutput.writeByte(b11.ordinal());
        switch (a.f68625b[b11.ordinal()]) {
            case 1:
                dataOutput.writeBoolean(((h) tVar).c().booleanValue());
                break;
            case 3:
                dataOutput.writeInt(((s) tVar).c().intValue());
                dataOutput.writeUTF(((g0) tVar).Q0());
                break;
            case 4:
                dataOutput.writeLong(((t) tVar).c().longValue());
                dataOutput.writeUTF(((g0) tVar).Q0());
                break;
            case 5:
                dataOutput.writeDouble(((m) tVar).c().doubleValue());
                dataOutput.writeUTF(((g0) tVar).Q0());
                break;
            case 6:
                dataOutput.writeUTF(((j0) tVar).c());
                break;
            case 7:
                ju.h hVar = (ju.h) tVar;
                dataOutput.writeInt(hVar.size());
                Iterator<ju.t> it = hVar.iterator();
                while (it.hasNext()) {
                    g1(dataOutput, it.next(), (x1) hVar.g());
                }
                break;
            case 8:
                ju.l lVar = (ju.l) tVar;
                dataOutput.writeInt(lVar.size());
                for (Map.Entry<String, ju.t> entry : lVar.entrySet()) {
                    dataOutput.writeUTF(entry.getKey());
                    g1(dataOutput, entry.getValue(), (x1) lVar.g());
                }
                break;
        }
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f68623c ? ((ju.l) this.f68622b).f0() : this.f68622b;
    }

    public final DataInput U0(ObjectInput objectInput) throws IOException {
        byte[] bArr = new byte[objectInput.readInt()];
        objectInput.readFully(bArr);
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }

    @Override // ku.d
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public c1 G0(ju.m mVar) {
        throw a1();
    }

    @Override // ju.t
    public Object c() {
        throw a1();
    }

    @Override // ku.d
    public boolean equals(Object obj) {
        if ((obj instanceof c1) && q0(obj)) {
            c1 c1Var = (c1) obj;
            if (this.f68623c == c1Var.f68623c && this.f68622b.equals(c1Var.f68622b)) {
                return true;
            }
        }
        return false;
    }

    @Override // ku.d
    public int hashCode() {
        return (((this.f68622b.hashCode() + 41) * 41) + (this.f68623c ? 1 : 0)) * 41;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        while (true) {
            c W0 = W0(objectInput);
            if (W0 == c.END_MARKER) {
                return;
            }
            DataInput U0 = U0(objectInput);
            if (W0 == c.ROOT_VALUE) {
                this.f68622b = Y0(U0, null);
            } else if (W0 == c.ROOT_WAS_CONFIG) {
                this.f68623c = U0.readBoolean();
            }
        }
    }

    @Override // ku.d
    public final String toString() {
        return getClass().getSimpleName() + "(value=" + this.f68622b + ",wasConfig=" + this.f68623c + pn.j.f81007d;
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        throw a1();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        if (((ku.d) this.f68622b).N0() != b1.RESOLVED) {
            throw new NotSerializableException("tried to serialize a value with unresolved substitutions, need to Config#resolve() first, see API docs");
        }
        b bVar = new b(c.ROOT_VALUE);
        g1(bVar.f68628c, this.f68622b, null);
        d1(objectOutput, bVar);
        b bVar2 = new b(c.ROOT_WAS_CONFIG);
        bVar2.f68628c.writeBoolean(this.f68623c);
        d1(objectOutput, bVar2);
        c1(objectOutput);
    }

    public c1(ju.t tVar) {
        this();
        this.f68622b = tVar;
        this.f68623c = false;
    }

    public c1(ju.a aVar) {
        this(aVar.root());
        this.f68623c = true;
    }
}
