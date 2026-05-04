package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import c40.r0;
import j00.c;
import java.util.Set;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n*L\n75#1:138,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogHostKt$DialogHost$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ State<Set<NavBackStackEntry>> $transitionInProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogHostKt$DialogHost$2$1(State<? extends Set<NavBackStackEntry>> state, DialogNavigator dialogNavigator, SnapshotStateList<NavBackStackEntry> snapshotStateList, c<? super DialogHostKt$DialogHost$2$1> cVar) {
        super(2, cVar);
        this.$transitionInProgress$delegate = state;
        this.$dialogNavigator = dialogNavigator;
        this.$dialogsToDispose = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DialogHostKt$DialogHost$2$1(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DialogHostKt$DialogHost$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<NavBackStackEntry> DialogHost$lambda$1;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        DialogHost$lambda$1 = DialogHostKt.DialogHost$lambda$1(this.$transitionInProgress$delegate);
        DialogNavigator dialogNavigator = this.$dialogNavigator;
        SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
        for (NavBackStackEntry navBackStackEntry : DialogHost$lambda$1) {
            if (!dialogNavigator.getBackStack$navigation_compose_release().getValue().contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                dialogNavigator.onTransitionComplete$navigation_compose_release(navBackStackEntry);
            }
        }
        return g2.f100423a;
    }
}
