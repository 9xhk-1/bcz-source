package mg;

import com.baicizhan.main.home.plan.data.LearningState;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f {
    public static final boolean a(@l LearningState learningState) {
        return learningState == LearningState.ALL_DONE || learningState == LearningState.DONE;
    }

    public static final boolean b(@l LearningState learningState) {
        if (learningState == LearningState.ALL_DONE) {
            return true;
        }
        if (learningState == null) {
            learningState = LearningState.UNAVAILABLE;
        }
        return learningState.compareTo(LearningState.DONE) >= 0;
    }

    @k
    public static final LearningState c(@k Triple<? extends LearningState, ? extends LearningState, ? extends LearningState> triple) {
        g0.p(triple, "<this>");
        return triple.getFirst();
    }

    @k
    public static final LearningState d(@k Triple<? extends LearningState, ? extends LearningState, ? extends LearningState> triple) {
        g0.p(triple, "<this>");
        return triple.getSecond();
    }

    @k
    public static final LearningState e(@k Triple<? extends LearningState, ? extends LearningState, ? extends LearningState> triple) {
        g0.p(triple, "<this>");
        return triple.getThird();
    }
}
