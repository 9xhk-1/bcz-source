package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19216a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends y0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final a f19217b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f19218c = 0;

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends y0 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f19219c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<String> f19220b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k List<String> days) {
            super(null);
            kotlin.jvm.internal.g0.p(days, "days");
            this.f19220b = days;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = bVar.f19220b;
            }
            return bVar.b(list);
        }

        @m80.k
        public final List<String> a() {
            return this.f19220b;
        }

        @m80.k
        public final b b(@m80.k List<String> days) {
            kotlin.jvm.internal.g0.p(days, "days");
            return new b(days);
        }

        @m80.k
        public final List<String> d() {
            return this.f19220b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f19220b, ((b) obj).f19220b);
        }

        public int hashCode() {
            return this.f19220b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Enable(days=" + this.f19220b + pn.j.f81007d;
        }
    }

    public /* synthetic */ y0(kotlin.jvm.internal.v vVar) {
        this();
    }

    public y0() {
    }
}
