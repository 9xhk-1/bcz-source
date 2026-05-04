package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.app.api.service.GameType;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class u6 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f24234b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f24235a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends u6 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f24236e = 0;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f24237c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f24238d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k String title, boolean z11) {
            super(title, null);
            kotlin.jvm.internal.g0.p(title, "title");
            this.f24237c = title;
            this.f24238d = z11;
        }

        public static /* synthetic */ a e(a aVar, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f24237c;
            }
            if ((i11 & 2) != 0) {
                z11 = aVar.f24238d;
            }
            return aVar.d(str, z11);
        }

        @Override // com.baicizhan.main.home.player.u6
        @m80.k
        public String a() {
            return this.f24237c;
        }

        @m80.k
        public final String b() {
            return this.f24237c;
        }

        public final boolean c() {
            return this.f24238d;
        }

        @m80.k
        public final a d(@m80.k String title, boolean z11) {
            kotlin.jvm.internal.g0.p(title, "title");
            return new a(title, z11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f24237c, aVar.f24237c) && this.f24238d == aVar.f24238d;
        }

        public final boolean f() {
            return this.f24238d;
        }

        public int hashCode() {
            return (this.f24237c.hashCode() * 31) + Boolean.hashCode(this.f24238d);
        }

        @m80.k
        public String toString() {
            return "Learnt(title=" + this.f24237c + ", today=" + this.f24238d + pn.j.f81007d;
        }

        public /* synthetic */ a(String str, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? "新学已完成" : str, z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends u6 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final b f24239c = new b();

        /* renamed from: d, reason: collision with root package name */
        public static final int f24240d = 0;

        public b() {
            super("探索新词书", null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends u6 {

        /* renamed from: f, reason: collision with root package name */
        public static final int f24241f = 0;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f24242c;

        /* renamed from: d, reason: collision with root package name */
        public final int f24243d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final Pair<GameType, Boolean> f24244e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k String title, @DrawableRes int i11, @m80.k Pair<? extends GameType, Boolean> state) {
            super(title, null);
            kotlin.jvm.internal.g0.p(title, "title");
            kotlin.jvm.internal.g0.p(state, "state");
            this.f24242c = title;
            this.f24243d = i11;
            this.f24244e = state;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c f(c cVar, String str, int i11, Pair pair, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = cVar.f24242c;
            }
            if ((i12 & 2) != 0) {
                i11 = cVar.f24243d;
            }
            if ((i12 & 4) != 0) {
                pair = cVar.f24244e;
            }
            return cVar.e(str, i11, pair);
        }

        @Override // com.baicizhan.main.home.player.u6
        @m80.k
        public String a() {
            return this.f24242c;
        }

        @m80.k
        public final String b() {
            return this.f24242c;
        }

        public final int c() {
            return this.f24243d;
        }

        @m80.k
        public final Pair<GameType, Boolean> d() {
            return this.f24244e;
        }

        @m80.k
        public final c e(@m80.k String title, @DrawableRes int i11, @m80.k Pair<? extends GameType, Boolean> state) {
            kotlin.jvm.internal.g0.p(title, "title");
            kotlin.jvm.internal.g0.p(state, "state");
            return new c(title, i11, state);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f24242c, cVar.f24242c) && this.f24243d == cVar.f24243d && kotlin.jvm.internal.g0.g(this.f24244e, cVar.f24244e);
        }

        public final int g() {
            return this.f24243d;
        }

        @m80.k
        public final Pair<GameType, Boolean> h() {
            return this.f24244e;
        }

        public int hashCode() {
            return (((this.f24242c.hashCode() * 31) + Integer.hashCode(this.f24243d)) * 31) + this.f24244e.hashCode();
        }

        @m80.k
        public String toString() {
            return "Normal(title=" + this.f24242c + ", icon=" + this.f24243d + ", state=" + this.f24244e + pn.j.f81007d;
        }

        public /* synthetic */ c(String str, int i11, Pair pair, int i12, kotlin.jvm.internal.v vVar) {
            this(str, (i12 & 2) != 0 ? 0 : i11, pair);
        }
    }

    public /* synthetic */ u6(String str, kotlin.jvm.internal.v vVar) {
        this(str);
    }

    @m80.k
    public String a() {
        return this.f24235a;
    }

    public u6(String str) {
        this.f24235a = str;
    }
}
