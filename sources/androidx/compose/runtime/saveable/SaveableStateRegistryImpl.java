package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,184:1\n1#2:185\n1#2:187\n683#3:186\n357#4,4:188\n329#4,6:192\n339#4,3:199\n342#4,9:203\n361#4:212\n357#4,4:213\n329#4,6:217\n339#4,3:224\n342#4,9:228\n361#4:237\n1399#5:198\n1270#5:202\n1399#5:223\n1270#5:227\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n134#1:187\n134#1:186\n156#1:188,4\n156#1:192,6\n156#1:199,3\n156#1:203,9\n156#1:212\n158#1:213,4\n158#1:217,6\n158#1:224,3\n158#1:228,9\n158#1:237\n156#1:198\n156#1:202\n158#1:223\n158#1:227\n*E\n"})
/* loaded from: classes.dex */
final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    @k
    private final l<Object, Boolean> canBeSaved;

    @m80.l
    private final MutableScatterMap<String, List<Object>> restored;

    @m80.l
    private MutableScatterMap<String, List<a<Object>>> valueProviders;

    public SaveableStateRegistryImpl(@m80.l Map<String, ? extends List<? extends Object>> map, @k l<Object, Boolean> lVar) {
        this.canBeSaved = lVar;
        this.restored = (map == null || map.isEmpty()) ? null : SaveableStateRegistryKt.toMutableScatterMap(map);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@k Object obj) {
        return this.canBeSaved.invoke(obj).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m80.l
    public Object consumeRestored(@k String str) {
        MutableScatterMap<String, List<Object>> mutableScatterMap;
        MutableScatterMap<String, List<Object>> mutableScatterMap2 = this.restored;
        List<Object> remove = mutableScatterMap2 != null ? mutableScatterMap2.remove(str) : null;
        List<Object> list = remove;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (remove.size() > 1 && (mutableScatterMap = this.restored) != null) {
            mutableScatterMap.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.performSave():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @k
    public SaveableStateRegistry.Entry registerProvider(@k final String str, @k final a<? extends Object> aVar) {
        boolean fastIsBlank;
        fastIsBlank = SaveableStateRegistryKt.fastIsBlank(str);
        if (fastIsBlank) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        final MutableScatterMap<String, List<a<Object>>> mutableScatterMap = this.valueProviders;
        if (mutableScatterMap == null) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
            this.valueProviders = mutableScatterMap;
        }
        List<a<Object>> list = mutableScatterMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            mutableScatterMap.set(str, list);
        }
        list.add(aVar);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                List<a<Object>> remove = mutableScatterMap.remove(str);
                if (remove != null) {
                    remove.remove(aVar);
                }
                List<a<Object>> list2 = remove;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                mutableScatterMap.set(str, remove);
            }
        };
    }
}
