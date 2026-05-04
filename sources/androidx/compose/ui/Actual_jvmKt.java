package androidx.compose.ui;

import a00.a0;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import e00.g;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nActual.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,52:1\n6442#2:53\n34#3,6:54\n*S KotlinDebug\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n36#1:53\n37#1:54,6\n*E\n"})
/* loaded from: classes.dex */
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(@k Object obj, @k Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    @k
    public static final Object classKeyForObject(@k Object obj) {
        return obj.getClass();
    }

    public static final void tryPopulateReflectively(@k InspectorInfo inspectorInfo, @k ModifierNodeElement<?> modifierNodeElement) {
        List fw2 = a0.fw(modifierNodeElement.getClass().getDeclaredFields(), new Comparator() { // from class: androidx.compose.ui.Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(((Field) t11).getName(), ((Field) t12).getName());
            }
        });
        int size = fw2.size();
        for (int i11 = 0; i11 < size; i11++) {
            Field field = (Field) fw2.get(i11);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.getName(), field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
