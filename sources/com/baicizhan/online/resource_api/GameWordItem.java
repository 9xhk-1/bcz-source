package com.baicizhan.online.resource_api;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class GameWordItem implements TBase<GameWordItem, _Fields>, Serializable, Cloneable, Comparable<GameWordItem> {
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __TOPIC_VERSION_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String content;
    private _Fields[] optionals;
    public int topic_id;
    public int topic_version;
    public String word_pack;
    private static final TStruct STRUCT_DESC = new TStruct("GameWordItem");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 2);
    private static final TField WORD_PACK_FIELD_DESC = new TField("word_pack", (byte) 11, 3);
    private static final TField TOPIC_VERSION_FIELD_DESC = new TField("topic_version", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.GameWordItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields[_Fields.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields[_Fields.WORD_PACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields[_Fields.TOPIC_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameWordItemStandardScheme extends StandardScheme<GameWordItem> {
        private GameWordItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, GameWordItem struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 8) {
                                struct.topic_version = iprot.readI32();
                                struct.setTopic_versionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.word_pack = iprot.readString();
                            struct.setWord_packIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.content = iprot.readString();
                        struct.setContentIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.topic_id = iprot.readI32();
                    struct.setTopic_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetTopic_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, GameWordItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(GameWordItem.STRUCT_DESC);
            oprot.writeFieldBegin(GameWordItem.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.content != null) {
                oprot.writeFieldBegin(GameWordItem.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            if (struct.word_pack != null && struct.isSetWord_pack()) {
                oprot.writeFieldBegin(GameWordItem.WORD_PACK_FIELD_DESC);
                oprot.writeString(struct.word_pack);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTopic_version()) {
                oprot.writeFieldBegin(GameWordItem.TOPIC_VERSION_FIELD_DESC);
                oprot.writeI32(struct.topic_version);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameWordItemStandardSchemeFactory implements SchemeFactory {
        private GameWordItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameWordItemStandardScheme getScheme() {
            return new GameWordItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameWordItemTupleScheme extends TupleScheme<GameWordItem> {
        private GameWordItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, GameWordItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.word_pack = tTupleProtocol.readString();
                struct.setWord_packIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.topic_version = tTupleProtocol.readI32();
                struct.setTopic_versionIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, GameWordItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.content);
            BitSet bitSet = new BitSet();
            if (struct.isSetWord_pack()) {
                bitSet.set(0);
            }
            if (struct.isSetTopic_version()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetWord_pack()) {
                tTupleProtocol.writeString(struct.word_pack);
            }
            if (struct.isSetTopic_version()) {
                tTupleProtocol.writeI32(struct.topic_version);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameWordItemTupleSchemeFactory implements SchemeFactory {
        private GameWordItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameWordItemTupleScheme getScheme() {
            return new GameWordItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        CONTENT(2, "content"),
        WORD_PACK(3, "word_pack"),
        TOPIC_VERSION(4, "topic_version");

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
                return TOPIC_ID;
            }
            if (fieldId == 2) {
                return CONTENT;
            }
            if (fieldId == 3) {
                return WORD_PACK;
            }
            if (fieldId != 4) {
                return null;
            }
            return TOPIC_VERSION;
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
        hashMap.put(StandardScheme.class, new GameWordItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new GameWordItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_PACK, (_Fields) new FieldMetaData("word_pack", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOPIC_VERSION, (_Fields) new FieldMetaData("topic_version", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(GameWordItem.class, unmodifiableMap);
    }

    public GameWordItem() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD_PACK, _Fields.TOPIC_VERSION};
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
        setTopic_idIsSet(false);
        this.topic_id = 0;
        this.content = null;
        this.word_pack = null;
        setTopic_versionIsSet(false);
        this.topic_version = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof GameWordItem)) {
            return equals((GameWordItem) that);
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getTopic_version() {
        return this.topic_version;
    }

    public String getWord_pack() {
        return this.word_pack;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetContent() {
        return this.content != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTopic_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWord_pack() {
        return this.word_pack != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public GameWordItem setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public GameWordItem setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public GameWordItem setTopic_version(int topic_version) {
        this.topic_version = topic_version;
        setTopic_versionIsSet(true);
        return this;
    }

    public void setTopic_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public GameWordItem setWord_pack(String word_pack) {
        this.word_pack = word_pack;
        return this;
    }

    public void setWord_packIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_pack = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GameWordItem(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("content:");
        String str = this.content;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetWord_pack()) {
            sb2.append(j2.O);
            sb2.append("word_pack:");
            String str2 = this.word_pack;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetTopic_version()) {
            sb2.append(j2.O);
            sb2.append("topic_version:");
            sb2.append(this.topic_version);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetContent() {
        this.content = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTopic_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWord_pack() {
        this.word_pack = null;
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
    public int compareTo(GameWordItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTopic_id() && (compareTo4 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetContent()).compareTo(Boolean.valueOf(other.isSetContent()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetContent() && (compareTo3 = TBaseHelper.compareTo(this.content, other.content)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetWord_pack()).compareTo(Boolean.valueOf(other.isSetWord_pack()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetWord_pack() && (compareTo2 = TBaseHelper.compareTo(this.word_pack, other.word_pack)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetTopic_version()).compareTo(Boolean.valueOf(other.isSetTopic_version()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetTopic_version() || (compareTo = TBaseHelper.compareTo(this.topic_version, other.topic_version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<GameWordItem, _Fields> deepCopy2() {
        return new GameWordItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return getContent();
        }
        if (i11 == 3) {
            return getWord_pack();
        }
        if (i11 == 4) {
            return Integer.valueOf(getTopic_version());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetContent();
        }
        if (i11 == 3) {
            return isSetWord_pack();
        }
        if (i11 == 4) {
            return isSetTopic_version();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$GameWordItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetContent();
                return;
            } else {
                setContent((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetWord_pack();
                return;
            } else {
                setWord_pack((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetTopic_version();
        } else {
            setTopic_version(((Integer) value).intValue());
        }
    }

    public boolean equals(GameWordItem that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetContent = isSetContent();
        boolean isSetContent2 = that.isSetContent();
        if ((isSetContent || isSetContent2) && !(isSetContent && isSetContent2 && this.content.equals(that.content))) {
            return false;
        }
        boolean isSetWord_pack = isSetWord_pack();
        boolean isSetWord_pack2 = that.isSetWord_pack();
        if ((isSetWord_pack || isSetWord_pack2) && !(isSetWord_pack && isSetWord_pack2 && this.word_pack.equals(that.word_pack))) {
            return false;
        }
        boolean isSetTopic_version = isSetTopic_version();
        boolean isSetTopic_version2 = that.isSetTopic_version();
        if (isSetTopic_version || isSetTopic_version2) {
            return isSetTopic_version && isSetTopic_version2 && this.topic_version == that.topic_version;
        }
        return true;
    }

    public GameWordItem(int topic_id, String content) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.content = content;
    }

    public GameWordItem(GameWordItem other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD_PACK, _Fields.TOPIC_VERSION};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetContent()) {
            this.content = other.content;
        }
        if (other.isSetWord_pack()) {
            this.word_pack = other.word_pack;
        }
        this.topic_version = other.topic_version;
    }
}
