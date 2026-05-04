package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface u4 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements u4 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f24216a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f24217b = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b implements u4 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f24218a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f24219b = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c implements u4 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f24220b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f24221a;

        public c(int i11) {
            this.f24221a = i11;
        }

        public static /* synthetic */ c c(c cVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cVar.f24221a;
            }
            return cVar.b(i11);
        }

        public final int a() {
            return this.f24221a;
        }

        @m80.k
        public final c b(int i11) {
            return new c(i11);
        }

        public final int d() {
            return this.f24221a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f24221a == ((c) obj).f24221a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f24221a);
        }

        @m80.k
        public String toString() {
            return "UnLocking(targetIndex=" + this.f24221a + pn.j.f81007d;
        }
    }
}
