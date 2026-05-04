package androidx.compose.ui.unit;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingLinear\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
@Immutable
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface FontScalingLinear {
    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m5230toDpGaN1DYA(long j11) {
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnitType.Companion.m5342getSpUIouoOA())) {
            return Dp.m5115constructorimpl(TextUnit.m5309getValueimpl(j11) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Stable
    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m5231toSp0xMU5do(float f11) {
        return TextUnitKt.getSp(f11 / getFontScale());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5232toDpGaN1DYA(@k FontScalingLinear fontScalingLinear, long j11) {
            return FontScalingLinear.super.m5230toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5233toSp0xMU5do(@k FontScalingLinear fontScalingLinear, float f11) {
            return FontScalingLinear.super.m5231toSp0xMU5do(f11);
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }
    }
}
