package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class BaseVerticalAnchorable implements VerticalAnchorable {
    public static final int $stable = 8;

    @k
    private final String anchorName;

    @k
    private final CLObject containerObject;

    public BaseVerticalAnchorable(@k CLObject cLObject, int i11) {
        this.containerObject = cLObject;
        this.anchorName = AnchorFunctions.INSTANCE.verticalAnchorIndexToAnchorName(i11);
    }

    @Override // androidx.constraintlayout.compose.VerticalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo5375linkToVpY3zN4(@k ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f11, float f12) {
        String verticalAnchorIndexToAnchorName = AnchorFunctions.INSTANCE.verticalAnchorIndexToAnchorName(verticalAnchor.getIndex$constraintlayout_compose_release());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(verticalAnchor.getId$constraintlayout_compose_release().toString()));
        cLArray.add(CLString.from(verticalAnchorIndexToAnchorName));
        cLArray.add(new CLNumber(f11));
        cLArray.add(new CLNumber(f12));
        this.containerObject.put(this.anchorName, cLArray);
    }
}
