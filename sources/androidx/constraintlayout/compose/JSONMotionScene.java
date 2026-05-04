package androidx.constraintlayout.compose;

import a00.r0;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import java.util.HashMap;
import kotlin.jvm.internal.u0;
import l80.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
@u0({"SMAP\nMotionScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionScene.kt\nandroidx/constraintlayout/compose/JSONMotionScene\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
/* loaded from: classes2.dex */
public final class JSONMotionScene extends EditableJSONLayout implements MotionScene {
    public static final int $stable = 0;

    @k
    private final HashMap<String, String> constraintSetsContent;
    private float forcedProgress;

    @k
    private final HashMap<String, String> transitionsContent;

    public JSONMotionScene(@d("json5") @k String str) {
        super(str);
        this.constraintSetsContent = new HashMap<>();
        this.transitionsContent = new HashMap<>();
        this.forcedProgress = Float.NaN;
        initialization();
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    @l
    public String getConstraintSet(@k String str) {
        return this.constraintSetsContent.get(str);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    @l
    public ConstraintSet getConstraintSetInstance(@k String str) {
        String constraintSet = getConstraintSet(str);
        if (constraintSet != null) {
            return ConstraintLayoutKt.ConstraintSet(constraintSet);
        }
        return null;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public float getForcedProgress() {
        return this.forcedProgress;
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    @l
    public String getTransition(@k String str) {
        return this.transitionsContent.get(str);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    @l
    public Transition getTransitionInstance(@k String str) {
        CLObject cLObject;
        String transition = getTransition(str);
        if (transition == null) {
            return null;
        }
        try {
            cLObject = CLParser.parse(transition);
        } catch (CLParsingException e11) {
            Log.e("CML", "Error parsing JSON " + e11);
            cLObject = null;
        }
        if (cLObject == null) {
            return null;
        }
        return new TransitionImpl(cLObject);
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(@k String str) {
        super.onNewContent(str);
        try {
            ConstraintSetParser.parseMotionSceneJSON(this, str);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void onNewProgress(float f11) {
        this.forcedProgress = f11;
        signalUpdate();
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void resetForcedProgress() {
        this.forcedProgress = Float.NaN;
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setConstraintSetContent(@k String str, @k String str2) {
        this.constraintSetsContent.put(str, str2);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setTransitionContent(@k String str, @k String str2) {
        this.transitionsContent.put(str, str2);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    @l
    public String getConstraintSet(int i11) {
        return (String) r0.p2(this.constraintSetsContent.values(), i11);
    }
}
