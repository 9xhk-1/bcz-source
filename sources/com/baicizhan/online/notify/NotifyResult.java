package com.baicizhan.online.notify;

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
import q9.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class NotifyResult implements TBase<NotifyResult, _Fields>, Serializable, Cloneable, Comparable<NotifyResult> {
    private static final int __COUNT_ISSET_ID = 2;
    private static final int __LATEST_NOTIFY_TIME_SEC_ISSET_ID = 3;
    private static final int __POPUP_ISSET_ID = 0;
    private static final int __REDDOT_ISSET_ID = 1;
    private static final int __UNREAD_COUNT_ISSET_ID = 4;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public Feedback advFeedback;
    public Notify advNotify;
    public int count;
    public Notify emergency;
    public int latest_notify_time_sec;
    public Notify notify;
    private _Fields[] optionals;
    public int popup;
    public int reddot;
    public String service_url;
    public int unread_count;
    private static final TStruct STRUCT_DESC = new TStruct("NotifyResult");
    private static final TField POPUP_FIELD_DESC = new TField("popup", (byte) 8, 1);
    private static final TField REDDOT_FIELD_DESC = new TField("reddot", (byte) 8, 2);
    private static final TField SERVICE_URL_FIELD_DESC = new TField("service_url", (byte) 11, 3);
    private static final TField COUNT_FIELD_DESC = new TField("count", (byte) 8, 4);
    private static final TField EMERGENCY_FIELD_DESC = new TField("emergency", (byte) 12, 5);
    private static final TField NOTIFY_FIELD_DESC = new TField(h.f81943g, (byte) 12, 6);
    private static final TField ADV_NOTIFY_FIELD_DESC = new TField("advNotify", (byte) 12, 7);
    private static final TField ADV_FEEDBACK_FIELD_DESC = new TField("advFeedback", (byte) 12, 8);
    private static final TField LATEST_NOTIFY_TIME_SEC_FIELD_DESC = new TField("latest_notify_time_sec", (byte) 8, 9);
    private static final TField UNREAD_COUNT_FIELD_DESC = new TField("unread_count", (byte) 8, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.notify.NotifyResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields = iArr;
            try {
                iArr[_Fields.POPUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.REDDOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.SERVICE_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.EMERGENCY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.NOTIFY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.ADV_NOTIFY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.ADV_FEEDBACK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.LATEST_NOTIFY_TIME_SEC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[_Fields.UNREAD_COUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyResultStandardScheme extends StandardScheme<NotifyResult> {
        private NotifyResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, NotifyResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetPopup()) {
                        throw new TProtocolException("Required field 'popup' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetReddot()) {
                        throw new TProtocolException("Required field 'reddot' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCount()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.popup = iprot.readI32();
                            struct.setPopupIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.reddot = iprot.readI32();
                            struct.setReddotIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.service_url = iprot.readString();
                            struct.setService_urlIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.count = iprot.readI32();
                            struct.setCountIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            Notify notify = new Notify();
                            struct.emergency = notify;
                            notify.read(iprot);
                            struct.setEmergencyIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            Notify notify2 = new Notify();
                            struct.notify = notify2;
                            notify2.read(iprot);
                            struct.setNotifyIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            Notify notify3 = new Notify();
                            struct.advNotify = notify3;
                            notify3.read(iprot);
                            struct.setAdvNotifyIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            Feedback feedback = new Feedback();
                            struct.advFeedback = feedback;
                            feedback.read(iprot);
                            struct.setAdvFeedbackIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.latest_notify_time_sec = iprot.readI32();
                            struct.setLatest_notify_time_secIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.unread_count = iprot.readI32();
                            struct.setUnread_countIsSet(true);
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
        public void write(TProtocol oprot, NotifyResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(NotifyResult.STRUCT_DESC);
            oprot.writeFieldBegin(NotifyResult.POPUP_FIELD_DESC);
            oprot.writeI32(struct.popup);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(NotifyResult.REDDOT_FIELD_DESC);
            oprot.writeI32(struct.reddot);
            oprot.writeFieldEnd();
            if (struct.service_url != null) {
                oprot.writeFieldBegin(NotifyResult.SERVICE_URL_FIELD_DESC);
                oprot.writeString(struct.service_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(NotifyResult.COUNT_FIELD_DESC);
            oprot.writeI32(struct.count);
            oprot.writeFieldEnd();
            if (struct.emergency != null && struct.isSetEmergency()) {
                oprot.writeFieldBegin(NotifyResult.EMERGENCY_FIELD_DESC);
                struct.emergency.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.notify != null && struct.isSetNotify()) {
                oprot.writeFieldBegin(NotifyResult.NOTIFY_FIELD_DESC);
                struct.notify.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.advNotify != null && struct.isSetAdvNotify()) {
                oprot.writeFieldBegin(NotifyResult.ADV_NOTIFY_FIELD_DESC);
                struct.advNotify.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.advFeedback != null && struct.isSetAdvFeedback()) {
                oprot.writeFieldBegin(NotifyResult.ADV_FEEDBACK_FIELD_DESC);
                struct.advFeedback.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetLatest_notify_time_sec()) {
                oprot.writeFieldBegin(NotifyResult.LATEST_NOTIFY_TIME_SEC_FIELD_DESC);
                oprot.writeI32(struct.latest_notify_time_sec);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUnread_count()) {
                oprot.writeFieldBegin(NotifyResult.UNREAD_COUNT_FIELD_DESC);
                oprot.writeI32(struct.unread_count);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyResultStandardSchemeFactory implements SchemeFactory {
        private NotifyResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public NotifyResultStandardScheme getScheme() {
            return new NotifyResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyResultTupleScheme extends TupleScheme<NotifyResult> {
        private NotifyResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, NotifyResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.popup = tTupleProtocol.readI32();
            struct.setPopupIsSet(true);
            struct.reddot = tTupleProtocol.readI32();
            struct.setReddotIsSet(true);
            struct.service_url = tTupleProtocol.readString();
            struct.setService_urlIsSet(true);
            struct.count = tTupleProtocol.readI32();
            struct.setCountIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                Notify notify = new Notify();
                struct.emergency = notify;
                notify.read(tTupleProtocol);
                struct.setEmergencyIsSet(true);
            }
            if (readBitSet.get(1)) {
                Notify notify2 = new Notify();
                struct.notify = notify2;
                notify2.read(tTupleProtocol);
                struct.setNotifyIsSet(true);
            }
            if (readBitSet.get(2)) {
                Notify notify3 = new Notify();
                struct.advNotify = notify3;
                notify3.read(tTupleProtocol);
                struct.setAdvNotifyIsSet(true);
            }
            if (readBitSet.get(3)) {
                Feedback feedback = new Feedback();
                struct.advFeedback = feedback;
                feedback.read(tTupleProtocol);
                struct.setAdvFeedbackIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.latest_notify_time_sec = tTupleProtocol.readI32();
                struct.setLatest_notify_time_secIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.unread_count = tTupleProtocol.readI32();
                struct.setUnread_countIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, NotifyResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.popup);
            tTupleProtocol.writeI32(struct.reddot);
            tTupleProtocol.writeString(struct.service_url);
            tTupleProtocol.writeI32(struct.count);
            BitSet bitSet = new BitSet();
            if (struct.isSetEmergency()) {
                bitSet.set(0);
            }
            if (struct.isSetNotify()) {
                bitSet.set(1);
            }
            if (struct.isSetAdvNotify()) {
                bitSet.set(2);
            }
            if (struct.isSetAdvFeedback()) {
                bitSet.set(3);
            }
            if (struct.isSetLatest_notify_time_sec()) {
                bitSet.set(4);
            }
            if (struct.isSetUnread_count()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetEmergency()) {
                struct.emergency.write(tTupleProtocol);
            }
            if (struct.isSetNotify()) {
                struct.notify.write(tTupleProtocol);
            }
            if (struct.isSetAdvNotify()) {
                struct.advNotify.write(tTupleProtocol);
            }
            if (struct.isSetAdvFeedback()) {
                struct.advFeedback.write(tTupleProtocol);
            }
            if (struct.isSetLatest_notify_time_sec()) {
                tTupleProtocol.writeI32(struct.latest_notify_time_sec);
            }
            if (struct.isSetUnread_count()) {
                tTupleProtocol.writeI32(struct.unread_count);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyResultTupleSchemeFactory implements SchemeFactory {
        private NotifyResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public NotifyResultTupleScheme getScheme() {
            return new NotifyResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        POPUP(1, "popup"),
        REDDOT(2, "reddot"),
        SERVICE_URL(3, "service_url"),
        COUNT(4, "count"),
        EMERGENCY(5, "emergency"),
        NOTIFY(6, h.f81943g),
        ADV_NOTIFY(7, "advNotify"),
        ADV_FEEDBACK(8, "advFeedback"),
        LATEST_NOTIFY_TIME_SEC(9, "latest_notify_time_sec"),
        UNREAD_COUNT(10, "unread_count");

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
                    return POPUP;
                case 2:
                    return REDDOT;
                case 3:
                    return SERVICE_URL;
                case 4:
                    return COUNT;
                case 5:
                    return EMERGENCY;
                case 6:
                    return NOTIFY;
                case 7:
                    return ADV_NOTIFY;
                case 8:
                    return ADV_FEEDBACK;
                case 9:
                    return LATEST_NOTIFY_TIME_SEC;
                case 10:
                    return UNREAD_COUNT;
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
        hashMap.put(StandardScheme.class, new NotifyResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new NotifyResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.POPUP, (_Fields) new FieldMetaData("popup", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REDDOT, (_Fields) new FieldMetaData("reddot", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SERVICE_URL, (_Fields) new FieldMetaData("service_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.COUNT, (_Fields) new FieldMetaData("count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EMERGENCY, (_Fields) new FieldMetaData("emergency", (byte) 2, new StructMetaData((byte) 12, Notify.class)));
        enumMap.put((EnumMap) _Fields.NOTIFY, (_Fields) new FieldMetaData(h.f81943g, (byte) 2, new StructMetaData((byte) 12, Notify.class)));
        enumMap.put((EnumMap) _Fields.ADV_NOTIFY, (_Fields) new FieldMetaData("advNotify", (byte) 2, new StructMetaData((byte) 12, Notify.class)));
        enumMap.put((EnumMap) _Fields.ADV_FEEDBACK, (_Fields) new FieldMetaData("advFeedback", (byte) 2, new StructMetaData((byte) 12, Feedback.class)));
        enumMap.put((EnumMap) _Fields.LATEST_NOTIFY_TIME_SEC, (_Fields) new FieldMetaData("latest_notify_time_sec", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.UNREAD_COUNT, (_Fields) new FieldMetaData("unread_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(NotifyResult.class, unmodifiableMap);
    }

    public NotifyResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.EMERGENCY, _Fields.NOTIFY, _Fields.ADV_NOTIFY, _Fields.ADV_FEEDBACK, _Fields.LATEST_NOTIFY_TIME_SEC, _Fields.UNREAD_COUNT};
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
        setPopupIsSet(false);
        this.popup = 0;
        setReddotIsSet(false);
        this.reddot = 0;
        this.service_url = null;
        setCountIsSet(false);
        this.count = 0;
        this.emergency = null;
        this.notify = null;
        this.advNotify = null;
        this.advFeedback = null;
        setLatest_notify_time_secIsSet(false);
        this.latest_notify_time_sec = 0;
        setUnread_countIsSet(false);
        this.unread_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof NotifyResult)) {
            return equals((NotifyResult) that);
        }
        return false;
    }

    public Feedback getAdvFeedback() {
        return this.advFeedback;
    }

    public Notify getAdvNotify() {
        return this.advNotify;
    }

    public int getCount() {
        return this.count;
    }

    public Notify getEmergency() {
        return this.emergency;
    }

    public int getLatest_notify_time_sec() {
        return this.latest_notify_time_sec;
    }

    public Notify getNotify() {
        return this.notify;
    }

    public int getPopup() {
        return this.popup;
    }

    public int getReddot() {
        return this.reddot;
    }

    public String getService_url() {
        return this.service_url;
    }

    public int getUnread_count() {
        return this.unread_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAdvFeedback() {
        return this.advFeedback != null;
    }

    public boolean isSetAdvNotify() {
        return this.advNotify != null;
    }

    public boolean isSetCount() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetEmergency() {
        return this.emergency != null;
    }

    public boolean isSetLatest_notify_time_sec() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetNotify() {
        return this.notify != null;
    }

    public boolean isSetPopup() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetReddot() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetService_url() {
        return this.service_url != null;
    }

    public boolean isSetUnread_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public NotifyResult setAdvFeedback(Feedback advFeedback) {
        this.advFeedback = advFeedback;
        return this;
    }

    public void setAdvFeedbackIsSet(boolean value) {
        if (value) {
            return;
        }
        this.advFeedback = null;
    }

    public NotifyResult setAdvNotify(Notify advNotify) {
        this.advNotify = advNotify;
        return this;
    }

    public void setAdvNotifyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.advNotify = null;
    }

    public NotifyResult setCount(int count) {
        this.count = count;
        setCountIsSet(true);
        return this;
    }

    public void setCountIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public NotifyResult setEmergency(Notify emergency) {
        this.emergency = emergency;
        return this;
    }

    public void setEmergencyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.emergency = null;
    }

    public NotifyResult setLatest_notify_time_sec(int latest_notify_time_sec) {
        this.latest_notify_time_sec = latest_notify_time_sec;
        setLatest_notify_time_secIsSet(true);
        return this;
    }

    public void setLatest_notify_time_secIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public NotifyResult setNotify(Notify notify) {
        this.notify = notify;
        return this;
    }

    public void setNotifyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.notify = null;
    }

    public NotifyResult setPopup(int popup) {
        this.popup = popup;
        setPopupIsSet(true);
        return this;
    }

    public void setPopupIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public NotifyResult setReddot(int reddot) {
        this.reddot = reddot;
        setReddotIsSet(true);
        return this;
    }

    public void setReddotIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public NotifyResult setService_url(String service_url) {
        this.service_url = service_url;
        return this;
    }

    public void setService_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.service_url = null;
    }

    public NotifyResult setUnread_count(int unread_count) {
        this.unread_count = unread_count;
        setUnread_countIsSet(true);
        return this;
    }

    public void setUnread_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyResult(");
        sb2.append("popup:");
        sb2.append(this.popup);
        sb2.append(j2.O);
        sb2.append("reddot:");
        sb2.append(this.reddot);
        sb2.append(j2.O);
        sb2.append("service_url:");
        String str = this.service_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("count:");
        sb2.append(this.count);
        if (isSetEmergency()) {
            sb2.append(j2.O);
            sb2.append("emergency:");
            Notify notify = this.emergency;
            if (notify == null) {
                sb2.append("null");
            } else {
                sb2.append(notify);
            }
        }
        if (isSetNotify()) {
            sb2.append(j2.O);
            sb2.append("notify:");
            Notify notify2 = this.notify;
            if (notify2 == null) {
                sb2.append("null");
            } else {
                sb2.append(notify2);
            }
        }
        if (isSetAdvNotify()) {
            sb2.append(j2.O);
            sb2.append("advNotify:");
            Notify notify3 = this.advNotify;
            if (notify3 == null) {
                sb2.append("null");
            } else {
                sb2.append(notify3);
            }
        }
        if (isSetAdvFeedback()) {
            sb2.append(j2.O);
            sb2.append("advFeedback:");
            Feedback feedback = this.advFeedback;
            if (feedback == null) {
                sb2.append("null");
            } else {
                sb2.append(feedback);
            }
        }
        if (isSetLatest_notify_time_sec()) {
            sb2.append(j2.O);
            sb2.append("latest_notify_time_sec:");
            sb2.append(this.latest_notify_time_sec);
        }
        if (isSetUnread_count()) {
            sb2.append(j2.O);
            sb2.append("unread_count:");
            sb2.append(this.unread_count);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetAdvFeedback() {
        this.advFeedback = null;
    }

    public void unsetAdvNotify() {
        this.advNotify = null;
    }

    public void unsetCount() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetEmergency() {
        this.emergency = null;
    }

    public void unsetLatest_notify_time_sec() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetNotify() {
        this.notify = null;
    }

    public void unsetPopup() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetReddot() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetService_url() {
        this.service_url = null;
    }

    public void unsetUnread_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void validate() throws TException {
        if (this.service_url == null) {
            throw new TProtocolException("Required field 'service_url' was not present! Struct: " + toString());
        }
        Notify notify = this.emergency;
        if (notify != null) {
            notify.validate();
        }
        Notify notify2 = this.notify;
        if (notify2 != null) {
            notify2.validate();
        }
        Notify notify3 = this.advNotify;
        if (notify3 != null) {
            notify3.validate();
        }
        Feedback feedback = this.advFeedback;
        if (feedback != null) {
            feedback.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(NotifyResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo11 = Boolean.valueOf(isSetPopup()).compareTo(Boolean.valueOf(other.isSetPopup()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetPopup() && (compareTo10 = TBaseHelper.compareTo(this.popup, other.popup)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetReddot()).compareTo(Boolean.valueOf(other.isSetReddot()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetReddot() && (compareTo9 = TBaseHelper.compareTo(this.reddot, other.reddot)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetService_url()).compareTo(Boolean.valueOf(other.isSetService_url()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetService_url() && (compareTo8 = TBaseHelper.compareTo(this.service_url, other.service_url)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetCount()).compareTo(Boolean.valueOf(other.isSetCount()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetCount() && (compareTo7 = TBaseHelper.compareTo(this.count, other.count)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetEmergency()).compareTo(Boolean.valueOf(other.isSetEmergency()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetEmergency() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.emergency, (Comparable) other.emergency)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetNotify()).compareTo(Boolean.valueOf(other.isSetNotify()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetNotify() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.notify, (Comparable) other.notify)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetAdvNotify()).compareTo(Boolean.valueOf(other.isSetAdvNotify()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetAdvNotify() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.advNotify, (Comparable) other.advNotify)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetAdvFeedback()).compareTo(Boolean.valueOf(other.isSetAdvFeedback()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetAdvFeedback() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.advFeedback, (Comparable) other.advFeedback)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetLatest_notify_time_sec()).compareTo(Boolean.valueOf(other.isSetLatest_notify_time_sec()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetLatest_notify_time_sec() && (compareTo2 = TBaseHelper.compareTo(this.latest_notify_time_sec, other.latest_notify_time_sec)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetUnread_count()).compareTo(Boolean.valueOf(other.isSetUnread_count()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetUnread_count() || (compareTo = TBaseHelper.compareTo(this.unread_count, other.unread_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<NotifyResult, _Fields> deepCopy2() {
        return new NotifyResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getPopup());
            case 2:
                return Integer.valueOf(getReddot());
            case 3:
                return getService_url();
            case 4:
                return Integer.valueOf(getCount());
            case 5:
                return getEmergency();
            case 6:
                return getNotify();
            case 7:
                return getAdvNotify();
            case 8:
                return getAdvFeedback();
            case 9:
                return Integer.valueOf(getLatest_notify_time_sec());
            case 10:
                return Integer.valueOf(getUnread_count());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[field.ordinal()]) {
            case 1:
                return isSetPopup();
            case 2:
                return isSetReddot();
            case 3:
                return isSetService_url();
            case 4:
                return isSetCount();
            case 5:
                return isSetEmergency();
            case 6:
                return isSetNotify();
            case 7:
                return isSetAdvNotify();
            case 8:
                return isSetAdvFeedback();
            case 9:
                return isSetLatest_notify_time_sec();
            case 10:
                return isSetUnread_count();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyResult$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setPopup(((Integer) value).intValue());
                    break;
                } else {
                    unsetPopup();
                    break;
                }
            case 2:
                if (value != null) {
                    setReddot(((Integer) value).intValue());
                    break;
                } else {
                    unsetReddot();
                    break;
                }
            case 3:
                if (value != null) {
                    setService_url((String) value);
                    break;
                } else {
                    unsetService_url();
                    break;
                }
            case 4:
                if (value != null) {
                    setCount(((Integer) value).intValue());
                    break;
                } else {
                    unsetCount();
                    break;
                }
            case 5:
                if (value != null) {
                    setEmergency((Notify) value);
                    break;
                } else {
                    unsetEmergency();
                    break;
                }
            case 6:
                if (value != null) {
                    setNotify((Notify) value);
                    break;
                } else {
                    unsetNotify();
                    break;
                }
            case 7:
                if (value != null) {
                    setAdvNotify((Notify) value);
                    break;
                } else {
                    unsetAdvNotify();
                    break;
                }
            case 8:
                if (value != null) {
                    setAdvFeedback((Feedback) value);
                    break;
                } else {
                    unsetAdvFeedback();
                    break;
                }
            case 9:
                if (value != null) {
                    setLatest_notify_time_sec(((Integer) value).intValue());
                    break;
                } else {
                    unsetLatest_notify_time_sec();
                    break;
                }
            case 10:
                if (value != null) {
                    setUnread_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetUnread_count();
                    break;
                }
        }
    }

    public boolean equals(NotifyResult that) {
        if (that == null || this.popup != that.popup || this.reddot != that.reddot) {
            return false;
        }
        boolean isSetService_url = isSetService_url();
        boolean isSetService_url2 = that.isSetService_url();
        if (((isSetService_url || isSetService_url2) && !(isSetService_url && isSetService_url2 && this.service_url.equals(that.service_url))) || this.count != that.count) {
            return false;
        }
        boolean isSetEmergency = isSetEmergency();
        boolean isSetEmergency2 = that.isSetEmergency();
        if ((isSetEmergency || isSetEmergency2) && !(isSetEmergency && isSetEmergency2 && this.emergency.equals(that.emergency))) {
            return false;
        }
        boolean isSetNotify = isSetNotify();
        boolean isSetNotify2 = that.isSetNotify();
        if ((isSetNotify || isSetNotify2) && !(isSetNotify && isSetNotify2 && this.notify.equals(that.notify))) {
            return false;
        }
        boolean isSetAdvNotify = isSetAdvNotify();
        boolean isSetAdvNotify2 = that.isSetAdvNotify();
        if ((isSetAdvNotify || isSetAdvNotify2) && !(isSetAdvNotify && isSetAdvNotify2 && this.advNotify.equals(that.advNotify))) {
            return false;
        }
        boolean isSetAdvFeedback = isSetAdvFeedback();
        boolean isSetAdvFeedback2 = that.isSetAdvFeedback();
        if ((isSetAdvFeedback || isSetAdvFeedback2) && !(isSetAdvFeedback && isSetAdvFeedback2 && this.advFeedback.equals(that.advFeedback))) {
            return false;
        }
        boolean isSetLatest_notify_time_sec = isSetLatest_notify_time_sec();
        boolean isSetLatest_notify_time_sec2 = that.isSetLatest_notify_time_sec();
        if ((isSetLatest_notify_time_sec || isSetLatest_notify_time_sec2) && !(isSetLatest_notify_time_sec && isSetLatest_notify_time_sec2 && this.latest_notify_time_sec == that.latest_notify_time_sec)) {
            return false;
        }
        boolean isSetUnread_count = isSetUnread_count();
        boolean isSetUnread_count2 = that.isSetUnread_count();
        if (isSetUnread_count || isSetUnread_count2) {
            return isSetUnread_count && isSetUnread_count2 && this.unread_count == that.unread_count;
        }
        return true;
    }

    public NotifyResult(int popup, int reddot, String service_url, int count) {
        this();
        this.popup = popup;
        setPopupIsSet(true);
        this.reddot = reddot;
        setReddotIsSet(true);
        this.service_url = service_url;
        this.count = count;
        setCountIsSet(true);
    }

    public NotifyResult(NotifyResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.EMERGENCY, _Fields.NOTIFY, _Fields.ADV_NOTIFY, _Fields.ADV_FEEDBACK, _Fields.LATEST_NOTIFY_TIME_SEC, _Fields.UNREAD_COUNT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.popup = other.popup;
        this.reddot = other.reddot;
        if (other.isSetService_url()) {
            this.service_url = other.service_url;
        }
        this.count = other.count;
        if (other.isSetEmergency()) {
            this.emergency = new Notify(other.emergency);
        }
        if (other.isSetNotify()) {
            this.notify = new Notify(other.notify);
        }
        if (other.isSetAdvNotify()) {
            this.advNotify = new Notify(other.advNotify);
        }
        if (other.isSetAdvFeedback()) {
            this.advFeedback = new Feedback(other.advFeedback);
        }
        this.latest_notify_time_sec = other.latest_notify_time_sec;
        this.unread_count = other.unread_count;
    }
}
