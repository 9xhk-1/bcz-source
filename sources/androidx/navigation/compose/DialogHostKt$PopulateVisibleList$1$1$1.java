package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n64#2,5:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1$1\n*L\n112#1:138,5\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogHostKt$PopulateVisibleList$1$1$1 extends Lambda implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ boolean $isInspecting;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1$1(NavBackStackEntry navBackStackEntry, boolean z11, List<NavBackStackEntry> list) {
        super(1);
        this.$entry = navBackStackEntry;
        this.$isInspecting = z11;
        this.$this_PopulateVisibleList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(boolean z11, List list, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (z11 && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }

    @Override // x00.l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final boolean z11 = this.$isInspecting;
        final List<NavBackStackEntry> list = this.$this_PopulateVisibleList;
        final NavBackStackEntry navBackStackEntry = this.$entry;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                DialogHostKt$PopulateVisibleList$1$1$1.invoke$lambda$0(z11, list, navBackStackEntry, lifecycleOwner, event);
            }
        };
        this.$entry.getLifecycle().addObserver(lifecycleEventObserver);
        final NavBackStackEntry navBackStackEntry2 = this.$entry;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                NavBackStackEntry.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }
}
