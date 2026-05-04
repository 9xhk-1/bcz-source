package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1#1,184:1\n1#2:185\n808#3:186\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryKt\n*L\n100#1:186\n*E\n"})
/* loaded from: classes.dex */
public final class SaveableStateRegistryKt {

    @k
    private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(new a<SaveableStateRegistry>() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$LocalSaveableStateRegistry$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final SaveableStateRegistry invoke() {
            return null;
        }
    });

    @k
    public static final SaveableStateRegistry SaveableStateRegistry(@l Map<String, ? extends List<? extends Object>> map, @k x00.l<Object, Boolean> lVar) {
        return new SaveableStateRegistryImpl(map, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fastIsBlank(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!kotlin.text.a.r(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    @k
    public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return LocalSaveableStateRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<K, V> toMutableScatterMap(Map<K, ? extends V> map) {
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(map.size());
        mutableScatterMap.putAll(map);
        return mutableScatterMap;
    }
}
