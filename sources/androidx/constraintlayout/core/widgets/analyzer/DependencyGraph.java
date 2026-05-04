package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DependencyGraph {
    private static final boolean DEBUG = false;
    private static final boolean USE_GROUPS = true;
    private ConstraintWidgetContainer mContainer;
    private ConstraintWidgetContainer mWidgetcontainer;
    private boolean mNeedBuildGraph = true;
    private boolean mNeedRedoMeasures = true;
    private ArrayList<WidgetRun> mRuns = new ArrayList<>();
    private ArrayList<RunGroup> mRunGroups = new ArrayList<>();
    private BasicMeasure.Measurer mMeasurer = null;
    private BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    ArrayList<RunGroup> mGroups = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mWidgetcontainer = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    private void applyGroup(DependencyNode dependencyNode, int i11, int i12, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        int i13;
        DependencyNode dependencyNode3;
        ArrayList<RunGroup> arrayList2;
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun.mRunGroup == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
            if (widgetRun == constraintWidgetContainer.mHorizontalRun || widgetRun == constraintWidgetContainer.mVerticalRun) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup(widgetRun, i12);
                arrayList.add(runGroup);
            }
            RunGroup runGroup2 = runGroup;
            widgetRun.mRunGroup = runGroup2;
            runGroup2.add(widgetRun);
            for (Dependency dependency : widgetRun.start.mDependencies) {
                if (dependency instanceof DependencyNode) {
                    i13 = i11;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                    applyGroup((DependencyNode) dependency, i13, 0, dependencyNode3, arrayList2, runGroup2);
                } else {
                    i13 = i11;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                }
                i11 = i13;
                dependencyNode2 = dependencyNode3;
                arrayList = arrayList2;
            }
            int i14 = i11;
            DependencyNode dependencyNode4 = dependencyNode2;
            ArrayList<RunGroup> arrayList3 = arrayList;
            for (Dependency dependency2 : widgetRun.end.mDependencies) {
                if (dependency2 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency2, i14, 1, dependencyNode4, arrayList3, runGroup2);
                }
            }
            if (i14 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.mDependencies) {
                    if (dependency3 instanceof DependencyNode) {
                        applyGroup((DependencyNode) dependency3, i14, 2, dependencyNode4, arrayList3, runGroup2);
                    }
                }
            }
            for (DependencyNode dependencyNode5 : widgetRun.start.mTargets) {
                if (dependencyNode5 == dependencyNode4) {
                    runGroup2.dual = true;
                }
                applyGroup(dependencyNode5, i14, 0, dependencyNode4, arrayList3, runGroup2);
            }
            for (DependencyNode dependencyNode6 : widgetRun.end.mTargets) {
                if (dependencyNode6 == dependencyNode4) {
                    runGroup2.dual = true;
                }
                applyGroup(dependencyNode6, i14, 1, dependencyNode4, arrayList3, runGroup2);
            }
            if (i14 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator<DependencyNode> it = ((VerticalWidgetRun) widgetRun).baseline.mTargets.iterator();
                while (it.hasNext()) {
                    applyGroup(it.next(), i14, 2, dependencyNode4, arrayList3, runGroup2);
                }
            }
        }
    }

    private boolean basicMeasureWidgets(ConstraintWidgetContainer constraintWidgetContainer) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i11;
        char c11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        float f11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        Iterator<ConstraintWidget> it = constraintWidgetContainer.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.mListDimensionBehaviors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (next.getVisibility() == 8) {
                next.measured = true;
            } else {
                if (next.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultWidth = 2;
                }
                if (next.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultHeight = 2;
                }
                if (next.getDimensionRatio() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 == dimensionBehaviour8 && (dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour8 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour8 && dimensionBehaviour7 == dimensionBehaviour8) {
                        if (next.mMatchConstraintDefaultWidth == 0) {
                            next.mMatchConstraintDefaultWidth = 3;
                        }
                        if (next.mMatchConstraintDefaultHeight == 0) {
                            next.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour6 == dimensionBehaviour9 && next.mMatchConstraintDefaultWidth == 1 && (next.mLeft.mTarget == null || next.mRight.mTarget == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour7 == dimensionBehaviour9 && next.mMatchConstraintDefaultHeight == 1 && (next.mTop.mTarget == null || next.mBottom.mTarget == null)) {
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                HorizontalWidgetRun horizontalWidgetRun = next.mHorizontalRun;
                horizontalWidgetRun.mDimensionBehavior = dimensionBehaviour6;
                int i12 = next.mMatchConstraintDefaultWidth;
                horizontalWidgetRun.matchConstraintsType = i12;
                VerticalWidgetRun verticalWidgetRun = next.mVerticalRun;
                verticalWidgetRun.mDimensionBehavior = dimensionBehaviour7;
                int i13 = next.mMatchConstraintDefaultHeight;
                verticalWidgetRun.matchConstraintsType = i13;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour6 == dimensionBehaviour10 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour7 == dimensionBehaviour10 || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour7;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour6;
                    int width = next.getWidth();
                    if (dimensionBehaviour12 == dimensionBehaviour10) {
                        width = (constraintWidgetContainer.getWidth() - next.mLeft.mMargin) - next.mRight.mMargin;
                        dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i14 = width;
                    int height = next.getHeight();
                    if (dimensionBehaviour11 == dimensionBehaviour10) {
                        height = (constraintWidgetContainer.getHeight() - next.mTop.mMargin) - next.mBottom.mMargin;
                        dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    measure(next, dimensionBehaviour12, i14, dimensionBehaviour11, height);
                    next.mHorizontalRun.mDimension.resolve(next.getWidth());
                    next.mVerticalRun.mDimension.resolve(next.getHeight());
                    next.measured = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        dimensionBehaviour2 = dimensionBehaviour9;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        c11 = 0;
                        if (dimensionBehaviour7 != dimensionBehaviour13 && dimensionBehaviour7 != ConstraintWidget.DimensionBehaviour.FIXED) {
                            dimensionBehaviour = dimensionBehaviour7;
                            i11 = 3;
                        } else if (i12 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour13) {
                                measure(next, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                            }
                            int height2 = next.getHeight();
                            int i15 = (int) ((height2 * next.mDimensionRatio) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            measure(next, dimensionBehaviour14, i15, dimensionBehaviour14, height2);
                            next.mHorizontalRun.mDimension.resolve(next.getWidth());
                            next.mVerticalRun.mDimension.resolve(next.getHeight());
                            next.measured = true;
                        } else if (i12 == 1) {
                            measure(next, dimensionBehaviour13, 0, dimensionBehaviour7, 0);
                            next.mHorizontalRun.mDimension.wrapValue = next.getWidth();
                        } else {
                            dimensionBehaviour = dimensionBehaviour7;
                            i11 = 3;
                            if (i12 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = constraintWidgetContainer.mListDimensionBehaviors[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour15 == dimensionBehaviour16 || dimensionBehaviour15 == dimensionBehaviour10) {
                                    measure(next, dimensionBehaviour16, (int) ((next.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour, next.getHeight());
                                    next.mHorizontalRun.mDimension.resolve(next.getWidth());
                                    next.mVerticalRun.mDimension.resolve(next.getHeight());
                                    next.measured = true;
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr = next.mListAnchors;
                                f11 = 1.0f;
                                if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                    measure(next, dimensionBehaviour13, 0, dimensionBehaviour, 0);
                                    next.mHorizontalRun.mDimension.resolve(next.getWidth());
                                    next.mVerticalRun.mDimension.resolve(next.getHeight());
                                    next.measured = true;
                                } else {
                                    if (dimensionBehaviour == dimensionBehaviour2 || !(dimensionBehaviour6 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                                        dimensionBehaviour3 = dimensionBehaviour6;
                                    } else if (i13 == i11) {
                                        if (dimensionBehaviour6 == dimensionBehaviour4) {
                                            measure(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                                        }
                                        int width2 = next.getWidth();
                                        float f12 = next.mDimensionRatio;
                                        if (next.getDimensionRatioSide() == -1) {
                                            f12 = f11 / f12;
                                        }
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                                        measure(next, dimensionBehaviour17, width2, dimensionBehaviour17, (int) ((width2 * f12) + 0.5f));
                                        next.mHorizontalRun.mDimension.resolve(next.getWidth());
                                        next.mVerticalRun.mDimension.resolve(next.getHeight());
                                        next.measured = true;
                                    } else if (i13 == 1) {
                                        measure(next, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                                        next.mVerticalRun.mDimension.wrapValue = next.getHeight();
                                    } else {
                                        dimensionBehaviour3 = dimensionBehaviour6;
                                        if (i13 == 2) {
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = constraintWidgetContainer.mListDimensionBehaviors[1];
                                            dimensionBehaviour5 = dimensionBehaviour;
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                                            if (dimensionBehaviour18 == dimensionBehaviour19 || dimensionBehaviour18 == dimensionBehaviour10) {
                                                measure(next, dimensionBehaviour3, next.getWidth(), dimensionBehaviour19, (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                                next.mHorizontalRun.mDimension.resolve(next.getWidth());
                                                next.mVerticalRun.mDimension.resolve(next.getHeight());
                                                next.measured = true;
                                            } else {
                                                dimensionBehaviour = dimensionBehaviour5;
                                            }
                                        } else {
                                            dimensionBehaviour5 = dimensionBehaviour;
                                            ConstraintAnchor[] constraintAnchorArr2 = next.mListAnchors;
                                            if (constraintAnchorArr2[2].mTarget == null || constraintAnchorArr2[i11].mTarget == null) {
                                                measure(next, dimensionBehaviour4, 0, dimensionBehaviour5, 0);
                                                next.mHorizontalRun.mDimension.resolve(next.getWidth());
                                                next.mVerticalRun.mDimension.resolve(next.getHeight());
                                                next.measured = true;
                                            } else {
                                                dimensionBehaviour = dimensionBehaviour5;
                                            }
                                        }
                                    }
                                    if (dimensionBehaviour3 == dimensionBehaviour2 && dimensionBehaviour == dimensionBehaviour2) {
                                        if (i12 != 1 || i13 == 1) {
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                            measure(next, dimensionBehaviour20, 0, dimensionBehaviour20, 0);
                                            next.mHorizontalRun.mDimension.wrapValue = next.getWidth();
                                            next.mVerticalRun.mDimension.wrapValue = next.getHeight();
                                        } else if (i13 == 2 && i12 == 2) {
                                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer.mListDimensionBehaviors;
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviourArr2[c11];
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                                            if (dimensionBehaviour21 == dimensionBehaviour22 && dimensionBehaviourArr2[1] == dimensionBehaviour22) {
                                                measure(next, dimensionBehaviour22, (int) ((next.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour22, (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                                next.mHorizontalRun.mDimension.resolve(next.getWidth());
                                                next.mVerticalRun.mDimension.resolve(next.getHeight());
                                                next.measured = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour7;
                        i11 = 3;
                        c11 = 0;
                        dimensionBehaviour2 = dimensionBehaviour9;
                    }
                    f11 = 1.0f;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                    }
                    dimensionBehaviour3 = dimensionBehaviour6;
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        if (i12 != 1) {
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour202 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        measure(next, dimensionBehaviour202, 0, dimensionBehaviour202, 0);
                        next.mHorizontalRun.mDimension.wrapValue = next.getWidth();
                        next.mVerticalRun.mDimension.wrapValue = next.getHeight();
                    }
                }
            }
        }
        return false;
    }

    private int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i11) {
        int size = this.mGroups.size();
        long j11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            j11 = Math.max(j11, this.mGroups.get(i12).computeWrapSize(constraintWidgetContainer, i11));
        }
        return (int) j11;
    }

    private void displayGraph() {
        Iterator<WidgetRun> it = this.mRuns.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = generateDisplayGraph(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    private void findGroup(WidgetRun widgetRun, int i11, ArrayList<RunGroup> arrayList) {
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if (dependency instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency, i11, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency).start, i11, 0, widgetRun.end, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if (dependency2 instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency2, i11, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency2).end, i11, 1, widgetRun.start, arrayList, null);
            }
        }
        int i12 = i11;
        if (i12 == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.mDependencies) {
                if (dependency3 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency3, i12, 2, null, arrayList, null);
                }
                i12 = i11;
            }
        }
    }

    private String generateChainDisplayGraph(ChainRun chainRun, String str) {
        int i11 = chainRun.orientation;
        StringBuilder sb2 = new StringBuilder("subgraph ");
        sb2.append("cluster_");
        sb2.append(chainRun.mWidget.getDebugName());
        if (i11 == 0) {
            sb2.append("_h");
        } else {
            sb2.append("_v");
        }
        sb2.append(" {\n");
        Iterator<WidgetRun> it = chainRun.mWidgets.iterator();
        String str2 = "";
        while (it.hasNext()) {
            WidgetRun next = it.next();
            sb2.append(next.mWidget.getDebugName());
            if (i11 == 0) {
                sb2.append("_HORIZONTAL");
            } else {
                sb2.append("_VERTICAL");
            }
            sb2.append(";\n");
            str2 = generateDisplayGraph(next, str2);
        }
        sb2.append("}\n");
        return str + str2 + ((Object) sb2);
    }

    private String generateDisplayGraph(WidgetRun widgetRun, String str) {
        boolean z11;
        DependencyNode dependencyNode = widgetRun.start;
        DependencyNode dependencyNode2 = widgetRun.end;
        StringBuilder sb2 = new StringBuilder(str);
        if (!(widgetRun instanceof HelperReferences) && dependencyNode.mDependencies.isEmpty() && dependencyNode2.mDependencies.isEmpty() && dependencyNode.mTargets.isEmpty() && dependencyNode2.mTargets.isEmpty()) {
            return str;
        }
        sb2.append(nodeDefinition(widgetRun));
        boolean isCenteredConnection = isCenteredConnection(dependencyNode, dependencyNode2);
        String generateDisplayNode = generateDisplayNode(dependencyNode2, isCenteredConnection, generateDisplayNode(dependencyNode, isCenteredConnection, str));
        boolean z12 = widgetRun instanceof VerticalWidgetRun;
        if (z12) {
            generateDisplayNode = generateDisplayNode(((VerticalWidgetRun) widgetRun).baseline, isCenteredConnection, generateDisplayNode);
        }
        if ((widgetRun instanceof HorizontalWidgetRun) || (((z11 = widgetRun instanceof ChainRun)) && ((ChainRun) widgetRun).orientation == 0)) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = widgetRun.mWidget.getHorizontalDimensionBehaviour();
            if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.mTargets.isEmpty() && dependencyNode2.mTargets.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode2.name());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode.name());
                    sb2.append("\n");
                } else if (dependencyNode.mTargets.isEmpty() && !dependencyNode2.mTargets.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode.name());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode2.name());
                    sb2.append("\n");
                }
            } else if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.mWidget.getDimensionRatio() > 0.0f) {
                sb2.append("\n");
                sb2.append(widgetRun.mWidget.getDebugName());
                sb2.append("_HORIZONTAL -> ");
                sb2.append(widgetRun.mWidget.getDebugName());
                sb2.append("_VERTICAL;\n");
            }
        } else if (z12 || (z11 && ((ChainRun) widgetRun).orientation == 1)) {
            ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = widgetRun.mWidget.getVerticalDimensionBehaviour();
            if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.mTargets.isEmpty() && dependencyNode2.mTargets.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode2.name());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode.name());
                    sb2.append("\n");
                } else if (dependencyNode.mTargets.isEmpty() && !dependencyNode2.mTargets.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode.name());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode2.name());
                    sb2.append("\n");
                }
            } else if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.mWidget.getDimensionRatio() > 0.0f) {
                sb2.append("\n");
                sb2.append(widgetRun.mWidget.getDebugName());
                sb2.append("_VERTICAL -> ");
                sb2.append(widgetRun.mWidget.getDebugName());
                sb2.append("_HORIZONTAL;\n");
            }
        }
        return widgetRun instanceof ChainRun ? generateChainDisplayGraph((ChainRun) widgetRun, generateDisplayNode) : sb2.toString();
    }

    private String generateDisplayNode(DependencyNode dependencyNode, boolean z11, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        for (DependencyNode dependencyNode2 : dependencyNode.mTargets) {
            String str2 = ("\n" + dependencyNode.name()) + " -> " + dependencyNode2.name();
            if (dependencyNode.mMargin > 0 || z11 || (dependencyNode.mRun instanceof HelperReferences)) {
                String str3 = str2 + "[";
                if (dependencyNode.mMargin > 0) {
                    str3 = str3 + "label=\"" + dependencyNode.mMargin + "\"";
                    if (z11) {
                        str3 = str3 + ",";
                    }
                }
                if (z11) {
                    str3 = str3 + " style=dashed ";
                }
                if (dependencyNode.mRun instanceof HelperReferences) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb2.append(str2 + "\n");
        }
        return sb2.toString();
    }

    private boolean isCenteredConnection(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        Iterator<DependencyNode> it = dependencyNode.mTargets.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next() != dependencyNode2) {
                i11++;
            }
        }
        Iterator<DependencyNode> it2 = dependencyNode2.mTargets.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            if (it2.next() != dependencyNode) {
                i12++;
            }
        }
        return i11 > 0 && i12 > 0;
    }

    private void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i11, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i12) {
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i11;
        measure.verticalDimension = i12;
        this.mMeasurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    private String nodeDefinition(WidgetRun widgetRun) {
        boolean z11 = widgetRun instanceof VerticalWidgetRun;
        String debugName = widgetRun.mWidget.getDebugName();
        StringBuilder sb2 = new StringBuilder(debugName);
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = !z11 ? widgetRun.mWidget.getHorizontalDimensionBehaviour() : widgetRun.mWidget.getVerticalDimensionBehaviour();
        RunGroup runGroup = widgetRun.mRunGroup;
        if (z11) {
            sb2.append("_VERTICAL");
        } else {
            sb2.append("_HORIZONTAL");
        }
        sb2.append(" [shape=none, label=<");
        sb2.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb2.append("  <TR>");
        if (z11) {
            sb2.append("    <TD ");
            if (widgetRun.start.resolved) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            sb2.append("    <TD ");
            if (widgetRun.start.resolved) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        sb2.append("    <TD BORDER=\"1\" ");
        boolean z12 = widgetRun.mDimension.resolved;
        if (z12 && !widgetRun.mWidget.measured) {
            sb2.append(" BGCOLOR=\"green\" ");
        } else if (z12) {
            sb2.append(" BGCOLOR=\"lightgray\" ");
        } else if (widgetRun.mWidget.measured) {
            sb2.append(" BGCOLOR=\"yellow\" ");
        }
        if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            sb2.append("style=\"dashed\"");
        }
        sb2.append(">");
        sb2.append(debugName);
        if (runGroup != null) {
            sb2.append(" [");
            sb2.append(runGroup.mGroupIndex + 1);
            sb2.append("/");
            sb2.append(RunGroup.index);
            sb2.append("]");
        }
        sb2.append(" </TD>");
        if (z11) {
            sb2.append("    <TD ");
            if (((VerticalWidgetRun) widgetRun).baseline.resolved) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb2.append("    <TD ");
            if (widgetRun.end.resolved) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            sb2.append("    <TD ");
            if (widgetRun.end.resolved) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        sb2.append("  </TR></TABLE>");
        sb2.append(">];\n");
        return sb2.toString();
    }

    public void buildGraph() {
        buildGraph(this.mRuns);
        this.mGroups.clear();
        RunGroup.index = 0;
        findGroup(this.mWidgetcontainer.mHorizontalRun, 0, this.mGroups);
        findGroup(this.mWidgetcontainer.mVerticalRun, 1, this.mGroups);
        this.mNeedBuildGraph = false;
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.mNeedBuildGraph) {
            buildGraph();
            Iterator<ConstraintWidget> it = this.mWidgetcontainer.mChildren.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                boolean[] zArr = next.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof Barrier) {
                    z11 = true;
                }
            }
            if (z11) {
                return;
            }
            Iterator<RunGroup> it2 = this.mGroups.iterator();
            while (it2.hasNext()) {
                RunGroup next2 = it2.next();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                next2.defineTerminalWidgets(dimensionBehaviour == dimensionBehaviour3, dimensionBehaviour2 == dimensionBehaviour3);
            }
        }
    }

    public boolean directMeasure(boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.mNeedBuildGraph || this.mNeedRedoMeasures) {
            Iterator<ConstraintWidget> it = this.mWidgetcontainer.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.mHorizontalRun.reset();
                next.mVerticalRun.reset();
            }
            this.mWidgetcontainer.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.mHorizontalRun.reset();
            this.mWidgetcontainer.mVerticalRun.reset();
            this.mNeedRedoMeasures = false;
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.mWidgetcontainer.setX(0);
        this.mWidgetcontainer.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mWidgetcontainer.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mWidgetcontainer.getDimensionBehaviour(1);
        if (this.mNeedBuildGraph) {
            buildGraph();
        }
        int x11 = this.mWidgetcontainer.getX();
        int y11 = this.mWidgetcontainer.getY();
        this.mWidgetcontainer.mHorizontalRun.start.resolve(x11);
        this.mWidgetcontainer.mVerticalRun.start.resolve(y11);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z11) {
                Iterator<WidgetRun> it2 = this.mRuns.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().supportsWrapComputation()) {
                        z11 = false;
                        break;
                    }
                }
            }
            if (z11 && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.mWidgetcontainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.mWidgetcontainer;
                constraintWidgetContainer2.setWidth(computeWrap(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mWidgetcontainer;
                constraintWidgetContainer3.mHorizontalRun.mDimension.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z11 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.mWidgetcontainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.mWidgetcontainer;
                constraintWidgetContainer4.setHeight(computeWrap(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.mWidgetcontainer;
                constraintWidgetContainer5.mVerticalRun.mDimension.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.mWidgetcontainer;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer6.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = constraintWidgetContainer6.getWidth() + x11;
            this.mWidgetcontainer.mHorizontalRun.end.resolve(width);
            this.mWidgetcontainer.mHorizontalRun.mDimension.resolve(width - x11);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.mWidgetcontainer;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer7.mListDimensionBehaviors[1];
            if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y11;
                this.mWidgetcontainer.mVerticalRun.end.resolve(height);
                this.mWidgetcontainer.mVerticalRun.mDimension.resolve(height - y11);
            }
            measureWidgets();
            z12 = true;
        } else {
            z12 = false;
        }
        Iterator<WidgetRun> it3 = this.mRuns.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.mWidget != this.mWidgetcontainer || next2.mResolved) {
                next2.applyToWidget();
            }
        }
        Iterator<WidgetRun> it4 = this.mRuns.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z13 = true;
                break;
            }
            WidgetRun next3 = it4.next();
            if (z12 || next3.mWidget != this.mWidgetcontainer) {
                if (!next3.start.resolved) {
                    break;
                }
                if (!next3.end.resolved) {
                    if (!(next3 instanceof GuidelineReference)) {
                        break;
                    }
                }
                if (!next3.mDimension.resolved && !(next3 instanceof ChainRun) && !(next3 instanceof GuidelineReference)) {
                    break;
                }
            }
        }
        this.mWidgetcontainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.mWidgetcontainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z13;
    }

    public boolean directMeasureSetup(boolean z11) {
        if (this.mNeedBuildGraph) {
            Iterator<ConstraintWidget> it = this.mWidgetcontainer.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = next.mHorizontalRun;
                horizontalWidgetRun.mDimension.resolved = false;
                horizontalWidgetRun.mResolved = false;
                horizontalWidgetRun.reset();
                VerticalWidgetRun verticalWidgetRun = next.mVerticalRun;
                verticalWidgetRun.mDimension.resolved = false;
                verticalWidgetRun.mResolved = false;
                verticalWidgetRun.reset();
            }
            this.mWidgetcontainer.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.mHorizontalRun;
            horizontalWidgetRun2.mDimension.resolved = false;
            horizontalWidgetRun2.mResolved = false;
            horizontalWidgetRun2.reset();
            VerticalWidgetRun verticalWidgetRun2 = this.mWidgetcontainer.mVerticalRun;
            verticalWidgetRun2.mDimension.resolved = false;
            verticalWidgetRun2.mResolved = false;
            verticalWidgetRun2.reset();
            buildGraph();
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.mWidgetcontainer.setX(0);
        this.mWidgetcontainer.setY(0);
        this.mWidgetcontainer.mHorizontalRun.start.resolve(0);
        this.mWidgetcontainer.mVerticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z11, int i11) {
        boolean z12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z13 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mWidgetcontainer.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.mWidgetcontainer.getDimensionBehaviour(1);
        int x11 = this.mWidgetcontainer.getX();
        int y11 = this.mWidgetcontainer.getY();
        if (z11 && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            Iterator<WidgetRun> it = this.mRuns.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun next = it.next();
                if (next.orientation == i11 && !next.supportsWrapComputation()) {
                    z11 = false;
                    break;
                }
            }
            if (i11 == 0) {
                if (z11 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.mWidgetcontainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
                    constraintWidgetContainer.setWidth(computeWrap(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mWidgetcontainer;
                    constraintWidgetContainer2.mHorizontalRun.mDimension.resolve(constraintWidgetContainer2.getWidth());
                }
            } else if (z11 && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.mWidgetcontainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mWidgetcontainer;
                constraintWidgetContainer3.setHeight(computeWrap(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.mWidgetcontainer;
                constraintWidgetContainer4.mVerticalRun.mDimension.resolve(constraintWidgetContainer4.getHeight());
            }
        }
        if (i11 == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.mWidgetcontainer;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer5.mListDimensionBehaviors[0];
            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = constraintWidgetContainer5.getWidth() + x11;
                this.mWidgetcontainer.mHorizontalRun.end.resolve(width);
                this.mWidgetcontainer.mHorizontalRun.mDimension.resolve(width - x11);
                z12 = true;
            }
            z12 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.mWidgetcontainer;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer6.mListDimensionBehaviors[1];
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer6.getHeight() + y11;
                this.mWidgetcontainer.mVerticalRun.end.resolve(height);
                this.mWidgetcontainer.mVerticalRun.mDimension.resolve(height - y11);
                z12 = true;
            }
            z12 = false;
        }
        measureWidgets();
        Iterator<WidgetRun> it2 = this.mRuns.iterator();
        while (it2.hasNext()) {
            WidgetRun next2 = it2.next();
            if (next2.orientation == i11 && (next2.mWidget != this.mWidgetcontainer || next2.mResolved)) {
                next2.applyToWidget();
            }
        }
        Iterator<WidgetRun> it3 = this.mRuns.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z13 = true;
                break;
            }
            WidgetRun next3 = it3.next();
            if (next3.orientation == i11 && (z12 || next3.mWidget != this.mWidgetcontainer)) {
                if (!next3.start.resolved) {
                    break;
                }
                if (!next3.end.resolved) {
                    break;
                }
                if (!(next3 instanceof ChainRun) && !next3.mDimension.resolved) {
                    break;
                }
            }
        }
        this.mWidgetcontainer.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        this.mWidgetcontainer.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z13;
    }

    public void invalidateGraph() {
        this.mNeedBuildGraph = true;
    }

    public void invalidateMeasures() {
        this.mNeedRedoMeasures = true;
    }

    public void measureWidgets() {
        DimensionDependency dimensionDependency;
        Iterator<ConstraintWidget> it = this.mWidgetcontainer.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.mListDimensionBehaviors;
                boolean z11 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i11 = next.mMatchConstraintDefaultWidth;
                int i12 = next.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z12 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i11 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i12 == 1)) {
                    z11 = true;
                }
                DimensionDependency dimensionDependency2 = next.mHorizontalRun.mDimension;
                boolean z13 = dimensionDependency2.resolved;
                DimensionDependency dimensionDependency3 = next.mVerticalRun.mDimension;
                boolean z14 = dimensionDependency3.resolved;
                if (z13 && z14) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    measure(next, dimensionBehaviour4, dimensionDependency2.value, dimensionBehaviour4, dimensionDependency3.value);
                    next.measured = true;
                } else if (z13 && z11) {
                    measure(next, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency2.value, dimensionBehaviour3, dimensionDependency3.value);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.mVerticalRun.mDimension.wrapValue = next.getHeight();
                    } else {
                        next.mVerticalRun.mDimension.resolve(next.getHeight());
                        next.measured = true;
                    }
                } else if (z14 && z12) {
                    measure(next, dimensionBehaviour3, dimensionDependency2.value, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency3.value);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.mHorizontalRun.mDimension.wrapValue = next.getWidth();
                    } else {
                        next.mHorizontalRun.mDimension.resolve(next.getWidth());
                        next.measured = true;
                    }
                }
                if (next.measured && (dimensionDependency = next.mVerticalRun.mBaselineDimension) != null) {
                    dimensionDependency.resolve(next.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.mContainer.mHorizontalRun.clear();
        this.mContainer.mVerticalRun.clear();
        arrayList.add(this.mContainer.mHorizontalRun);
        arrayList.add(this.mContainer.mVerticalRun);
        Iterator<ConstraintWidget> it = this.mContainer.mChildren.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof Guideline) {
                arrayList.add(new GuidelineReference(next));
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new ChainRun(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.mHorizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new ChainRun(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.mVerticalRun);
                }
                if (next instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.mWidget != this.mContainer) {
                next2.apply();
            }
        }
    }
}
