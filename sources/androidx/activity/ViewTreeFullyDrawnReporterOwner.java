package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ViewTreeFullyDrawnReporterOwner")
/* loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    @m80.l
    @w00.j(name = ct.d.f46852f)
    public static final FullyDrawnReporterOwner get(@m80.k View view) {
        g0.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.report_drawn);
            FullyDrawnReporterOwner fullyDrawnReporterOwner = tag instanceof FullyDrawnReporterOwner ? (FullyDrawnReporterOwner) tag : null;
            if (fullyDrawnReporterOwner != null) {
                return fullyDrawnReporterOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    @w00.j(name = ct.d.f46854h)
    public static final void set(@m80.k View view, @m80.k FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        g0.p(view, "<this>");
        g0.p(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
