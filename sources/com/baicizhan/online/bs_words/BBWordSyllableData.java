package com.baicizhan.online.bs_words;

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
public class BBWordSyllableData implements TBase<BBWordSyllableData, _Fields>, Serializable, Cloneable, Comparable<BBWordSyllableData> {
    private static final int __IS_DEFAULT_LEARN_ISSET_ID = 1;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean is_default_learn;
    public int topic_id;
    public String word_cloze;
    public List<String> word_cloze_options;
    public List<List<String>> word_cloze_tips;
    public String word_syllable;
    private static final TStruct STRUCT_DESC = new TStruct("BBWordSyllableData");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WORD_SYLLABLE_FIELD_DESC = new TField("word_syllable", (byte) 11, 2);
    private static final TField WORD_CLOZE_FIELD_DESC = new TField("word_cloze", (byte) 11, 3);
    private static final TField WORD_CLOZE_OPTIONS_FIELD_DESC = new TField("word_cloze_options", (byte) 15, 4);
    private static final TField WORD_CLOZE_TIPS_FIELD_DESC = new TField("word_cloze_tips", (byte) 15, 5);
    private static final TField IS_DEFAULT_LEARN_FIELD_DESC = new TField("is_default_learn", (byte) 2, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBWordSyllableData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[_Fields.WORD_SYLLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[_Fields.WORD_CLOZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[_Fields.WORD_CLOZE_OPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[_Fields.WORD_CLOZE_TIPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[_Fields.IS_DEFAULT_LEARN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSyllableDataStandardScheme extends StandardScheme<BBWordSyllableData> {
        private BBWordSyllableDataStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBWordSyllableData struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetIs_default_learn()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'is_default_learn' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 8) {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            struct.word_syllable = iprot.readString();
                            struct.setWord_syllableIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 11) {
                            struct.word_cloze = iprot.readString();
                            struct.setWord_clozeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.word_cloze_options = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                struct.word_cloze_options.add(iprot.readString());
                            }
                            iprot.readListEnd();
                            struct.setWord_cloze_optionsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 15) {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.word_cloze_tips = new ArrayList(readListBegin2.size);
                            for (int i12 = 0; i12 < readListBegin2.size; i12++) {
                                TList readListBegin3 = iprot.readListBegin();
                                ArrayList arrayList = new ArrayList(readListBegin3.size);
                                for (int i13 = 0; i13 < readListBegin3.size; i13++) {
                                    arrayList.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                struct.word_cloze_tips.add(arrayList);
                            }
                            iprot.readListEnd();
                            struct.setWord_cloze_tipsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 2) {
                            struct.is_default_learn = iprot.readBool();
                            struct.setIs_default_learnIsSet(true);
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
        public void write(TProtocol oprot, BBWordSyllableData struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBWordSyllableData.STRUCT_DESC);
            oprot.writeFieldBegin(BBWordSyllableData.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.word_syllable != null) {
                oprot.writeFieldBegin(BBWordSyllableData.WORD_SYLLABLE_FIELD_DESC);
                oprot.writeString(struct.word_syllable);
                oprot.writeFieldEnd();
            }
            if (struct.word_cloze != null) {
                oprot.writeFieldBegin(BBWordSyllableData.WORD_CLOZE_FIELD_DESC);
                oprot.writeString(struct.word_cloze);
                oprot.writeFieldEnd();
            }
            if (struct.word_cloze_options != null) {
                oprot.writeFieldBegin(BBWordSyllableData.WORD_CLOZE_OPTIONS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.word_cloze_options.size()));
                Iterator<String> it = struct.word_cloze_options.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.word_cloze_tips != null) {
                oprot.writeFieldBegin(BBWordSyllableData.WORD_CLOZE_TIPS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 15, struct.word_cloze_tips.size()));
                for (List<String> list : struct.word_cloze_tips) {
                    oprot.writeListBegin(new TList((byte) 11, list.size()));
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        oprot.writeString(it2.next());
                    }
                    oprot.writeListEnd();
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBWordSyllableData.IS_DEFAULT_LEARN_FIELD_DESC);
            oprot.writeBool(struct.is_default_learn);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSyllableDataStandardSchemeFactory implements SchemeFactory {
        private BBWordSyllableDataStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordSyllableDataStandardScheme getScheme() {
            return new BBWordSyllableDataStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSyllableDataTupleScheme extends TupleScheme<BBWordSyllableData> {
        private BBWordSyllableDataTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBWordSyllableData struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word_syllable = tTupleProtocol.readString();
            struct.setWord_syllableIsSet(true);
            struct.word_cloze = tTupleProtocol.readString();
            struct.setWord_clozeIsSet(true);
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.word_cloze_options = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.word_cloze_options.add(tTupleProtocol.readString());
            }
            struct.setWord_cloze_optionsIsSet(true);
            TList tList2 = new TList((byte) 15, tTupleProtocol.readI32());
            struct.word_cloze_tips = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                TList tList3 = new TList((byte) 11, tTupleProtocol.readI32());
                ArrayList arrayList = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    arrayList.add(tTupleProtocol.readString());
                }
                struct.word_cloze_tips.add(arrayList);
            }
            struct.setWord_cloze_tipsIsSet(true);
            struct.is_default_learn = tTupleProtocol.readBool();
            struct.setIs_default_learnIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBWordSyllableData struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.word_syllable);
            tTupleProtocol.writeString(struct.word_cloze);
            tTupleProtocol.writeI32(struct.word_cloze_options.size());
            Iterator<String> it = struct.word_cloze_options.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeI32(struct.word_cloze_tips.size());
            for (List<String> list : struct.word_cloze_tips) {
                tTupleProtocol.writeI32(list.size());
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    tTupleProtocol.writeString(it2.next());
                }
            }
            tTupleProtocol.writeBool(struct.is_default_learn);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSyllableDataTupleSchemeFactory implements SchemeFactory {
        private BBWordSyllableDataTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordSyllableDataTupleScheme getScheme() {
            return new BBWordSyllableDataTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WORD_SYLLABLE(2, "word_syllable"),
        WORD_CLOZE(3, "word_cloze"),
        WORD_CLOZE_OPTIONS(4, "word_cloze_options"),
        WORD_CLOZE_TIPS(5, "word_cloze_tips"),
        IS_DEFAULT_LEARN(6, "is_default_learn");

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
                    return TOPIC_ID;
                case 2:
                    return WORD_SYLLABLE;
                case 3:
                    return WORD_CLOZE;
                case 4:
                    return WORD_CLOZE_OPTIONS;
                case 5:
                    return WORD_CLOZE_TIPS;
                case 6:
                    return IS_DEFAULT_LEARN;
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
        hashMap.put(StandardScheme.class, new BBWordSyllableDataStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBWordSyllableDataTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD_SYLLABLE, (_Fields) new FieldMetaData("word_syllable", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_CLOZE, (_Fields) new FieldMetaData("word_cloze", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_CLOZE_OPTIONS, (_Fields) new FieldMetaData("word_cloze_options", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.WORD_CLOZE_TIPS, (_Fields) new FieldMetaData("word_cloze_tips", (byte) 1, new ListMetaData((byte) 15, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11)))));
        enumMap.put((EnumMap) _Fields.IS_DEFAULT_LEARN, (_Fields) new FieldMetaData("is_default_learn", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBWordSyllableData.class, unmodifiableMap);
    }

    public BBWordSyllableData() {
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

    public void addToWord_cloze_options(String elem) {
        if (this.word_cloze_options == null) {
            this.word_cloze_options = new ArrayList();
        }
        this.word_cloze_options.add(elem);
    }

    public void addToWord_cloze_tips(List<String> elem) {
        if (this.word_cloze_tips == null) {
            this.word_cloze_tips = new ArrayList();
        }
        this.word_cloze_tips.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setTopic_idIsSet(false);
        this.topic_id = 0;
        this.word_syllable = null;
        this.word_cloze = null;
        this.word_cloze_options = null;
        this.word_cloze_tips = null;
        setIs_default_learnIsSet(false);
        this.is_default_learn = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBWordSyllableData)) {
            return equals((BBWordSyllableData) that);
        }
        return false;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getWord_cloze() {
        return this.word_cloze;
    }

    public List<String> getWord_cloze_options() {
        return this.word_cloze_options;
    }

    public Iterator<String> getWord_cloze_optionsIterator() {
        List<String> list = this.word_cloze_options;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWord_cloze_optionsSize() {
        List<String> list = this.word_cloze_options;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<List<String>> getWord_cloze_tips() {
        return this.word_cloze_tips;
    }

    public Iterator<List<String>> getWord_cloze_tipsIterator() {
        List<List<String>> list = this.word_cloze_tips;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWord_cloze_tipsSize() {
        List<List<String>> list = this.word_cloze_tips;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getWord_syllable() {
        return this.word_syllable;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_default_learn() {
        return this.is_default_learn;
    }

    public boolean isSetIs_default_learn() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord_cloze() {
        return this.word_cloze != null;
    }

    public boolean isSetWord_cloze_options() {
        return this.word_cloze_options != null;
    }

    public boolean isSetWord_cloze_tips() {
        return this.word_cloze_tips != null;
    }

    public boolean isSetWord_syllable() {
        return this.word_syllable != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBWordSyllableData setIs_default_learn(boolean is_default_learn) {
        this.is_default_learn = is_default_learn;
        setIs_default_learnIsSet(true);
        return this;
    }

    public void setIs_default_learnIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBWordSyllableData setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBWordSyllableData setWord_cloze(String word_cloze) {
        this.word_cloze = word_cloze;
        return this;
    }

    public void setWord_clozeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_cloze = null;
    }

    public BBWordSyllableData setWord_cloze_options(List<String> word_cloze_options) {
        this.word_cloze_options = word_cloze_options;
        return this;
    }

    public void setWord_cloze_optionsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_cloze_options = null;
    }

    public BBWordSyllableData setWord_cloze_tips(List<List<String>> word_cloze_tips) {
        this.word_cloze_tips = word_cloze_tips;
        return this;
    }

    public void setWord_cloze_tipsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_cloze_tips = null;
    }

    public BBWordSyllableData setWord_syllable(String word_syllable) {
        this.word_syllable = word_syllable;
        return this;
    }

    public void setWord_syllableIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_syllable = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBWordSyllableData(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("word_syllable:");
        String str = this.word_syllable;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("word_cloze:");
        String str2 = this.word_cloze;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("word_cloze_options:");
        List<String> list = this.word_cloze_options;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("word_cloze_tips:");
        List<List<String>> list2 = this.word_cloze_tips;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j2.O);
        sb2.append("is_default_learn:");
        sb2.append(this.is_default_learn);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetIs_default_learn() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord_cloze() {
        this.word_cloze = null;
    }

    public void unsetWord_cloze_options() {
        this.word_cloze_options = null;
    }

    public void unsetWord_cloze_tips() {
        this.word_cloze_tips = null;
    }

    public void unsetWord_syllable() {
        this.word_syllable = null;
    }

    public void validate() throws TException {
        if (this.word_syllable == null) {
            throw new TProtocolException("Required field 'word_syllable' was not present! Struct: " + toString());
        }
        if (this.word_cloze == null) {
            throw new TProtocolException("Required field 'word_cloze' was not present! Struct: " + toString());
        }
        if (this.word_cloze_options == null) {
            throw new TProtocolException("Required field 'word_cloze_options' was not present! Struct: " + toString());
        }
        if (this.word_cloze_tips != null) {
            return;
        }
        throw new TProtocolException("Required field 'word_cloze_tips' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBWordSyllableData other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTopic_id() && (compareTo6 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetWord_syllable()).compareTo(Boolean.valueOf(other.isSetWord_syllable()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetWord_syllable() && (compareTo5 = TBaseHelper.compareTo(this.word_syllable, other.word_syllable)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetWord_cloze()).compareTo(Boolean.valueOf(other.isSetWord_cloze()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetWord_cloze() && (compareTo4 = TBaseHelper.compareTo(this.word_cloze, other.word_cloze)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetWord_cloze_options()).compareTo(Boolean.valueOf(other.isSetWord_cloze_options()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWord_cloze_options() && (compareTo3 = TBaseHelper.compareTo((List) this.word_cloze_options, (List) other.word_cloze_options)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetWord_cloze_tips()).compareTo(Boolean.valueOf(other.isSetWord_cloze_tips()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetWord_cloze_tips() && (compareTo2 = TBaseHelper.compareTo((List) this.word_cloze_tips, (List) other.word_cloze_tips)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetIs_default_learn()).compareTo(Boolean.valueOf(other.isSetIs_default_learn()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetIs_default_learn() || (compareTo = TBaseHelper.compareTo(this.is_default_learn, other.is_default_learn)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBWordSyllableData, _Fields> deepCopy2() {
        return new BBWordSyllableData(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getWord_syllable();
            case 3:
                return getWord_cloze();
            case 4:
                return getWord_cloze_options();
            case 5:
                return getWord_cloze_tips();
            case 6:
                return Boolean.valueOf(isIs_default_learn());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetWord_syllable();
            case 3:
                return isSetWord_cloze();
            case 4:
                return isSetWord_cloze_options();
            case 5:
                return isSetWord_cloze_tips();
            case 6:
                return isSetIs_default_learn();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordSyllableData$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setWord_syllable((String) value);
                    break;
                } else {
                    unsetWord_syllable();
                    break;
                }
            case 3:
                if (value != null) {
                    setWord_cloze((String) value);
                    break;
                } else {
                    unsetWord_cloze();
                    break;
                }
            case 4:
                if (value != null) {
                    setWord_cloze_options((List) value);
                    break;
                } else {
                    unsetWord_cloze_options();
                    break;
                }
            case 5:
                if (value != null) {
                    setWord_cloze_tips((List) value);
                    break;
                } else {
                    unsetWord_cloze_tips();
                    break;
                }
            case 6:
                if (value != null) {
                    setIs_default_learn(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIs_default_learn();
                    break;
                }
        }
    }

    public BBWordSyllableData(int topic_id, String word_syllable, String word_cloze, List<String> word_cloze_options, List<List<String>> word_cloze_tips, boolean is_default_learn) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word_syllable = word_syllable;
        this.word_cloze = word_cloze;
        this.word_cloze_options = word_cloze_options;
        this.word_cloze_tips = word_cloze_tips;
        this.is_default_learn = is_default_learn;
        setIs_default_learnIsSet(true);
    }

    public boolean equals(BBWordSyllableData that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetWord_syllable = isSetWord_syllable();
        boolean isSetWord_syllable2 = that.isSetWord_syllable();
        if ((isSetWord_syllable || isSetWord_syllable2) && !(isSetWord_syllable && isSetWord_syllable2 && this.word_syllable.equals(that.word_syllable))) {
            return false;
        }
        boolean isSetWord_cloze = isSetWord_cloze();
        boolean isSetWord_cloze2 = that.isSetWord_cloze();
        if ((isSetWord_cloze || isSetWord_cloze2) && !(isSetWord_cloze && isSetWord_cloze2 && this.word_cloze.equals(that.word_cloze))) {
            return false;
        }
        boolean isSetWord_cloze_options = isSetWord_cloze_options();
        boolean isSetWord_cloze_options2 = that.isSetWord_cloze_options();
        if ((isSetWord_cloze_options || isSetWord_cloze_options2) && !(isSetWord_cloze_options && isSetWord_cloze_options2 && this.word_cloze_options.equals(that.word_cloze_options))) {
            return false;
        }
        boolean isSetWord_cloze_tips = isSetWord_cloze_tips();
        boolean isSetWord_cloze_tips2 = that.isSetWord_cloze_tips();
        return (!(isSetWord_cloze_tips || isSetWord_cloze_tips2) || (isSetWord_cloze_tips && isSetWord_cloze_tips2 && this.word_cloze_tips.equals(that.word_cloze_tips))) && this.is_default_learn == that.is_default_learn;
    }

    public BBWordSyllableData(BBWordSyllableData other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetWord_syllable()) {
            this.word_syllable = other.word_syllable;
        }
        if (other.isSetWord_cloze()) {
            this.word_cloze = other.word_cloze;
        }
        if (other.isSetWord_cloze_options()) {
            this.word_cloze_options = new ArrayList(other.word_cloze_options);
        }
        if (other.isSetWord_cloze_tips()) {
            ArrayList arrayList = new ArrayList(other.word_cloze_tips.size());
            Iterator<List<String>> it = other.word_cloze_tips.iterator();
            while (it.hasNext()) {
                arrayList.add(new ArrayList(it.next()));
            }
            this.word_cloze_tips = arrayList;
        }
        this.is_default_learn = other.is_default_learn;
    }
}
