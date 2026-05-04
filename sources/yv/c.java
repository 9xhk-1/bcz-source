package yv;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RawRes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import r00.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileResource.kt\ndev/icerock/moko/resources/FileResource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f100329a;

    public c(@RawRes int i11) {
        this.f100329a = i11;
    }

    public final int a() {
        return this.f100329a;
    }

    @m80.k
    public final String b(@m80.k Context context) {
        g0.p(context, "context");
        Resources resources = context.getResources();
        g0.o(resources, "getResources(...)");
        InputStream openRawResource = resources.openRawResource(this.f100329a);
        g0.o(openRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        try {
            String m11 = u.m(bufferedReader);
            r00.b.a(bufferedReader, null);
            return m11;
        } finally {
        }
    }
}
