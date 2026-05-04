package androidx.compose.ui.tooling;

import a00.i0;
import a00.r0;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import q30.m;
import q30.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1549#2:116\n1620#2,3:117\n1549#2:120\n1620#2,3:121\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo\n*L\n34#1:116\n34#1:117,3\n61#1:120\n61#1:121,3\n*E\n"})
/* loaded from: classes2.dex */
final class ShadowViewInfo {

    @k
    private final List<ShadowViewInfo> _children;

    @k
    private final m<ShadowViewInfo> allNodes;

    @l
    private ShadowViewInfo parent;

    @k
    private final ViewInfo viewInfo;

    private ShadowViewInfo(ShadowViewInfo shadowViewInfo, ViewInfo viewInfo) {
        this.parent = shadowViewInfo;
        this.viewInfo = viewInfo;
        List<ViewInfo> children = viewInfo.getChildren();
        ArrayList arrayList = new ArrayList(i0.d0(children, 10));
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShadowViewInfo(this, (ViewInfo) it.next()));
        }
        this._children = r0.d6(arrayList);
        this.allNodes = q.b(new ShadowViewInfo$allNodes$1(this, null));
    }

    @k
    public final ShadowViewInfo findRoot() {
        ShadowViewInfo shadowViewInfo = this.parent;
        if (shadowViewInfo == null) {
            return this;
        }
        g0.m(shadowViewInfo);
        return shadowViewInfo.findRoot();
    }

    @k
    public final m<ShadowViewInfo> getAllNodes() {
        return this.allNodes;
    }

    @k
    public final List<ShadowViewInfo> getChildren() {
        return this._children;
    }

    @l
    public final LayoutInfo getLayoutInfo() {
        Object layoutInfo = this.viewInfo.getLayoutInfo();
        if (layoutInfo instanceof LayoutInfo) {
            return (LayoutInfo) layoutInfo;
        }
        return null;
    }

    @l
    public final ShadowViewInfo getParent() {
        return this.parent;
    }

    public final void setNewParent(@k ShadowViewInfo shadowViewInfo) {
        List<ShadowViewInfo> list;
        ShadowViewInfo shadowViewInfo2 = this.parent;
        if (shadowViewInfo2 != null && (list = shadowViewInfo2._children) != null) {
            list.remove(this);
        }
        shadowViewInfo._children.add(this);
        this.parent = shadowViewInfo;
    }

    public final void setParent(@l ShadowViewInfo shadowViewInfo) {
        this.parent = shadowViewInfo;
    }

    @k
    public final ViewInfo toViewInfo() {
        String fileName = this.viewInfo.getFileName();
        int lineNumber = this.viewInfo.getLineNumber();
        IntRect bounds = this.viewInfo.getBounds();
        SourceLocation location = this.viewInfo.getLocation();
        List<ShadowViewInfo> list = this._children;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ShadowViewInfo) it.next()).toViewInfo());
        }
        return new ViewInfo(fileName, lineNumber, bounds, location, arrayList, this.viewInfo.getLayoutInfo());
    }

    public ShadowViewInfo(@k ViewInfo viewInfo) {
        this(null, viewInfo);
    }
}
