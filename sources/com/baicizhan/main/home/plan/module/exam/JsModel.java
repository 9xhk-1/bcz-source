package com.baicizhan.main.home.plan.module.exam;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public abstract class JsModel {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @Keep
    public static final class AllRemoved extends JsModel {
        public static final int $stable = 0;
        private final boolean isToday;

        @k
        private final Progress progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllRemoved(boolean z11, @k Progress progress) {
            super(null);
            g0.p(progress, "progress");
            this.isToday = z11;
            this.progress = progress;
        }

        public static /* synthetic */ AllRemoved copy$default(AllRemoved allRemoved, boolean z11, Progress progress, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = allRemoved.isToday;
            }
            if ((i11 & 2) != 0) {
                progress = allRemoved.progress;
            }
            return allRemoved.copy(z11, progress);
        }

        public final boolean component1() {
            return this.isToday;
        }

        @k
        public final Progress component2() {
            return this.progress;
        }

        @k
        public final AllRemoved copy(boolean z11, @k Progress progress) {
            g0.p(progress, "progress");
            return new AllRemoved(z11, progress);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllRemoved)) {
                return false;
            }
            AllRemoved allRemoved = (AllRemoved) obj;
            return this.isToday == allRemoved.isToday && g0.g(this.progress, allRemoved.progress);
        }

        @Override // com.baicizhan.main.home.plan.module.exam.JsModel
        @k
        public Progress getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isToday) * 31) + this.progress.hashCode();
        }

        public final boolean isToday() {
            return this.isToday;
        }

        @k
        public String toString() {
            return "AllRemoved(isToday=" + this.isToday + ", progress=" + this.progress + j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @Keep
    public static final class FinishAll extends JsModel {
        public static final int $stable = 0;

        @k
        private final Progress progress;
        private final int round;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishAll(int i11, @k Progress progress) {
            super(null);
            g0.p(progress, "progress");
            this.round = i11;
            this.progress = progress;
        }

        public static /* synthetic */ FinishAll copy$default(FinishAll finishAll, int i11, Progress progress, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = finishAll.round;
            }
            if ((i12 & 2) != 0) {
                progress = finishAll.progress;
            }
            return finishAll.copy(i11, progress);
        }

        public final int component1() {
            return this.round;
        }

        @k
        public final Progress component2() {
            return this.progress;
        }

        @k
        public final FinishAll copy(int i11, @k Progress progress) {
            g0.p(progress, "progress");
            return new FinishAll(i11, progress);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinishAll)) {
                return false;
            }
            FinishAll finishAll = (FinishAll) obj;
            return this.round == finishAll.round && g0.g(this.progress, finishAll.progress);
        }

        @Override // com.baicizhan.main.home.plan.module.exam.JsModel
        @k
        public Progress getProgress() {
            return this.progress;
        }

        public final int getRound() {
            return this.round;
        }

        public int hashCode() {
            return (Integer.hashCode(this.round) * 31) + this.progress.hashCode();
        }

        @k
        public String toString() {
            return "FinishAll(round=" + this.round + ", progress=" + this.progress + j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Learning extends JsModel {
        public static final int $stable = 8;

        @k
        private final List<Action> actions;
        private final boolean canClockIn;
        private final boolean isFinished;
        private final int learnedCount;
        private final int planCount;

        @k
        private final Progress progress;
        private final int reviewedCount;
        private final int reviewingPoolCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Learning(boolean z11, boolean z12, int i11, int i12, int i13, int i14, @k List<Action> actions, @k Progress progress) {
            super(null);
            g0.p(actions, "actions");
            g0.p(progress, "progress");
            this.canClockIn = z11;
            this.isFinished = z12;
            this.planCount = i11;
            this.learnedCount = i12;
            this.reviewingPoolCount = i13;
            this.reviewedCount = i14;
            this.actions = actions;
            this.progress = progress;
        }

        public static /* synthetic */ Learning copy$default(Learning learning, boolean z11, boolean z12, int i11, int i12, int i13, int i14, List list, Progress progress, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z11 = learning.canClockIn;
            }
            if ((i15 & 2) != 0) {
                z12 = learning.isFinished;
            }
            if ((i15 & 4) != 0) {
                i11 = learning.planCount;
            }
            if ((i15 & 8) != 0) {
                i12 = learning.learnedCount;
            }
            if ((i15 & 16) != 0) {
                i13 = learning.reviewingPoolCount;
            }
            if ((i15 & 32) != 0) {
                i14 = learning.reviewedCount;
            }
            if ((i15 & 64) != 0) {
                list = learning.actions;
            }
            if ((i15 & 128) != 0) {
                progress = learning.progress;
            }
            List list2 = list;
            Progress progress2 = progress;
            int i16 = i13;
            int i17 = i14;
            return learning.copy(z11, z12, i11, i12, i16, i17, list2, progress2);
        }

        public final boolean component1() {
            return this.canClockIn;
        }

        public final boolean component2() {
            return this.isFinished;
        }

        public final int component3() {
            return this.planCount;
        }

        public final int component4() {
            return this.learnedCount;
        }

        public final int component5() {
            return this.reviewingPoolCount;
        }

        public final int component6() {
            return this.reviewedCount;
        }

        @k
        public final List<Action> component7() {
            return this.actions;
        }

        @k
        public final Progress component8() {
            return this.progress;
        }

        @k
        public final Learning copy(boolean z11, boolean z12, int i11, int i12, int i13, int i14, @k List<Action> actions, @k Progress progress) {
            g0.p(actions, "actions");
            g0.p(progress, "progress");
            return new Learning(z11, z12, i11, i12, i13, i14, actions, progress);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Learning)) {
                return false;
            }
            Learning learning = (Learning) obj;
            return this.canClockIn == learning.canClockIn && this.isFinished == learning.isFinished && this.planCount == learning.planCount && this.learnedCount == learning.learnedCount && this.reviewingPoolCount == learning.reviewingPoolCount && this.reviewedCount == learning.reviewedCount && g0.g(this.actions, learning.actions) && g0.g(this.progress, learning.progress);
        }

        @k
        public final List<Action> getActions() {
            return this.actions;
        }

        public final boolean getCanClockIn() {
            return this.canClockIn;
        }

        public final int getLearnedCount() {
            return this.learnedCount;
        }

        public final int getPlanCount() {
            return this.planCount;
        }

        @Override // com.baicizhan.main.home.plan.module.exam.JsModel
        @k
        public Progress getProgress() {
            return this.progress;
        }

        public final int getReviewedCount() {
            return this.reviewedCount;
        }

        public final int getReviewingPoolCount() {
            return this.reviewingPoolCount;
        }

        public int hashCode() {
            return (((((((((((((Boolean.hashCode(this.canClockIn) * 31) + Boolean.hashCode(this.isFinished)) * 31) + Integer.hashCode(this.planCount)) * 31) + Integer.hashCode(this.learnedCount)) * 31) + Integer.hashCode(this.reviewingPoolCount)) * 31) + Integer.hashCode(this.reviewedCount)) * 31) + this.actions.hashCode()) * 31) + this.progress.hashCode();
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        @k
        public String toString() {
            return "Learning(canClockIn=" + this.canClockIn + ", isFinished=" + this.isFinished + ", planCount=" + this.planCount + ", learnedCount=" + this.learnedCount + ", reviewingPoolCount=" + this.reviewingPoolCount + ", reviewedCount=" + this.reviewedCount + ", actions=" + this.actions + ", progress=" + this.progress + j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Reviewing extends JsModel {
        public static final int $stable = 8;

        @k
        private final List<Action> actions;
        private final boolean canClockIn;
        private final boolean isFinished;
        private final int learnedCount;
        private final int planCount;

        @k
        private final Progress progress;
        private final int reviewedCount;
        private final int reviewingPoolCount;
        private final int round;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reviewing(boolean z11, boolean z12, int i11, int i12, int i13, int i14, int i15, @k List<Action> actions, @k Progress progress) {
            super(null);
            g0.p(actions, "actions");
            g0.p(progress, "progress");
            this.canClockIn = z11;
            this.isFinished = z12;
            this.planCount = i11;
            this.learnedCount = i12;
            this.reviewingPoolCount = i13;
            this.reviewedCount = i14;
            this.round = i15;
            this.actions = actions;
            this.progress = progress;
        }

        public static /* synthetic */ Reviewing copy$default(Reviewing reviewing, boolean z11, boolean z12, int i11, int i12, int i13, int i14, int i15, List list, Progress progress, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                z11 = reviewing.canClockIn;
            }
            if ((i16 & 2) != 0) {
                z12 = reviewing.isFinished;
            }
            if ((i16 & 4) != 0) {
                i11 = reviewing.planCount;
            }
            if ((i16 & 8) != 0) {
                i12 = reviewing.learnedCount;
            }
            if ((i16 & 16) != 0) {
                i13 = reviewing.reviewingPoolCount;
            }
            if ((i16 & 32) != 0) {
                i14 = reviewing.reviewedCount;
            }
            if ((i16 & 64) != 0) {
                i15 = reviewing.round;
            }
            if ((i16 & 128) != 0) {
                list = reviewing.actions;
            }
            if ((i16 & 256) != 0) {
                progress = reviewing.progress;
            }
            List list2 = list;
            Progress progress2 = progress;
            int i17 = i14;
            int i18 = i15;
            int i19 = i13;
            int i21 = i11;
            return reviewing.copy(z11, z12, i21, i12, i19, i17, i18, list2, progress2);
        }

        public final boolean component1() {
            return this.canClockIn;
        }

        public final boolean component2() {
            return this.isFinished;
        }

        public final int component3() {
            return this.planCount;
        }

        public final int component4() {
            return this.learnedCount;
        }

        public final int component5() {
            return this.reviewingPoolCount;
        }

        public final int component6() {
            return this.reviewedCount;
        }

        public final int component7() {
            return this.round;
        }

        @k
        public final List<Action> component8() {
            return this.actions;
        }

        @k
        public final Progress component9() {
            return this.progress;
        }

        @k
        public final Reviewing copy(boolean z11, boolean z12, int i11, int i12, int i13, int i14, int i15, @k List<Action> actions, @k Progress progress) {
            g0.p(actions, "actions");
            g0.p(progress, "progress");
            return new Reviewing(z11, z12, i11, i12, i13, i14, i15, actions, progress);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reviewing)) {
                return false;
            }
            Reviewing reviewing = (Reviewing) obj;
            return this.canClockIn == reviewing.canClockIn && this.isFinished == reviewing.isFinished && this.planCount == reviewing.planCount && this.learnedCount == reviewing.learnedCount && this.reviewingPoolCount == reviewing.reviewingPoolCount && this.reviewedCount == reviewing.reviewedCount && this.round == reviewing.round && g0.g(this.actions, reviewing.actions) && g0.g(this.progress, reviewing.progress);
        }

        @k
        public final List<Action> getActions() {
            return this.actions;
        }

        public final boolean getCanClockIn() {
            return this.canClockIn;
        }

        public final int getLearnedCount() {
            return this.learnedCount;
        }

        public final int getPlanCount() {
            return this.planCount;
        }

        @Override // com.baicizhan.main.home.plan.module.exam.JsModel
        @k
        public Progress getProgress() {
            return this.progress;
        }

        public final int getReviewedCount() {
            return this.reviewedCount;
        }

        public final int getReviewingPoolCount() {
            return this.reviewingPoolCount;
        }

        public final int getRound() {
            return this.round;
        }

        public int hashCode() {
            return (((((((((((((((Boolean.hashCode(this.canClockIn) * 31) + Boolean.hashCode(this.isFinished)) * 31) + Integer.hashCode(this.planCount)) * 31) + Integer.hashCode(this.learnedCount)) * 31) + Integer.hashCode(this.reviewingPoolCount)) * 31) + Integer.hashCode(this.reviewedCount)) * 31) + Integer.hashCode(this.round)) * 31) + this.actions.hashCode()) * 31) + this.progress.hashCode();
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        @k
        public String toString() {
            return "Reviewing(canClockIn=" + this.canClockIn + ", isFinished=" + this.isFinished + ", planCount=" + this.planCount + ", learnedCount=" + this.learnedCount + ", reviewingPoolCount=" + this.reviewingPoolCount + ", reviewedCount=" + this.reviewedCount + ", round=" + this.round + ", actions=" + this.actions + ", progress=" + this.progress + j.f81007d;
        }
    }

    public /* synthetic */ JsModel(v vVar) {
        this();
    }

    @k
    public abstract Progress getProgress();

    private JsModel() {
    }
}
