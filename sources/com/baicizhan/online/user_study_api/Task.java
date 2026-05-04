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
public class Task implements TBase<Task, _Fields>, Serializable, Cloneable, Comparable<Task> {
    private static final int __BUTTON_ACTION_TYPE_ISSET_ID = 3;
    private static final int __STATUS_ISSET_ID = 2;
    private static final int __TASK_ID_ISSET_ID = 0;
    private static final int __TASK_TYPE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String award;
    public int button_action_type;
    public String button_desc;
    public String button_redirect_url;
    private _Fields[] optionals;
    public int status;
    public int task_id;
    public String task_sub_title;
    public String task_title;
    public int task_type;
    private static final TStruct STRUCT_DESC = new TStruct("Task");
    private static final TField TASK_ID_FIELD_DESC = new TField("task_id", (byte) 8, 1);
    private static final TField TASK_TYPE_FIELD_DESC = new TField(ma.b.f72959x1, (byte) 8, 2);
    private static final TField TASK_TITLE_FIELD_DESC = new TField("task_title", (byte) 11, 3);
    private static final TField TASK_SUB_TITLE_FIELD_DESC = new TField("task_sub_title", (byte) 11, 4);
    private static final TField AWARD_FIELD_DESC = new TField(ma.b.D1, (byte) 11, 5);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 6);
    private static final TField BUTTON_DESC_FIELD_DESC = new TField("button_desc", (byte) 11, 7);
    private static final TField BUTTON_ACTION_TYPE_FIELD_DESC = new TField("button_action_type", (byte) 8, 8);
    private static final TField BUTTON_REDIRECT_URL_FIELD_DESC = new TField("button_redirect_url", (byte) 11, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.Task$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields = iArr;
            try {
                iArr[_Fields.TASK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.TASK_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.TASK_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.TASK_SUB_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.AWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.BUTTON_DESC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.BUTTON_ACTION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[_Fields.BUTTON_REDIRECT_URL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskStandardScheme extends StandardScheme<Task> {
        private TaskStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, Task struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTask_id()) {
                        throw new TProtocolException("Required field 'task_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTask_type()) {
                        throw new TProtocolException("Required field 'task_type' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetStatus()) {
                        throw new TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetButton_action_type()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'button_action_type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.task_id = iprot.readI32();
                            struct.setTask_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.task_type = iprot.readI32();
                            struct.setTask_typeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.task_title = iprot.readString();
                            struct.setTask_titleIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.task_sub_title = iprot.readString();
                            struct.setTask_sub_titleIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.award = iprot.readString();
                            struct.setAwardIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.status = iprot.readI32();
                            struct.setStatusIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.button_desc = iprot.readString();
                            struct.setButton_descIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.button_action_type = iprot.readI32();
                            struct.setButton_action_typeIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.button_redirect_url = iprot.readString();
                            struct.setButton_redirect_urlIsSet(true);
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
        public void write(TProtocol oprot, Task struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(Task.STRUCT_DESC);
            oprot.writeFieldBegin(Task.TASK_ID_FIELD_DESC);
            oprot.writeI32(struct.task_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(Task.TASK_TYPE_FIELD_DESC);
            oprot.writeI32(struct.task_type);
            oprot.writeFieldEnd();
            if (struct.task_title != null) {
                oprot.writeFieldBegin(Task.TASK_TITLE_FIELD_DESC);
                oprot.writeString(struct.task_title);
                oprot.writeFieldEnd();
            }
            if (struct.task_sub_title != null) {
                oprot.writeFieldBegin(Task.TASK_SUB_TITLE_FIELD_DESC);
                oprot.writeString(struct.task_sub_title);
                oprot.writeFieldEnd();
            }
            if (struct.award != null) {
                oprot.writeFieldBegin(Task.AWARD_FIELD_DESC);
                oprot.writeString(struct.award);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(Task.STATUS_FIELD_DESC);
            oprot.writeI32(struct.status);
            oprot.writeFieldEnd();
            if (struct.button_desc != null) {
                oprot.writeFieldBegin(Task.BUTTON_DESC_FIELD_DESC);
                oprot.writeString(struct.button_desc);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(Task.BUTTON_ACTION_TYPE_FIELD_DESC);
            oprot.writeI32(struct.button_action_type);
            oprot.writeFieldEnd();
            if (struct.button_redirect_url != null && struct.isSetButton_redirect_url()) {
                oprot.writeFieldBegin(Task.BUTTON_REDIRECT_URL_FIELD_DESC);
                oprot.writeString(struct.button_redirect_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskStandardSchemeFactory implements SchemeFactory {
        private TaskStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TaskStandardScheme getScheme() {
            return new TaskStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskTupleScheme extends TupleScheme<Task> {
        private TaskTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, Task struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.task_id = tTupleProtocol.readI32();
            struct.setTask_idIsSet(true);
            struct.task_type = tTupleProtocol.readI32();
            struct.setTask_typeIsSet(true);
            struct.task_title = tTupleProtocol.readString();
            struct.setTask_titleIsSet(true);
            struct.task_sub_title = tTupleProtocol.readString();
            struct.setTask_sub_titleIsSet(true);
            struct.award = tTupleProtocol.readString();
            struct.setAwardIsSet(true);
            struct.status = tTupleProtocol.readI32();
            struct.setStatusIsSet(true);
            struct.button_desc = tTupleProtocol.readString();
            struct.setButton_descIsSet(true);
            struct.button_action_type = tTupleProtocol.readI32();
            struct.setButton_action_typeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.button_redirect_url = tTupleProtocol.readString();
                struct.setButton_redirect_urlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, Task struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.task_id);
            tTupleProtocol.writeI32(struct.task_type);
            tTupleProtocol.writeString(struct.task_title);
            tTupleProtocol.writeString(struct.task_sub_title);
            tTupleProtocol.writeString(struct.award);
            tTupleProtocol.writeI32(struct.status);
            tTupleProtocol.writeString(struct.button_desc);
            tTupleProtocol.writeI32(struct.button_action_type);
            BitSet bitSet = new BitSet();
            if (struct.isSetButton_redirect_url()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetButton_redirect_url()) {
                tTupleProtocol.writeString(struct.button_redirect_url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskTupleSchemeFactory implements SchemeFactory {
        private TaskTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TaskTupleScheme getScheme() {
            return new TaskTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TASK_ID(1, "task_id"),
        TASK_TYPE(2, ma.b.f72959x1),
        TASK_TITLE(3, "task_title"),
        TASK_SUB_TITLE(4, "task_sub_title"),
        AWARD(5, ma.b.D1),
        STATUS(6, "status"),
        BUTTON_DESC(7, "button_desc"),
        BUTTON_ACTION_TYPE(8, "button_action_type"),
        BUTTON_REDIRECT_URL(9, "button_redirect_url");

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
                    return TASK_ID;
                case 2:
                    return TASK_TYPE;
                case 3:
                    return TASK_TITLE;
                case 4:
                    return TASK_SUB_TITLE;
                case 5:
                    return AWARD;
                case 6:
                    return STATUS;
                case 7:
                    return BUTTON_DESC;
                case 8:
                    return BUTTON_ACTION_TYPE;
                case 9:
                    return BUTTON_REDIRECT_URL;
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
        hashMap.put(StandardScheme.class, new TaskStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TaskTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TASK_ID, (_Fields) new FieldMetaData("task_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TASK_TYPE, (_Fields) new FieldMetaData(ma.b.f72959x1, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TASK_TITLE, (_Fields) new FieldMetaData("task_title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TASK_SUB_TITLE, (_Fields) new FieldMetaData("task_sub_title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AWARD, (_Fields) new FieldMetaData(ma.b.D1, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BUTTON_DESC, (_Fields) new FieldMetaData("button_desc", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BUTTON_ACTION_TYPE, (_Fields) new FieldMetaData("button_action_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BUTTON_REDIRECT_URL, (_Fields) new FieldMetaData("button_redirect_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(Task.class, unmodifiableMap);
    }

    public Task() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BUTTON_REDIRECT_URL};
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
        setTask_idIsSet(false);
        this.task_id = 0;
        setTask_typeIsSet(false);
        this.task_type = 0;
        this.task_title = null;
        this.task_sub_title = null;
        this.award = null;
        setStatusIsSet(false);
        this.status = 0;
        this.button_desc = null;
        setButton_action_typeIsSet(false);
        this.button_action_type = 0;
        this.button_redirect_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof Task)) {
            return equals((Task) that);
        }
        return false;
    }

    public String getAward() {
        return this.award;
    }

    public int getButton_action_type() {
        return this.button_action_type;
    }

    public String getButton_desc() {
        return this.button_desc;
    }

    public String getButton_redirect_url() {
        return this.button_redirect_url;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTask_id() {
        return this.task_id;
    }

    public String getTask_sub_title() {
        return this.task_sub_title;
    }

    public String getTask_title() {
        return this.task_title;
    }

    public int getTask_type() {
        return this.task_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAward() {
        return this.award != null;
    }

    public boolean isSetButton_action_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetButton_desc() {
        return this.button_desc != null;
    }

    public boolean isSetButton_redirect_url() {
        return this.button_redirect_url != null;
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTask_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTask_sub_title() {
        return this.task_sub_title != null;
    }

    public boolean isSetTask_title() {
        return this.task_title != null;
    }

    public boolean isSetTask_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public Task setAward(String award) {
        this.award = award;
        return this;
    }

    public void setAwardIsSet(boolean value) {
        if (value) {
            return;
        }
        this.award = null;
    }

    public Task setButton_action_type(int button_action_type) {
        this.button_action_type = button_action_type;
        setButton_action_typeIsSet(true);
        return this;
    }

    public void setButton_action_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public Task setButton_desc(String button_desc) {
        this.button_desc = button_desc;
        return this;
    }

    public void setButton_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.button_desc = null;
    }

    public Task setButton_redirect_url(String button_redirect_url) {
        this.button_redirect_url = button_redirect_url;
        return this;
    }

    public void setButton_redirect_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.button_redirect_url = null;
    }

    public Task setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public Task setTask_id(int task_id) {
        this.task_id = task_id;
        setTask_idIsSet(true);
        return this;
    }

    public void setTask_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public Task setTask_sub_title(String task_sub_title) {
        this.task_sub_title = task_sub_title;
        return this;
    }

    public void setTask_sub_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.task_sub_title = null;
    }

    public Task setTask_title(String task_title) {
        this.task_title = task_title;
        return this;
    }

    public void setTask_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.task_title = null;
    }

    public Task setTask_type(int task_type) {
        this.task_type = task_type;
        setTask_typeIsSet(true);
        return this;
    }

    public void setTask_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Task(");
        sb2.append("task_id:");
        sb2.append(this.task_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("task_type:");
        sb2.append(this.task_type);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("task_title:");
        String str = this.task_title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("task_sub_title:");
        String str2 = this.task_sub_title;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("award:");
        String str3 = this.award;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("status:");
        sb2.append(this.status);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("button_desc:");
        String str4 = this.button_desc;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("button_action_type:");
        sb2.append(this.button_action_type);
        if (isSetButton_redirect_url()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("button_redirect_url:");
            String str5 = this.button_redirect_url;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAward() {
        this.award = null;
    }

    public void unsetButton_action_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetButton_desc() {
        this.button_desc = null;
    }

    public void unsetButton_redirect_url() {
        this.button_redirect_url = null;
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTask_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTask_sub_title() {
        this.task_sub_title = null;
    }

    public void unsetTask_title() {
        this.task_title = null;
    }

    public void unsetTask_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.task_title == null) {
            throw new TProtocolException("Required field 'task_title' was not present! Struct: " + toString());
        }
        if (this.task_sub_title == null) {
            throw new TProtocolException("Required field 'task_sub_title' was not present! Struct: " + toString());
        }
        if (this.award == null) {
            throw new TProtocolException("Required field 'award' was not present! Struct: " + toString());
        }
        if (this.button_desc != null) {
            return;
        }
        throw new TProtocolException("Required field 'button_desc' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Task other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo10 = Boolean.valueOf(isSetTask_id()).compareTo(Boolean.valueOf(other.isSetTask_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTask_id() && (compareTo9 = TBaseHelper.compareTo(this.task_id, other.task_id)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetTask_type()).compareTo(Boolean.valueOf(other.isSetTask_type()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTask_type() && (compareTo8 = TBaseHelper.compareTo(this.task_type, other.task_type)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetTask_title()).compareTo(Boolean.valueOf(other.isSetTask_title()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetTask_title() && (compareTo7 = TBaseHelper.compareTo(this.task_title, other.task_title)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetTask_sub_title()).compareTo(Boolean.valueOf(other.isSetTask_sub_title()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetTask_sub_title() && (compareTo6 = TBaseHelper.compareTo(this.task_sub_title, other.task_sub_title)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetAward()).compareTo(Boolean.valueOf(other.isSetAward()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetAward() && (compareTo5 = TBaseHelper.compareTo(this.award, other.award)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetStatus() && (compareTo4 = TBaseHelper.compareTo(this.status, other.status)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetButton_desc()).compareTo(Boolean.valueOf(other.isSetButton_desc()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetButton_desc() && (compareTo3 = TBaseHelper.compareTo(this.button_desc, other.button_desc)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetButton_action_type()).compareTo(Boolean.valueOf(other.isSetButton_action_type()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetButton_action_type() && (compareTo2 = TBaseHelper.compareTo(this.button_action_type, other.button_action_type)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetButton_redirect_url()).compareTo(Boolean.valueOf(other.isSetButton_redirect_url()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetButton_redirect_url() || (compareTo = TBaseHelper.compareTo(this.button_redirect_url, other.button_redirect_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<Task, _Fields> deepCopy2() {
        return new Task(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTask_id());
            case 2:
                return Integer.valueOf(getTask_type());
            case 3:
                return getTask_title();
            case 4:
                return getTask_sub_title();
            case 5:
                return getAward();
            case 6:
                return Integer.valueOf(getStatus());
            case 7:
                return getButton_desc();
            case 8:
                return Integer.valueOf(getButton_action_type());
            case 9:
                return getButton_redirect_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[field.ordinal()]) {
            case 1:
                return isSetTask_id();
            case 2:
                return isSetTask_type();
            case 3:
                return isSetTask_title();
            case 4:
                return isSetTask_sub_title();
            case 5:
                return isSetAward();
            case 6:
                return isSetStatus();
            case 7:
                return isSetButton_desc();
            case 8:
                return isSetButton_action_type();
            case 9:
                return isSetButton_redirect_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$Task$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTask_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTask_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setTask_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetTask_type();
                    break;
                }
            case 3:
                if (value != null) {
                    setTask_title((String) value);
                    break;
                } else {
                    unsetTask_title();
                    break;
                }
            case 4:
                if (value != null) {
                    setTask_sub_title((String) value);
                    break;
                } else {
                    unsetTask_sub_title();
                    break;
                }
            case 5:
                if (value != null) {
                    setAward((String) value);
                    break;
                } else {
                    unsetAward();
                    break;
                }
            case 6:
                if (value != null) {
                    setStatus(((Integer) value).intValue());
                    break;
                } else {
                    unsetStatus();
                    break;
                }
            case 7:
                if (value != null) {
                    setButton_desc((String) value);
                    break;
                } else {
                    unsetButton_desc();
                    break;
                }
            case 8:
                if (value != null) {
                    setButton_action_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetButton_action_type();
                    break;
                }
            case 9:
                if (value != null) {
                    setButton_redirect_url((String) value);
                    break;
                } else {
                    unsetButton_redirect_url();
                    break;
                }
        }
    }

    public boolean equals(Task that) {
        if (that == null || this.task_id != that.task_id || this.task_type != that.task_type) {
            return false;
        }
        boolean isSetTask_title = isSetTask_title();
        boolean isSetTask_title2 = that.isSetTask_title();
        if ((isSetTask_title || isSetTask_title2) && !(isSetTask_title && isSetTask_title2 && this.task_title.equals(that.task_title))) {
            return false;
        }
        boolean isSetTask_sub_title = isSetTask_sub_title();
        boolean isSetTask_sub_title2 = that.isSetTask_sub_title();
        if ((isSetTask_sub_title || isSetTask_sub_title2) && !(isSetTask_sub_title && isSetTask_sub_title2 && this.task_sub_title.equals(that.task_sub_title))) {
            return false;
        }
        boolean isSetAward = isSetAward();
        boolean isSetAward2 = that.isSetAward();
        if (((isSetAward || isSetAward2) && !(isSetAward && isSetAward2 && this.award.equals(that.award))) || this.status != that.status) {
            return false;
        }
        boolean isSetButton_desc = isSetButton_desc();
        boolean isSetButton_desc2 = that.isSetButton_desc();
        if (((isSetButton_desc || isSetButton_desc2) && !(isSetButton_desc && isSetButton_desc2 && this.button_desc.equals(that.button_desc))) || this.button_action_type != that.button_action_type) {
            return false;
        }
        boolean isSetButton_redirect_url = isSetButton_redirect_url();
        boolean isSetButton_redirect_url2 = that.isSetButton_redirect_url();
        if (isSetButton_redirect_url || isSetButton_redirect_url2) {
            return isSetButton_redirect_url && isSetButton_redirect_url2 && this.button_redirect_url.equals(that.button_redirect_url);
        }
        return true;
    }

    public Task(int task_id, int task_type, String task_title, String task_sub_title, String award, int status, String button_desc, int button_action_type) {
        this();
        this.task_id = task_id;
        setTask_idIsSet(true);
        this.task_type = task_type;
        setTask_typeIsSet(true);
        this.task_title = task_title;
        this.task_sub_title = task_sub_title;
        this.award = award;
        this.status = status;
        setStatusIsSet(true);
        this.button_desc = button_desc;
        this.button_action_type = button_action_type;
        setButton_action_typeIsSet(true);
    }

    public Task(Task other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BUTTON_REDIRECT_URL};
        this.__isset_bitfield = other.__isset_bitfield;
        this.task_id = other.task_id;
        this.task_type = other.task_type;
        if (other.isSetTask_title()) {
            this.task_title = other.task_title;
        }
        if (other.isSetTask_sub_title()) {
            this.task_sub_title = other.task_sub_title;
        }
        if (other.isSetAward()) {
            this.award = other.award;
        }
        this.status = other.status;
        if (other.isSetButton_desc()) {
            this.button_desc = other.button_desc;
        }
        this.button_action_type = other.button_action_type;
        if (other.isSetButton_redirect_url()) {
            this.button_redirect_url = other.button_redirect_url;
        }
    }
}
