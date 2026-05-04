package androidx.compose.ui.tooling.data;

import a00.h0;
import a00.m;
import a00.m0;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.f0;
import u30.k0;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UiToolingDataApi
@u0({"SMAP\nSlotTree.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/CompositionCallStack\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,822:1\n1855#2,2:823\n1#3:825\n372#4,7:826\n*S KotlinDebug\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/CompositionCallStack\n*L\n559#1:823,2\n626#1:826,7\n*E\n"})
/* loaded from: classes2.dex */
final class CompositionCallStack<T> implements SourceContext {

    @k
    private final Map<String, Object> contexts;
    private int currentCallIndex;

    @k
    private final q<CompositionGroup, SourceContext, List<? extends T>, T> factory;

    @k
    private final m<CompositionGroup> stack = new m<>();

    @k
    private IntRect bounds = SlotTreeKt.getEmptyBox();

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionCallStack(@k q<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> qVar, @k Map<String, Object> map) {
        this.factory = qVar;
        this.contexts = map;
    }

    private final SourceInformationContext contextOf(String str) {
        Map<String, Object> map = this.contexts;
        Object obj = map.get(str);
        if (obj == null) {
            obj = SlotTreeKt.sourceInformationContextOf$default(str, null, 2, null);
            map.put(str, obj);
        }
        if (obj instanceof SourceInformationContext) {
            return (SourceInformationContext) obj;
        }
        return null;
    }

    private final CompositionGroup getCurrent() {
        return this.stack.last();
    }

    private final boolean isCall(CompositionGroup compositionGroup) {
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo != null) {
            return f0.J2(sourceInfo, "C", false, 2, null);
        }
        return false;
    }

    private final CompositionGroup parentGroup(int i11) {
        if (this.stack.size() <= i11) {
            return null;
        }
        return this.stack.get((r0.size() - i11) - 1);
    }

    private final CompositionGroup pop() {
        return this.stack.removeLast();
    }

    private final void push(CompositionGroup compositionGroup) {
        this.stack.addLast(compositionGroup);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r2 = androidx.compose.ui.tooling.data.SlotTreeKt.boundsOfLayoutNode(r2);
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.unit.IntRect convert(@m80.k androidx.compose.runtime.tooling.CompositionGroup r7, int r8, @m80.k java.util.List<T> r9) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.compose.ui.unit.IntRect r1 = androidx.compose.ui.tooling.data.SlotTreeKt.getEmptyBox()
            r6.push(r7)
            java.lang.Iterable r2 = r7.getCompositionGroups()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L15:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r2.next()
            androidx.compose.runtime.tooling.CompositionGroup r4 = (androidx.compose.runtime.tooling.CompositionGroup) r4
            androidx.compose.ui.unit.IntRect r5 = r6.convert(r4, r3, r0)
            androidx.compose.ui.unit.IntRect r1 = androidx.compose.ui.tooling.data.SlotTreeKt.union(r1, r5)
            boolean r4 = r6.isCall(r4)
            if (r4 == 0) goto L15
            int r3 = r3 + 1
            goto L15
        L32:
            java.lang.Object r2 = r7.getNode()
            boolean r3 = r2 instanceof androidx.compose.ui.layout.LayoutInfo
            if (r3 == 0) goto L3d
            androidx.compose.ui.layout.LayoutInfo r2 = (androidx.compose.ui.layout.LayoutInfo) r2
            goto L3e
        L3d:
            r2 = 0
        L3e:
            if (r2 == 0) goto L48
            androidx.compose.ui.unit.IntRect r2 = androidx.compose.ui.tooling.data.SlotTreeKt.access$boundsOfLayoutNode(r2)
            if (r2 != 0) goto L47
            goto L48
        L47:
            r1 = r2
        L48:
            r6.currentCallIndex = r8
            r6.bounds = r1
            x00.q<androidx.compose.runtime.tooling.CompositionGroup, androidx.compose.ui.tooling.data.SourceContext, java.util.List<? extends T>, T> r8 = r6.factory
            java.lang.Object r7 = r8.invoke(r7, r6, r0)
            if (r7 == 0) goto L57
            r9.add(r7)
        L57:
            r6.pop()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.CompositionCallStack.convert(androidx.compose.runtime.tooling.CompositionGroup, int, java.util.List):androidx.compose.ui.unit.IntRect");
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    @k
    public IntRect getBounds() {
        return this.bounds;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public int getDepth() {
        return this.stack.size();
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    @l
    public SourceLocation getLocation() {
        String sourceInfo;
        SourceInformationContext contextOf;
        String sourceInfo2;
        CompositionGroup parentGroup = parentGroup(1);
        if (parentGroup == null || (sourceInfo = parentGroup.getSourceInfo()) == null || (contextOf = contextOf(sourceInfo)) == null) {
            return null;
        }
        int i11 = 2;
        SourceInformationContext sourceInformationContext = contextOf;
        while (i11 < this.stack.size()) {
            if ((sourceInformationContext != null ? sourceInformationContext.getSourceFile() : null) != null) {
                break;
            }
            int i12 = i11 + 1;
            CompositionGroup parentGroup2 = parentGroup(i11);
            sourceInformationContext = (parentGroup2 == null || (sourceInfo2 = parentGroup2.getSourceInfo()) == null) ? null : contextOf(sourceInfo2);
            i11 = i12;
        }
        return contextOf.sourceLocation(this.currentCallIndex, sourceInformationContext);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    @l
    public String getName() {
        int i11;
        String sourceInfo = getCurrent().getSourceInfo();
        if (sourceInfo == null) {
            return null;
        }
        if (f0.J2(sourceInfo, "CC(", false, 2, null)) {
            i11 = 3;
        } else {
            if (!f0.J2(sourceInfo, "C(", false, 2, null)) {
                return null;
            }
            i11 = 2;
        }
        int I3 = k0.I3(sourceInfo, ')', 0, false, 6, null);
        if (I3 <= 2) {
            return null;
        }
        String substring = sourceInfo.substring(i11, I3);
        g0.o(substring, "substring(...)");
        return substring;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    @k
    public List<ParameterInformation> getParameters() {
        SourceInformationContext contextOf;
        List<ParameterInformation> extractParameterInfo;
        CompositionGroup current = getCurrent();
        String sourceInfo = current.getSourceInfo();
        if (sourceInfo == null || (contextOf = contextOf(sourceInfo)) == null) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        m0.s0(arrayList, current.getData());
        extractParameterInfo = SlotTreeKt.extractParameterInfo(arrayList, contextOf);
        return extractParameterInfo;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public boolean isInline() {
        String sourceInfo = getCurrent().getSourceInfo();
        return sourceInfo != null && f0.J2(sourceInfo, "CC", false, 2, null);
    }
}
