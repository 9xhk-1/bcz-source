package androidx.compose.ui.tooling;

import a00.h0;
import a00.i0;
import a00.m0;
import androidx.compose.ui.layout.LayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import q30.k0;
import x00.l;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,115:1\n1549#2:116\n1620#2,3:117\n1373#2:120\n1461#2,5:121\n1549#2:126\n1620#2,3:127\n766#2:130\n857#2,2:131\n1477#2:133\n1502#2,3:134\n1505#2,3:144\n1855#2,2:147\n1549#2:149\n1620#2,3:150\n372#3,7:137\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n*L\n75#1:116\n75#1:117,3\n81#1:120\n81#1:121,5\n82#1:126\n82#1:127,3\n83#1:130\n83#1:131,2\n84#1:133\n84#1:134,3\n84#1:144,3\n89#1:147,2\n111#1:149\n111#1:150,3\n84#1:137,7\n*E\n"})
/* loaded from: classes2.dex */
public final class ShadowViewInfo_androidKt {
    @k
    public static final List<ViewInfo> stitchTrees(@k List<ViewInfo> list) {
        if (list.size() < 2) {
            return list;
        }
        List<ViewInfo> list2 = list;
        ArrayList<ShadowViewInfo> arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShadowViewInfo((ViewInfo) it.next()));
        }
        ArrayList<ShadowViewInfo> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m0.t0(arrayList2, ((ShadowViewInfo) it2.next()).getAllNodes());
        }
        ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
        for (ShadowViewInfo shadowViewInfo : arrayList2) {
            arrayList3.add(h1.a(shadowViewInfo.getLayoutInfo(), shadowViewInfo));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Pair) obj).getFirst() != null) {
                arrayList4.add(obj);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            LayoutInfo layoutInfo = (LayoutInfo) ((Pair) obj2).getFirst();
            Object obj3 = linkedHashMap.get(layoutInfo);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(layoutInfo, obj3);
            }
            ((List) obj3).add(obj2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        for (final ShadowViewInfo shadowViewInfo2 : arrayList) {
            ShadowViewInfo shadowViewInfo3 = (ShadowViewInfo) k0.i1(k0.N1(k0.P0(k0.p1(shadowViewInfo2.getAllNodes(), new l<ShadowViewInfo, List<? extends Pair<? extends LayoutInfo, ? extends ShadowViewInfo>>>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final List<Pair<LayoutInfo, ShadowViewInfo>> invoke(ShadowViewInfo shadowViewInfo4) {
                    Map<LayoutInfo, List<Pair<LayoutInfo, ShadowViewInfo>>> map = linkedHashMap;
                    LayoutInfo layoutInfo2 = shadowViewInfo4.getLayoutInfo();
                    List<Pair<LayoutInfo, ShadowViewInfo>> list3 = map.get(layoutInfo2 != null ? layoutInfo2.getParentInfo() : null);
                    return list3 == null ? h0.J() : list3;
                }
            }), new l<Pair<? extends LayoutInfo, ? extends ShadowViewInfo>, Boolean>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$2
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends LayoutInfo, ? extends ShadowViewInfo> pair) {
                    return invoke2((Pair<? extends LayoutInfo, ShadowViewInfo>) pair);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Boolean invoke2(Pair<? extends LayoutInfo, ShadowViewInfo> pair) {
                    return Boolean.valueOf(!g0.g(pair.getSecond().findRoot(), ShadowViewInfo.this));
                }
            }), new l<Pair<? extends LayoutInfo, ? extends ShadowViewInfo>, ShadowViewInfo>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final ShadowViewInfo invoke2(Pair<? extends LayoutInfo, ShadowViewInfo> pair) {
                    return pair.component2();
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ ShadowViewInfo invoke(Pair<? extends LayoutInfo, ? extends ShadowViewInfo> pair) {
                    return invoke2((Pair<? extends LayoutInfo, ShadowViewInfo>) pair);
                }
            }));
            if (shadowViewInfo3 != null) {
                shadowViewInfo2.setNewParent(shadowViewInfo3);
                linkedHashSet.remove(shadowViewInfo2);
            }
        }
        ArrayList arrayList5 = new ArrayList(i0.d0(linkedHashSet, 10));
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((ShadowViewInfo) it3.next()).toViewInfo());
        }
        return arrayList5;
    }
}
