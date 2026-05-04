package io.ktor.util.pipeline;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final h f62060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k h relativeTo) {
            super(null);
            g0.p(relativeTo, "relativeTo");
            this.f62060a = relativeTo;
        }

        @m80.k
        public final h a() {
            return this.f62060a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final h f62061a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k h relativeTo) {
            super(null);
            g0.p(relativeTo, "relativeTo");
            this.f62061a = relativeTo;
        }

        @m80.k
        public final h a() {
            return this.f62061a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f62062a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 967869129;
        }

        @m80.k
        public String toString() {
            return "Last";
        }
    }

    public /* synthetic */ i(v vVar) {
        this();
    }

    public i() {
    }
}
