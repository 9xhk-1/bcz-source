package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h10.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@u0({"SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyCycleScope\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,969:1\n149#2:970\n149#2:971\n149#2:972\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyCycleScope\n*L\n594#1:970\n595#1:971\n596#1:972\n*E\n"})
/* loaded from: classes2.dex */
public final class KeyCycleScope extends BaseKeyFrameScope {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "alpha", "getAlpha()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "scaleX", "getScaleX()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "scaleY", "getScaleY()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "rotationX", "getRotationX()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "rotationY", "getRotationY()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "rotationZ", "getRotationZ()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_PERIOD, "getPeriod()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, "offset", "getOffset()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_PHASE, "getPhase()F", 0))};
    public static final int $stable = 8;

    @k
    private final d10.c alpha$delegate;

    @k
    private final d10.c offset$delegate;

    @k
    private final d10.c period$delegate;

    @k
    private final d10.c phase$delegate;

    @k
    private final d10.c rotationX$delegate;

    @k
    private final d10.c rotationY$delegate;

    @k
    private final d10.c rotationZ$delegate;

    @k
    private final d10.c scaleX$delegate;

    @k
    private final d10.c scaleY$delegate;

    @k
    private final d10.c translationX$delegate;

    @k
    private final d10.c translationY$delegate;

    @k
    private final d10.c translationZ$delegate;

    public KeyCycleScope() {
        super(null);
        Float valueOf = Float.valueOf(1.0f);
        this.alpha$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf, null, 2, null);
        this.scaleX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf, null, 2, null);
        this.scaleY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf, null, 2, null);
        Float valueOf2 = Float.valueOf(0.0f);
        this.rotationX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf2, null, 2, null);
        this.rotationY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf2, null, 2, null);
        this.rotationZ$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf2, null, 2, null);
        float f11 = 0;
        this.translationX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, Dp.m5113boximpl(Dp.m5115constructorimpl(f11)), null, 2, null);
        this.translationY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, Dp.m5113boximpl(Dp.m5115constructorimpl(f11)), null, 2, null);
        this.translationZ$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, Dp.m5113boximpl(Dp.m5115constructorimpl(f11)), null, 2, null);
        this.period$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf2, null, 2, null);
        this.offset$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf2, null, 2, null);
        this.phase$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf2, null, 2, null);
    }

    public final float getAlpha() {
        return ((Number) this.alpha$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset$delegate.getValue(this, $$delegatedProperties[10])).floatValue();
    }

    public final float getPeriod() {
        return ((Number) this.period$delegate.getValue(this, $$delegatedProperties[9])).floatValue();
    }

    public final float getPhase() {
        return ((Number) this.phase$delegate.getValue(this, $$delegatedProperties[11])).floatValue();
    }

    public final float getRotationX() {
        return ((Number) this.rotationX$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final float getRotationY() {
        return ((Number) this.rotationY$delegate.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    public final float getRotationZ() {
        return ((Number) this.rotationZ$delegate.getValue(this, $$delegatedProperties[5])).floatValue();
    }

    public final float getScaleX() {
        return ((Number) this.scaleX$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final float getScaleY() {
        return ((Number) this.scaleY$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: not valid java name */
    public final float m5503getTranslationXD9Ej5fM() {
        return ((Dp) this.translationX$delegate.getValue(this, $$delegatedProperties[6])).m5129unboximpl();
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m5504getTranslationYD9Ej5fM() {
        return ((Dp) this.translationY$delegate.getValue(this, $$delegatedProperties[7])).m5129unboximpl();
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m5505getTranslationZD9Ej5fM() {
        return ((Dp) this.translationZ$delegate.getValue(this, $$delegatedProperties[8])).m5129unboximpl();
    }

    public final void setAlpha(float f11) {
        this.alpha$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f11));
    }

    public final void setOffset(float f11) {
        this.offset$delegate.setValue(this, $$delegatedProperties[10], Float.valueOf(f11));
    }

    public final void setPeriod(float f11) {
        this.period$delegate.setValue(this, $$delegatedProperties[9], Float.valueOf(f11));
    }

    public final void setPhase(float f11) {
        this.phase$delegate.setValue(this, $$delegatedProperties[11], Float.valueOf(f11));
    }

    public final void setRotationX(float f11) {
        this.rotationX$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f11));
    }

    public final void setRotationY(float f11) {
        this.rotationY$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f11));
    }

    public final void setRotationZ(float f11) {
        this.rotationZ$delegate.setValue(this, $$delegatedProperties[5], Float.valueOf(f11));
    }

    public final void setScaleX(float f11) {
        this.scaleX$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f11));
    }

    public final void setScaleY(float f11) {
        this.scaleY$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f11));
    }

    /* renamed from: setTranslationX-0680j_4, reason: not valid java name */
    public final void m5506setTranslationX0680j_4(float f11) {
        this.translationX$delegate.setValue(this, $$delegatedProperties[6], Dp.m5113boximpl(f11));
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m5507setTranslationY0680j_4(float f11) {
        this.translationY$delegate.setValue(this, $$delegatedProperties[7], Dp.m5113boximpl(f11));
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m5508setTranslationZ0680j_4(float f11) {
        this.translationZ$delegate.setValue(this, $$delegatedProperties[8], Dp.m5113boximpl(f11));
    }
}
