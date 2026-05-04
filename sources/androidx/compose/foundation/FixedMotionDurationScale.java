package androidx.compose.foundation;

import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.d;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FixedMotionDurationScale implements MotionDurationScale {

    @m80.k
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return MotionDurationScale.DefaultImpls.plus(this, dVar);
    }
}
