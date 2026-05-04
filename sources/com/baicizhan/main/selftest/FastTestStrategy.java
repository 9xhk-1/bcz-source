package com.baicizhan.main.selftest;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.main.selftest.FastTestStrategy;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import q9.x;
import th.s;
import yh.a;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FastTestStrategy {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f24871d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f24872e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final String f24873f = FastTestStrategy.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f24874a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f24875b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a.e f24876c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ResetType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ ResetType[] $VALUES;
        public static final ResetType TODAY = new ResetType("TODAY", 0);
        public static final ResetType ALL = new ResetType(r60.f.f83306f, 1);

        private static final /* synthetic */ ResetType[] $values() {
            return new ResetType[]{TODAY, ALL};
        }

        static {
            ResetType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private ResetType(String str, int i11) {
        }

        @m80.k
        public static m00.a<ResetType> getEntries() {
            return $ENTRIES;
        }

        public static ResetType valueOf(String str) {
            return (ResetType) Enum.valueOf(ResetType.class, str);
        }

        public static ResetType[] values() {
            return (ResetType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestStrategy", f = "FastTestStrategy.kt", i = {0, 1}, l = {95, 95}, m = "getTopicRecord", n = {"topicId", "topicId"}, s = {"I$0", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f24877a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24878b;

        /* renamed from: d, reason: collision with root package name */
        public int f24880d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f24878b = obj;
            this.f24880d |= Integer.MIN_VALUE;
            return FastTestStrategy.this.i(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements x00.l<TopicRecord, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<TopicRecord> f24881a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(j00.c<? super TopicRecord> cVar) {
            this.f24881a = cVar;
        }

        public final void a(TopicRecord topicRecord) {
            j00.c<TopicRecord> cVar = this.f24881a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(topicRecord));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(TopicRecord topicRecord) {
            a(topicRecord);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> implements wb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<TopicRecord> f24882a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(j00.c<? super TopicRecord> cVar) {
            this.f24882a = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Throwable th2) {
            qb.c.d(FastTestStrategy.f24873f, "from local: " + th2.getMessage(), new Object[0]);
            j00.c<TopicRecord> cVar = this.f24882a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(null));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements x00.l<TopicRecord, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<TopicRecord> f24883a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(j00.c<? super TopicRecord> cVar) {
            this.f24883a = cVar;
        }

        public final void a(TopicRecord topicRecord) {
            j00.c<TopicRecord> cVar = this.f24883a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(topicRecord));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(TopicRecord topicRecord) {
            a(topicRecord);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<T> implements wb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<TopicRecord> f24884a;

        /* JADX WARN: Multi-variable type inference failed */
        public g(j00.c<? super TopicRecord> cVar) {
            this.f24884a = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void call(Throwable th2) {
            qb.c.d(FastTestStrategy.f24873f, "from server: " + th2.getMessage(), new Object[0]);
            j00.c<TopicRecord> cVar = this.f24884a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(null));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j00.c<a.e> f24886b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(j00.c<? super a.e> cVar) {
            this.f24886b = cVar;
        }

        @Override // com.baicizhan.main.selftest.FastTestStrategy.b, yh.a.c
        public void a(a.e eVar) {
            FastTestStrategy.this.f24876c = eVar;
            j00.c<a.e> cVar = this.f24886b;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(eVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j00.c<a.e> f24888b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(j00.c<? super a.e> cVar) {
            this.f24888b = cVar;
        }

        @Override // com.baicizhan.main.selftest.FastTestStrategy.b, yh.a.c
        public void b(a.e eVar) {
            FastTestStrategy.this.f24876c = eVar;
            j00.c<a.e> cVar = this.f24888b;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(eVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j00.c<a.e> f24890b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(j00.c<? super a.e> cVar) {
            this.f24890b = cVar;
        }

        @Override // com.baicizhan.main.selftest.FastTestStrategy.b, yh.a.c
        public void b(a.e eVar) {
            FastTestStrategy.this.f24876c = eVar;
            j00.c<a.e> cVar = this.f24890b;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(eVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements wb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f24891a;

        public k(x00.l function) {
            g0.p(function, "function");
            this.f24891a = function;
        }

        @Override // wb0.b
        public final /* synthetic */ void call(Object obj) {
            this.f24891a.invoke(obj);
        }
    }

    public FastTestStrategy(@m80.k Context context) {
        g0.p(context, "context");
        this.f24874a = context;
        this.f24875b = e0.c(new x00.a() { // from class: uh.e
            @Override // x00.a
            public final Object invoke() {
                yh.a q11;
                q11 = FastTestStrategy.q(FastTestStrategy.this);
                return q11;
            }
        });
    }

    public static final yh.a q(FastTestStrategy fastTestStrategy) {
        return yh.a.k(fastTestStrategy.f24874a);
    }

    public final boolean f() {
        a.e eVar = this.f24876c;
        if (eVar == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g0.m(eVar);
        if (!eVar.f100145a) {
            return false;
        }
        a.e eVar2 = this.f24876c;
        g0.m(eVar2);
        return eVar2.f100146b;
    }

    @m80.k
    public final ResetType g() {
        return (f() && l()) ? ResetType.TODAY : ResetType.ALL;
    }

    public final yh.a h() {
        Object value = this.f24875b.getValue();
        g0.o(value, "getValue(...)");
        return (yh.a) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r6, @m80.k j00.c<? super com.baicizhan.client.business.dataset.models.TopicRecord> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.baicizhan.main.selftest.FastTestStrategy.c
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.main.selftest.FastTestStrategy$c r0 = (com.baicizhan.main.selftest.FastTestStrategy.c) r0
            int r1 = r0.f24880d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24880d = r1
            goto L18
        L13:
            com.baicizhan.main.selftest.FastTestStrategy$c r0 = new com.baicizhan.main.selftest.FastTestStrategy$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24878b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f24880d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f24877a
            kotlin.e.n(r7)
            goto L48
        L3a:
            kotlin.e.n(r7)
            r0.f24877a = r6
            r0.f24880d = r4
            java.lang.Object r7 = r5.j(r6, r0)
            if (r7 != r1) goto L48
            goto L56
        L48:
            com.baicizhan.client.business.dataset.models.TopicRecord r7 = (com.baicizhan.client.business.dataset.models.TopicRecord) r7
            if (r7 != 0) goto L58
            r0.f24877a = r6
            r0.f24880d = r3
            java.lang.Object r6 = r5.k(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        L58:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.FastTestStrategy.i(int, j00.c):java.lang.Object");
    }

    public final Object j(int i11, j00.c<? super TopicRecord> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        s.b(this.f24874a, x.r().l(), i11).u5(new k(new d(gVar)), new e(gVar));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    public final Object k(int i11, j00.c<? super TopicRecord> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        s.c(x.r().l(), i11).u5(new k(new f(gVar)), new g(gVar));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    public final boolean l() {
        return h().r();
    }

    @l
    public final Object m(@m80.k j00.c<? super a.e> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        h().y(new h(gVar));
        h().s();
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @l
    public final Object n(@m80.k j00.c<? super a.e> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        h().y(new i(gVar));
        h().u(null);
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @l
    public final Object o(@l List<Integer> list, @m80.k j00.c<? super a.e> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        h().y(new j(gVar));
        h().v(list);
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @l
    public final Object p(@l List<Integer> list, @m80.k j00.c<? super a.e> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        Result.a aVar = Result.Companion;
        gVar.resumeWith(Result.m6308constructorimpl(h().w(list)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    public final void r(@l a.e eVar) {
        this.f24876c = eVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b implements a.c {
        @Override // yh.a.c
        public void a(@l a.e eVar) {
        }

        @Override // yh.a.c
        public void b(@l a.e eVar) {
        }
    }
}
