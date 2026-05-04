package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import java.util.List;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, a {
    private final Iterator<VectorNode> it;

    public VectorGroup$iterator$1(VectorGroup vectorGroup) {
        List list;
        list = vectorGroup.children;
        this.it = list.iterator();
    }

    public final Iterator<VectorNode> getIt() {
        return this.it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.it.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public VectorNode next() {
        return this.it.next();
    }
}
