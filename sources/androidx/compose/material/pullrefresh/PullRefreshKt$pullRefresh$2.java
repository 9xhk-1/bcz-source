package androidx.compose.material.pullrefresh;

import j00.c;
import kotlin.jvm.internal.AdaptedFunctionReference;
import l00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class PullRefreshKt$pullRefresh$2 extends AdaptedFunctionReference implements p<Float, c<? super Float>, Object>, l {
    public PullRefreshKt$pullRefresh$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    public final Object invoke(float f11, c<? super Float> cVar) {
        Object pullRefresh$onRelease;
        pullRefresh$onRelease = PullRefreshKt.pullRefresh$onRelease((PullRefreshState) this.receiver, f11, cVar);
        return pullRefresh$onRelease;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Float f11, c<? super Float> cVar) {
        return invoke(f11.floatValue(), cVar);
    }
}
