package z5;

import com.baicizhan.app.biz.game.model.StudyStage;
import f4.w2;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStudyRecordEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordEx.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f100848a = "StudyRecordEx";

    public static final boolean a(@m80.k w2 w2Var, long j11) {
        g0.p(w2Var, "<this>");
        return (!i(w2Var, j11) || e(w2Var) || f(w2Var) || r(w2Var)) ? false : true;
    }

    public static final boolean b(@m80.k w2 w2Var, @m80.k Set<Long> spellSet) {
        g0.p(w2Var, "<this>");
        g0.p(spellSet, "spellSet");
        return spellSet.contains(Long.valueOf(w2Var.q())) && o(w2Var) && !e(w2Var);
    }

    public static final boolean c(@m80.k w2 w2Var, long j11) {
        Object m6308constructorimpl;
        g0.p(w2Var, "<this>");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(Boolean.valueOf(w3.g.i(w2Var.o(), j11) >= 0));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            z6.b.f(z6.b.f101032b, f100848a, "time not legal " + w2Var, null, 4, null);
            m6308constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) m6308constructorimpl).booleanValue();
    }

    public static final boolean d(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.p() >= StudyStage.NewLearningCompleted.getValue() && w2Var.p() <= StudyStage.SpellCompleted.getValue();
    }

    public static final boolean e(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.r() != 0;
    }

    public static final boolean f(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.l() >= 100;
    }

    public static final boolean g(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.p() == StudyStage.NewLearningCompleted.getValue();
    }

    public static final boolean h(@m80.k w2 w2Var, long j11) {
        g0.p(w2Var, "<this>");
        return g(w2Var) && p(w2Var, j11);
    }

    public static final boolean i(@m80.k w2 w2Var, long j11) {
        g0.p(w2Var, "<this>");
        return w2Var.n() != j11;
    }

    public static final boolean j(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.p() == StudyStage.Reviewing.getValue();
    }

    public static final boolean k(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.p() == StudyStage.SpellCompleted.getValue();
    }

    public static final boolean l(@m80.k w2 w2Var, long j11) {
        g0.p(w2Var, "<this>");
        return k(w2Var) && p(w2Var, j11);
    }

    public static final boolean m(@m80.k w2 w2Var, long j11) {
        g0.p(w2Var, "<this>");
        return n(w2Var) && p(w2Var, j11);
    }

    public static final boolean n(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.p() == StudyStage.SpellLearning.getValue();
    }

    public static final boolean o(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.p() == StudyStage.SpellSkipped.getValue();
    }

    public static final boolean p(@m80.k w2 w2Var, long j11) {
        g0.p(w2Var, "<this>");
        return w2Var.n() == j11;
    }

    public static final boolean q(@m80.k w2 w2Var, long j11) {
        Object m6308constructorimpl;
        g0.p(w2Var, "<this>");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(Boolean.valueOf(p(w2Var, j11) && j(w2Var)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            m6308constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) m6308constructorimpl).booleanValue();
    }

    public static final boolean r(@m80.k w2 w2Var) {
        g0.p(w2Var, "<this>");
        return w2Var.p() == StudyStage.UnLeaning.getValue();
    }
}
