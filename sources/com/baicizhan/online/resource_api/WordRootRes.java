package com.baicizhan.online.resource_api;

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
public class WordRootRes implements TBase<WordRootRes, _Fields>, Serializable, Cloneable, Comparable<WordRootRes> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<RootItem> roots;
    public List<WordPackItem> word_pack_list;
    private static final TStruct STRUCT_DESC = new TStruct("WordRootRes");
    private static final TField ROOTS_FIELD_DESC = new TField("roots", (byte) 15, 1);
    private static final TField WORD_PACK_LIST_FIELD_DESC = new TField("word_pack_list", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.WordRootRes$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$WordRootRes$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$WordRootRes$_Fields = iArr;
            try {
                iArr[_Fields.ROOTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordRootRes$_Fields[_Fields.WORD_PACK_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordRootResStandardScheme extends StandardScheme<WordRootRes> {
        private WordRootResStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordRootRes struct) throws TException {
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
                    if (s11 != 4) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.word_pack_list = new ArrayList(readListBegin.size);
                        while (i11 < readListBegin.size) {
                            WordPackItem wordPackItem = new WordPackItem();
                            wordPackItem.read(iprot);
                            struct.word_pack_list.add(wordPackItem);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setWord_pack_listIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin2 = iprot.readListBegin();
                    struct.roots = new ArrayList(readListBegin2.size);
                    while (i11 < readListBegin2.size) {
                        RootItem rootItem = new RootItem();
                        rootItem.read(iprot);
                        struct.roots.add(rootItem);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setRootsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WordRootRes struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordRootRes.STRUCT_DESC);
            if (struct.roots != null) {
                oprot.writeFieldBegin(WordRootRes.ROOTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.roots.size()));
                Iterator<RootItem> it = struct.roots.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.word_pack_list != null) {
                oprot.writeFieldBegin(WordRootRes.WORD_PACK_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.word_pack_list.size()));
                Iterator<WordPackItem> it2 = struct.word_pack_list.iterator();
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
    public static class WordRootResStandardSchemeFactory implements SchemeFactory {
        private WordRootResStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordRootResStandardScheme getScheme() {
            return new WordRootResStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordRootResTupleScheme extends TupleScheme<WordRootRes> {
        private WordRootResTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordRootRes struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.roots = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                RootItem rootItem = new RootItem();
                rootItem.read(tTupleProtocol);
                struct.roots.add(rootItem);
            }
            struct.setRootsIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.word_pack_list = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                WordPackItem wordPackItem = new WordPackItem();
                wordPackItem.read(tTupleProtocol);
                struct.word_pack_list.add(wordPackItem);
            }
            struct.setWord_pack_listIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordRootRes struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.roots.size());
            Iterator<RootItem> it = struct.roots.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.word_pack_list.size());
            Iterator<WordPackItem> it2 = struct.word_pack_list.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordRootResTupleSchemeFactory implements SchemeFactory {
        private WordRootResTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordRootResTupleScheme getScheme() {
            return new WordRootResTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROOTS(1, "roots"),
        WORD_PACK_LIST(4, "word_pack_list");

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
                return ROOTS;
            }
            if (fieldId != 4) {
                return null;
            }
            return WORD_PACK_LIST;
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
        hashMap.put(StandardScheme.class, new WordRootResStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordRootResTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROOTS, (_Fields) new FieldMetaData("roots", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, RootItem.class))));
        enumMap.put((EnumMap) _Fields.WORD_PACK_LIST, (_Fields) new FieldMetaData("word_pack_list", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WordPackItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordRootRes.class, unmodifiableMap);
    }

    public WordRootRes() {
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

    public void addToRoots(RootItem elem) {
        if (this.roots == null) {
            this.roots = new ArrayList();
        }
        this.roots.add(elem);
    }

    public void addToWord_pack_list(WordPackItem elem) {
        if (this.word_pack_list == null) {
            this.word_pack_list = new ArrayList();
        }
        this.word_pack_list.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.roots = null;
        this.word_pack_list = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordRootRes)) {
            return equals((WordRootRes) that);
        }
        return false;
    }

    public List<RootItem> getRoots() {
        return this.roots;
    }

    public Iterator<RootItem> getRootsIterator() {
        List<RootItem> list = this.roots;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getRootsSize() {
        List<RootItem> list = this.roots;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<WordPackItem> getWord_pack_list() {
        return this.word_pack_list;
    }

    public Iterator<WordPackItem> getWord_pack_listIterator() {
        List<WordPackItem> list = this.word_pack_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWord_pack_listSize() {
        List<WordPackItem> list = this.word_pack_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetRoots() {
        return this.roots != null;
    }

    public boolean isSetWord_pack_list() {
        return this.word_pack_list != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordRootRes setRoots(List<RootItem> roots) {
        this.roots = roots;
        return this;
    }

    public void setRootsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.roots = null;
    }

    public WordRootRes setWord_pack_list(List<WordPackItem> word_pack_list) {
        this.word_pack_list = word_pack_list;
        return this;
    }

    public void setWord_pack_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_pack_list = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WordRootRes(");
        sb2.append("roots:");
        List<RootItem> list = this.roots;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("word_pack_list:");
        List<WordPackItem> list2 = this.word_pack_list;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetRoots() {
        this.roots = null;
    }

    public void unsetWord_pack_list() {
        this.word_pack_list = null;
    }

    public void validate() throws TException {
        if (this.roots == null) {
            throw new TProtocolException("Required field 'roots' was not present! Struct: " + toString());
        }
        if (this.word_pack_list != null) {
            return;
        }
        throw new TProtocolException("Required field 'word_pack_list' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public WordRootRes(List<RootItem> roots, List<WordPackItem> word_pack_list) {
        this();
        this.roots = roots;
        this.word_pack_list = word_pack_list;
    }

    @Override // java.lang.Comparable
    public int compareTo(WordRootRes other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetRoots()).compareTo(Boolean.valueOf(other.isSetRoots()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetRoots() && (compareTo2 = TBaseHelper.compareTo((List) this.roots, (List) other.roots)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetWord_pack_list()).compareTo(Boolean.valueOf(other.isSetWord_pack_list()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetWord_pack_list() || (compareTo = TBaseHelper.compareTo((List) this.word_pack_list, (List) other.word_pack_list)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordRootRes, _Fields> deepCopy2() {
        return new WordRootRes(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordRootRes$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getRoots();
        }
        if (i11 == 2) {
            return getWord_pack_list();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordRootRes$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRoots();
        }
        if (i11 == 2) {
            return isSetWord_pack_list();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordRootRes$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRoots();
                return;
            } else {
                setRoots((List) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetWord_pack_list();
        } else {
            setWord_pack_list((List) value);
        }
    }

    public boolean equals(WordRootRes that) {
        if (that == null) {
            return false;
        }
        boolean isSetRoots = isSetRoots();
        boolean isSetRoots2 = that.isSetRoots();
        if ((isSetRoots || isSetRoots2) && !(isSetRoots && isSetRoots2 && this.roots.equals(that.roots))) {
            return false;
        }
        boolean isSetWord_pack_list = isSetWord_pack_list();
        boolean isSetWord_pack_list2 = that.isSetWord_pack_list();
        if (isSetWord_pack_list || isSetWord_pack_list2) {
            return isSetWord_pack_list && isSetWord_pack_list2 && this.word_pack_list.equals(that.word_pack_list);
        }
        return true;
    }

    public WordRootRes(WordRootRes other) {
        if (other.isSetRoots()) {
            ArrayList arrayList = new ArrayList(other.roots.size());
            Iterator<RootItem> it = other.roots.iterator();
            while (it.hasNext()) {
                arrayList.add(new RootItem(it.next()));
            }
            this.roots = arrayList;
        }
        if (other.isSetWord_pack_list()) {
            ArrayList arrayList2 = new ArrayList(other.word_pack_list.size());
            Iterator<WordPackItem> it2 = other.word_pack_list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new WordPackItem(it2.next()));
            }
            this.word_pack_list = arrayList2;
        }
    }
}
