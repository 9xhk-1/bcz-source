package com.baicizhan.online.user_study_api;

import com.baicizhan.client.business.dataset.provider.a;
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
public class UserBookBasicInfo implements TBase<UserBookBasicInfo, _Fields>, Serializable, Cloneable, Comparable<UserBookBasicInfo> {
    private static final int __BOOK_FLAG_ISSET_ID = 4;
    private static final int __GROUP_COUNT_ISSET_ID = 3;
    private static final int __ID_ISSET_ID = 0;
    private static final int __IS_WORD_COURSE_ISSET_ID = 2;
    private static final int __TOTAL_WORDS_COUNT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_flag;
    public String desc;
    public int group_count;

    /* renamed from: id, reason: collision with root package name */
    public int f28167id;
    public String img;
    public boolean is_word_course;
    public String name;
    private _Fields[] optionals;
    public int total_words_count;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookBasicInfo");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField TOTAL_WORDS_COUNT_FIELD_DESC = new TField("total_words_count", (byte) 8, 3);
    private static final TField IS_WORD_COURSE_FIELD_DESC = new TField("is_word_course", (byte) 2, 4);
    private static final TField GROUP_COUNT_FIELD_DESC = new TField("group_count", (byte) 8, 5);
    private static final TField BOOK_FLAG_FIELD_DESC = new TField(a.z.C0267a.f16364o, (byte) 8, 6);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 7);
    private static final TField DESC_FIELD_DESC = new TField(SocialConstants.PARAM_APP_DESC, (byte) 11, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserBookBasicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[_Fields.TOTAL_WORDS_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[_Fields.IS_WORD_COURSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[_Fields.GROUP_COUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[_Fields.BOOK_FLAG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[_Fields.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[_Fields.DESC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookBasicInfoStandardScheme extends StandardScheme<UserBookBasicInfo> {
        private UserBookBasicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookBasicInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetId()) {
                        throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetTotal_words_count()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'total_words_count' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28167id = iprot.readI32();
                            struct.setIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_words_count = iprot.readI32();
                            struct.setTotal_words_countIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_word_course = iprot.readBool();
                            struct.setIs_word_courseIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.group_count = iprot.readI32();
                            struct.setGroup_countIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_flag = iprot.readI32();
                            struct.setBook_flagIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img = iprot.readString();
                            struct.setImgIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.desc = iprot.readString();
                            struct.setDescIsSet(true);
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
        public void write(TProtocol oprot, UserBookBasicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookBasicInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserBookBasicInfo.ID_FIELD_DESC);
            oprot.writeI32(struct.f28167id);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(UserBookBasicInfo.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserBookBasicInfo.TOTAL_WORDS_COUNT_FIELD_DESC);
            oprot.writeI32(struct.total_words_count);
            oprot.writeFieldEnd();
            if (struct.isSetIs_word_course()) {
                oprot.writeFieldBegin(UserBookBasicInfo.IS_WORD_COURSE_FIELD_DESC);
                oprot.writeBool(struct.is_word_course);
                oprot.writeFieldEnd();
            }
            if (struct.isSetGroup_count()) {
                oprot.writeFieldBegin(UserBookBasicInfo.GROUP_COUNT_FIELD_DESC);
                oprot.writeI32(struct.group_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBook_flag()) {
                oprot.writeFieldBegin(UserBookBasicInfo.BOOK_FLAG_FIELD_DESC);
                oprot.writeI32(struct.book_flag);
                oprot.writeFieldEnd();
            }
            if (struct.img != null && struct.isSetImg()) {
                oprot.writeFieldBegin(UserBookBasicInfo.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            if (struct.desc != null && struct.isSetDesc()) {
                oprot.writeFieldBegin(UserBookBasicInfo.DESC_FIELD_DESC);
                oprot.writeString(struct.desc);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookBasicInfoStandardSchemeFactory implements SchemeFactory {
        private UserBookBasicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookBasicInfoStandardScheme getScheme() {
            return new UserBookBasicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookBasicInfoTupleScheme extends TupleScheme<UserBookBasicInfo> {
        private UserBookBasicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28167id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.total_words_count = tTupleProtocol.readI32();
            struct.setTotal_words_countIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                struct.is_word_course = tTupleProtocol.readBool();
                struct.setIs_word_courseIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.group_count = tTupleProtocol.readI32();
                struct.setGroup_countIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.book_flag = tTupleProtocol.readI32();
                struct.setBook_flagIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.img = tTupleProtocol.readString();
                struct.setImgIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.desc = tTupleProtocol.readString();
                struct.setDescIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28167id);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeI32(struct.total_words_count);
            BitSet bitSet = new BitSet();
            if (struct.isSetIs_word_course()) {
                bitSet.set(0);
            }
            if (struct.isSetGroup_count()) {
                bitSet.set(1);
            }
            if (struct.isSetBook_flag()) {
                bitSet.set(2);
            }
            if (struct.isSetImg()) {
                bitSet.set(3);
            }
            if (struct.isSetDesc()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetIs_word_course()) {
                tTupleProtocol.writeBool(struct.is_word_course);
            }
            if (struct.isSetGroup_count()) {
                tTupleProtocol.writeI32(struct.group_count);
            }
            if (struct.isSetBook_flag()) {
                tTupleProtocol.writeI32(struct.book_flag);
            }
            if (struct.isSetImg()) {
                tTupleProtocol.writeString(struct.img);
            }
            if (struct.isSetDesc()) {
                tTupleProtocol.writeString(struct.desc);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookBasicInfoTupleSchemeFactory implements SchemeFactory {
        private UserBookBasicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookBasicInfoTupleScheme getScheme() {
            return new UserBookBasicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        NAME(2, "name"),
        TOTAL_WORDS_COUNT(3, "total_words_count"),
        IS_WORD_COURSE(4, "is_word_course"),
        GROUP_COUNT(5, "group_count"),
        BOOK_FLAG(6, a.z.C0267a.f16364o),
        IMG(7, SocialConstants.PARAM_IMG_URL),
        DESC(8, SocialConstants.PARAM_APP_DESC);

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
                    return ID;
                case 2:
                    return NAME;
                case 3:
                    return TOTAL_WORDS_COUNT;
                case 4:
                    return IS_WORD_COURSE;
                case 5:
                    return GROUP_COUNT;
                case 6:
                    return BOOK_FLAG;
                case 7:
                    return IMG;
                case 8:
                    return DESC;
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
        hashMap.put(StandardScheme.class, new UserBookBasicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookBasicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOTAL_WORDS_COUNT, (_Fields) new FieldMetaData("total_words_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_WORD_COURSE, (_Fields) new FieldMetaData("is_word_course", (byte) 2, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.GROUP_COUNT, (_Fields) new FieldMetaData("group_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_FLAG, (_Fields) new FieldMetaData(a.z.C0267a.f16364o, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DESC, (_Fields) new FieldMetaData(SocialConstants.PARAM_APP_DESC, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookBasicInfo.class, unmodifiableMap);
    }

    public UserBookBasicInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IS_WORD_COURSE, _Fields.GROUP_COUNT, _Fields.BOOK_FLAG, _Fields.IMG, _Fields.DESC};
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
        setIdIsSet(false);
        this.f28167id = 0;
        this.name = null;
        setTotal_words_countIsSet(false);
        this.total_words_count = 0;
        setIs_word_courseIsSet(false);
        this.is_word_course = false;
        setGroup_countIsSet(false);
        this.group_count = 0;
        setBook_flagIsSet(false);
        this.book_flag = 0;
        this.img = null;
        this.desc = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookBasicInfo)) {
            return equals((UserBookBasicInfo) that);
        }
        return false;
    }

    public int getBook_flag() {
        return this.book_flag;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getGroup_count() {
        return this.group_count;
    }

    public int getId() {
        return this.f28167id;
    }

    public String getImg() {
        return this.img;
    }

    public String getName() {
        return this.name;
    }

    public int getTotal_words_count() {
        return this.total_words_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_word_course() {
        return this.is_word_course;
    }

    public boolean isSetBook_flag() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetDesc() {
        return this.desc != null;
    }

    public boolean isSetGroup_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetImg() {
        return this.img != null;
    }

    public boolean isSetIs_word_course() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetTotal_words_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookBasicInfo setBook_flag(int book_flag) {
        this.book_flag = book_flag;
        setBook_flagIsSet(true);
        return this;
    }

    public void setBook_flagIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserBookBasicInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public void setDescIsSet(boolean value) {
        if (value) {
            return;
        }
        this.desc = null;
    }

    public UserBookBasicInfo setGroup_count(int group_count) {
        this.group_count = group_count;
        setGroup_countIsSet(true);
        return this;
    }

    public void setGroup_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserBookBasicInfo setId(int id2) {
        this.f28167id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserBookBasicInfo setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public UserBookBasicInfo setIs_word_course(boolean is_word_course) {
        this.is_word_course = is_word_course;
        setIs_word_courseIsSet(true);
        return this;
    }

    public void setIs_word_courseIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserBookBasicInfo setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public UserBookBasicInfo setTotal_words_count(int total_words_count) {
        this.total_words_count = total_words_count;
        setTotal_words_countIsSet(true);
        return this;
    }

    public void setTotal_words_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookBasicInfo(");
        sb2.append("id:");
        sb2.append(this.f28167id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("total_words_count:");
        sb2.append(this.total_words_count);
        if (isSetIs_word_course()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("is_word_course:");
            sb2.append(this.is_word_course);
        }
        if (isSetGroup_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("group_count:");
            sb2.append(this.group_count);
        }
        if (isSetBook_flag()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("book_flag:");
            sb2.append(this.book_flag);
        }
        if (isSetImg()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("img:");
            String str2 = this.img;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetDesc()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("desc:");
            String str3 = this.desc;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_flag() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetDesc() {
        this.desc = null;
    }

    public void unsetGroup_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetIs_word_course() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetTotal_words_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
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
    public int compareTo(UserBookBasicInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetId() && (compareTo8 = TBaseHelper.compareTo(this.f28167id, other.f28167id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetName() && (compareTo7 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetTotal_words_count()).compareTo(Boolean.valueOf(other.isSetTotal_words_count()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTotal_words_count() && (compareTo6 = TBaseHelper.compareTo(this.total_words_count, other.total_words_count)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetIs_word_course()).compareTo(Boolean.valueOf(other.isSetIs_word_course()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetIs_word_course() && (compareTo5 = TBaseHelper.compareTo(this.is_word_course, other.is_word_course)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetGroup_count()).compareTo(Boolean.valueOf(other.isSetGroup_count()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetGroup_count() && (compareTo4 = TBaseHelper.compareTo(this.group_count, other.group_count)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetBook_flag()).compareTo(Boolean.valueOf(other.isSetBook_flag()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetBook_flag() && (compareTo3 = TBaseHelper.compareTo(this.book_flag, other.book_flag)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetImg() && (compareTo2 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetDesc()).compareTo(Boolean.valueOf(other.isSetDesc()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetDesc() || (compareTo = TBaseHelper.compareTo(this.desc, other.desc)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookBasicInfo, _Fields> deepCopy2() {
        return new UserBookBasicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getId());
            case 2:
                return getName();
            case 3:
                return Integer.valueOf(getTotal_words_count());
            case 4:
                return Boolean.valueOf(isIs_word_course());
            case 5:
                return Integer.valueOf(getGroup_count());
            case 6:
                return Integer.valueOf(getBook_flag());
            case 7:
                return getImg();
            case 8:
                return getDesc();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetName();
            case 3:
                return isSetTotal_words_count();
            case 4:
                return isSetIs_word_course();
            case 5:
                return isSetGroup_count();
            case 6:
                return isSetBook_flag();
            case 7:
                return isSetImg();
            case 8:
                return isSetDesc();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookBasicInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setId(((Integer) value).intValue());
                    break;
                } else {
                    unsetId();
                    break;
                }
            case 2:
                if (value != null) {
                    setName((String) value);
                    break;
                } else {
                    unsetName();
                    break;
                }
            case 3:
                if (value != null) {
                    setTotal_words_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_words_count();
                    break;
                }
            case 4:
                if (value != null) {
                    setIs_word_course(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIs_word_course();
                    break;
                }
            case 5:
                if (value != null) {
                    setGroup_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetGroup_count();
                    break;
                }
            case 6:
                if (value != null) {
                    setBook_flag(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_flag();
                    break;
                }
            case 7:
                if (value != null) {
                    setImg((String) value);
                    break;
                } else {
                    unsetImg();
                    break;
                }
            case 8:
                if (value != null) {
                    setDesc((String) value);
                    break;
                } else {
                    unsetDesc();
                    break;
                }
        }
    }

    public boolean equals(UserBookBasicInfo that) {
        if (that == null || this.f28167id != that.f28167id) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if (((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) || this.total_words_count != that.total_words_count) {
            return false;
        }
        boolean isSetIs_word_course = isSetIs_word_course();
        boolean isSetIs_word_course2 = that.isSetIs_word_course();
        if ((isSetIs_word_course || isSetIs_word_course2) && !(isSetIs_word_course && isSetIs_word_course2 && this.is_word_course == that.is_word_course)) {
            return false;
        }
        boolean isSetGroup_count = isSetGroup_count();
        boolean isSetGroup_count2 = that.isSetGroup_count();
        if ((isSetGroup_count || isSetGroup_count2) && !(isSetGroup_count && isSetGroup_count2 && this.group_count == that.group_count)) {
            return false;
        }
        boolean isSetBook_flag = isSetBook_flag();
        boolean isSetBook_flag2 = that.isSetBook_flag();
        if ((isSetBook_flag || isSetBook_flag2) && !(isSetBook_flag && isSetBook_flag2 && this.book_flag == that.book_flag)) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if ((isSetImg || isSetImg2) && !(isSetImg && isSetImg2 && this.img.equals(that.img))) {
            return false;
        }
        boolean isSetDesc = isSetDesc();
        boolean isSetDesc2 = that.isSetDesc();
        if (isSetDesc || isSetDesc2) {
            return isSetDesc && isSetDesc2 && this.desc.equals(that.desc);
        }
        return true;
    }

    public UserBookBasicInfo(int id2, String name, int total_words_count) {
        this();
        this.f28167id = id2;
        setIdIsSet(true);
        this.name = name;
        this.total_words_count = total_words_count;
        setTotal_words_countIsSet(true);
    }

    public UserBookBasicInfo(UserBookBasicInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IS_WORD_COURSE, _Fields.GROUP_COUNT, _Fields.BOOK_FLAG, _Fields.IMG, _Fields.DESC};
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28167id = other.f28167id;
        if (other.isSetName()) {
            this.name = other.name;
        }
        this.total_words_count = other.total_words_count;
        this.is_word_course = other.is_word_course;
        this.group_count = other.group_count;
        this.book_flag = other.book_flag;
        if (other.isSetImg()) {
            this.img = other.img;
        }
        if (other.isSetDesc()) {
            this.desc = other.desc;
        }
    }
}
