package com.baicizhan.platform.base.widget;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes6.dex */
public abstract class v4<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f28554b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final T f28555a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends v4<Integer> {

        /* renamed from: c, reason: collision with root package name */
        public static final int f28556c = 8;

        public a(@DrawableRes int i11) {
            super(Integer.valueOf(i11), null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends v4<String> {

        /* renamed from: e, reason: collision with root package name */
        public static final int f28557e = 8;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final Pair<Color, Color> f28558c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f28559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String value, @m80.l Pair<Color, Color> pair, boolean z11) {
            super(value, null);
            kotlin.jvm.internal.g0.p(value, "value");
            this.f28558c = pair;
            this.f28559d = z11;
        }

        public final boolean b() {
            return this.f28559d;
        }

        @m80.l
        public final Pair<Color, Color> c() {
            return this.f28558c;
        }

        public /* synthetic */ b(String str, Pair pair, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
            this(str, (i11 & 2) != 0 ? null : pair, (i11 & 4) != 0 ? true : z11);
        }
    }

    public /* synthetic */ v4(Object obj, kotlin.jvm.internal.v vVar) {
        this(obj);
    }

    public final T a() {
        return this.f28555a;
    }

    public v4(T t11) {
        this.f28555a = t11;
    }
}
