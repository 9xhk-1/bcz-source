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
public class BBWordMediaHalftimeList implements TBase<BBWordMediaHalftimeList, _Fields>, Serializable, Cloneable, Comparable<BBWordMediaHalftimeList> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<String> word_fm_halftime_list;
    public List<String> word_fm_head_list;
    public List<String> word_fm_tail_list;
    public List<String> word_tv_halftime_list;
    private static final TStruct STRUCT_DESC = new TStruct("BBWordMediaHalftimeList");
    private static final TField WORD_FM_HALFTIME_LIST_FIELD_DESC = new TField("word_fm_halftime_list", (byte) 15, 1);
    private static final TField WORD_TV_HALFTIME_LIST_FIELD_DESC = new TField("word_tv_halftime_list", (byte) 15, 2);
    private static final TField WORD_FM_HEAD_LIST_FIELD_DESC = new TField("word_fm_head_list", (byte) 15, 3);
    private static final TField WORD_FM_TAIL_LIST_FIELD_DESC = new TField("word_fm_tail_list", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBWordMediaHalftimeList$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields = iArr;
            try {
                iArr[_Fields.WORD_FM_HALFTIME_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields[_Fields.WORD_TV_HALFTIME_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields[_Fields.WORD_FM_HEAD_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields[_Fields.WORD_FM_TAIL_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaHalftimeListStandardScheme extends StandardScheme<BBWordMediaHalftimeList> {
        private BBWordMediaHalftimeListStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBWordMediaHalftimeList struct) throws TException {
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
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.word_fm_tail_list = new ArrayList(readListBegin.size);
                                while (i11 < readListBegin.size) {
                                    struct.word_fm_tail_list.add(iprot.readString());
                                    i11++;
                                }
                                iprot.readListEnd();
                                struct.setWord_fm_tail_listIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.word_fm_head_list = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                struct.word_fm_head_list.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setWord_fm_head_listIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin3 = iprot.readListBegin();
                        struct.word_tv_halftime_list = new ArrayList(readListBegin3.size);
                        while (i11 < readListBegin3.size) {
                            struct.word_tv_halftime_list.add(iprot.readString());
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setWord_tv_halftime_listIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin4 = iprot.readListBegin();
                    struct.word_fm_halftime_list = new ArrayList(readListBegin4.size);
                    while (i11 < readListBegin4.size) {
                        struct.word_fm_halftime_list.add(iprot.readString());
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setWord_fm_halftime_listIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBWordMediaHalftimeList struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBWordMediaHalftimeList.STRUCT_DESC);
            if (struct.word_fm_halftime_list != null) {
                oprot.writeFieldBegin(BBWordMediaHalftimeList.WORD_FM_HALFTIME_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.word_fm_halftime_list.size()));
                Iterator<String> it = struct.word_fm_halftime_list.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.word_tv_halftime_list != null) {
                oprot.writeFieldBegin(BBWordMediaHalftimeList.WORD_TV_HALFTIME_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.word_tv_halftime_list.size()));
                Iterator<String> it2 = struct.word_tv_halftime_list.iterator();
                while (it2.hasNext()) {
                    oprot.writeString(it2.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.word_fm_head_list != null) {
                oprot.writeFieldBegin(BBWordMediaHalftimeList.WORD_FM_HEAD_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.word_fm_head_list.size()));
                Iterator<String> it3 = struct.word_fm_head_list.iterator();
                while (it3.hasNext()) {
                    oprot.writeString(it3.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.word_fm_tail_list != null) {
                oprot.writeFieldBegin(BBWordMediaHalftimeList.WORD_FM_TAIL_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.word_fm_tail_list.size()));
                Iterator<String> it4 = struct.word_fm_tail_list.iterator();
                while (it4.hasNext()) {
                    oprot.writeString(it4.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaHalftimeListStandardSchemeFactory implements SchemeFactory {
        private BBWordMediaHalftimeListStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordMediaHalftimeListStandardScheme getScheme() {
            return new BBWordMediaHalftimeListStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaHalftimeListTupleScheme extends TupleScheme<BBWordMediaHalftimeList> {
        private BBWordMediaHalftimeListTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBWordMediaHalftimeList struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.word_fm_halftime_list = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.word_fm_halftime_list.add(tTupleProtocol.readString());
            }
            struct.setWord_fm_halftime_listIsSet(true);
            TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.word_tv_halftime_list = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                struct.word_tv_halftime_list.add(tTupleProtocol.readString());
            }
            struct.setWord_tv_halftime_listIsSet(true);
            TList tList3 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.word_fm_head_list = new ArrayList(tList3.size);
            for (int i13 = 0; i13 < tList3.size; i13++) {
                struct.word_fm_head_list.add(tTupleProtocol.readString());
            }
            struct.setWord_fm_head_listIsSet(true);
            TList tList4 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.word_fm_tail_list = new ArrayList(tList4.size);
            for (int i14 = 0; i14 < tList4.size; i14++) {
                struct.word_fm_tail_list.add(tTupleProtocol.readString());
            }
            struct.setWord_fm_tail_listIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBWordMediaHalftimeList struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.word_fm_halftime_list.size());
            Iterator<String> it = struct.word_fm_halftime_list.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeI32(struct.word_tv_halftime_list.size());
            Iterator<String> it2 = struct.word_tv_halftime_list.iterator();
            while (it2.hasNext()) {
                tTupleProtocol.writeString(it2.next());
            }
            tTupleProtocol.writeI32(struct.word_fm_head_list.size());
            Iterator<String> it3 = struct.word_fm_head_list.iterator();
            while (it3.hasNext()) {
                tTupleProtocol.writeString(it3.next());
            }
            tTupleProtocol.writeI32(struct.word_fm_tail_list.size());
            Iterator<String> it4 = struct.word_fm_tail_list.iterator();
            while (it4.hasNext()) {
                tTupleProtocol.writeString(it4.next());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaHalftimeListTupleSchemeFactory implements SchemeFactory {
        private BBWordMediaHalftimeListTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordMediaHalftimeListTupleScheme getScheme() {
            return new BBWordMediaHalftimeListTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD_FM_HALFTIME_LIST(1, "word_fm_halftime_list"),
        WORD_TV_HALFTIME_LIST(2, "word_tv_halftime_list"),
        WORD_FM_HEAD_LIST(3, "word_fm_head_list"),
        WORD_FM_TAIL_LIST(4, "word_fm_tail_list");

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
                return WORD_FM_HALFTIME_LIST;
            }
            if (fieldId == 2) {
                return WORD_TV_HALFTIME_LIST;
            }
            if (fieldId == 3) {
                return WORD_FM_HEAD_LIST;
            }
            if (fieldId != 4) {
                return null;
            }
            return WORD_FM_TAIL_LIST;
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
        hashMap.put(StandardScheme.class, new BBWordMediaHalftimeListStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBWordMediaHalftimeListTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD_FM_HALFTIME_LIST, (_Fields) new FieldMetaData("word_fm_halftime_list", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.WORD_TV_HALFTIME_LIST, (_Fields) new FieldMetaData("word_tv_halftime_list", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.WORD_FM_HEAD_LIST, (_Fields) new FieldMetaData("word_fm_head_list", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.WORD_FM_TAIL_LIST, (_Fields) new FieldMetaData("word_fm_tail_list", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBWordMediaHalftimeList.class, unmodifiableMap);
    }

    public BBWordMediaHalftimeList() {
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

    public void addToWord_fm_halftime_list(String elem) {
        if (this.word_fm_halftime_list == null) {
            this.word_fm_halftime_list = new ArrayList();
        }
        this.word_fm_halftime_list.add(elem);
    }

    public void addToWord_fm_head_list(String elem) {
        if (this.word_fm_head_list == null) {
            this.word_fm_head_list = new ArrayList();
        }
        this.word_fm_head_list.add(elem);
    }

    public void addToWord_fm_tail_list(String elem) {
        if (this.word_fm_tail_list == null) {
            this.word_fm_tail_list = new ArrayList();
        }
        this.word_fm_tail_list.add(elem);
    }

    public void addToWord_tv_halftime_list(String elem) {
        if (this.word_tv_halftime_list == null) {
            this.word_tv_halftime_list = new ArrayList();
        }
        this.word_tv_halftime_list.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.word_fm_halftime_list = null;
        this.word_tv_halftime_list = null;
        this.word_fm_head_list = null;
        this.word_fm_tail_list = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBWordMediaHalftimeList)) {
            return equals((BBWordMediaHalftimeList) that);
        }
        return false;
    }

    public List<String> getWord_fm_halftime_list() {
        return this.word_fm_halftime_list;
    }

    public Iterator<String> getWord_fm_halftime_listIterator() {
        List<String> list = this.word_fm_halftime_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWord_fm_halftime_listSize() {
        List<String> list = this.word_fm_halftime_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getWord_fm_head_list() {
        return this.word_fm_head_list;
    }

    public Iterator<String> getWord_fm_head_listIterator() {
        List<String> list = this.word_fm_head_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWord_fm_head_listSize() {
        List<String> list = this.word_fm_head_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getWord_fm_tail_list() {
        return this.word_fm_tail_list;
    }

    public Iterator<String> getWord_fm_tail_listIterator() {
        List<String> list = this.word_fm_tail_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWord_fm_tail_listSize() {
        List<String> list = this.word_fm_tail_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getWord_tv_halftime_list() {
        return this.word_tv_halftime_list;
    }

    public Iterator<String> getWord_tv_halftime_listIterator() {
        List<String> list = this.word_tv_halftime_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWord_tv_halftime_listSize() {
        List<String> list = this.word_tv_halftime_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetWord_fm_halftime_list() {
        return this.word_fm_halftime_list != null;
    }

    public boolean isSetWord_fm_head_list() {
        return this.word_fm_head_list != null;
    }

    public boolean isSetWord_fm_tail_list() {
        return this.word_fm_tail_list != null;
    }

    public boolean isSetWord_tv_halftime_list() {
        return this.word_tv_halftime_list != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBWordMediaHalftimeList setWord_fm_halftime_list(List<String> word_fm_halftime_list) {
        this.word_fm_halftime_list = word_fm_halftime_list;
        return this;
    }

    public void setWord_fm_halftime_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_fm_halftime_list = null;
    }

    public BBWordMediaHalftimeList setWord_fm_head_list(List<String> word_fm_head_list) {
        this.word_fm_head_list = word_fm_head_list;
        return this;
    }

    public void setWord_fm_head_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_fm_head_list = null;
    }

    public BBWordMediaHalftimeList setWord_fm_tail_list(List<String> word_fm_tail_list) {
        this.word_fm_tail_list = word_fm_tail_list;
        return this;
    }

    public void setWord_fm_tail_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_fm_tail_list = null;
    }

    public BBWordMediaHalftimeList setWord_tv_halftime_list(List<String> word_tv_halftime_list) {
        this.word_tv_halftime_list = word_tv_halftime_list;
        return this;
    }

    public void setWord_tv_halftime_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_tv_halftime_list = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBWordMediaHalftimeList(");
        sb2.append("word_fm_halftime_list:");
        List<String> list = this.word_fm_halftime_list;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("word_tv_halftime_list:");
        List<String> list2 = this.word_tv_halftime_list;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j2.O);
        sb2.append("word_fm_head_list:");
        List<String> list3 = this.word_fm_head_list;
        if (list3 == null) {
            sb2.append("null");
        } else {
            sb2.append(list3);
        }
        sb2.append(j2.O);
        sb2.append("word_fm_tail_list:");
        List<String> list4 = this.word_fm_tail_list;
        if (list4 == null) {
            sb2.append("null");
        } else {
            sb2.append(list4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetWord_fm_halftime_list() {
        this.word_fm_halftime_list = null;
    }

    public void unsetWord_fm_head_list() {
        this.word_fm_head_list = null;
    }

    public void unsetWord_fm_tail_list() {
        this.word_fm_tail_list = null;
    }

    public void unsetWord_tv_halftime_list() {
        this.word_tv_halftime_list = null;
    }

    public void validate() throws TException {
        if (this.word_fm_halftime_list == null) {
            throw new TProtocolException("Required field 'word_fm_halftime_list' was not present! Struct: " + toString());
        }
        if (this.word_tv_halftime_list == null) {
            throw new TProtocolException("Required field 'word_tv_halftime_list' was not present! Struct: " + toString());
        }
        if (this.word_fm_head_list == null) {
            throw new TProtocolException("Required field 'word_fm_head_list' was not present! Struct: " + toString());
        }
        if (this.word_fm_tail_list != null) {
            return;
        }
        throw new TProtocolException("Required field 'word_fm_tail_list' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BBWordMediaHalftimeList(List<String> word_fm_halftime_list, List<String> word_tv_halftime_list, List<String> word_fm_head_list, List<String> word_fm_tail_list) {
        this();
        this.word_fm_halftime_list = word_fm_halftime_list;
        this.word_tv_halftime_list = word_tv_halftime_list;
        this.word_fm_head_list = word_fm_head_list;
        this.word_fm_tail_list = word_fm_tail_list;
    }

    @Override // java.lang.Comparable
    public int compareTo(BBWordMediaHalftimeList other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetWord_fm_halftime_list()).compareTo(Boolean.valueOf(other.isSetWord_fm_halftime_list()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetWord_fm_halftime_list() && (compareTo4 = TBaseHelper.compareTo((List) this.word_fm_halftime_list, (List) other.word_fm_halftime_list)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetWord_tv_halftime_list()).compareTo(Boolean.valueOf(other.isSetWord_tv_halftime_list()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetWord_tv_halftime_list() && (compareTo3 = TBaseHelper.compareTo((List) this.word_tv_halftime_list, (List) other.word_tv_halftime_list)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetWord_fm_head_list()).compareTo(Boolean.valueOf(other.isSetWord_fm_head_list()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetWord_fm_head_list() && (compareTo2 = TBaseHelper.compareTo((List) this.word_fm_head_list, (List) other.word_fm_head_list)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetWord_fm_tail_list()).compareTo(Boolean.valueOf(other.isSetWord_fm_tail_list()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetWord_fm_tail_list() || (compareTo = TBaseHelper.compareTo((List) this.word_fm_tail_list, (List) other.word_fm_tail_list)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBWordMediaHalftimeList, _Fields> deepCopy2() {
        return new BBWordMediaHalftimeList(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getWord_fm_halftime_list();
        }
        if (i11 == 2) {
            return getWord_tv_halftime_list();
        }
        if (i11 == 3) {
            return getWord_fm_head_list();
        }
        if (i11 == 4) {
            return getWord_fm_tail_list();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWord_fm_halftime_list();
        }
        if (i11 == 2) {
            return isSetWord_tv_halftime_list();
        }
        if (i11 == 3) {
            return isSetWord_fm_head_list();
        }
        if (i11 == 4) {
            return isSetWord_fm_tail_list();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordMediaHalftimeList$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWord_fm_halftime_list();
                return;
            } else {
                setWord_fm_halftime_list((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetWord_tv_halftime_list();
                return;
            } else {
                setWord_tv_halftime_list((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetWord_fm_head_list();
                return;
            } else {
                setWord_fm_head_list((List) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetWord_fm_tail_list();
        } else {
            setWord_fm_tail_list((List) value);
        }
    }

    public boolean equals(BBWordMediaHalftimeList that) {
        if (that == null) {
            return false;
        }
        boolean isSetWord_fm_halftime_list = isSetWord_fm_halftime_list();
        boolean isSetWord_fm_halftime_list2 = that.isSetWord_fm_halftime_list();
        if ((isSetWord_fm_halftime_list || isSetWord_fm_halftime_list2) && !(isSetWord_fm_halftime_list && isSetWord_fm_halftime_list2 && this.word_fm_halftime_list.equals(that.word_fm_halftime_list))) {
            return false;
        }
        boolean isSetWord_tv_halftime_list = isSetWord_tv_halftime_list();
        boolean isSetWord_tv_halftime_list2 = that.isSetWord_tv_halftime_list();
        if ((isSetWord_tv_halftime_list || isSetWord_tv_halftime_list2) && !(isSetWord_tv_halftime_list && isSetWord_tv_halftime_list2 && this.word_tv_halftime_list.equals(that.word_tv_halftime_list))) {
            return false;
        }
        boolean isSetWord_fm_head_list = isSetWord_fm_head_list();
        boolean isSetWord_fm_head_list2 = that.isSetWord_fm_head_list();
        if ((isSetWord_fm_head_list || isSetWord_fm_head_list2) && !(isSetWord_fm_head_list && isSetWord_fm_head_list2 && this.word_fm_head_list.equals(that.word_fm_head_list))) {
            return false;
        }
        boolean isSetWord_fm_tail_list = isSetWord_fm_tail_list();
        boolean isSetWord_fm_tail_list2 = that.isSetWord_fm_tail_list();
        if (isSetWord_fm_tail_list || isSetWord_fm_tail_list2) {
            return isSetWord_fm_tail_list && isSetWord_fm_tail_list2 && this.word_fm_tail_list.equals(that.word_fm_tail_list);
        }
        return true;
    }

    public BBWordMediaHalftimeList(BBWordMediaHalftimeList other) {
        if (other.isSetWord_fm_halftime_list()) {
            this.word_fm_halftime_list = new ArrayList(other.word_fm_halftime_list);
        }
        if (other.isSetWord_tv_halftime_list()) {
            this.word_tv_halftime_list = new ArrayList(other.word_tv_halftime_list);
        }
        if (other.isSetWord_fm_head_list()) {
            this.word_fm_head_list = new ArrayList(other.word_fm_head_list);
        }
        if (other.isSetWord_fm_tail_list()) {
            this.word_fm_tail_list = new ArrayList(other.word_fm_tail_list);
        }
    }
}
