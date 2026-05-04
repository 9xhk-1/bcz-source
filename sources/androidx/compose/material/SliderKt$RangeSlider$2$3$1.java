package androidx.compose.material;

import g10.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class SliderKt$RangeSlider$2$3$1 extends FunctionReferenceImpl implements l<Float, Float> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$3$1(f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, g0.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.$valueRange = fVar;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
    }

    public final Float invoke(float f11) {
        float invoke$scaleToOffset;
        invoke$scaleToOffset = SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f11);
        return Float.valueOf(invoke$scaleToOffset);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Float invoke(Float f11) {
        return invoke(f11.floatValue());
    }
}
