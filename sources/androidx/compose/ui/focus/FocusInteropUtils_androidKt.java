package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusInteropUtils_androidKt {
    @k
    public static final Rect calculateBoundingRectRelativeTo(@k View view, @k View view2) {
        FocusInteropUtils.Companion companion = FocusInteropUtils.Companion;
        view.getLocationInWindow(companion.getTempCoordinates());
        int i11 = companion.getTempCoordinates()[0];
        int i12 = companion.getTempCoordinates()[1];
        view2.getLocationInWindow(companion.getTempCoordinates());
        float f11 = i11 - companion.getTempCoordinates()[0];
        float f12 = i12 - companion.getTempCoordinates()[1];
        return new Rect(f11, f12, view.getWidth() + f11, view.getHeight() + f12);
    }

    public static final boolean requestInteropFocus(@k View view, @l Integer num, @l android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    @l
    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m2164toAndroidFocusDirection3ESFkO8(int i11) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2160getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m2152equalsimpl0(i11, companion.m2161getPreviousdhqQ8s()) ? 1 : null;
    }

    @l
    public static final FocusDirection toFocusDirection(int i11) {
        if (i11 == 1) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2161getPreviousdhqQ8s());
        }
        if (i11 == 2) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2160getNextdhqQ8s());
        }
        if (i11 == 17) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2159getLeftdhqQ8s());
        }
        if (i11 == 33) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2163getUpdhqQ8s());
        }
        if (i11 == 66) {
            return FocusDirection.m2149boximpl(FocusDirection.Companion.m2162getRightdhqQ8s());
        }
        if (i11 != 130) {
            return null;
        }
        return FocusDirection.m2149boximpl(FocusDirection.Companion.m2156getDowndhqQ8s());
    }

    @l
    public static final LayoutDirection toLayoutDirection(int i11) {
        if (i11 == 0) {
            return LayoutDirection.Ltr;
        }
        if (i11 != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
