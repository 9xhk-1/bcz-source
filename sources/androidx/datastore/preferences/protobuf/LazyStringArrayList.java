package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    @Deprecated
    public static final LazyStringList EMPTY;
    private static final LazyStringArrayList EMPTY_LIST;
    private final List<Object> list;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteArrayListView(LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, byte[] s11) {
            this.list.add(index, s11);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int index) {
            return this.list.getByteArray(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int index) {
            String remove = this.list.remove(index);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int index, byte[] s11) {
            Object andReturn = this.list.setAndReturn(index, s11);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(andReturn);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteStringListView(LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, ByteString s11) {
            this.list.add(index, s11);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString get(int index) {
            return this.list.getByteString(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString remove(int index) {
            String remove = this.list.remove(index);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString set(int index, ByteString s11) {
            Object andReturn = this.list.setAndReturn(index, s11);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(andReturn);
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(false);
        EMPTY_LIST = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object o11) {
        return o11 instanceof byte[] ? (byte[]) o11 : o11 instanceof String ? Internal.toByteArray((String) o11) : ((ByteString) o11).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString asByteString(Object o11) {
        return o11 instanceof ByteString ? (ByteString) o11 : o11 instanceof String ? ByteString.copyFromUtf8((String) o11) : ByteString.copyFrom((byte[]) o11);
    }

    private static String asString(Object o11) {
        return o11 instanceof String ? (String) o11 : o11 instanceof ByteString ? ((ByteString) o11).toStringUtf8() : Internal.toStringUtf8((byte[]) o11);
    }

    public static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, ByteString s11) {
        ensureIsMutable();
        return this.list.set(index, s11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> c11) {
        return addAll(size(), c11);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> c11) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(c11);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> values) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(values);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new ByteArrayListView(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new ByteStringListView(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object o11) {
        return super.equals(o11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int index) {
        Object obj = this.list.get(index);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(index, asByteArray);
        }
        return asByteArray;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int index) {
        Object obj = this.list.get(index);
        ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(index, asByteString);
        }
        return asByteString;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int index) {
        return this.list.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList other) {
        ensureIsMutable();
        for (Object obj : other.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection c11) {
        return super.removeAll(c11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection c11) {
        return super.retainAll(c11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    private LazyStringArrayList(boolean isMutable) {
        super(isMutable);
        this.list = Collections.EMPTY_LIST;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends String> c11) {
        ensureIsMutable();
        if (c11 instanceof LazyStringList) {
            c11 = ((LazyStringList) c11).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(index, c11);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int index) {
        Object obj = this.list.get(index);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(index, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(index, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public LazyStringArrayList mutableCopyWithCapacity2(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(capacity);
        arrayList.addAll(this.list);
        return new LazyStringArrayList((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object o11) {
        return super.remove(o11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String set(int index, String s11) {
        ensureIsMutable();
        return asString(this.list.set(index, s11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, byte[] s11) {
        ensureIsMutable();
        return this.list.set(index, s11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, String element) {
        ensureIsMutable();
        this.list.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String remove(int index) {
        ensureIsMutable();
        Object remove = this.list.remove(index);
        ((AbstractList) this).modCount++;
        return asString(remove);
    }

    public LazyStringArrayList(int initialCapacity) {
        this((ArrayList<Object>) new ArrayList(initialCapacity));
    }

    public LazyStringArrayList(LazyStringList from) {
        this.list = new ArrayList(from.size());
        addAll(from);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int index, ByteString s11) {
        setAndReturn(index, s11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, ByteString element) {
        ensureIsMutable();
        this.list.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int index, byte[] s11) {
        setAndReturn(index, s11);
    }

    public LazyStringArrayList(List<String> from) {
        this((ArrayList<Object>) new ArrayList(from));
    }

    private LazyStringArrayList(ArrayList<Object> list) {
        this.list = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, byte[] element) {
        ensureIsMutable();
        this.list.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @CanIgnoreReturnValue
    public boolean add(String element) {
        ensureIsMutable();
        this.list.add(element);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString element) {
        ensureIsMutable();
        this.list.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] element) {
        ensureIsMutable();
        this.list.add(element);
        ((AbstractList) this).modCount++;
    }
}
