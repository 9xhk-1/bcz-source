package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;

    @m80.k
    private final x00.a<g2> onDispose;

    public DisposableSaveableStateRegistry(@m80.k SaveableStateRegistry saveableStateRegistry, @m80.k x00.a<g2> aVar) {
        this.onDispose = aVar;
        this.$$delegate_0 = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@m80.k Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m80.l
    public Object consumeRestored(@m80.k String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m80.k
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m80.k
    public SaveableStateRegistry.Entry registerProvider(@m80.k String str, @m80.k x00.a<? extends Object> aVar) {
        return this.$$delegate_0.registerProvider(str, aVar);
    }
}
