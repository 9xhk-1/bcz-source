package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.alipay.sdk.m.x.d;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FocusProperties {
    boolean getCanFocus();

    @k
    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    @k
    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @ExperimentalComposeUiApi
    @k
    default l<FocusDirection, FocusRequester> getEnter() {
        return new l<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m2177invoke3ESFkO8(focusDirection.m2155unboximpl());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m2177invoke3ESFkO8(int i11) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    @ExperimentalComposeUiApi
    @k
    default l<FocusDirection, FocusRequester> getExit() {
        return new l<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m2178invoke3ESFkO8(focusDirection.m2155unboximpl());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m2178invoke3ESFkO8(int i11) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    @k
    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    @k
    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    @k
    default l<FocusEnterExitScope, g2> getOnEnter() {
        return new l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.focus.FocusProperties$onEnter$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
                invoke2(focusEnterExitScope);
                return g2.f100423a;
            }
        };
    }

    @k
    default l<FocusEnterExitScope, g2> getOnExit() {
        return new l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.focus.FocusProperties$onExit$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
                invoke2(focusEnterExitScope);
                return g2.f100423a;
            }
        };
    }

    @k
    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    @k
    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    @k
    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    @k
    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    void setCanFocus(boolean z11);

    @ExperimentalComposeUiApi
    @n(message = "Use onEnter instead", replaceWith = @w0(expression = "onEnter", imports = {}))
    default void setEnter(@k l<? super FocusDirection, FocusRequester> lVar) {
        l<? super FocusEnterExitScope, g2> usingEnterExitScope;
        usingEnterExitScope = FocusPropertiesKt.toUsingEnterExitScope(lVar);
        setOnEnter(usingEnterExitScope);
    }

    @ExperimentalComposeUiApi
    @n(message = "Use onExit instead", replaceWith = @w0(expression = d.f11172r, imports = {}))
    default void setExit(@k l<? super FocusDirection, FocusRequester> lVar) {
        l<? super FocusEnterExitScope, g2> usingEnterExitScope;
        usingEnterExitScope = FocusPropertiesKt.toUsingEnterExitScope(lVar);
        setOnExit(usingEnterExitScope);
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getExit$annotations() {
    }

    default void setDown(@k FocusRequester focusRequester) {
    }

    default void setEnd(@k FocusRequester focusRequester) {
    }

    default void setLeft(@k FocusRequester focusRequester) {
    }

    default void setNext(@k FocusRequester focusRequester) {
    }

    default void setOnEnter(@k l<? super FocusEnterExitScope, g2> lVar) {
    }

    default void setOnExit(@k l<? super FocusEnterExitScope, g2> lVar) {
    }

    default void setPrevious(@k FocusRequester focusRequester) {
    }

    default void setRight(@k FocusRequester focusRequester) {
    }

    default void setStart(@k FocusRequester focusRequester) {
    }

    default void setUp(@k FocusRequester focusRequester) {
    }
}
