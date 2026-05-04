package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class RegionKt$iterator$1 implements Iterator<Rect>, y00.a {
    private boolean hasMore;

    @m80.k
    private final RegionIterator iterator;

    @m80.k
    private final Rect rect;

    public RegionKt$iterator$1(Region region) {
        RegionIterator regionIterator = new RegionIterator(region);
        this.iterator = regionIterator;
        Rect rect = new Rect();
        this.rect = rect;
        this.hasMore = regionIterator.next(rect);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasMore;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @m80.k
    public Rect next() {
        if (!this.hasMore) {
            throw new IndexOutOfBoundsException();
        }
        Rect rect = new Rect(this.rect);
        this.hasMore = this.iterator.next(this.rect);
        return rect;
    }
}
