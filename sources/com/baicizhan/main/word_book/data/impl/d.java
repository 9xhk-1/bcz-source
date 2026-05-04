package com.baicizhan.main.word_book.data.impl;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class d implements ij.j {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f26564c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f26565d = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f26566e = "user_word_books_copper_limit";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Context f26567b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public d(@m80.k Context context) {
        g0.p(context, "context");
        this.f26567b = context;
    }

    @Override // ij.j
    public int a() {
        return i9.f.d(this.f26567b, i9.f.f60385m0);
    }

    @Override // ij.j
    public long b() {
        return i9.f.f(this.f26567b, i9.f.S);
    }

    @Override // ij.j
    public void c(long j11) {
        i9.f.m(this.f26567b, i9.f.S, j11);
    }

    @Override // ij.j
    public long d() {
        UserLimitInfoV2 G;
        x r11 = x.r();
        if (r11 == null || (G = r11.G()) == null) {
            return -1L;
        }
        return G.collect_words_updated_at;
    }

    @Override // ij.j
    public void e(long j11) {
        UserLimitInfoV2 G;
        x r11 = x.r();
        if (r11 == null || (G = r11.G()) == null) {
            return;
        }
        G.collect_words_updated_at = j11;
    }

    @Override // ij.j
    public void g(int i11) {
        i9.f.k(this.f26567b, i9.f.f60385m0, i11);
    }

    @Override // ij.j
    public void h(int i11) {
        i9.f.k(this.f26567b, f26566e, i11);
    }

    @Override // ij.j
    public /* bridge */ boolean i() {
        return super.i();
    }

    @Override // ij.j
    public int j() {
        return i9.f.d(this.f26567b, f26566e);
    }
}
