package j50;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
/* loaded from: classes8.dex */
public abstract class a<Element, Collection, Builder> implements f50.i<Collection> {
    public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
        this();
    }

    public static /* synthetic */ void o(a aVar, i50.d dVar, int i11, Object obj, boolean z11, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        aVar.n(dVar, i11, obj, z11);
    }

    @Override // f50.b0
    public abstract void b(@m80.k i50.h hVar, Collection collection);

    @Override // f50.e
    public Collection e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return l(decoder, null);
    }

    public abstract Builder g();

    public abstract int h(Builder builder);

    public abstract void i(Builder builder, int i11);

    @m80.k
    public abstract Iterator<Element> j(Collection collection);

    public abstract int k(Collection collection);

    @f50.h
    public final Collection l(@m80.k i50.f decoder, @m80.l Collection collection) {
        Builder g11;
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        if (collection == null || (g11 = q(collection)) == null) {
            g11 = g();
        }
        Builder builder = g11;
        int h11 = h(builder);
        i50.d beginStructure = decoder.beginStructure(a());
        if (!beginStructure.decodeSequentially()) {
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(a());
                if (decodeElementIndex == -1) {
                    break;
                }
                o(this, beginStructure, h11 + decodeElementIndex, builder, false, 8, null);
            }
        } else {
            m(beginStructure, builder, h11, p(beginStructure, builder));
        }
        beginStructure.endStructure(a());
        return r(builder);
    }

    public abstract void m(@m80.k i50.d dVar, Builder builder, int i11, int i12);

    public abstract void n(@m80.k i50.d dVar, int i11, Builder builder, boolean z11);

    public final int p(i50.d dVar, Builder builder) {
        int decodeCollectionSize = dVar.decodeCollectionSize(a());
        i(builder, decodeCollectionSize);
        return decodeCollectionSize;
    }

    public abstract Builder q(Collection collection);

    public abstract Collection r(Builder builder);

    public a() {
    }
}
