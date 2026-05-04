package vy;

import io.ktor.utils.io.b0;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nServerSentEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSentEvent.kt\nio/ktor/sse/ServerSentEventKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1863#2,2:58\n*S KotlinDebug\n*F\n+ 1 ServerSentEvent.kt\nio/ktor/sse/ServerSentEventKt\n*L\n40#1:58,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f94419a = ":";

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f94420b = " ";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f94421c = "\r\n";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Regex f94422d = new Regex("\r\n|\r|\n");

    public static final <T> void b(StringBuilder sb2, String str, T t11) {
        if (t11 != null) {
            Iterator<T> it = f94422d.split(t11.toString(), 0).iterator();
            while (it.hasNext()) {
                sb2.append(str + ": " + ((String) it.next()) + "\r\n");
            }
        }
    }

    @k
    public static final Regex e() {
        return f94422d;
    }

    @b0
    public static /* synthetic */ void c() {
    }

    @b0
    public static /* synthetic */ void d() {
    }

    @b0
    public static /* synthetic */ void f() {
    }

    @b0
    public static /* synthetic */ void g() {
    }
}
