package com.baicizhan.online.bcz_system_api;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TMap;
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
public class BczSystemInfos implements TBase<BczSystemInfos, _Fields>, Serializable, Cloneable, Comparable<BczSystemInfos> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<String> data_dns;
    private _Fields[] optionals;
    public Map<String, List<String>> other_dns;
    public List<String> res_dns;
    public Map<String, List<String>> tls_dns;
    private static final TStruct STRUCT_DESC = new TStruct("BczSystemInfos");
    private static final TField RES_DNS_FIELD_DESC = new TField("res_dns", (byte) 15, 1);
    private static final TField DATA_DNS_FIELD_DESC = new TField("data_dns", (byte) 15, 2);
    private static final TField OTHER_DNS_FIELD_DESC = new TField("other_dns", (byte) 13, 3);
    private static final TField TLS_DNS_FIELD_DESC = new TField("tls_dns", (byte) 13, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.BczSystemInfos$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields = iArr;
            try {
                iArr[_Fields.RES_DNS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields[_Fields.DATA_DNS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields[_Fields.OTHER_DNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields[_Fields.TLS_DNS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczSystemInfosStandardScheme extends StandardScheme<BczSystemInfos> {
        private BczSystemInfosStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczSystemInfos struct) throws TException {
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
                            } else if (b11 == 13) {
                                TMap readMapBegin = iprot.readMapBegin();
                                struct.tls_dns = new HashMap(readMapBegin.size * 2);
                                for (int i12 = 0; i12 < readMapBegin.size; i12++) {
                                    String readString = iprot.readString();
                                    TList readListBegin = iprot.readListBegin();
                                    ArrayList arrayList = new ArrayList(readListBegin.size);
                                    for (int i13 = 0; i13 < readListBegin.size; i13++) {
                                        arrayList.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    struct.tls_dns.put(readString, arrayList);
                                }
                                iprot.readMapEnd();
                                struct.setTls_dnsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 13) {
                            TMap readMapBegin2 = iprot.readMapBegin();
                            struct.other_dns = new HashMap(readMapBegin2.size * 2);
                            for (int i14 = 0; i14 < readMapBegin2.size; i14++) {
                                String readString2 = iprot.readString();
                                TList readListBegin2 = iprot.readListBegin();
                                ArrayList arrayList2 = new ArrayList(readListBegin2.size);
                                for (int i15 = 0; i15 < readListBegin2.size; i15++) {
                                    arrayList2.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                struct.other_dns.put(readString2, arrayList2);
                            }
                            iprot.readMapEnd();
                            struct.setOther_dnsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin3 = iprot.readListBegin();
                        struct.data_dns = new ArrayList(readListBegin3.size);
                        while (i11 < readListBegin3.size) {
                            struct.data_dns.add(iprot.readString());
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setData_dnsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin4 = iprot.readListBegin();
                    struct.res_dns = new ArrayList(readListBegin4.size);
                    while (i11 < readListBegin4.size) {
                        struct.res_dns.add(iprot.readString());
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setRes_dnsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczSystemInfos struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczSystemInfos.STRUCT_DESC);
            if (struct.res_dns != null) {
                oprot.writeFieldBegin(BczSystemInfos.RES_DNS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.res_dns.size()));
                Iterator<String> it = struct.res_dns.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.data_dns != null) {
                oprot.writeFieldBegin(BczSystemInfos.DATA_DNS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.data_dns.size()));
                Iterator<String> it2 = struct.data_dns.iterator();
                while (it2.hasNext()) {
                    oprot.writeString(it2.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.other_dns != null) {
                oprot.writeFieldBegin(BczSystemInfos.OTHER_DNS_FIELD_DESC);
                oprot.writeMapBegin(new TMap((byte) 11, (byte) 15, struct.other_dns.size()));
                for (Map.Entry<String, List<String>> entry : struct.other_dns.entrySet()) {
                    oprot.writeString(entry.getKey());
                    oprot.writeListBegin(new TList((byte) 11, entry.getValue().size()));
                    Iterator<String> it3 = entry.getValue().iterator();
                    while (it3.hasNext()) {
                        oprot.writeString(it3.next());
                    }
                    oprot.writeListEnd();
                }
                oprot.writeMapEnd();
                oprot.writeFieldEnd();
            }
            if (struct.tls_dns != null && struct.isSetTls_dns()) {
                oprot.writeFieldBegin(BczSystemInfos.TLS_DNS_FIELD_DESC);
                oprot.writeMapBegin(new TMap((byte) 11, (byte) 15, struct.tls_dns.size()));
                for (Map.Entry<String, List<String>> entry2 : struct.tls_dns.entrySet()) {
                    oprot.writeString(entry2.getKey());
                    oprot.writeListBegin(new TList((byte) 11, entry2.getValue().size()));
                    Iterator<String> it4 = entry2.getValue().iterator();
                    while (it4.hasNext()) {
                        oprot.writeString(it4.next());
                    }
                    oprot.writeListEnd();
                }
                oprot.writeMapEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczSystemInfosStandardSchemeFactory implements SchemeFactory {
        private BczSystemInfosStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczSystemInfosStandardScheme getScheme() {
            return new BczSystemInfosStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczSystemInfosTupleScheme extends TupleScheme<BczSystemInfos> {
        private BczSystemInfosTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczSystemInfos struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.res_dns = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.res_dns.add(tTupleProtocol.readString());
            }
            struct.setRes_dnsIsSet(true);
            TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.data_dns = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                struct.data_dns.add(tTupleProtocol.readString());
            }
            struct.setData_dnsIsSet(true);
            TMap tMap = new TMap((byte) 11, (byte) 15, tTupleProtocol.readI32());
            struct.other_dns = new HashMap(tMap.size * 2);
            for (int i13 = 0; i13 < tMap.size; i13++) {
                String readString = tTupleProtocol.readString();
                TList tList3 = new TList((byte) 11, tTupleProtocol.readI32());
                ArrayList arrayList = new ArrayList(tList3.size);
                for (int i14 = 0; i14 < tList3.size; i14++) {
                    arrayList.add(tTupleProtocol.readString());
                }
                struct.other_dns.put(readString, arrayList);
            }
            struct.setOther_dnsIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                TMap tMap2 = new TMap((byte) 11, (byte) 15, tTupleProtocol.readI32());
                struct.tls_dns = new HashMap(tMap2.size * 2);
                for (int i15 = 0; i15 < tMap2.size; i15++) {
                    String readString2 = tTupleProtocol.readString();
                    TList tList4 = new TList((byte) 11, tTupleProtocol.readI32());
                    ArrayList arrayList2 = new ArrayList(tList4.size);
                    for (int i16 = 0; i16 < tList4.size; i16++) {
                        arrayList2.add(tTupleProtocol.readString());
                    }
                    struct.tls_dns.put(readString2, arrayList2);
                }
                struct.setTls_dnsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczSystemInfos struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.res_dns.size());
            Iterator<String> it = struct.res_dns.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeI32(struct.data_dns.size());
            Iterator<String> it2 = struct.data_dns.iterator();
            while (it2.hasNext()) {
                tTupleProtocol.writeString(it2.next());
            }
            tTupleProtocol.writeI32(struct.other_dns.size());
            for (Map.Entry<String, List<String>> entry : struct.other_dns.entrySet()) {
                tTupleProtocol.writeString(entry.getKey());
                tTupleProtocol.writeI32(entry.getValue().size());
                Iterator<String> it3 = entry.getValue().iterator();
                while (it3.hasNext()) {
                    tTupleProtocol.writeString(it3.next());
                }
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetTls_dns()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetTls_dns()) {
                tTupleProtocol.writeI32(struct.tls_dns.size());
                for (Map.Entry<String, List<String>> entry2 : struct.tls_dns.entrySet()) {
                    tTupleProtocol.writeString(entry2.getKey());
                    tTupleProtocol.writeI32(entry2.getValue().size());
                    Iterator<String> it4 = entry2.getValue().iterator();
                    while (it4.hasNext()) {
                        tTupleProtocol.writeString(it4.next());
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczSystemInfosTupleSchemeFactory implements SchemeFactory {
        private BczSystemInfosTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczSystemInfosTupleScheme getScheme() {
            return new BczSystemInfosTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        RES_DNS(1, "res_dns"),
        DATA_DNS(2, "data_dns"),
        OTHER_DNS(3, "other_dns"),
        TLS_DNS(4, "tls_dns");

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
                return RES_DNS;
            }
            if (fieldId == 2) {
                return DATA_DNS;
            }
            if (fieldId == 3) {
                return OTHER_DNS;
            }
            if (fieldId != 4) {
                return null;
            }
            return TLS_DNS;
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
        hashMap.put(StandardScheme.class, new BczSystemInfosStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczSystemInfosTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.RES_DNS, (_Fields) new FieldMetaData("res_dns", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.DATA_DNS, (_Fields) new FieldMetaData("data_dns", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.OTHER_DNS, (_Fields) new FieldMetaData("other_dns", (byte) 1, new MapMetaData((byte) 13, new FieldValueMetaData((byte) 11), new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11)))));
        enumMap.put((EnumMap) _Fields.TLS_DNS, (_Fields) new FieldMetaData("tls_dns", (byte) 2, new MapMetaData((byte) 13, new FieldValueMetaData((byte) 11), new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11)))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczSystemInfos.class, unmodifiableMap);
    }

    public BczSystemInfos() {
        this.optionals = new _Fields[]{_Fields.TLS_DNS};
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

    public void addToData_dns(String elem) {
        if (this.data_dns == null) {
            this.data_dns = new ArrayList();
        }
        this.data_dns.add(elem);
    }

    public void addToRes_dns(String elem) {
        if (this.res_dns == null) {
            this.res_dns = new ArrayList();
        }
        this.res_dns.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.res_dns = null;
        this.data_dns = null;
        this.other_dns = null;
        this.tls_dns = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczSystemInfos)) {
            return equals((BczSystemInfos) that);
        }
        return false;
    }

    public List<String> getData_dns() {
        return this.data_dns;
    }

    public Iterator<String> getData_dnsIterator() {
        List<String> list = this.data_dns;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getData_dnsSize() {
        List<String> list = this.data_dns;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Map<String, List<String>> getOther_dns() {
        return this.other_dns;
    }

    public int getOther_dnsSize() {
        Map<String, List<String>> map = this.other_dns;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public List<String> getRes_dns() {
        return this.res_dns;
    }

    public Iterator<String> getRes_dnsIterator() {
        List<String> list = this.res_dns;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getRes_dnsSize() {
        List<String> list = this.res_dns;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Map<String, List<String>> getTls_dns() {
        return this.tls_dns;
    }

    public int getTls_dnsSize() {
        Map<String, List<String>> map = this.tls_dns;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetData_dns() {
        return this.data_dns != null;
    }

    public boolean isSetOther_dns() {
        return this.other_dns != null;
    }

    public boolean isSetRes_dns() {
        return this.res_dns != null;
    }

    public boolean isSetTls_dns() {
        return this.tls_dns != null;
    }

    public void putToOther_dns(String key, List<String> val) {
        if (this.other_dns == null) {
            this.other_dns = new HashMap();
        }
        this.other_dns.put(key, val);
    }

    public void putToTls_dns(String key, List<String> val) {
        if (this.tls_dns == null) {
            this.tls_dns = new HashMap();
        }
        this.tls_dns.put(key, val);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczSystemInfos setData_dns(List<String> data_dns) {
        this.data_dns = data_dns;
        return this;
    }

    public void setData_dnsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.data_dns = null;
    }

    public BczSystemInfos setOther_dns(Map<String, List<String>> other_dns) {
        this.other_dns = other_dns;
        return this;
    }

    public void setOther_dnsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.other_dns = null;
    }

    public BczSystemInfos setRes_dns(List<String> res_dns) {
        this.res_dns = res_dns;
        return this;
    }

    public void setRes_dnsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.res_dns = null;
    }

    public BczSystemInfos setTls_dns(Map<String, List<String>> tls_dns) {
        this.tls_dns = tls_dns;
        return this;
    }

    public void setTls_dnsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tls_dns = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczSystemInfos(");
        sb2.append("res_dns:");
        List<String> list = this.res_dns;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("data_dns:");
        List<String> list2 = this.data_dns;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j2.O);
        sb2.append("other_dns:");
        Map<String, List<String>> map = this.other_dns;
        if (map == null) {
            sb2.append("null");
        } else {
            sb2.append(map);
        }
        if (isSetTls_dns()) {
            sb2.append(j2.O);
            sb2.append("tls_dns:");
            Map<String, List<String>> map2 = this.tls_dns;
            if (map2 == null) {
                sb2.append("null");
            } else {
                sb2.append(map2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetData_dns() {
        this.data_dns = null;
    }

    public void unsetOther_dns() {
        this.other_dns = null;
    }

    public void unsetRes_dns() {
        this.res_dns = null;
    }

    public void unsetTls_dns() {
        this.tls_dns = null;
    }

    public void validate() throws TException {
        if (this.res_dns == null) {
            throw new TProtocolException("Required field 'res_dns' was not present! Struct: " + toString());
        }
        if (this.data_dns == null) {
            throw new TProtocolException("Required field 'data_dns' was not present! Struct: " + toString());
        }
        if (this.other_dns != null) {
            return;
        }
        throw new TProtocolException("Required field 'other_dns' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczSystemInfos other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetRes_dns()).compareTo(Boolean.valueOf(other.isSetRes_dns()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetRes_dns() && (compareTo4 = TBaseHelper.compareTo((List) this.res_dns, (List) other.res_dns)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetData_dns()).compareTo(Boolean.valueOf(other.isSetData_dns()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetData_dns() && (compareTo3 = TBaseHelper.compareTo((List) this.data_dns, (List) other.data_dns)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetOther_dns()).compareTo(Boolean.valueOf(other.isSetOther_dns()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetOther_dns() && (compareTo2 = TBaseHelper.compareTo((Map) this.other_dns, (Map) other.other_dns)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetTls_dns()).compareTo(Boolean.valueOf(other.isSetTls_dns()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetTls_dns() || (compareTo = TBaseHelper.compareTo((Map) this.tls_dns, (Map) other.tls_dns)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy, reason: merged with bridge method [inline-methods] */
    public TBase<BczSystemInfos, _Fields> deepCopy2() {
        return new BczSystemInfos(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getRes_dns();
        }
        if (i11 == 2) {
            return getData_dns();
        }
        if (i11 == 3) {
            return getOther_dns();
        }
        if (i11 == 4) {
            return getTls_dns();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRes_dns();
        }
        if (i11 == 2) {
            return isSetData_dns();
        }
        if (i11 == 3) {
            return isSetOther_dns();
        }
        if (i11 == 4) {
            return isSetTls_dns();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRes_dns();
                return;
            } else {
                setRes_dns((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetData_dns();
                return;
            } else {
                setData_dns((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetOther_dns();
                return;
            } else {
                setOther_dns((Map) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetTls_dns();
        } else {
            setTls_dns((Map) value);
        }
    }

    public BczSystemInfos(List<String> res_dns, List<String> data_dns, Map<String, List<String>> other_dns) {
        this();
        this.res_dns = res_dns;
        this.data_dns = data_dns;
        this.other_dns = other_dns;
    }

    public boolean equals(BczSystemInfos that) {
        if (that == null) {
            return false;
        }
        boolean isSetRes_dns = isSetRes_dns();
        boolean isSetRes_dns2 = that.isSetRes_dns();
        if ((isSetRes_dns || isSetRes_dns2) && !(isSetRes_dns && isSetRes_dns2 && this.res_dns.equals(that.res_dns))) {
            return false;
        }
        boolean isSetData_dns = isSetData_dns();
        boolean isSetData_dns2 = that.isSetData_dns();
        if ((isSetData_dns || isSetData_dns2) && !(isSetData_dns && isSetData_dns2 && this.data_dns.equals(that.data_dns))) {
            return false;
        }
        boolean isSetOther_dns = isSetOther_dns();
        boolean isSetOther_dns2 = that.isSetOther_dns();
        if ((isSetOther_dns || isSetOther_dns2) && !(isSetOther_dns && isSetOther_dns2 && this.other_dns.equals(that.other_dns))) {
            return false;
        }
        boolean isSetTls_dns = isSetTls_dns();
        boolean isSetTls_dns2 = that.isSetTls_dns();
        if (isSetTls_dns || isSetTls_dns2) {
            return isSetTls_dns && isSetTls_dns2 && this.tls_dns.equals(that.tls_dns);
        }
        return true;
    }

    public BczSystemInfos(BczSystemInfos other) {
        this.optionals = new _Fields[]{_Fields.TLS_DNS};
        if (other.isSetRes_dns()) {
            this.res_dns = new ArrayList(other.res_dns);
        }
        if (other.isSetData_dns()) {
            this.data_dns = new ArrayList(other.data_dns);
        }
        if (other.isSetOther_dns()) {
            HashMap hashMap = new HashMap(other.other_dns.size());
            for (Map.Entry<String, List<String>> entry : other.other_dns.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            this.other_dns = hashMap;
        }
        if (other.isSetTls_dns()) {
            HashMap hashMap2 = new HashMap(other.tls_dns.size());
            for (Map.Entry<String, List<String>> entry2 : other.tls_dns.entrySet()) {
                hashMap2.put(entry2.getKey(), new ArrayList(entry2.getValue()));
            }
            this.tls_dns = hashMap2;
        }
    }
}
