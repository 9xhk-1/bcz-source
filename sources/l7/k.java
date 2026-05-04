package l7;

import c40.l3;
import c40.r0;
import c40.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {c.class})
@u0({"SMAP\nThriftDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftDomain.kt\ncom/baicizhan/app/biz/thrift/ThriftDomainImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,82:1\n1869#2,2:83\n1563#2:85\n1634#2,3:86\n1869#2,2:95\n37#3,2:89\n126#4:91\n153#4,3:92\n*S KotlinDebug\n*F\n+ 1 ThriftDomain.kt\ncom/baicizhan/app/biz/thrift/ThriftDomainImpl\n*L\n32#1:83,2\n47#1:85\n47#1:86,3\n57#1:95,2\n47#1:89,2\n53#1:91\n53#1:92,3\n*E\n"})
/* loaded from: classes3.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, b> f70601a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<String, b> f70602b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r0 f70603c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.thrift.ThriftDomainImpl$2", f = "ThriftDomain.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<j8.i, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f70604a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f70605b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = k.this.new a(cVar);
            aVar.f70605b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j8.i iVar, j00.c<? super g2> cVar) {
            return ((a) create(iVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j8.i iVar = (j8.i) this.f70605b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f70604a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            k.this.a(iVar);
            return g2.f100423a;
        }
    }

    public k(@m80.k n7.g check) {
        kotlin.jvm.internal.g0.p(check, "check");
        this.f70601a = new LinkedHashMap();
        this.f70602b = new LinkedHashMap();
        this.f70603c = s0.a(c4.o.b().plus(l3.c(null, 1, null)));
        for (b bVar : o.a()) {
            this.f70601a.put(bVar.h(), bVar);
            this.f70602b.put(bVar.g(), bVar);
        }
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.v0(check.getState()), new a(null)), this.f70603c);
    }

    @Override // l7.c
    public void a(@m80.k j8.i info) {
        Map map;
        kotlin.jvm.internal.g0.p(info, "info");
        Map<String, List<String>> map2 = info.f63810c;
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            Map<String, b> map3 = this.f70602b;
            map = l.f70608a;
            b bVar = map3.get(map.get(entry.getKey()));
            arrayList.add(bVar != null ? b.e(bVar, entry.getValue(), null, null, 6, null) : null);
        }
        for (b bVar2 : a00.r0.x2(arrayList)) {
            this.f70601a.put(bVar2.h(), bVar2);
            this.f70602b.put(bVar2.g(), bVar2);
            z6.b.j(z6.b.f101032b, l.f70609b, "update " + bVar2.g(), null, 4, null);
        }
    }

    @Override // l7.c
    @m80.k
    public String[] b(@m80.k h10.d<?> clazz) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        b bVar = this.f70601a.get(clazz);
        if (bVar != null) {
            List<String> f11 = bVar.f();
            ArrayList arrayList = new ArrayList(a00.i0.d0(f11, 10));
            Iterator<T> it = f11.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()) + bVar.g());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr != null) {
                return strArr;
            }
        }
        throw new RuntimeException("thrift domain not found, " + clazz);
    }
}
