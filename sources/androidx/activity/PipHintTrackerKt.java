package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @m80.l
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(@m80.k final Activity activity, @m80.k View view, @m80.k j00.c<? super g2> cVar) {
        Object collect = kotlinx.coroutines.flow.k.t(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new kotlinx.coroutines.flow.j() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            public final Object emit(Rect rect, j00.c<? super g2> cVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return g2.f100423a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, j00.c cVar2) {
                return emit((Rect) obj, (j00.c<? super g2>) cVar2);
            }
        }, cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
