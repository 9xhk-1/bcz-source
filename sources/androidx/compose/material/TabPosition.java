package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,491:1\n51#2:492\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n320#1:492\n*E\n"})
/* loaded from: classes.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f11, float f12, v vVar) {
        this(f11, f12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.m5120equalsimpl0(this.left, tabPosition.left) && Dp.m5120equalsimpl0(this.width, tabPosition.width);
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m1805getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m1806getRightD9Ej5fM() {
        return Dp.m5115constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1807getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m5121hashCodeimpl(this.left) * 31) + Dp.m5121hashCodeimpl(this.width);
    }

    @k
    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m5126toStringimpl(this.left)) + ", right=" + ((Object) Dp.m5126toStringimpl(m1806getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m5126toStringimpl(this.width)) + ')';
    }

    private TabPosition(float f11, float f12) {
        this.left = f11;
        this.width = f12;
    }
}
