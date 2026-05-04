package xy;

import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes8.dex */
public final class l0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MessageDigest f98584a;

    public /* synthetic */ l0(MessageDigest messageDigest) {
        this.f98584a = messageDigest;
    }

    public static final /* synthetic */ l0 c(MessageDigest messageDigest) {
        return new l0(messageDigest);
    }

    @m80.l
    public static Object d(MessageDigest messageDigest, @m80.k j00.c<? super byte[]> cVar) {
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.g0.o(digest, "digest(...)");
        return digest;
    }

    @m80.k
    public static MessageDigest e(@m80.k MessageDigest delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        return delegate;
    }

    public static boolean f(MessageDigest messageDigest, Object obj) {
        return (obj instanceof l0) && kotlin.jvm.internal.g0.g(messageDigest, ((l0) obj).m());
    }

    public static final boolean g(MessageDigest messageDigest, MessageDigest messageDigest2) {
        return kotlin.jvm.internal.g0.g(messageDigest, messageDigest2);
    }

    public static int i(MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    public static void j(MessageDigest messageDigest, @m80.k byte[] bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        messageDigest.update(bytes);
    }

    public static void k(MessageDigest messageDigest) {
        messageDigest.reset();
    }

    public static String l(MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    @Override // xy.k0
    @m80.l
    public Object a(@m80.k j00.c<? super byte[]> cVar) {
        return d(this.f98584a, cVar);
    }

    @Override // xy.k0
    public void b(@m80.k byte[] bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        j(this.f98584a, bytes);
    }

    public boolean equals(Object obj) {
        return f(this.f98584a, obj);
    }

    @m80.k
    public final MessageDigest h() {
        return this.f98584a;
    }

    public int hashCode() {
        return i(this.f98584a);
    }

    public final /* synthetic */ MessageDigest m() {
        return this.f98584a;
    }

    @Override // xy.k0
    public void reset() {
        k(this.f98584a);
    }

    public String toString() {
        return l(this.f98584a);
    }
}
