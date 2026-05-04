package androidx.compose.runtime.external.kotlinx.collections.immutable;

import a00.d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import m80.k;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SubList<E> extends d<E> implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;

        @k
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(@k ImmutableList<? extends E> immutableList, int i11, int i12) {
            this.source = immutableList;
            this.fromIndex = i11;
            this.toIndex = i12;
            ListImplementation.checkRangeIndexes$runtime_release(i11, i12, immutableList.size());
            this._size = i12 - i11;
        }

        @Override // a00.d, java.util.List
        public E get(int i11) {
            ListImplementation.checkElementIndex$runtime_release(i11, this._size);
            return this.source.get(this.fromIndex + i11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this._size;
        }

        @Override // a00.d, java.util.List
        @k
        public ImmutableList<E> subList(int i11, int i12) {
            ListImplementation.checkRangeIndexes$runtime_release(i11, i12, this._size);
            ImmutableList<E> immutableList = this.source;
            int i13 = this.fromIndex;
            return new SubList(immutableList, i11 + i13, i13 + i12);
        }
    }

    @Override // java.util.List
    @k
    default ImmutableList<E> subList(int i11, int i12) {
        return new SubList(this, i11, i12);
    }
}
