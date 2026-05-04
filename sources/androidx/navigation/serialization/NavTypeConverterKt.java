package androidx.navigation.serialization;

import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalNavType;
import f50.i;
import h10.r;
import h50.f;
import h50.m;
import j50.w;
import kotlin.jvm.internal.g0;
import kotlin.text.Regex;
import m80.k;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavTypeConverterKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Class<?> getClass(f fVar) {
        String z22 = f0.z2(fVar.k(), "?", "", false, 4, null);
        try {
            Class<?> cls = Class.forName(z22);
            g0.o(cls, "forName(className)");
            return cls;
        } catch (ClassNotFoundException unused) {
            if (k0.n3(z22, ".", false, 2, null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(z22, "\\$"));
                g0.o(cls2, "forName(className)");
                return cls2;
            }
            throw new IllegalArgumentException("Cannot find class with name \"" + fVar.k() + "\". Ensure that the serialName for this argument is the default fully qualified name");
        }
    }

    @k
    public static final NavType<?> getNavType(@k f fVar) {
        g0.p(fVar, "<this>");
        InternalType internalType = toInternalType(fVar);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[internalType.ordinal()]) {
            case 1:
                return NavType.IntType;
            case 2:
                return NavType.BoolType;
            case 3:
                return NavType.FloatType;
            case 4:
                return NavType.LongType;
            case 5:
                return InternalNavType.INSTANCE.getStringNonNullableType();
            case 6:
                return NavType.StringType;
            case 7:
                NavType<?> parseSerializableOrParcelableType$navigation_common_release = NavType.Companion.parseSerializableOrParcelableType$navigation_common_release(getClass(fVar), false);
                return parseSerializableOrParcelableType$navigation_common_release == null ? UNKNOWN.INSTANCE : parseSerializableOrParcelableType$navigation_common_release;
            case 8:
                return InternalNavType.INSTANCE.getIntNullableType();
            case 9:
                return InternalNavType.INSTANCE.getBoolNullableType();
            case 10:
                return InternalNavType.INSTANCE.getDoubleType();
            case 11:
                return InternalNavType.INSTANCE.getDoubleNullableType();
            case 12:
                return InternalNavType.INSTANCE.getFloatNullableType();
            case 13:
                return InternalNavType.INSTANCE.getLongNullableType();
            case 14:
                return NavType.IntArrayType;
            case 15:
                return NavType.BoolArrayType;
            case 16:
                return InternalNavType.INSTANCE.getDoubleArrayType();
            case 17:
                return NavType.FloatArrayType;
            case 18:
                return NavType.LongArrayType;
            case 19:
                return toInternalType(fVar.e(0)) == InternalType.STRING ? NavType.StringArrayType : UNKNOWN.INSTANCE;
            case 20:
                switch (iArr[toInternalType(fVar.e(0)).ordinal()]) {
                    case 1:
                        return NavType.IntListType;
                    case 2:
                        return NavType.BoolListType;
                    case 3:
                        return NavType.FloatListType;
                    case 4:
                        return NavType.LongListType;
                    case 5:
                        return NavType.StringListType;
                    case 6:
                        return InternalNavType.INSTANCE.getStringNullableListType();
                    case 7:
                        Class<?> cls = getClass(fVar.e(0));
                        g0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        return new InternalNavType.EnumListType(cls);
                    default:
                        return UNKNOWN.INSTANCE;
                }
            case 21:
                Class<?> cls2 = getClass(fVar);
                if (!Enum.class.isAssignableFrom(cls2)) {
                    return UNKNOWN.INSTANCE;
                }
                g0.n(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
                return new InternalNavType.EnumNullableType(cls2);
            default:
                return UNKNOWN.INSTANCE;
        }
    }

    public static final boolean matchKType(@k f fVar, @k r kType) {
        g0.p(fVar, "<this>");
        g0.p(kType, "kType");
        if (fVar.b() != kType.e()) {
            return false;
        }
        i<Object> q11 = f50.k0.q(kType);
        if (q11 != null) {
            return g0.g(fVar, q11.a());
        }
        throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
    }

    private static final InternalType toInternalType(f fVar) {
        String z22 = f0.z2(fVar.k(), "?", "", false, 4, null);
        return g0.g(fVar.getKind(), m.b.f58540a) ? fVar.b() ? InternalType.ENUM_NULLABLE : InternalType.ENUM : g0.g(z22, "kotlin.Int") ? fVar.b() ? InternalType.INT_NULLABLE : InternalType.INT : g0.g(z22, "kotlin.Boolean") ? fVar.b() ? InternalType.BOOL_NULLABLE : InternalType.BOOL : g0.g(z22, "kotlin.Double") ? fVar.b() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE : g0.g(z22, "kotlin.Double") ? InternalType.DOUBLE : g0.g(z22, "kotlin.Float") ? fVar.b() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT : g0.g(z22, "kotlin.Long") ? fVar.b() ? InternalType.LONG_NULLABLE : InternalType.LONG : g0.g(z22, "kotlin.String") ? fVar.b() ? InternalType.STRING_NULLABLE : InternalType.STRING : g0.g(z22, "kotlin.IntArray") ? InternalType.INT_ARRAY : g0.g(z22, "kotlin.DoubleArray") ? InternalType.DOUBLE_ARRAY : g0.g(z22, "kotlin.BooleanArray") ? InternalType.BOOL_ARRAY : g0.g(z22, "kotlin.FloatArray") ? InternalType.FLOAT_ARRAY : g0.g(z22, "kotlin.LongArray") ? InternalType.LONG_ARRAY : g0.g(z22, w.f63489a) ? InternalType.ARRAY : f0.J2(z22, w.f63490b, false, 2, null) ? InternalType.LIST : InternalType.UNKNOWN;
    }
}
