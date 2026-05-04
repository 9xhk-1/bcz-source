package androidx.compose.ui.tooling;

import a00.g0;
import a00.m0;
import a00.r0;
import androidx.compose.ui.unit.IntRect;
import e00.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import u30.f0;
import u30.k0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewInfoUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1360#2:69\n1446#2,2:70\n1360#2:72\n1446#2,5:73\n1448#2,3:78\n1855#2,2:81\n*S KotlinDebug\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n*L\n24#1:69\n24#1:70,2\n26#1:72\n26#1:73,5\n24#1:78,3\n57#1:81,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewInfoUtil_androidKt {
    private static final List<ViewInfo> filterTree(List<ViewInfo> list, l<? super ViewInfo, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        for (ViewInfo viewInfo : list) {
            List<ViewInfo> filterTree = filterTree(viewInfo.getChildren(), lVar);
            ArrayList arrayList2 = new ArrayList();
            for (ViewInfo viewInfo2 : filterTree) {
                m0.s0(arrayList2, viewInfo2.getLocation() == null ? viewInfo2.getChildren() : g0.l(viewInfo2));
            }
            m0.s0(arrayList, lVar.invoke(viewInfo).booleanValue() ? g0.l(new ViewInfo(viewInfo.getFileName(), viewInfo.getLineNumber(), viewInfo.getBounds(), viewInfo.getLocation(), arrayList2, viewInfo.getLayoutInfo())) : g0.l(new ViewInfo("<root>", -1, IntRect.Companion.getZero(), null, arrayList2, null)));
        }
        return arrayList;
    }

    public static /* synthetic */ List filterTree$default(List list, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<ViewInfo, Boolean>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$filterTree$1
                @Override // x00.l
                public final Boolean invoke(ViewInfo viewInfo) {
                    return Boolean.TRUE;
                }
            };
        }
        return filterTree(list, lVar);
    }

    @k
    public static final String toDebugString(@k List<ViewInfo> list, int i11, @k l<? super ViewInfo, Boolean> lVar) {
        String v22 = f0.v2(".", i11);
        StringBuilder sb2 = new StringBuilder();
        for (ViewInfo viewInfo : r0.z5(filterTree(list, lVar), g.h(new l<ViewInfo, Comparable<?>>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$2
            @Override // x00.l
            public final Comparable<?> invoke(ViewInfo viewInfo2) {
                return viewInfo2.getFileName();
            }
        }, new l<ViewInfo, Comparable<?>>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$3
            @Override // x00.l
            public final Comparable<?> invoke(ViewInfo viewInfo2) {
                return Integer.valueOf(viewInfo2.getLineNumber());
            }
        }, new l<ViewInfo, Comparable<?>>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$4
            @Override // x00.l
            public final Comparable<?> invoke(ViewInfo viewInfo2) {
                return Integer.valueOf(viewInfo2.allChildren().size());
            }
        }))) {
            if (viewInfo.getLocation() != null) {
                sb2.append(v22 + '|' + viewInfo.getFileName() + ':' + viewInfo.getLineNumber());
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
                sb2.append('\n');
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
            } else {
                sb2.append(v22 + "|<root>");
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
                sb2.append('\n');
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
            }
            String obj = k0.b6(toDebugString(viewInfo.getChildren(), i11 + 1, lVar)).toString();
            if (obj.length() > 0) {
                sb2.append(obj);
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
                sb2.append('\n');
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String toDebugString$default(List list, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            lVar = new l<ViewInfo, Boolean>() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$toDebugString$1
                @Override // x00.l
                public final Boolean invoke(ViewInfo viewInfo) {
                    return Boolean.TRUE;
                }
            };
        }
        return toDebugString(list, i11, lVar);
    }
}
