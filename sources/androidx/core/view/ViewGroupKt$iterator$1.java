package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ViewGroupKt$iterator$1 implements Iterator<View>, y00.d {
    final /* synthetic */ ViewGroup $this_iterator;
    private int index;

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.$this_iterator = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_iterator.getChildCount();
    }

    @Override // java.util.Iterator
    public void remove() {
        ViewGroup viewGroup = this.$this_iterator;
        int i11 = this.index - 1;
        this.index = i11;
        viewGroup.removeViewAt(i11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @m80.k
    public View next() {
        ViewGroup viewGroup = this.$this_iterator;
        int i11 = this.index;
        this.index = i11 + 1;
        View childAt = viewGroup.getChildAt(i11);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }
}
