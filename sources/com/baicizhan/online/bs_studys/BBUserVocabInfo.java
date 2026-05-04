package com.baicizhan.online.bs_studys;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBUserVocabInfo implements TBase<BBUserVocabInfo, _Fields>, Serializable, Cloneable, Comparable<BBUserVocabInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String test_vocab_count_range;
    public String test_vocab_info;
    private static final TStruct STRUCT_DESC = new TStruct("BBUserVocabInfo");
    private static final TField TEST_VOCAB_INFO_FIELD_DESC = new TField("test_vocab_info", (byte) 11, 1);
    private static final TField TEST_VOCAB_COUNT_RANGE_FIELD_DESC = new TField("test_vocab_count_range", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_studys.BBUserVocabInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BBUserVocabInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_studys$BBUserVocabInfo$_Fields = iArr;
            try {
                iArr[_Fields.TEST_VOCAB_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BBUserVocabInfo$_Fields[_Fields.TEST_VOCAB_COUNT_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserVocabInfoStandardScheme extends StandardScheme<BBUserVocabInfo> {
        private BBUserVocabInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBUserVocabInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.test_vocab_count_range = iprot.readString();
                        struct.setTest_vocab_count_rangeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.test_vocab_info = iprot.readString();
                    struct.setTest_vocab_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBUserVocabInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBUserVocabInfo.STRUCT_DESC);
            if (struct.test_vocab_info != null) {
                oprot.writeFieldBegin(BBUserVocabInfo.TEST_VOCAB_INFO_FIELD_DESC);
                oprot.writeString(struct.test_vocab_info);
                oprot.writeFieldEnd();
            }
            if (struct.test_vocab_count_range != null) {
                oprot.writeFieldBegin(BBUserVocabInfo.TEST_VOCAB_COUNT_RANGE_FIELD_DESC);
                oprot.writeString(struct.test_vocab_count_range);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserVocabInfoStandardSchemeFactory implements SchemeFactory {
        private BBUserVocabInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBUserVocabInfoStandardScheme getScheme() {
            return new BBUserVocabInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserVocabInfoTupleScheme extends TupleScheme<BBUserVocabInfo> {
        private BBUserVocabInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBUserVocabInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.test_vocab_info = tTupleProtocol.readString();
            struct.setTest_vocab_infoIsSet(true);
            struct.test_vocab_count_range = tTupleProtocol.readString();
            struct.setTest_vocab_count_rangeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBUserVocabInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.test_vocab_info);
            tTupleProtocol.writeString(struct.test_vocab_count_range);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserVocabInfoTupleSchemeFactory implements SchemeFactory {
        private BBUserVocabInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBUserVocabInfoTupleScheme getScheme() {
            return new BBUserVocabInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TEST_VOCAB_INFO(1, "test_vocab_info"),
        TEST_VOCAB_COUNT_RANGE(2, "test_vocab_count_range");

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
                return TEST_VOCAB_INFO;
            }
            if (fieldId != 2) {
                return null;
            }
            return TEST_VOCAB_COUNT_RANGE;
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
        hashMap.put(StandardScheme.class, new BBUserVocabInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBUserVocabInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TEST_VOCAB_INFO, (_Fields) new FieldMetaData("test_vocab_info", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TEST_VOCAB_COUNT_RANGE, (_Fields) new FieldMetaData("test_vocab_count_range", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBUserVocabInfo.class, unmodifiableMap);
    }

    public BBUserVocabInfo() {
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.test_vocab_info = null;
        this.test_vocab_count_range = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBUserVocabInfo)) {
            return equals((BBUserVocabInfo) that);
        }
        return false;
    }

    public String getTest_vocab_count_range() {
        return this.test_vocab_count_range;
    }

    public String getTest_vocab_info() {
        return this.test_vocab_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetTest_vocab_count_range() {
        return this.test_vocab_count_range != null;
    }

    public boolean isSetTest_vocab_info() {
        return this.test_vocab_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBUserVocabInfo setTest_vocab_count_range(String test_vocab_count_range) {
        this.test_vocab_count_range = test_vocab_count_range;
        return this;
    }

    public void setTest_vocab_count_rangeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.test_vocab_count_range = null;
    }

    public BBUserVocabInfo setTest_vocab_info(String test_vocab_info) {
        this.test_vocab_info = test_vocab_info;
        return this;
    }

    public void setTest_vocab_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.test_vocab_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBUserVocabInfo(");
        sb2.append("test_vocab_info:");
        String str = this.test_vocab_info;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("test_vocab_count_range:");
        String str2 = this.test_vocab_count_range;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetTest_vocab_count_range() {
        this.test_vocab_count_range = null;
    }

    public void unsetTest_vocab_info() {
        this.test_vocab_info = null;
    }

    public void validate() throws TException {
        if (this.test_vocab_info == null) {
            throw new TProtocolException("Required field 'test_vocab_info' was not present! Struct: " + toString());
        }
        if (this.test_vocab_count_range != null) {
            return;
        }
        throw new TProtocolException("Required field 'test_vocab_count_range' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BBUserVocabInfo(String test_vocab_info, String test_vocab_count_range) {
        this();
        this.test_vocab_info = test_vocab_info;
        this.test_vocab_count_range = test_vocab_count_range;
    }

    @Override // java.lang.Comparable
    public int compareTo(BBUserVocabInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetTest_vocab_info()).compareTo(Boolean.valueOf(other.isSetTest_vocab_info()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetTest_vocab_info() && (compareTo2 = TBaseHelper.compareTo(this.test_vocab_info, other.test_vocab_info)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetTest_vocab_count_range()).compareTo(Boolean.valueOf(other.isSetTest_vocab_count_range()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetTest_vocab_count_range() || (compareTo = TBaseHelper.compareTo(this.test_vocab_count_range, other.test_vocab_count_range)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBUserVocabInfo, _Fields> deepCopy2() {
        return new BBUserVocabInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BBUserVocabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTest_vocab_info();
        }
        if (i11 == 2) {
            return getTest_vocab_count_range();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BBUserVocabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTest_vocab_info();
        }
        if (i11 == 2) {
            return isSetTest_vocab_count_range();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BBUserVocabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTest_vocab_info();
                return;
            } else {
                setTest_vocab_info((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetTest_vocab_count_range();
        } else {
            setTest_vocab_count_range((String) value);
        }
    }

    public boolean equals(BBUserVocabInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetTest_vocab_info = isSetTest_vocab_info();
        boolean isSetTest_vocab_info2 = that.isSetTest_vocab_info();
        if ((isSetTest_vocab_info || isSetTest_vocab_info2) && !(isSetTest_vocab_info && isSetTest_vocab_info2 && this.test_vocab_info.equals(that.test_vocab_info))) {
            return false;
        }
        boolean isSetTest_vocab_count_range = isSetTest_vocab_count_range();
        boolean isSetTest_vocab_count_range2 = that.isSetTest_vocab_count_range();
        if (isSetTest_vocab_count_range || isSetTest_vocab_count_range2) {
            return isSetTest_vocab_count_range && isSetTest_vocab_count_range2 && this.test_vocab_count_range.equals(that.test_vocab_count_range);
        }
        return true;
    }

    public BBUserVocabInfo(BBUserVocabInfo other) {
        if (other.isSetTest_vocab_info()) {
            this.test_vocab_info = other.test_vocab_info;
        }
        if (other.isSetTest_vocab_count_range()) {
            this.test_vocab_count_range = other.test_vocab_count_range;
        }
    }
}
