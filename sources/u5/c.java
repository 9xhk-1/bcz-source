package u5;

import c40.i;
import c40.m0;
import c40.r0;
import java.util.List;
import k3.d1;
import k3.q1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;
import u5.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c implements a.InterfaceC1223a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f91819a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c7.e f91820b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.plugin.LookupNativePluginProxy$lookup$2", f = "PluginRepo.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super List<? extends q1>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f91821a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f91823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f91823c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new a(this.f91823c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<q1>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f91821a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (c.this.f91819a instanceof d1.a) {
                    return ((d1.a) c.this.f91819a).a(this.f91823c);
                }
                if (!(c.this.f91819a instanceof d1.b)) {
                    throw new IllegalArgumentException("Unsupported plugin type: " + o0.d(c.this.f91819a.getClass()));
                }
                d1.b bVar = (d1.b) c.this.f91819a;
                String str = this.f91823c;
                this.f91821a = 1;
                obj = bVar.d(str, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return (List) obj;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends q1>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<q1>>) cVar);
        }
    }

    public c(@k d1 plugin, @k c7.e deviceRepo) {
        g0.p(plugin, "plugin");
        g0.p(deviceRepo, "deviceRepo");
        this.f91819a = plugin;
        this.f91820b = deviceRepo;
    }

    @Override // u5.a.InterfaceC1223a
    @l
    public Object d(@k String str, @k j00.c<? super List<q1>> cVar) {
        m0 b11;
        b11 = e.b(this.f91820b);
        return i.h(b11, new a(str, null), cVar);
    }
}
