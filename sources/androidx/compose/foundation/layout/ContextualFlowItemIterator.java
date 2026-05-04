package androidx.compose.foundation.layout;

import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ContextualFlowItemIterator implements Iterator<Measurable>, y00.a {
    public static final int $stable = 8;

    @m80.k
    private final List<Measurable> _list = new ArrayList();

    @m80.k
    private final p<Integer, FlowLineInfo, List<Measurable>> getMeasurables;
    private final int itemCount;
    private int itemIndex;
    private int listIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextualFlowItemIterator(int i11, @m80.k p<? super Integer, ? super FlowLineInfo, ? extends List<? extends Measurable>> pVar) {
        this.itemCount = i11;
        this.getMeasurables = pVar;
    }

    public static /* synthetic */ Measurable getNext$foundation_layout_release$default(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            flowLineInfo = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.getNext$foundation_layout_release(flowLineInfo);
    }

    @m80.k
    public final List<Measurable> getList() {
        return this._list;
    }

    @m80.k
    public final Measurable getNext$foundation_layout_release(@m80.k FlowLineInfo flowLineInfo) {
        if (this.listIndex < getList().size()) {
            Measurable measurable = getList().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i11 = this.itemIndex;
        if (i11 >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List<Measurable> invoke = this.getMeasurables.invoke(Integer.valueOf(i11), flowLineInfo);
        this.itemIndex++;
        if (invoke.isEmpty()) {
            return next();
        }
        Measurable measurable2 = (Measurable) r0.G2(invoke);
        this._list.addAll(invoke);
        this.listIndex++;
        return measurable2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < getList().size() || this.itemIndex < this.itemCount;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @m80.k
    public Measurable next() {
        return getNext$foundation_layout_release$default(this, null, 1, null);
    }
}
