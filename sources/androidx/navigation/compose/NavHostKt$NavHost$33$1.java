package androidx.navigation.compose;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import c40.r0;
import j00.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$33$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,780:1\n1855#2,2:781\n526#3:783\n511#3,6:784\n215#4,2:790\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$33$1\n*L\n720#1:781,2\n722#1:783\n722#1:784,6\n723#1:790,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$33$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ Map<String, Float> $zIndices;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$33$1(Transition<NavBackStackEntry> transition, NavHostController navHostController, Map<String, Float> map, State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator, c<? super NavHostKt$NavHost$33$1> cVar) {
        super(2, cVar);
        this.$transition = transition;
        this.$navController = navHostController;
        this.$zIndices = map;
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new NavHostKt$NavHost$33$1(this.$transition, this.$navController, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((NavHostKt$NavHost$33$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List NavHost$lambda$17;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        if (g0.g(this.$transition.getCurrentState(), this.$transition.getTargetState()) && (this.$navController.getCurrentBackStackEntry() == null || g0.g(this.$transition.getTargetState(), this.$navController.getCurrentBackStackEntry()))) {
            NavHost$lambda$17 = NavHostKt.NavHost$lambda$17(this.$visibleEntries$delegate);
            ComposeNavigator composeNavigator = this.$composeNavigator;
            Iterator it = NavHost$lambda$17.iterator();
            while (it.hasNext()) {
                composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
            }
            Map<String, Float> map = this.$zIndices;
            Transition<NavBackStackEntry> transition = this.$transition;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                if (!g0.g(entry.getKey(), transition.getTargetState().getId())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map<String, Float> map2 = this.$zIndices;
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map2.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return g2.f100423a;
    }
}
