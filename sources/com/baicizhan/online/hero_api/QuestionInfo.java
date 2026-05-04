package com.baicizhan.online.hero_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class QuestionInfo implements TBase<QuestionInfo, _Fields>, Serializable, Cloneable, Comparable<QuestionInfo> {
    private static final int __ORDER_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<String> opts;
    public int order;
    public String question;
    private static final TStruct STRUCT_DESC = new TStruct("QuestionInfo");
    private static final TField ORDER_FIELD_DESC = new TField("order", (byte) 8, 1);
    private static final TField QUESTION_FIELD_DESC = new TField("question", (byte) 11, 2);
    private static final TField OPTS_FIELD_DESC = new TField("opts", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.QuestionInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$QuestionInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$QuestionInfo$_Fields = iArr;
            try {
                iArr[_Fields.ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$QuestionInfo$_Fields[_Fields.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$QuestionInfo$_Fields[_Fields.OPTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionInfoStandardScheme extends StandardScheme<QuestionInfo> {
        private QuestionInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, QuestionInfo struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.opts = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                struct.opts.add(iprot.readString());
                            }
                            iprot.readListEnd();
                            struct.setOptsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.question = iprot.readString();
                        struct.setQuestionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.order = iprot.readI32();
                    struct.setOrderIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetOrder()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'order' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, QuestionInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(QuestionInfo.STRUCT_DESC);
            oprot.writeFieldBegin(QuestionInfo.ORDER_FIELD_DESC);
            oprot.writeI32(struct.order);
            oprot.writeFieldEnd();
            if (struct.question != null) {
                oprot.writeFieldBegin(QuestionInfo.QUESTION_FIELD_DESC);
                oprot.writeString(struct.question);
                oprot.writeFieldEnd();
            }
            if (struct.opts != null) {
                oprot.writeFieldBegin(QuestionInfo.OPTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.opts.size()));
                Iterator<String> it = struct.opts.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionInfoStandardSchemeFactory implements SchemeFactory {
        private QuestionInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QuestionInfoStandardScheme getScheme() {
            return new QuestionInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionInfoTupleScheme extends TupleScheme<QuestionInfo> {
        private QuestionInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, QuestionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.order = tTupleProtocol.readI32();
            struct.setOrderIsSet(true);
            struct.question = tTupleProtocol.readString();
            struct.setQuestionIsSet(true);
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.opts = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.opts.add(tTupleProtocol.readString());
            }
            struct.setOptsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, QuestionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.order);
            tTupleProtocol.writeString(struct.question);
            tTupleProtocol.writeI32(struct.opts.size());
            Iterator<String> it = struct.opts.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionInfoTupleSchemeFactory implements SchemeFactory {
        private QuestionInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QuestionInfoTupleScheme getScheme() {
            return new QuestionInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ORDER(1, "order"),
        QUESTION(2, "question"),
        OPTS(3, "opts");

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
                return ORDER;
            }
            if (fieldId == 2) {
                return QUESTION;
            }
            if (fieldId != 3) {
                return null;
            }
            return OPTS;
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
        hashMap.put(StandardScheme.class, new QuestionInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new QuestionInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ORDER, (_Fields) new FieldMetaData("order", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.QUESTION, (_Fields) new FieldMetaData("question", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OPTS, (_Fields) new FieldMetaData("opts", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(QuestionInfo.class, unmodifiableMap);
    }

    public QuestionInfo() {
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

    public void addToOpts(String elem) {
        if (this.opts == null) {
            this.opts = new ArrayList();
        }
        this.opts.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setOrderIsSet(false);
        this.order = 0;
        this.question = null;
        this.opts = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof QuestionInfo)) {
            return equals((QuestionInfo) that);
        }
        return false;
    }

    public List<String> getOpts() {
        return this.opts;
    }

    public Iterator<String> getOptsIterator() {
        List<String> list = this.opts;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getOptsSize() {
        List<String> list = this.opts;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getOrder() {
        return this.order;
    }

    public String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetOpts() {
        return this.opts != null;
    }

    public boolean isSetOrder() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetQuestion() {
        return this.question != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public QuestionInfo setOpts(List<String> opts) {
        this.opts = opts;
        return this;
    }

    public void setOptsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.opts = null;
    }

    public QuestionInfo setOrder(int order) {
        this.order = order;
        setOrderIsSet(true);
        return this;
    }

    public void setOrderIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public QuestionInfo setQuestion(String question) {
        this.question = question;
        return this;
    }

    public void setQuestionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.question = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionInfo(");
        sb2.append("order:");
        sb2.append(this.order);
        sb2.append(j2.O);
        sb2.append("question:");
        String str = this.question;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("opts:");
        List<String> list = this.opts;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetOpts() {
        this.opts = null;
    }

    public void unsetOrder() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetQuestion() {
        this.question = null;
    }

    public void validate() throws TException {
        if (this.question == null) {
            throw new TProtocolException("Required field 'question' was not present! Struct: " + toString());
        }
        if (this.opts != null) {
            return;
        }
        throw new TProtocolException("Required field 'opts' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(QuestionInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetOrder()).compareTo(Boolean.valueOf(other.isSetOrder()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetOrder() && (compareTo3 = TBaseHelper.compareTo(this.order, other.order)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetQuestion()).compareTo(Boolean.valueOf(other.isSetQuestion()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetQuestion() && (compareTo2 = TBaseHelper.compareTo(this.question, other.question)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetOpts()).compareTo(Boolean.valueOf(other.isSetOpts()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetOpts() || (compareTo = TBaseHelper.compareTo((List) this.opts, (List) other.opts)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<QuestionInfo, _Fields> deepCopy2() {
        return new QuestionInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$QuestionInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getOrder());
        }
        if (i11 == 2) {
            return getQuestion();
        }
        if (i11 == 3) {
            return getOpts();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$QuestionInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetOrder();
        }
        if (i11 == 2) {
            return isSetQuestion();
        }
        if (i11 == 3) {
            return isSetOpts();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$QuestionInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetOrder();
                return;
            } else {
                setOrder(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetQuestion();
                return;
            } else {
                setQuestion((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetOpts();
        } else {
            setOpts((List) value);
        }
    }

    public QuestionInfo(int order, String question, List<String> opts) {
        this();
        this.order = order;
        setOrderIsSet(true);
        this.question = question;
        this.opts = opts;
    }

    public boolean equals(QuestionInfo that) {
        if (that == null || this.order != that.order) {
            return false;
        }
        boolean isSetQuestion = isSetQuestion();
        boolean isSetQuestion2 = that.isSetQuestion();
        if ((isSetQuestion || isSetQuestion2) && !(isSetQuestion && isSetQuestion2 && this.question.equals(that.question))) {
            return false;
        }
        boolean isSetOpts = isSetOpts();
        boolean isSetOpts2 = that.isSetOpts();
        if (isSetOpts || isSetOpts2) {
            return isSetOpts && isSetOpts2 && this.opts.equals(that.opts);
        }
        return true;
    }

    public QuestionInfo(QuestionInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.order = other.order;
        if (other.isSetQuestion()) {
            this.question = other.question;
        }
        if (other.isSetOpts()) {
            this.opts = new ArrayList(other.opts);
        }
    }
}
