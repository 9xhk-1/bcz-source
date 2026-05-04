package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.v;
import m80.k;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;

    @k
    private final p<IntSize, IntSize, FiniteAnimationSpec<IntSize>> sizeAnimationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeTransformImpl(boolean z11, @k p<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> pVar) {
        this.clip = z11;
        this.sizeAnimationSpec = pVar;
    }

    @Override // androidx.compose.animation.SizeTransform
    @k
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo122createAnimationSpecTemP2vQ(long j11, long j12) {
        return this.sizeAnimationSpec.invoke(IntSize.m5278boximpl(j11), IntSize.m5278boximpl(j12));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    @k
    public final p<IntSize, IntSize, FiniteAnimationSpec<IntSize>> getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public /* synthetic */ SizeTransformImpl(boolean z11, p pVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11, pVar);
    }
}
