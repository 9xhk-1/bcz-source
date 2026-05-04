package com.baicizhan.online.hero_api;

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
public class LiveInfo implements TBase<LiveInfo, _Fields>, Serializable, Cloneable, Comparable<LiveInfo> {
    private static final int __BEGIN_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long begin_time;
    public String url;
    private static final TStruct STRUCT_DESC = new TStruct("LiveInfo");
    private static final TField URL_FIELD_DESC = new TField("url", (byte) 11, 1);
    private static final TField BEGIN_TIME_FIELD_DESC = new TField("begin_time", (byte) 10, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.LiveInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$LiveInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$LiveInfo$_Fields = iArr;
            try {
                iArr[_Fields.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$LiveInfo$_Fields[_Fields.BEGIN_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveInfoStandardScheme extends StandardScheme<LiveInfo> {
        private LiveInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, LiveInfo struct) throws TException {
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
                    } else if (b11 == 10) {
                        struct.begin_time = iprot.readI64();
                        struct.setBegin_timeIsSet(true);
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
            if (struct.isSetBegin_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'begin_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, LiveInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(LiveInfo.STRUCT_DESC);
            if (struct.url != null) {
                oprot.writeFieldBegin(LiveInfo.URL_FIELD_DESC);
                oprot.writeString(struct.url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(LiveInfo.BEGIN_TIME_FIELD_DESC);
            oprot.writeI64(struct.begin_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveInfoStandardSchemeFactory implements SchemeFactory {
        private LiveInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LiveInfoStandardScheme getScheme() {
            return new LiveInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveInfoTupleScheme extends TupleScheme<LiveInfo> {
        private LiveInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, LiveInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.url = tTupleProtocol.readString();
            struct.setUrlIsSet(true);
            struct.begin_time = tTupleProtocol.readI64();
            struct.setBegin_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, LiveInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.url);
            tTupleProtocol.writeI64(struct.begin_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveInfoTupleSchemeFactory implements SchemeFactory {
        private LiveInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LiveInfoTupleScheme getScheme() {
            return new LiveInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        URL(1, "url"),
        BEGIN_TIME(2, "begin_time");

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
            if (fieldId != 2) {
                return null;
            }
            return BEGIN_TIME;
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
        hashMap.put(StandardScheme.class, new LiveInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new LiveInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.URL, (_Fields) new FieldMetaData("url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BEGIN_TIME, (_Fields) new FieldMetaData("begin_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(LiveInfo.class, unmodifiableMap);
    }

    public LiveInfo() {
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
        setBegin_timeIsSet(false);
        this.begin_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof LiveInfo)) {
            return equals((LiveInfo) that);
        }
        return false;
    }

    public long getBegin_time() {
        return this.begin_time;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBegin_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUrl() {
        return this.url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public LiveInfo setBegin_time(long begin_time) {
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
        return this;
    }

    public void setBegin_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public LiveInfo setUrl(String url) {
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
        StringBuilder sb2 = new StringBuilder("LiveInfo(");
        sb2.append("url:");
        String str = this.url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("begin_time:");
        sb2.append(this.begin_time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBegin_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
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
    public int compareTo(LiveInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetUrl()).compareTo(Boolean.valueOf(other.isSetUrl()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetUrl() && (compareTo2 = TBaseHelper.compareTo(this.url, other.url)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetBegin_time()).compareTo(Boolean.valueOf(other.isSetBegin_time()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetBegin_time() || (compareTo = TBaseHelper.compareTo(this.begin_time, other.begin_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<LiveInfo, _Fields> deepCopy2() {
        return new LiveInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$LiveInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getUrl();
        }
        if (i11 == 2) {
            return Long.valueOf(getBegin_time());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$LiveInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUrl();
        }
        if (i11 == 2) {
            return isSetBegin_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$LiveInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUrl();
                return;
            } else {
                setUrl((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetBegin_time();
        } else {
            setBegin_time(((Long) value).longValue());
        }
    }

    public LiveInfo(String url, long begin_time) {
        this();
        this.url = url;
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
    }

    public boolean equals(LiveInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetUrl = isSetUrl();
        boolean isSetUrl2 = that.isSetUrl();
        return (!(isSetUrl || isSetUrl2) || (isSetUrl && isSetUrl2 && this.url.equals(that.url))) && this.begin_time == that.begin_time;
    }

    public LiveInfo(LiveInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetUrl()) {
            this.url = other.url;
        }
        this.begin_time = other.begin_time;
    }
}
