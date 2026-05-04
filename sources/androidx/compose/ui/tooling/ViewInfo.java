package androidx.compose.ui.tooling;

import a00.m0;
import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1360#2:643\n1446#2,5:644\n1#3:649\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n*L\n97#1:643\n97#1:644,5\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewInfo {
    public static final int $stable = 8;

    @k
    private final IntRect bounds;

    @k
    private final List<ViewInfo> children;

    @k
    private final String fileName;

    @l
    private final Object layoutInfo;
    private final int lineNumber;

    @l
    private final SourceLocation location;

    public ViewInfo(@k String str, int i11, @k IntRect intRect, @l SourceLocation sourceLocation, @k List<ViewInfo> list, @l Object obj) {
        this.fileName = str;
        this.lineNumber = i11;
        this.bounds = intRect;
        this.location = sourceLocation;
        this.children = list;
        this.layoutInfo = obj;
    }

    public static /* synthetic */ ViewInfo copy$default(ViewInfo viewInfo, String str, int i11, IntRect intRect, SourceLocation sourceLocation, List list, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = viewInfo.fileName;
        }
        if ((i12 & 2) != 0) {
            i11 = viewInfo.lineNumber;
        }
        if ((i12 & 4) != 0) {
            intRect = viewInfo.bounds;
        }
        if ((i12 & 8) != 0) {
            sourceLocation = viewInfo.location;
        }
        if ((i12 & 16) != 0) {
            list = viewInfo.children;
        }
        if ((i12 & 32) != 0) {
            obj = viewInfo.layoutInfo;
        }
        List list2 = list;
        Object obj3 = obj;
        return viewInfo.copy(str, i11, intRect, sourceLocation, list2, obj3);
    }

    @k
    public final List<ViewInfo> allChildren() {
        List<ViewInfo> list = this.children;
        List<ViewInfo> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((ViewInfo) it.next()).allChildren());
        }
        return r0.I4(list2, arrayList);
    }

    @k
    public final String component1() {
        return this.fileName;
    }

    public final int component2() {
        return this.lineNumber;
    }

    @k
    public final IntRect component3() {
        return this.bounds;
    }

    @l
    public final SourceLocation component4() {
        return this.location;
    }

    @k
    public final List<ViewInfo> component5() {
        return this.children;
    }

    @l
    public final Object component6() {
        return this.layoutInfo;
    }

    @k
    public final ViewInfo copy(@k String str, int i11, @k IntRect intRect, @l SourceLocation sourceLocation, @k List<ViewInfo> list, @l Object obj) {
        return new ViewInfo(str, i11, intRect, sourceLocation, list, obj);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        return g0.g(this.fileName, viewInfo.fileName) && this.lineNumber == viewInfo.lineNumber && g0.g(this.bounds, viewInfo.bounds) && g0.g(this.location, viewInfo.location) && g0.g(this.children, viewInfo.children) && g0.g(this.layoutInfo, viewInfo.layoutInfo);
    }

    @k
    public final IntRect getBounds() {
        return this.bounds;
    }

    @k
    public final List<ViewInfo> getChildren() {
        return this.children;
    }

    @k
    public final String getFileName() {
        return this.fileName;
    }

    @l
    public final Object getLayoutInfo() {
        return this.layoutInfo;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    @l
    public final SourceLocation getLocation() {
        return this.location;
    }

    public final boolean hasBounds() {
        return (this.bounds.getBottom() == 0 || this.bounds.getRight() == 0) ? false : true;
    }

    public int hashCode() {
        int hashCode = ((((this.fileName.hashCode() * 31) + Integer.hashCode(this.lineNumber)) * 31) + this.bounds.hashCode()) * 31;
        SourceLocation sourceLocation = this.location;
        int hashCode2 = (((hashCode + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31) + this.children.hashCode()) * 31;
        Object obj = this.layoutInfo;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005d, code lost:
    
        if (r1 == null) goto L6;
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            java.lang.String r2 = r4.fileName
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r4.lineNumber
            r0.append(r2)
            java.lang.String r2 = ",\n            |bounds=(top="
            r0.append(r2)
            androidx.compose.ui.unit.IntRect r2 = r4.bounds
            int r2 = r2.getTop()
            r0.append(r2)
            java.lang.String r2 = ", left="
            r0.append(r2)
            androidx.compose.ui.unit.IntRect r2 = r4.bounds
            int r2 = r2.getLeft()
            r0.append(r2)
            java.lang.String r2 = ",\n            |location="
            r0.append(r2)
            androidx.compose.ui.tooling.data.SourceLocation r2 = r4.location
            if (r2 == 0) goto L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            int r1 = r2.getOffset()
            r3.append(r1)
            r1 = 76
            r3.append(r1)
            int r1 = r2.getLength()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r1 != 0) goto L61
        L5f:
            java.lang.String r1 = "<none>"
        L61:
            r0.append(r1)
            java.lang.String r1 = "\n            |bottom="
            r0.append(r1)
            androidx.compose.ui.unit.IntRect r1 = r4.bounds
            int r1 = r1.getBottom()
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            androidx.compose.ui.unit.IntRect r1 = r4.bounds
            int r1 = r1.getRight()
            r0.append(r1)
            java.lang.String r1 = "),\n            |childrenCount="
            r0.append(r1)
            java.util.List<androidx.compose.ui.tooling.ViewInfo> r1 = r4.children
            int r1 = r1.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            r2 = 0
            java.lang.String r0 = u30.y.x(r0, r2, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.ViewInfo.toString():java.lang.String");
    }
}
