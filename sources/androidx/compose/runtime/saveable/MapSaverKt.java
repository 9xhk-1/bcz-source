package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MapSaverKt {
    @k
    public static final <T> Saver<T, Object> mapSaver(@k final p<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> pVar, @k final l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        return ListSaverKt.listSaver(new p<SaverScope, T, List<? extends Object>>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.p
            public /* bridge */ /* synthetic */ List<? extends Object> invoke(SaverScope saverScope, Object obj) {
                return invoke2(saverScope, (SaverScope) obj);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final List<Object> invoke2(SaverScope saverScope, T t11) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : pVar.invoke(saverScope, t11).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        }, new l<List<? extends Object>, T>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final T invoke(List<? extends Object> list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                for (int i11 = 0; i11 < list.size(); i11 += 2) {
                    Object obj = list.get(i11);
                    g0.n(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, list.get(i11 + 1));
                }
                return lVar.invoke(linkedHashMap);
            }
        });
    }
}
