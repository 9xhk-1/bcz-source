package org.apache.http.protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface HttpContext {

    /* renamed from: a, reason: collision with root package name */
    public static final String f77741a = "http.";

    void b(String str, Object obj);

    Object getAttribute(String str);

    Object removeAttribute(String str);
}
