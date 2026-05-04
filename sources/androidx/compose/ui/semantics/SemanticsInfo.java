package androidx.compose.ui.semantics;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface SemanticsInfo extends LayoutInfo {
    @k
    List<SemanticsInfo> getChildrenInfo();

    @Override // androidx.compose.ui.layout.LayoutInfo
    @l
    SemanticsInfo getParentInfo();

    @l
    SemanticsConfiguration getSemanticsConfiguration();

    boolean isTransparent();
}
