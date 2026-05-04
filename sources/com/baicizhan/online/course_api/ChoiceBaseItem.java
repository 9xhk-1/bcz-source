package com.baicizhan.online.course_api;

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
public class ChoiceBaseItem implements TBase<ChoiceBaseItem, _Fields>, Serializable, Cloneable, Comparable<ChoiceBaseItem> {
    private static final int __CORRECT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String content;
    public int correct;
    private static final TStruct STRUCT_DESC = new TStruct("ChoiceBaseItem");
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 1);
    private static final TField CORRECT_FIELD_DESC = new TField(ma.b.P, (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.ChoiceBaseItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$ChoiceBaseItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$ChoiceBaseItem$_Fields = iArr;
            try {
                iArr[_Fields.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ChoiceBaseItem$_Fields[_Fields.CORRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChoiceBaseItemStandardScheme extends StandardScheme<ChoiceBaseItem> {
        private ChoiceBaseItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ChoiceBaseItem struct) throws TException {
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
                        struct.correct = iprot.readI32();
                        struct.setCorrectIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.content = iprot.readString();
                    struct.setContentIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCorrect()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'correct' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ChoiceBaseItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ChoiceBaseItem.STRUCT_DESC);
            if (struct.content != null) {
                oprot.writeFieldBegin(ChoiceBaseItem.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ChoiceBaseItem.CORRECT_FIELD_DESC);
            oprot.writeI32(struct.correct);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChoiceBaseItemStandardSchemeFactory implements SchemeFactory {
        private ChoiceBaseItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ChoiceBaseItemStandardScheme getScheme() {
            return new ChoiceBaseItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChoiceBaseItemTupleScheme extends TupleScheme<ChoiceBaseItem> {
        private ChoiceBaseItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ChoiceBaseItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            struct.correct = tTupleProtocol.readI32();
            struct.setCorrectIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ChoiceBaseItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.content);
            tTupleProtocol.writeI32(struct.correct);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChoiceBaseItemTupleSchemeFactory implements SchemeFactory {
        private ChoiceBaseItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ChoiceBaseItemTupleScheme getScheme() {
            return new ChoiceBaseItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CONTENT(1, "content"),
        CORRECT(2, ma.b.P);

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
                return CONTENT;
            }
            if (fieldId != 2) {
                return null;
            }
            return CORRECT;
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
        hashMap.put(StandardScheme.class, new ChoiceBaseItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ChoiceBaseItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CORRECT, (_Fields) new FieldMetaData(ma.b.P, (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ChoiceBaseItem.class, unmodifiableMap);
    }

    public ChoiceBaseItem() {
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
        this.content = null;
        setCorrectIsSet(false);
        this.correct = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ChoiceBaseItem)) {
            return equals((ChoiceBaseItem) that);
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public int getCorrect() {
        return this.correct;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetContent() {
        return this.content != null;
    }

    public boolean isSetCorrect() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ChoiceBaseItem setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public ChoiceBaseItem setCorrect(int correct) {
        this.correct = correct;
        setCorrectIsSet(true);
        return this;
    }

    public void setCorrectIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChoiceBaseItem(");
        sb2.append("content:");
        String str = this.content;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("correct:");
        sb2.append(this.correct);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetContent() {
        this.content = null;
    }

    public void unsetCorrect() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.content != null) {
            return;
        }
        throw new TProtocolException("Required field 'content' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ChoiceBaseItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetContent()).compareTo(Boolean.valueOf(other.isSetContent()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetContent() && (compareTo2 = TBaseHelper.compareTo(this.content, other.content)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCorrect()).compareTo(Boolean.valueOf(other.isSetCorrect()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCorrect() || (compareTo = TBaseHelper.compareTo(this.correct, other.correct)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ChoiceBaseItem, _Fields> deepCopy2() {
        return new ChoiceBaseItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ChoiceBaseItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getContent();
        }
        if (i11 == 2) {
            return Integer.valueOf(getCorrect());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ChoiceBaseItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetContent();
        }
        if (i11 == 2) {
            return isSetCorrect();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ChoiceBaseItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetContent();
                return;
            } else {
                setContent((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCorrect();
        } else {
            setCorrect(((Integer) value).intValue());
        }
    }

    public ChoiceBaseItem(String content, int correct) {
        this();
        this.content = content;
        this.correct = correct;
        setCorrectIsSet(true);
    }

    public boolean equals(ChoiceBaseItem that) {
        if (that == null) {
            return false;
        }
        boolean isSetContent = isSetContent();
        boolean isSetContent2 = that.isSetContent();
        return (!(isSetContent || isSetContent2) || (isSetContent && isSetContent2 && this.content.equals(that.content))) && this.correct == that.correct;
    }

    public ChoiceBaseItem(ChoiceBaseItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetContent()) {
            this.content = other.content;
        }
        this.correct = other.correct;
    }
}
