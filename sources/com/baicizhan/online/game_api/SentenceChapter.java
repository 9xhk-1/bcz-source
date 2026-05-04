package com.baicizhan.online.game_api;

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
public class SentenceChapter implements TBase<SentenceChapter, _Fields>, Serializable, Cloneable, Comparable<SentenceChapter> {
    private static final int __BUILDINGID_ISSET_ID = 3;
    private static final int __CHAPTERID_ISSET_ID = 0;
    private static final int __PARENTID_ISSET_ID = 1;
    private static final int __SEQNO_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int buildingId;
    public int chapterId;
    public String name;
    public int parentId;
    public int seqNo;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceChapter");
    private static final TField CHAPTER_ID_FIELD_DESC = new TField("chapterId", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField PARENT_ID_FIELD_DESC = new TField("parentId", (byte) 8, 3);
    private static final TField SEQ_NO_FIELD_DESC = new TField("seqNo", (byte) 8, 4);
    private static final TField BUILDING_ID_FIELD_DESC = new TField("buildingId", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceChapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields = iArr;
            try {
                iArr[_Fields.CHAPTER_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields[_Fields.PARENT_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields[_Fields.SEQ_NO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields[_Fields.BUILDING_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceChapterStandardScheme extends StandardScheme<SentenceChapter> {
        private SentenceChapterStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceChapter struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 8) {
                                    struct.buildingId = iprot.readI32();
                                    struct.setBuildingIdIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.seqNo = iprot.readI32();
                                struct.setSeqNoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.parentId = iprot.readI32();
                            struct.setParentIdIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.name = iprot.readString();
                        struct.setNameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.chapterId = iprot.readI32();
                    struct.setChapterIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetChapterId()) {
                throw new TProtocolException("Required field 'chapterId' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetParentId()) {
                throw new TProtocolException("Required field 'parentId' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetSeqNo()) {
                throw new TProtocolException("Required field 'seqNo' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetBuildingId()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'buildingId' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SentenceChapter struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceChapter.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceChapter.CHAPTER_ID_FIELD_DESC);
            oprot.writeI32(struct.chapterId);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(SentenceChapter.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SentenceChapter.PARENT_ID_FIELD_DESC);
            oprot.writeI32(struct.parentId);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceChapter.SEQ_NO_FIELD_DESC);
            oprot.writeI32(struct.seqNo);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceChapter.BUILDING_ID_FIELD_DESC);
            oprot.writeI32(struct.buildingId);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceChapterStandardSchemeFactory implements SchemeFactory {
        private SentenceChapterStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceChapterStandardScheme getScheme() {
            return new SentenceChapterStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceChapterTupleScheme extends TupleScheme<SentenceChapter> {
        private SentenceChapterTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceChapter struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.chapterId = tTupleProtocol.readI32();
            struct.setChapterIdIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.parentId = tTupleProtocol.readI32();
            struct.setParentIdIsSet(true);
            struct.seqNo = tTupleProtocol.readI32();
            struct.setSeqNoIsSet(true);
            struct.buildingId = tTupleProtocol.readI32();
            struct.setBuildingIdIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceChapter struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.chapterId);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeI32(struct.parentId);
            tTupleProtocol.writeI32(struct.seqNo);
            tTupleProtocol.writeI32(struct.buildingId);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceChapterTupleSchemeFactory implements SchemeFactory {
        private SentenceChapterTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceChapterTupleScheme getScheme() {
            return new SentenceChapterTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CHAPTER_ID(1, "chapterId"),
        NAME(2, "name"),
        PARENT_ID(3, "parentId"),
        SEQ_NO(4, "seqNo"),
        BUILDING_ID(5, "buildingId");

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
                return CHAPTER_ID;
            }
            if (fieldId == 2) {
                return NAME;
            }
            if (fieldId == 3) {
                return PARENT_ID;
            }
            if (fieldId == 4) {
                return SEQ_NO;
            }
            if (fieldId != 5) {
                return null;
            }
            return BUILDING_ID;
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
        hashMap.put(StandardScheme.class, new SentenceChapterStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceChapterTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CHAPTER_ID, (_Fields) new FieldMetaData("chapterId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PARENT_ID, (_Fields) new FieldMetaData("parentId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SEQ_NO, (_Fields) new FieldMetaData("seqNo", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BUILDING_ID, (_Fields) new FieldMetaData("buildingId", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceChapter.class, unmodifiableMap);
    }

    public SentenceChapter() {
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
        setChapterIdIsSet(false);
        this.chapterId = 0;
        this.name = null;
        setParentIdIsSet(false);
        this.parentId = 0;
        setSeqNoIsSet(false);
        this.seqNo = 0;
        setBuildingIdIsSet(false);
        this.buildingId = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceChapter)) {
            return equals((SentenceChapter) that);
        }
        return false;
    }

    public int getBuildingId() {
        return this.buildingId;
    }

    public int getChapterId() {
        return this.chapterId;
    }

    public String getName() {
        return this.name;
    }

    public int getParentId() {
        return this.parentId;
    }

    public int getSeqNo() {
        return this.seqNo;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuildingId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetChapterId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetParentId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetSeqNo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceChapter setBuildingId(int buildingId) {
        this.buildingId = buildingId;
        setBuildingIdIsSet(true);
        return this;
    }

    public void setBuildingIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SentenceChapter setChapterId(int chapterId) {
        this.chapterId = chapterId;
        setChapterIdIsSet(true);
        return this;
    }

    public void setChapterIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SentenceChapter setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public SentenceChapter setParentId(int parentId) {
        this.parentId = parentId;
        setParentIdIsSet(true);
        return this;
    }

    public void setParentIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SentenceChapter setSeqNo(int seqNo) {
        this.seqNo = seqNo;
        setSeqNoIsSet(true);
        return this;
    }

    public void setSeqNoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceChapter(");
        sb2.append("chapterId:");
        sb2.append(this.chapterId);
        sb2.append(j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("parentId:");
        sb2.append(this.parentId);
        sb2.append(j2.O);
        sb2.append("seqNo:");
        sb2.append(this.seqNo);
        sb2.append(j2.O);
        sb2.append("buildingId:");
        sb2.append(this.buildingId);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBuildingId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetChapterId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetParentId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetSeqNo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.name != null) {
            return;
        }
        throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceChapter other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetChapterId()).compareTo(Boolean.valueOf(other.isSetChapterId()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetChapterId() && (compareTo5 = TBaseHelper.compareTo(this.chapterId, other.chapterId)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetName() && (compareTo4 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetParentId()).compareTo(Boolean.valueOf(other.isSetParentId()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetParentId() && (compareTo3 = TBaseHelper.compareTo(this.parentId, other.parentId)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetSeqNo()).compareTo(Boolean.valueOf(other.isSetSeqNo()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetSeqNo() && (compareTo2 = TBaseHelper.compareTo(this.seqNo, other.seqNo)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetBuildingId()).compareTo(Boolean.valueOf(other.isSetBuildingId()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetBuildingId() || (compareTo = TBaseHelper.compareTo(this.buildingId, other.buildingId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceChapter, _Fields> deepCopy2() {
        return new SentenceChapter(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getChapterId());
        }
        if (i11 == 2) {
            return getName();
        }
        if (i11 == 3) {
            return Integer.valueOf(getParentId());
        }
        if (i11 == 4) {
            return Integer.valueOf(getSeqNo());
        }
        if (i11 == 5) {
            return Integer.valueOf(getBuildingId());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetChapterId();
        }
        if (i11 == 2) {
            return isSetName();
        }
        if (i11 == 3) {
            return isSetParentId();
        }
        if (i11 == 4) {
            return isSetSeqNo();
        }
        if (i11 == 5) {
            return isSetBuildingId();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceChapter$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetChapterId();
                return;
            } else {
                setChapterId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetName();
                return;
            } else {
                setName((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetParentId();
                return;
            } else {
                setParentId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetSeqNo();
                return;
            } else {
                setSeqNo(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetBuildingId();
        } else {
            setBuildingId(((Integer) value).intValue());
        }
    }

    public SentenceChapter(int chapterId, String name, int parentId, int seqNo, int buildingId) {
        this();
        this.chapterId = chapterId;
        setChapterIdIsSet(true);
        this.name = name;
        this.parentId = parentId;
        setParentIdIsSet(true);
        this.seqNo = seqNo;
        setSeqNoIsSet(true);
        this.buildingId = buildingId;
        setBuildingIdIsSet(true);
    }

    public boolean equals(SentenceChapter that) {
        if (that == null || this.chapterId != that.chapterId) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        return (!(isSetName || isSetName2) || (isSetName && isSetName2 && this.name.equals(that.name))) && this.parentId == that.parentId && this.seqNo == that.seqNo && this.buildingId == that.buildingId;
    }

    public SentenceChapter(SentenceChapter other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.chapterId = other.chapterId;
        if (other.isSetName()) {
            this.name = other.name;
        }
        this.parentId = other.parentId;
        this.seqNo = other.seqNo;
        this.buildingId = other.buildingId;
    }
}
