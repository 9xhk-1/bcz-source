package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserRoadMapElementV2 implements TBase<UserRoadMapElementV2, _Fields>, Serializable, Cloneable, Comparable<UserRoadMapElementV2> {
    private static final int __TAG_ID_ISSET_ID = 2;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __WORD_LEVEL_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<Integer> options;
    public int tag_id;
    public int topic_id;
    public int word_level_id;
    private static final TStruct STRUCT_DESC = new TStruct("UserRoadMapElementV2");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 2);
    private static final TField TAG_ID_FIELD_DESC = new TField("tag_id", (byte) 8, 3);
    private static final TField OPTIONS_FIELD_DESC = new TField("options", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserRoadMapElementV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields[_Fields.WORD_LEVEL_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields[_Fields.TAG_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields[_Fields.OPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRoadMapElementV2StandardScheme extends StandardScheme<UserRoadMapElementV2> {
        private UserRoadMapElementV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserRoadMapElementV2 struct) throws TException {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.options = new ArrayList(readListBegin.size);
                                for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                    struct.options.add(Integer.valueOf(iprot.readI32()));
                                }
                                iprot.readListEnd();
                                struct.setOptionsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.tag_id = iprot.readI32();
                            struct.setTag_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.word_level_id = iprot.readI32();
                        struct.setWord_level_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.topic_id = iprot.readI32();
                    struct.setTopic_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTopic_id()) {
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetWord_level_id()) {
                throw new TProtocolException("Required field 'word_level_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetTag_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'tag_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserRoadMapElementV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserRoadMapElementV2.STRUCT_DESC);
            oprot.writeFieldBegin(UserRoadMapElementV2.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserRoadMapElementV2.WORD_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.word_level_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserRoadMapElementV2.TAG_ID_FIELD_DESC);
            oprot.writeI32(struct.tag_id);
            oprot.writeFieldEnd();
            if (struct.options != null) {
                oprot.writeFieldBegin(UserRoadMapElementV2.OPTIONS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.options.size()));
                Iterator<Integer> it = struct.options.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRoadMapElementV2StandardSchemeFactory implements SchemeFactory {
        private UserRoadMapElementV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserRoadMapElementV2StandardScheme getScheme() {
            return new UserRoadMapElementV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRoadMapElementV2TupleScheme extends TupleScheme<UserRoadMapElementV2> {
        private UserRoadMapElementV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserRoadMapElementV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word_level_id = tTupleProtocol.readI32();
            struct.setWord_level_idIsSet(true);
            struct.tag_id = tTupleProtocol.readI32();
            struct.setTag_idIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.options = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.options.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setOptionsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserRoadMapElementV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.word_level_id);
            tTupleProtocol.writeI32(struct.tag_id);
            tTupleProtocol.writeI32(struct.options.size());
            Iterator<Integer> it = struct.options.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRoadMapElementV2TupleSchemeFactory implements SchemeFactory {
        private UserRoadMapElementV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserRoadMapElementV2TupleScheme getScheme() {
            return new UserRoadMapElementV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WORD_LEVEL_ID(2, ma.b.f72894c),
        TAG_ID(3, "tag_id"),
        OPTIONS(4, "options");

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
                return TOPIC_ID;
            }
            if (fieldId == 2) {
                return WORD_LEVEL_ID;
            }
            if (fieldId == 3) {
                return TAG_ID;
            }
            if (fieldId != 4) {
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
        hashMap.put(StandardScheme.class, new UserRoadMapElementV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserRoadMapElementV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TAG_ID, (_Fields) new FieldMetaData("tag_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.OPTIONS, (_Fields) new FieldMetaData("options", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserRoadMapElementV2.class, unmodifiableMap);
    }

    public UserRoadMapElementV2() {
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

    public void addToOptions(int elem) {
        if (this.options == null) {
            this.options = new ArrayList();
        }
        this.options.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setWord_level_idIsSet(false);
        this.word_level_id = 0;
        setTag_idIsSet(false);
        this.tag_id = 0;
        this.options = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserRoadMapElementV2)) {
            return equals((UserRoadMapElementV2) that);
        }
        return false;
    }

    public List<Integer> getOptions() {
        return this.options;
    }

    public Iterator<Integer> getOptionsIterator() {
        List<Integer> list = this.options;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getOptionsSize() {
        List<Integer> list = this.options;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getTag_id() {
        return this.tag_id;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getWord_level_id() {
        return this.word_level_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetOptions() {
        return this.options != null;
    }

    public boolean isSetTag_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserRoadMapElementV2 setOptions(List<Integer> options) {
        this.options = options;
        return this;
    }

    public void setOptionsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.options = null;
    }

    public UserRoadMapElementV2 setTag_id(int tag_id) {
        this.tag_id = tag_id;
        setTag_idIsSet(true);
        return this;
    }

    public void setTag_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserRoadMapElementV2 setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserRoadMapElementV2 setWord_level_id(int word_level_id) {
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        return this;
    }

    public void setWord_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserRoadMapElementV2(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("word_level_id:");
        sb2.append(this.word_level_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("tag_id:");
        sb2.append(this.tag_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("options:");
        List<Integer> list = this.options;
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

    public void unsetTag_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
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
    public int compareTo(UserRoadMapElementV2 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTopic_id() && (compareTo4 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetWord_level_id() && (compareTo3 = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetTag_id()).compareTo(Boolean.valueOf(other.isSetTag_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTag_id() && (compareTo2 = TBaseHelper.compareTo(this.tag_id, other.tag_id)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetOptions()).compareTo(Boolean.valueOf(other.isSetOptions()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetOptions() || (compareTo = TBaseHelper.compareTo((List) this.options, (List) other.options)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserRoadMapElementV2, _Fields> deepCopy2() {
        return new UserRoadMapElementV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getWord_level_id());
        }
        if (i11 == 3) {
            return Integer.valueOf(getTag_id());
        }
        if (i11 == 4) {
            return getOptions();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetWord_level_id();
        }
        if (i11 == 3) {
            return isSetTag_id();
        }
        if (i11 == 4) {
            return isSetOptions();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserRoadMapElementV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetWord_level_id();
                return;
            } else {
                setWord_level_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetTag_id();
                return;
            } else {
                setTag_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetOptions();
        } else {
            setOptions((List) value);
        }
    }

    public UserRoadMapElementV2(int topic_id, int word_level_id, int tag_id, List<Integer> options) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        this.tag_id = tag_id;
        setTag_idIsSet(true);
        this.options = options;
    }

    public boolean equals(UserRoadMapElementV2 that) {
        if (that == null || this.topic_id != that.topic_id || this.word_level_id != that.word_level_id || this.tag_id != that.tag_id) {
            return false;
        }
        boolean isSetOptions = isSetOptions();
        boolean isSetOptions2 = that.isSetOptions();
        if (isSetOptions || isSetOptions2) {
            return isSetOptions && isSetOptions2 && this.options.equals(that.options);
        }
        return true;
    }

    public UserRoadMapElementV2(UserRoadMapElementV2 other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.word_level_id = other.word_level_id;
        this.tag_id = other.tag_id;
        if (other.isSetOptions()) {
            this.options = new ArrayList(other.options);
        }
    }
}
