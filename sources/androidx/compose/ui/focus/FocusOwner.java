package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m2166dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i11 & 2) != 0) {
            aVar = new a<Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.mo2169dispatchKeyEventYhN2O0w(keyEvent, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner focusOwner, RotaryScrollEvent rotaryScrollEvent, a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
        }
        if ((i11 & 2) != 0) {
            aVar = new a<Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchRotaryEvent$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, aVar);
    }

    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo2167clearFocusI7lrPNg(boolean z11, boolean z12, boolean z13, int i11);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo2168dispatchInterceptedSoftKeyboardEventZmokQxo(@k KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo2169dispatchKeyEventYhN2O0w(@k KeyEvent keyEvent, @k a<Boolean> aVar);

    boolean dispatchRotaryEvent(@k RotaryScrollEvent rotaryScrollEvent, @k a<Boolean> aVar);

    @l
    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo2170focusSearchULY8qGw(int i11, @l Rect rect, @k x00.l<? super FocusTargetNode, Boolean> lVar);

    @l
    FocusTargetNode getActiveFocusTargetNode();

    @l
    Rect getFocusRect();

    @k
    FocusTransactionManager getFocusTransactionManager();

    @k
    MutableObjectList<FocusListener> getListeners();

    @k
    Modifier getModifier();

    @k
    FocusState getRootState();

    boolean isFocusCaptured();

    void releaseFocus();

    /* renamed from: requestFocusForOwner-7o62pno, reason: not valid java name */
    boolean mo2171requestFocusForOwner7o62pno(@l FocusDirection focusDirection, @l Rect rect);

    void scheduleInvalidation(@k FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(@k FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(@k FocusTargetNode focusTargetNode);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(@l FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z11);

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo2172takeFocusaToIllA(int i11, @l Rect rect);
}
