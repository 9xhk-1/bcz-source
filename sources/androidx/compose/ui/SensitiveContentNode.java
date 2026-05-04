package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSensitiveContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensitiveContent.kt\nandroidx/compose/ui/SensitiveContentNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,82:1\n56#2,5:83\n*S KotlinDebug\n*F\n+ 1 SensitiveContent.kt\nandroidx/compose/ui/SensitiveContentNode\n*L\n68#1:83,5\n*E\n"})
/* loaded from: classes.dex */
final class SensitiveContentNode extends Modifier.Node {
    private boolean _isContentSensitive;
    private boolean isContentSensitive;
    private boolean isCountedSensitive;

    public SensitiveContentNode(boolean z11) {
        this._isContentSensitive = z11;
        this.isContentSensitive = z11;
    }

    private final boolean component1() {
        return this._isContentSensitive;
    }

    public static /* synthetic */ SensitiveContentNode copy$default(SensitiveContentNode sensitiveContentNode, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sensitiveContentNode._isContentSensitive;
        }
        return sensitiveContentNode.copy(z11);
    }

    @k
    public final SensitiveContentNode copy(boolean z11) {
        return new SensitiveContentNode(z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveContentNode) && this._isContentSensitive == ((SensitiveContentNode) obj)._isContentSensitive;
    }

    public int hashCode() {
        return Boolean.hashCode(this._isContentSensitive);
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        if (this.isContentSensitive) {
            if (this.isCountedSensitive) {
                InlineClassHelperKt.throwIllegalStateException("invalid sensitive content state");
            }
            DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
            this.isCountedSensitive = true;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (this.isCountedSensitive) {
            DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
            this.isCountedSensitive = false;
        }
        super.onDetach();
    }

    public final void setContentSensitive(boolean z11) {
        this.isContentSensitive = z11;
        if (z11 && !this.isCountedSensitive) {
            DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
            this.isCountedSensitive = true;
        } else {
            if (z11 || !this.isCountedSensitive) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
            this.isCountedSensitive = false;
        }
    }

    @k
    public String toString() {
        return "SensitiveContentNode(_isContentSensitive=" + this._isContentSensitive + ')';
    }
}
