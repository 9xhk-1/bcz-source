package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    default long mo1175getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m4213getNoneRZrCHBk();
    }

    default boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    void onCancelPointerInput();

    default void onDensityChange() {
        onCancelPointerInput();
    }

    /* renamed from: onPointerEvent-H0pRuoY */
    void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11);

    default void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    default boolean sharePointerInputWithSiblings() {
        return false;
    }
}
