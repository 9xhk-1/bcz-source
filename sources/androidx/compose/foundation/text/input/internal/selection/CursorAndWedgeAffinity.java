package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import m80.l;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n80#2:561\n80#2:562\n85#2:563\n90#2:564\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n*L\n527#1:561\n533#1:562\n544#1:563\n548#1:564\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAndWedgeAffinity {
    private final long value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                iArr[WedgeAffinity.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WedgeAffinity.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private /* synthetic */ CursorAndWedgeAffinity(long j11) {
        this.value = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m1324boximpl(long j11) {
        return new CursorAndWedgeAffinity(j11);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m1325component1impl(long j11) {
        return m1332getCursorimpl(j11);
    }

    @l
    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m1326component2impl(long j11) {
        return m1333getWedgeAffinityimpl(j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1329constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1330equalsimpl(long j11, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j11 == ((CursorAndWedgeAffinity) obj).m1336unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1331equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m1332getCursorimpl(long j11) {
        return (int) (j11 >> 32);
    }

    @l
    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m1333getWedgeAffinityimpl(long j11) {
        int i11 = (int) (j11 & 4294967295L);
        if (i11 < 0) {
            return null;
        }
        return i11 == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1334hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1335toStringimpl(long j11) {
        return "CursorAndWedgeAffinity(value=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m1330equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1334hashCodeimpl(this.value);
    }

    public String toString() {
        return m1335toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1336unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1327constructorimpl(int i11) {
        return m1329constructorimpl((i11 << 32) | ((-1) & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1328constructorimpl(int i11, @l WedgeAffinity wedgeAffinity) {
        int i12 = -1;
        int i13 = wedgeAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i13 != -1) {
            i12 = 1;
            if (i13 == 1) {
                i12 = 0;
            } else if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return m1329constructorimpl((i11 << 32) | (i12 & 4294967295L));
    }
}
