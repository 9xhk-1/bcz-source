package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ListSaverKt {
    @k
    public static final <Original, Saveable> Saver<Original, Object> listSaver(@k final p<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> pVar, @k l<? super List<? extends Saveable>, ? extends Original> lVar) {
        p<SaverScope, Original, Object> pVar2 = new p<SaverScope, Original, Object>() { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Object obj) {
                return invoke2(saverScope, (SaverScope) obj);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(SaverScope saverScope, Original original) {
                List list = (List) pVar.invoke(saverScope, original);
                List list2 = list;
                int size = list2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = list.get(i11);
                    if (obj != null && !saverScope.canBeSaved(obj)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            }
        };
        g0.n(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.Saver(pVar2, (l) x0.q(lVar, 1));
    }
}
