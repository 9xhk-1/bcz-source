package com.baicizhan.online.course_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
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
public class Message implements TBase<Message, _Fields>, Serializable, Cloneable, Comparable<Message> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public HeartBeat heart_beat;
    private _Fields[] optionals;
    public List<ProContent> pro_contents;
    public List<UserContent> user_contents;
    private static final TStruct STRUCT_DESC = new TStruct("Message");
    private static final TField HEART_BEAT_FIELD_DESC = new TField("heart_beat", (byte) 12, 1);
    private static final TField PRO_CONTENTS_FIELD_DESC = new TField("pro_contents", (byte) 15, 2);
    private static final TField USER_CONTENTS_FIELD_DESC = new TField("user_contents", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.Message$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$Message$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$Message$_Fields = iArr;
            try {
                iArr[_Fields.HEART_BEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$Message$_Fields[_Fields.PRO_CONTENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$Message$_Fields[_Fields.USER_CONTENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MessageStandardScheme extends StandardScheme<Message> {
        private MessageStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, Message struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.user_contents = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                UserContent userContent = new UserContent();
                                userContent.read(iprot);
                                struct.user_contents.add(userContent);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setUser_contentsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.pro_contents = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            ProContent proContent = new ProContent();
                            proContent.read(iprot);
                            struct.pro_contents.add(proContent);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setPro_contentsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    HeartBeat heartBeat = new HeartBeat();
                    struct.heart_beat = heartBeat;
                    heartBeat.read(iprot);
                    struct.setHeart_beatIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, Message struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(Message.STRUCT_DESC);
            if (struct.heart_beat != null) {
                oprot.writeFieldBegin(Message.HEART_BEAT_FIELD_DESC);
                struct.heart_beat.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.pro_contents != null && struct.isSetPro_contents()) {
                oprot.writeFieldBegin(Message.PRO_CONTENTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.pro_contents.size()));
                Iterator<ProContent> it = struct.pro_contents.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.user_contents != null && struct.isSetUser_contents()) {
                oprot.writeFieldBegin(Message.USER_CONTENTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.user_contents.size()));
                Iterator<UserContent> it2 = struct.user_contents.iterator();
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
    public static class MessageStandardSchemeFactory implements SchemeFactory {
        private MessageStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MessageStandardScheme getScheme() {
            return new MessageStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MessageTupleScheme extends TupleScheme<Message> {
        private MessageTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, Message struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            HeartBeat heartBeat = new HeartBeat();
            struct.heart_beat = heartBeat;
            heartBeat.read(tTupleProtocol);
            struct.setHeart_beatIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.pro_contents = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    ProContent proContent = new ProContent();
                    proContent.read(tTupleProtocol);
                    struct.pro_contents.add(proContent);
                }
                struct.setPro_contentsIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.user_contents = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    UserContent userContent = new UserContent();
                    userContent.read(tTupleProtocol);
                    struct.user_contents.add(userContent);
                }
                struct.setUser_contentsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, Message struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.heart_beat.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetPro_contents()) {
                bitSet.set(0);
            }
            if (struct.isSetUser_contents()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetPro_contents()) {
                tTupleProtocol.writeI32(struct.pro_contents.size());
                Iterator<ProContent> it = struct.pro_contents.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetUser_contents()) {
                tTupleProtocol.writeI32(struct.user_contents.size());
                Iterator<UserContent> it2 = struct.user_contents.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MessageTupleSchemeFactory implements SchemeFactory {
        private MessageTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MessageTupleScheme getScheme() {
            return new MessageTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        HEART_BEAT(1, "heart_beat"),
        PRO_CONTENTS(2, "pro_contents"),
        USER_CONTENTS(3, "user_contents");

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
                return HEART_BEAT;
            }
            if (fieldId == 2) {
                return PRO_CONTENTS;
            }
            if (fieldId != 3) {
                return null;
            }
            return USER_CONTENTS;
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
        hashMap.put(StandardScheme.class, new MessageStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MessageTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.HEART_BEAT, (_Fields) new FieldMetaData("heart_beat", (byte) 1, new StructMetaData((byte) 12, HeartBeat.class)));
        enumMap.put((EnumMap) _Fields.PRO_CONTENTS, (_Fields) new FieldMetaData("pro_contents", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ProContent.class))));
        enumMap.put((EnumMap) _Fields.USER_CONTENTS, (_Fields) new FieldMetaData("user_contents", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserContent.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(Message.class, unmodifiableMap);
    }

    public Message() {
        this.optionals = new _Fields[]{_Fields.PRO_CONTENTS, _Fields.USER_CONTENTS};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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

    public void addToPro_contents(ProContent elem) {
        if (this.pro_contents == null) {
            this.pro_contents = new ArrayList();
        }
        this.pro_contents.add(elem);
    }

    public void addToUser_contents(UserContent elem) {
        if (this.user_contents == null) {
            this.user_contents = new ArrayList();
        }
        this.user_contents.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.heart_beat = null;
        this.pro_contents = null;
        this.user_contents = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof Message)) {
            return equals((Message) that);
        }
        return false;
    }

    public HeartBeat getHeart_beat() {
        return this.heart_beat;
    }

    public List<ProContent> getPro_contents() {
        return this.pro_contents;
    }

    public Iterator<ProContent> getPro_contentsIterator() {
        List<ProContent> list = this.pro_contents;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getPro_contentsSize() {
        List<ProContent> list = this.pro_contents;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<UserContent> getUser_contents() {
        return this.user_contents;
    }

    public Iterator<UserContent> getUser_contentsIterator() {
        List<UserContent> list = this.user_contents;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUser_contentsSize() {
        List<UserContent> list = this.user_contents;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetHeart_beat() {
        return this.heart_beat != null;
    }

    public boolean isSetPro_contents() {
        return this.pro_contents != null;
    }

    public boolean isSetUser_contents() {
        return this.user_contents != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public Message setHeart_beat(HeartBeat heart_beat) {
        this.heart_beat = heart_beat;
        return this;
    }

    public void setHeart_beatIsSet(boolean value) {
        if (value) {
            return;
        }
        this.heart_beat = null;
    }

    public Message setPro_contents(List<ProContent> pro_contents) {
        this.pro_contents = pro_contents;
        return this;
    }

    public void setPro_contentsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.pro_contents = null;
    }

    public Message setUser_contents(List<UserContent> user_contents) {
        this.user_contents = user_contents;
        return this;
    }

    public void setUser_contentsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_contents = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Message(");
        sb2.append("heart_beat:");
        HeartBeat heartBeat = this.heart_beat;
        if (heartBeat == null) {
            sb2.append("null");
        } else {
            sb2.append(heartBeat);
        }
        if (isSetPro_contents()) {
            sb2.append(j2.O);
            sb2.append("pro_contents:");
            List<ProContent> list = this.pro_contents;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetUser_contents()) {
            sb2.append(j2.O);
            sb2.append("user_contents:");
            List<UserContent> list2 = this.user_contents;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetHeart_beat() {
        this.heart_beat = null;
    }

    public void unsetPro_contents() {
        this.pro_contents = null;
    }

    public void unsetUser_contents() {
        this.user_contents = null;
    }

    public void validate() throws TException {
        HeartBeat heartBeat = this.heart_beat;
        if (heartBeat != null) {
            if (heartBeat != null) {
                heartBeat.validate();
            }
        } else {
            throw new TProtocolException("Required field 'heart_beat' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Message other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetHeart_beat()).compareTo(Boolean.valueOf(other.isSetHeart_beat()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetHeart_beat() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.heart_beat, (Comparable) other.heart_beat)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetPro_contents()).compareTo(Boolean.valueOf(other.isSetPro_contents()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetPro_contents() && (compareTo2 = TBaseHelper.compareTo((List) this.pro_contents, (List) other.pro_contents)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetUser_contents()).compareTo(Boolean.valueOf(other.isSetUser_contents()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetUser_contents() || (compareTo = TBaseHelper.compareTo((List) this.user_contents, (List) other.user_contents)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<Message, _Fields> deepCopy2() {
        return new Message(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$Message$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getHeart_beat();
        }
        if (i11 == 2) {
            return getPro_contents();
        }
        if (i11 == 3) {
            return getUser_contents();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$Message$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetHeart_beat();
        }
        if (i11 == 2) {
            return isSetPro_contents();
        }
        if (i11 == 3) {
            return isSetUser_contents();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$Message$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetHeart_beat();
                return;
            } else {
                setHeart_beat((HeartBeat) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPro_contents();
                return;
            } else {
                setPro_contents((List) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetUser_contents();
        } else {
            setUser_contents((List) value);
        }
    }

    public Message(HeartBeat heart_beat) {
        this();
        this.heart_beat = heart_beat;
    }

    public boolean equals(Message that) {
        if (that == null) {
            return false;
        }
        boolean isSetHeart_beat = isSetHeart_beat();
        boolean isSetHeart_beat2 = that.isSetHeart_beat();
        if ((isSetHeart_beat || isSetHeart_beat2) && !(isSetHeart_beat && isSetHeart_beat2 && this.heart_beat.equals(that.heart_beat))) {
            return false;
        }
        boolean isSetPro_contents = isSetPro_contents();
        boolean isSetPro_contents2 = that.isSetPro_contents();
        if ((isSetPro_contents || isSetPro_contents2) && !(isSetPro_contents && isSetPro_contents2 && this.pro_contents.equals(that.pro_contents))) {
            return false;
        }
        boolean isSetUser_contents = isSetUser_contents();
        boolean isSetUser_contents2 = that.isSetUser_contents();
        if (isSetUser_contents || isSetUser_contents2) {
            return isSetUser_contents && isSetUser_contents2 && this.user_contents.equals(that.user_contents);
        }
        return true;
    }

    public Message(Message other) {
        this.optionals = new _Fields[]{_Fields.PRO_CONTENTS, _Fields.USER_CONTENTS};
        if (other.isSetHeart_beat()) {
            this.heart_beat = new HeartBeat(other.heart_beat);
        }
        if (other.isSetPro_contents()) {
            ArrayList arrayList = new ArrayList(other.pro_contents.size());
            Iterator<ProContent> it = other.pro_contents.iterator();
            while (it.hasNext()) {
                arrayList.add(new ProContent(it.next()));
            }
            this.pro_contents = arrayList;
        }
        if (other.isSetUser_contents()) {
            ArrayList arrayList2 = new ArrayList(other.user_contents.size());
            Iterator<UserContent> it2 = other.user_contents.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UserContent(it2.next()));
            }
            this.user_contents = arrayList2;
        }
    }
}
