package com.baicizhan.online.bs_users;

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
import org.apache.thrift.meta_data.StructMetaData;
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
public class BBQRCodeResp implements TBase<BBQRCodeResp, _Fields>, Serializable, Cloneable, Comparable<BBQRCodeResp> {
    private static final int __ERROR_CODE_ISSET_ID = 0;
    private static final int __PAPER_BOOK_ID_ISSET_ID = 2;
    private static final int __WORD_LEVEL_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String action;
    public int error_code;
    public String message;
    private _Fields[] optionals;
    public int paper_book_id;
    public BBRedirectInfo redirect_info;
    public int word_level_id;
    private static final TStruct STRUCT_DESC = new TStruct("BBQRCodeResp");
    private static final TField ERROR_CODE_FIELD_DESC = new TField(ma.b.f72948u, (byte) 8, 1);
    private static final TField ACTION_FIELD_DESC = new TField("action", (byte) 11, 2);
    private static final TField MESSAGE_FIELD_DESC = new TField("message", (byte) 11, 3);
    private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 4);
    private static final TField REDIRECT_INFO_FIELD_DESC = new TField("redirect_info", (byte) 12, 5);
    private static final TField PAPER_BOOK_ID_FIELD_DESC = new TField("paper_book_id", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_users.BBQRCodeResp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields = iArr;
            try {
                iArr[_Fields.ERROR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[_Fields.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[_Fields.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[_Fields.WORD_LEVEL_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[_Fields.REDIRECT_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[_Fields.PAPER_BOOK_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBQRCodeRespStandardScheme extends StandardScheme<BBQRCodeResp> {
        private BBQRCodeRespStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBQRCodeResp struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetError_code()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'error_code' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.error_code = iprot.readI32();
                            struct.setError_codeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action = iprot.readString();
                            struct.setActionIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.message = iprot.readString();
                            struct.setMessageIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_level_id = iprot.readI32();
                            struct.setWord_level_idIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            BBRedirectInfo bBRedirectInfo = new BBRedirectInfo();
                            struct.redirect_info = bBRedirectInfo;
                            bBRedirectInfo.read(iprot);
                            struct.setRedirect_infoIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.paper_book_id = iprot.readI32();
                            struct.setPaper_book_idIsSet(true);
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
        public void write(TProtocol oprot, BBQRCodeResp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBQRCodeResp.STRUCT_DESC);
            oprot.writeFieldBegin(BBQRCodeResp.ERROR_CODE_FIELD_DESC);
            oprot.writeI32(struct.error_code);
            oprot.writeFieldEnd();
            if (struct.action != null) {
                oprot.writeFieldBegin(BBQRCodeResp.ACTION_FIELD_DESC);
                oprot.writeString(struct.action);
                oprot.writeFieldEnd();
            }
            if (struct.message != null && struct.isSetMessage()) {
                oprot.writeFieldBegin(BBQRCodeResp.MESSAGE_FIELD_DESC);
                oprot.writeString(struct.message);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWord_level_id()) {
                oprot.writeFieldBegin(BBQRCodeResp.WORD_LEVEL_ID_FIELD_DESC);
                oprot.writeI32(struct.word_level_id);
                oprot.writeFieldEnd();
            }
            if (struct.redirect_info != null && struct.isSetRedirect_info()) {
                oprot.writeFieldBegin(BBQRCodeResp.REDIRECT_INFO_FIELD_DESC);
                struct.redirect_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPaper_book_id()) {
                oprot.writeFieldBegin(BBQRCodeResp.PAPER_BOOK_ID_FIELD_DESC);
                oprot.writeI32(struct.paper_book_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBQRCodeRespStandardSchemeFactory implements SchemeFactory {
        private BBQRCodeRespStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBQRCodeRespStandardScheme getScheme() {
            return new BBQRCodeRespStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBQRCodeRespTupleScheme extends TupleScheme<BBQRCodeResp> {
        private BBQRCodeRespTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBQRCodeResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.error_code = tTupleProtocol.readI32();
            struct.setError_codeIsSet(true);
            struct.action = tTupleProtocol.readString();
            struct.setActionIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.message = tTupleProtocol.readString();
                struct.setMessageIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.word_level_id = tTupleProtocol.readI32();
                struct.setWord_level_idIsSet(true);
            }
            if (readBitSet.get(2)) {
                BBRedirectInfo bBRedirectInfo = new BBRedirectInfo();
                struct.redirect_info = bBRedirectInfo;
                bBRedirectInfo.read(tTupleProtocol);
                struct.setRedirect_infoIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.paper_book_id = tTupleProtocol.readI32();
                struct.setPaper_book_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBQRCodeResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.error_code);
            tTupleProtocol.writeString(struct.action);
            BitSet bitSet = new BitSet();
            if (struct.isSetMessage()) {
                bitSet.set(0);
            }
            if (struct.isSetWord_level_id()) {
                bitSet.set(1);
            }
            if (struct.isSetRedirect_info()) {
                bitSet.set(2);
            }
            if (struct.isSetPaper_book_id()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetMessage()) {
                tTupleProtocol.writeString(struct.message);
            }
            if (struct.isSetWord_level_id()) {
                tTupleProtocol.writeI32(struct.word_level_id);
            }
            if (struct.isSetRedirect_info()) {
                struct.redirect_info.write(tTupleProtocol);
            }
            if (struct.isSetPaper_book_id()) {
                tTupleProtocol.writeI32(struct.paper_book_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBQRCodeRespTupleSchemeFactory implements SchemeFactory {
        private BBQRCodeRespTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBQRCodeRespTupleScheme getScheme() {
            return new BBQRCodeRespTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ERROR_CODE(1, ma.b.f72948u),
        ACTION(2, "action"),
        MESSAGE(3, "message"),
        WORD_LEVEL_ID(4, ma.b.f72894c),
        REDIRECT_INFO(5, "redirect_info"),
        PAPER_BOOK_ID(6, "paper_book_id");

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
                    return ERROR_CODE;
                case 2:
                    return ACTION;
                case 3:
                    return MESSAGE;
                case 4:
                    return WORD_LEVEL_ID;
                case 5:
                    return REDIRECT_INFO;
                case 6:
                    return PAPER_BOOK_ID;
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
        hashMap.put(StandardScheme.class, new BBQRCodeRespStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBQRCodeRespTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ERROR_CODE, (_Fields) new FieldMetaData(ma.b.f72948u, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ACTION, (_Fields) new FieldMetaData("action", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MESSAGE, (_Fields) new FieldMetaData("message", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REDIRECT_INFO, (_Fields) new FieldMetaData("redirect_info", (byte) 2, new StructMetaData((byte) 12, BBRedirectInfo.class)));
        enumMap.put((EnumMap) _Fields.PAPER_BOOK_ID, (_Fields) new FieldMetaData("paper_book_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBQRCodeResp.class, unmodifiableMap);
    }

    public BBQRCodeResp() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MESSAGE, _Fields.WORD_LEVEL_ID, _Fields.REDIRECT_INFO, _Fields.PAPER_BOOK_ID};
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
        setError_codeIsSet(false);
        this.error_code = 0;
        this.action = null;
        this.message = null;
        setWord_level_idIsSet(false);
        this.word_level_id = 0;
        this.redirect_info = null;
        setPaper_book_idIsSet(false);
        this.paper_book_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBQRCodeResp)) {
            return equals((BBQRCodeResp) that);
        }
        return false;
    }

    public String getAction() {
        return this.action;
    }

    public int getError_code() {
        return this.error_code;
    }

    public String getMessage() {
        return this.message;
    }

    public int getPaper_book_id() {
        return this.paper_book_id;
    }

    public BBRedirectInfo getRedirect_info() {
        return this.redirect_info;
    }

    public int getWord_level_id() {
        return this.word_level_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction() {
        return this.action != null;
    }

    public boolean isSetError_code() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMessage() {
        return this.message != null;
    }

    public boolean isSetPaper_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetRedirect_info() {
        return this.redirect_info != null;
    }

    public boolean isSetWord_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBQRCodeResp setAction(String action) {
        this.action = action;
        return this;
    }

    public void setActionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action = null;
    }

    public BBQRCodeResp setError_code(int error_code) {
        this.error_code = error_code;
        setError_codeIsSet(true);
        return this;
    }

    public void setError_codeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBQRCodeResp setMessage(String message) {
        this.message = message;
        return this;
    }

    public void setMessageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.message = null;
    }

    public BBQRCodeResp setPaper_book_id(int paper_book_id) {
        this.paper_book_id = paper_book_id;
        setPaper_book_idIsSet(true);
        return this;
    }

    public void setPaper_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBQRCodeResp setRedirect_info(BBRedirectInfo redirect_info) {
        this.redirect_info = redirect_info;
        return this;
    }

    public void setRedirect_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.redirect_info = null;
    }

    public BBQRCodeResp setWord_level_id(int word_level_id) {
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        return this;
    }

    public void setWord_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBQRCodeResp(");
        sb2.append("error_code:");
        sb2.append(this.error_code);
        sb2.append(j2.O);
        sb2.append("action:");
        String str = this.action;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetMessage()) {
            sb2.append(j2.O);
            sb2.append("message:");
            String str2 = this.message;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetWord_level_id()) {
            sb2.append(j2.O);
            sb2.append("word_level_id:");
            sb2.append(this.word_level_id);
        }
        if (isSetRedirect_info()) {
            sb2.append(j2.O);
            sb2.append("redirect_info:");
            BBRedirectInfo bBRedirectInfo = this.redirect_info;
            if (bBRedirectInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBRedirectInfo);
            }
        }
        if (isSetPaper_book_id()) {
            sb2.append(j2.O);
            sb2.append("paper_book_id:");
            sb2.append(this.paper_book_id);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetAction() {
        this.action = null;
    }

    public void unsetError_code() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMessage() {
        this.message = null;
    }

    public void unsetPaper_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetRedirect_info() {
        this.redirect_info = null;
    }

    public void unsetWord_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.action == null) {
            throw new TProtocolException("Required field 'action' was not present! Struct: " + toString());
        }
        BBRedirectInfo bBRedirectInfo = this.redirect_info;
        if (bBRedirectInfo != null) {
            bBRedirectInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBQRCodeResp other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetError_code()).compareTo(Boolean.valueOf(other.isSetError_code()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetError_code() && (compareTo6 = TBaseHelper.compareTo(this.error_code, other.error_code)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetAction()).compareTo(Boolean.valueOf(other.isSetAction()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetAction() && (compareTo5 = TBaseHelper.compareTo(this.action, other.action)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetMessage()).compareTo(Boolean.valueOf(other.isSetMessage()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMessage() && (compareTo4 = TBaseHelper.compareTo(this.message, other.message)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWord_level_id() && (compareTo3 = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetRedirect_info()).compareTo(Boolean.valueOf(other.isSetRedirect_info()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetRedirect_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.redirect_info, (Comparable) other.redirect_info)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetPaper_book_id()).compareTo(Boolean.valueOf(other.isSetPaper_book_id()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetPaper_book_id() || (compareTo = TBaseHelper.compareTo(this.paper_book_id, other.paper_book_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBQRCodeResp, _Fields> deepCopy2() {
        return new BBQRCodeResp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getError_code());
            case 2:
                return getAction();
            case 3:
                return getMessage();
            case 4:
                return Integer.valueOf(getWord_level_id());
            case 5:
                return getRedirect_info();
            case 6:
                return Integer.valueOf(getPaper_book_id());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[field.ordinal()]) {
            case 1:
                return isSetError_code();
            case 2:
                return isSetAction();
            case 3:
                return isSetMessage();
            case 4:
                return isSetWord_level_id();
            case 5:
                return isSetRedirect_info();
            case 6:
                return isSetPaper_book_id();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBQRCodeResp$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setError_code(((Integer) value).intValue());
                    break;
                } else {
                    unsetError_code();
                    break;
                }
            case 2:
                if (value != null) {
                    setAction((String) value);
                    break;
                } else {
                    unsetAction();
                    break;
                }
            case 3:
                if (value != null) {
                    setMessage((String) value);
                    break;
                } else {
                    unsetMessage();
                    break;
                }
            case 4:
                if (value != null) {
                    setWord_level_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetWord_level_id();
                    break;
                }
            case 5:
                if (value != null) {
                    setRedirect_info((BBRedirectInfo) value);
                    break;
                } else {
                    unsetRedirect_info();
                    break;
                }
            case 6:
                if (value != null) {
                    setPaper_book_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetPaper_book_id();
                    break;
                }
        }
    }

    public boolean equals(BBQRCodeResp that) {
        if (that == null || this.error_code != that.error_code) {
            return false;
        }
        boolean isSetAction = isSetAction();
        boolean isSetAction2 = that.isSetAction();
        if ((isSetAction || isSetAction2) && !(isSetAction && isSetAction2 && this.action.equals(that.action))) {
            return false;
        }
        boolean isSetMessage = isSetMessage();
        boolean isSetMessage2 = that.isSetMessage();
        if ((isSetMessage || isSetMessage2) && !(isSetMessage && isSetMessage2 && this.message.equals(that.message))) {
            return false;
        }
        boolean isSetWord_level_id = isSetWord_level_id();
        boolean isSetWord_level_id2 = that.isSetWord_level_id();
        if ((isSetWord_level_id || isSetWord_level_id2) && !(isSetWord_level_id && isSetWord_level_id2 && this.word_level_id == that.word_level_id)) {
            return false;
        }
        boolean isSetRedirect_info = isSetRedirect_info();
        boolean isSetRedirect_info2 = that.isSetRedirect_info();
        if ((isSetRedirect_info || isSetRedirect_info2) && !(isSetRedirect_info && isSetRedirect_info2 && this.redirect_info.equals(that.redirect_info))) {
            return false;
        }
        boolean isSetPaper_book_id = isSetPaper_book_id();
        boolean isSetPaper_book_id2 = that.isSetPaper_book_id();
        if (isSetPaper_book_id || isSetPaper_book_id2) {
            return isSetPaper_book_id && isSetPaper_book_id2 && this.paper_book_id == that.paper_book_id;
        }
        return true;
    }

    public BBQRCodeResp(int error_code, String action) {
        this();
        this.error_code = error_code;
        setError_codeIsSet(true);
        this.action = action;
    }

    public BBQRCodeResp(BBQRCodeResp other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MESSAGE, _Fields.WORD_LEVEL_ID, _Fields.REDIRECT_INFO, _Fields.PAPER_BOOK_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.error_code = other.error_code;
        if (other.isSetAction()) {
            this.action = other.action;
        }
        if (other.isSetMessage()) {
            this.message = other.message;
        }
        this.word_level_id = other.word_level_id;
        if (other.isSetRedirect_info()) {
            this.redirect_info = new BBRedirectInfo(other.redirect_info);
        }
        this.paper_book_id = other.paper_book_id;
    }
}
