package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class DimensionDependency extends DependencyNode {
    public int wrapValue;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.mType = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.mType = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void resolve(int i11) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i11;
        for (Dependency dependency : this.mDependencies) {
            dependency.update(dependency);
        }
    }
}
