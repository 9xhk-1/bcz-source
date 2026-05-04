package a30;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1842a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1843b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f1844c;

        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            try {
                iArr[ProtoBuf.MemberKind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.MemberKind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.MemberKind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1842a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f1843b = iArr2;
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
            f1844c = iArr3;
        }
    }

    @m80.k
    public static final p10.p a(@m80.k n0 n0Var, @m80.l ProtoBuf.Visibility visibility) {
        kotlin.jvm.internal.g0.p(n0Var, "<this>");
        switch (visibility == null ? -1 : a.f1844c[visibility.ordinal()]) {
            case 1:
                p10.p INTERNAL = p10.o.f78589d;
                kotlin.jvm.internal.g0.o(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                p10.p PRIVATE = p10.o.f78586a;
                kotlin.jvm.internal.g0.o(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                p10.p PRIVATE_TO_THIS = p10.o.f78587b;
                kotlin.jvm.internal.g0.o(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                p10.p PROTECTED = p10.o.f78588c;
                kotlin.jvm.internal.g0.o(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                p10.p PUBLIC = p10.o.f78590e;
                kotlin.jvm.internal.g0.o(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                p10.p LOCAL = p10.o.f78591f;
                kotlin.jvm.internal.g0.o(LOCAL, "LOCAL");
                return LOCAL;
            default:
                p10.p PRIVATE2 = p10.o.f78586a;
                kotlin.jvm.internal.g0.o(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    @m80.k
    public static final CallableMemberDescriptor.Kind b(@m80.k n0 n0Var, @m80.l ProtoBuf.MemberKind memberKind) {
        kotlin.jvm.internal.g0.p(n0Var, "<this>");
        int i11 = memberKind == null ? -1 : a.f1842a[memberKind.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? CallableMemberDescriptor.Kind.DECLARATION : CallableMemberDescriptor.Kind.SYNTHESIZED : CallableMemberDescriptor.Kind.DELEGATION : CallableMemberDescriptor.Kind.FAKE_OVERRIDE : CallableMemberDescriptor.Kind.DECLARATION;
    }
}
