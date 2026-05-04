package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,180:1\n1855#2,2:181\n215#3,2:183\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n165#1:181,2\n174#1:183,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry_androidKt {

    @m80.k
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @m80.k
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@m80.k View view, @m80.k SavedStateRegistryOwner savedStateRegistryOwner) {
        Object parent = view.getParent();
        kotlin.jvm.internal.g0.n(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(str, savedStateRegistryOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry saveableStateRegistry) {
        return toBundle(saveableStateRegistry.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            T value = snapshotMutableState.getValue();
            if (value == 0) {
                return true;
            }
            return canBeSavedToBundle(value);
        }
        if ((obj instanceof yz.w) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : AcceptableClasses) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.g0.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    @m80.k
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@m80.k String str, @m80.k SavedStateRegistryOwner savedStateRegistryOwner) {
        final boolean z11;
        final String str2 = SaveableStateRegistry.class.getSimpleName() + ':' + str;
        final SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str2);
        final SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey != null ? toMap(consumeRestoredStateForKey) : null, new x00.l<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(Object obj) {
                boolean canBeSavedToBundle;
                canBeSavedToBundle = DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj);
                return Boolean.valueOf(canBeSavedToBundle);
            }
        });
        try {
            savedStateRegistry.registerSavedStateProvider(str2, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.y
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle DisposableSaveableStateRegistry$lambda$0;
                    DisposableSaveableStateRegistry$lambda$0 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry.this);
                    return DisposableSaveableStateRegistry$lambda$0;
                }
            });
            z11 = true;
        } catch (IllegalArgumentException unused) {
            z11 = false;
        }
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new x00.a<g2>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z11) {
                    savedStateRegistry.unregisterSavedStateProvider(str2);
                }
            }
        });
    }
}
