package androidx.compose.runtime;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, y00.a {
    final /* synthetic */ int $end;
    private int current;
    final /* synthetic */ SlotWriter this$0;

    public SlotWriter$groupSlots$1(int i11, int i12, SlotWriter slotWriter) {
        this.$end = i12;
        this.this$0 = slotWriter;
        this.current = i11;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.$end;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object[] objArr = this.this$0.slots;
        SlotWriter slotWriter = this.this$0;
        int i11 = this.current;
        this.current = i11 + 1;
        return objArr[slotWriter.dataIndexToDataAddress(i11)];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i11) {
        this.current = i11;
    }
}
