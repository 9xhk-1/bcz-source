package h20;

import androidx.exifinterface.media.ExifInterface;
import h20.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmethodSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/JvmTypeFactoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,200:1\n1#2:201\n1310#3,2:202\n*S KotlinDebug\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/JvmTypeFactoryImpl\n*L\n144#1:202,2\n*E\n"})
/* loaded from: classes8.dex */
public final class u implements t<s> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u f58154a = new u();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58155a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f58155a = iArr;
        }
    }

    @Override // h20.t
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s c(@m80.k s possiblyPrimitiveType) {
        kotlin.jvm.internal.g0.p(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof s.d)) {
            return possiblyPrimitiveType;
        }
        s.d dVar = (s.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String f11 = v20.d.c(dVar.i().getWrapperFqName()).f();
        kotlin.jvm.internal.g0.o(f11, "getInternalName(...)");
        return f(f11);
    }

    @Override // h20.t
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public s a(@m80.k String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        kotlin.jvm.internal.g0.p(representation, "representation");
        representation.length();
        char charAt = representation.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i11];
            if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                break;
            }
            i11++;
        }
        if (jvmPrimitiveType != null) {
            return new s.d(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new s.d(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return new s.a(a(substring));
        }
        if (charAt == 'L') {
            k0.s3(representation, l70.f.f70689d, false, 2, null);
        }
        String substring2 = representation.substring(1, representation.length() - 1);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        return new s.c(substring2);
    }

    @Override // h20.t
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.c f(@m80.k String internalName) {
        kotlin.jvm.internal.g0.p(internalName, "internalName");
        return new s.c(internalName);
    }

    @Override // h20.t
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public s d(@m80.k PrimitiveType primitiveType) {
        kotlin.jvm.internal.g0.p(primitiveType, "primitiveType");
        switch (a.f58155a[primitiveType.ordinal()]) {
            case 1:
                return s.f58142a.a();
            case 2:
                return s.f58142a.c();
            case 3:
                return s.f58142a.b();
            case 4:
                return s.f58142a.h();
            case 5:
                return s.f58142a.f();
            case 6:
                return s.f58142a.e();
            case 7:
                return s.f58142a.g();
            case 8:
                return s.f58142a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // h20.t
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public s b() {
        return f("java/lang/Class");
    }

    @Override // h20.t
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String e(@m80.k s type) {
        String desc;
        kotlin.jvm.internal.g0.p(type, "type");
        if (type instanceof s.a) {
            return '[' + e(((s.a) type).i());
        }
        if (type instanceof s.d) {
            JvmPrimitiveType i11 = ((s.d) type).i();
            return (i11 == null || (desc = i11.getDesc()) == null) ? ExifInterface.GPS_MEASUREMENT_INTERRUPTED : desc;
        }
        if (!(type instanceof s.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((s.c) type).i() + l70.f.f70689d;
    }
}
