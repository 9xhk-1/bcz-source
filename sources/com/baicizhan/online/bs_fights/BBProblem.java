package com.baicizhan.online.bs_fights;

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
public class BBProblem implements TBase<BBProblem, _Fields>, Serializable, Cloneable, Comparable<BBProblem> {
    private static final int __ANSWER_ISSET_ID = 0;
    private static final int __TOPIC_ID_ISSET_ID = 1;
    private static final int __TYPE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int answer;
    public List<BBOption> options;
    public String title;
    public int topic_id;
    public int type;
    public String voice;
    private static final TStruct STRUCT_DESC = new TStruct("BBProblem");
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 1);
    private static final TField OPTIONS_FIELD_DESC = new TField("options", (byte) 15, 2);
    private static final TField ANSWER_FIELD_DESC = new TField("answer", (byte) 8, 3);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 4);
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 5);
    private static final TField VOICE_FIELD_DESC = new TField("voice", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBProblem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields = iArr;
            try {
                iArr[_Fields.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[_Fields.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[_Fields.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[_Fields.TOPIC_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[_Fields.TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[_Fields.VOICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBProblemStandardScheme extends StandardScheme<BBProblem> {
        private BBProblemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBProblem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetAnswer()) {
                        throw new TProtocolException("Required field 'answer' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetType()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 11) {
                            struct.title = iprot.readString();
                            struct.setTitleIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.options = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                BBOption bBOption = new BBOption();
                                bBOption.read(iprot);
                                struct.options.add(bBOption);
                            }
                            iprot.readListEnd();
                            struct.setOptionsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            struct.answer = iprot.readI32();
                            struct.setAnswerIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            struct.type = iprot.readI32();
                            struct.setTypeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            struct.voice = iprot.readString();
                            struct.setVoiceIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
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
        public void write(TProtocol oprot, BBProblem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBProblem.STRUCT_DESC);
            if (struct.title != null) {
                oprot.writeFieldBegin(BBProblem.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.options != null) {
                oprot.writeFieldBegin(BBProblem.OPTIONS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.options.size()));
                Iterator<BBOption> it = struct.options.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBProblem.ANSWER_FIELD_DESC);
            oprot.writeI32(struct.answer);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBProblem.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBProblem.TYPE_FIELD_DESC);
            oprot.writeI32(struct.type);
            oprot.writeFieldEnd();
            if (struct.voice != null) {
                oprot.writeFieldBegin(BBProblem.VOICE_FIELD_DESC);
                oprot.writeString(struct.voice);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBProblemStandardSchemeFactory implements SchemeFactory {
        private BBProblemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBProblemStandardScheme getScheme() {
            return new BBProblemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBProblemTupleScheme extends TupleScheme<BBProblem> {
        private BBProblemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBProblem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.options = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BBOption bBOption = new BBOption();
                bBOption.read(tTupleProtocol);
                struct.options.add(bBOption);
            }
            struct.setOptionsIsSet(true);
            struct.answer = tTupleProtocol.readI32();
            struct.setAnswerIsSet(true);
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.type = tTupleProtocol.readI32();
            struct.setTypeIsSet(true);
            struct.voice = tTupleProtocol.readString();
            struct.setVoiceIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBProblem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeI32(struct.options.size());
            Iterator<BBOption> it = struct.options.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.answer);
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.type);
            tTupleProtocol.writeString(struct.voice);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBProblemTupleSchemeFactory implements SchemeFactory {
        private BBProblemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBProblemTupleScheme getScheme() {
            return new BBProblemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TITLE(1, "title"),
        OPTIONS(2, "options"),
        ANSWER(3, "answer"),
        TOPIC_ID(4, "topic_id"),
        TYPE(5, "type"),
        VOICE(6, "voice");

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
                    return TITLE;
                case 2:
                    return OPTIONS;
                case 3:
                    return ANSWER;
                case 4:
                    return TOPIC_ID;
                case 5:
                    return TYPE;
                case 6:
                    return VOICE;
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
        hashMap.put(StandardScheme.class, new BBProblemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBProblemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OPTIONS, (_Fields) new FieldMetaData("options", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBOption.class))));
        enumMap.put((EnumMap) _Fields.ANSWER, (_Fields) new FieldMetaData("answer", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.VOICE, (_Fields) new FieldMetaData("voice", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBProblem.class, unmodifiableMap);
    }

    public BBProblem() {
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

    public void addToOptions(BBOption elem) {
        if (this.options == null) {
            this.options = new ArrayList();
        }
        this.options.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.title = null;
        this.options = null;
        setAnswerIsSet(false);
        this.answer = 0;
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setTypeIsSet(false);
        this.type = 0;
        this.voice = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBProblem)) {
            return equals((BBProblem) that);
        }
        return false;
    }

    public int getAnswer() {
        return this.answer;
    }

    public List<BBOption> getOptions() {
        return this.options;
    }

    public Iterator<BBOption> getOptionsIterator() {
        List<BBOption> list = this.options;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getOptionsSize() {
        List<BBOption> list = this.options;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getTitle() {
        return this.title;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getType() {
        return this.type;
    }

    public String getVoice() {
        return this.voice;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAnswer() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetOptions() {
        return this.options != null;
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetVoice() {
        return this.voice != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBProblem setAnswer(int answer) {
        this.answer = answer;
        setAnswerIsSet(true);
        return this;
    }

    public void setAnswerIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBProblem setOptions(List<BBOption> options) {
        this.options = options;
        return this;
    }

    public void setOptionsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.options = null;
    }

    public BBProblem setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public BBProblem setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBProblem setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBProblem setVoice(String voice) {
        this.voice = voice;
        return this;
    }

    public void setVoiceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.voice = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBProblem(");
        sb2.append("title:");
        String str = this.title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("options:");
        List<BBOption> list = this.options;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("answer:");
        sb2.append(this.answer);
        sb2.append(j2.O);
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("type:");
        sb2.append(this.type);
        sb2.append(j2.O);
        sb2.append("voice:");
        String str2 = this.voice;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAnswer() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetOptions() {
        this.options = null;
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetVoice() {
        this.voice = null;
    }

    public void validate() throws TException {
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.options == null) {
            throw new TProtocolException("Required field 'options' was not present! Struct: " + toString());
        }
        if (this.voice != null) {
            return;
        }
        throw new TProtocolException("Required field 'voice' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBProblem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTitle() && (compareTo6 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetOptions()).compareTo(Boolean.valueOf(other.isSetOptions()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetOptions() && (compareTo5 = TBaseHelper.compareTo((List) this.options, (List) other.options)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetAnswer()).compareTo(Boolean.valueOf(other.isSetAnswer()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetAnswer() && (compareTo4 = TBaseHelper.compareTo(this.answer, other.answer)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTopic_id() && (compareTo3 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetType() && (compareTo2 = TBaseHelper.compareTo(this.type, other.type)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetVoice()).compareTo(Boolean.valueOf(other.isSetVoice()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetVoice() || (compareTo = TBaseHelper.compareTo(this.voice, other.voice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBProblem, _Fields> deepCopy2() {
        return new BBProblem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[field.ordinal()]) {
            case 1:
                return getTitle();
            case 2:
                return getOptions();
            case 3:
                return Integer.valueOf(getAnswer());
            case 4:
                return Integer.valueOf(getTopic_id());
            case 5:
                return Integer.valueOf(getType());
            case 6:
                return getVoice();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[field.ordinal()]) {
            case 1:
                return isSetTitle();
            case 2:
                return isSetOptions();
            case 3:
                return isSetAnswer();
            case 4:
                return isSetTopic_id();
            case 5:
                return isSetType();
            case 6:
                return isSetVoice();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBProblem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTitle((String) value);
                    break;
                } else {
                    unsetTitle();
                    break;
                }
            case 2:
                if (value != null) {
                    setOptions((List) value);
                    break;
                } else {
                    unsetOptions();
                    break;
                }
            case 3:
                if (value != null) {
                    setAnswer(((Integer) value).intValue());
                    break;
                } else {
                    unsetAnswer();
                    break;
                }
            case 4:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 5:
                if (value != null) {
                    setType(((Integer) value).intValue());
                    break;
                } else {
                    unsetType();
                    break;
                }
            case 6:
                if (value != null) {
                    setVoice((String) value);
                    break;
                } else {
                    unsetVoice();
                    break;
                }
        }
    }

    public BBProblem(String title, List<BBOption> options, int answer, int topic_id, int type, String voice) {
        this();
        this.title = title;
        this.options = options;
        this.answer = answer;
        setAnswerIsSet(true);
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.type = type;
        setTypeIsSet(true);
        this.voice = voice;
    }

    public boolean equals(BBProblem that) {
        if (that == null) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetOptions = isSetOptions();
        boolean isSetOptions2 = that.isSetOptions();
        if (((isSetOptions || isSetOptions2) && (!isSetOptions || !isSetOptions2 || !this.options.equals(that.options))) || this.answer != that.answer || this.topic_id != that.topic_id || this.type != that.type) {
            return false;
        }
        boolean isSetVoice = isSetVoice();
        boolean isSetVoice2 = that.isSetVoice();
        if (isSetVoice || isSetVoice2) {
            return isSetVoice && isSetVoice2 && this.voice.equals(that.voice);
        }
        return true;
    }

    public BBProblem(BBProblem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetOptions()) {
            ArrayList arrayList = new ArrayList(other.options.size());
            Iterator<BBOption> it = other.options.iterator();
            while (it.hasNext()) {
                arrayList.add(new BBOption(it.next()));
            }
            this.options = arrayList;
        }
        this.answer = other.answer;
        this.topic_id = other.topic_id;
        this.type = other.type;
        if (other.isSetVoice()) {
            this.voice = other.voice;
        }
    }
}
