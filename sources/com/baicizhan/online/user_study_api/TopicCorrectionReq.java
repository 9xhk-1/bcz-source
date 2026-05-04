package com.baicizhan.online.user_study_api;

import com.tencent.open.SocialConstants;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TopicCorrectionReq implements TBase<TopicCorrectionReq, _Fields>, Serializable, Cloneable, Comparable<TopicCorrectionReq> {
    private static final int __BOOKID_ISSET_ID = 0;
    private static final int __CATEIDX_ISSET_ID = 3;
    private static final int __MODE_ISSET_ID = 2;
    private static final int __TOPICID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int bookId;
    public int cateIdx;
    public String desc;
    public String imgUrl;
    public int mode;
    private _Fields[] optionals;
    public int topicId;
    private static final TStruct STRUCT_DESC = new TStruct("TopicCorrectionReq");
    private static final TField BOOK_ID_FIELD_DESC = new TField("bookId", (byte) 8, 1);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topicId", (byte) 8, 2);
    private static final TField MODE_FIELD_DESC = new TField("mode", (byte) 8, 3);
    private static final TField CATE_IDX_FIELD_DESC = new TField("cateIdx", (byte) 8, 4);
    private static final TField DESC_FIELD_DESC = new TField(SocialConstants.PARAM_APP_DESC, (byte) 11, 5);
    private static final TField IMG_URL_FIELD_DESC = new TField("imgUrl", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.TopicCorrectionReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[_Fields.TOPIC_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[_Fields.MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[_Fields.CATE_IDX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[_Fields.DESC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[_Fields.IMG_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicCorrectionReqStandardScheme extends StandardScheme<TopicCorrectionReq> {
        private TopicCorrectionReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TopicCorrectionReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBookId()) {
                        throw new TProtocolException("Required field 'bookId' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTopicId()) {
                        throw new TProtocolException("Required field 'topicId' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetMode()) {
                        throw new TProtocolException("Required field 'mode' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCateIdx()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'cateIdx' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.bookId = iprot.readI32();
                            struct.setBookIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topicId = iprot.readI32();
                            struct.setTopicIdIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mode = iprot.readI32();
                            struct.setModeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cateIdx = iprot.readI32();
                            struct.setCateIdxIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.desc = iprot.readString();
                            struct.setDescIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.imgUrl = iprot.readString();
                            struct.setImgUrlIsSet(true);
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
        public void write(TProtocol oprot, TopicCorrectionReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TopicCorrectionReq.STRUCT_DESC);
            oprot.writeFieldBegin(TopicCorrectionReq.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.bookId);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TopicCorrectionReq.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topicId);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TopicCorrectionReq.MODE_FIELD_DESC);
            oprot.writeI32(struct.mode);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TopicCorrectionReq.CATE_IDX_FIELD_DESC);
            oprot.writeI32(struct.cateIdx);
            oprot.writeFieldEnd();
            if (struct.desc != null) {
                oprot.writeFieldBegin(TopicCorrectionReq.DESC_FIELD_DESC);
                oprot.writeString(struct.desc);
                oprot.writeFieldEnd();
            }
            if (struct.imgUrl != null && struct.isSetImgUrl()) {
                oprot.writeFieldBegin(TopicCorrectionReq.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.imgUrl);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicCorrectionReqStandardSchemeFactory implements SchemeFactory {
        private TopicCorrectionReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TopicCorrectionReqStandardScheme getScheme() {
            return new TopicCorrectionReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicCorrectionReqTupleScheme extends TupleScheme<TopicCorrectionReq> {
        private TopicCorrectionReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TopicCorrectionReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.bookId = tTupleProtocol.readI32();
            struct.setBookIdIsSet(true);
            struct.topicId = tTupleProtocol.readI32();
            struct.setTopicIdIsSet(true);
            struct.mode = tTupleProtocol.readI32();
            struct.setModeIsSet(true);
            struct.cateIdx = tTupleProtocol.readI32();
            struct.setCateIdxIsSet(true);
            struct.desc = tTupleProtocol.readString();
            struct.setDescIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.imgUrl = tTupleProtocol.readString();
                struct.setImgUrlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TopicCorrectionReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.bookId);
            tTupleProtocol.writeI32(struct.topicId);
            tTupleProtocol.writeI32(struct.mode);
            tTupleProtocol.writeI32(struct.cateIdx);
            tTupleProtocol.writeString(struct.desc);
            BitSet bitSet = new BitSet();
            if (struct.isSetImgUrl()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetImgUrl()) {
                tTupleProtocol.writeString(struct.imgUrl);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicCorrectionReqTupleSchemeFactory implements SchemeFactory {
        private TopicCorrectionReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TopicCorrectionReqTupleScheme getScheme() {
            return new TopicCorrectionReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "bookId"),
        TOPIC_ID(2, "topicId"),
        MODE(3, "mode"),
        CATE_IDX(4, "cateIdx"),
        DESC(5, SocialConstants.PARAM_APP_DESC),
        IMG_URL(6, "imgUrl");

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
                    return TOPIC_ID;
                case 3:
                    return MODE;
                case 4:
                    return CATE_IDX;
                case 5:
                    return DESC;
                case 6:
                    return IMG_URL;
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
        hashMap.put(StandardScheme.class, new TopicCorrectionReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TopicCorrectionReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("bookId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topicId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MODE, (_Fields) new FieldMetaData("mode", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CATE_IDX, (_Fields) new FieldMetaData("cateIdx", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DESC, (_Fields) new FieldMetaData(SocialConstants.PARAM_APP_DESC, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData("imgUrl", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TopicCorrectionReq.class, unmodifiableMap);
    }

    public TopicCorrectionReq() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMG_URL};
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
        setBookIdIsSet(false);
        this.bookId = 0;
        setTopicIdIsSet(false);
        this.topicId = 0;
        setModeIsSet(false);
        this.mode = 0;
        setCateIdxIsSet(false);
        this.cateIdx = 0;
        this.desc = null;
        this.imgUrl = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TopicCorrectionReq)) {
            return equals((TopicCorrectionReq) that);
        }
        return false;
    }

    public int getBookId() {
        return this.bookId;
    }

    public int getCateIdx() {
        return this.cateIdx;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public int getMode() {
        return this.mode;
    }

    public int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBookId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetCateIdx() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetDesc() {
        return this.desc != null;
    }

    public boolean isSetImgUrl() {
        return this.imgUrl != null;
    }

    public boolean isSetMode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopicId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TopicCorrectionReq setBookId(int bookId) {
        this.bookId = bookId;
        setBookIdIsSet(true);
        return this;
    }

    public void setBookIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public TopicCorrectionReq setCateIdx(int cateIdx) {
        this.cateIdx = cateIdx;
        setCateIdxIsSet(true);
        return this;
    }

    public void setCateIdxIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public TopicCorrectionReq setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public void setDescIsSet(boolean value) {
        if (value) {
            return;
        }
        this.desc = null;
    }

    public TopicCorrectionReq setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public void setImgUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.imgUrl = null;
    }

    public TopicCorrectionReq setMode(int mode) {
        this.mode = mode;
        setModeIsSet(true);
        return this;
    }

    public void setModeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public TopicCorrectionReq setTopicId(int topicId) {
        this.topicId = topicId;
        setTopicIdIsSet(true);
        return this;
    }

    public void setTopicIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TopicCorrectionReq(");
        sb2.append("bookId:");
        sb2.append(this.bookId);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("topicId:");
        sb2.append(this.topicId);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("mode:");
        sb2.append(this.mode);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("cateIdx:");
        sb2.append(this.cateIdx);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("desc:");
        String str = this.desc;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetImgUrl()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("imgUrl:");
            String str2 = this.imgUrl;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBookId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetCateIdx() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetDesc() {
        this.desc = null;
    }

    public void unsetImgUrl() {
        this.imgUrl = null;
    }

    public void unsetMode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopicId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.desc != null) {
            return;
        }
        throw new TProtocolException("Required field 'desc' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TopicCorrectionReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetBookId()).compareTo(Boolean.valueOf(other.isSetBookId()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetBookId() && (compareTo6 = TBaseHelper.compareTo(this.bookId, other.bookId)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetTopicId()).compareTo(Boolean.valueOf(other.isSetTopicId()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetTopicId() && (compareTo5 = TBaseHelper.compareTo(this.topicId, other.topicId)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetMode()).compareTo(Boolean.valueOf(other.isSetMode()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMode() && (compareTo4 = TBaseHelper.compareTo(this.mode, other.mode)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetCateIdx()).compareTo(Boolean.valueOf(other.isSetCateIdx()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetCateIdx() && (compareTo3 = TBaseHelper.compareTo(this.cateIdx, other.cateIdx)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetDesc()).compareTo(Boolean.valueOf(other.isSetDesc()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetDesc() && (compareTo2 = TBaseHelper.compareTo(this.desc, other.desc)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetImgUrl()).compareTo(Boolean.valueOf(other.isSetImgUrl()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetImgUrl() || (compareTo = TBaseHelper.compareTo(this.imgUrl, other.imgUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TopicCorrectionReq, _Fields> deepCopy2() {
        return new TopicCorrectionReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBookId());
            case 2:
                return Integer.valueOf(getTopicId());
            case 3:
                return Integer.valueOf(getMode());
            case 4:
                return Integer.valueOf(getCateIdx());
            case 5:
                return getDesc();
            case 6:
                return getImgUrl();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[field.ordinal()]) {
            case 1:
                return isSetBookId();
            case 2:
                return isSetTopicId();
            case 3:
                return isSetMode();
            case 4:
                return isSetCateIdx();
            case 5:
                return isSetDesc();
            case 6:
                return isSetImgUrl();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TopicCorrectionReq$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setBookId(((Integer) value).intValue());
                    break;
                } else {
                    unsetBookId();
                    break;
                }
            case 2:
                if (value != null) {
                    setTopicId(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopicId();
                    break;
                }
            case 3:
                if (value != null) {
                    setMode(((Integer) value).intValue());
                    break;
                } else {
                    unsetMode();
                    break;
                }
            case 4:
                if (value != null) {
                    setCateIdx(((Integer) value).intValue());
                    break;
                } else {
                    unsetCateIdx();
                    break;
                }
            case 5:
                if (value != null) {
                    setDesc((String) value);
                    break;
                } else {
                    unsetDesc();
                    break;
                }
            case 6:
                if (value != null) {
                    setImgUrl((String) value);
                    break;
                } else {
                    unsetImgUrl();
                    break;
                }
        }
    }

    public boolean equals(TopicCorrectionReq that) {
        if (that == null || this.bookId != that.bookId || this.topicId != that.topicId || this.mode != that.mode || this.cateIdx != that.cateIdx) {
            return false;
        }
        boolean isSetDesc = isSetDesc();
        boolean isSetDesc2 = that.isSetDesc();
        if ((isSetDesc || isSetDesc2) && !(isSetDesc && isSetDesc2 && this.desc.equals(that.desc))) {
            return false;
        }
        boolean isSetImgUrl = isSetImgUrl();
        boolean isSetImgUrl2 = that.isSetImgUrl();
        if (isSetImgUrl || isSetImgUrl2) {
            return isSetImgUrl && isSetImgUrl2 && this.imgUrl.equals(that.imgUrl);
        }
        return true;
    }

    public TopicCorrectionReq(int bookId, int topicId, int mode, int cateIdx, String desc) {
        this();
        this.bookId = bookId;
        setBookIdIsSet(true);
        this.topicId = topicId;
        setTopicIdIsSet(true);
        this.mode = mode;
        setModeIsSet(true);
        this.cateIdx = cateIdx;
        setCateIdxIsSet(true);
        this.desc = desc;
    }

    public TopicCorrectionReq(TopicCorrectionReq other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMG_URL};
        this.__isset_bitfield = other.__isset_bitfield;
        this.bookId = other.bookId;
        this.topicId = other.topicId;
        this.mode = other.mode;
        this.cateIdx = other.cateIdx;
        if (other.isSetDesc()) {
            this.desc = other.desc;
        }
        if (other.isSetImgUrl()) {
            this.imgUrl = other.imgUrl;
        }
    }
}
