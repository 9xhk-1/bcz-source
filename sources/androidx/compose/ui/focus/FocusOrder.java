package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Use FocusProperties instead")
/* loaded from: classes.dex */
public final class FocusOrder {
    public static final int $stable = 8;

    @k
    private final FocusProperties focusProperties;

    public FocusOrder(@k FocusProperties focusProperties) {
        this.focusProperties = focusProperties;
    }

    @k
    public final FocusRequester getDown() {
        return this.focusProperties.getDown();
    }

    @k
    public final FocusRequester getEnd() {
        return this.focusProperties.getEnd();
    }

    @k
    public final FocusRequester getLeft() {
        return this.focusProperties.getLeft();
    }

    @k
    public final FocusRequester getNext() {
        return this.focusProperties.getNext();
    }

    @k
    public final FocusRequester getPrevious() {
        return this.focusProperties.getPrevious();
    }

    @k
    public final FocusRequester getRight() {
        return this.focusProperties.getRight();
    }

    @k
    public final FocusRequester getStart() {
        return this.focusProperties.getStart();
    }

    @k
    public final FocusRequester getUp() {
        return this.focusProperties.getUp();
    }

    public final void setDown(@k FocusRequester focusRequester) {
        this.focusProperties.setDown(focusRequester);
    }

    public final void setEnd(@k FocusRequester focusRequester) {
        this.focusProperties.setEnd(focusRequester);
    }

    public final void setLeft(@k FocusRequester focusRequester) {
        this.focusProperties.setLeft(focusRequester);
    }

    public final void setNext(@k FocusRequester focusRequester) {
        this.focusProperties.setNext(focusRequester);
    }

    public final void setPrevious(@k FocusRequester focusRequester) {
        this.focusProperties.setPrevious(focusRequester);
    }

    public final void setRight(@k FocusRequester focusRequester) {
        this.focusProperties.setRight(focusRequester);
    }

    public final void setStart(@k FocusRequester focusRequester) {
        this.focusProperties.setStart(focusRequester);
    }

    public final void setUp(@k FocusRequester focusRequester) {
        this.focusProperties.setUp(focusRequester);
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }
}
