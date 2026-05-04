package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int mDirection;
    WidgetRun mFirstRun;
    int mGroupIndex;
    WidgetRun mLastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> mRuns = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i11) {
        this.mFirstRun = null;
        this.mLastRun = null;
        int i12 = index;
        this.mGroupIndex = i12;
        index = i12 + 1;
        this.mFirstRun = widgetRun;
        this.mLastRun = widgetRun;
        this.mDirection = i11;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i11) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.mWidget.isTerminalWidget[i11]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).mRun) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i11);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i11] = false;
                }
                defineTerminalWidget(dependencyNode2.mRun, i11);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).mRun) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i11);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i11] = false;
                }
                defineTerminalWidget(dependencyNode.mRun, i11);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j11) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j11;
        }
        int size = dependencyNode.mDependencies.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            Dependency dependency = dependencyNode.mDependencies.get(i11);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j12 = Math.min(j12, traverseEnd(dependencyNode2, dependencyNode2.mMargin + j11));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return j12;
        }
        long wrapDimension = j11 - widgetRun.getWrapDimension();
        return Math.min(Math.min(j12, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.mMargin);
    }

    private long traverseStart(DependencyNode dependencyNode, long j11) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j11;
        }
        int size = dependencyNode.mDependencies.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            Dependency dependency = dependencyNode.mDependencies.get(i11);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j12 = Math.max(j12, traverseStart(dependencyNode2, dependencyNode2.mMargin + j11));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return j12;
        }
        long wrapDimension = j11 + widgetRun.getWrapDimension();
        return Math.max(Math.max(j12, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.mMargin);
    }

    public void add(WidgetRun widgetRun) {
        this.mRuns.add(widgetRun);
        this.mLastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i11) {
        long wrapDimension;
        int i12;
        WidgetRun widgetRun = this.mFirstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i11) {
                return 0L;
            }
        } else if (i11 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i11 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).start;
        DependencyNode dependencyNode2 = (i11 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).end;
        boolean contains = widgetRun.start.mTargets.contains(dependencyNode);
        boolean contains2 = this.mFirstRun.end.mTargets.contains(dependencyNode2);
        long wrapDimension2 = this.mFirstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.mFirstRun.start, 0L);
            long traverseEnd = traverseEnd(this.mFirstRun.end, 0L);
            long j11 = traverseStart - wrapDimension2;
            WidgetRun widgetRun2 = this.mFirstRun;
            int i13 = widgetRun2.end.mMargin;
            if (j11 >= (-i13)) {
                j11 += i13;
            }
            int i14 = widgetRun2.start.mMargin;
            long j12 = ((-traverseEnd) - wrapDimension2) - i14;
            if (j12 >= i14) {
                j12 -= i14;
            }
            float biasPercent = widgetRun2.mWidget.getBiasPercent(i11);
            float f11 = biasPercent > 0.0f ? (long) ((j12 / biasPercent) + (j11 / (1.0f - biasPercent))) : 0L;
            long j13 = ((long) ((f11 * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f11 * (1.0f - biasPercent)) + 0.5f));
            wrapDimension = r12.start.mMargin + j13;
            i12 = this.mFirstRun.end.mMargin;
        } else {
            if (contains) {
                return Math.max(traverseStart(this.mFirstRun.start, r12.mMargin), this.mFirstRun.start.mMargin + wrapDimension2);
            }
            if (contains2) {
                return Math.max(-traverseEnd(this.mFirstRun.end, r12.mMargin), (-this.mFirstRun.end.mMargin) + wrapDimension2);
            }
            wrapDimension = r12.start.mMargin + this.mFirstRun.getWrapDimension();
            i12 = this.mFirstRun.end.mMargin;
        }
        return wrapDimension - i12;
    }

    public void defineTerminalWidgets(boolean z11, boolean z12) {
        if (z11) {
            WidgetRun widgetRun = this.mFirstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z12) {
            WidgetRun widgetRun2 = this.mFirstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
