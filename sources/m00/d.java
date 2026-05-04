package m00;

import a00.a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.enums.EnumEntriesSerializationProxy;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.8")
/* loaded from: classes8.dex */
public final class d<T extends Enum<T>> extends a00.d<T> implements a<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final T[] f71761a;

    public d(@k T[] entries) {
        g0.p(entries, "entries");
        this.f71761a = entries;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.f71761a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return d((Enum) obj);
        }
        return false;
    }

    public boolean d(@k T element) {
        g0.p(element, "element");
        return ((Enum) a0.hf(this.f71761a, element.ordinal())) == element;
    }

    @Override // a00.d, java.util.List
    @k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T get(int i11) {
        a00.d.Companion.b(i11, this.f71761a.length);
        return this.f71761a[i11];
    }

    public int g(@k T element) {
        g0.p(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) a0.hf(this.f71761a, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.f71761a.length;
    }

    public int h(@k T element) {
        g0.p(element, "element");
        return g(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return -1;
    }
}
