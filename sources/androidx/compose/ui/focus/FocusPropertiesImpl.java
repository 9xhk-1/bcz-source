package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;

    @k
    private FocusRequester down;

    @k
    private FocusRequester end;

    @k
    private FocusRequester left;

    @k
    private FocusRequester next;

    @k
    private l<? super FocusEnterExitScope, g2> onEnter;

    @k
    private l<? super FocusEnterExitScope, g2> onExit;

    @k
    private FocusRequester previous;

    @k
    private FocusRequester right;

    @k
    private FocusRequester start;

    /* renamed from: up, reason: collision with root package name */
    @k
    private FocusRequester f4144up;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.Companion;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.f4144up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.onEnter = new l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
                invoke2(focusEnterExitScope);
                return g2.f100423a;
            }
        };
        this.onExit = new l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
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

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public l<FocusEnterExitScope, g2> getOnEnter() {
        return this.onEnter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public l<FocusEnterExitScope, g2> getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @k
    public FocusRequester getUp() {
        return this.f4144up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z11) {
        this.canFocus = z11;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setDown(@k FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnd(@k FocusRequester focusRequester) {
        this.end = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setLeft(@k FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setNext(@k FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setOnEnter(@k l<? super FocusEnterExitScope, g2> lVar) {
        this.onEnter = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setOnExit(@k l<? super FocusEnterExitScope, g2> lVar) {
        this.onExit = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setPrevious(@k FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setRight(@k FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setStart(@k FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setUp(@k FocusRequester focusRequester) {
        this.f4144up = focusRequester;
    }
}
