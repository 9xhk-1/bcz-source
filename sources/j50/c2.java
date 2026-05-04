package j50;

import kotlin.Pair;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class c2<K, V> extends d1<K, V, Pair<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h50.f f63341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(@m80.k final f50.i<K> keySerializer, @m80.k final f50.i<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.g0.p(keySerializer, "keySerializer");
        kotlin.jvm.internal.g0.p(valueSerializer, "valueSerializer");
        this.f63341c = h50.l.e("kotlin.Pair", new h50.f[0], new x00.l() { // from class: j50.b2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 m11;
                m11 = c2.m(f50.i.this, valueSerializer, (h50.a) obj);
                return m11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 m(f50.i iVar, f50.i iVar2, h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        h50.a.b(buildClassSerialDescriptor, "first", iVar.a(), null, false, 12, null);
        h50.a.b(buildClassSerialDescriptor, n.r.f98264f, iVar2.a(), null, false, 12, null);
        return yz.g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63341c;
    }

    @Override // j50.d1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public K g(@m80.k Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.g0.p(pair, "<this>");
        return pair.getFirst();
    }

    @Override // j50.d1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public V i(@m80.k Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.g0.p(pair, "<this>");
        return pair.getSecond();
    }

    @Override // j50.d1
    @m80.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> k(K k11, V v11) {
        return yz.h1.a(k11, v11);
    }
}
