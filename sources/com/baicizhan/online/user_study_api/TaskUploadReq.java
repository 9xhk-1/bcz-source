package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TaskUploadReq implements TBase<TaskUploadReq, _Fields>, Serializable, Cloneable, Comparable<TaskUploadReq> {
    private static final int __CNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String action;
    public int cnt;
    private static final TStruct STRUCT_DESC = new TStruct("TaskUploadReq");
    private static final TField ACTION_FIELD_DESC = new TField("action", (byte) 11, 1);
    private static final TField CNT_FIELD_DESC = new TField("cnt", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.TaskUploadReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$TaskUploadReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$TaskUploadReq$_Fields = iArr;
            try {
                iArr[_Fields.ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TaskUploadReq$_Fields[_Fields.CNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskUploadReqStandardScheme extends StandardScheme<TaskUploadReq> {
        private TaskUploadReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TaskUploadReq struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.cnt = iprot.readI32();
                        struct.setCntIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.action = iprot.readString();
                    struct.setActionIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCnt()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'cnt' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TaskUploadReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TaskUploadReq.STRUCT_DESC);
            if (struct.action != null) {
                oprot.writeFieldBegin(TaskUploadReq.ACTION_FIELD_DESC);
                oprot.writeString(struct.action);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(TaskUploadReq.CNT_FIELD_DESC);
            oprot.writeI32(struct.cnt);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskUploadReqStandardSchemeFactory implements SchemeFactory {
        private TaskUploadReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TaskUploadReqStandardScheme getScheme() {
            return new TaskUploadReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskUploadReqTupleScheme extends TupleScheme<TaskUploadReq> {
        private TaskUploadReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TaskUploadReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.action = tTupleProtocol.readString();
            struct.setActionIsSet(true);
            struct.cnt = tTupleProtocol.readI32();
            struct.setCntIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TaskUploadReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.action);
            tTupleProtocol.writeI32(struct.cnt);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskUploadReqTupleSchemeFactory implements SchemeFactory {
        private TaskUploadReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TaskUploadReqTupleScheme getScheme() {
            return new TaskUploadReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ACTION(1, "action"),
        CNT(2, "cnt");

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
                return ACTION;
            }
            if (fieldId != 2) {
                return null;
            }
            return CNT;
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
        hashMap.put(StandardScheme.class, new TaskUploadReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TaskUploadReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ACTION, (_Fields) new FieldMetaData("action", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CNT, (_Fields) new FieldMetaData("cnt", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TaskUploadReq.class, unmodifiableMap);
    }

    public TaskUploadReq() {
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
        this.action = null;
        setCntIsSet(false);
        this.cnt = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TaskUploadReq)) {
            return equals((TaskUploadReq) that);
        }
        return false;
    }

    public String getAction() {
        return this.action;
    }

    public int getCnt() {
        return this.cnt;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction() {
        return this.action != null;
    }

    public boolean isSetCnt() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TaskUploadReq setAction(String action) {
        this.action = action;
        return this;
    }

    public void setActionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action = null;
    }

    public TaskUploadReq setCnt(int cnt) {
        this.cnt = cnt;
        setCntIsSet(true);
        return this;
    }

    public void setCntIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TaskUploadReq(");
        sb2.append("action:");
        String str = this.action;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("cnt:");
        sb2.append(this.cnt);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction() {
        this.action = null;
    }

    public void unsetCnt() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.action != null) {
            return;
        }
        throw new TProtocolException("Required field 'action' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TaskUploadReq other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetAction()).compareTo(Boolean.valueOf(other.isSetAction()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetAction() && (compareTo2 = TBaseHelper.compareTo(this.action, other.action)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCnt()).compareTo(Boolean.valueOf(other.isSetCnt()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCnt() || (compareTo = TBaseHelper.compareTo(this.cnt, other.cnt)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TaskUploadReq, _Fields> deepCopy2() {
        return new TaskUploadReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TaskUploadReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getAction();
        }
        if (i11 == 2) {
            return Integer.valueOf(getCnt());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TaskUploadReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAction();
        }
        if (i11 == 2) {
            return isSetCnt();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TaskUploadReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAction();
                return;
            } else {
                setAction((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCnt();
        } else {
            setCnt(((Integer) value).intValue());
        }
    }

    public TaskUploadReq(String action, int cnt) {
        this();
        this.action = action;
        this.cnt = cnt;
        setCntIsSet(true);
    }

    public boolean equals(TaskUploadReq that) {
        if (that == null) {
            return false;
        }
        boolean isSetAction = isSetAction();
        boolean isSetAction2 = that.isSetAction();
        return (!(isSetAction || isSetAction2) || (isSetAction && isSetAction2 && this.action.equals(that.action))) && this.cnt == that.cnt;
    }

    public TaskUploadReq(TaskUploadReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAction()) {
            this.action = other.action;
        }
        this.cnt = other.cnt;
    }
}
