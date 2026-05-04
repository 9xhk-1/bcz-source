package androidx.compose.ui.window;

import a00.h0;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,957:1\n150#2,3:958\n34#2,6:961\n153#2:967\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n*L\n443#1:958,3\n443#1:961,6\n443#1:967\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return g2.f100423a;
                }
            }, 4, null);
        }
        if (size == 1) {
            final Placeable mo3857measureBRTryo0 = list.get(0).mo3857measureBRTryo0(j11);
            return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.2
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            Placeable mo3857measureBRTryo02 = list.get(i13).mo3857measureBRTryo0(j11);
            i11 = Math.max(i11, mo3857measureBRTryo02.getWidth());
            i12 = Math.max(i12, mo3857measureBRTryo02.getHeight());
            arrayList.add(mo3857measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, i11, i12, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                int L = h0.L(arrayList);
                if (L < 0) {
                    return;
                }
                int i14 = 0;
                while (true) {
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, arrayList.get(i14), 0, 0, 0.0f, 4, null);
                    if (i14 == L) {
                        return;
                    }
                    i14++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
