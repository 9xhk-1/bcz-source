package androidx.compose.material.pullrefresh;

import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class PullRefreshKt$pullRefresh$1 extends FunctionReferenceImpl implements l<Float, Float> {
    public PullRefreshKt$pullRefresh$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    public final Float invoke(float f11) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(f11));
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Float invoke(Float f11) {
        return invoke(f11.floatValue());
    }
}
