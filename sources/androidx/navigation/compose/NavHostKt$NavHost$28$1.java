package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import c40.r0;
import j00.c;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", i = {}, l = {621}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$28$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ State<List<NavBackStackEntry>> $currentBackStack$delegate;
    final /* synthetic */ MutableFloatState $progress$delegate;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$28$1(SeekableTransitionState<NavBackStackEntry> seekableTransitionState, State<? extends List<NavBackStackEntry>> state, MutableFloatState mutableFloatState, c<? super NavHostKt$NavHost$28$1> cVar) {
        super(2, cVar);
        this.$transitionState = seekableTransitionState;
        this.$currentBackStack$delegate = state;
        this.$progress$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new NavHostKt$NavHost$28$1(this.$transitionState, this.$currentBackStack$delegate, this.$progress$delegate, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((NavHostKt$NavHost$28$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List NavHost$lambda$6;
        List NavHost$lambda$62;
        float floatValue;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
            NavHost$lambda$62 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) NavHost$lambda$6.get(NavHost$lambda$62.size() - 2);
            SeekableTransitionState<NavBackStackEntry> seekableTransitionState = this.$transitionState;
            floatValue = this.$progress$delegate.getFloatValue();
            this.label = 1;
            if (seekableTransitionState.seekTo(floatValue, navBackStackEntry, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
