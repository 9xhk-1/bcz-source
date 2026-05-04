package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.u0;
import y00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,677:1\n1#2:678\n*E\n"})
/* loaded from: classes3.dex */
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, d {
    private int index = -1;
    final /* synthetic */ NavGraph this$0;
    private boolean wentToNext;

    public NavGraph$iterator$1(NavGraph navGraph) {
        this.this$0 = navGraph;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index + 1 < this.this$0.getNodes().size();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.wentToNext) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
        nodes.valueAt(this.index).setParent(null);
        nodes.removeAt(this.index);
        this.index--;
        this.wentToNext = false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public NavDestination next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.wentToNext = true;
        SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
        int i11 = this.index + 1;
        this.index = i11;
        return nodes.valueAt(i11);
    }
}
