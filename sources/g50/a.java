package g50;

import androidx.exifinterface.media.ExifInterface;
import f50.f;
import f50.i;
import j50.b3;
import j50.c3;
import j50.d0;
import j50.d3;
import j50.e0;
import j50.f0;
import j50.f1;
import j50.h1;
import j50.k1;
import j50.k3;
import j50.l1;
import j50.n0;
import j50.n1;
import j50.n3;
import j50.o0;
import j50.o3;
import j50.q;
import j50.q3;
import j50.r;
import j50.r3;
import j50.t3;
import j50.u3;
import j50.v2;
import j50.w3;
import j50.x3;
import j50.y0;
import j50.y3;
import j50.z0;
import j50.z3;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.z;
import kotlin.time.Instant;
import kotlin.time.e;
import kotlin.uuid.Uuid;
import m80.k;
import w30.h;
import yz.c2;
import yz.d2;
import yz.g2;
import yz.o1;
import yz.p1;
import yz.s1;
import yz.t1;
import yz.w1;
import yz.x1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final i<Double> A(@k w wVar) {
        g0.p(wVar, "<this>");
        return e0.f63350a;
    }

    @k
    public static final i<Float> B(@k z zVar) {
        g0.p(zVar, "<this>");
        return o0.f63436a;
    }

    @k
    public static final i<Integer> C(@k kotlin.jvm.internal.e0 e0Var) {
        g0.p(e0Var, "<this>");
        return z0.f63517a;
    }

    @k
    public static final i<Long> D(@k j0 j0Var) {
        g0.p(j0Var, "<this>");
        return l1.f63406a;
    }

    @k
    public static final i<Short> E(@k s0 s0Var) {
        g0.p(s0Var, "<this>");
        return c3.f63342a;
    }

    @k
    public static final i<String> F(@k w0 w0Var) {
        g0.p(w0Var, "<this>");
        return d3.f63348a;
    }

    @k
    public static final i<e> G(@k e.a aVar) {
        g0.p(aVar, "<this>");
        return f0.f63353a;
    }

    @h
    @k
    public static final i<Instant> H(@k Instant.a aVar) {
        g0.p(aVar, "<this>");
        return j50.w0.f63495a;
    }

    @y30.a
    @k
    public static final i<Uuid> I(@k Uuid.a aVar) {
        g0.p(aVar, "<this>");
        return z3.f63520a;
    }

    @k
    public static final i<o1> J(@k o1.a aVar) {
        g0.p(aVar, "<this>");
        return o3.f63443a;
    }

    @k
    public static final i<s1> K(@k s1.a aVar) {
        g0.p(aVar, "<this>");
        return r3.f63459a;
    }

    @k
    public static final i<w1> L(@k w1.a aVar) {
        g0.p(aVar, "<this>");
        return u3.f63478a;
    }

    @k
    public static final i<c2> M(@k c2.a aVar) {
        g0.p(aVar, "<this>");
        return x3.f63508a;
    }

    @k
    public static final i<g2> N(@k g2 g2Var) {
        g0.p(g2Var, "<this>");
        return y3.f63513b;
    }

    @f
    public static final /* synthetic */ <T, E extends T> i<E[]> a(i<E> elementSerializer) {
        g0.p(elementSerializer, "elementSerializer");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return b(kotlin.jvm.internal.o0.d(Object.class), elementSerializer);
    }

    @f
    @k
    public static final <T, E extends T> i<E[]> b(@k h10.d<T> kClass, @k i<E> elementSerializer) {
        g0.p(kClass, "kClass");
        g0.p(elementSerializer, "elementSerializer");
        return new v2(kClass, elementSerializer);
    }

    @k
    public static final i<boolean[]> c() {
        return j50.h.f63371c;
    }

    @k
    public static final i<byte[]> d() {
        return j50.k.f63394c;
    }

    @k
    public static final i<char[]> e() {
        return q.f63451c;
    }

    @k
    public static final i<double[]> f() {
        return d0.f63344c;
    }

    @k
    public static final i<float[]> g() {
        return n0.f63430c;
    }

    @k
    public static final i<int[]> h() {
        return y0.f63510c;
    }

    @k
    public static final <T> i<List<T>> i(@k i<T> elementSerializer) {
        g0.p(elementSerializer, "elementSerializer");
        return new j50.f(elementSerializer);
    }

    @k
    public static final i<long[]> j() {
        return k1.f63398c;
    }

    @k
    public static final <K, V> i<Map.Entry<K, V>> k(@k i<K> keySerializer, @k i<V> valueSerializer) {
        g0.p(keySerializer, "keySerializer");
        g0.p(valueSerializer, "valueSerializer");
        return new n1(keySerializer, valueSerializer);
    }

    @k
    public static final <K, V> i<Map<K, V>> l(@k i<K> keySerializer, @k i<V> valueSerializer) {
        g0.p(keySerializer, "keySerializer");
        g0.p(valueSerializer, "valueSerializer");
        return new f1(keySerializer, valueSerializer);
    }

    @f
    @k
    public static final i m() {
        return j50.w1.f63497a;
    }

    @k
    public static final <K, V> i<Pair<K, V>> n(@k i<K> keySerializer, @k i<V> valueSerializer) {
        g0.p(keySerializer, "keySerializer");
        g0.p(valueSerializer, "valueSerializer");
        return new j50.c2(keySerializer, valueSerializer);
    }

    @k
    public static final <T> i<Set<T>> o(@k i<T> elementSerializer) {
        g0.p(elementSerializer, "elementSerializer");
        return new h1(elementSerializer);
    }

    @k
    public static final i<short[]> p() {
        return b3.f63337c;
    }

    @k
    public static final <A, B, C> i<Triple<A, B, C>> q(@k i<A> aSerializer, @k i<B> bSerializer, @k i<C> cSerializer) {
        g0.p(aSerializer, "aSerializer");
        g0.p(bSerializer, "bSerializer");
        g0.p(cSerializer, "cSerializer");
        return new k3(aSerializer, bSerializer, cSerializer);
    }

    @f
    @kotlin.d
    @k
    public static final i<p1> r() {
        return n3.f63434c;
    }

    @f
    @kotlin.d
    @k
    public static final i<t1> s() {
        return q3.f63454c;
    }

    @f
    @kotlin.d
    @k
    public static final i<x1> t() {
        return t3.f63471c;
    }

    @f
    @kotlin.d
    @k
    public static final i<d2> u() {
        return w3.f63502c;
    }

    @k
    public static final <T> i<T> v(@k i<T> iVar) {
        g0.p(iVar, "<this>");
        return iVar.a().b() ? iVar : new j50.x1(iVar);
    }

    @k
    public static final i<Boolean> x(@k l lVar) {
        g0.p(lVar, "<this>");
        return j50.i.f63378a;
    }

    @k
    public static final i<Byte> y(@k o oVar) {
        g0.p(oVar, "<this>");
        return j50.l.f63404a;
    }

    @k
    public static final i<Character> z(@k kotlin.jvm.internal.q qVar) {
        g0.p(qVar, "<this>");
        return r.f63455a;
    }

    public static /* synthetic */ void w(i iVar) {
    }
}
