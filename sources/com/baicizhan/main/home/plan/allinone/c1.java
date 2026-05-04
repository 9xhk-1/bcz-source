package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.user_study_api.StudyHome;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22141a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends c1 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22142c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final StudyHome f22143b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k StudyHome home) {
            super(null);
            kotlin.jvm.internal.g0.p(home, "home");
            this.f22143b = home;
        }

        public static /* synthetic */ a c(a aVar, StudyHome studyHome, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                studyHome = aVar.f22143b;
            }
            return aVar.b(studyHome);
        }

        @m80.k
        public final StudyHome a() {
            return this.f22143b;
        }

        @m80.k
        public final a b(@m80.k StudyHome home) {
            kotlin.jvm.internal.g0.p(home, "home");
            return new a(home);
        }

        @m80.k
        public final StudyHome d() {
            return this.f22143b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f22143b, ((a) obj).f22143b);
        }

        public int hashCode() {
            return this.f22143b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Data(home=" + this.f22143b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends c1 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22144c = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String msg) {
            super(null);
            kotlin.jvm.internal.g0.p(msg, "msg");
            this.f22145b = msg;
        }

        public static /* synthetic */ b c(b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f22145b;
            }
            return bVar.b(str);
        }

        @m80.k
        public final String a() {
            return this.f22145b;
        }

        @m80.k
        public final b b(@m80.k String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            return new b(msg);
        }

        @m80.k
        public final String d() {
            return this.f22145b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f22145b, ((b) obj).f22145b);
        }

        public int hashCode() {
            return this.f22145b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(msg=" + this.f22145b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends c1 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final c f22146b = new c();

        /* renamed from: c, reason: collision with root package name */
        public static final int f22147c = 0;

        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class d extends c1 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22148c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Object f22149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k Object msg) {
            super(null);
            kotlin.jvm.internal.g0.p(msg, "msg");
            this.f22149b = msg;
        }

        public static /* synthetic */ d c(d dVar, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = dVar.f22149b;
            }
            return dVar.b(obj);
        }

        public final Object a() {
            return this.f22149b;
        }

        @m80.k
        public final d b(@m80.k Object msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            return new d(msg);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.g0.g(this.f22149b, ((d) obj).f22149b);
        }

        public int hashCode() {
            return this.f22149b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Upgrade(msg=" + this.f22149b + pn.j.f81007d;
        }
    }

    public /* synthetic */ c1(kotlin.jvm.internal.v vVar) {
        this();
    }

    public c1() {
    }
}
