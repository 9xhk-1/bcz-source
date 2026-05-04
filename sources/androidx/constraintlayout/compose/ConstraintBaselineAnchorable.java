package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ConstraintBaselineAnchorable implements BaselineAnchorable {

    @k
    private final CLObject containerObject;

    public ConstraintBaselineAnchorable(@k CLObject cLObject) {
        this.containerObject = cLObject;
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* renamed from: linkTo-VpY3zN4 */
    public void mo5378linkToVpY3zN4(@k ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f11, float f12) {
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(baselineAnchor.getId$constraintlayout_compose_release().toString()));
        cLArray.add(CLString.from("baseline"));
        cLArray.add(new CLNumber(f11));
        cLArray.add(new CLNumber(f12));
        this.containerObject.put("baseline", cLArray);
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* renamed from: linkTo-VpY3zN4 */
    public void mo5379linkToVpY3zN4(@k ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f11, float f12) {
        String horizontalAnchorIndexToAnchorName = AnchorFunctions.INSTANCE.horizontalAnchorIndexToAnchorName(horizontalAnchor.getIndex$constraintlayout_compose_release());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(horizontalAnchor.getId$constraintlayout_compose_release().toString()));
        cLArray.add(CLString.from(horizontalAnchorIndexToAnchorName));
        cLArray.add(new CLNumber(f11));
        cLArray.add(new CLNumber(f12));
        this.containerObject.put("baseline", cLArray);
    }
}
