package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.TransitionParser;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class TransitionImpl implements Transition {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final TransitionImpl EMPTY = new TransitionImpl(new CLObject(new char[0]));

    @k
    private final CLObject parsedTransition;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TransitionImpl getEMPTY$constraintlayout_compose_release() {
            return TransitionImpl.EMPTY;
        }

        private Companion() {
        }
    }

    public TransitionImpl(@k CLObject cLObject) {
        this.parsedTransition = cLObject;
    }

    public final void applyAllTo(@k androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.parse(this.parsedTransition, transition);
        } catch (CLParsingException e11) {
            Log.e("CML", "Error parsing JSON " + e11);
        }
    }

    public final void applyKeyFramesTo(@k androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.parseKeyFrames(this.parsedTransition, transition);
        } catch (CLParsingException e11) {
            Log.e("CML", "Error parsing JSON " + e11);
        }
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(TransitionImpl.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.TransitionImpl");
        return g0.g(this.parsedTransition, ((TransitionImpl) obj).parsedTransition);
    }

    @Override // androidx.constraintlayout.compose.Transition
    @k
    public String getEndConstraintSetId() {
        String stringOrNull = this.parsedTransition.getStringOrNull("to");
        return stringOrNull == null ? TtmlNode.END : stringOrNull;
    }

    @Override // androidx.constraintlayout.compose.Transition
    @k
    public String getStartConstraintSetId() {
        String stringOrNull = this.parsedTransition.getStringOrNull("from");
        return stringOrNull == null ? TtmlNode.START : stringOrNull;
    }

    public int hashCode() {
        return this.parsedTransition.hashCode();
    }
}
