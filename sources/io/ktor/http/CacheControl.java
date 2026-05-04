package io.ktor.http;

import a00.r0;
import fx.d;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class CacheControl {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Visibility f61014a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Visibility {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Visibility[] $VALUES;

        @k
        private final String headerValue;
        public static final Visibility Public = new Visibility("Public", 0, d.f52403j);
        public static final Visibility Private = new Visibility("Private", 1, "private");

        private static final /* synthetic */ Visibility[] $values() {
            return new Visibility[]{Public, Private};
        }

        static {
            Visibility[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Visibility(String str, int i11, String str2) {
            this.headerValue = str2;
        }

        @k
        public static m00.a<Visibility> getEntries() {
            return $ENTRIES;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
        }

        @k
        public final String getHeaderValue$ktor_http() {
            return this.headerValue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends CacheControl {

        /* renamed from: b, reason: collision with root package name */
        public final int f61015b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f61016c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f61017d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f61018e;

        public /* synthetic */ a(int i11, Integer num, boolean z11, boolean z12, Visibility visibility, int i12, v vVar) {
            this(i11, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : visibility);
        }

        public final int b() {
            return this.f61015b;
        }

        public final boolean c() {
            return this.f61017d;
        }

        @l
        public final Integer d() {
            return this.f61016c;
        }

        public final boolean e() {
            return this.f61018e;
        }

        public boolean equals(@l Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f61015b == this.f61015b && g0.g(aVar.f61016c, this.f61016c) && aVar.f61017d == this.f61017d && aVar.f61018e == this.f61018e && aVar.a() == a();
        }

        public int hashCode() {
            int i11 = this.f61015b * 31;
            Integer num = this.f61016c;
            int intValue = (((((i11 + (num != null ? num.intValue() : 0)) * 31) + Boolean.hashCode(this.f61017d)) * 31) + Boolean.hashCode(this.f61018e)) * 31;
            Visibility a11 = a();
            return intValue + (a11 != null ? a11.hashCode() : 0);
        }

        @k
        public String toString() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("max-age=" + this.f61015b);
            if (this.f61016c != null) {
                arrayList.add("s-maxage=" + this.f61016c);
            }
            if (this.f61017d) {
                arrayList.add(d.f52402i);
            }
            if (this.f61018e) {
                arrayList.add(d.f52405l);
            }
            if (a() != null) {
                arrayList.add(a().getHeaderValue$ktor_http());
            }
            return r0.r3(arrayList, j2.O, null, null, 0, null, null, 62, null);
        }

        public a(int i11, @l Integer num, boolean z11, boolean z12, @l Visibility visibility) {
            super(visibility);
            this.f61015b = i11;
            this.f61016c = num;
            this.f61017d = z11;
            this.f61018e = z12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends CacheControl {
        public b(@l Visibility visibility) {
            super(visibility);
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof b) && a() == ((b) obj).a();
        }

        public int hashCode() {
            Visibility a11 = a();
            if (a11 != null) {
                return a11.hashCode();
            }
            return 0;
        }

        @k
        public String toString() {
            if (a() == null) {
                return d.f52399f;
            }
            return "no-cache, " + a().getHeaderValue$ktor_http();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends CacheControl {
        public c(@l Visibility visibility) {
            super(visibility);
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof c) && ((c) obj).a() == a();
        }

        public int hashCode() {
            Visibility a11 = a();
            if (a11 != null) {
                return a11.hashCode();
            }
            return 0;
        }

        @k
        public String toString() {
            if (a() == null) {
                return d.f52400g;
            }
            return "no-store, " + a().getHeaderValue$ktor_http();
        }
    }

    public CacheControl(@l Visibility visibility) {
        this.f61014a = visibility;
    }

    @l
    public final Visibility a() {
        return this.f61014a;
    }
}
