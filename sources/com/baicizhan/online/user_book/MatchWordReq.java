package com.baicizhan.online.user_book;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class MatchWordReq implements TBase<MatchWordReq, _Fields>, Serializable, Cloneable, Comparable<MatchWordReq> {
    private static final int __CATE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int cate;
    public List<Integer> topic_ids;
    private static final TStruct STRUCT_DESC = new TStruct("MatchWordReq");
    private static final TField CATE_FIELD_DESC = new TField("cate", (byte) 8, 1);
    private static final TField TOPIC_IDS_FIELD_DESC = new TField("topic_ids", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.MatchWordReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$MatchWordReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$MatchWordReq$_Fields = iArr;
            try {
                iArr[_Fields.CATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$MatchWordReq$_Fields[_Fields.TOPIC_IDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MatchWordReqStandardScheme extends StandardScheme<MatchWordReq> {
        private MatchWordReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MatchWordReq struct) throws TException {
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
                        struct.topic_ids = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.topic_ids.add(Integer.valueOf(iprot.readI32()));
                        }
                        iprot.readListEnd();
                        struct.setTopic_idsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.cate = iprot.readI32();
                    struct.setCateIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCate()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'cate' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MatchWordReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MatchWordReq.STRUCT_DESC);
            oprot.writeFieldBegin(MatchWordReq.CATE_FIELD_DESC);
            oprot.writeI32(struct.cate);
            oprot.writeFieldEnd();
            if (struct.topic_ids != null) {
                oprot.writeFieldBegin(MatchWordReq.TOPIC_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.topic_ids.size()));
                Iterator<Integer> it = struct.topic_ids.iterator();
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
    public static class MatchWordReqStandardSchemeFactory implements SchemeFactory {
        private MatchWordReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MatchWordReqStandardScheme getScheme() {
            return new MatchWordReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MatchWordReqTupleScheme extends TupleScheme<MatchWordReq> {
        private MatchWordReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MatchWordReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.cate = tTupleProtocol.readI32();
            struct.setCateIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.topic_ids = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.topic_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setTopic_idsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MatchWordReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.cate);
            tTupleProtocol.writeI32(struct.topic_ids.size());
            Iterator<Integer> it = struct.topic_ids.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MatchWordReqTupleSchemeFactory implements SchemeFactory {
        private MatchWordReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MatchWordReqTupleScheme getScheme() {
            return new MatchWordReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CATE(1, "cate"),
        TOPIC_IDS(2, "topic_ids");

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
                return CATE;
            }
            if (fieldId != 2) {
                return null;
            }
            return TOPIC_IDS;
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
        hashMap.put(StandardScheme.class, new MatchWordReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MatchWordReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CATE, (_Fields) new FieldMetaData("cate", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOPIC_IDS, (_Fields) new FieldMetaData("topic_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MatchWordReq.class, unmodifiableMap);
    }

    public MatchWordReq() {
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

    public void addToTopic_ids(int elem) {
        if (this.topic_ids == null) {
            this.topic_ids = new ArrayList();
        }
        this.topic_ids.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setCateIsSet(false);
        this.cate = 0;
        this.topic_ids = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MatchWordReq)) {
            return equals((MatchWordReq) that);
        }
        return false;
    }

    public int getCate() {
        return this.cate;
    }

    public List<Integer> getTopic_ids() {
        return this.topic_ids;
    }

    public Iterator<Integer> getTopic_idsIterator() {
        List<Integer> list = this.topic_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getTopic_idsSize() {
        List<Integer> list = this.topic_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCate() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTopic_ids() {
        return this.topic_ids != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MatchWordReq setCate(int cate) {
        this.cate = cate;
        setCateIsSet(true);
        return this;
    }

    public void setCateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public MatchWordReq setTopic_ids(List<Integer> topic_ids) {
        this.topic_ids = topic_ids;
        return this;
    }

    public void setTopic_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.topic_ids = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MatchWordReq(");
        sb2.append("cate:");
        sb2.append(this.cate);
        sb2.append(j2.O);
        sb2.append("topic_ids:");
        List<Integer> list = this.topic_ids;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCate() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTopic_ids() {
        this.topic_ids = null;
    }

    public void validate() throws TException {
        if (this.topic_ids != null) {
            return;
        }
        throw new TProtocolException("Required field 'topic_ids' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MatchWordReq other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCate()).compareTo(Boolean.valueOf(other.isSetCate()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCate() && (compareTo2 = TBaseHelper.compareTo(this.cate, other.cate)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetTopic_ids()).compareTo(Boolean.valueOf(other.isSetTopic_ids()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetTopic_ids() || (compareTo = TBaseHelper.compareTo((List) this.topic_ids, (List) other.topic_ids)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MatchWordReq, _Fields> deepCopy2() {
        return new MatchWordReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$MatchWordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCate());
        }
        if (i11 == 2) {
            return getTopic_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$MatchWordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCate();
        }
        if (i11 == 2) {
            return isSetTopic_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$MatchWordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCate();
                return;
            } else {
                setCate(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetTopic_ids();
        } else {
            setTopic_ids((List) value);
        }
    }

    public MatchWordReq(int cate, List<Integer> topic_ids) {
        this();
        this.cate = cate;
        setCateIsSet(true);
        this.topic_ids = topic_ids;
    }

    public boolean equals(MatchWordReq that) {
        if (that == null || this.cate != that.cate) {
            return false;
        }
        boolean isSetTopic_ids = isSetTopic_ids();
        boolean isSetTopic_ids2 = that.isSetTopic_ids();
        if (isSetTopic_ids || isSetTopic_ids2) {
            return isSetTopic_ids && isSetTopic_ids2 && this.topic_ids.equals(that.topic_ids);
        }
        return true;
    }

    public MatchWordReq(MatchWordReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.cate = other.cate;
        if (other.isSetTopic_ids()) {
            this.topic_ids = new ArrayList(other.topic_ids);
        }
    }
}
