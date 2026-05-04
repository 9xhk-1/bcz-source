package com.baicizhan.online.game_api;

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
public class StudyRecrodRsp implements TBase<StudyRecrodRsp, _Fields>, Serializable, Cloneable, Comparable<StudyRecrodRsp> {
    private static final int __VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<WordAbilityItem> ability;
    public List<StudyRecordItem> study_records;
    public long version;
    private static final TStruct STRUCT_DESC = new TStruct("StudyRecrodRsp");
    private static final TField STUDY_RECORDS_FIELD_DESC = new TField("study_records", (byte) 15, 1);
    private static final TField ABILITY_FIELD_DESC = new TField("ability", (byte) 15, 2);
    private static final TField VERSION_FIELD_DESC = new TField("version", (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.StudyRecrodRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$StudyRecrodRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$StudyRecrodRsp$_Fields = iArr;
            try {
                iArr[_Fields.STUDY_RECORDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecrodRsp$_Fields[_Fields.ABILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecrodRsp$_Fields[_Fields.VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecrodRspStandardScheme extends StandardScheme<StudyRecrodRsp> {
        private StudyRecrodRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyRecrodRsp struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 10) {
                            struct.version = iprot.readI64();
                            struct.setVersionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.ability = new ArrayList(readListBegin.size);
                        while (i11 < readListBegin.size) {
                            WordAbilityItem wordAbilityItem = new WordAbilityItem();
                            wordAbilityItem.read(iprot);
                            struct.ability.add(wordAbilityItem);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setAbilityIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin2 = iprot.readListBegin();
                    struct.study_records = new ArrayList(readListBegin2.size);
                    while (i11 < readListBegin2.size) {
                        StudyRecordItem studyRecordItem = new StudyRecordItem();
                        studyRecordItem.read(iprot);
                        struct.study_records.add(studyRecordItem);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setStudy_recordsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetVersion()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StudyRecrodRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyRecrodRsp.STRUCT_DESC);
            if (struct.study_records != null) {
                oprot.writeFieldBegin(StudyRecrodRsp.STUDY_RECORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.study_records.size()));
                Iterator<StudyRecordItem> it = struct.study_records.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.ability != null) {
                oprot.writeFieldBegin(StudyRecrodRsp.ABILITY_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.ability.size()));
                Iterator<WordAbilityItem> it2 = struct.ability.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(StudyRecrodRsp.VERSION_FIELD_DESC);
            oprot.writeI64(struct.version);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecrodRspStandardSchemeFactory implements SchemeFactory {
        private StudyRecrodRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyRecrodRspStandardScheme getScheme() {
            return new StudyRecrodRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecrodRspTupleScheme extends TupleScheme<StudyRecrodRsp> {
        private StudyRecrodRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyRecrodRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.study_records = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                StudyRecordItem studyRecordItem = new StudyRecordItem();
                studyRecordItem.read(tTupleProtocol);
                struct.study_records.add(studyRecordItem);
            }
            struct.setStudy_recordsIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.ability = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                WordAbilityItem wordAbilityItem = new WordAbilityItem();
                wordAbilityItem.read(tTupleProtocol);
                struct.ability.add(wordAbilityItem);
            }
            struct.setAbilityIsSet(true);
            struct.version = tTupleProtocol.readI64();
            struct.setVersionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyRecrodRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.study_records.size());
            Iterator<StudyRecordItem> it = struct.study_records.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.ability.size());
            Iterator<WordAbilityItem> it2 = struct.ability.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI64(struct.version);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecrodRspTupleSchemeFactory implements SchemeFactory {
        private StudyRecrodRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyRecrodRspTupleScheme getScheme() {
            return new StudyRecrodRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        STUDY_RECORDS(1, "study_records"),
        ABILITY(2, "ability"),
        VERSION(4, "version");

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
                return STUDY_RECORDS;
            }
            if (fieldId == 2) {
                return ABILITY;
            }
            if (fieldId != 4) {
                return null;
            }
            return VERSION;
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
        hashMap.put(StandardScheme.class, new StudyRecrodRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyRecrodRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.STUDY_RECORDS, (_Fields) new FieldMetaData("study_records", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, StudyRecordItem.class))));
        enumMap.put((EnumMap) _Fields.ABILITY, (_Fields) new FieldMetaData("ability", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WordAbilityItem.class))));
        enumMap.put((EnumMap) _Fields.VERSION, (_Fields) new FieldMetaData("version", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyRecrodRsp.class, unmodifiableMap);
    }

    public StudyRecrodRsp() {
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

    public void addToAbility(WordAbilityItem elem) {
        if (this.ability == null) {
            this.ability = new ArrayList();
        }
        this.ability.add(elem);
    }

    public void addToStudy_records(StudyRecordItem elem) {
        if (this.study_records == null) {
            this.study_records = new ArrayList();
        }
        this.study_records.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.study_records = null;
        this.ability = null;
        setVersionIsSet(false);
        this.version = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyRecrodRsp)) {
            return equals((StudyRecrodRsp) that);
        }
        return false;
    }

    public List<WordAbilityItem> getAbility() {
        return this.ability;
    }

    public Iterator<WordAbilityItem> getAbilityIterator() {
        List<WordAbilityItem> list = this.ability;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAbilitySize() {
        List<WordAbilityItem> list = this.ability;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<StudyRecordItem> getStudy_records() {
        return this.study_records;
    }

    public Iterator<StudyRecordItem> getStudy_recordsIterator() {
        List<StudyRecordItem> list = this.study_records;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getStudy_recordsSize() {
        List<StudyRecordItem> list = this.study_records;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAbility() {
        return this.ability != null;
    }

    public boolean isSetStudy_records() {
        return this.study_records != null;
    }

    public boolean isSetVersion() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyRecrodRsp setAbility(List<WordAbilityItem> ability) {
        this.ability = ability;
        return this;
    }

    public void setAbilityIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ability = null;
    }

    public StudyRecrodRsp setStudy_records(List<StudyRecordItem> study_records) {
        this.study_records = study_records;
        return this;
    }

    public void setStudy_recordsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.study_records = null;
    }

    public StudyRecrodRsp setVersion(long version) {
        this.version = version;
        setVersionIsSet(true);
        return this;
    }

    public void setVersionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StudyRecrodRsp(");
        sb2.append("study_records:");
        List<StudyRecordItem> list = this.study_records;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("ability:");
        List<WordAbilityItem> list2 = this.ability;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j2.O);
        sb2.append("version:");
        sb2.append(this.version);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAbility() {
        this.ability = null;
    }

    public void unsetStudy_records() {
        this.study_records = null;
    }

    public void unsetVersion() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.study_records == null) {
            throw new TProtocolException("Required field 'study_records' was not present! Struct: " + toString());
        }
        if (this.ability != null) {
            return;
        }
        throw new TProtocolException("Required field 'ability' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyRecrodRsp other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetStudy_records()).compareTo(Boolean.valueOf(other.isSetStudy_records()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetStudy_records() && (compareTo3 = TBaseHelper.compareTo((List) this.study_records, (List) other.study_records)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetAbility()).compareTo(Boolean.valueOf(other.isSetAbility()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetAbility() && (compareTo2 = TBaseHelper.compareTo((List) this.ability, (List) other.ability)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetVersion()).compareTo(Boolean.valueOf(other.isSetVersion()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetVersion() || (compareTo = TBaseHelper.compareTo(this.version, other.version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyRecrodRsp, _Fields> deepCopy2() {
        return new StudyRecrodRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecrodRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getStudy_records();
        }
        if (i11 == 2) {
            return getAbility();
        }
        if (i11 == 3) {
            return Long.valueOf(getVersion());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecrodRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetStudy_records();
        }
        if (i11 == 2) {
            return isSetAbility();
        }
        if (i11 == 3) {
            return isSetVersion();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecrodRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetStudy_records();
                return;
            } else {
                setStudy_records((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetAbility();
                return;
            } else {
                setAbility((List) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetVersion();
        } else {
            setVersion(((Long) value).longValue());
        }
    }

    public StudyRecrodRsp(List<StudyRecordItem> study_records, List<WordAbilityItem> ability, long version) {
        this();
        this.study_records = study_records;
        this.ability = ability;
        this.version = version;
        setVersionIsSet(true);
    }

    public boolean equals(StudyRecrodRsp that) {
        if (that == null) {
            return false;
        }
        boolean isSetStudy_records = isSetStudy_records();
        boolean isSetStudy_records2 = that.isSetStudy_records();
        if ((isSetStudy_records || isSetStudy_records2) && !(isSetStudy_records && isSetStudy_records2 && this.study_records.equals(that.study_records))) {
            return false;
        }
        boolean isSetAbility = isSetAbility();
        boolean isSetAbility2 = that.isSetAbility();
        return (!(isSetAbility || isSetAbility2) || (isSetAbility && isSetAbility2 && this.ability.equals(that.ability))) && this.version == that.version;
    }

    public StudyRecrodRsp(StudyRecrodRsp other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetStudy_records()) {
            ArrayList arrayList = new ArrayList(other.study_records.size());
            Iterator<StudyRecordItem> it = other.study_records.iterator();
            while (it.hasNext()) {
                arrayList.add(new StudyRecordItem(it.next()));
            }
            this.study_records = arrayList;
        }
        if (other.isSetAbility()) {
            ArrayList arrayList2 = new ArrayList(other.ability.size());
            Iterator<WordAbilityItem> it2 = other.ability.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new WordAbilityItem(it2.next()));
            }
            this.ability = arrayList2;
        }
        this.version = other.version;
    }
}
