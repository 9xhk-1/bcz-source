package com.baicizhan.online.course_api;

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
import org.apache.thrift.meta_data.StructMetaData;
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
public class QuestionItem implements TBase<QuestionItem, _Fields>, Serializable, Cloneable, Comparable<QuestionItem> {
    private static final int __QUESTION_ID_ISSET_ID = 0;
    private static final int __SHOW_TIME_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String question;
    public long question_id;
    public List<ChoiceBaseItem> selects;
    public long show_time;
    public String title;
    public List<UnderLineItem> under_lines;
    private static final TStruct STRUCT_DESC = new TStruct("QuestionItem");
    private static final TField QUESTION_ID_FIELD_DESC = new TField("question_id", (byte) 10, 1);
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 2);
    private static final TField QUESTION_FIELD_DESC = new TField("question", (byte) 11, 3);
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 10, 4);
    private static final TField SELECTS_FIELD_DESC = new TField("selects", (byte) 15, 5);
    private static final TField UNDER_LINES_FIELD_DESC = new TField("under_lines", (byte) 15, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.QuestionItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields = iArr;
            try {
                iArr[_Fields.QUESTION_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[_Fields.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[_Fields.QUESTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[_Fields.SHOW_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[_Fields.SELECTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[_Fields.UNDER_LINES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionItemStandardScheme extends StandardScheme<QuestionItem> {
        private QuestionItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, QuestionItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetQuestion_id()) {
                        throw new TProtocolException("Required field 'question_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetShow_time()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'show_time' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.question_id = iprot.readI64();
                            struct.setQuestion_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.title = iprot.readString();
                            struct.setTitleIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.question = iprot.readString();
                            struct.setQuestionIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_time = iprot.readI64();
                            struct.setShow_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.selects = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                ChoiceBaseItem choiceBaseItem = new ChoiceBaseItem();
                                choiceBaseItem.read(iprot);
                                struct.selects.add(choiceBaseItem);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSelectsIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.under_lines = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                UnderLineItem underLineItem = new UnderLineItem();
                                underLineItem.read(iprot);
                                struct.under_lines.add(underLineItem);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setUnder_linesIsSet(true);
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
        public void write(TProtocol oprot, QuestionItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(QuestionItem.STRUCT_DESC);
            oprot.writeFieldBegin(QuestionItem.QUESTION_ID_FIELD_DESC);
            oprot.writeI64(struct.question_id);
            oprot.writeFieldEnd();
            if (struct.title != null) {
                oprot.writeFieldBegin(QuestionItem.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.question != null) {
                oprot.writeFieldBegin(QuestionItem.QUESTION_FIELD_DESC);
                oprot.writeString(struct.question);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(QuestionItem.SHOW_TIME_FIELD_DESC);
            oprot.writeI64(struct.show_time);
            oprot.writeFieldEnd();
            if (struct.selects != null) {
                oprot.writeFieldBegin(QuestionItem.SELECTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.selects.size()));
                Iterator<ChoiceBaseItem> it = struct.selects.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.under_lines != null) {
                oprot.writeFieldBegin(QuestionItem.UNDER_LINES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.under_lines.size()));
                Iterator<UnderLineItem> it2 = struct.under_lines.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionItemStandardSchemeFactory implements SchemeFactory {
        private QuestionItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QuestionItemStandardScheme getScheme() {
            return new QuestionItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionItemTupleScheme extends TupleScheme<QuestionItem> {
        private QuestionItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, QuestionItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.question_id = tTupleProtocol.readI64();
            struct.setQuestion_idIsSet(true);
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.question = tTupleProtocol.readString();
            struct.setQuestionIsSet(true);
            struct.show_time = tTupleProtocol.readI64();
            struct.setShow_timeIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.selects = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                ChoiceBaseItem choiceBaseItem = new ChoiceBaseItem();
                choiceBaseItem.read(tTupleProtocol);
                struct.selects.add(choiceBaseItem);
            }
            struct.setSelectsIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.under_lines = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                UnderLineItem underLineItem = new UnderLineItem();
                underLineItem.read(tTupleProtocol);
                struct.under_lines.add(underLineItem);
            }
            struct.setUnder_linesIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, QuestionItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.question_id);
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.question);
            tTupleProtocol.writeI64(struct.show_time);
            tTupleProtocol.writeI32(struct.selects.size());
            Iterator<ChoiceBaseItem> it = struct.selects.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.under_lines.size());
            Iterator<UnderLineItem> it2 = struct.under_lines.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QuestionItemTupleSchemeFactory implements SchemeFactory {
        private QuestionItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QuestionItemTupleScheme getScheme() {
            return new QuestionItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        QUESTION_ID(1, "question_id"),
        TITLE(2, "title"),
        QUESTION(3, "question"),
        SHOW_TIME(4, "show_time"),
        SELECTS(5, "selects"),
        UNDER_LINES(6, "under_lines");

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
                    return QUESTION_ID;
                case 2:
                    return TITLE;
                case 3:
                    return QUESTION;
                case 4:
                    return SHOW_TIME;
                case 5:
                    return SELECTS;
                case 6:
                    return UNDER_LINES;
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
        hashMap.put(StandardScheme.class, new QuestionItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new QuestionItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.QUESTION_ID, (_Fields) new FieldMetaData("question_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.QUESTION, (_Fields) new FieldMetaData("question", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SELECTS, (_Fields) new FieldMetaData("selects", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ChoiceBaseItem.class))));
        enumMap.put((EnumMap) _Fields.UNDER_LINES, (_Fields) new FieldMetaData("under_lines", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UnderLineItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(QuestionItem.class, unmodifiableMap);
    }

    public QuestionItem() {
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

    public void addToSelects(ChoiceBaseItem elem) {
        if (this.selects == null) {
            this.selects = new ArrayList();
        }
        this.selects.add(elem);
    }

    public void addToUnder_lines(UnderLineItem elem) {
        if (this.under_lines == null) {
            this.under_lines = new ArrayList();
        }
        this.under_lines.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setQuestion_idIsSet(false);
        this.question_id = 0L;
        this.title = null;
        this.question = null;
        setShow_timeIsSet(false);
        this.show_time = 0L;
        this.selects = null;
        this.under_lines = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof QuestionItem)) {
            return equals((QuestionItem) that);
        }
        return false;
    }

    public String getQuestion() {
        return this.question;
    }

    public long getQuestion_id() {
        return this.question_id;
    }

    public List<ChoiceBaseItem> getSelects() {
        return this.selects;
    }

    public Iterator<ChoiceBaseItem> getSelectsIterator() {
        List<ChoiceBaseItem> list = this.selects;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSelectsSize() {
        List<ChoiceBaseItem> list = this.selects;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getShow_time() {
        return this.show_time;
    }

    public String getTitle() {
        return this.title;
    }

    public List<UnderLineItem> getUnder_lines() {
        return this.under_lines;
    }

    public Iterator<UnderLineItem> getUnder_linesIterator() {
        List<UnderLineItem> list = this.under_lines;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUnder_linesSize() {
        List<UnderLineItem> list = this.under_lines;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetQuestion() {
        return this.question != null;
    }

    public boolean isSetQuestion_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSelects() {
        return this.selects != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    public boolean isSetUnder_lines() {
        return this.under_lines != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public QuestionItem setQuestion(String question) {
        this.question = question;
        return this;
    }

    public void setQuestionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.question = null;
    }

    public QuestionItem setQuestion_id(long question_id) {
        this.question_id = question_id;
        setQuestion_idIsSet(true);
        return this;
    }

    public void setQuestion_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public QuestionItem setSelects(List<ChoiceBaseItem> selects) {
        this.selects = selects;
        return this;
    }

    public void setSelectsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.selects = null;
    }

    public QuestionItem setShow_time(long show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public QuestionItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public QuestionItem setUnder_lines(List<UnderLineItem> under_lines) {
        this.under_lines = under_lines;
        return this;
    }

    public void setUnder_linesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.under_lines = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionItem(");
        sb2.append("question_id:");
        sb2.append(this.question_id);
        sb2.append(j2.O);
        sb2.append("title:");
        String str = this.title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("question:");
        String str2 = this.question;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("show_time:");
        sb2.append(this.show_time);
        sb2.append(j2.O);
        sb2.append("selects:");
        List<ChoiceBaseItem> list = this.selects;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("under_lines:");
        List<UnderLineItem> list2 = this.under_lines;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetQuestion() {
        this.question = null;
    }

    public void unsetQuestion_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSelects() {
        this.selects = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void unsetUnder_lines() {
        this.under_lines = null;
    }

    public void validate() throws TException {
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.question == null) {
            throw new TProtocolException("Required field 'question' was not present! Struct: " + toString());
        }
        if (this.selects == null) {
            throw new TProtocolException("Required field 'selects' was not present! Struct: " + toString());
        }
        if (this.under_lines != null) {
            return;
        }
        throw new TProtocolException("Required field 'under_lines' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(QuestionItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetQuestion_id()).compareTo(Boolean.valueOf(other.isSetQuestion_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetQuestion_id() && (compareTo6 = TBaseHelper.compareTo(this.question_id, other.question_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetTitle() && (compareTo5 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetQuestion()).compareTo(Boolean.valueOf(other.isSetQuestion()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetQuestion() && (compareTo4 = TBaseHelper.compareTo(this.question, other.question)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetShow_time() && (compareTo3 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetSelects()).compareTo(Boolean.valueOf(other.isSetSelects()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetSelects() && (compareTo2 = TBaseHelper.compareTo((List) this.selects, (List) other.selects)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetUnder_lines()).compareTo(Boolean.valueOf(other.isSetUnder_lines()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetUnder_lines() || (compareTo = TBaseHelper.compareTo((List) this.under_lines, (List) other.under_lines)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<QuestionItem, _Fields> deepCopy2() {
        return new QuestionItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getQuestion_id());
            case 2:
                return getTitle();
            case 3:
                return getQuestion();
            case 4:
                return Long.valueOf(getShow_time());
            case 5:
                return getSelects();
            case 6:
                return getUnder_lines();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetQuestion_id();
            case 2:
                return isSetTitle();
            case 3:
                return isSetQuestion();
            case 4:
                return isSetShow_time();
            case 5:
                return isSetSelects();
            case 6:
                return isSetUnder_lines();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$QuestionItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setQuestion_id(((Long) value).longValue());
                    break;
                } else {
                    unsetQuestion_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setTitle((String) value);
                    break;
                } else {
                    unsetTitle();
                    break;
                }
            case 3:
                if (value != null) {
                    setQuestion((String) value);
                    break;
                } else {
                    unsetQuestion();
                    break;
                }
            case 4:
                if (value != null) {
                    setShow_time(((Long) value).longValue());
                    break;
                } else {
                    unsetShow_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setSelects((List) value);
                    break;
                } else {
                    unsetSelects();
                    break;
                }
            case 6:
                if (value != null) {
                    setUnder_lines((List) value);
                    break;
                } else {
                    unsetUnder_lines();
                    break;
                }
        }
    }

    public QuestionItem(long question_id, String title, String question, long show_time, List<ChoiceBaseItem> selects, List<UnderLineItem> under_lines) {
        this();
        this.question_id = question_id;
        setQuestion_idIsSet(true);
        this.title = title;
        this.question = question;
        this.show_time = show_time;
        setShow_timeIsSet(true);
        this.selects = selects;
        this.under_lines = under_lines;
    }

    public boolean equals(QuestionItem that) {
        if (that == null || this.question_id != that.question_id) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetQuestion = isSetQuestion();
        boolean isSetQuestion2 = that.isSetQuestion();
        if (((isSetQuestion || isSetQuestion2) && !(isSetQuestion && isSetQuestion2 && this.question.equals(that.question))) || this.show_time != that.show_time) {
            return false;
        }
        boolean isSetSelects = isSetSelects();
        boolean isSetSelects2 = that.isSetSelects();
        if ((isSetSelects || isSetSelects2) && !(isSetSelects && isSetSelects2 && this.selects.equals(that.selects))) {
            return false;
        }
        boolean isSetUnder_lines = isSetUnder_lines();
        boolean isSetUnder_lines2 = that.isSetUnder_lines();
        if (isSetUnder_lines || isSetUnder_lines2) {
            return isSetUnder_lines && isSetUnder_lines2 && this.under_lines.equals(that.under_lines);
        }
        return true;
    }

    public QuestionItem(QuestionItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.question_id = other.question_id;
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetQuestion()) {
            this.question = other.question;
        }
        this.show_time = other.show_time;
        if (other.isSetSelects()) {
            ArrayList arrayList = new ArrayList(other.selects.size());
            Iterator<ChoiceBaseItem> it = other.selects.iterator();
            while (it.hasNext()) {
                arrayList.add(new ChoiceBaseItem(it.next()));
            }
            this.selects = arrayList;
        }
        if (other.isSetUnder_lines()) {
            ArrayList arrayList2 = new ArrayList(other.under_lines.size());
            Iterator<UnderLineItem> it2 = other.under_lines.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UnderLineItem(it2.next()));
            }
            this.under_lines = arrayList2;
        }
    }
}
