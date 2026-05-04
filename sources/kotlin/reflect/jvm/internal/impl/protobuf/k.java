package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k extends AbstractList<String> implements RandomAccess, l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f67584b = new k().getUnmodifiableView();

    /* renamed from: a, reason: collision with root package name */
    public final List<Object> f67585a;

    public k() {
        this.f67585a = new ArrayList();
    }

    public static d b(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.h((String) obj) : d.f((byte[]) obj);
    }

    public static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).w() : h.b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void E0(d dVar) {
        this.f67585a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i11, String str) {
        this.f67585a.add(i11, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f67585a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i11) {
        Object obj = this.f67585a.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String w11 = dVar.w();
            if (dVar.n()) {
                this.f67585a.set(i11, w11);
            }
            return w11;
        }
        byte[] bArr = (byte[]) obj;
        String b11 = h.b(bArr);
        if (h.a(bArr)) {
            this.f67585a.set(i11, b11);
        }
        return b11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String remove(int i11) {
        Object remove = this.f67585a.remove(i11);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public d getByteString(int i11) {
        Object obj = this.f67585a.get(i11);
        d b11 = b(obj);
        if (b11 != obj) {
            this.f67585a.set(i11, b11);
        }
        return b11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f67585a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public l getUnmodifiableView() {
        return new t(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String set(int i11, String str) {
        return d(this.f67585a.set(i11, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f67585a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends String> collection) {
        if (collection instanceof l) {
            collection = ((l) collection).getUnderlyingElements();
        }
        boolean addAll = this.f67585a.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public k(l lVar) {
        this.f67585a = new ArrayList(lVar.size());
        addAll(lVar);
    }
}
