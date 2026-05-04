package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.f9;
import com.google.common.collect.s9;
import com.google.common.collect.u6;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class ArrayTable<R, C, V> extends q<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;

    @CheckForNull
    @vo.b
    private transient ArrayTable<R, C, V>.f columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;

    @CheckForNull
    @vo.b
    private transient ArrayTable<R, C, V>.h rowMap;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.google.common.collect.b<f9.a<R, C, V>> {
        public a(int size) {
            super(size);
        }

        @Override // com.google.common.collect.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f9.a<R, C, V> a(final int index) {
            return ArrayTable.this.getCell(index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends s9.b<R, C, V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f32941a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32942b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32943c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayTable f32944d;

        public b(final ArrayTable this$0, final int val$index) {
            this.f32943c = val$index;
            this.f32944d = this$0;
            this.f32941a = val$index / this$0.columnList.size();
            this.f32942b = val$index % this$0.columnList.size();
        }

        @Override // com.google.common.collect.f9.a
        public C a() {
            return (C) this.f32944d.columnList.get(this.f32942b);
        }

        @Override // com.google.common.collect.f9.a
        public R b() {
            return (R) this.f32944d.rowList.get(this.f32941a);
        }

        @Override // com.google.common.collect.f9.a
        @CheckForNull
        public V getValue() {
            return (V) this.f32944d.at(this.f32941a, this.f32942b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends com.google.common.collect.b<V> {
        public c(int size) {
            super(size);
        }

        @Override // com.google.common.collect.b
        @CheckForNull
        public V a(int i11) {
            return (V) ArrayTable.this.getValue(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d<K, V> extends u6.a0<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<K, Integer> f32946a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.g<K, V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f32947a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f32948b;

            public a(final d this$0, final int val$index) {
                this.f32947a = val$index;
                this.f32948b = this$0;
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            public K getKey() {
                return (K) this.f32948b.g(this.f32947a);
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            @t7
            public V getValue() {
                return (V) this.f32948b.i(this.f32947a);
            }

            @Override // com.google.common.collect.g, java.util.Map.Entry
            @t7
            public V setValue(@t7 V v11) {
                return (V) this.f32948b.j(this.f32947a, v11);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.b<Map.Entry<K, V>> {
            public b(int size) {
                super(size);
            }

            @Override // com.google.common.collect.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(final int index) {
                return d.this.d(index);
            }
        }

        public /* synthetic */ d(ImmutableMap immutableMap, a aVar) {
            this(immutableMap);
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<K, V>> b() {
            return new b(size());
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.f32946a.containsKey(key);
        }

        public Map.Entry<K, V> d(final int index) {
            Preconditions.checkElementIndex(index, size());
            return new a(this, index);
        }

        public K g(int index) {
            return this.f32946a.keySet().asList().get(index);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object key) {
            Integer num = this.f32946a.get(key);
            if (num == null) {
                return null;
            }
            return i(num.intValue());
        }

        public abstract String h();

        @t7
        public abstract V i(int index);

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f32946a.isEmpty();
        }

        @t7
        public abstract V j(int index, @t7 V newValue);

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f32946a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(K key, @t7 V value) {
            Integer num = this.f32946a.get(key);
            if (num != null) {
                return j(num.intValue(), value);
            }
            throw new IllegalArgumentException(h() + " " + key + " not in " + this.f32946a.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f32946a.size();
        }

        public d(ImmutableMap<K, Integer> keyIndex) {
            this.f32946a = keyIndex;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends d<R, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f32950b;

        public e(int columnIndex) {
            super(ArrayTable.this.rowKeyToIndex, null);
            this.f32950b = columnIndex;
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String h() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        public V i(int i11) {
            return (V) ArrayTable.this.at(i11, this.f32950b);
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        public V j(int i11, @CheckForNull V v11) {
            return (V) ArrayTable.this.set(i11, this.f32950b, v11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends d<C, Map<R, V>> {
        public /* synthetic */ f(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String h() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<R, V> i(int index) {
            return new e(index);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C key, Map<R, V> value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Map<R, V> j(int index, Map<R, V> newValue) {
            throw new UnsupportedOperationException();
        }

        public f() {
            super(ArrayTable.this.columnKeyToIndex, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends d<C, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f32953b;

        public g(int rowIndex) {
            super(ArrayTable.this.columnKeyToIndex, null);
            this.f32953b = rowIndex;
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String h() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        public V i(int i11) {
            return (V) ArrayTable.this.at(this.f32953b, i11);
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        public V j(int i11, @CheckForNull V v11) {
            return (V) ArrayTable.this.set(this.f32953b, i11, v11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends d<R, Map<C, V>> {
        public /* synthetic */ h(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String h() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<C, V> i(int index) {
            return new g(index);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R key, Map<C, V> value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Map<C, V> j(int index, Map<C, V> newValue) {
            throw new UnsupportedOperationException();
        }

        public h() {
            super(ArrayTable.this.rowKeyToIndex, null);
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> copyOf = ImmutableList.copyOf(iterable);
        this.rowList = copyOf;
        ImmutableList<C> copyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = copyOf2;
        Preconditions.checkArgument(copyOf.isEmpty() == copyOf2.isEmpty());
        this.rowKeyToIndex = u6.Q(copyOf);
        this.columnKeyToIndex = u6.Q(copyOf2);
        this.array = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, copyOf.size(), copyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> rowKeys, Iterable<? extends C> columnKeys) {
        return new ArrayTable<>(rowKeys, columnKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f9.a<R, C, V> getCell(final int index) {
        return new b(this, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public V getValue(int index) {
        return at(index / this.columnList.size(), index % this.columnList.size());
    }

    @CheckForNull
    public V at(int rowIndex, int columnIndex) {
        Preconditions.checkElementIndex(rowIndex, this.rowList.size());
        Preconditions.checkElementIndex(columnIndex, this.columnList.size());
        return this.array[rowIndex][columnIndex];
    }

    @Override // com.google.common.collect.q
    public Iterator<f9.a<R, C, V>> cellIterator() {
        return new a(size());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public Set<f9.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f9
    public Map<R, V> column(C columnKey) {
        Preconditions.checkNotNull(columnKey);
        Integer num = this.columnKeyToIndex.get(columnKey);
        return num == null ? Collections.EMPTY_MAP : new e(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    @Override // com.google.common.collect.f9
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.f fVar = this.columnMap;
        if (fVar != null) {
            return fVar;
        }
        ArrayTable<R, C, V>.f fVar2 = new f(this, null);
        this.columnMap = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return containsRow(rowKey) && containsColumn(columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean containsColumn(@CheckForNull Object columnKey) {
        return this.columnKeyToIndex.containsKey(columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean containsRow(@CheckForNull Object rowKey) {
        return this.rowKeyToIndex.containsKey(rowKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean containsValue(@CheckForNull Object value) {
        for (V[] vArr : this.array) {
            for (V v11 : vArr) {
                if (ho.d0.a(value, v11)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @CheckForNull
    @uo.a
    public V erase(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        Integer num = this.rowKeyToIndex.get(rowKey);
        Integer num2 = this.columnKeyToIndex.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.array) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        Integer num = this.rowKeyToIndex.get(rowKey);
        Integer num2 = this.columnKeyToIndex.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public V put(R rowKey, C columnKey, @CheckForNull V value) {
        Preconditions.checkNotNull(rowKey);
        Preconditions.checkNotNull(columnKey);
        Integer num = this.rowKeyToIndex.get(rowKey);
        Preconditions.checkArgument(num != null, "Row %s not in %s", rowKey, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(columnKey);
        Preconditions.checkArgument(num2 != null, "Column %s not in %s", columnKey, this.columnList);
        return set(num.intValue(), num2.intValue(), value);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public void putAll(f9<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f9
    public Map<C, V> row(R rowKey) {
        Preconditions.checkNotNull(rowKey);
        Integer num = this.rowKeyToIndex.get(rowKey);
        return num == null ? Collections.EMPTY_MAP : new g(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    @Override // com.google.common.collect.f9
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.h hVar = this.rowMap;
        if (hVar != null) {
            return hVar;
        }
        ArrayTable<R, C, V>.h hVar2 = new h(this, null);
        this.rowMap = hVar2;
        return hVar2;
    }

    @CheckForNull
    @uo.a
    public V set(int rowIndex, int columnIndex, @CheckForNull V value) {
        Preconditions.checkElementIndex(rowIndex, this.rowList.size());
        Preconditions.checkElementIndex(columnIndex, this.columnList.size());
        V[] vArr = this.array[rowIndex];
        V v11 = vArr[columnIndex];
        vArr[columnIndex] = value;
        return v11;
    }

    @Override // com.google.common.collect.f9
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    @go.c
    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i11 = 0; i11 < this.rowList.size(); i11++) {
            V[] vArr2 = this.array[i11];
            System.arraycopy(vArr2, 0, vArr[i11], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.q
    public Iterator<V> valuesIterator() {
        return new c(size());
    }

    public static <R, C, V> ArrayTable<R, C, V> create(f9<R, C, ? extends V> table) {
        return table instanceof ArrayTable ? new ArrayTable<>((ArrayTable) table) : new ArrayTable<>(table);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(f9<R, C, ? extends V> table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableList.size(), immutableList2.size()));
        this.array = vArr;
        for (int i11 = 0; i11 < this.rowList.size(); i11++) {
            V[] vArr2 = arrayTable.array[i11];
            System.arraycopy(vArr2, 0, vArr[i11], 0, vArr2.length);
        }
    }
}
