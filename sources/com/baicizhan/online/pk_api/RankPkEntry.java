package com.baicizhan.online.pk_api;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class RankPkEntry implements TBase<RankPkEntry, _Fields>, Serializable, Cloneable, Comparable<RankPkEntry> {
    private static final int __BEGINTIME_ISSET_ID = 0;
    private static final int __ENDTIME_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long beginTime;
    public long endTime;
    public String url;
    private static final TStruct STRUCT_DESC = new TStruct("RankPkEntry");
    private static final TField URL_FIELD_DESC = new TField("url", (byte) 11, 1);
    private static final TField BEGIN_TIME_FIELD_DESC = new TField("beginTime", (byte) 10, 2);
    private static final TField END_TIME_FIELD_DESC = new TField("endTime", (byte) 10, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.pk_api.RankPkEntry$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$pk_api$RankPkEntry$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$pk_api$RankPkEntry$_Fields = iArr;
            try {
                iArr[_Fields.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$pk_api$RankPkEntry$_Fields[_Fields.BEGIN_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$pk_api$RankPkEntry$_Fields[_Fields.END_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RankPkEntryStandardScheme extends StandardScheme<RankPkEntry> {
        private RankPkEntryStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RankPkEntry struct) throws TException {
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
                        } else if (b11 == 10) {
                            struct.endTime = iprot.readI64();
                            struct.setEndTimeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.beginTime = iprot.readI64();
                        struct.setBeginTimeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.url = iprot.readString();
                    struct.setUrlIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBeginTime()) {
                throw new TProtocolException("Required field 'beginTime' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetEndTime()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'endTime' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RankPkEntry struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RankPkEntry.STRUCT_DESC);
            if (struct.url != null) {
                oprot.writeFieldBegin(RankPkEntry.URL_FIELD_DESC);
                oprot.writeString(struct.url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(RankPkEntry.BEGIN_TIME_FIELD_DESC);
            oprot.writeI64(struct.beginTime);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RankPkEntry.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.endTime);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RankPkEntryStandardSchemeFactory implements SchemeFactory {
        private RankPkEntryStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RankPkEntryStandardScheme getScheme() {
            return new RankPkEntryStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RankPkEntryTupleScheme extends TupleScheme<RankPkEntry> {
        private RankPkEntryTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RankPkEntry struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.url = tTupleProtocol.readString();
            struct.setUrlIsSet(true);
            struct.beginTime = tTupleProtocol.readI64();
            struct.setBeginTimeIsSet(true);
            struct.endTime = tTupleProtocol.readI64();
            struct.setEndTimeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RankPkEntry struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.url);
            tTupleProtocol.writeI64(struct.beginTime);
            tTupleProtocol.writeI64(struct.endTime);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RankPkEntryTupleSchemeFactory implements SchemeFactory {
        private RankPkEntryTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RankPkEntryTupleScheme getScheme() {
            return new RankPkEntryTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        URL(1, "url"),
        BEGIN_TIME(2, "beginTime"),
        END_TIME(3, "endTime");

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
                return URL;
            }
            if (fieldId == 2) {
                return BEGIN_TIME;
            }
            if (fieldId != 3) {
                return null;
            }
            return END_TIME;
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
        hashMap.put(StandardScheme.class, new RankPkEntryStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RankPkEntryTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.URL, (_Fields) new FieldMetaData("url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BEGIN_TIME, (_Fields) new FieldMetaData("beginTime", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("endTime", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RankPkEntry.class, unmodifiableMap);
    }

    public RankPkEntry() {
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
        this.url = null;
        setBeginTimeIsSet(false);
        this.beginTime = 0L;
        setEndTimeIsSet(false);
        this.endTime = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RankPkEntry)) {
            return equals((RankPkEntry) that);
        }
        return false;
    }

    public long getBeginTime() {
        return this.beginTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBeginTime() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEndTime() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetUrl() {
        return this.url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RankPkEntry setBeginTime(long beginTime) {
        this.beginTime = beginTime;
        setBeginTimeIsSet(true);
        return this;
    }

    public void setBeginTimeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RankPkEntry setEndTime(long endTime) {
        this.endTime = endTime;
        setEndTimeIsSet(true);
        return this;
    }

    public void setEndTimeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RankPkEntry setUrl(String url) {
        this.url = url;
        return this;
    }

    public void setUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RankPkEntry(");
        sb2.append("url:");
        String str = this.url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("beginTime:");
        sb2.append(this.beginTime);
        sb2.append(j2.O);
        sb2.append("endTime:");
        sb2.append(this.endTime);
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetBeginTime() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEndTime() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetUrl() {
        this.url = null;
    }

    public void validate() throws TException {
        if (this.url != null) {
            return;
        }
        throw new TProtocolException("Required field 'url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RankPkEntry other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetUrl()).compareTo(Boolean.valueOf(other.isSetUrl()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetUrl() && (compareTo3 = TBaseHelper.compareTo(this.url, other.url)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetBeginTime()).compareTo(Boolean.valueOf(other.isSetBeginTime()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBeginTime() && (compareTo2 = TBaseHelper.compareTo(this.beginTime, other.beginTime)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetEndTime()).compareTo(Boolean.valueOf(other.isSetEndTime()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetEndTime() || (compareTo = TBaseHelper.compareTo(this.endTime, other.endTime)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RankPkEntry, _Fields> deepCopy2() {
        return new RankPkEntry(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$pk_api$RankPkEntry$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getUrl();
        }
        if (i11 == 2) {
            return Long.valueOf(getBeginTime());
        }
        if (i11 == 3) {
            return Long.valueOf(getEndTime());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$pk_api$RankPkEntry$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUrl();
        }
        if (i11 == 2) {
            return isSetBeginTime();
        }
        if (i11 == 3) {
            return isSetEndTime();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$pk_api$RankPkEntry$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUrl();
                return;
            } else {
                setUrl((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBeginTime();
                return;
            } else {
                setBeginTime(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetEndTime();
        } else {
            setEndTime(((Long) value).longValue());
        }
    }

    public RankPkEntry(String url, long beginTime, long endTime) {
        this();
        this.url = url;
        this.beginTime = beginTime;
        setBeginTimeIsSet(true);
        this.endTime = endTime;
        setEndTimeIsSet(true);
    }

    public boolean equals(RankPkEntry that) {
        if (that == null) {
            return false;
        }
        boolean isSetUrl = isSetUrl();
        boolean isSetUrl2 = that.isSetUrl();
        return (!(isSetUrl || isSetUrl2) || (isSetUrl && isSetUrl2 && this.url.equals(that.url))) && this.beginTime == that.beginTime && this.endTime == that.endTime;
    }

    public RankPkEntry(RankPkEntry other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetUrl()) {
            this.url = other.url;
        }
        this.beginTime = other.beginTime;
        this.endTime = other.endTime;
    }
}
