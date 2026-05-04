package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.u0({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements x00.p<c40.r0, j00.c<?>, Object> {
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextLayoutState $layoutState;
    final /* synthetic */ x00.l<ImeAction, g2> $onImeAction;
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    final /* synthetic */ TransformedTextFieldState $state;
    final /* synthetic */ kotlinx.coroutines.flow.x<g2> $stylusHandwritingTrigger;
    final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
    final /* synthetic */ x00.a<g2> $updateSelectionState;
    final /* synthetic */ ViewConfiguration $viewConfiguration;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ TransformedTextFieldState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$state = transformedTextFieldState;
            this.$composeImm = composeInputMethodManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z11) {
            long m1189getSelectiond9O1mEE = textFieldCharSequence.m1189getSelectiond9O1mEE();
            TextRange m1188getCompositionMzsxiRA = textFieldCharSequence.m1188getCompositionMzsxiRA();
            long m1189getSelectiond9O1mEE2 = textFieldCharSequence2.m1189getSelectiond9O1mEE();
            TextRange m1188getCompositionMzsxiRA2 = textFieldCharSequence2.m1188getCompositionMzsxiRA();
            if (z11) {
                composeInputMethodManager.restartInput();
            } else {
                if (TextRange.m4552equalsimpl0(m1189getSelectiond9O1mEE, m1189getSelectiond9O1mEE2) && kotlin.jvm.internal.g0.g(m1188getCompositionMzsxiRA, m1188getCompositionMzsxiRA2)) {
                    return;
                }
                composeInputMethodManager.updateSelection(TextRange.m4557getMinimpl(m1189getSelectiond9O1mEE2), TextRange.m4556getMaximpl(m1189getSelectiond9O1mEE2), m1188getCompositionMzsxiRA2 != null ? TextRange.m4557getMinimpl(m1188getCompositionMzsxiRA2.m4563unboximpl()) : -1, m1188getCompositionMzsxiRA2 != null ? TextRange.m4556getMaximpl(m1188getCompositionMzsxiRA2.m4563unboximpl()) : -1);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.$state, this.$composeImm, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                TransformedTextFieldState transformedTextFieldState = this.$state;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                TextFieldState.NotifyImeListener notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.b
                    @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                    public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z11) {
                        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1.invokeSuspend$lambda$0(ComposeInputMethodManager.this, textFieldCharSequence, textFieldCharSequence2, z11);
                    }
                };
                this.label = 1;
                if (transformedTextFieldState.collectImeNotifications(notifyImeListener, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(kotlinx.coroutines.flow.x<g2> xVar, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, x00.l<? super ImeAction, g2> lVar, x00.a<g2> aVar, ViewConfiguration viewConfiguration, j00.c<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3> cVar) {
        super(2, cVar);
        this.$stylusHandwritingTrigger = xVar;
        this.$state = transformedTextFieldState;
        this.$layoutState = textLayoutState;
        this.$composeImm = composeInputMethodManager;
        this.$this_platformSpecificTextInputSession = platformTextInputSession;
        this.$imeOptions = imeOptions;
        this.$receiveContentConfiguration = receiveContentConfiguration;
        this.$onImeAction = lVar;
        this.$updateSelectionState = aVar;
        this.$viewConfiguration = viewConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection invokeSuspend$lambda$2(final TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, x00.l lVar, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, x00.a aVar, ViewConfiguration viewConfiguration, EditorInfo editorInfo) {
        AndroidTextInputSession_androidKt.logDebug$default(null, new x00.a<String>() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1
            {
                super(0);
            }

            @Override // x00.a
            public final String invoke() {
                return "createInputConnection(value=\"" + ((Object) TransformedTextFieldState.this.getVisualText()) + "\")";
            }
        }, 1, null);
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(new DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, lVar, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, aVar, viewConfiguration);
        EditorInfo_androidKt.m1229updatepLxbY9I(editorInfo, transformedTextFieldState.getVisualText(), transformedTextFieldState.getVisualText().m1189getSelectiond9O1mEE(), imeOptions, receiveContentConfiguration != null ? AndroidTextInputSession_androidKt.ALL_MIME_TYPES : null);
        return new StatelessInputConnection(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, editorInfo);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, cVar);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<?> cVar) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            c40.r0 r0Var = (c40.r0) this.L$0;
            c40.k.f(r0Var, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.$state, this.$composeImm, null), 1, null);
            kotlinx.coroutines.flow.x<g2> xVar = this.$stylusHandwritingTrigger;
            if (xVar != null) {
                c40.k.f(r0Var, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(xVar, this.$composeImm, null), 3, null);
            }
            final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.$state, this.$layoutState, this.$composeImm, r0Var);
            PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
            final TransformedTextFieldState transformedTextFieldState = this.$state;
            final ImeOptions imeOptions = this.$imeOptions;
            final ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
            final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
            final x00.l<ImeAction, g2> lVar = this.$onImeAction;
            final TextLayoutState textLayoutState = this.$layoutState;
            final x00.a<g2> aVar = this.$updateSelectionState;
            final ViewConfiguration viewConfiguration = this.$viewConfiguration;
            PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.a
                @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                public final InputConnection createInputConnection(EditorInfo editorInfo) {
                    InputConnection invokeSuspend$lambda$2;
                    invokeSuspend$lambda$2 = AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.invokeSuspend$lambda$2(TransformedTextFieldState.this, imeOptions, receiveContentConfiguration, composeInputMethodManager, lVar, cursorAnchorInfoController, textLayoutState, aVar, viewConfiguration, editorInfo);
                    return invokeSuspend$lambda$2;
                }
            };
            this.label = 1;
            if (platformTextInputSession.startInputMethod(platformTextInputMethodRequest, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
