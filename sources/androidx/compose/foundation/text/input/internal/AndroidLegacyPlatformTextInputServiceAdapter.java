package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import c40.l2;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nLegacyPlatformTextInputServiceAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1#2:435\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {
    public static final int $stable = 8;

    @m80.l
    private kotlinx.coroutines.flow.x<g2> backingStylusHandwritingTrigger;

    @m80.l
    private LegacyTextInputMethodRequest currentRequest;

    @m80.l
    private l2 job;

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.flow.x<g2> getStylusHandwritingTrigger() {
        kotlinx.coroutines.flow.x<g2> xVar = this.backingStylusHandwritingTrigger;
        if (xVar != null) {
            return xVar;
        }
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return null;
        }
        kotlinx.coroutines.flow.x<g2> b11 = kotlinx.coroutines.flow.e0.b(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.backingStylusHandwritingTrigger = b11;
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInput$localToScreen(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, float[] fArr) {
        LayoutCoordinates layoutCoordinates = legacyPlatformTextInputNode.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates == null) {
                return;
            }
            layoutCoordinates.mo3873transformToScreen58bKbWc(fArr);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(@m80.k Rect rect) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.notifyFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@m80.k final TextFieldValue textFieldValue, @m80.k final ImeOptions imeOptions, @m80.k final x00.l<? super List<? extends EditCommand>, g2> lVar, @m80.k final x00.l<? super ImeAction, g2> lVar2) {
        startInput(new x00.l<LegacyTextInputMethodRequest, g2>() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
                invoke2(legacyTextInputMethodRequest);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
                legacyTextInputMethodRequest.startInput(TextFieldValue.this, this.getTextInputModifierNode(), imeOptions, lVar, lVar2);
            }
        });
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter
    public void startStylusHandwriting() {
        kotlinx.coroutines.flow.x<g2> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.d(g2.f100423a);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        l2 l2Var = this.job;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.job = null;
        kotlinx.coroutines.flow.x<g2> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.c();
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@m80.l TextFieldValue textFieldValue, @m80.k TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.updateState(textFieldValue, textFieldValue2);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(@m80.k TextFieldValue textFieldValue, @m80.k OffsetMapping offsetMapping, @m80.k TextLayoutResult textLayoutResult, @m80.k x00.l<? super Matrix, g2> lVar, @m80.k Rect rect, @m80.k Rect rect2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        startInput(null);
    }

    private final void startInput(x00.l<? super LegacyTextInputMethodRequest, g2> lVar) {
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode textInputModifierNode = getTextInputModifierNode();
        if (textInputModifierNode == null) {
            return;
        }
        this.job = textInputModifierNode.launchTextInputSession(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(lVar, this, textInputModifierNode, null));
    }
}
