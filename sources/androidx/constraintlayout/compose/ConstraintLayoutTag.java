package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
final class ConstraintLayoutTag extends InspectorValueInfo implements ParentDataModifier, ConstraintLayoutTagParentData {

    @k
    private final String constraintLayoutId;

    @k
    private final String constraintLayoutTag;

    public ConstraintLayoutTag(@k String str, @k String str2, @k l<? super InspectorInfo, g2> lVar) {
        super(lVar);
        this.constraintLayoutTag = str;
        this.constraintLayoutId = str2;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        ConstraintLayoutTag constraintLayoutTag = obj instanceof ConstraintLayoutTag ? (ConstraintLayoutTag) obj : null;
        if (constraintLayoutTag == null) {
            return false;
        }
        return g0.g(getConstraintLayoutTag(), constraintLayoutTag.getConstraintLayoutTag());
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    @k
    public String getConstraintLayoutId() {
        return this.constraintLayoutId;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    @k
    public String getConstraintLayoutTag() {
        return this.constraintLayoutTag;
    }

    public int hashCode() {
        return getConstraintLayoutTag().hashCode();
    }

    @k
    public String toString() {
        return "ConstraintLayoutTag(id=" + getConstraintLayoutTag() + ')';
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @m80.l
    public Object modifyParentData(@k Density density, @m80.l Object obj) {
        return this;
    }
}
