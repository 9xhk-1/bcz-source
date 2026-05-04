package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,407:1\n76#2,7:408\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n*L\n384#1:408,7\n*E\n"})
/* loaded from: classes2.dex */
final class CanFocusChecker implements FocusProperties {

    @k
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();

    @l
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z11) {
        canFocusValue = Boolean.valueOf(z11);
    }
}
