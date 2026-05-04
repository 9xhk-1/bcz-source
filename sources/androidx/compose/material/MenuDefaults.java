package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,388:1\n149#2:389\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuDefaults\n*L\n264#1:389\n*E\n"})
/* loaded from: classes.dex */
public final class MenuDefaults {
    public static final int $stable = 0;

    @k
    private static final PaddingValues DropdownMenuItemContentPadding;

    @k
    public static final MenuDefaults INSTANCE = new MenuDefaults();

    static {
        float f11;
        f11 = MenuKt.DropdownMenuItemHorizontalPadding;
        DropdownMenuItemContentPadding = PaddingKt.m720PaddingValuesYgX7TsA(f11, Dp.m5115constructorimpl(0));
    }

    private MenuDefaults() {
    }

    @k
    public final PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }
}
