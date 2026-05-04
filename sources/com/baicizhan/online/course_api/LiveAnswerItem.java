package com.baicizhan.online.course_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TIOStreamTransport;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class LiveAnswerItem implements TBase<LiveAnswerItem, _Fields>, Serializable, Cloneable, Comparable<LiveAnswerItem> {
    private static final int __SHOW_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<LiveAnswerOptionItem> options;
    public int show_time;
    private static final TStruct STRUCT_DESC = new TStruct("LiveAnswerItem");
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 8, 1);
    private static final TField OPTIONS_FIELD_DESC = new TField("options", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.LiveAnswerItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$LiveAnswerItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$LiveAnswerItem$_Fields = iArr;
            try {
                iArr[_Fields.SHOW_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$LiveAnswerItem$_Fields[_Fields.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveAnswerItemStandardScheme extends StandardScheme<LiveAnswerItem> {
        private LiveAnswerItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, LiveAnswerItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.options = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            LiveAnswerOptionItem liveAnswerOptionItem = new LiveAnswerOptionItem();
                            liveAnswerOptionItem.read(iprot);
                            struct.options.add(liveAnswerOptionItem);
                        }
                        iprot.readListEnd();
                        struct.setOptionsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.show_time = iprot.readI32();
                    struct.setShow_timeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetShow_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'show_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, LiveAnswerItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(LiveAnswerItem.STRUCT_DESC);
            oprot.writeFieldBegin(LiveAnswerItem.SHOW_TIME_FIELD_DESC);
            oprot.writeI32(struct.show_time);
            oprot.writeFieldEnd();
            if (struct.options != null) {
                oprot.writeFieldBegin(LiveAnswerItem.OPTIONS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.options.size()));
                Iterator<LiveAnswerOptionItem> it = struct.options.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveAnswerItemStandardSchemeFactory implements SchemeFactory {
        private LiveAnswerItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LiveAnswerItemStandardScheme getScheme() {
            return new LiveAnswerItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveAnswerItemTupleScheme extends TupleScheme<LiveAnswerItem> {
        private LiveAnswerItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, LiveAnswerItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.show_time = tTupleProtocol.readI32();
            struct.setShow_timeIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.options = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                LiveAnswerOptionItem liveAnswerOptionItem = new LiveAnswerOptionItem();
                liveAnswerOptionItem.read(tTupleProtocol);
                struct.options.add(liveAnswerOptionItem);
            }
            struct.setOptionsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, LiveAnswerItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.show_time);
            tTupleProtocol.writeI32(struct.options.size());
            Iterator<LiveAnswerOptionItem> it = struct.options.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveAnswerItemTupleSchemeFactory implements SchemeFactory {
        private LiveAnswerItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LiveAnswerItemTupleScheme getScheme() {
            return new LiveAnswerItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SHOW_TIME(1, "show_time"),
        OPTIONS(2, "options");

        private static final Map<String, _Fields> byName = new HashMap();
        private final String _fieldName;
        private final short _thriftId;

        static {
            Iterator it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        _Fields(short thriftId, String fieldName) {
            this._thriftId = thriftId;
            this._fieldName = fieldName;
        }

        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        public static _Fields findByThriftId(int fieldId) {
            if (fieldId == 1) {
                return SHOW_TIME;
            }
            if (fieldId != 2) {
                return null;
            }
            return OPTIONS;
        }

        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields findByThriftId = findByThriftId(fieldId);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public String getFieldName() {
            return this._fieldName;
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(StandardScheme.class, new LiveAnswerItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new LiveAnswerItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.OPTIONS, (_Fields) new FieldMetaData("options", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, LiveAnswerOptionItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(LiveAnswerItem.class, unmodifiableMap);
    }

    public LiveAnswerItem() {
        this.__isset_bitfield = (byte) 0;
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new TCompactProtocol(new TIOStreamTransport(in2)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport(out)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    public void addToOptions(LiveAnswerOptionItem elem) {
        if (this.options == null) {
            this.options = new ArrayList();
        }
        this.options.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setShow_timeIsSet(false);
        this.show_time = 0;
        this.options = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof LiveAnswerItem)) {
            return equals((LiveAnswerItem) that);
        }
        return false;
    }

    public List<LiveAnswerOptionItem> getOptions() {
        return this.options;
    }

    public Iterator<LiveAnswerOptionItem> getOptionsIterator() {
        List<LiveAnswerOptionItem> list = this.options;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getOptionsSize() {
        List<LiveAnswerOptionItem> list = this.options;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getShow_time() {
        return this.show_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetOptions() {
        return this.options != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public LiveAnswerItem setOptions(List<LiveAnswerOptionItem> options) {
        this.options = options;
        return this;
    }

    public void setOptionsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.options = null;
    }

    public LiveAnswerItem setShow_time(int show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LiveAnswerItem(");
        sb2.append("show_time:");
        sb2.append(this.show_time);
        sb2.append(j2.O);
        sb2.append("options:");
        List<LiveAnswerOptionItem> list = this.options;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetOptions() {
        this.options = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.options != null) {
            return;
        }
        throw new TProtocolException("Required field 'options' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LiveAnswerItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetShow_time() && (compareTo2 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetOptions()).compareTo(Boolean.valueOf(other.isSetOptions()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetOptions() || (compareTo = TBaseHelper.compareTo((List) this.options, (List) other.options)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<LiveAnswerItem, _Fields> deepCopy2() {
        return new LiveAnswerItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$LiveAnswerItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getShow_time());
        }
        if (i11 == 2) {
            return getOptions();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$LiveAnswerItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetShow_time();
        }
        if (i11 == 2) {
            return isSetOptions();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$LiveAnswerItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetShow_time();
                return;
            } else {
                setShow_time(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetOptions();
        } else {
            setOptions((List) value);
        }
    }

    public LiveAnswerItem(int show_time, List<LiveAnswerOptionItem> options) {
        this();
        this.show_time = show_time;
        setShow_timeIsSet(true);
        this.options = options;
    }

    public boolean equals(LiveAnswerItem that) {
        if (that == null || this.show_time != that.show_time) {
            return false;
        }
        boolean isSetOptions = isSetOptions();
        boolean isSetOptions2 = that.isSetOptions();
        if (isSetOptions || isSetOptions2) {
            return isSetOptions && isSetOptions2 && this.options.equals(that.options);
        }
        return true;
    }

    public LiveAnswerItem(LiveAnswerItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.show_time = other.show_time;
        if (other.isSetOptions()) {
            ArrayList arrayList = new ArrayList(other.options.size());
            Iterator<LiveAnswerOptionItem> it = other.options.iterator();
            while (it.hasNext()) {
                arrayList.add(new LiveAnswerOptionItem(it.next()));
            }
            this.options = arrayList;
        }
    }
}
