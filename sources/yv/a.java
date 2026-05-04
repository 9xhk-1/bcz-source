package yv;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import r00.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAssetResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetResource.kt\ndev/icerock/moko/resources/AssetResource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f100327a;

    public a(@m80.k String path) {
        g0.p(path, "path");
        this.f100327a = path;
    }

    public static Object c(a aVar) {
        return o0.t(new PropertyReference0Impl(aVar, a.class, "path", "getPath()Ljava/lang/String;", 0));
    }

    @m80.k
    public final InputStream a(@m80.k Context context) {
        g0.p(context, "context");
        InputStream open = context.getAssets().open(this.f100327a);
        g0.o(open, "open(...)");
        return open;
    }

    @m80.k
    public final String b() {
        return this.f100327a;
    }

    @m80.k
    public final String d() {
        return this.f100327a;
    }

    @m80.k
    public final String e(@m80.k Context context) {
        g0.p(context, "context");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a(context)));
        try {
            String m11 = u.m(bufferedReader);
            r00.b.a(bufferedReader, null);
            return m11;
        } finally {
        }
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && g0.g(this.f100327a, ((a) obj).f100327a);
    }

    public int hashCode() {
        return this.f100327a.hashCode();
    }
}
