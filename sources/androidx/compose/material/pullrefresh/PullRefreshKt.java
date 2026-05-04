package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import j00.c;
import l00.a;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PullRefreshKt {
    @ExperimentalMaterialApi
    @k
    public static final Modifier pullRefresh(@k Modifier modifier, @k PullRefreshState pullRefreshState, boolean z11) {
        return pullRefresh(modifier, new PullRefreshKt$pullRefresh$1(pullRefreshState), new PullRefreshKt$pullRefresh$2(pullRefreshState), z11);
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return pullRefresh(modifier, pullRefreshState, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pullRefresh$onRelease(PullRefreshState pullRefreshState, float f11, c cVar) {
        return a.e(pullRefreshState.onRelease$material_release(f11));
    }

    @ExperimentalMaterialApi
    @k
    public static final Modifier pullRefresh(@k Modifier modifier, @k l<? super Float, Float> lVar, @k p<? super Float, ? super c<? super Float>, ? extends Object> pVar, boolean z11) {
        return NestedScrollModifierKt.nestedScroll$default(modifier, new PullRefreshNestedScrollConnection(lVar, pVar, z11), null, 2, null);
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, l lVar, p pVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return pullRefresh(modifier, lVar, pVar, z11);
    }
}
