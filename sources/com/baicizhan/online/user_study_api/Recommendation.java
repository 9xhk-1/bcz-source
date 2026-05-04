package com.baicizhan.online.user_study_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
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
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
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
public class Recommendation implements TBase<Recommendation, _Fields>, Serializable, Cloneable, Comparable<Recommendation> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public RecommendationDaka rec_daka;
    private static final TStruct STRUCT_DESC = new TStruct("Recommendation");
    private static final TField REC_DAKA_FIELD_DESC = new TField("rec_daka", (byte) 12, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.Recommendation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$Recommendation$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$Recommendation$_Fields = iArr;
            try {
                iArr[_Fields.REC_DAKA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationStandardScheme extends StandardScheme<Recommendation> {
        private RecommendationStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, Recommendation struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                if (readFieldBegin.f77768id != 1) {
                    TProtocolUtil.skip(iprot, b11);
                } else if (b11 == 12) {
                    RecommendationDaka recommendationDaka = new RecommendationDaka();
                    struct.rec_daka = recommendationDaka;
                    recommendationDaka.read(iprot);
                    struct.setRec_dakaIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, Recommendation struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(Recommendation.STRUCT_DESC);
            if (struct.rec_daka != null && struct.isSetRec_daka()) {
                oprot.writeFieldBegin(Recommendation.REC_DAKA_FIELD_DESC);
                struct.rec_daka.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationStandardSchemeFactory implements SchemeFactory {
        private RecommendationStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RecommendationStandardScheme getScheme() {
            return new RecommendationStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationTupleScheme extends TupleScheme<Recommendation> {
        private RecommendationTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, Recommendation struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            if (tTupleProtocol.readBitSet(1).get(0)) {
                RecommendationDaka recommendationDaka = new RecommendationDaka();
                struct.rec_daka = recommendationDaka;
                recommendationDaka.read(tTupleProtocol);
                struct.setRec_dakaIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, Recommendation struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetRec_daka()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetRec_daka()) {
                struct.rec_daka.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationTupleSchemeFactory implements SchemeFactory {
        private RecommendationTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RecommendationTupleScheme getScheme() {
            return new RecommendationTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        REC_DAKA(1, "rec_daka");

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
            if (fieldId != 1) {
                return null;
            }
            return REC_DAKA;
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
        hashMap.put(StandardScheme.class, new RecommendationStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RecommendationTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.REC_DAKA, (_Fields) new FieldMetaData("rec_daka", (byte) 2, new StructMetaData((byte) 12, RecommendationDaka.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(Recommendation.class, unmodifiableMap);
    }

    public Recommendation() {
        this.optionals = new _Fields[]{_Fields.REC_DAKA};
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
        this.rec_daka = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof Recommendation)) {
            return equals((Recommendation) that);
        }
        return false;
    }

    public RecommendationDaka getRec_daka() {
        return this.rec_daka;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetRec_daka() {
        return this.rec_daka != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public Recommendation setRec_daka(RecommendationDaka rec_daka) {
        this.rec_daka = rec_daka;
        return this;
    }

    public void setRec_dakaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.rec_daka = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Recommendation(");
        if (isSetRec_daka()) {
            sb2.append("rec_daka:");
            RecommendationDaka recommendationDaka = this.rec_daka;
            if (recommendationDaka == null) {
                sb2.append("null");
            } else {
                sb2.append(recommendationDaka);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetRec_daka() {
        this.rec_daka = null;
    }

    public void validate() throws TException {
        RecommendationDaka recommendationDaka = this.rec_daka;
        if (recommendationDaka != null) {
            recommendationDaka.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Recommendation other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetRec_daka()).compareTo(Boolean.valueOf(other.isSetRec_daka()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetRec_daka() || (compareTo = TBaseHelper.compareTo((Comparable) this.rec_daka, (Comparable) other.rec_daka)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<Recommendation, _Fields> deepCopy2() {
        return new Recommendation(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$Recommendation$_Fields[field.ordinal()] == 1) {
            return getRec_daka();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$Recommendation$_Fields[field.ordinal()] == 1) {
            return isSetRec_daka();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$Recommendation$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetRec_daka();
        } else {
            setRec_daka((RecommendationDaka) value);
        }
    }

    public Recommendation(Recommendation other) {
        this.optionals = new _Fields[]{_Fields.REC_DAKA};
        if (other.isSetRec_daka()) {
            this.rec_daka = new RecommendationDaka(other.rec_daka);
        }
    }

    public boolean equals(Recommendation that) {
        if (that == null) {
            return false;
        }
        boolean isSetRec_daka = isSetRec_daka();
        boolean isSetRec_daka2 = that.isSetRec_daka();
        if (isSetRec_daka || isSetRec_daka2) {
            return isSetRec_daka && isSetRec_daka2 && this.rec_daka.equals(that.rec_daka);
        }
        return true;
    }
}
