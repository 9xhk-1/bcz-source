package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,220:1\n110#2:221\n110#2:222\n110#2:223\n110#2:224\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n52#1:221\n80#1:222\n106#1:223\n128#1:224\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    @Stable
    @m80.k
    public static final Modifier windowInsetsBottomHeight(@m80.k Modifier modifier, @m80.k final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsBottomHeight");
                inspectorInfo.getProperties().set("insets", WindowInsets.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new p<WindowInsets, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$2
            @Override // x00.p
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getBottom(density));
            }
        }));
    }

    @Stable
    @m80.k
    public static final Modifier windowInsetsEndWidth(@m80.k Modifier modifier, @m80.k final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsEndWidth");
                inspectorInfo.getProperties().set("insets", WindowInsets.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<WindowInsets, LayoutDirection, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$2
            @Override // x00.q
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Rtl ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    @m80.k
    public static final Modifier windowInsetsStartWidth(@m80.k Modifier modifier, @m80.k final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsStartWidth");
                inspectorInfo.getProperties().set("insets", WindowInsets.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<WindowInsets, LayoutDirection, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$2
            @Override // x00.q
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Ltr ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    @m80.k
    public static final Modifier windowInsetsTopHeight(@m80.k Modifier modifier, @m80.k final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsTopHeight");
                inspectorInfo.getProperties().set("insets", WindowInsets.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new p<WindowInsets, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$2
            @Override // x00.p
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getTop(density));
            }
        }));
    }
}
