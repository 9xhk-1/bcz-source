package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/BackStackEntryIdViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes3.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    public static final int $stable = 8;

    @k
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: id, reason: collision with root package name */
    @k
    private final UUID f5298id;
    public WeakReference<SaveableStateHolder> saveableStateHolderRef;

    public BackStackEntryIdViewModel(@k SavedStateHandle savedStateHandle) {
        UUID uuid = (UUID) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.f5298id = uuid;
    }

    @k
    public final UUID getId() {
        return this.f5298id;
    }

    @k
    public final WeakReference<SaveableStateHolder> getSaveableStateHolderRef() {
        WeakReference<SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        g0.S("saveableStateHolderRef");
        return null;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.f5298id);
        }
        getSaveableStateHolderRef().clear();
    }

    public final void setSaveableStateHolderRef(@k WeakReference<SaveableStateHolder> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }
}
