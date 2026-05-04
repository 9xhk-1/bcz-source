package androidx.navigation.compose;

import a00.r0;
import androidx.activity.BackEventCompat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import j00.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", i = {0}, l = {524}, m = "invokeSuspend", n = {"currentBackStackEntry"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$25$1 extends SuspendLambda implements p<i<BackEventCompat>, c<? super g2>, Object> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ State<List<NavBackStackEntry>> $currentBackStack$delegate;
    final /* synthetic */ MutableState<Boolean> $inPredictiveBack$delegate;
    final /* synthetic */ MutableFloatState $progress$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$25$1(ComposeNavigator composeNavigator, State<? extends List<NavBackStackEntry>> state, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState, c<? super NavHostKt$NavHost$25$1> cVar) {
        super(2, cVar);
        this.$composeNavigator = composeNavigator;
        this.$currentBackStack$delegate = state;
        this.$progress$delegate = mutableFloatState;
        this.$inPredictiveBack$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.$composeNavigator, this.$currentBackStack$delegate, this.$progress$delegate, this.$inPredictiveBack$delegate, cVar);
        navHostKt$NavHost$25$1.L$0 = obj;
        return navHostKt$NavHost$25$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List NavHost$lambda$6;
        List NavHost$lambda$62;
        NavBackStackEntry navBackStackEntry;
        NavBackStackEntry navBackStackEntry2;
        List NavHost$lambda$63;
        List NavHost$lambda$64;
        List NavHost$lambda$65;
        List NavHost$lambda$66;
        Object l11 = b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                e.n(obj);
                i iVar = (i) this.L$0;
                NavHost$lambda$62 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
                if (NavHost$lambda$62.size() > 1) {
                    this.$progress$delegate.setFloatValue(0.0f);
                    NavHost$lambda$63 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
                    navBackStackEntry = (NavBackStackEntry) r0.A3(NavHost$lambda$63);
                    ComposeNavigator composeNavigator = this.$composeNavigator;
                    g0.m(navBackStackEntry);
                    composeNavigator.prepareForTransition(navBackStackEntry);
                    NavHost$lambda$64 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
                    NavHost$lambda$65 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
                    this.$composeNavigator.prepareForTransition((NavBackStackEntry) NavHost$lambda$64.get(NavHost$lambda$65.size() - 2));
                } else {
                    navBackStackEntry = null;
                }
                final State<List<NavBackStackEntry>> state = this.$currentBackStack$delegate;
                final MutableState<Boolean> mutableState = this.$inPredictiveBack$delegate;
                final MutableFloatState mutableFloatState = this.$progress$delegate;
                j jVar = new j() { // from class: androidx.navigation.compose.NavHostKt$NavHost$25$1.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((BackEventCompat) obj2, (c<? super g2>) cVar);
                    }

                    public final Object emit(BackEventCompat backEventCompat, c<? super g2> cVar) {
                        List NavHost$lambda$67;
                        NavHost$lambda$67 = NavHostKt.NavHost$lambda$6(state);
                        if (NavHost$lambda$67.size() > 1) {
                            NavHostKt.NavHost$lambda$12(mutableState, true);
                            mutableFloatState.setFloatValue(backEventCompat.getProgress());
                        }
                        return g2.f100423a;
                    }
                };
                this.L$0 = navBackStackEntry;
                this.label = 1;
                if (iVar.collect(jVar, this) == l11) {
                    return l11;
                }
                navBackStackEntry2 = navBackStackEntry;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navBackStackEntry2 = (NavBackStackEntry) this.L$0;
                e.n(obj);
            }
            NavHost$lambda$66 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
            if (NavHost$lambda$66.size() > 1) {
                NavHostKt.NavHost$lambda$12(this.$inPredictiveBack$delegate, false);
                ComposeNavigator composeNavigator2 = this.$composeNavigator;
                g0.m(navBackStackEntry2);
                composeNavigator2.popBackStack(navBackStackEntry2, false);
            }
        } catch (CancellationException unused) {
            NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$currentBackStack$delegate);
            if (NavHost$lambda$6.size() > 1) {
                NavHostKt.NavHost$lambda$12(this.$inPredictiveBack$delegate, false);
            }
        }
        return g2.f100423a;
    }

    @Override // x00.p
    public final Object invoke(i<BackEventCompat> iVar, c<? super g2> cVar) {
        return ((NavHostKt$NavHost$25$1) create(iVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
