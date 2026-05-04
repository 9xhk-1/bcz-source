package com.baicizhan.client.business.managers.winningstreak;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16510a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f16511b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f16512c = 0;

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f16513b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f16514c = 0;

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f16515b = new c();

        /* renamed from: c, reason: collision with root package name */
        public static final int f16516c = 0;

        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: com.baicizhan.client.business.managers.winningstreak.d$d, reason: collision with other inner class name */
    public static final class C0269d extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final int f16517c = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f16518b;

        public C0269d(int i11) {
            super(null);
            this.f16518b = i11;
        }

        public static /* synthetic */ C0269d c(C0269d c0269d, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = c0269d.f16518b;
            }
            return c0269d.b(i11);
        }

        public final int a() {
            return this.f16518b;
        }

        @k
        public final C0269d b(int i11) {
            return new C0269d(i11);
        }

        public final int d() {
            return this.f16518b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0269d) && this.f16518b == ((C0269d) obj).f16518b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f16518b);
        }

        @k
        public String toString() {
            return "WinningToday(days=" + this.f16518b + j.f81007d;
        }
    }

    public /* synthetic */ d(v vVar) {
        this();
    }

    public d() {
    }
}
