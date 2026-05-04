package androidx.compose.material.internal;

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
@u0({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,459:1\n151#2,3:460\n33#2,4:463\n154#2,2:467\n38#2:469\n156#2:470\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n*L\n184#1:460,3\n184#1:463,4\n184#1:467,2\n184#1:469\n184#1:470\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopup_androidKt$SimpleStack$1 INSTANCE = new ExposedDropdownMenuPopup_androidKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
        int i11;
        int i12;
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.1
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
        int i13 = 0;
        if (size == 1) {
            final Placeable mo3857measureBRTryo0 = list.get(0).mo3857measureBRTryo0(j11);
            return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.2
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
        for (int i14 = 0; i14 < size2; i14++) {
            arrayList.add(list.get(i14).mo3857measureBRTryo0(j11));
        }
        int L = h0.L(arrayList);
        if (L >= 0) {
            int i15 = 0;
            int i16 = 0;
            while (true) {
                Placeable placeable = (Placeable) arrayList.get(i13);
                i15 = Math.max(i15, placeable.getWidth());
                i16 = Math.max(i16, placeable.getHeight());
                if (i13 == L) {
                    break;
                }
                i13++;
            }
            i11 = i15;
            i12 = i16;
        } else {
            i11 = 0;
            i12 = 0;
        }
        return MeasureScope.layout$default(measureScope, i11, i12, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.3
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
                int L2 = h0.L(arrayList);
                if (L2 < 0) {
                    return;
                }
                int i17 = 0;
                while (true) {
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, arrayList.get(i17), 0, 0, 0.0f, 4, null);
                    if (i17 == L2) {
                        return;
                    }
                    i17++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
