package com.baicizhan.main.activity.schedule_v2.mutimode;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19412a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends q0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final a f19413b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f19414c = 0;

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends q0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final b f19415b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f19416c = 0;

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends q0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final c f19417b = new c();

        /* renamed from: c, reason: collision with root package name */
        public static final int f19418c = 0;

        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class d extends q0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final d f19419b = new d();

        /* renamed from: c, reason: collision with root package name */
        public static final int f19420c = 0;

        public d() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class e extends q0 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f19421c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h> f19422b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h> list) {
            super(null);
            kotlin.jvm.internal.g0.p(list, "list");
            this.f19422b = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e c(e eVar, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = eVar.f19422b;
            }
            return eVar.b(list);
        }

        @m80.k
        public final List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h> a() {
            return this.f19422b;
        }

        @m80.k
        public final e b(@m80.k List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h> list) {
            kotlin.jvm.internal.g0.p(list, "list");
            return new e(list);
        }

        @m80.k
        public final List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h> d() {
            return this.f19422b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.g0.g(this.f19422b, ((e) obj).f19422b);
        }

        public int hashCode() {
            return this.f19422b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Success(list=" + this.f19422b + pn.j.f81007d;
        }
    }

    public /* synthetic */ q0(kotlin.jvm.internal.v vVar) {
        this();
    }

    public q0() {
    }
}
