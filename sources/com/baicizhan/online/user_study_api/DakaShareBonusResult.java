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
public class DakaShareBonusResult implements TBase<DakaShareBonusResult, _Fields>, Serializable, Cloneable, Comparable<DakaShareBonusResult> {
    private static final int __COIN_COUNT_ISSET_ID = 0;
    private static final int __STATUS_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String action;
    public String actionUrl;
    public int coin_count;
    public String extraTip;
    public String message;
    private _Fields[] optionals;
    public String shareSuccess;
    public int status;
    private static final TStruct STRUCT_DESC = new TStruct("DakaShareBonusResult");
    private static final TField COIN_COUNT_FIELD_DESC = new TField("coin_count", (byte) 8, 1);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 2);
    private static final TField MESSAGE_FIELD_DESC = new TField("message", (byte) 11, 3);
    private static final TField SHARE_SUCCESS_FIELD_DESC = new TField("shareSuccess", (byte) 11, 4);
    private static final TField EXTRA_TIP_FIELD_DESC = new TField("extraTip", (byte) 11, 5);
    private static final TField ACTION_FIELD_DESC = new TField("action", (byte) 11, 6);
    private static final TField ACTION_URL_FIELD_DESC = new TField("actionUrl", (byte) 11, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.DakaShareBonusResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields = iArr;
            try {
                iArr[_Fields.COIN_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[_Fields.STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[_Fields.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[_Fields.SHARE_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[_Fields.EXTRA_TIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[_Fields.ACTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[_Fields.ACTION_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusResultStandardScheme extends StandardScheme<DakaShareBonusResult> {
        private DakaShareBonusResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DakaShareBonusResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetCoin_count()) {
                        throw new TProtocolException("Required field 'coin_count' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetStatus()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.coin_count = iprot.readI32();
                            struct.setCoin_countIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.status = iprot.readI32();
                            struct.setStatusIsSet(true);
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.shareSuccess = iprot.readString();
                            struct.setShareSuccessIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.extraTip = iprot.readString();
                            struct.setExtraTipIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action = iprot.readString();
                            struct.setActionIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.actionUrl = iprot.readString();
                            struct.setActionUrlIsSet(true);
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
        public void write(TProtocol oprot, DakaShareBonusResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DakaShareBonusResult.STRUCT_DESC);
            oprot.writeFieldBegin(DakaShareBonusResult.COIN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.coin_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DakaShareBonusResult.STATUS_FIELD_DESC);
            oprot.writeI32(struct.status);
            oprot.writeFieldEnd();
            if (struct.message != null) {
                oprot.writeFieldBegin(DakaShareBonusResult.MESSAGE_FIELD_DESC);
                oprot.writeString(struct.message);
                oprot.writeFieldEnd();
            }
            if (struct.shareSuccess != null && struct.isSetShareSuccess()) {
                oprot.writeFieldBegin(DakaShareBonusResult.SHARE_SUCCESS_FIELD_DESC);
                oprot.writeString(struct.shareSuccess);
                oprot.writeFieldEnd();
            }
            if (struct.extraTip != null && struct.isSetExtraTip()) {
                oprot.writeFieldBegin(DakaShareBonusResult.EXTRA_TIP_FIELD_DESC);
                oprot.writeString(struct.extraTip);
                oprot.writeFieldEnd();
            }
            if (struct.action != null && struct.isSetAction()) {
                oprot.writeFieldBegin(DakaShareBonusResult.ACTION_FIELD_DESC);
                oprot.writeString(struct.action);
                oprot.writeFieldEnd();
            }
            if (struct.actionUrl != null && struct.isSetActionUrl()) {
                oprot.writeFieldBegin(DakaShareBonusResult.ACTION_URL_FIELD_DESC);
                oprot.writeString(struct.actionUrl);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusResultStandardSchemeFactory implements SchemeFactory {
        private DakaShareBonusResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaShareBonusResultStandardScheme getScheme() {
            return new DakaShareBonusResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusResultTupleScheme extends TupleScheme<DakaShareBonusResult> {
        private DakaShareBonusResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DakaShareBonusResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.coin_count = tTupleProtocol.readI32();
            struct.setCoin_countIsSet(true);
            struct.status = tTupleProtocol.readI32();
            struct.setStatusIsSet(true);
            struct.message = tTupleProtocol.readString();
            struct.setMessageIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.shareSuccess = tTupleProtocol.readString();
                struct.setShareSuccessIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.extraTip = tTupleProtocol.readString();
                struct.setExtraTipIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.action = tTupleProtocol.readString();
                struct.setActionIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.actionUrl = tTupleProtocol.readString();
                struct.setActionUrlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DakaShareBonusResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.coin_count);
            tTupleProtocol.writeI32(struct.status);
            tTupleProtocol.writeString(struct.message);
            BitSet bitSet = new BitSet();
            if (struct.isSetShareSuccess()) {
                bitSet.set(0);
            }
            if (struct.isSetExtraTip()) {
                bitSet.set(1);
            }
            if (struct.isSetAction()) {
                bitSet.set(2);
            }
            if (struct.isSetActionUrl()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetShareSuccess()) {
                tTupleProtocol.writeString(struct.shareSuccess);
            }
            if (struct.isSetExtraTip()) {
                tTupleProtocol.writeString(struct.extraTip);
            }
            if (struct.isSetAction()) {
                tTupleProtocol.writeString(struct.action);
            }
            if (struct.isSetActionUrl()) {
                tTupleProtocol.writeString(struct.actionUrl);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusResultTupleSchemeFactory implements SchemeFactory {
        private DakaShareBonusResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaShareBonusResultTupleScheme getScheme() {
            return new DakaShareBonusResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        COIN_COUNT(1, "coin_count"),
        STATUS(2, "status"),
        MESSAGE(3, "message"),
        SHARE_SUCCESS(4, "shareSuccess"),
        EXTRA_TIP(5, "extraTip"),
        ACTION(6, "action"),
        ACTION_URL(7, "actionUrl");

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
                    return COIN_COUNT;
                case 2:
                    return STATUS;
                case 3:
                    return MESSAGE;
                case 4:
                    return SHARE_SUCCESS;
                case 5:
                    return EXTRA_TIP;
                case 6:
                    return ACTION;
                case 7:
                    return ACTION_URL;
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
        hashMap.put(StandardScheme.class, new DakaShareBonusResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DakaShareBonusResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.COIN_COUNT, (_Fields) new FieldMetaData("coin_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MESSAGE, (_Fields) new FieldMetaData("message", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_SUCCESS, (_Fields) new FieldMetaData("shareSuccess", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.EXTRA_TIP, (_Fields) new FieldMetaData("extraTip", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION, (_Fields) new FieldMetaData("action", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION_URL, (_Fields) new FieldMetaData("actionUrl", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DakaShareBonusResult.class, unmodifiableMap);
    }

    public DakaShareBonusResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SHARE_SUCCESS, _Fields.EXTRA_TIP, _Fields.ACTION, _Fields.ACTION_URL};
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
        setCoin_countIsSet(false);
        this.coin_count = 0;
        setStatusIsSet(false);
        this.status = 0;
        this.message = null;
        this.shareSuccess = null;
        this.extraTip = null;
        this.action = null;
        this.actionUrl = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DakaShareBonusResult)) {
            return equals((DakaShareBonusResult) that);
        }
        return false;
    }

    public String getAction() {
        return this.action;
    }

    public String getActionUrl() {
        return this.actionUrl;
    }

    public int getCoin_count() {
        return this.coin_count;
    }

    public String getExtraTip() {
        return this.extraTip;
    }

    public String getMessage() {
        return this.message;
    }

    public String getShareSuccess() {
        return this.shareSuccess;
    }

    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction() {
        return this.action != null;
    }

    public boolean isSetActionUrl() {
        return this.actionUrl != null;
    }

    public boolean isSetCoin_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetExtraTip() {
        return this.extraTip != null;
    }

    public boolean isSetMessage() {
        return this.message != null;
    }

    public boolean isSetShareSuccess() {
        return this.shareSuccess != null;
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DakaShareBonusResult setAction(String action) {
        this.action = action;
        return this;
    }

    public void setActionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action = null;
    }

    public DakaShareBonusResult setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
        return this;
    }

    public void setActionUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.actionUrl = null;
    }

    public DakaShareBonusResult setCoin_count(int coin_count) {
        this.coin_count = coin_count;
        setCoin_countIsSet(true);
        return this;
    }

    public void setCoin_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public DakaShareBonusResult setExtraTip(String extraTip) {
        this.extraTip = extraTip;
        return this;
    }

    public void setExtraTipIsSet(boolean value) {
        if (value) {
            return;
        }
        this.extraTip = null;
    }

    public DakaShareBonusResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public void setMessageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.message = null;
    }

    public DakaShareBonusResult setShareSuccess(String shareSuccess) {
        this.shareSuccess = shareSuccess;
        return this;
    }

    public void setShareSuccessIsSet(boolean value) {
        if (value) {
            return;
        }
        this.shareSuccess = null;
    }

    public DakaShareBonusResult setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DakaShareBonusResult(");
        sb2.append("coin_count:");
        sb2.append(this.coin_count);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("status:");
        sb2.append(this.status);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("message:");
        String str = this.message;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetShareSuccess()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("shareSuccess:");
            String str2 = this.shareSuccess;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetExtraTip()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("extraTip:");
            String str3 = this.extraTip;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetAction()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("action:");
            String str4 = this.action;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetActionUrl()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("actionUrl:");
            String str5 = this.actionUrl;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction() {
        this.action = null;
    }

    public void unsetActionUrl() {
        this.actionUrl = null;
    }

    public void unsetCoin_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetExtraTip() {
        this.extraTip = null;
    }

    public void unsetMessage() {
        this.message = null;
    }

    public void unsetShareSuccess() {
        this.shareSuccess = null;
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.message != null) {
            return;
        }
        throw new TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DakaShareBonusResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetCoin_count()).compareTo(Boolean.valueOf(other.isSetCoin_count()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetCoin_count() && (compareTo7 = TBaseHelper.compareTo(this.coin_count, other.coin_count)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetStatus() && (compareTo6 = TBaseHelper.compareTo(this.status, other.status)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetMessage()).compareTo(Boolean.valueOf(other.isSetMessage()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetMessage() && (compareTo5 = TBaseHelper.compareTo(this.message, other.message)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetShareSuccess()).compareTo(Boolean.valueOf(other.isSetShareSuccess()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetShareSuccess() && (compareTo4 = TBaseHelper.compareTo(this.shareSuccess, other.shareSuccess)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetExtraTip()).compareTo(Boolean.valueOf(other.isSetExtraTip()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetExtraTip() && (compareTo3 = TBaseHelper.compareTo(this.extraTip, other.extraTip)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetAction()).compareTo(Boolean.valueOf(other.isSetAction()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAction() && (compareTo2 = TBaseHelper.compareTo(this.action, other.action)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetActionUrl()).compareTo(Boolean.valueOf(other.isSetActionUrl()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetActionUrl() || (compareTo = TBaseHelper.compareTo(this.actionUrl, other.actionUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DakaShareBonusResult, _Fields> deepCopy2() {
        return new DakaShareBonusResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getCoin_count());
            case 2:
                return Integer.valueOf(getStatus());
            case 3:
                return getMessage();
            case 4:
                return getShareSuccess();
            case 5:
                return getExtraTip();
            case 6:
                return getAction();
            case 7:
                return getActionUrl();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[field.ordinal()]) {
            case 1:
                return isSetCoin_count();
            case 2:
                return isSetStatus();
            case 3:
                return isSetMessage();
            case 4:
                return isSetShareSuccess();
            case 5:
                return isSetExtraTip();
            case 6:
                return isSetAction();
            case 7:
                return isSetActionUrl();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusResult$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setCoin_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetCoin_count();
                    break;
                }
            case 2:
                if (value != null) {
                    setStatus(((Integer) value).intValue());
                    break;
                } else {
                    unsetStatus();
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
                    setShareSuccess((String) value);
                    break;
                } else {
                    unsetShareSuccess();
                    break;
                }
            case 5:
                if (value != null) {
                    setExtraTip((String) value);
                    break;
                } else {
                    unsetExtraTip();
                    break;
                }
            case 6:
                if (value != null) {
                    setAction((String) value);
                    break;
                } else {
                    unsetAction();
                    break;
                }
            case 7:
                if (value != null) {
                    setActionUrl((String) value);
                    break;
                } else {
                    unsetActionUrl();
                    break;
                }
        }
    }

    public boolean equals(DakaShareBonusResult that) {
        if (that == null || this.coin_count != that.coin_count || this.status != that.status) {
            return false;
        }
        boolean isSetMessage = isSetMessage();
        boolean isSetMessage2 = that.isSetMessage();
        if ((isSetMessage || isSetMessage2) && !(isSetMessage && isSetMessage2 && this.message.equals(that.message))) {
            return false;
        }
        boolean isSetShareSuccess = isSetShareSuccess();
        boolean isSetShareSuccess2 = that.isSetShareSuccess();
        if ((isSetShareSuccess || isSetShareSuccess2) && !(isSetShareSuccess && isSetShareSuccess2 && this.shareSuccess.equals(that.shareSuccess))) {
            return false;
        }
        boolean isSetExtraTip = isSetExtraTip();
        boolean isSetExtraTip2 = that.isSetExtraTip();
        if ((isSetExtraTip || isSetExtraTip2) && !(isSetExtraTip && isSetExtraTip2 && this.extraTip.equals(that.extraTip))) {
            return false;
        }
        boolean isSetAction = isSetAction();
        boolean isSetAction2 = that.isSetAction();
        if ((isSetAction || isSetAction2) && !(isSetAction && isSetAction2 && this.action.equals(that.action))) {
            return false;
        }
        boolean isSetActionUrl = isSetActionUrl();
        boolean isSetActionUrl2 = that.isSetActionUrl();
        if (isSetActionUrl || isSetActionUrl2) {
            return isSetActionUrl && isSetActionUrl2 && this.actionUrl.equals(that.actionUrl);
        }
        return true;
    }

    public DakaShareBonusResult(int coin_count, int status, String message) {
        this();
        this.coin_count = coin_count;
        setCoin_countIsSet(true);
        this.status = status;
        setStatusIsSet(true);
        this.message = message;
    }

    public DakaShareBonusResult(DakaShareBonusResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SHARE_SUCCESS, _Fields.EXTRA_TIP, _Fields.ACTION, _Fields.ACTION_URL};
        this.__isset_bitfield = other.__isset_bitfield;
        this.coin_count = other.coin_count;
        this.status = other.status;
        if (other.isSetMessage()) {
            this.message = other.message;
        }
        if (other.isSetShareSuccess()) {
            this.shareSuccess = other.shareSuccess;
        }
        if (other.isSetExtraTip()) {
            this.extraTip = other.extraTip;
        }
        if (other.isSetAction()) {
            this.action = other.action;
        }
        if (other.isSetActionUrl()) {
            this.actionUrl = other.actionUrl;
        }
    }
}
