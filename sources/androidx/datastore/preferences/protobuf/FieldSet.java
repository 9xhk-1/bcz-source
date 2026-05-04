package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final FieldSet<?> DEFAULT_INSTANCE = new FieldSet<>(true);
    private final SmallSortedMap<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder<T extends FieldDescriptorLite<T>> {
        private SmallSortedMap<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private FieldSet<T> buildImpl(boolean partial) {
            if (this.fields.isEmpty()) {
                return FieldSet.emptySet();
            }
            this.isMutable = false;
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMap = FieldSet.cloneAllFieldsMap(smallSortedMap, false, false);
                replaceBuilders(smallSortedMap, partial);
            }
            FieldSet<T> fieldSet = new FieldSet<>(smallSortedMap, null);
            ((FieldSet) fieldSet).hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = FieldSet.cloneAllFieldsMap(this.fields, true, false);
            this.isMutable = true;
        }

        public static <T extends FieldDescriptorLite<T>> Builder<T> fromFieldSet(FieldSet<T> fieldSet) {
            Builder<T> builder = new Builder<>(FieldSet.cloneAllFieldsMap(((FieldSet) fieldSet).fields, true, false));
            ((Builder) builder).hasLazyField = ((FieldSet) fieldSet).hasLazyField;
            return builder;
        }

        private void mergeFromField(final Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            boolean z11 = value instanceof LazyField;
            if (key.isRepeated()) {
                if (z11) {
                    throw new IllegalStateException("Lazy fields can not be repeated");
                }
                List list = (List) getFieldAllowBuilders(key);
                List list2 = (List) value;
                int size = list2.size();
                if (list == null) {
                    list = new ArrayList(size);
                    this.fields.put((SmallSortedMap<T, Object>) key, (T) list);
                }
                for (int i11 = 0; i11 < size; i11++) {
                    list.add(FieldSet.cloneIfMutable(list2.get(i11)));
                }
                return;
            }
            if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                if (z11) {
                    throw new IllegalStateException("Lazy fields must be message-valued");
                }
                this.fields.put((SmallSortedMap<T, Object>) key, (T) FieldSet.cloneIfMutable(value));
                return;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put((SmallSortedMap<T, Object>) key, (T) FieldSet.cloneIfMutable(value));
                if (z11) {
                    this.hasLazyField = true;
                    return;
                }
                return;
            }
            if (z11) {
                value = ((LazyField) value).getValue();
            }
            if (fieldAllowBuilders instanceof MessageLite.Builder) {
                key.internalMergeFrom((MessageLite.Builder) fieldAllowBuilders, (MessageLite) value);
            } else {
                this.fields.put((SmallSortedMap<T, Object>) key, (T) key.internalMergeFrom(((MessageLite) fieldAllowBuilders).toBuilder(), (MessageLite) value).build());
            }
        }

        private static Object replaceBuilder(Object value, boolean partial) {
            if (!(value instanceof MessageLite.Builder)) {
                return value;
            }
            MessageLite.Builder builder = (MessageLite.Builder) value;
            return partial ? builder.buildPartial() : builder.build();
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(SmallSortedMap<T, Object> fieldMap, boolean partial) {
            int numArrayEntries = fieldMap.getNumArrayEntries();
            for (int i11 = 0; i11 < numArrayEntries; i11++) {
                replaceBuilders(fieldMap.getArrayEntryAt(i11), partial);
            }
            Iterator<Map.Entry<T, Object>> it = fieldMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders(it.next(), partial);
            }
        }

        private void verifyType(final T descriptor, final Object value) {
            if (FieldSet.isValidType(descriptor.getLiteType(), value)) {
                return;
            }
            if (descriptor.getLiteType().getJavaType() != WireFormat.JavaType.MESSAGE || !(value instanceof MessageLite.Builder)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
            }
        }

        public void addRepeatedField(final T descriptor, final Object value) {
            List list;
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (value instanceof MessageLite.Builder);
            verifyType(descriptor, value);
            Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders == null) {
                list = new ArrayList();
                this.fields.put((SmallSortedMap<T, Object>) descriptor, (T) list);
            } else {
                list = (List) fieldAllowBuilders;
            }
            list.add(value);
        }

        public FieldSet<T> build() {
            return buildImpl(false);
        }

        public FieldSet<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(final T descriptor) {
            ensureIsMutable();
            this.fields.remove(descriptor);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<T, Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
            }
            SmallSortedMap cloneAllFieldsMap = FieldSet.cloneAllFieldsMap(this.fields, false, true);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
                return cloneAllFieldsMap;
            }
            replaceBuilders(cloneAllFieldsMap, true);
            return cloneAllFieldsMap;
        }

        public Object getField(final T descriptor) {
            return replaceBuilders(descriptor, getFieldAllowBuilders(descriptor), true);
        }

        public Object getFieldAllowBuilders(final T descriptor) {
            Object obj = this.fields.get(descriptor);
            return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
        }

        public Object getRepeatedField(final T descriptor, final int index) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(descriptor, index), true);
        }

        public Object getRepeatedFieldAllowBuilders(final T descriptor, final int index) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(index);
            }
            throw new IndexOutOfBoundsException();
        }

        public int getRepeatedFieldCount(final T descriptor) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }

        public boolean hasField(final T descriptor) {
            if (descriptor.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(descriptor) != null;
        }

        public boolean isInitialized() {
            int numArrayEntries = this.fields.getNumArrayEntries();
            for (int i11 = 0; i11 < numArrayEntries; i11++) {
                if (!FieldSet.isInitialized(this.fields.getArrayEntryAt(i11))) {
                    return false;
                }
            }
            Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!FieldSet.isInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(final FieldSet<T> other) {
            ensureIsMutable();
            int numArrayEntries = ((FieldSet) other).fields.getNumArrayEntries();
            for (int i11 = 0; i11 < numArrayEntries; i11++) {
                mergeFromField(((FieldSet) other).fields.getArrayEntryAt(i11));
            }
            Iterator it = ((FieldSet) other).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(final T descriptor, Object value) {
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                verifyType(descriptor, value);
            } else {
                if (!(value instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) value);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = arrayList.get(i11);
                    verifyType(descriptor, obj);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
                }
                value = arrayList;
            }
            if (value instanceof LazyField) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (value instanceof MessageLite.Builder);
            this.fields.put((SmallSortedMap<T, Object>) descriptor, (T) value);
        }

        public void setRepeatedField(final T descriptor, final int index, final Object value) {
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (value instanceof MessageLite.Builder);
            Object fieldAllowBuilders = getFieldAllowBuilders(descriptor);
            if (fieldAllowBuilders == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(descriptor, value);
            ((List) fieldAllowBuilders).set(index, value);
        }

        private Builder() {
            this(SmallSortedMap.newFieldMap());
        }

        private Builder(SmallSortedMap<T, Object> fields) {
            this.fields = fields;
            this.isMutable = true;
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean partial) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), partial));
        }

        private static <T extends FieldDescriptorLite<T>> Object replaceBuilders(T descriptor, Object value, boolean partial) {
            if (value == null || descriptor.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                return value;
            }
            if (descriptor.isRepeated()) {
                if (value instanceof List) {
                    List list = (List) value;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Object obj = list.get(i11);
                        Object replaceBuilder = replaceBuilder(obj, partial);
                        if (replaceBuilder != obj) {
                            if (list == value) {
                                list = new ArrayList(list);
                            }
                            list.set(i11, replaceBuilder);
                        }
                    }
                    return list;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + value.getClass());
            }
            return replaceBuilder(value, partial);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder to2, MessageLite from);

        boolean isPacked();

        boolean isRepeated();
    }

    public /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> SmallSortedMap<T, Object> cloneAllFieldsMap(SmallSortedMap<T, Object> fields, boolean copyList, boolean resolveLazyFields) {
        SmallSortedMap<T, Object> newFieldMap = SmallSortedMap.newFieldMap();
        int numArrayEntries = fields.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            cloneFieldEntry(newFieldMap, fields.getArrayEntryAt(i11), copyList, resolveLazyFields);
        }
        Iterator<Map.Entry<T, Object>> it = fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, it.next(), copyList, resolveLazyFields);
        }
        return newFieldMap;
    }

    private static <T extends FieldDescriptorLite<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean copyList, boolean resolveLazyFields) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (resolveLazyFields && (value instanceof LazyField)) {
            map.put(key, ((LazyField) value).getValue());
        } else if (copyList && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object value) {
        if (!(value instanceof byte[])) {
            return value;
        }
        byte[] bArr = (byte[]) value;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int computeElementSize(final WireFormat.FieldType type, final int number, final Object value) {
        int computeTagSize = CodedOutputStream.computeTagSize(number);
        if (type == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + computeElementSizeNoTag(type, value);
    }

    public static int computeElementSizeNoTag(final WireFormat.FieldType type, final Object value) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[type.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) value).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) value).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) value).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) value).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) value).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) value).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) value).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) value).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) value);
            case 10:
                return value instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) value) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) value);
            case 11:
                return value instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) value) : CodedOutputStream.computeStringSizeNoTag((String) value);
            case 12:
                return value instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) value) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) value);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) value).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) value).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) value).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) value).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) value).longValue());
            case 18:
                return value instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) value).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) value).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(final FieldDescriptorLite<?> descriptor, final Object value) {
        WireFormat.FieldType liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            return computeElementSize(liteType, number, value);
        }
        List list = (List) value;
        int size = list.size();
        int i11 = 0;
        if (!descriptor.isPacked()) {
            int i12 = 0;
            while (i11 < size) {
                i12 += computeElementSize(liteType, number, list.get(i11));
                i11++;
            }
            return i12;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i13 = 0;
        while (i11 < size) {
            i13 += computeElementSizeNoTag(liteType, list.get(i11));
            i11++;
        }
        return CodedOutputStream.computeTagSize(number) + i13 + CodedOutputStream.computeUInt32SizeNoTag(i13);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return (FieldSet<T>) DEFAULT_INSTANCE;
    }

    public static int getWireFormatForFieldType(final WireFormat.FieldType type, boolean isPacked) {
        if (isPacked) {
            return 2;
        }
        return type.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object value) {
        if (value instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) value).isInitialized();
        }
        if (value instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(final WireFormat.FieldType type, final Object value) {
        Internal.checkNotNull(value);
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[type.getJavaType().ordinal()]) {
            case 7:
                if ((value instanceof ByteString) || (value instanceof byte[])) {
                }
                break;
            case 8:
                if ((value instanceof Integer) || (value instanceof Internal.EnumLite)) {
                }
                break;
            case 9:
                if ((value instanceof MessageLite) || (value instanceof LazyField)) {
                }
                break;
        }
        return false;
    }

    private void mergeFromField(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z11 = value instanceof LazyField;
        if (key.isRepeated()) {
            if (z11) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((SmallSortedMap<T, Object>) key, (T) field);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (z11) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.fields.put((SmallSortedMap<T, Object>) key, (T) cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put((SmallSortedMap<T, Object>) key, (T) cloneIfMutable(value));
            if (z11) {
                this.hasLazyField = true;
                return;
            }
            return;
        }
        if (z11) {
            value = ((LazyField) value).getValue();
        }
        this.fields.put((SmallSortedMap<T, Object>) key, (T) key.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
    }

    public static <T extends FieldDescriptorLite<T>> Builder<T> newBuilder() {
        return new Builder<>((AnonymousClass1) null);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    public static Object readPrimitiveField(CodedInputStream input, final WireFormat.FieldType type, boolean checkUtf8) throws IOException {
        return checkUtf8 ? WireFormat.readPrimitiveField(input, type, WireFormat.Utf8Validation.STRICT) : WireFormat.readPrimitiveField(input, type, WireFormat.Utf8Validation.LOOSE);
    }

    private void verifyType(final T descriptor, final Object value) {
        if (!isValidType(descriptor.getLiteType(), value)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
        }
    }

    public static void writeElement(final CodedOutputStream output, final WireFormat.FieldType type, final int number, final Object value) throws IOException {
        if (type == WireFormat.FieldType.GROUP) {
            output.writeGroup(number, (MessageLite) value);
        } else {
            output.writeTag(number, getWireFormatForFieldType(type, false));
            writeElementNoTag(output, type, value);
        }
    }

    public static void writeElementNoTag(final CodedOutputStream output, final WireFormat.FieldType type, final Object value) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[type.ordinal()]) {
            case 1:
                output.writeDoubleNoTag(((Double) value).doubleValue());
                break;
            case 2:
                output.writeFloatNoTag(((Float) value).floatValue());
                break;
            case 3:
                output.writeInt64NoTag(((Long) value).longValue());
                break;
            case 4:
                output.writeUInt64NoTag(((Long) value).longValue());
                break;
            case 5:
                output.writeInt32NoTag(((Integer) value).intValue());
                break;
            case 6:
                output.writeFixed64NoTag(((Long) value).longValue());
                break;
            case 7:
                output.writeFixed32NoTag(((Integer) value).intValue());
                break;
            case 8:
                output.writeBoolNoTag(((Boolean) value).booleanValue());
                break;
            case 9:
                output.writeGroupNoTag((MessageLite) value);
                break;
            case 10:
                output.writeMessageNoTag((MessageLite) value);
                break;
            case 11:
                if (!(value instanceof ByteString)) {
                    output.writeStringNoTag((String) value);
                    break;
                } else {
                    output.writeBytesNoTag((ByteString) value);
                    break;
                }
            case 12:
                if (!(value instanceof ByteString)) {
                    output.writeByteArrayNoTag((byte[]) value);
                    break;
                } else {
                    output.writeBytesNoTag((ByteString) value);
                    break;
                }
            case 13:
                output.writeUInt32NoTag(((Integer) value).intValue());
                break;
            case 14:
                output.writeSFixed32NoTag(((Integer) value).intValue());
                break;
            case 15:
                output.writeSFixed64NoTag(((Long) value).longValue());
                break;
            case 16:
                output.writeSInt32NoTag(((Integer) value).intValue());
                break;
            case 17:
                output.writeSInt64NoTag(((Long) value).longValue());
                break;
            case 18:
                if (!(value instanceof Internal.EnumLite)) {
                    output.writeEnumNoTag(((Integer) value).intValue());
                    break;
                } else {
                    output.writeEnumNoTag(((Internal.EnumLite) value).getNumber());
                    break;
                }
        }
    }

    public static void writeField(final FieldDescriptorLite<?> descriptor, final Object value, final CodedOutputStream output) throws IOException {
        WireFormat.FieldType liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            if (value instanceof LazyField) {
                writeElement(output, liteType, number, ((LazyField) value).getValue());
                return;
            } else {
                writeElement(output, liteType, number, value);
                return;
            }
        }
        List list = (List) value;
        int size = list.size();
        int i11 = 0;
        if (!descriptor.isPacked()) {
            while (i11 < size) {
                writeElement(output, liteType, number, list.get(i11));
                i11++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            output.writeTag(number, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                i12 += computeElementSizeNoTag(liteType, list.get(i13));
            }
            output.writeUInt32NoTag(i12);
            while (i11 < size) {
                writeElementNoTag(output, liteType, list.get(i11));
                i11++;
            }
        }
    }

    public void addRepeatedField(final T descriptor, final Object value) {
        List list;
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(descriptor, value);
        Object field = getField(descriptor);
        if (field == null) {
            list = new ArrayList();
            this.fields.put((SmallSortedMap<T, Object>) descriptor, (T) list);
        } else {
            list = (List) field;
        }
        list.add(value);
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(final T descriptor) {
        this.fields.remove(descriptor);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Iterator<Map.Entry<T, Object>> descendingIterator() {
        return isEmpty() ? Collections.emptyIterator() : this.hasLazyField ? new LazyField.LazyIterator(this.fields.descendingEntrySet().iterator()) : this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 instanceof FieldSet) {
            return this.fields.equals(((FieldSet) o11).fields);
        }
        return false;
    }

    public Map<T, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        SmallSortedMap cloneAllFieldsMap = cloneAllFieldsMap(this.fields, false, true);
        if (this.fields.isImmutable()) {
            cloneAllFieldsMap.makeImmutable();
        }
        return cloneAllFieldsMap;
    }

    public Object getField(final T descriptor) {
        Object obj = this.fields.get(descriptor);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i11 = 0;
        for (int i12 = 0; i12 < numArrayEntries; i12++) {
            i11 += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i12));
        }
        Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i11 += getMessageSetSerializedSize(it.next());
        }
        return i11;
    }

    public Object getRepeatedField(final T descriptor, final int index) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(descriptor);
        if (field != null) {
            return ((List) field).get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(final T descriptor) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(descriptor);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i11 = 0;
        for (int i12 = 0; i12 < numArrayEntries; i12++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i12);
            i11 += computeFieldSize(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<T, Object> entry : this.fields.getOverflowEntries()) {
            i11 += computeFieldSize(entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public boolean hasField(final T descriptor) {
        if (descriptor.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(descriptor) != null;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i11))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        return isEmpty() ? Collections.emptyIterator() : this.hasLazyField ? new LazyField.LazyIterator(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i11);
            if (arrayEntryAt.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(final FieldSet<T> other) {
        int numArrayEntries = other.fields.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            mergeFromField(other.fields.getArrayEntryAt(i11));
        }
        Iterator<Map.Entry<T, Object>> it = other.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(final T descriptor, Object value) {
        if (!descriptor.isRepeated()) {
            verifyType(descriptor, value);
        } else {
            if (!(value instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) value);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(descriptor, it.next());
            }
            value = arrayList;
        }
        if (value instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((SmallSortedMap<T, Object>) descriptor, (T) value);
    }

    public void setRepeatedField(final T descriptor, final int index, final Object value) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(descriptor);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(descriptor, value);
        ((List) field).set(index, value);
    }

    public void writeMessageSetTo(final CodedOutputStream output) throws IOException {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i11), output);
        }
        Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), output);
        }
    }

    public void writeTo(final CodedOutputStream output) throws IOException {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i11);
            writeField(arrayEntryAt.getKey(), arrayEntryAt.getValue(), output);
        }
        for (Map.Entry<T, Object> entry : this.fields.getOverflowEntries()) {
            writeField(entry.getKey(), entry.getValue(), output);
        }
    }

    private FieldSet() {
        this.fields = SmallSortedMap.newFieldMap();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> m5608clone() {
        FieldSet<T> newFieldSet = newFieldSet();
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i11);
            newFieldSet.setField(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<T, Object> entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField(entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    private FieldSet(final boolean dummy) {
        this(SmallSortedMap.newFieldMap());
        makeImmutable();
    }

    private int getMessageSetSerializedSize(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (MessageLite) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> boolean isInitialized(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!isMessageFieldValueInitialized(list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(final Map.Entry<T, Object> entry, final CodedOutputStream output) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                output.writeRawMessageSetExtension(entry.getKey().getNumber(), ((LazyField) value).toByteString());
                return;
            } else {
                output.writeMessageSetExtension(entry.getKey().getNumber(), (MessageLite) value);
                return;
            }
        }
        writeField(key, entry.getValue(), output);
    }

    private FieldSet(SmallSortedMap<T, Object> fields) {
        this.fields = fields;
        makeImmutable();
    }
}
