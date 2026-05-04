package n10;

import da0.k1;
import e30.c1;
import e30.c2;
import e30.h2;
import e30.r0;
import e30.s1;
import e30.u0;
import e30.u1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import n10.o;
import p10.a0;
import p10.g0;
import p10.n0;
import p10.q0;
import p10.s0;
import p10.t;
import r10.a;
import r10.c;
import s10.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: g, reason: collision with root package name */
    public static final n20.f f73971g = n20.f.k("<built-ins module>");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f73972h = false;

    /* renamed from: a, reason: collision with root package name */
    public f0 f73973a;

    /* renamed from: b, reason: collision with root package name */
    public d30.i<f0> f73974b;

    /* renamed from: c, reason: collision with root package name */
    public final d30.i<e> f73975c;

    /* renamed from: d, reason: collision with root package name */
    public final d30.i<Collection<n0>> f73976d;

    /* renamed from: e, reason: collision with root package name */
    public final d30.g<n20.f, p10.b> f73977e;

    /* renamed from: f, reason: collision with root package name */
    public final d30.n f73978f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements x00.a<Collection<n0>> {
        public a() {
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<n0> invoke() {
            return Arrays.asList(j.this.r().h0(o.A), j.this.r().h0(o.C), j.this.r().h0(o.D), j.this.r().h0(o.B));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements x00.a<e> {
        public b() {
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                c1 q11 = j.this.q(primitiveType.getTypeName().b());
                c1 q12 = j.this.q(primitiveType.getArrayTypeName().b());
                enumMap.put((EnumMap) primitiveType, (PrimitiveType) q12);
                hashMap.put(q11, q12);
                hashMap2.put(q12, q11);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements x00.l<n20.f, p10.b> {
        public c() {
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p10.b invoke(n20.f fVar) {
            p10.d h11 = j.this.s().h(fVar, NoLookupLocation.FROM_BUILTINS);
            if (h11 == null) {
                throw new AssertionError("Built-in class " + o.A.c(fVar) + " is not found");
            }
            if (h11 instanceof p10.b) {
                return (p10.b) h11;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + h11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements x00.a<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f73982a;

        public d(f0 f0Var) {
            this.f73982a = f0Var;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (j.this.f73973a == null) {
                j.this.f73973a = this.f73982a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + j.this.f73973a + " (attempting to reset to " + this.f73982a + pn.j.f81007d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map<PrimitiveType, c1> f73984a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<r0, c1> f73985b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<c1, c1> f73986c;

        public /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        public static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i11 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public e(@m80.k Map<PrimitiveType, c1> map, @m80.k Map<r0, c1> map2, @m80.k Map<c1, c1> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f73984a = map;
            this.f73985b = map2;
            this.f73986c = map3;
        }
    }

    public j(@m80.k d30.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f73978f = nVar;
        this.f73976d = nVar.f(new a());
        this.f73975c = nVar.f(new b());
        this.f73977e = nVar.b(new c());
    }

    @m80.l
    public static r0 A(@m80.k r0 r0Var, @m80.k a0 a0Var) {
        n20.b n11;
        n20.b a11;
        p10.b b11;
        if (r0Var == null) {
            a(72);
        }
        if (a0Var == null) {
            a(73);
        }
        p10.d r11 = r0Var.I0().r();
        if (r11 == null) {
            return null;
        }
        q qVar = q.f74082a;
        if (!qVar.b(r11.getName()) || (n11 = u20.e.n(r11)) == null || (a11 = qVar.a(n11)) == null || (b11 = t.b(a0Var, a11)) == null) {
            return null;
        }
        return b11.s();
    }

    public static boolean A0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(130);
        }
        return i0(r0Var, o.a.I0.j());
    }

    public static boolean B0(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(10);
        }
        while (hVar != null) {
            if (hVar instanceof g0) {
                return ((g0) hVar).d().i(o.f74028z);
            }
            hVar = hVar.b();
        }
        return false;
    }

    public static boolean C0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(143);
        }
        return m0(r0Var, o.a.f74039f);
    }

    public static boolean D0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(133);
        }
        return x0(r0Var) || A0(r0Var) || y0(r0Var) || z0(r0Var);
    }

    @m80.l
    public static PrimitiveType N(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(93);
        }
        p10.d r11 = r0Var.I0().r();
        if (r11 == null) {
            return null;
        }
        return P(r11);
    }

    @m80.l
    public static PrimitiveType P(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(78);
        }
        if (o.a.M0.contains(hVar.getName())) {
            return o.a.O0.get(q20.h.m(hVar));
        }
        return null;
    }

    @m80.l
    public static PrimitiveType S(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(77);
        }
        if (o.a.L0.contains(hVar.getName())) {
            return o.a.N0.get(q20.h.m(hVar));
        }
        return null;
    }

    public static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i12 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 73:
                objArr[0] = k1.a.f47555a;
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i11) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean a0(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(109);
        }
        return e(bVar, o.a.f74031b);
    }

    public static boolean b0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(140);
        }
        return h0(r0Var, o.a.f74031b);
    }

    public static boolean c0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(89);
        }
        return h0(r0Var, o.a.f74045i);
    }

    public static boolean d0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(91);
        }
        return c0(r0Var) || q0(r0Var);
    }

    public static boolean e(@m80.k p10.d dVar, @m80.k n20.d dVar2) {
        if (dVar == null) {
            a(104);
        }
        if (dVar2 == null) {
            a(105);
        }
        return dVar.getName().equals(dVar2.i()) && dVar2.equals(q20.h.m(dVar));
    }

    public static boolean e0(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(90);
        }
        return e(bVar, o.a.f74045i) || P(bVar) != null;
    }

    public static boolean f0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(111);
        }
        return i0(r0Var, o.a.f74047j);
    }

    public static boolean g0(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(9);
        }
        return q20.h.r(hVar, n10.c.class, false) != null;
    }

    public static boolean h0(@m80.k r0 r0Var, @m80.k n20.d dVar) {
        if (r0Var == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(r0Var.I0(), dVar);
    }

    public static boolean i0(@m80.k r0 r0Var, @m80.k n20.d dVar) {
        if (r0Var == null) {
            a(135);
        }
        if (dVar == null) {
            a(136);
        }
        return h0(r0Var, dVar) && !r0Var.J0();
    }

    public static boolean j0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(142);
        }
        return p0(r0Var);
    }

    public static boolean k0(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(162);
        }
        if (hVar.a().getAnnotations().a0(o.a.f74077y)) {
            return true;
        }
        if (hVar instanceof q0) {
            q0 q0Var = (q0) hVar;
            boolean E = q0Var.E();
            p10.r0 getter = q0Var.getGetter();
            s0 setter = q0Var.getSetter();
            if (getter != null && k0(getter) && (!E || (setter != null && k0(setter)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(159);
        }
        return e(bVar, o.a.f74052l0);
    }

    public static boolean m0(@m80.k r0 r0Var, @m80.k n20.d dVar) {
        if (r0Var == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        return !r0Var.J0() && h0(r0Var, dVar);
    }

    public static boolean n0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(137);
        }
        return o0(r0Var) && !h2.l(r0Var);
    }

    public static boolean o0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(139);
        }
        return h0(r0Var, o.a.f74033c);
    }

    public static boolean p0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(141);
        }
        return b0(r0Var) && r0Var.J0();
    }

    public static boolean q0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(92);
        }
        p10.d r11 = r0Var.I0().r();
        return (r11 == null || P(r11) == null) ? false : true;
    }

    public static boolean r0(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(97);
        }
        return S(bVar) != null;
    }

    public static boolean s0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(95);
        }
        return !r0Var.J0() && t0(r0Var);
    }

    public static boolean t0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(96);
        }
        p10.d r11 = r0Var.I0().r();
        return (r11 instanceof p10.b) && r0((p10.b) r11);
    }

    public static boolean u0(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(108);
        }
        return e(bVar, o.a.f74031b) || e(bVar, o.a.f74033c);
    }

    public static boolean v0(@m80.l r0 r0Var) {
        return r0Var != null && m0(r0Var, o.a.f74043h);
    }

    public static boolean w0(@m80.k u1 u1Var, @m80.k n20.d dVar) {
        if (u1Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        p10.d r11 = u1Var.r();
        return (r11 instanceof p10.b) && e(r11, dVar);
    }

    public static boolean x0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(129);
        }
        return i0(r0Var, o.a.H0.j());
    }

    public static boolean y0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(131);
        }
        return i0(r0Var, o.a.J0.j());
    }

    public static boolean z0(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(132);
        }
        return i0(r0Var, o.a.K0.j());
    }

    @m80.k
    public c1 B() {
        c1 R = R(PrimitiveType.FLOAT);
        if (R == null) {
            a(61);
        }
        return R;
    }

    @m80.k
    public p10.b C(int i11) {
        return p(o.b(i11));
    }

    @m80.k
    public c1 D() {
        c1 R = R(PrimitiveType.INT);
        if (R == null) {
            a(59);
        }
        return R;
    }

    @m80.k
    public p10.b E() {
        p10.b o11 = o(o.a.f74052l0.l());
        if (o11 == null) {
            a(21);
        }
        return o11;
    }

    public void E0(@m80.k f0 f0Var) {
        if (f0Var == null) {
            a(1);
        }
        this.f73978f.a(new d(f0Var));
    }

    @m80.k
    public c1 F() {
        c1 R = R(PrimitiveType.LONG);
        if (R == null) {
            a(60);
        }
        return R;
    }

    @m80.k
    public p10.b G() {
        return p("Nothing");
    }

    @m80.k
    public c1 H() {
        c1 s11 = G().s();
        if (s11 == null) {
            a(49);
        }
        return s11;
    }

    @m80.k
    public c1 I() {
        c1 M0 = i().M0(true);
        if (M0 == null) {
            a(52);
        }
        return M0;
    }

    @m80.k
    public c1 J() {
        c1 M0 = H().M0(true);
        if (M0 == null) {
            a(50);
        }
        return M0;
    }

    @m80.k
    public p10.b K() {
        return p("Number");
    }

    @m80.k
    public c1 L() {
        c1 s11 = K().s();
        if (s11 == null) {
            a(56);
        }
        return s11;
    }

    @m80.k
    public r10.c M() {
        c.b bVar = c.b.f82857a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    @m80.k
    public c1 O(@m80.k PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(74);
        }
        c1 c1Var = this.f73975c.invoke().f73984a.get(primitiveType);
        if (c1Var == null) {
            a(75);
        }
        return c1Var;
    }

    @m80.k
    public final p10.b Q(@m80.k PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(16);
        }
        return p(primitiveType.getTypeName().b());
    }

    @m80.k
    public c1 R(@m80.k PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(54);
        }
        c1 s11 = Q(primitiveType).s();
        if (s11 == null) {
            a(55);
        }
        return s11;
    }

    @m80.k
    public c1 T() {
        c1 R = R(PrimitiveType.SHORT);
        if (R == null) {
            a(58);
        }
        return R;
    }

    @m80.k
    public d30.n U() {
        d30.n nVar = this.f73978f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    @m80.k
    public p10.b V() {
        return p("String");
    }

    @m80.k
    public c1 W() {
        c1 s11 = V().s();
        if (s11 == null) {
            a(66);
        }
        return s11;
    }

    @m80.k
    public p10.b X(int i11) {
        p10.b o11 = o(o.f74021s.c(n20.f.f(o.d(i11))));
        if (o11 == null) {
            a(18);
        }
        return o11;
    }

    @m80.k
    public p10.b Y() {
        return p("Unit");
    }

    @m80.k
    public c1 Z() {
        c1 s11 = Y().s();
        if (s11 == null) {
            a(65);
        }
        return s11;
    }

    public void f(boolean z11) {
        f0 f0Var = new f0(f73971g, this.f73978f, this, null);
        this.f73973a = f0Var;
        f0Var.J0(n10.b.f73963a.c().a(this.f73978f, this.f73973a, v(), M(), g(), z11));
        f0 f0Var2 = this.f73973a;
        f0Var2.R0(f0Var2);
    }

    @m80.k
    public r10.a g() {
        a.C1026a c1026a = a.C1026a.f82855a;
        if (c1026a == null) {
            a(3);
        }
        return c1026a;
    }

    @m80.k
    public p10.b h() {
        return p("Any");
    }

    @m80.k
    public c1 i() {
        c1 s11 = h().s();
        if (s11 == null) {
            a(51);
        }
        return s11;
    }

    @m80.k
    public p10.b j() {
        return p("Array");
    }

    @m80.k
    public r0 k(@m80.k r0 r0Var) {
        r0 A;
        if (r0Var == null) {
            a(68);
        }
        if (c0(r0Var)) {
            if (r0Var.G0().size() != 1) {
                throw new IllegalStateException();
            }
            r0 type = r0Var.G0().get(0).getType();
            if (type == null) {
                a(69);
            }
            return type;
        }
        r0 n11 = h2.n(r0Var);
        c1 c1Var = this.f73975c.invoke().f73986c.get(n11);
        if (c1Var != null) {
            return c1Var;
        }
        a0 h11 = q20.h.h(n11);
        if (h11 != null && (A = A(n11, h11)) != null) {
            return A;
        }
        throw new IllegalStateException("not array: " + r0Var);
    }

    @m80.k
    public c1 l(@m80.k Variance variance, @m80.k r0 r0Var) {
        if (variance == null) {
            a(83);
        }
        if (r0Var == null) {
            a(84);
        }
        c1 m11 = m(variance, r0Var, q10.g.A0.b());
        if (m11 == null) {
            a(85);
        }
        return m11;
    }

    @m80.k
    public c1 m(@m80.k Variance variance, @m80.k r0 r0Var, @m80.k q10.g gVar) {
        if (variance == null) {
            a(79);
        }
        if (r0Var == null) {
            a(80);
        }
        if (gVar == null) {
            a(81);
        }
        c1 h11 = u0.h(s1.b(gVar), j(), Collections.singletonList(new c2(variance, r0Var)));
        if (h11 == null) {
            a(82);
        }
        return h11;
    }

    @m80.k
    public c1 n() {
        c1 R = R(PrimitiveType.BOOLEAN);
        if (R == null) {
            a(64);
        }
        return R;
    }

    @m80.k
    public p10.b o(@m80.k n20.c cVar) {
        if (cVar == null) {
            a(12);
        }
        p10.b d11 = p10.n.d(r(), cVar, NoLookupLocation.FROM_BUILTINS);
        if (d11 == null) {
            a(13);
        }
        return d11;
    }

    @m80.k
    public final p10.b p(@m80.k String str) {
        if (str == null) {
            a(14);
        }
        p10.b invoke = this.f73977e.invoke(n20.f.f(str));
        if (invoke == null) {
            a(15);
        }
        return invoke;
    }

    @m80.k
    public final c1 q(@m80.k String str) {
        if (str == null) {
            a(47);
        }
        c1 s11 = p(str).s();
        if (s11 == null) {
            a(48);
        }
        return s11;
    }

    @m80.k
    public f0 r() {
        if (this.f73973a == null) {
            this.f73973a = this.f73974b.invoke();
        }
        f0 f0Var = this.f73973a;
        if (f0Var == null) {
            a(7);
        }
        return f0Var;
    }

    @m80.k
    public x20.k s() {
        x20.k r11 = r().h0(o.A).r();
        if (r11 == null) {
            a(11);
        }
        return r11;
    }

    @m80.k
    public c1 t() {
        c1 R = R(PrimitiveType.BYTE);
        if (R == null) {
            a(57);
        }
        return R;
    }

    @m80.k
    public c1 u() {
        c1 R = R(PrimitiveType.CHAR);
        if (R == null) {
            a(63);
        }
        return R;
    }

    @m80.k
    public Iterable<r10.b> v() {
        List singletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.f73978f, r()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    @m80.k
    public p10.b w() {
        p10.b o11 = o(o.a.X);
        if (o11 == null) {
            a(35);
        }
        return o11;
    }

    @m80.k
    public p10.b x() {
        return p("Comparable");
    }

    @m80.k
    public c1 y() {
        c1 I = I();
        if (I == null) {
            a(53);
        }
        return I;
    }

    @m80.k
    public c1 z() {
        c1 R = R(PrimitiveType.DOUBLE);
        if (R == null) {
            a(62);
        }
        return R;
    }
}
