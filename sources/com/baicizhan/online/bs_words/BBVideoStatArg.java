package com.baicizhan.online.bs_words;

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
public class BBVideoStatArg implements TBase<BBVideoStatArg, _Fields>, Serializable, Cloneable, Comparable<BBVideoStatArg> {
    private static final int __DONE_RATE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public double done_rate;
    public String video_name;
    private static final TStruct STRUCT_DESC = new TStruct("BBVideoStatArg");
    private static final TField VIDEO_NAME_FIELD_DESC = new TField(dc.a.f47674g, (byte) 11, 1);
    private static final TField DONE_RATE_FIELD_DESC = new TField("done_rate", (byte) 4, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBVideoStatArg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBVideoStatArg$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBVideoStatArg$_Fields = iArr;
            try {
                iArr[_Fields.VIDEO_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBVideoStatArg$_Fields[_Fields.DONE_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBVideoStatArgStandardScheme extends StandardScheme<BBVideoStatArg> {
        private BBVideoStatArgStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBVideoStatArg struct) throws TException {
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
                    } else if (b11 == 4) {
                        struct.done_rate = iprot.readDouble();
                        struct.setDone_rateIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.video_name = iprot.readString();
                    struct.setVideo_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetDone_rate()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'done_rate' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBVideoStatArg struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBVideoStatArg.STRUCT_DESC);
            if (struct.video_name != null) {
                oprot.writeFieldBegin(BBVideoStatArg.VIDEO_NAME_FIELD_DESC);
                oprot.writeString(struct.video_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBVideoStatArg.DONE_RATE_FIELD_DESC);
            oprot.writeDouble(struct.done_rate);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBVideoStatArgStandardSchemeFactory implements SchemeFactory {
        private BBVideoStatArgStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBVideoStatArgStandardScheme getScheme() {
            return new BBVideoStatArgStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBVideoStatArgTupleScheme extends TupleScheme<BBVideoStatArg> {
        private BBVideoStatArgTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBVideoStatArg struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.video_name = tTupleProtocol.readString();
            struct.setVideo_nameIsSet(true);
            struct.done_rate = tTupleProtocol.readDouble();
            struct.setDone_rateIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBVideoStatArg struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.video_name);
            tTupleProtocol.writeDouble(struct.done_rate);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBVideoStatArgTupleSchemeFactory implements SchemeFactory {
        private BBVideoStatArgTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBVideoStatArgTupleScheme getScheme() {
            return new BBVideoStatArgTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        VIDEO_NAME(1, dc.a.f47674g),
        DONE_RATE(2, "done_rate");

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
                return VIDEO_NAME;
            }
            if (fieldId != 2) {
                return null;
            }
            return DONE_RATE;
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
        hashMap.put(StandardScheme.class, new BBVideoStatArgStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBVideoStatArgTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.VIDEO_NAME, (_Fields) new FieldMetaData(dc.a.f47674g, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DONE_RATE, (_Fields) new FieldMetaData("done_rate", (byte) 1, new FieldValueMetaData((byte) 4)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBVideoStatArg.class, unmodifiableMap);
    }

    public BBVideoStatArg() {
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
        this.video_name = null;
        setDone_rateIsSet(false);
        this.done_rate = 0.0d;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBVideoStatArg)) {
            return equals((BBVideoStatArg) that);
        }
        return false;
    }

    public double getDone_rate() {
        return this.done_rate;
    }

    public String getVideo_name() {
        return this.video_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDone_rate() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetVideo_name() {
        return this.video_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBVideoStatArg setDone_rate(double done_rate) {
        this.done_rate = done_rate;
        setDone_rateIsSet(true);
        return this;
    }

    public void setDone_rateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBVideoStatArg setVideo_name(String video_name) {
        this.video_name = video_name;
        return this;
    }

    public void setVideo_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.video_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBVideoStatArg(");
        sb2.append("video_name:");
        String str = this.video_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("done_rate:");
        sb2.append(this.done_rate);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDone_rate() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetVideo_name() {
        this.video_name = null;
    }

    public void validate() throws TException {
        if (this.video_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'video_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBVideoStatArg other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetVideo_name()).compareTo(Boolean.valueOf(other.isSetVideo_name()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetVideo_name() && (compareTo2 = TBaseHelper.compareTo(this.video_name, other.video_name)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetDone_rate()).compareTo(Boolean.valueOf(other.isSetDone_rate()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetDone_rate() || (compareTo = TBaseHelper.compareTo(this.done_rate, other.done_rate)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBVideoStatArg, _Fields> deepCopy2() {
        return new BBVideoStatArg(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBVideoStatArg$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getVideo_name();
        }
        if (i11 == 2) {
            return Double.valueOf(getDone_rate());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBVideoStatArg$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetVideo_name();
        }
        if (i11 == 2) {
            return isSetDone_rate();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBVideoStatArg$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetVideo_name();
                return;
            } else {
                setVideo_name((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetDone_rate();
        } else {
            setDone_rate(((Double) value).doubleValue());
        }
    }

    public BBVideoStatArg(String video_name, double done_rate) {
        this();
        this.video_name = video_name;
        this.done_rate = done_rate;
        setDone_rateIsSet(true);
    }

    public boolean equals(BBVideoStatArg that) {
        if (that == null) {
            return false;
        }
        boolean isSetVideo_name = isSetVideo_name();
        boolean isSetVideo_name2 = that.isSetVideo_name();
        return (!(isSetVideo_name || isSetVideo_name2) || (isSetVideo_name && isSetVideo_name2 && this.video_name.equals(that.video_name))) && this.done_rate == that.done_rate;
    }

    public BBVideoStatArg(BBVideoStatArg other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetVideo_name()) {
            this.video_name = other.video_name;
        }
        this.done_rate = other.done_rate;
    }
}
