package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l80.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {
    public static final int $stable = 0;
    private boolean _isDirty;

    @l
    private final ConstraintSet extendFrom;

    @l
    private final String overrideVariables;

    @k
    private final HashMap<String, Float> overridedVariables;

    public /* synthetic */ JSONConstraintSet(String str, String str2, ConstraintSet constraintSet, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : constraintSet);
    }

    private final void applyLayoutVariables(ConstraintSetParser.LayoutVariables layoutVariables) {
        String str = this.overrideVariables;
        if (str != null) {
            try {
                CLObject parse = CLParser.parse(str);
                int size = parse.size();
                for (int i11 = 0; i11 < size; i11++) {
                    CLElement cLElement = parse.get(i11);
                    g0.n(cLElement, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                    CLKey cLKey = (CLKey) cLElement;
                    layoutVariables.putOverride(cLKey.content(), cLKey.getValue().getFloat());
                }
            } catch (CLParsingException e11) {
                System.err.println("exception: " + e11);
            }
        }
        for (String str2 : this.overridedVariables.keySet()) {
            Float f11 = this.overridedVariables.get(str2);
            g0.m(f11);
            layoutVariables.putOverride(str2, f11.floatValue());
        }
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@k androidx.constraintlayout.core.state.Transition transition, int i11) {
        applyLayoutVariables(new ConstraintSetParser.LayoutVariables());
        ConstraintSetParser.parseJSON(getCurrentContent(), transition, i11);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@k State state) {
        ConstraintSetParser.LayoutVariables layoutVariables = new ConstraintSetParser.LayoutVariables();
        applyLayoutVariables(layoutVariables);
        try {
            ConstraintSetParser.parseJSON(getCurrentContent(), state, layoutVariables);
            this._isDirty = false;
        } catch (Exception unused) {
            this._isDirty = true;
        }
    }

    public final void emitDesignElements(@k ArrayList<ConstraintSetParser.DesignElement> arrayList) {
        try {
            arrayList.clear();
            ConstraintSetParser.parseDesignElementsJSON(getCurrentContent(), arrayList);
        } catch (Exception unused) {
        }
    }

    public boolean equals(@l Object obj) {
        if (obj instanceof JSONConstraintSet) {
            return g0.g(getCurrentContent(), ((JSONConstraintSet) obj).getCurrentContent());
        }
        return false;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    @l
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public float getForcedProgress() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@k List<? extends Measurable> list) {
        return this._isDirty;
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(@k String str) {
        super.onNewContent(str);
        this._isDirty = true;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    @k
    public ConstraintSet override(@k String str, float f11) {
        this.overridedVariables.put(str, Float.valueOf(f11));
        return this;
    }

    public JSONConstraintSet(@d("json5") @k String str, @l @d("json5") String str2, @l ConstraintSet constraintSet) {
        super(str);
        this.extendFrom = constraintSet;
        this.overridedVariables = new HashMap<>();
        this.overrideVariables = str2;
        this._isDirty = true;
        initialization();
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void resetForcedProgress() {
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void onNewProgress(float f11) {
    }
}
