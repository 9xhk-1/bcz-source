package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    private static final boolean DO_NOT_USE = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer mConstraintWidgetContainer;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();
    private Measure mMeasure = new Measure();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mConstraintWidgetContainer = constraintWidgetContainer;
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, int i11) {
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        Measure measure = this.mMeasure;
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z11 = dimensionBehaviour == dimensionBehaviour2;
        boolean z12 = measure.verticalBehavior == dimensionBehaviour2;
        boolean z13 = z11 && constraintWidget.mDimensionRatio > 0.0f;
        boolean z14 = z12 && constraintWidget.mDimensionRatio > 0.0f;
        if (z13 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z14 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        Measure measure2 = this.mMeasure;
        measure2.measureStrategy = Measure.SELF_DIMENSIONS;
        return measure2.measuredNeedsSolverPass;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r5.mDimensionRatio <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r2 = r13.getMeasurer()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r5.mHorizontalRun
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r5.mVerticalRun
            if (r7 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.mDimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.mDimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.mMatchConstraintDefaultWidth
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.mMatchConstraintDefaultHeight
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r12.measure(r2, r5, r6)
            androidx.constraintlayout.core.Metrics r5 = r13.mMetrics
            if (r5 == 0) goto Lac
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):void");
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, String str, int i11, int i12, int i13) {
        long nanoTime = constraintWidgetContainer.mMetrics != null ? System.nanoTime() : 0L;
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i12);
        constraintWidgetContainer.setHeight(i13);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.mConstraintWidgetContainer.setPass(i11);
        this.mConstraintWidgetContainer.layout();
        if (constraintWidgetContainer.mMetrics != null) {
            long nanoTime2 = System.nanoTime();
            Metrics metrics = constraintWidgetContainer.mMetrics;
            metrics.mSolverPasses++;
            metrics.measuresLayoutDuration += nanoTime2 - nanoTime;
        }
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        long j11;
        boolean z11;
        int i21;
        int i22;
        int i23;
        long j12;
        int i24;
        long j13;
        int i25;
        int i26;
        boolean z12;
        Metrics metrics;
        BasicMeasure basicMeasure = this;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        Measurer measurer = constraintWidgetContainer2.getMeasurer();
        int size = constraintWidgetContainer2.mChildren.size();
        int width = constraintWidgetContainer2.getWidth();
        int height = constraintWidgetContainer2.getHeight();
        boolean enabled = Optimizer.enabled(i11, 128);
        boolean z13 = enabled || Optimizer.enabled(i11, 64);
        if (z13) {
            for (int i27 = 0; i27 < size; i27++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer2.mChildren.get(i27);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z14 = (horizontalDimensionBehaviour == dimensionBehaviour) && (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z14) || ((constraintWidget.isInVerticalChain() && z14) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13 && (metrics = LinearSystem.sMetrics) != null) {
            metrics.measures++;
        }
        boolean z15 = z13 & ((i14 == 1073741824 && i16 == 1073741824) || enabled);
        int i28 = 2;
        if (z15) {
            j11 = 1;
            int min = Math.min(constraintWidgetContainer2.getMaxWidth(), i15);
            int min2 = Math.min(constraintWidgetContainer2.getMaxHeight(), i17);
            if (i14 == 1073741824 && constraintWidgetContainer2.getWidth() != min) {
                constraintWidgetContainer2.setWidth(min);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i16 == 1073741824 && constraintWidgetContainer2.getHeight() != min2) {
                constraintWidgetContainer2.setHeight(min2);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i14 == 1073741824 && i16 == 1073741824) {
                z11 = constraintWidgetContainer2.directMeasure(enabled);
                i21 = 2;
            } else {
                boolean directMeasureSetup = constraintWidgetContainer2.directMeasureSetup(enabled);
                if (i14 == 1073741824) {
                    directMeasureSetup &= constraintWidgetContainer2.directMeasureWithOrientation(enabled, 0);
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                if (i16 == 1073741824) {
                    z11 = constraintWidgetContainer2.directMeasureWithOrientation(enabled, 1) & directMeasureSetup;
                    i21++;
                } else {
                    z11 = directMeasureSetup;
                }
            }
            if (z11) {
                constraintWidgetContainer2.updateFromRuns(i14 == 1073741824, i16 == 1073741824);
            }
        } else {
            j11 = 1;
            z11 = false;
            i21 = 0;
        }
        if (!z11 || i21 != 2) {
            int optimizationLevel = constraintWidgetContainer2.getOptimizationLevel();
            if (size > 0) {
                measureChildren(constraintWidgetContainer);
            }
            r3 = constraintWidgetContainer2.mMetrics != null ? System.nanoTime() : 0L;
            updateHierarchy(constraintWidgetContainer);
            int size2 = basicMeasure.mVariableDimensionsWidgets.size();
            if (size > 0) {
                basicMeasure.solveLinearSystem(constraintWidgetContainer2, "First pass", 0, width, height);
                i22 = width;
                i23 = height;
            } else {
                i22 = width;
                i23 = height;
            }
            if (size2 > 0) {
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer2.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z16 = horizontalDimensionBehaviour2 == dimensionBehaviour2;
                boolean z17 = constraintWidgetContainer2.getVerticalDimensionBehaviour() == dimensionBehaviour2;
                int max = Math.max(constraintWidgetContainer2.getWidth(), basicMeasure.mConstraintWidgetContainer.getMinWidth());
                int max2 = Math.max(constraintWidgetContainer2.getHeight(), basicMeasure.mConstraintWidgetContainer.getMinHeight());
                int i29 = 0;
                boolean z18 = false;
                while (i29 < size2) {
                    ConstraintWidget constraintWidget2 = basicMeasure.mVariableDimensionsWidgets.get(i29);
                    boolean z19 = z15;
                    if (constraintWidget2 instanceof VirtualLayout) {
                        int width2 = constraintWidget2.getWidth();
                        j13 = r3;
                        int height2 = constraintWidget2.getHeight();
                        boolean measure = z18 | basicMeasure.measure(measurer, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS);
                        Metrics metrics2 = constraintWidgetContainer2.mMetrics;
                        i25 = i22;
                        i26 = i23;
                        if (metrics2 != null) {
                            metrics2.measuredMatchWidgets += j11;
                        }
                        int width3 = constraintWidget2.getWidth();
                        int height3 = constraintWidget2.getHeight();
                        if (width3 != width2) {
                            constraintWidget2.setWidth(width3);
                            if (z16 && constraintWidget2.getRight() > max) {
                                max = Math.max(max, constraintWidget2.getRight() + constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            z12 = true;
                        } else {
                            z12 = measure;
                        }
                        if (height3 != height2) {
                            constraintWidget2.setHeight(height3);
                            if (z17 && constraintWidget2.getBottom() > max2) {
                                max2 = Math.max(max2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            z12 = true;
                        }
                        z18 = z12 | ((VirtualLayout) constraintWidget2).needSolverPass();
                    } else {
                        j13 = r3;
                        i25 = i22;
                        i26 = i23;
                    }
                    i29++;
                    i22 = i25;
                    i23 = i26;
                    z15 = z19;
                    r3 = j13;
                    i28 = 2;
                }
                boolean z21 = z15;
                j12 = r3;
                int i31 = i22;
                int i32 = i23;
                int i33 = i28;
                int i34 = 0;
                while (true) {
                    if (i34 >= i33) {
                        break;
                    }
                    int i35 = 0;
                    while (i35 < size2) {
                        ConstraintWidget constraintWidget3 = basicMeasure.mVariableDimensionsWidgets.get(i35);
                        if (((constraintWidget3 instanceof Helper) && !(constraintWidget3 instanceof VirtualLayout)) || (constraintWidget3 instanceof Guideline) || constraintWidget3.getVisibility() == 8 || ((z21 && constraintWidget3.mHorizontalRun.mDimension.resolved && constraintWidget3.mVerticalRun.mDimension.resolved) || (constraintWidget3 instanceof VirtualLayout))) {
                            i24 = i34;
                        } else {
                            int width4 = constraintWidget3.getWidth();
                            int height4 = constraintWidget3.getHeight();
                            int baselineDistance = constraintWidget3.getBaselineDistance();
                            int i36 = Measure.TRY_GIVEN_DIMENSIONS;
                            if (i34 == 1) {
                                i36 = Measure.USE_GIVEN_DIMENSIONS;
                            }
                            boolean measure2 = z18 | basicMeasure.measure(measurer, constraintWidget3, i36);
                            Metrics metrics3 = constraintWidgetContainer2.mMetrics;
                            i24 = i34;
                            if (metrics3 != null) {
                                metrics3.measuredMatchWidgets += j11;
                            }
                            int width5 = constraintWidget3.getWidth();
                            int height5 = constraintWidget3.getHeight();
                            if (width5 != width4) {
                                constraintWidget3.setWidth(width5);
                                if (z16 && constraintWidget3.getRight() > max) {
                                    max = Math.max(max, constraintWidget3.getRight() + constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                measure2 = true;
                            }
                            if (height5 != height4) {
                                constraintWidget3.setHeight(height5);
                                if (z17 && constraintWidget3.getBottom() > max2) {
                                    max2 = Math.max(max2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                measure2 = true;
                            }
                            z18 = (!constraintWidget3.hasBaseline() || baselineDistance == constraintWidget3.getBaselineDistance()) ? measure2 : true;
                        }
                        i35++;
                        basicMeasure = this;
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        i34 = i24;
                    }
                    int i37 = i34;
                    if (!z18) {
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        break;
                    }
                    i34 = i37 + 1;
                    solveLinearSystem(constraintWidgetContainer, "intermediate pass", i34, i31, i32);
                    basicMeasure = this;
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    i33 = 2;
                    z18 = false;
                }
            } else {
                j12 = r3;
            }
            constraintWidgetContainer2.setOptimizationLevel(optimizationLevel);
            r3 = j12;
        }
        return constraintWidgetContainer2.mMetrics != null ? System.nanoTime() - r3 : r3;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i11);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }
}
