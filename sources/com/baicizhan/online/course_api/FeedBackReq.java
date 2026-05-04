package com.baicizhan.online.course_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
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
public class FeedBackReq implements TBase<FeedBackReq, _Fields>, Serializable, Cloneable, Comparable<FeedBackReq> {
    private static final int __ARTICLE_ID_ISSET_ID = 0;
    private static final int __CHOICE_ISSET_ID = 2;
    private static final int __QS_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int article_id;
    public int choice;
    public int qs_id;
    private static final TStruct STRUCT_DESC = new TStruct("FeedBackReq");
    private static final TField ARTICLE_ID_FIELD_DESC = new TField(ma.b.f72902e1, (byte) 8, 1);
    private static final TField QS_ID_FIELD_DESC = new TField("qs_id", (byte) 8, 2);
    private static final TField CHOICE_FIELD_DESC = new TField("choice", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.FeedBackReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$FeedBackReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$FeedBackReq$_Fields = iArr;
            try {
                iArr[_Fields.ARTICLE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$FeedBackReq$_Fields[_Fields.QS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$FeedBackReq$_Fields[_Fields.CHOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedBackReqStandardScheme extends StandardScheme<FeedBackReq> {
        private FeedBackReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, FeedBackReq struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 8) {
                            struct.choice = iprot.readI32();
                            struct.setChoiceIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.qs_id = iprot.readI32();
                        struct.setQs_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.article_id = iprot.readI32();
                    struct.setArticle_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetArticle_id()) {
                throw new TProtocolException("Required field 'article_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetQs_id()) {
                throw new TProtocolException("Required field 'qs_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetChoice()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'choice' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, FeedBackReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(FeedBackReq.STRUCT_DESC);
            oprot.writeFieldBegin(FeedBackReq.ARTICLE_ID_FIELD_DESC);
            oprot.writeI32(struct.article_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(FeedBackReq.QS_ID_FIELD_DESC);
            oprot.writeI32(struct.qs_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(FeedBackReq.CHOICE_FIELD_DESC);
            oprot.writeI32(struct.choice);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedBackReqStandardSchemeFactory implements SchemeFactory {
        private FeedBackReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FeedBackReqStandardScheme getScheme() {
            return new FeedBackReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedBackReqTupleScheme extends TupleScheme<FeedBackReq> {
        private FeedBackReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, FeedBackReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.article_id = tTupleProtocol.readI32();
            struct.setArticle_idIsSet(true);
            struct.qs_id = tTupleProtocol.readI32();
            struct.setQs_idIsSet(true);
            struct.choice = tTupleProtocol.readI32();
            struct.setChoiceIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, FeedBackReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.article_id);
            tTupleProtocol.writeI32(struct.qs_id);
            tTupleProtocol.writeI32(struct.choice);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedBackReqTupleSchemeFactory implements SchemeFactory {
        private FeedBackReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FeedBackReqTupleScheme getScheme() {
            return new FeedBackReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ARTICLE_ID(1, ma.b.f72902e1),
        QS_ID(2, "qs_id"),
        CHOICE(3, "choice");

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
                return ARTICLE_ID;
            }
            if (fieldId == 2) {
                return QS_ID;
            }
            if (fieldId != 3) {
                return null;
            }
            return CHOICE;
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
        hashMap.put(StandardScheme.class, new FeedBackReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new FeedBackReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ARTICLE_ID, (_Fields) new FieldMetaData(ma.b.f72902e1, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.QS_ID, (_Fields) new FieldMetaData("qs_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHOICE, (_Fields) new FieldMetaData("choice", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(FeedBackReq.class, unmodifiableMap);
    }

    public FeedBackReq() {
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

    @Override // org.apache.thrift.TBase
    public void clear() {
        setArticle_idIsSet(false);
        this.article_id = 0;
        setQs_idIsSet(false);
        this.qs_id = 0;
        setChoiceIsSet(false);
        this.choice = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof FeedBackReq)) {
            return equals((FeedBackReq) that);
        }
        return false;
    }

    public int getArticle_id() {
        return this.article_id;
    }

    public int getChoice() {
        return this.choice;
    }

    public int getQs_id() {
        return this.qs_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetArticle_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetChoice() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetQs_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public FeedBackReq setArticle_id(int article_id) {
        this.article_id = article_id;
        setArticle_idIsSet(true);
        return this;
    }

    public void setArticle_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public FeedBackReq setChoice(int choice) {
        this.choice = choice;
        setChoiceIsSet(true);
        return this;
    }

    public void setChoiceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public FeedBackReq setQs_id(int qs_id) {
        this.qs_id = qs_id;
        setQs_idIsSet(true);
        return this;
    }

    public void setQs_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "FeedBackReq(article_id:" + this.article_id + j2.O + "qs_id:" + this.qs_id + j2.O + "choice:" + this.choice + pn.j.f81007d;
    }

    public void unsetArticle_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetChoice() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetQs_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(FeedBackReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetArticle_id()).compareTo(Boolean.valueOf(other.isSetArticle_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetArticle_id() && (compareTo3 = TBaseHelper.compareTo(this.article_id, other.article_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetQs_id()).compareTo(Boolean.valueOf(other.isSetQs_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetQs_id() && (compareTo2 = TBaseHelper.compareTo(this.qs_id, other.qs_id)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetChoice()).compareTo(Boolean.valueOf(other.isSetChoice()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetChoice() || (compareTo = TBaseHelper.compareTo(this.choice, other.choice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<FeedBackReq, _Fields> deepCopy2() {
        return new FeedBackReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$FeedBackReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getArticle_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getQs_id());
        }
        if (i11 == 3) {
            return Integer.valueOf(getChoice());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$FeedBackReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetArticle_id();
        }
        if (i11 == 2) {
            return isSetQs_id();
        }
        if (i11 == 3) {
            return isSetChoice();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$FeedBackReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetArticle_id();
                return;
            } else {
                setArticle_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetQs_id();
                return;
            } else {
                setQs_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetChoice();
        } else {
            setChoice(((Integer) value).intValue());
        }
    }

    public FeedBackReq(int article_id, int qs_id, int choice) {
        this();
        this.article_id = article_id;
        setArticle_idIsSet(true);
        this.qs_id = qs_id;
        setQs_idIsSet(true);
        this.choice = choice;
        setChoiceIsSet(true);
    }

    public boolean equals(FeedBackReq that) {
        return that != null && this.article_id == that.article_id && this.qs_id == that.qs_id && this.choice == that.choice;
    }

    public FeedBackReq(FeedBackReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.article_id = other.article_id;
        this.qs_id = other.qs_id;
        this.choice = other.choice;
    }

    public void validate() throws TException {
    }
}
