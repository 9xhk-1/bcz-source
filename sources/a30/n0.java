package a30;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n0 f1824a = new n0();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1825a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1826b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f1827c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f1828d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f1829e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f1830f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f1831g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f1832h;

        static {
            int[] iArr = new int[ProtoBuf.Modality.values().length];
            try {
                iArr[ProtoBuf.Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Modality.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Modality.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Modality.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1825a = iArr;
            int[] iArr2 = new int[Modality.values().length];
            try {
                iArr2[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Modality.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Modality.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Modality.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f1826b = iArr2;
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f1827c = iArr3;
            int[] iArr4 = new int[ProtoBuf.Class.Kind.values().length];
            try {
                iArr4[ProtoBuf.Class.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f1828d = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            try {
                iArr5[ClassKind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[ClassKind.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[ClassKind.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[ClassKind.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[ClassKind.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f1829e = iArr5;
            int[] iArr6 = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f1830f = iArr6;
            int[] iArr7 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f1831g = iArr7;
            int[] iArr8 = new int[Variance.values().length];
            try {
                iArr8[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[Variance.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[Variance.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f1832h = iArr8;
        }
    }

    @m80.k
    public final ClassKind a(@m80.l ProtoBuf.Class.Kind kind) {
        switch (kind == null ? -1 : a.f1828d[kind.ordinal()]) {
            case 1:
                return ClassKind.CLASS;
            case 2:
                return ClassKind.INTERFACE;
            case 3:
                return ClassKind.ENUM_CLASS;
            case 4:
                return ClassKind.ENUM_ENTRY;
            case 5:
                return ClassKind.ANNOTATION_CLASS;
            case 6:
            case 7:
                return ClassKind.OBJECT;
            default:
                return ClassKind.CLASS;
        }
    }

    @m80.k
    public final Modality b(@m80.l ProtoBuf.Modality modality) {
        int i11 = modality == null ? -1 : a.f1825a[modality.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? Modality.FINAL : Modality.SEALED : Modality.ABSTRACT : Modality.OPEN : Modality.FINAL;
    }

    @m80.k
    public final Variance c(@m80.k ProtoBuf.Type.Argument.Projection projection) {
        kotlin.jvm.internal.g0.p(projection, "projection");
        int i11 = a.f1831g[projection.ordinal()];
        if (i11 == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i11 == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i11 == 3) {
            return Variance.INVARIANT;
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    @m80.k
    public final Variance d(@m80.k ProtoBuf.TypeParameter.Variance variance) {
        kotlin.jvm.internal.g0.p(variance, "variance");
        int i11 = a.f1830f[variance.ordinal()];
        if (i11 == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i11 == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i11 == 3) {
            return Variance.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
