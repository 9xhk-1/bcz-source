package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.internal.u0;
import x00.a;
import x00.l;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,69:1\n85#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n*L\n65#1:70\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$1<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {
    private final ProvidableModifierLocal<T> key;
    private final State value$delegate;

    public ModifierLocalProviderKt$modifierLocalProvider$1(ProvidableModifierLocal<T> providableModifierLocal, a<? extends T> aVar, l<? super InspectorInfo, g2> lVar) {
        super(lVar);
        this.key = providableModifierLocal;
        this.value$delegate = SnapshotStateKt.derivedStateOf(aVar);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<T> getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public T getValue() {
        return (T) this.value$delegate.getValue();
    }
}
