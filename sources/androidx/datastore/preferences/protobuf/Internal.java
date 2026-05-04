package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final Charset US_ASCII = Charset.forName("US-ASCII");
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
        ProtobufList<Boolean> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        boolean setBoolean(int index, boolean element);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Double> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        double setDouble(int index, double element);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface EnumLite {
        int getNumber();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int number);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface EnumVerifier {
        boolean isInRange(int number);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Float> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        float setFloat(int index, float element);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Integer> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        int setInt(int index, int element);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IntListAdapter<T> extends AbstractList<T> {
        private final IntConverter<T> converter;
        private final IntList fromList;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface IntConverter<T> {
            T convert(int from);
        }

        public IntListAdapter(IntList fromList, IntConverter<T> converter) {
            this.fromList = fromList;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int index) {
            return this.converter.convert(this.fromList.getInt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface Converter<F, T> {
            T convert(F from);
        }

        public ListAdapter(List<F> fromList, Converter<F, T> converter) {
            this.fromList = fromList;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i11) {
            return (T) this.converter.convert(this.fromList.get(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<Long> mutableCopyWithCapacity2(int capacity);

        @CanIgnoreReturnValue
        long setLong(int index, long element);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface Converter<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;

            public EntryAdapter(Map.Entry<K, RealValue> realEntry) {
                this.realEntry = realEntry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object o11) {
                if (o11 == this) {
                    return true;
                }
                return (o11 instanceof Map.Entry) && getKey().equals(((Map.Entry) o11).getKey()) && getValue().equals(getValue());
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v11) {
                Object value = this.realEntry.setValue(MapAdapter.this.valueConverter.doBackward(v11));
                if (value == null) {
                    return null;
                }
                return (V) MapAdapter.this.valueConverter.doForward(value);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;

            public IteratorAdapter(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.realIterator = realIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.realIterator.next());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;

            public SetAdapter(Set<Map.Entry<K, RealValue>> realSet) {
                this.realSet = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        public MapAdapter(Map<K, RealValue> realMap, Converter<RealValue, V> valueConverter) {
            this.realMap = realMap;
            this.valueConverter = valueConverter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(final EnumLiteMap<T> enumLiteMap, final T t11) {
            return (Converter<Integer, T>) new Converter<Integer, T>() { // from class: androidx.datastore.preferences.protobuf.Internal.MapAdapter.1
                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public Integer doBackward(EnumLite value) {
                    return Integer.valueOf(value.getNumber());
                }

                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public EnumLite doForward(Integer value) {
                    EnumLite findValueByNumber = EnumLiteMap.this.findValueByNumber(value.intValue());
                    return findValueByNumber == null ? t11 : findValueByNumber;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this.realMap.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.realMap.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k11, V v11) {
            Object put = this.realMap.put(k11, this.valueConverter.doBackward(v11));
            if (put == null) {
                return null;
            }
            return (V) this.valueConverter.doForward(put);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* renamed from: mutableCopyWithCapacity */
        ProtobufList<E> mutableCopyWithCapacity2(int capacity);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String bytes) {
        return bytes.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String bytes) {
        return ByteBuffer.wrap(byteArrayDefaultValue(bytes));
    }

    public static ByteString bytesDefaultValue(String bytes) {
        return ByteString.copyFrom(bytes.getBytes(ISO_8859_1));
    }

    public static <T> T checkNotNull(T obj) {
        obj.getClass();
        return obj;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer source) {
        ByteBuffer duplicate = source.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean equals(List<byte[]> a11, List<byte[]> b11) {
        if (a11.size() != b11.size()) {
            return false;
        }
        for (int i11 = 0; i11 < a11.size(); i11++) {
            if (!Arrays.equals(a11.get(i11), b11.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer a11, ByteBuffer b11) {
        if (a11.capacity() != b11.capacity()) {
            return false;
        }
        ByteBuffer duplicate = a11.duplicate();
        Java8Compatibility.clear(duplicate);
        ByteBuffer duplicate2 = b11.duplicate();
        Java8Compatibility.clear(duplicate2);
        return duplicate.equals(duplicate2);
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> clazz) {
        try {
            java.lang.reflect.Method method = clazz.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e11) {
            throw new RuntimeException("Failed to get default instance for " + clazz, e11);
        }
    }

    public static int hashBoolean(boolean b11) {
        return b11 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            i11 = (i11 * 31) + hashCode(it.next());
        }
        return i11;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            i11 = (i11 * 31) + hashCodeByteBuffer(it.next());
        }
        return i11;
    }

    public static int hashEnum(EnumLite e11) {
        return e11.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        Iterator<? extends EnumLite> it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            i11 = (i11 * 31) + hashEnum(it.next());
        }
        return i11;
    }

    public static int hashLong(long n11) {
        return (int) (n11 ^ (n11 >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static Object mergeMessage(Object destination, Object source) {
        return ((MessageLite) destination).toBuilder().mergeFrom((MessageLite) source).buildPartial();
    }

    public static int partialHash(int h11, byte[] bytes, int offset, int length) {
        for (int i11 = offset; i11 < offset + length; i11++) {
            h11 = (h11 * 31) + bytes[i11];
        }
        return h11;
    }

    public static String stringDefaultValue(String bytes) {
        return new String(bytes.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String value) {
        return value.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bytes) {
        return new String(bytes, UTF_8);
    }

    public static <T> T checkNotNull(T obj, String message) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(message);
    }

    public static boolean isValidUtf8(byte[] byteArray) {
        return Utf8.isValidUtf8(byteArray);
    }

    public static int hashCode(byte[] bytes) {
        return hashCode(bytes, 0, bytes.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int partialHash = partialHash(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (partialHash == 0) {
                return 1;
            }
            return partialHash;
        }
        int capacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = bytes.duplicate();
        Java8Compatibility.clear(duplicate);
        int capacity2 = bytes.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = partialHash(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    public static int hashCode(byte[] bytes, int offset, int length) {
        int partialHash = partialHash(length, bytes, offset, length);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> a11, List<ByteBuffer> b11) {
        if (a11.size() != b11.size()) {
            return false;
        }
        for (int i11 = 0; i11 < a11.size(); i11++) {
            if (!equalsByteBuffer(a11.get(i11), b11.get(i11))) {
                return false;
            }
        }
        return true;
    }
}
