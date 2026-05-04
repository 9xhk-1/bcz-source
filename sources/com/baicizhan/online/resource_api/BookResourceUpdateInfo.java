package com.baicizhan.online.resource_api;

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
public class BookResourceUpdateInfo implements TBase<BookResourceUpdateInfo, _Fields>, Serializable, Cloneable, Comparable<BookResourceUpdateInfo> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __POSTER_UPDATED_AT_ISSET_ID = 3;
    private static final int __ROADMAP_VERSION_ISSET_ID = 4;
    private static final int __TV_TOPIC_UPDATED_AT_ISSET_ID = 5;
    private static final int __WORD_FM_UPDATED_AT_ISSET_ID = 2;
    private static final int __ZPK_UPDATED_AT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public long poster_updated_at;
    public long roadmap_version;
    public long tv_topic_updated_at;
    public long word_fm_updated_at;
    public long zpk_updated_at;
    private static final TStruct STRUCT_DESC = new TStruct("BookResourceUpdateInfo");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField ZPK_UPDATED_AT_FIELD_DESC = new TField("zpk_updated_at", (byte) 10, 2);
    private static final TField WORD_FM_UPDATED_AT_FIELD_DESC = new TField("word_fm_updated_at", (byte) 10, 3);
    private static final TField POSTER_UPDATED_AT_FIELD_DESC = new TField("poster_updated_at", (byte) 10, 4);
    private static final TField ROADMAP_VERSION_FIELD_DESC = new TField("roadmap_version", (byte) 10, 5);
    private static final TField TV_TOPIC_UPDATED_AT_FIELD_DESC = new TField("tv_topic_updated_at", (byte) 10, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.BookResourceUpdateInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[_Fields.ZPK_UPDATED_AT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[_Fields.WORD_FM_UPDATED_AT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[_Fields.POSTER_UPDATED_AT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[_Fields.ROADMAP_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[_Fields.TV_TOPIC_UPDATED_AT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookResourceUpdateInfoStandardScheme extends StandardScheme<BookResourceUpdateInfo> {
        private BookResourceUpdateInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BookResourceUpdateInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetZpk_updated_at()) {
                        throw new TProtocolException("Required field 'zpk_updated_at' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetWord_fm_updated_at()) {
                        throw new TProtocolException("Required field 'word_fm_updated_at' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetPoster_updated_at()) {
                        throw new TProtocolException("Required field 'poster_updated_at' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetRoadmap_version()) {
                        throw new TProtocolException("Required field 'roadmap_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetTv_topic_updated_at()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'tv_topic_updated_at' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_id = iprot.readI32();
                            struct.setBook_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.zpk_updated_at = iprot.readI64();
                            struct.setZpk_updated_atIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_fm_updated_at = iprot.readI64();
                            struct.setWord_fm_updated_atIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.poster_updated_at = iprot.readI64();
                            struct.setPoster_updated_atIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.roadmap_version = iprot.readI64();
                            struct.setRoadmap_versionIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_topic_updated_at = iprot.readI64();
                            struct.setTv_topic_updated_atIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BookResourceUpdateInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BookResourceUpdateInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BookResourceUpdateInfo.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookResourceUpdateInfo.ZPK_UPDATED_AT_FIELD_DESC);
            oprot.writeI64(struct.zpk_updated_at);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookResourceUpdateInfo.WORD_FM_UPDATED_AT_FIELD_DESC);
            oprot.writeI64(struct.word_fm_updated_at);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookResourceUpdateInfo.POSTER_UPDATED_AT_FIELD_DESC);
            oprot.writeI64(struct.poster_updated_at);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookResourceUpdateInfo.ROADMAP_VERSION_FIELD_DESC);
            oprot.writeI64(struct.roadmap_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookResourceUpdateInfo.TV_TOPIC_UPDATED_AT_FIELD_DESC);
            oprot.writeI64(struct.tv_topic_updated_at);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookResourceUpdateInfoStandardSchemeFactory implements SchemeFactory {
        private BookResourceUpdateInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookResourceUpdateInfoStandardScheme getScheme() {
            return new BookResourceUpdateInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookResourceUpdateInfoTupleScheme extends TupleScheme<BookResourceUpdateInfo> {
        private BookResourceUpdateInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BookResourceUpdateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.zpk_updated_at = tTupleProtocol.readI64();
            struct.setZpk_updated_atIsSet(true);
            struct.word_fm_updated_at = tTupleProtocol.readI64();
            struct.setWord_fm_updated_atIsSet(true);
            struct.poster_updated_at = tTupleProtocol.readI64();
            struct.setPoster_updated_atIsSet(true);
            struct.roadmap_version = tTupleProtocol.readI64();
            struct.setRoadmap_versionIsSet(true);
            struct.tv_topic_updated_at = tTupleProtocol.readI64();
            struct.setTv_topic_updated_atIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BookResourceUpdateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI64(struct.zpk_updated_at);
            tTupleProtocol.writeI64(struct.word_fm_updated_at);
            tTupleProtocol.writeI64(struct.poster_updated_at);
            tTupleProtocol.writeI64(struct.roadmap_version);
            tTupleProtocol.writeI64(struct.tv_topic_updated_at);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookResourceUpdateInfoTupleSchemeFactory implements SchemeFactory {
        private BookResourceUpdateInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookResourceUpdateInfoTupleScheme getScheme() {
            return new BookResourceUpdateInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        ZPK_UPDATED_AT(2, "zpk_updated_at"),
        WORD_FM_UPDATED_AT(3, "word_fm_updated_at"),
        POSTER_UPDATED_AT(4, "poster_updated_at"),
        ROADMAP_VERSION(5, "roadmap_version"),
        TV_TOPIC_UPDATED_AT(6, "tv_topic_updated_at");

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
            switch (fieldId) {
                case 1:
                    return BOOK_ID;
                case 2:
                    return ZPK_UPDATED_AT;
                case 3:
                    return WORD_FM_UPDATED_AT;
                case 4:
                    return POSTER_UPDATED_AT;
                case 5:
                    return ROADMAP_VERSION;
                case 6:
                    return TV_TOPIC_UPDATED_AT;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new BookResourceUpdateInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BookResourceUpdateInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ZPK_UPDATED_AT, (_Fields) new FieldMetaData("zpk_updated_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.WORD_FM_UPDATED_AT, (_Fields) new FieldMetaData("word_fm_updated_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.POSTER_UPDATED_AT, (_Fields) new FieldMetaData("poster_updated_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ROADMAP_VERSION, (_Fields) new FieldMetaData("roadmap_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TV_TOPIC_UPDATED_AT, (_Fields) new FieldMetaData("tv_topic_updated_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BookResourceUpdateInfo.class, unmodifiableMap);
    }

    public BookResourceUpdateInfo() {
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
        setBook_idIsSet(false);
        this.book_id = 0;
        setZpk_updated_atIsSet(false);
        this.zpk_updated_at = 0L;
        setWord_fm_updated_atIsSet(false);
        this.word_fm_updated_at = 0L;
        setPoster_updated_atIsSet(false);
        this.poster_updated_at = 0L;
        setRoadmap_versionIsSet(false);
        this.roadmap_version = 0L;
        setTv_topic_updated_atIsSet(false);
        this.tv_topic_updated_at = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BookResourceUpdateInfo)) {
            return equals((BookResourceUpdateInfo) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public long getPoster_updated_at() {
        return this.poster_updated_at;
    }

    public long getRoadmap_version() {
        return this.roadmap_version;
    }

    public long getTv_topic_updated_at() {
        return this.tv_topic_updated_at;
    }

    public long getWord_fm_updated_at() {
        return this.word_fm_updated_at;
    }

    public long getZpk_updated_at() {
        return this.zpk_updated_at;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetPoster_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetRoadmap_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetTv_topic_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetWord_fm_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetZpk_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BookResourceUpdateInfo setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BookResourceUpdateInfo setPoster_updated_at(long poster_updated_at) {
        this.poster_updated_at = poster_updated_at;
        setPoster_updated_atIsSet(true);
        return this;
    }

    public void setPoster_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BookResourceUpdateInfo setRoadmap_version(long roadmap_version) {
        this.roadmap_version = roadmap_version;
        setRoadmap_versionIsSet(true);
        return this;
    }

    public void setRoadmap_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public BookResourceUpdateInfo setTv_topic_updated_at(long tv_topic_updated_at) {
        this.tv_topic_updated_at = tv_topic_updated_at;
        setTv_topic_updated_atIsSet(true);
        return this;
    }

    public void setTv_topic_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public BookResourceUpdateInfo setWord_fm_updated_at(long word_fm_updated_at) {
        this.word_fm_updated_at = word_fm_updated_at;
        setWord_fm_updated_atIsSet(true);
        return this;
    }

    public void setWord_fm_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BookResourceUpdateInfo setZpk_updated_at(long zpk_updated_at) {
        this.zpk_updated_at = zpk_updated_at;
        setZpk_updated_atIsSet(true);
        return this;
    }

    public void setZpk_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "BookResourceUpdateInfo(book_id:" + this.book_id + j2.O + "zpk_updated_at:" + this.zpk_updated_at + j2.O + "word_fm_updated_at:" + this.word_fm_updated_at + j2.O + "poster_updated_at:" + this.poster_updated_at + j2.O + "roadmap_version:" + this.roadmap_version + j2.O + "tv_topic_updated_at:" + this.tv_topic_updated_at + pn.j.f81007d;
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetPoster_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetRoadmap_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetTv_topic_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetWord_fm_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetZpk_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BookResourceUpdateInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetBook_id() && (compareTo6 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetZpk_updated_at()).compareTo(Boolean.valueOf(other.isSetZpk_updated_at()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetZpk_updated_at() && (compareTo5 = TBaseHelper.compareTo(this.zpk_updated_at, other.zpk_updated_at)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetWord_fm_updated_at()).compareTo(Boolean.valueOf(other.isSetWord_fm_updated_at()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetWord_fm_updated_at() && (compareTo4 = TBaseHelper.compareTo(this.word_fm_updated_at, other.word_fm_updated_at)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetPoster_updated_at()).compareTo(Boolean.valueOf(other.isSetPoster_updated_at()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetPoster_updated_at() && (compareTo3 = TBaseHelper.compareTo(this.poster_updated_at, other.poster_updated_at)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetRoadmap_version()).compareTo(Boolean.valueOf(other.isSetRoadmap_version()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetRoadmap_version() && (compareTo2 = TBaseHelper.compareTo(this.roadmap_version, other.roadmap_version)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetTv_topic_updated_at()).compareTo(Boolean.valueOf(other.isSetTv_topic_updated_at()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetTv_topic_updated_at() || (compareTo = TBaseHelper.compareTo(this.tv_topic_updated_at, other.tv_topic_updated_at)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BookResourceUpdateInfo, _Fields> deepCopy2() {
        return new BookResourceUpdateInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return Long.valueOf(getZpk_updated_at());
            case 3:
                return Long.valueOf(getWord_fm_updated_at());
            case 4:
                return Long.valueOf(getPoster_updated_at());
            case 5:
                return Long.valueOf(getRoadmap_version());
            case 6:
                return Long.valueOf(getTv_topic_updated_at());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetZpk_updated_at();
            case 3:
                return isSetWord_fm_updated_at();
            case 4:
                return isSetPoster_updated_at();
            case 5:
                return isSetRoadmap_version();
            case 6:
                return isSetTv_topic_updated_at();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$BookResourceUpdateInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setBook_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setZpk_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetZpk_updated_at();
                    break;
                }
            case 3:
                if (value != null) {
                    setWord_fm_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetWord_fm_updated_at();
                    break;
                }
            case 4:
                if (value != null) {
                    setPoster_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetPoster_updated_at();
                    break;
                }
            case 5:
                if (value != null) {
                    setRoadmap_version(((Long) value).longValue());
                    break;
                } else {
                    unsetRoadmap_version();
                    break;
                }
            case 6:
                if (value != null) {
                    setTv_topic_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetTv_topic_updated_at();
                    break;
                }
        }
    }

    public BookResourceUpdateInfo(int book_id, long zpk_updated_at, long word_fm_updated_at, long poster_updated_at, long roadmap_version, long tv_topic_updated_at) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.zpk_updated_at = zpk_updated_at;
        setZpk_updated_atIsSet(true);
        this.word_fm_updated_at = word_fm_updated_at;
        setWord_fm_updated_atIsSet(true);
        this.poster_updated_at = poster_updated_at;
        setPoster_updated_atIsSet(true);
        this.roadmap_version = roadmap_version;
        setRoadmap_versionIsSet(true);
        this.tv_topic_updated_at = tv_topic_updated_at;
        setTv_topic_updated_atIsSet(true);
    }

    public boolean equals(BookResourceUpdateInfo that) {
        return that != null && this.book_id == that.book_id && this.zpk_updated_at == that.zpk_updated_at && this.word_fm_updated_at == that.word_fm_updated_at && this.poster_updated_at == that.poster_updated_at && this.roadmap_version == that.roadmap_version && this.tv_topic_updated_at == that.tv_topic_updated_at;
    }

    public BookResourceUpdateInfo(BookResourceUpdateInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        this.zpk_updated_at = other.zpk_updated_at;
        this.word_fm_updated_at = other.word_fm_updated_at;
        this.poster_updated_at = other.poster_updated_at;
        this.roadmap_version = other.roadmap_version;
        this.tv_topic_updated_at = other.tv_topic_updated_at;
    }

    public void validate() throws TException {
    }
}
