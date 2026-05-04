package org.apache.thrift;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.TUnion;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TUnion<T extends TUnion<?, ?>, F extends TFieldIdEnum> implements TBase<T, F> {
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    protected F setField_;
    protected Object value_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TUnionStandardScheme extends StandardScheme<TUnion> {
        private TUnionStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol tProtocol, TUnion tUnion) throws TException {
            tUnion.setField_ = null;
            tUnion.value_ = null;
            tProtocol.readStructBegin();
            TField readFieldBegin = tProtocol.readFieldBegin();
            Object standardSchemeReadValue = tUnion.standardSchemeReadValue(tProtocol, readFieldBegin);
            tUnion.value_ = standardSchemeReadValue;
            if (standardSchemeReadValue != null) {
                tUnion.setField_ = (F) tUnion.enumForId(readFieldBegin.f77768id);
            }
            tProtocol.readFieldEnd();
            tProtocol.readFieldBegin();
            tProtocol.readStructEnd();
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol tProtocol, TUnion tUnion) throws TException {
            if (tUnion.getSetField() == null || tUnion.getFieldValue() == null) {
                throw new TProtocolException("Cannot write a TUnion with no set value!");
            }
            tProtocol.writeStructBegin(tUnion.getStructDesc());
            tProtocol.writeFieldBegin(tUnion.getFieldDesc(tUnion.setField_));
            tUnion.standardSchemeWriteValue(tProtocol);
            tProtocol.writeFieldEnd();
            tProtocol.writeFieldStop();
            tProtocol.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TUnionStandardSchemeFactory implements SchemeFactory {
        private TUnionStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TUnionStandardScheme getScheme() {
            return new TUnionStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TUnionTupleScheme extends TupleScheme<TUnion> {
        private TUnionTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol tProtocol, TUnion tUnion) throws TException {
            tUnion.setField_ = null;
            tUnion.value_ = null;
            short readI16 = tProtocol.readI16();
            Object tupleSchemeReadValue = tUnion.tupleSchemeReadValue(tProtocol, readI16);
            tUnion.value_ = tupleSchemeReadValue;
            if (tupleSchemeReadValue != null) {
                tUnion.setField_ = (F) tUnion.enumForId(readI16);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol tProtocol, TUnion tUnion) throws TException {
            if (tUnion.getSetField() == null || tUnion.getFieldValue() == null) {
                throw new TProtocolException("Cannot write a TUnion with no set value!");
            }
            tProtocol.writeI16(tUnion.setField_.getThriftFieldId());
            tUnion.tupleSchemeWriteValue(tProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TUnionTupleSchemeFactory implements SchemeFactory {
        private TUnionTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TUnionTupleScheme getScheme() {
            return new TUnionTupleScheme();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(StandardScheme.class, new TUnionStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TUnionTupleSchemeFactory());
    }

    public TUnion() {
        this.setField_ = null;
        this.value_ = null;
    }

    private static List deepCopyList(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(deepCopyObject(it.next()));
        }
        return arrayList;
    }

    private static Map deepCopyMap(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(deepCopyObject(entry.getKey()), deepCopyObject(entry.getValue()));
        }
        return hashMap;
    }

    private static Object deepCopyObject(Object obj) {
        return obj instanceof TBase ? ((TBase) obj).deepCopy2() : obj instanceof ByteBuffer ? TBaseHelper.copyBinary((ByteBuffer) obj) : obj instanceof List ? deepCopyList((List) obj) : obj instanceof Set ? deepCopySet((Set) obj) : obj instanceof Map ? deepCopyMap((Map) obj) : obj;
    }

    private static Set deepCopySet(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(deepCopyObject(it.next()));
        }
        return hashSet;
    }

    public abstract void checkType(F f11, Object obj) throws ClassCastException;

    @Override // org.apache.thrift.TBase
    public final void clear() {
        this.setField_ = null;
        this.value_ = null;
    }

    public abstract F enumForId(short s11);

    public abstract TField getFieldDesc(F f11);

    public Object getFieldValue() {
        return this.value_;
    }

    public F getSetField() {
        return this.setField_;
    }

    public abstract TStruct getStructDesc();

    public boolean isSet() {
        return this.setField_ != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol tProtocol) throws TException {
        schemes.get(tProtocol.getScheme()).getScheme().read(tProtocol, this);
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(F f11, Object obj) {
        checkType(f11, obj);
        this.setField_ = f11;
        this.value_ = obj;
    }

    public abstract Object standardSchemeReadValue(TProtocol tProtocol, TField tField) throws TException;

    public abstract void standardSchemeWriteValue(TProtocol tProtocol) throws TException;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" ");
        if (getSetField() != null) {
            Object fieldValue = getFieldValue();
            sb2.append(getFieldDesc(getSetField()).name);
            sb2.append(":");
            if (fieldValue instanceof ByteBuffer) {
                TBaseHelper.toString((ByteBuffer) fieldValue, sb2);
            } else {
                sb2.append(fieldValue.toString());
            }
        }
        sb2.append(">");
        return sb2.toString();
    }

    public abstract Object tupleSchemeReadValue(TProtocol tProtocol, short s11) throws TException;

    public abstract void tupleSchemeWriteValue(TProtocol tProtocol) throws TException;

    @Override // org.apache.thrift.TBase
    public void write(TProtocol tProtocol) throws TException {
        schemes.get(tProtocol.getScheme()).getScheme().write(tProtocol, this);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(F f11) {
        if (f11 == this.setField_) {
            return getFieldValue();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f11 + " because union's set field is " + this.setField_);
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(F f11) {
        return this.setField_ == f11;
    }

    public boolean isSet(int i11) {
        return isSet((TUnion<T, F>) enumForId((short) i11));
    }

    public TUnion(F f11, Object obj) {
        setFieldValue((TUnion<T, F>) f11, obj);
    }

    public void setFieldValue(int i11, Object obj) {
        setFieldValue((TUnion<T, F>) enumForId((short) i11), obj);
    }

    public Object getFieldValue(int i11) {
        return getFieldValue((TUnion<T, F>) enumForId((short) i11));
    }

    public TUnion(TUnion<T, F> tUnion) {
        if (tUnion.getClass().equals(getClass())) {
            this.setField_ = tUnion.setField_;
            this.value_ = deepCopyObject(tUnion.value_);
            return;
        }
        throw new ClassCastException();
    }
}
