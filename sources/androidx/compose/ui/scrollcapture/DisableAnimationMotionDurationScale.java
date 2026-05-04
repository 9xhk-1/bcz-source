package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DisableAnimationMotionDurationScale implements MotionDurationScale {

    @k
    public static final DisableAnimationMotionDurationScale INSTANCE = new DisableAnimationMotionDurationScale();

    private DisableAnimationMotionDurationScale() {
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 0.0f;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public kotlin.coroutines.d minusKey(@k d.c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public kotlin.coroutines.d plus(@k kotlin.coroutines.d dVar) {
        return MotionDurationScale.DefaultImpls.plus(this, dVar);
    }
}
