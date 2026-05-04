package io.ktor.util;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class Platform {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class JsPlatform {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ JsPlatform[] $VALUES;
        public static final JsPlatform Browser = new JsPlatform("Browser", 0);
        public static final JsPlatform Node = new JsPlatform("Node", 1);

        private static final /* synthetic */ JsPlatform[] $values() {
            return new JsPlatform[]{Browser, Node};
        }

        static {
            JsPlatform[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private JsPlatform(String str, int i11) {
        }

        @k
        public static m00.a<JsPlatform> getEntries() {
            return $ENTRIES;
        }

        public static JsPlatform valueOf(String str) {
            return (JsPlatform) Enum.valueOf(JsPlatform.class, str);
        }

        public static JsPlatform[] values() {
            return (JsPlatform[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Platform {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JsPlatform f61981a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k JsPlatform jsPlatform) {
            super(null);
            g0.p(jsPlatform, "jsPlatform");
            this.f61981a = jsPlatform;
        }

        public static /* synthetic */ a c(a aVar, JsPlatform jsPlatform, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jsPlatform = aVar.f61981a;
            }
            return aVar.b(jsPlatform);
        }

        @k
        public final JsPlatform a() {
            return this.f61981a;
        }

        @k
        public final a b(@k JsPlatform jsPlatform) {
            g0.p(jsPlatform, "jsPlatform");
            return new a(jsPlatform);
        }

        @k
        public final JsPlatform d() {
            return this.f61981a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f61981a == ((a) obj).f61981a;
        }

        public int hashCode() {
            return this.f61981a.hashCode();
        }

        @k
        public String toString() {
            return "Js(jsPlatform=" + this.f61981a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Platform {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f61982a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1051825272;
        }

        @k
        public String toString() {
            return "Jvm";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Platform {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f61983a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1059277600;
        }

        @k
        public String toString() {
            return "Native";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Platform {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JsPlatform f61984a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@k JsPlatform jsPlatform) {
            super(null);
            g0.p(jsPlatform, "jsPlatform");
            this.f61984a = jsPlatform;
        }

        public static /* synthetic */ d c(d dVar, JsPlatform jsPlatform, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jsPlatform = dVar.f61984a;
            }
            return dVar.b(jsPlatform);
        }

        @k
        public final JsPlatform a() {
            return this.f61984a;
        }

        @k
        public final d b(@k JsPlatform jsPlatform) {
            g0.p(jsPlatform, "jsPlatform");
            return new d(jsPlatform);
        }

        @k
        public final JsPlatform d() {
            return this.f61984a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f61984a == ((d) obj).f61984a;
        }

        public int hashCode() {
            return this.f61984a.hashCode();
        }

        @k
        public String toString() {
            return "WasmJs(jsPlatform=" + this.f61984a + ')';
        }
    }

    public /* synthetic */ Platform(v vVar) {
        this();
    }

    public Platform() {
    }
}
