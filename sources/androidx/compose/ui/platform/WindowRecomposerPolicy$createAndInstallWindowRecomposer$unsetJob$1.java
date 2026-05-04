package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {R.styleable.Theme_drawable_syncview}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, j00.c<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1> cVar) {
        super(2, cVar);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        View view;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                kotlin.e.n(obj);
                Recomposer recomposer = this.$newRecomposer;
                this.label = 1;
                if (recomposer.join(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            if (WindowRecomposer_androidKt.getCompositionContext(view) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
            return g2.f100423a;
        } finally {
            if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
        }
    }
}
